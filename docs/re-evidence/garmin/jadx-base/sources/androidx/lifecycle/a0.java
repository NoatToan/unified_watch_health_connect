package androidx.lifecycle;

import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.onboarding.presentation.DeviceOnboardingActivity;
import com.mapbox.maps.MapView;
import com.mapbox.maps.extension.compose.internal.MapViewLifecycleKt;
import com.mapbox.maps.plugin.lifecycle.ViewLifecycleOwner;
import r53.p2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a0 implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7826b;

    public /* synthetic */ a0(Object obj, int i14) {
        this.f7825a = i14;
        this.f7826b = obj;
    }

    /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.Object, o13.l] */
    @Override // androidx.lifecycle.k0
    public final void onStateChanged(n0 n0Var, b0.a aVar) {
        Object value;
        Object value2;
        int i14 = this.f7825a;
        Object obj = null;
        Object obj2 = this.f7826b;
        switch (i14) {
            case 0:
                ((p2) obj2).setValue(aVar.a());
                break;
            case 1:
                q53.t tVar = (q53.t) obj2;
                tVar.i(aVar);
                if (aVar == b0.a.ON_DESTROY) {
                    tVar.q(null);
                }
                break;
            case 2:
                MapViewLifecycleKt.lifecycleEventObserver$lambda$0((MapView) obj2, n0Var, aVar);
                break;
            case 3:
                ViewLifecycleOwner.hostingLifecycleObserver$lambda$0((ViewLifecycleOwner) obj2, n0Var, aVar);
                break;
            case 4:
                kotlin.a aVar2 = (kotlin.a) obj2;
                if (aVar == b0.a.ON_DESTROY) {
                    aVar2.disposeComposition();
                }
                break;
            case 5:
                ib0.g gVar = (ib0.g) obj2;
                if (aVar == b0.a.ON_RESUME) {
                    gVar.y4();
                }
                break;
            case 6:
                ((e23.l) obj2).invoke(aVar);
                break;
            case 7:
                androidx.navigation.fragment.a aVar3 = (androidx.navigation.fragment.a) obj2;
                int i15 = androidx.navigation.fragment.a.f10129j;
                if (aVar == b0.a.ON_DESTROY) {
                    Fragment fragment = (Fragment) n0Var;
                    for (Object obj3 : (Iterable) aVar3.b().f111901f.f150540a.getValue()) {
                        if (p005kotlin.jvm.internal.s.g(((lc.v) obj3).f111886f, fragment.getTag())) {
                            obj = obj3;
                        }
                    }
                    lc.v vVar = (lc.v) obj;
                    if (vVar != null) {
                        if (androidx.navigation.fragment.a.n()) {
                            vVar.toString();
                            n0Var.toString();
                        }
                        aVar3.b().b(vVar);
                    }
                }
                break;
            case 8:
                qc.h hVar = (qc.h) obj2;
                int i16 = qc.h.B;
                hVar.f144331r = aVar.a();
                if (hVar.f144316c != null) {
                    for (lc.v vVar2 : p13.h0.d1(hVar.f144319f)) {
                        vVar2.getClass();
                        qc.d dVar = vVar2.f111888h;
                        dVar.getClass();
                        lc.v vVar3 = dVar.f144293a;
                        b0.b bVarA = aVar.a();
                        bVarA.getClass();
                        vVar3.f111884d = bVarA;
                        dVar.f144296d = aVar.a();
                        dVar.b();
                    }
                }
                break;
            case 9:
                qd.a aVar4 = (qd.a) obj2;
                int i17 = qd.a.f144453i;
                if (aVar == b0.a.ON_START) {
                    aVar4.f144461h = true;
                } else if (aVar == b0.a.ON_STOP) {
                    aVar4.f144461h = false;
                }
                break;
            case 10:
                DeviceOnboardingActivity deviceOnboardingActivity = (DeviceOnboardingActivity) obj2;
                DeviceOnboardingActivity.a aVar5 = DeviceOnboardingActivity.f39726b;
                if (aVar == b0.a.ON_START) {
                    r31.g gVar2 = (r31.g) deviceOnboardingActivity.f39727a.getValue();
                    gVar2.getClass();
                    ge1.b.T(v1.a(gVar2), null, null, new r31.h(gVar2, null), 3);
                }
                break;
            case 11:
                s70.d0 d0Var = (s70.d0) obj2;
                if (aVar == b0.a.ON_START) {
                    p2 p2Var = d0Var.f157681a.f194655a.f124290c;
                    do {
                        value = p2Var.getValue();
                        ((Boolean) value).getClass();
                    } while (!p2Var.b(value, Boolean.valueOf(!((Boolean) p2Var.getValue()).booleanValue())));
                }
                break;
            case 12:
                ((e23.p) obj2).invoke(n0Var, aVar);
                break;
            case 13:
                s70.k1 k1Var = (s70.k1) obj2;
                if (aVar == b0.a.ON_START) {
                    p2 p2Var2 = k1Var.f157720a.f194670a.f124137c;
                    do {
                        value2 = p2Var2.getValue();
                        ((Boolean) value2).getClass();
                    } while (!p2Var2.b(value2, Boolean.valueOf(!((Boolean) p2Var2.getValue()).booleanValue())));
                }
                break;
            case 14:
                s9.a aVar6 = (s9.a) obj2;
                aVar6.getClass();
                aVar6.f157990b = aVar.a();
                aVar6.a();
                break;
            default:
                wn0.l lVar = (wn0.l) obj2;
                if (aVar == b0.a.ON_RESUME && lVar.f186144o) {
                    lVar.f186144o = false;
                    lVar.f186143n.i(new o82.a(lVar.f186137h, null, 2, null), true);
                    break;
                }
                break;
        }
    }
}
