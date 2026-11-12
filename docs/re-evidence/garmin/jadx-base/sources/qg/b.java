package qg;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes7.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile SecureRandom f144653a;

    static {
        "0123456789ABCDEF".toCharArray();
    }

    public static SecureRandom a() {
        if (f144653a != null) {
            return f144653a;
        }
        synchronized (b.class) {
            try {
                if (f144653a == null) {
                    f144653a = new SecureRandom();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return f144653a;
    }
}
