package it.polito.tdp.ufo.model;

public class Stato implements Comparable<Stato>{

	private String id;
	private String name;
	private String capitale;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCapitale() {
		return capitale;
	}
	public void setCapitale(String capitale) {
		this.capitale = capitale;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stato other = (Stato) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	public Stato(String id, String name, String capitale) {
		super();
		this.id = id;
		this.name = name;
		this.capitale = capitale;
	}
	@Override
	public String toString() {
		return name;
	}
	@Override
	public int compareTo(Stato o) {
		
		return name.compareTo(o.name);
	}
	
	
}
