package com.huawei.hms.network.embedded;

import java.io.IOException;

/* JADX INFO: loaded from: classes34.dex */
public class m8 extends gb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15095b;

    public void a(IOException iOException) {
    }

    @Override // com.huawei.hms.network.embedded.gb, com.huawei.hms.network.embedded.yb
    public void write(bb bbVar, long j) throws IOException {
        if (this.f15095b) {
            bbVar.skip(j);
            return;
        }
        try {
            super.write(bbVar, j);
        } catch (IOException e) {
            this.f15095b = true;
            a(e);
        }
    }

    @Override // com.huawei.hms.network.embedded.gb, com.huawei.hms.network.embedded.yb, java.io.Flushable
    public void flush() throws IOException {
        if (this.f15095b) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e) {
            this.f15095b = true;
            a(e);
        }
    }

    @Override // com.huawei.hms.network.embedded.gb, com.huawei.hms.network.embedded.yb, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() throws IOException {
        if (this.f15095b) {
            return;
        }
        try {
            super.close();
        } catch (IOException e) {
            this.f15095b = true;
            a(e);
        }
    }

    public m8(yb ybVar) {
        super(ybVar);
    }
}
