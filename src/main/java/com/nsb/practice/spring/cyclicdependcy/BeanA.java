package com.nsb.practice.spring.cyclicdependcy;

public class BeanA {

//	@Autowired
	private BeanB beanB;

	public void getValue() {
		System.out.println("the beanB field od beanA: " + beanB);
	}

	public BeanA(BeanB beanB) {
		super();
		this.beanB = beanB;
	}

	public BeanA() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
	public String toString() {
		return "beanA";
	}
	
}
