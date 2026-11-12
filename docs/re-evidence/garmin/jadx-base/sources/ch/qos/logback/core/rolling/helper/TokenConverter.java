package ch.qos.logback.core.rolling.helper;

/* JADX INFO: loaded from: classes7.dex */
public class TokenConverter {
    static final int DATE = 1;
    static final int IDENTITY = 0;
    static final int INTEGER = 1;
    TokenConverter next;
    int type;

    public TokenConverter(int i14) {
        this.type = i14;
    }

    public TokenConverter getNext() {
        return this.next;
    }

    public int getType() {
        return this.type;
    }

    public void setNext(TokenConverter tokenConverter) {
        this.next = tokenConverter;
    }

    public void setType(int i14) {
        this.type = i14;
    }
}
