package com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.crypto;

/* JADX INFO: loaded from: classes10.dex */
public interface SkippingCipher {
    long getPosition();

    long seekTo(long j);

    long skip(long j);
}
