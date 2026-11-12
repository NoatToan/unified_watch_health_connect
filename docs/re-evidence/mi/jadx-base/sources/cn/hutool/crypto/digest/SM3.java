package cn.hutool.crypto.digest;

/* JADX INFO: loaded from: classes.dex */
public class SM3 extends Digester {
    public static final String ALGORITHM_NAME = "SM3";
    private static final long serialVersionUID = 1;

    public SM3() {
        super(ALGORITHM_NAME);
    }

    public static SM3 create() {
        return new SM3();
    }

    public SM3(byte[] bArr) {
        this(bArr, 0, 1);
    }

    public SM3(byte[] bArr, int i) {
        this(bArr, 0, i);
    }

    public SM3(byte[] bArr, int i, int i2) {
        this();
        this.salt = bArr;
        this.saltPosition = i;
        this.digestCount = i2;
    }
}
