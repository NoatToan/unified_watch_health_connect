package w23;

import p43.f2;
import t23.d1;

/* JADX INFO: loaded from: classes3.dex */
public class f implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f181594a;

    public f(h hVar) {
        this.f181594a = hVar;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0029  */
    @Override // e23.l
    public final Object invoke(Object obj) {
        boolean z14;
        f2 f2Var = (f2) obj;
        k23.l<Object>[] lVarArr = h.f181601i;
        f2Var.getClass();
        if (o72.t.R(f2Var)) {
            z14 = false;
        } else {
            t23.h hVarT = f2Var.F0().t();
            if (!(hVarT instanceof d1) || p005kotlin.jvm.internal.s.g(((d1) hVarT).d(), this.f181594a)) {
                z14 = false;
            } else {
                z14 = true;
            }
        }
        return Boolean.valueOf(z14);
    }
}
