package defpackage;

import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes20.dex */
public class aabq extends aaba {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final aabp f97a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SecretKey f98b;

    public aabq(aaae aaaeVar, aabp aabpVar, SecretKey secretKey) {
        this(aaaeVar, aabpVar, secretKey, null);
    }

    public aabq(aaae aaaeVar, aabp aabpVar, SecretKey secretKey, Object obj) {
        super(aaaeVar, obj);
        if (aabpVar == null) {
            throw new NullPointerException("PSK identity must not be null!");
        }
        if (secretKey != null) {
            String algorithm = secretKey.getAlgorithm();
            if (!"MAC".equals(algorithm) && !"PSK".equals(algorithm)) {
                throw new IllegalArgumentException("Secret must be either MAC for master secret, or PSK for secret key, but not " + algorithm + "!");
            }
        }
        this.f97a = aabpVar;
        this.f98b = secretKey;
    }

    public aabp b() {
        return this.f97a;
    }

    public SecretKey d() {
        return this.f98b;
    }
}
