package org.bouncycastle.crypto.prng;

import defpackage.aqr;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes3.dex */
public class X931SecureRandom extends SecureRandom {
    private final aqr drbg;
    private final boolean predictionResistant;
    private final SecureRandom randomSource;

    public X931SecureRandom(SecureRandom secureRandom, aqr aqrVar, boolean z) {
        this.randomSource = secureRandom;
        this.predictionResistant = z;
    }

    @Override // java.security.SecureRandom
    public byte[] generateSeed(int i) {
        throw null;
    }

    @Override // java.security.SecureRandom, java.util.Random
    public void nextBytes(byte[] bArr) {
        synchronized (this) {
            throw null;
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
