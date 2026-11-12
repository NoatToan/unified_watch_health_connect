package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.js;

/* JADX INFO: loaded from: classes12.dex */
public abstract class ni<V extends js> extends jr<V> implements oq<V> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Context f19738c;
    protected cv d;
    protected Integer e;
    protected String f;

    @Override // com.huawei.openalliance.ad.oq
    public void i() {
        this.f19384b.f();
    }

    @Override // com.huawei.openalliance.ad.oq
    public void h() {
        this.f19384b.c();
    }

    @Override // com.huawei.openalliance.ad.oq
    public void c(long j, long j2, long j3, long j4) {
        this.f19384b.b(j, j2, (int) j3, (int) j4);
    }

    @Override // com.huawei.openalliance.ad.oq
    public void b(long j, long j2, long j3, long j4) {
        this.f19384b.c(j, j2, (int) j3, (int) j4);
    }

    @Override // com.huawei.openalliance.ad.oq
    public void a(final long j, final long j2, final long j3) {
        if (j == 0 || j >= j3 || this.d == null) {
            return;
        }
        com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.ni.1
            @Override // java.lang.Runnable
            public void run() {
                long j4 = j3;
                long j5 = j;
                long j6 = j2;
                long j7 = 0;
                if (j6 != 0 && j6 < j4) {
                    j7 = j4 - j6;
                }
                com.huawei.openalliance.ad.analysis.a aVar = new com.huawei.openalliance.ad.analysis.a();
                aVar.a(ni.this.e);
                aVar.d(ni.this.f);
                ni.this.d.a(ni.this.f19383a, j4 - j5, j7, aVar);
            }
        });
    }

    public ni(Context context) {
        this.f19738c = context;
        this.d = new com.huawei.openalliance.ad.analysis.c(context);
    }
}
