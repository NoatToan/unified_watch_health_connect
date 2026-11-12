package defpackage;

import com.google.crypto.tink.proto.HashType;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes5.dex */
public class fjo {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17856a;

        static {
            int[] iArr = new int[HashType.values().length];
            f17856a = iArr;
            try {
                iArr[HashType.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17856a[HashType.SHA256.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17856a[HashType.SHA512.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static String a(HashType hashType) throws NoSuchAlgorithmException {
        int i = a.f17856a[hashType.ordinal()];
        if (i == 1) {
            return "HmacSha1";
        }
        if (i == 2) {
            return "HmacSha256";
        }
        if (i == 3) {
            return "HmacSha512";
        }
        throw new NoSuchAlgorithmException("hash unsupported for HMAC: " + hashType);
    }
}
