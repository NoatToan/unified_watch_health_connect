package org.bouncycastle.jcajce.provider.drbg;

import defpackage.ac8;
import defpackage.bc8;
import defpackage.g04;
import defpackage.j7l;
import defpackage.mdb;
import defpackage.olo;
import defpackage.vj1;
import defpackage.w7l;
import defpackage.zgh;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.SecureRandomSpi;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.bouncycastle.crypto.prng.SP800SecureRandom;

/* JADX INFO: loaded from: classes3.dex */
public class DRBG {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[][] f29500a = {new String[]{"sun.security.provider.Sun", "sun.security.provider.SecureRandom"}, new String[]{"org.apache.harmony.security.provider.crypto.CryptoProvider", "org.apache.harmony.security.provider.crypto.SHA1PRNG_SecureRandomImpl"}, new String[]{"com.android.org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLRandom"}, new String[]{"org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLRandom"}};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object[] f29501b = i();

    public static class Default extends SecureRandomSpi {
        private static final SecureRandom random = DRBG.e(true);

        @Override // java.security.SecureRandomSpi
        public byte[] engineGenerateSeed(int i) {
            return random.generateSeed(i);
        }

        @Override // java.security.SecureRandomSpi
        public void engineNextBytes(byte[] bArr) {
            random.nextBytes(bArr);
        }

        @Override // java.security.SecureRandomSpi
        public void engineSetSeed(byte[] bArr) {
            random.setSeed(bArr);
        }
    }

    public static class NonceAndIV extends SecureRandomSpi {
        private static final SecureRandom random = DRBG.e(false);

        @Override // java.security.SecureRandomSpi
        public byte[] engineGenerateSeed(int i) {
            return random.generateSeed(i);
        }

        @Override // java.security.SecureRandomSpi
        public void engineNextBytes(byte[] bArr) {
            random.nextBytes(bArr);
        }

        @Override // java.security.SecureRandomSpi
        public void engineSetSeed(byte[] bArr) {
            random.setSeed(bArr);
        }
    }

    public static class a implements PrivilegedAction<Boolean> {
        @Override // java.security.PrivilegedAction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean run() {
            try {
                return Boolean.valueOf(SecureRandom.class.getMethod("getInstanceStrong", new Class[0]) != null);
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        }
    }

    public static class b implements PrivilegedAction<SecureRandom> {
        @Override // java.security.PrivilegedAction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SecureRandom run() {
            try {
                return (SecureRandom) SecureRandom.class.getMethod("getInstanceStrong", new Class[0]).invoke(null, new Object[0]);
            } catch (Exception unused) {
                return DRBG.f();
            }
        }
    }

    public static class c implements PrivilegedAction<bc8> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f29502a;

        public c(String str) {
            this.f29502a = str;
        }

        @Override // java.security.PrivilegedAction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public bc8 run() {
            try {
                return (bc8) g04.a(DRBG.class, this.f29502a).newInstance();
            } catch (Exception e) {
                throw new IllegalStateException("entropy source " + this.f29502a + " not created: " + e.getMessage(), e);
            }
        }
    }

    public static class d extends SecureRandom {
        public d() {
            super((SecureRandomSpi) DRBG.f29501b[1], (Provider) DRBG.f29501b[0]);
        }
    }

    public static class e extends SecureRandom {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicBoolean f29503a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicInteger f29504b;
        public final SecureRandom c;
        public final SP800SecureRandom d;

        public class a implements bc8 {
            public a() {
            }

            @Override // defpackage.bc8
            public ac8 get(int i) {
                return e.this.new b(i);
            }
        }

        public class b implements ac8 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f29506a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final AtomicReference f29507b = new AtomicReference();
            public final AtomicBoolean c = new AtomicBoolean(false);

            public class a implements Runnable {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f29508a;

                public a(int i) {
                    this.f29508a = i;
                }

                @Override // java.lang.Runnable
                public void run() {
                    b.this.f29507b.set(e.this.c.generateSeed(this.f29508a));
                    e.this.f29503a.set(true);
                }
            }

            public b(int i) {
                this.f29506a = (i + 7) / 8;
            }

            @Override // defpackage.ac8
            public byte[] a() {
                byte[] bArrGenerateSeed = (byte[]) this.f29507b.getAndSet(null);
                if (bArrGenerateSeed == null || bArrGenerateSeed.length != this.f29506a) {
                    bArrGenerateSeed = e.this.c.generateSeed(this.f29506a);
                } else {
                    this.c.set(false);
                }
                if (!this.c.getAndSet(true)) {
                    new Thread(new a(this.f29506a)).start();
                }
                return bArrGenerateSeed;
            }

            @Override // defpackage.ac8
            public int b() {
                return this.f29506a * 8;
            }
        }

        public e() {
            super(null, null);
            this.f29503a = new AtomicBoolean(false);
            this.f29504b = new AtomicInteger(0);
            SecureRandom secureRandomH = DRBG.h();
            this.c = secureRandomH;
            this.d = new w7l(new a()).c(olo.e("Bouncy Castle Hybrid Entropy Source")).a(new mdb(new j7l()), secureRandomH.generateSeed(32), false);
        }

        @Override // java.security.SecureRandom
        public byte[] generateSeed(int i) {
            byte[] bArr = new byte[i];
            if (this.f29504b.getAndIncrement() > 20 && this.f29503a.getAndSet(false)) {
                this.f29504b.set(0);
                this.d.reseed(null);
            }
            this.d.nextBytes(bArr);
            return bArr;
        }

        @Override // java.security.SecureRandom, java.util.Random
        public void setSeed(long j) {
            SP800SecureRandom sP800SecureRandom = this.d;
            if (sP800SecureRandom != null) {
                sP800SecureRandom.setSeed(j);
            }
        }

        @Override // java.security.SecureRandom
        public void setSeed(byte[] bArr) {
            SP800SecureRandom sP800SecureRandom = this.d;
            if (sP800SecureRandom != null) {
                sP800SecureRandom.setSeed(bArr);
            }
        }
    }

    public static SecureRandom e(boolean z) {
        if (System.getProperty("org.bouncycastle.drbg.entropysource") == null) {
            e eVar = new e();
            byte[] bArrGenerateSeed = eVar.generateSeed(16);
            return new w7l(eVar, true).c(z ? j(bArrGenerateSeed) : k(bArrGenerateSeed)).b(new j7l(), eVar.generateSeed(32), z);
        }
        bc8 bc8VarG = g();
        ac8 ac8Var = bc8VarG.get(128);
        byte[] bArrA = ac8Var.a();
        return new w7l(bc8VarG).c(z ? j(bArrA) : k(bArrA)).b(new j7l(), vj1.j(ac8Var.a(), ac8Var.a()), z);
    }

    public static SecureRandom f() {
        return f29501b != null ? new d() : new SecureRandom();
    }

    public static bc8 g() {
        return (bc8) AccessController.doPrivileged(new c(System.getProperty("org.bouncycastle.drbg.entropysource")));
    }

    public static SecureRandom h() {
        return ((Boolean) AccessController.doPrivileged(new a())).booleanValue() ? (SecureRandom) AccessController.doPrivileged(new b()) : f();
    }

    public static final Object[] i() {
        int i = 0;
        while (true) {
            String[][] strArr = f29500a;
            if (i >= strArr.length) {
                return null;
            }
            String[] strArr2 = strArr[i];
            try {
                return new Object[]{Class.forName(strArr2[0]).newInstance(), Class.forName(strArr2[1]).newInstance()};
            } catch (Throwable unused) {
                i++;
            }
        }
    }

    public static byte[] j(byte[] bArr) {
        return vj1.l(olo.e("Default"), bArr, zgh.l(Thread.currentThread().getId()), zgh.l(System.currentTimeMillis()));
    }

    public static byte[] k(byte[] bArr) {
        return vj1.l(olo.e("Nonce"), bArr, zgh.o(Thread.currentThread().getId()), zgh.o(System.currentTimeMillis()));
    }
}
