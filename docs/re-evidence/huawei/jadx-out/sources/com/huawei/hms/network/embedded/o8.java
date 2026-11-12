package com.huawei.hms.network.embedded;

import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes34.dex */
public final class o8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileChannel f15150a;

    public void b(long j, bb bbVar, long j2) throws IOException {
        if (j2 < 0 || j2 > bbVar.B()) {
            throw new IndexOutOfBoundsException();
        }
        while (j2 > 0) {
            long jTransferFrom = this.f15150a.transferFrom(bbVar, j, j2);
            j += jTransferFrom;
            j2 -= jTransferFrom;
        }
    }

    public void a(long j, bb bbVar, long j2) throws IOException {
        if (j2 < 0) {
            throw new IndexOutOfBoundsException();
        }
        while (j2 > 0) {
            long jTransferTo = this.f15150a.transferTo(j, j2, bbVar);
            j += jTransferTo;
            j2 -= jTransferTo;
        }
    }

    public o8(FileChannel fileChannel) {
        this.f15150a = fileChannel;
    }
}
