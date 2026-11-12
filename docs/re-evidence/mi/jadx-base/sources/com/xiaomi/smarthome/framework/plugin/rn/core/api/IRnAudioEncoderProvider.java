package com.xiaomi.smarthome.framework.plugin.rn.core.api;

/* JADX INFO: loaded from: classes2.dex */
public interface IRnAudioEncoderProvider {
    int decodeG711(byte[] bArr, int i, int i2, byte[] bArr2);

    byte[] encodeG711(byte[] bArr, int i, int i2);
}
