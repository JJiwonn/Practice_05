package com.javaex.ex07;

public class Friend {

    private String name;
    private String hp;
    private String school;

    
    // getter/setter 작성
       public String getNAme() {
    	return name;
    }
    	public void setName(String name) {
    	// 외부에서 받아들인 정보를 내부에 넣어주기에 반환타입은 리턴은 필요없다. 대신 정지가 필요함.
    		this.name = name;
    }
    	public String getHp() {
        	return hp;
    	}
    	public void setHp(String hp) {
    		this.hp = hp;
    	}
    	 public String getSchool() {
    	    	return school;
    	    }
    	 public void setSchool(String school) {
     		this.school = school;
     	}
    	 
    	 
    public void showInfo(){
        System.out.println("이름:"+name+"  핸드폰:"+hp+"  학교:"+school);
    }

}
