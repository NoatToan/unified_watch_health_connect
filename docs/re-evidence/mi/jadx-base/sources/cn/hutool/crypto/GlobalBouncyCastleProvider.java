package cn.hutool.crypto;

import defpackage.gei;
import java.security.Provider;

/* JADX INFO: loaded from: classes.dex */
public enum GlobalBouncyCastleProvider {
    INSTANCE;

    private static boolean useBouncyCastle = true;
    private Provider provider;

    GlobalBouncyCastleProvider() {
        try {
            this.provider = gei.a();
        } catch (NoClassDefFoundError unused) {
        }
    }

    public static void setUseBouncyCastle(boolean z) {
        useBouncyCastle = z;
    }

    public Provider getProvider() {
        if (useBouncyCastle) {
            return this.provider;
        }
        return null;
    }
}
