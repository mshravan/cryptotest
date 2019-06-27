package blocktest;

import java.util.Date;

/**
 * @author shravan.m
 *
 */
public class Block {
	
	private int id;
	private int nonce;
	private String hash;
	private String preivousHash;
	private long timestamp;
	private String transcations;
	
	public Block() {
		
	}
	
	public Block(int id, String preivousHash, String transcations) {
		super();
		this.id = id;
		this.preivousHash = preivousHash;
		this.transcations = transcations;
		this.timestamp=new Date().getTime();
		generateHash();
	}

	public void generateHash() {
		 String dataToHash =Integer.toString(id)+preivousHash+Long.toString(timestamp)+Integer.toString(nonce)+
				 transcations;
		 String hash = SHA256Helper.getSHA(dataToHash);
		 this.hash=hash;
		
	}

	public Block(int id, int nonce, String hash, String preivousHash, long timestamp, String transcations) {
		super();
		this.id = id;
		this.nonce = nonce;
		this.hash = hash;
		this.preivousHash = preivousHash;
		this.timestamp = timestamp;
		this.transcations = transcations;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNonce() {
		return nonce;
	}
	public void setNonce(int nonce) {
		this.nonce = nonce;
	}
	public String getHash() {
		return hash;
	}
	public void setHash(String hash) {
		this.hash = hash;
	}
	public String getPreivousHash() {
		return preivousHash;
	}
	public void setPreivousHash(String preivousHash) {
		this.preivousHash = preivousHash;
	}
	public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	public String getTranscations() {
		return transcations;
	}
	public void setTranscations(String transcations) {
		this.transcations = transcations;
	}
	
	public void increamentaNonce() {
		this.nonce++;
	}
	@Override
	public String toString() {
		return "Block [id=" + id + ", preivousHash=" + preivousHash + ", transcations=" + transcations + "]";
	}

}
