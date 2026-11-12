package f73;

import e73.f;
import h73.r;
import h73.v;
import h73.w;
import tn.k;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements k73.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f69926a;

    public b(char c14) {
        this.f69926a = c14;
    }

    @Override // k73.a
    public final char a() {
        return this.f69926a;
    }

    @Override // k73.a
    public final int b(f fVar, f fVar2) {
        if (fVar.f63345d || fVar2.f63344c) {
            int i14 = fVar2.f63349h;
            if (i14 % 3 != 0 && (fVar.f63349h + i14) % 3 == 0) {
                return 0;
            }
        }
        return (fVar.f63348g < 2 || fVar2.f63348g < 2) ? 1 : 2;
    }

    @Override // k73.a
    public final void c(w wVar, w wVar2, int i14) {
        String strValueOf = String.valueOf(this.f69926a);
        r fVar = i14 == 1 ? new h73.f(strValueOf) : new v(k.g(strValueOf, strValueOf));
        r rVar = wVar.f82383e;
        while (rVar != null && rVar != wVar2) {
            r rVar2 = rVar.f82383e;
            fVar.b(rVar);
            rVar = rVar2;
        }
        fVar.f();
        r rVar3 = wVar.f82383e;
        fVar.f82383e = rVar3;
        if (rVar3 != null) {
            rVar3.f82382d = fVar;
        }
        fVar.f82382d = wVar;
        wVar.f82383e = fVar;
        r rVar4 = wVar.f82379a;
        fVar.f82379a = rVar4;
        if (fVar.f82383e == null) {
            rVar4.f82381c = fVar;
        }
    }

    @Override // k73.a
    public final int d() {
        return 1;
    }

    @Override // k73.a
    public final char e() {
        return this.f69926a;
    }
}
