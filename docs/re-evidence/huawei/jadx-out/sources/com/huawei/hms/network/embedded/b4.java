package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.StringUtils;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes34.dex */
public class b4 extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public cb f14597a;

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.f14597a.write(bArr, i, i2);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        write(StringUtils.getBytes(String.valueOf(i)));
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.f14597a.flush();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f14597a.close();
    }

    public b4(cb cbVar) {
        this.f14597a = cbVar;
    }
}
