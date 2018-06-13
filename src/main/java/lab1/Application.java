package lab1;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public class Application implements Serializable {
    private String codeWord;
    private String loanProductId;
    private int tradePoint;
    private int incomeType;
    private int monthlyIncome;
    private int initialPayment;
    private int loanTerm;
    private boolean transferClaimAgree;
    private List goods;
    private Person person;

    public String getCodeWord() {
        return codeWord;
    }

    public void setCodeWord(String codeWord) {
        this.codeWord = codeWord;
    }

    public String getLoanProductId() {
        return loanProductId;
    }

    public void setLoanProductId(String loanProductId) {
        this.loanProductId = loanProductId;
    }

    public int getTradePoint() {
        return tradePoint;
    }

    public void setTradePoint(int tradePoint) {
        this.tradePoint = tradePoint;
    }

    public int getIncomeType() {
        return incomeType;
    }

    public void setIncomeType(int incomeType) {
        this.incomeType = incomeType;
    }

    public int getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(int monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public int getInitialPayment() {
        return initialPayment;
    }

    public void setInitialPayment(int initialPayment) {
        this.initialPayment = initialPayment;
    }

    public int getLoanTerm() {
        return loanTerm;
    }

    public void setLoanTerm(int loanTerm) {
        this.loanTerm = loanTerm;
    }

    public boolean isTransferClaimAgree() {
        return transferClaimAgree;
    }

    public void setTransferClaimAgree(boolean transferClaimAgree) {
        this.transferClaimAgree = transferClaimAgree;
    }

    public List getGoods() {
        return goods;
    }

    public void setGoods(List goods) {
        this.goods = goods;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }


    @Override
    public String toString() {
        return "Application{" +
                "codeWord='" + codeWord + '\'' +
                ", loanProductId='" + loanProductId + '\'' +
                ", tradePoint=" + tradePoint +
                ", incomeType=" + incomeType +
                ", monthlyIncome=" + monthlyIncome +
                ", initialPayment=" + initialPayment +
                ", loanTerm=" + loanTerm +
                ", transferClaimAgree=" + transferClaimAgree +
                ", goods=" + goods +
                ", person=" + person +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Application that = (Application) o;

        if (tradePoint != that.tradePoint) return false;
        if (incomeType != that.incomeType) return false;
        if (monthlyIncome != that.monthlyIncome) return false;
        if (initialPayment != that.initialPayment) return false;
        if (loanTerm != that.loanTerm) return false;
        if (transferClaimAgree != that.transferClaimAgree) return false;
        if (codeWord != null ? !codeWord.equals(that.codeWord) : that.codeWord != null) return false;
        if (loanProductId != null ? !loanProductId.equals(that.loanProductId) : that.loanProductId != null)
            return false;
        if (goods != null ? !goods.equals(that.goods) : that.goods != null) return false;
        return person != null ? person.equals(that.person) : that.person == null;
    }

    @Override
    public int hashCode() {
        int result = codeWord != null ? codeWord.hashCode() : 0;
        result = 31 * result + (loanProductId != null ? loanProductId.hashCode() : 0);
        result = 31 * result + tradePoint;
        result = 31 * result + incomeType;
        result = 31 * result + monthlyIncome;
        result = 31 * result + initialPayment;
        result = 31 * result + loanTerm;
        result = 31 * result + (transferClaimAgree ? 1 : 0);
        result = 31 * result + (goods != null ? goods.hashCode() : 0);
        result = 31 * result + (person != null ? person.hashCode() : 0);
        return result;
    }
}
