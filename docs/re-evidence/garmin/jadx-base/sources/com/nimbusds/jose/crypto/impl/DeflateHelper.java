package com.nimbusds.jose.crypto.impl;

import com.mapbox.maps.p;
import com.nimbusds.jose.CompressionAlgorithm;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.shaded.jcip.ThreadSafe;
import com.nimbusds.jose.util.DeflateUtils;

/* JADX INFO: loaded from: classes3.dex */
@ThreadSafe
public class DeflateHelper {
    public static byte[] applyCompression(JWEHeader jWEHeader, byte[] bArr) {
        CompressionAlgorithm compressionAlgorithm = jWEHeader.getCompressionAlgorithm();
        if (compressionAlgorithm == null) {
            return bArr;
        }
        if (!compressionAlgorithm.equals(CompressionAlgorithm.DEF)) {
            p.m(compressionAlgorithm, "Unsupported compression algorithm: ");
            return null;
        }
        try {
            return DeflateUtils.compress(bArr);
        } catch (Exception e4) {
            throw new JOSEException("Couldn't compress plain text: " + e4.getMessage(), e4);
        }
    }

    public static byte[] applyDecompression(JWEHeader jWEHeader, byte[] bArr) throws JOSEException {
        CompressionAlgorithm compressionAlgorithm = jWEHeader.getCompressionAlgorithm();
        if (compressionAlgorithm == null) {
            return bArr;
        }
        if (!compressionAlgorithm.equals(CompressionAlgorithm.DEF)) {
            p.m(compressionAlgorithm, "Unsupported compression algorithm: ");
            return null;
        }
        try {
            return DeflateUtils.decompress(bArr);
        } catch (Exception e4) {
            throw new JOSEException("Couldn't decompress plain text: " + e4.getMessage(), e4);
        }
    }
}
