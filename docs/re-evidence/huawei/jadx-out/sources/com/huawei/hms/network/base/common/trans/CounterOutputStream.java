package com.huawei.hms.network.base.common.trans;

import com.huawei.hms.framework.common.StringUtils;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicLong;
import javax.annotation.Nonnull;

/* JADX INFO: loaded from: classes.dex */
public class CounterOutputStream extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicLong f14509a = new AtomicLong(0);

    @Override // java.io.OutputStream
    public void write(@Nonnull byte[] bArr, int i, int i2) {
        this.f14509a.addAndGet(i2);
    }

    @Override // java.io.OutputStream
    public void write(@Nonnull byte[] bArr) {
        this.f14509a.addAndGet(bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        this.f14509a.addAndGet(StringUtils.getBytes(String.valueOf(i)).length);
    }

    public long getLenth() {
        return this.f14509a.get();
    }
}
