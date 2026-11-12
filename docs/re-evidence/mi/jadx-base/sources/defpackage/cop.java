package defpackage;

import com.google.android.exoplayer2.trackselection.b;

/* JADX INFO: loaded from: classes4.dex */
public final class cop {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final skk[] f14571b;
    public final b[] c;
    public final Object d;

    public cop(skk[] skkVarArr, b[] bVarArr, Object obj) {
        this.f14571b = skkVarArr;
        this.c = (b[]) bVarArr.clone();
        this.d = obj;
        this.f14570a = skkVarArr.length;
    }

    public boolean a(cop copVar) {
        if (copVar == null || copVar.c.length != this.c.length) {
            return false;
        }
        for (int i = 0; i < this.c.length; i++) {
            if (!b(copVar, i)) {
                return false;
            }
        }
        return true;
    }

    public boolean b(cop copVar, int i) {
        return copVar != null && wlq.c(this.f14571b[i], copVar.f14571b[i]) && wlq.c(this.c[i], copVar.c[i]);
    }

    public boolean c(int i) {
        return this.f14571b[i] != null;
    }
}
