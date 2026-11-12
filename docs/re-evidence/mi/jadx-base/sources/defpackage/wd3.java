package defpackage;

import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.e;
import androidx.camera.core.impl.n;
import androidx.camera.core.impl.r;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class wd3 implements e.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wd3 f37864a = new wd3();

    @Override // androidx.camera.core.impl.e.b
    @OptIn(markerClass = {dj8.class})
    public void a(r<?> rVar, e.a aVar) {
        e eVarA = rVar.A(null);
        Config configL = n.L();
        int iG = e.a().g();
        if (eVarA != null) {
            iG = eVarA.g();
            aVar.a(eVarA.b());
            configL = eVarA.d();
        }
        aVar.o(configL);
        pe3 pe3Var = new pe3(rVar);
        aVar.p(pe3Var.O(iG));
        aVar.c(pj3.d(pe3Var.R(vd3.c())));
        aVar.e(pe3Var.M());
    }
}
