package com.huawei.hms.scankit;

import com.huawei.hms.scankit.p.j0;
import com.huawei.hms.scankit.p.o4;

/* JADX INFO: loaded from: classes34.dex */
public class j implements j0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f15954a;

    public j(d dVar) {
        this.f15954a = dVar;
    }

    @Override // com.huawei.hms.scankit.p.j0.d
    public void a(byte[] bArr) {
        o4.a("scan-time", "request frame time:" + System.currentTimeMillis());
        this.f15954a.a().obtainMessage(R.id.scankit_decode, bArr).sendToTarget();
    }
}
