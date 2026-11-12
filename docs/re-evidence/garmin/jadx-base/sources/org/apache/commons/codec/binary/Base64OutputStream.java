package org.apache.commons.codec.binary;

import java.io.OutputStream;
import org.apache.commons.codec.CodecPolicy;

/* JADX INFO: loaded from: classes3.dex */
public class Base64OutputStream extends BaseNCodecOutputStream {
    public Base64OutputStream(OutputStream outputStream, boolean z14) {
        super(outputStream, new Base64(false), z14);
    }

    public Base64OutputStream(OutputStream outputStream) {
        this(outputStream, true);
    }

    public Base64OutputStream(OutputStream outputStream, boolean z14, int i14, byte[] bArr) {
        super(outputStream, new Base64(i14, bArr), z14);
    }

    public Base64OutputStream(OutputStream outputStream, boolean z14, int i14, byte[] bArr, CodecPolicy codecPolicy) {
        super(outputStream, new Base64(i14, bArr, false, codecPolicy), z14);
    }
}
