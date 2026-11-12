package nk0;

import androidx.lifecycle.j1;
import com.garmin.android.apps.connectmobile.gear.presentation.GearActivity;
import com.garmin.android.apps.connectmobile.gear.presentation.navigation.GearRoute;
import d53.w;
import lc.m0;
import lc.v;
import lc.y;
import ne2.t;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class j implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126399a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GearRoute.p f126400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f126401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m0 f126402d;

    public /* synthetic */ j(GearRoute.p pVar, m0 m0Var, boolean z14) {
        this.f126400b = pVar;
        this.f126402d = m0Var;
        this.f126401c = z14;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        j1 j1VarA;
        String string;
        j1 j1VarA2;
        int i14 = this.f126399a;
        m0 m0Var = this.f126402d;
        boolean z14 = this.f126401c;
        GearRoute.p pVar = this.f126400b;
        switch (i14) {
            case 0:
                jk0.h hVar = (jk0.h) obj;
                GearActivity.a aVar = GearActivity.f35500b;
                hVar.getClass();
                String str = hVar.f99254a;
                String str2 = s.g(str, pVar.f35671b) ? pVar.f35672c : null;
                v vVarF = m0Var.f();
                if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                    j1VarA.f(new pk0.f(hVar.f99254a, str2, false, false, 12, null), "BrandModelSelectionResult");
                }
                if (!hVar.f99255b.isEmpty()) {
                    y.l(m0Var, new GearRoute.q(pVar.f35670a, str, str2, z14));
                } else if (z14) {
                    m0Var.n();
                } else {
                    m0Var.h(new t(10), new GearRoute.c(pVar.f35670a, hVar.f99254a, str2, false, false, 24, (p005kotlin.jvm.internal.j) null));
                }
                break;
            default:
                String str3 = (String) obj;
                GearActivity.a aVar2 = GearActivity.f35500b;
                str3.getClass();
                String string2 = w.i0(str3).toString();
                if (string2.length() <= 0) {
                    string2 = null;
                }
                String str4 = pVar.f35671b;
                if (str4 == null || (string = w.i0(str4).toString()) == null || !z14 || string.length() <= 0) {
                    string = null;
                }
                String str5 = string2 == null ? string : string2;
                if (z14) {
                    pk0.f fVar = new pk0.f(str5, null, true, true);
                    v vVarF2 = m0Var.f();
                    if (vVarF2 != null && (j1VarA2 = vVarF2.a()) != null) {
                        j1VarA2.f(fVar, "BrandModelSelectionResult");
                    }
                    m0Var.n();
                } else {
                    m0Var.h(new t(13), new GearRoute.c(pVar.f35670a, str5, null, true, true));
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ j(GearRoute.p pVar, boolean z14, m0 m0Var) {
        this.f126400b = pVar;
        this.f126401c = z14;
        this.f126402d = m0Var;
    }
}
