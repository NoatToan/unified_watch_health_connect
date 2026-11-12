package com.garmin.android.apps.connectmobile.gear.presentation;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.u1;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.garmin.android.apps.connectmobile.gear.presentation.navigation.GearRoute;
import e23.p;
import e23.r;
import lc.m0;
import lc.v;
import lc.w;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import org.koin.core.scope.Scope;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p3.l0;
import p3.m;
import p3.n;
import p3.x1;
import r1.l;
import y22.z;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class e implements r<l, v, m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hf.j f35604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a f35605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f35606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m0 f35607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k23.d f35608e;

    public e(hf.j jVar, e23.a aVar, e23.a aVar2, m0 m0Var, k23.d dVar) {
        this.f35604a = jVar;
        this.f35605b = aVar;
        this.f35606c = aVar2;
        this.f35607d = m0Var;
        this.f35608e = dVar;
    }

    @Override // e23.r
    public final Unit invoke(l lVar, v vVar, m mVar, Integer num) {
        v vVar2 = vVar;
        m mVar2 = mVar;
        num.intValue();
        lVar.getClass();
        vVar2.getClass();
        x1 x1Var = n.f135158a;
        Unit unit = Unit.INSTANCE;
        Object objQ = mVar2.q();
        m.f135153a.getClass();
        m.a.C2565a c2565a = m.a.f135155b;
        if (objQ == c2565a) {
            objQ = new d(null);
            mVar2.K(objQ);
        }
        l0.e((p) objQ, unit, mVar2);
        t0 t0Var = s0.f105811a;
        y22.l lVar2 = (y22.l) w.a(vVar2, t0Var.b(y22.l.class));
        boolean zB = mVar2.B(vVar2);
        Object objQ2 = mVar2.q();
        if (zB || objQ2 == c2565a) {
            objQ2 = this.f35607d.c(this.f35608e);
            mVar2.K(objQ2);
        }
        v vVar3 = (v) objQ2;
        mVar2.C(461897061);
        GearRoute.n nVar = (GearRoute.n) w.a(vVar3, t0Var.b(GearRoute.n.class));
        boolean zR = mVar2.r(nVar);
        Object objQ3 = mVar2.q();
        if (zR || objQ3 == c2565a) {
            objQ3 = new GearActivity.m(nVar);
            mVar2.K(objQ3);
        }
        mVar2.L(-1614864554);
        CreationExtras creationExtrasDefaultExtras = CreationExtrasExtKt.defaultExtras(vVar3);
        Scope scopeCurrentKoinScope = KoinApplicationKt.currentKoinScope(mVar2, 0);
        u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(t0Var.b(rk0.t0.class), vVar3.getF189591b(), null, creationExtrasDefaultExtras, null, scopeCurrentKoinScope, (e23.a) objQ3);
        mVar2.R();
        rk0.t0 t0Var2 = (rk0.t0) u1VarResolveViewModel;
        mVar2.f();
        int i14 = lVar2.f194261a;
        hf.j jVarA = this.f35604a;
        if (jVarA == null) {
            mVar2.C(2031538953);
            jVarA = hf.v.a((Context) mVar2.A(AndroidCompositionLocals_androidKt.f6042b));
        } else {
            mVar2.C(2031537837);
        }
        mVar2.f();
        hf.j jVar = jVarA;
        z.a(i14, t0Var2, jVar, this.f35605b, this.f35606c, mVar2, 0);
        return unit;
    }
}
