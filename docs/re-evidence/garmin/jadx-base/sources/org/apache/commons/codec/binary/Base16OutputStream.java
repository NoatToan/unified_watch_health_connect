package org.apache.commons.codec.binary;

import java.io.OutputStream;
import org.apache.commons.codec.CodecPolicy;

/* JADX INFO: loaded from: classes3.dex */
public class Base16OutputStream extends BaseNCodecOutputStream {
    public Base16OutputStream(OutputStream outputStream, boolean z14, boolean z15, CodecPolicy codecPolicy) {
        super(outputStream, new Base16(z15, codecPolicy), z14);
    }

    public Base16OutputStream(OutputStream outputStream, boolean z14) {
        this(outputStream, z14, false);
    }

    public Base16OutputStream(OutputStream outputStream, boolean z14, boolean z15) {
        this(outputStream, z14, z15, CodecPolicy.LENIENT);
    }

    public Base16OutputStream(OutputStream outputStream) {
        this(outputStream, true);
    }
}
