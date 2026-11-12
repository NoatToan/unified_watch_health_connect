package u43;

import e23.l;
import p43.f2;
import t23.c1;
import t23.d1;
import t23.h;

/* JADX INFO: loaded from: classes3.dex */
public class c implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f168629a = new c();

    @Override // e23.l
    public final Object invoke(Object obj) {
        f2 f2Var = (f2) obj;
        f2Var.getClass();
        h hVarT = f2Var.F0().t();
        return Boolean.valueOf(hVarT != null && ((hVarT instanceof c1) || (hVarT instanceof d1)));
    }
}
