package com.google.crypto.tink.subtle;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public interface StreamSegmentDecrypter {
    void decryptSegment(ByteBuffer byteBuffer, int i14, boolean z14, ByteBuffer byteBuffer2);

    void init(ByteBuffer byteBuffer, byte[] bArr);
}
