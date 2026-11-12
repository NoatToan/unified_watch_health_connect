package com.huawei.hms.mlsdk.asr.o;

import com.huawei.operation.jsoperation.JsUtil;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes34.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f14401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f14402b;

    public c(long j, byte[] bArr) {
        this.f14401a = j;
        this.f14402b = bArr == null ? null : (byte[]) bArr.clone();
    }

    public final byte[] a() {
        k kVar = new k();
        kVar.a(1);
        byte[] bytes = JsUtil.ServiceType.DATA.getBytes(StandardCharsets.UTF_8);
        kVar.a(bytes.length);
        kVar.a(bytes);
        kVar.a(2);
        kVar.a(this.f14401a);
        kVar.a(3);
        kVar.a(this.f14402b.length);
        kVar.a(this.f14402b);
        return kVar.a();
    }
}
