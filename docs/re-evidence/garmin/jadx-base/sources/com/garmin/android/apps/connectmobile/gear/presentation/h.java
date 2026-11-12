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
import y22.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class h implements r<l, v, m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f35611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hf.j f35612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f35613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m0 f35614e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.a f35615f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k23.d f35616g;

    public h(int i14, String str, hf.j jVar, e23.a aVar, m0 m0Var, e23.a aVar2, k23.d dVar) {
        this.f35610a = i14;
        this.f35611b = str;
        this.f35612c = jVar;
        this.f35613d = aVar;
        this.f35614e = m0Var;
        this.f35615f = aVar2;
        this.f35616g = dVar;
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
            objQ = new f(null);
            mVar2.K(objQ);
        }
        l0.e((p) objQ, unit, mVar2);
        boolean zB = mVar2.B(vVar2);
        Object objQ2 = mVar2.q();
        m0 m0Var = this.f35614e;
        if (zB || objQ2 == c2565a) {
            objQ2 = m0Var.c(this.f35616g);
            mVar2.K(objQ2);
        }
        v vVar3 = (v) objQ2;
        mVar2.C(143260);
        t0 t0Var = s0.f105811a;
        GearRoute.m mVar3 = (GearRoute.m) w.a(vVar3, t0Var.b(GearRoute.m.class));
        boolean zR = mVar2.r(mVar3);
        Object objQ3 = mVar2.q();
        if (zR || objQ3 == c2565a) {
            objQ3 = new GearActivity.q(mVar3);
            mVar2.K(objQ3);
        }
        mVar2.L(-1614864554);
        CreationExtras creationExtrasDefaultExtras = CreationExtrasExtKt.defaultExtras(vVar3);
        Scope scopeCurrentKoinScope = KoinApplicationKt.currentKoinScope(mVar2, 0);
        u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(t0Var.b(rk0.s0.class), vVar3.getF189591b(), null, creationExtrasDefaultExtras, null, scopeCurrentKoinScope, (e23.a) objQ3);
        mVar2.R();
        rk0.s0 s0Var = (rk0.s0) u1VarResolveViewModel;
        mVar2.f();
        hf.j jVarA = this.f35612c;
        if (jVarA == null) {
            mVar2.C(2105986368);
            jVarA = hf.v.a((Context) mVar2.A(AndroidCompositionLocals_androidKt.f6042b));
        } else {
            mVar2.C(2105985252);
        }
        mVar2.f();
        hf.j jVar = jVarA;
        boolean zR2 = mVar2.r(m0Var);
        Object objQ4 = mVar2.q();
        if (zR2 || objQ4 == c2565a) {
            objQ4 = new g(m0Var);
            mVar2.K(objQ4);
        }
        s.b(s0Var, this.f35610a, this.f35611b, jVar, this.f35613d, (e23.l) objQ4, this.f35615f, mVar2, 0);
        return unit;
    }
}
