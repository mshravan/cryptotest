package blocktest;

public class app {

	public static void main(String[] args) {
		 BlockChain chain= new BlockChain();
		 Miner miner= new Miner();
		 Block block0= new Block(0, Constants.GENESIS_PREV_HASH, "transcations0");
		 miner.mine(block0, chain);
		 
		 Block block1= new Block(1, chain.getBlockchanin().get(chain.size()-1).getHash(), "transcations1");
		 miner.mine(block1, chain);
		 Block block2= new Block(2, chain.getBlockchanin().get(chain.size()-1).getHash(), "transcations2");
		 miner.mine(block2, chain);
		 
		 System.out.print("\n"+ "blockchain :\n"+ chain);
		 System.out.print("\n"+ "miner reward :\n"+ miner.getReward());
		 
	}

}
