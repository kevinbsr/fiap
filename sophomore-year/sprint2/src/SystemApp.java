import java.util.ArrayList;
import java.util.List;

public class SystemApp {
    public static void main(String[] args) {
        // Simulação do mercado
        Market market = new Market();
        market.showPrices();

        // Criar usuário
        User user = new User("Scrooge McDuck", "scrooge@ducktales.com", "password123");
        System.out.println("\nLogged in as: " + user.getName());

        // Criar carteira
        Wallet wallet = new Wallet();

        // Criar ativos com preços vindos do mercado
        CryptoAsset btc = new CryptoAsset("Bitcoin", "BTC", 1.5, market.getPrice("BTC"));
        CryptoAsset eth = new CryptoAsset("Ethereum", "ETH", 10, market.getPrice("ETH"));
        wallet.addAsset(btc);
        wallet.addAsset(eth);

        // Criar transações
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction(btc, 1.5, "BUY"));
        transactions.add(new Transaction(eth, 10, "BUY"));

        // Criar empresas e alocar ativos
        Company duckCorp = new Company("DuckCorp", "CNPJ001");
        Company treasureInc = new Company("TreasureInc", "CNPJ002");
        duckCorp.allocateAsset(btc);
        treasureInc.allocateAsset(eth);
        List<Company> companies = List.of(duckCorp, treasureInc);

        // Gerar relatórios
        Report report = new Report();
        System.out.println();
        report.generateWalletReport(wallet);
        System.out.println();
        report.generateTransactionReport(transactions);
        System.out.println();
        report.generateCompanyReport(companies);
    }
}
