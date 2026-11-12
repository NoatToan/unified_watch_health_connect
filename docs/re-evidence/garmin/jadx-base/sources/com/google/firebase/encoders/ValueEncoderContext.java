package com.google.firebase.encoders;

/* JADX INFO: loaded from: classes2.dex */
public interface ValueEncoderContext {
    ValueEncoderContext add(double d14);

    ValueEncoderContext add(float f14);

    ValueEncoderContext add(int i14);

    ValueEncoderContext add(long j8);

    ValueEncoderContext add(String str);

    ValueEncoderContext add(boolean z14);

    ValueEncoderContext add(byte[] bArr);
}
