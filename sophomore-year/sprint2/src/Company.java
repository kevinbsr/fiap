import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private String identifier; // pode ser CNPJ, ID, etc.
    private List<CryptoAsset> allocatedAssets;

    // Construtor
    public Company(String name, String identifier) {
        this.name = name;
        this.identifier = identifier;
        this.allocatedAssets = new ArrayList<>();
    }

    // Método para alocar criptoativo na empresa
    public void allocateAsset(CryptoAsset asset) {
        allocatedAssets.add(asset);
    }

    // Método para exibir ativos alocados
    public void showAllocatedAssets() {
        System.out.println("Assets allocated to " + name + ":");
        for (CryptoAsset asset : allocatedAssets) {
            System.out.println("- " + asset.getName() + " (" + asset.getQuantity() + ")");
        }
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getIdentifier() {
        return identifier;
    }

    public List<CryptoAsset> getAllocatedAssets() {
        return allocatedAssets;
    }
}
