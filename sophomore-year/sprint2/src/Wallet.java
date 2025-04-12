import java.util.ArrayList;
import java.util.List;

public class Wallet {
    private List<CryptoAsset> assets;

    // Constructor
    public Wallet() {
        this.assets = new ArrayList<>();
    }

    // Método para adicionar um ativo
    public void addAsset(CryptoAsset asset) {
        assets.add(asset);
    }

    // Método para listar os ativos
    public void showAssets() {
        if (assets.isEmpty()) {
            System.out.println("The wallet is empty.");
        } else {
            for (CryptoAsset asset : assets) {
                System.out.println("Asset: " + asset.getName() + " | Quantity: " + asset.getQuantity());
            }
        }
    }

    // Getter
    public List<CryptoAsset> getAssets() {
        return assets;
    }

}