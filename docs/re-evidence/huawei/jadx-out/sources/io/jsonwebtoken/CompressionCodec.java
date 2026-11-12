package io.jsonwebtoken;

import defpackage.yxf;
import io.jsonwebtoken.io.CompressionAlgorithm;

/* JADX INFO: loaded from: classes46.dex */
@Deprecated
public interface CompressionCodec extends CompressionAlgorithm {
    @Deprecated
    byte[] compress(byte[] bArr) throws yxf;

    @Deprecated
    byte[] decompress(byte[] bArr) throws yxf;

    @Deprecated
    String getAlgorithmName();
}
