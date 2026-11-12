package org.apache.commons.codec.binary;

import java.io.InputStream;
import org.apache.commons.codec.CodecPolicy;

/* JADX INFO: loaded from: classes3.dex */
public class Base64InputStream extends BaseNCodecInputStream {
    public Base64InputStream(InputStream inputStream, boolean z14) {
        super(inputStream, new Base64(false), z14);
    }

    public Base64InputStream(InputStream inputStream) {
        this(inputStream, false);
    }

    public Base64InputStream(InputStream inputStream, boolean z14, int i14, byte[] bArr) {
        super(inputStream, new Base64(i14, bArr), z14);
    }

    public Base64InputStream(InputStream inputStream, boolean z14, int i14, byte[] bArr, CodecPolicy codecPolicy) {
        super(inputStream, new Base64(i14, bArr, false, codecPolicy), z14);
    }
}
