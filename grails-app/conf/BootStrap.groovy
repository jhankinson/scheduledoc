import org.scheduledoc.User
import grails.util.GrailsUtil
class BootStrap {

    def init = { servletContext ->
			switch(GrailsUtil.environment){
			  case "development":
			   def admin = new User(login:"admin",
									password:"admin",
									role:"admin")
			   admin.save()
			   if(admin.hasErrors()){
				 println admin.errors
			   }
			   def jdoe = new User(login:"test",
								   password:"test",
								   role:"user")
			   jdoe.save()
			   if(jdoe.hasErrors()){
				 println jdoe.errors
			   }
			}
    }
			
    def destroy = {
    }
}
