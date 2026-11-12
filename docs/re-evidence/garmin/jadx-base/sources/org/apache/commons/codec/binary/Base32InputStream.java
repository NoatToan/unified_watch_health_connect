package org.apache.commons.codec.binary;

import java.io.InputStream;
import org.apache.commons.codec.CodecPolicy;

/* JADX INFO: loaded from: classes3.dex */
public class Base32InputStream extends BaseNCodecInputStream {
    public Base32InputStream(InputStream inputStream, boolean z14, int i14, byte[] bArr, CodecPolicy codecPolicy) {
        super(inputStream, new Base32(i14, bArr, false, (byte) 61, codecPolicy), z14);
    }

    public Base32InputStream(InputStream inputStream, boolean z14) {
        super(inputStream, new Base32(false), z14);
    }

    public Base32InputStream(InputStream inputStream, boolean z14, int i14, byte[] bArr) {
        super(inputStream, new Base32(i14, bArr), z14);
    }

    public Base32InputStream(InputStream inputStream) {
        this(inputStream, false);
    }
}
