package org.apache.commons.codec.binary;

import java.io.OutputStream;
import org.apache.commons.codec.CodecPolicy;

/* JADX INFO: loaded from: classes3.dex */
public class Base32OutputStream extends BaseNCodecOutputStream {
    public Base32OutputStream(OutputStream outputStream, boolean z14, int i14, byte[] bArr, CodecPolicy codecPolicy) {
        super(outputStream, new Base32(i14, bArr, false, (byte) 61, codecPolicy), z14);
    }

    public Base32OutputStream(OutputStream outputStream, boolean z14) {
        super(outputStream, new Base32(false), z14);
    }

    public Base32OutputStream(OutputStream outputStream, boolean z14, int i14, byte[] bArr) {
        super(outputStream, new Base32(i14, bArr), z14);
    }

    public Base32OutputStream(OutputStream outputStream) {
        this(outputStream, true);
    }
}
