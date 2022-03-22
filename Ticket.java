package com;
import java.io.Serializable;
public class Ticket {	
	
		private String source;
		private String destination;
		private int price;
		private String date;
		
		public Ticket()
		{
			
		}

		public String getSource() {
			return source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public String getDestination() {
			return destination;
		}

		public void setDestination(String destination)
		{
		this.destination=destination;
		}
		public int getPrice()

		{
			return price;
		}
		public void setPrice(int price)
		{
			this.price=price;
		}
			
			public String getDate() {
		
			return date;
		}

		public void setDate(String date)
		{
		this.date=date;
		}
		public Ticket(String source,String destination,int price,String date)
		{
			super();
			this.source = source;
			this.destination=destination;
			this.price=price;
			this.date=date;
			
			
		}



	}
