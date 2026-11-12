package defpackage;

import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.m;
import androidx.camera.core.impl.n;
import androidx.camera.core.impl.r;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class se3 implements SessionConfig.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final se3 f33556a = new se3();

    @Override // androidx.camera.core.impl.SessionConfig.d
    @OptIn(markerClass = {dj8.class})
    public void a(r<?> rVar, SessionConfig.b bVar) {
        SessionConfig sessionConfigN = rVar.n(null);
        Config configL = n.L();
        int iK = SessionConfig.a().k();
        if (sessionConfigN != null) {
            iK = sessionConfigN.k();
            bVar.a(sessionConfigN.b());
            bVar.c(sessionConfigN.h());
            bVar.b(sessionConfigN.f());
            configL = sessionConfigN.d();
        }
        bVar.q(configL);
        pe3 pe3Var = new pe3(rVar);
        bVar.s(pe3Var.O(iK));
        bVar.e(pe3Var.P(ug3.b()));
        bVar.j(pe3Var.S(sf3.b()));
        bVar.d(pj3.d(pe3Var.R(vd3.c())));
        m mVarO = m.O();
        mVarO.z(pe3.E, pe3Var.L(xg3.e()));
        mVarO.z(pe3.G, pe3Var.Q(null));
        bVar.g(mVarO);
        bVar.g(pe3Var.M());
    }
}
