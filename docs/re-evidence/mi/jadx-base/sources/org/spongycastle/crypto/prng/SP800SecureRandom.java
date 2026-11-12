package org.spongycastle.crypto.prng;

import defpackage.cc8;
import defpackage.qi5;
import defpackage.u7l;
import defpackage.zb8;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes3.dex */
public class SP800SecureRandom extends SecureRandom {
    private u7l drbg;
    private final qi5 drbgProvider;
    private final zb8 entropySource;
    private final boolean predictionResistant;
    private final SecureRandom randomSource;

    public SP800SecureRandom(SecureRandom secureRandom, zb8 zb8Var, qi5 qi5Var, boolean z) {
        this.randomSource = secureRandom;
        this.predictionResistant = z;
    }

    @Override // java.security.SecureRandom
    public byte[] generateSeed(int i) {
        return cc8.a(null, i);
    }

    @Override // java.security.SecureRandom, java.util.Random
    public void nextBytes(byte[] bArr) {
        synchronized (this) {
            throw null;
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
}
