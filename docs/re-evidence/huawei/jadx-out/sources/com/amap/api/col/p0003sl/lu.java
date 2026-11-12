package com.amap.api.col.p0003sl;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class lu extends lx {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f3076b;
    private boolean d;
    private int e;
    private int f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f3075a = "iKey";
    private int g = 0;

    public lu(Context context, boolean z, int i, int i2, String str) {
        a(context, z, i, i2, str, 0);
    }

    public lu(Context context, boolean z, int i, int i2, String str, int i3) {
        a(context, z, i, i2, str, i3);
    }

    private void a(Context context, boolean z, int i, int i2, String str, int i3) {
        this.f3076b = context;
        this.d = z;
        this.e = i;
        this.f = i2;
        this.f3075a = str;
        this.g = i3;
    }

    @Override // com.amap.api.col.p0003sl.lx
    protected final boolean c() {
        if (ip.j(this.f3076b) == 1) {
            return true;
        }
        if (!this.d) {
            return false;
        }
        String strA = jt.a(this.f3076b, this.f3075a);
        if (TextUtils.isEmpty(strA)) {
            return true;
        }
        String[] strArrSplit = strA.split("\\|");
        if (strArrSplit != null && strArrSplit.length >= 2) {
            return !iy.a(System.currentTimeMillis(), "yyyyMMdd").equals(strArrSplit[0]) || Integer.parseInt(strArrSplit[1]) < this.f;
        }
        jt.b(this.f3076b, this.f3075a);
        return true;
    }

    @Override // com.amap.api.col.p0003sl.lx
    public final int a() {
        int i;
        if ((ip.j(this.f3076b) == 1 || (i = this.e) <= 0) && ((i = this.g) <= 0 || i >= Integer.MAX_VALUE)) {
            i = Integer.MAX_VALUE;
        }
        return this.f3080c != null ? Math.max(i, this.f3080c.a()) : i;
    }

    @Override // com.amap.api.col.p0003sl.lx
    public final void a_(int i) {
        if (ip.j(this.f3076b) == 1) {
            return;
        }
        String strA = iy.a(System.currentTimeMillis(), "yyyyMMdd");
        String strA2 = jt.a(this.f3076b, this.f3075a);
        if (!TextUtils.isEmpty(strA2)) {
            String[] strArrSplit = strA2.split("\\|");
            if (strArrSplit == null || strArrSplit.length < 2) {
                jt.b(this.f3076b, this.f3075a);
            } else if (strA.equals(strArrSplit[0])) {
                i += Integer.parseInt(strArrSplit[1]);
            }
        }
        jt.a(this.f3076b, this.f3075a, strA + "|" + i);
    }
}
