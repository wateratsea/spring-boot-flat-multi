package tools.ota.sample.secure.auth;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
@Component
public class UserDetailsServiceImpl implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Set<String> authorities = new HashSet<>();
		authorities.add("ThisIsRole");
		List<GrantedAuthority> authorityList = AuthorityUtils.createAuthorityList(authorities.toArray(new String[0]));
		LoginUserContext context = new LoginUserContext(username, "1", authorityList);
		return context;
	}

}
