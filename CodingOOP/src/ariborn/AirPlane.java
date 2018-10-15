package ariborn;


// BASE CLASS / SUPER
public class AirPlane {
	public int fuel; // bak 
	byte seats; // mesta
	int distance; // probeg
	
	// default
	public AirPlane(){
		
	}
	
	public AirPlane(int fuel, int seats){
		if(fuel>0&&seats>0){
			this.distance = 0;
			this.fuel     = fuel;
			this.seats    = (byte)seats;
		}else{
			System.err.println( "WRONG!" );
		}
	}
	
	 public String toString(){
		 return "\nPLANE \nTANK " + this.fuel
		 + "\nSEATS " + this.seats
		 + "\nDISTANCE " + this.distance;
	 }

}
