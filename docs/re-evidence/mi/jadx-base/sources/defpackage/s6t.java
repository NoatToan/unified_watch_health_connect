package defpackage;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class s6t extends v6t {
    public Context c;
    public boolean d;
    public int e;
    public int f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f33359b = "iKey";
    public int g = 0;

    public s6t(Context context, boolean z, int i, int i2, String str) {
        f(context, z, i, i2, str, 0);
    }

    @Override // defpackage.v6t
    public final int a() {
        int i;
        if ((h0t.K(this.c) == 1 || (i = this.e) <= 0) && ((i = this.g) <= 0 || i >= Integer.MAX_VALUE)) {
            i = Integer.MAX_VALUE;
        }
        v6t v6tVar = this.f36573a;
        return v6tVar != null ? Math.max(i, v6tVar.a()) : i;
    }

    @Override // defpackage.v6t
    public final void b(int i) {
        if (h0t.K(this.c) == 1) {
            return;
        }
        String strC = p0t.c(System.currentTimeMillis(), "yyyyMMdd");
        String strA = k2t.a(this.c, this.f33359b);
        if (!TextUtils.isEmpty(strA)) {
            String[] strArrSplit = strA.split("\\|");
            if (strArrSplit == null || strArrSplit.length < 2) {
                k2t.g(this.c, this.f33359b);
            } else if (strC.equals(strArrSplit[0])) {
                i += Integer.parseInt(strArrSplit[1]);
            }
        }
        k2t.d(this.c, this.f33359b, strC + "|" + i);
    }

    @Override // defpackage.v6t
    public final boolean d() {
        if (h0t.K(this.c) == 1) {
            return true;
        }
        if (!this.d) {
            return false;
        }
        String strA = k2t.a(this.c, this.f33359b);
        if (TextUtils.isEmpty(strA)) {
            return true;
        }
        String[] strArrSplit = strA.split("\\|");
        if (strArrSplit != null && strArrSplit.length >= 2) {
            return !p0t.c(System.currentTimeMillis(), "yyyyMMdd").equals(strArrSplit[0]) || Integer.parseInt(strArrSplit[1]) < this.f;
        }
        k2t.g(this.c, this.f33359b);
        return true;
    }

    public final void f(Context context, boolean z, int i, int i2, String str, int i3) {
        this.c = context;
        this.d = z;
        this.e = i;
        this.f = i2;
        this.f33359b = str;
        this.g = i3;
    }

    public s6t(Context context, boolean z, int i, int i2, String str, int i3) {
        f(context, z, i, i2, str, i3);
    }
}
