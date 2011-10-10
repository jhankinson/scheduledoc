package scheduledoc

import javax.transaction.UserTransaction;

class LoginTagLib {
	def loginControl = {
		if(request.getSession(false) && session.user){
			if (!session.user.isAdmin()) {
		  out << "Signed in as user: <b><i>${session.user.login} </i></b>"
		  out << """[${link(action:"logout",
			controller:"user"){"Logout"}}]"""
			}
			else {
				out << "Signed in as administrator: <b><i>${session.user.login} </i></b>"
				out << """[${link(action:"logout",
				  controller:"user"){"Logout"}}]"""
			}
		} else {
		  out << """[${link(action:"login",
			controller:"user"){"Login"}}]"""
		} 
	}
}
