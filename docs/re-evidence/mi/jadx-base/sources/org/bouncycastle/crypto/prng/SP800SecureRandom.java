package org.bouncycastle.crypto.prng;

import defpackage.ac8;
import defpackage.dc8;
import defpackage.ri5;
import defpackage.v7l;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes3.dex */
public class SP800SecureRandom extends SecureRandom {
    private v7l drbg;
    private final ri5 drbgProvider;
    private final ac8 entropySource;
    private final boolean predictionResistant;
    private final SecureRandom randomSource;

    public SP800SecureRandom(SecureRandom secureRandom, ac8 ac8Var, ri5 ri5Var, boolean z) {
        this.randomSource = secureRandom;
        this.entropySource = ac8Var;
        this.drbgProvider = ri5Var;
        this.predictionResistant = z;
    }

    @Override // java.security.SecureRandom
    public byte[] generateSeed(int i) {
        return dc8.a(this.entropySource, i);
    }

    @Override // java.security.SecureRandom, java.util.Random
    public void nextBytes(byte[] bArr) {
        synchronized (this) {
            try {
                if (this.drbg == null) {
                    this.drbg = this.drbgProvider.a(this.entropySource);
                }
                if (this.drbg.a(bArr, null, this.predictionResistant) < 0) {
                    this.drbg.b(null);
                    this.drbg.a(bArr, null, this.predictionResistant);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void reseed(byte[] bArr) {
        synchronized (this) {
            try {
                if (this.drbg == null) {
                    this.drbg = this.drbgProvider.a(this.entropySource);
                }
                this.drbg.b(bArr);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.security.SecureRandom, java.util.Random
    public void setSeed(long j) {
        synchronized (this) {
            try {
                SecureRandom secureRandom = this.randomSource;
                if (secureRandom != null) {
                    secureRandom.setSeed(j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.security.SecureRandom
    public void setSeed(byte[] bArr) {
        synchronized (this) {
            try {
                SecureRandom secureRandom = this.randomSource;
                if (secureRandom != null) {
                    secureRandom.setSeed(bArr);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
