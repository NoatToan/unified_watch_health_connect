package com.google.crypto.tink.subtle;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes2.dex */
public final class Random {
    private static final ThreadLocal<SecureRandom> localRandom = new ThreadLocal<SecureRandom>() { // from class: com.google.crypto.tink.subtle.Random.1
        @Override // java.lang.ThreadLocal
        public SecureRandom initialValue() {
            return Random.newDefaultSecureRandom();
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static SecureRandom newDefaultSecureRandom() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }

    public static byte[] randBytes(int i14) {
        byte[] bArr = new byte[i14];
        localRandom.get().nextBytes(bArr);
        return bArr;
    }

    public static final int randInt(int i14) {
        return localRandom.get().nextInt(i14);
    }

    public static final int randInt() {
        return localRandom.get().nextInt();
    }
}
