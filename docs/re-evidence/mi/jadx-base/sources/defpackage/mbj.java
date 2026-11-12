package defpackage;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public final class mbj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<SecureRandom> f25976a = new a();

    public class a extends ThreadLocal<SecureRandom> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SecureRandom initialValue() {
            return mbj.b();
        }
    }

    public static SecureRandom b() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }

    public static byte[] c(int i) {
        byte[] bArr = new byte[i];
        f25976a.get().nextBytes(bArr);
        return bArr;
    }
}
