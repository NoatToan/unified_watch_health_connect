package com.google.crypto.tink.subtle;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public interface StreamSegmentEncrypter {
    void encryptSegment(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, boolean z14, ByteBuffer byteBuffer3);

    void encryptSegment(ByteBuffer byteBuffer, boolean z14, ByteBuffer byteBuffer2);

    ByteBuffer getHeader();
}
