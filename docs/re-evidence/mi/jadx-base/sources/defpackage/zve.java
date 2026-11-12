package defpackage;

import android.annotation.SuppressLint;

/* JADX INFO: loaded from: classes4.dex */
public class zve extends xve<pzd, kqk<?>> implements fpf {
    public fpf.a e;

    public zve(long j) {
        super(j);
    }

    @Override // defpackage.fpf
    public /* bridge */ /* synthetic */ kqk a(pzd pzdVar) {
        return (kqk) super.j(pzdVar);
    }

    @Override // defpackage.fpf
    public /* bridge */ /* synthetic */ kqk b(pzd pzdVar, kqk kqkVar) {
        return (kqk) super.i(pzdVar, kqkVar);
    }

    @Override // defpackage.fpf
    public void c(fpf.a aVar) {
        this.e = aVar;
    }

    @Override // defpackage.xve
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public int g(kqk<?> kqkVar) {
        return kqkVar == null ? super.g(null) : kqkVar.getSize();
    }

    @Override // defpackage.xve
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void h(pzd pzdVar, kqk<?> kqkVar) {
        fpf.a aVar = this.e;
        if (aVar == null || kqkVar == null) {
            return;
        }
        aVar.d(kqkVar);
    }

    @Override // defpackage.fpf
    @SuppressLint({"InlinedApi"})
    public void trimMemory(int i) {
        if (i >= 40) {
            clearMemory();
        } else if (i >= 20 || i == 15) {
            k(f() / 2);
        }
    }
}
