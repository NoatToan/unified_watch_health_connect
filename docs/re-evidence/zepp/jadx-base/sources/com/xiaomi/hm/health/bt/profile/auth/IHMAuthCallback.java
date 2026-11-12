package com.xiaomi.hm.health.bt.profile.auth;

/* JADX INFO: loaded from: classes11.dex */
public interface IHMAuthCallback {
    void onAuthentication(HMAuthState state);

    byte[] onGetSignData(byte[] sha256, byte[] publicKeyHash, int hashAlgo);
}
