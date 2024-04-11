public class kybst {

    private kybstNode root;
    public kybst(){
        this.root = null;
    }

    public void addNode(String data){
        kybstNode p = root;
        kybstNode prev = null;
        if (root == null){
            root = new kybstNode(data);
            return;
        }
        while(p != null){
            prev = p;
            if(data.compareTo(p.getData()) < 0){
                p = p.getRight();
            }else{
                p = p.getRight();
            }
        }
        if(data.compareTo(prev.getData()) < 0){
            prev.setLeft(new kybstNode(data));
        }else{
            prev.setRight(new kybstNode(data));
        }
    }

    public String search(String data){
        kybstNode p = root;
        while (p != null) {
            int v = data.compareTo(p.getData());
            if(v == 0){
                return p.getData();
            }else if(v < 0){
                p = p.getLeft();
            }else{
                p = p.getRight();
            }
        }
        return null;
    }

}