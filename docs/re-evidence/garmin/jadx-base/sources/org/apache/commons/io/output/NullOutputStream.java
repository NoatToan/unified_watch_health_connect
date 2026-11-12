package org.apache.commons.io.output;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public class NullOutputStream extends OutputStream {
    public static final NullOutputStream NULL_OUTPUT_STREAM = new NullOutputStream();

    @Deprecated
    public NullOutputStream() {
    }

    @Override // java.io.OutputStream
    public void write(int i14) {
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i14, int i15) {
    }
}
