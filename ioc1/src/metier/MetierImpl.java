package metier;
import dao.DaoImpl;

public class MetierImpl {
	private DaoImpl dao;
	
	public MetierImpl() {
		dao=new DaoImpl();
	}
	public double calcul() {
		double nb=dao.getValue();
		return 2*nb;
	}
}
