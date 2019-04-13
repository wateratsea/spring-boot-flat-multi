package tools.ota.sample.secure.auth;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

public class LoginUserContext extends User {
	private static final long serialVersionUID = 2535134935610080074L;
	public LoginUserContext(String username, String password, Collection<? extends GrantedAuthority> authorities) {
		super(username, password, authorities);
	}

}
