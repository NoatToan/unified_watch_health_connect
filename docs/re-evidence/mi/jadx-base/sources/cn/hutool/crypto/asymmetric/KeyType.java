package cn.hutool.crypto.asymmetric;

/* JADX INFO: loaded from: classes.dex */
public enum KeyType {
    PublicKey(1),
    PrivateKey(2),
    SecretKey(3);

    private final int value;

    KeyType(int i) {
        this.value = i;
    }

    public int getValue() {
        return this.value;
    }
}
