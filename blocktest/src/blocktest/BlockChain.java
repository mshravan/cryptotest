package blocktest;

import java.util.ArrayList;
import java.util.List;

public class BlockChain {
	
	

	List<Block> blockchanin ;
	
	
	public BlockChain( ) {		 
		this.blockchanin = new ArrayList<Block>();
	}
	
 
	public void addBlock(Block block) {
		this.blockchanin.add(block);
		
	}
	public List<Block> getBlockchanin() {
		return this.blockchanin;
	}

	public int size() {
		return this.blockchanin.size();
	}


	@Override
	public String toString() {
		
		String blockchain="";
		for(Block block:this.blockchanin)
		{
			blockchain += block.toString()+"\n";
		}
		return blockchain;
	}
	
	 

	
	 

}
