package defpackage;

import java.security.SecureRandom;
import java.util.Random;

/* JADX INFO: loaded from: classes20.dex */
public class aacj {
    private static final long e = System.currentTimeMillis();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<SecureRandom> f124b = new ThreadLocal<SecureRandom>() { // from class: aacj.2
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SecureRandom initialValue() {
            return new SecureRandom();
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ThreadLocal<Random> f125c = new ThreadLocal<Random>() { // from class: aacj.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Random initialValue() {
            return new Random(aacj.e + Thread.currentThread().getId());
        }
    };

    public static SecureRandom b() {
        return f124b.get();
    }

    public static Random e() {
        return f125c.get();
    }
}
