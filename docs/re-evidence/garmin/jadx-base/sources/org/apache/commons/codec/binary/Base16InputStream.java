package org.apache.commons.codec.binary;

import java.io.InputStream;
import org.apache.commons.codec.CodecPolicy;

/* JADX INFO: loaded from: classes3.dex */
public class Base16InputStream extends BaseNCodecInputStream {
    public Base16InputStream(InputStream inputStream, boolean z14, boolean z15, CodecPolicy codecPolicy) {
        super(inputStream, new Base16(z15, codecPolicy), z14);
    }

    public Base16InputStream(InputStream inputStream, boolean z14) {
        this(inputStream, z14, false);
    }

    public Base16InputStream(InputStream inputStream, boolean z14, boolean z15) {
        this(inputStream, z14, z15, CodecPolicy.LENIENT);
    }

    public Base16InputStream(InputStream inputStream) {
        this(inputStream, false);
    }
}
