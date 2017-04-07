class Second 
{  
	var Name:String = ""  
 
	def Welcome() = 
		{ 
		println("Hello:"+ Name+" And Welcome to Scarlas world") 
		} 
 
 
 
}  
  
var T = new Second()  
T.Name = "Henry" 
T.Welcome()