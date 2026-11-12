package defpackage;

import com.nimbusds.jose.KeyLengthException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import net.jcip.annotations.Immutable;

/* JADX INFO: loaded from: classes6.dex */
@Immutable
public final class oa4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretKey f28912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SecretKey f28913b;
    public final SecretKey c;
    public final int d;

    public oa4(SecretKey secretKey) throws KeyLengthException {
        this.f28912a = secretKey;
        byte[] encoded = secretKey.getEncoded();
        if (encoded.length == 32) {
            this.f28913b = new SecretKeySpec(encoded, 0, 16, "HMACSHA256");
            this.c = new SecretKeySpec(encoded, 16, 16, "AES");
            this.d = 16;
        } else if (encoded.length == 48) {
            this.f28913b = new SecretKeySpec(encoded, 0, 24, "HMACSHA384");
            this.c = new SecretKeySpec(encoded, 24, 24, "AES");
            this.d = 24;
        } else {
            if (encoded.length != 64) {
                throw new KeyLengthException("Unsupported AES/CBC/PKCS5Padding/HMAC-SHA2 key length, must be 256, 384 or 512 bits");
            }
            this.f28913b = new SecretKeySpec(encoded, 0, 32, "HMACSHA512");
            this.c = new SecretKeySpec(encoded, 32, 32, "AES");
            this.d = 32;
        }
    }

    public SecretKey a() {
        return this.c;
    }

    public SecretKey b() {
        return this.f28913b;
    }

    public int c() {
        return this.d;
    }
}
