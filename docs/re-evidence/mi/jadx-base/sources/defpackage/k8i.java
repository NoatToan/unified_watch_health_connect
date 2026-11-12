package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes5.dex */
public final class k8i implements i8i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadLocal<Mac> f23588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23589b;
    public final Key c;
    public final int d;

    public class a extends ThreadLocal<Mac> {
        public a() {
        }

        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Mac initialValue() {
            try {
                Mac macA = pb8.g.a(k8i.this.f23589b);
                macA.init(k8i.this.c);
                return macA;
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public k8i(String str, Key key) throws GeneralSecurityException {
        a aVar = new a();
        this.f23588a = aVar;
        this.f23589b = str;
        this.c = key;
        if (key.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        str.hashCode();
        switch (str) {
            case "HMACSHA1":
                this.d = 20;
                break;
            case "HMACSHA256":
                this.d = 32;
                break;
            case "HMACSHA384":
                this.d = 48;
                break;
            case "HMACSHA512":
                this.d = 64;
                break;
            default:
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: " + str);
        }
        aVar.get();
    }

    @Override // defpackage.i8i
    public byte[] a(byte[] bArr, int i) throws GeneralSecurityException {
        if (i > this.d) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        this.f23588a.get().update(bArr);
        return Arrays.copyOf(this.f23588a.get().doFinal(), i);
    }
}
