package com.google.crypto.tink.subtle;

import com.google.crypto.tink.prf.Prf;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import org.apache.commons.lang3.e;
import yc.l2;

/* JADX INFO: loaded from: classes2.dex */
@Immutable
public final class PrfHmacJce implements Prf {
    static final int MIN_KEY_SIZE_IN_BYTES = 16;
    private final String algorithm;
    private final Key key;
    private final ThreadLocal<Mac> localMac;
    private final int maxOutputLength;

    public PrfHmacJce(String str, Key key) throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {
        ThreadLocal<Mac> threadLocal = new ThreadLocal<Mac>() { // from class: com.google.crypto.tink.subtle.PrfHmacJce.1
            @Override // java.lang.ThreadLocal
            public Mac initialValue() {
                try {
                    Mac engineFactory = EngineFactory.MAC.getInstance(PrfHmacJce.this.algorithm);
                    engineFactory.init(PrfHmacJce.this.key);
                    return engineFactory;
                } catch (GeneralSecurityException e4) {
                    l2.p(e4);
                    return null;
                }
            }
        };
        this.localMac = threadLocal;
        this.algorithm = str;
        this.key = key;
        if (key.getEncoded().length < 16) {
            e.t("key size too small, need at least 16 bytes");
            throw null;
        }
        str.getClass();
        switch (str) {
            case "HMACSHA1":
                this.maxOutputLength = 20;
                break;
            case "HMACSHA256":
                this.maxOutputLength = 32;
                break;
            case "HMACSHA384":
                this.maxOutputLength = 48;
                break;
            case "HMACSHA512":
                this.maxOutputLength = 64;
                break;
            default:
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
        }
        threadLocal.get();
    }

    @Override // com.google.crypto.tink.prf.Prf
    public byte[] compute(byte[] bArr, int i14) throws InvalidAlgorithmParameterException {
        if (i14 <= this.maxOutputLength) {
            this.localMac.get().update(bArr);
            return Arrays.copyOf(this.localMac.get().doFinal(), i14);
        }
        e.t("tag size too big");
        return null;
    }

    public int getMaxOutputLength() {
        return this.maxOutputLength;
    }
}
