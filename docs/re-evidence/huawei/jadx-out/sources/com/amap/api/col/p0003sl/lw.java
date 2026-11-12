package com.amap.api.col.p0003sl;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class lw extends lx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f3078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected long f3079b;
    private String d;
    private Context e;

    public lw(Context context, int i, String str, lx lxVar) {
        super(lxVar);
        this.f3078a = i;
        this.d = str;
        this.e = context;
    }

    @Override // com.amap.api.col.p0003sl.lx
    protected final boolean c() {
        if (this.f3079b == 0) {
            String strA = jt.a(this.e, this.d);
            this.f3079b = TextUtils.isEmpty(strA) ? 0L : Long.parseLong(strA);
        }
        return System.currentTimeMillis() - this.f3079b >= ((long) this.f3078a);
    }

    @Override // com.amap.api.col.p0003sl.lx
    public final void a_(boolean z) {
        super.a_(z);
        if (z) {
            String str = this.d;
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f3079b = jCurrentTimeMillis;
            jt.a(this.e, str, String.valueOf(jCurrentTimeMillis));
        }
    }
}
