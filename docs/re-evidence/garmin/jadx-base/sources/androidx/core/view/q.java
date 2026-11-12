package androidx.core.view;

import android.content.Context;
import androidx.lifecycle.v1;
import com.google.accompanist.permissions.MutablePermissionState;
import com.google.accompanist.permissions.PermissionsUtilKt;
import com.google.android.gms.maps.StreetViewPanoramaView;
import com.google.maps.android.compose.streetview.StreetViewKt;
import java.util.List;
import java.util.Objects;
import p3.p1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements androidx.lifecycle.k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6557c;

    public /* synthetic */ q(int i14, Object obj, Object obj2) {
        this.f6555a = i14;
        this.f6556b = obj;
        this.f6557c = obj2;
    }

    @Override // androidx.lifecycle.k0
    public final void onStateChanged(androidx.lifecycle.n0 n0Var, androidx.lifecycle.b0.a aVar) {
        int i14 = this.f6555a;
        Object obj = this.f6557c;
        Object obj2 = this.f6556b;
        switch (i14) {
            case 0:
                r rVar = (r) obj2;
                s sVar = (s) obj;
                rVar.getClass();
                if (aVar == androidx.lifecycle.b0.a.ON_DESTROY) {
                    rVar.c(sVar);
                }
                break;
            case 1:
                androidx.lifecycle.c0 c0Var = (androidx.lifecycle.c0) obj2;
                o53.l1 l1Var = (o53.l1) obj;
                if (n0Var.getF158016a().getF7973d() == androidx.lifecycle.b0.b.DESTROYED) {
                    l1Var.c(null);
                    c0Var.a();
                    break;
                } else {
                    int iCompareTo = n0Var.getF158016a().getF7973d().compareTo(c0Var.f7846b);
                    androidx.lifecycle.p pVar = c0Var.f7847c;
                    if (iCompareTo < 0) {
                        pVar.f7983a = true;
                        break;
                    } else if (pVar.f7983a) {
                        if (pVar.f7984b) {
                            vb.h.z("Cannot resume a finished dispatcher");
                        } else {
                            pVar.f7983a = false;
                            pVar.a();
                        }
                        break;
                    }
                }
                break;
            case 2:
                b.g.addObserverForBackInvoker$lambda$0((b.u) obj2, (b.g) obj, n0Var, aVar);
                break;
            case 3:
                PermissionsUtilKt.PermissionLifecycleCheckerEffect$lambda$1$lambda$0((androidx.lifecycle.b0.a) obj2, (MutablePermissionState) obj, n0Var, aVar);
                break;
            case 4:
                PermissionsUtilKt.PermissionsLifecycleCheckerEffect$lambda$3$lambda$2((androidx.lifecycle.b0.a) obj2, (List) obj, n0Var, aVar);
                break;
            case 5:
                StreetViewKt.lifecycleObserver$lambda$26((p1) obj2, (StreetViewPanoramaView) obj, n0Var, aVar);
                break;
            case 6:
                androidx.navigation.fragment.a aVar2 = (androidx.navigation.fragment.a) obj2;
                lc.v vVar = (lc.v) obj;
                int i15 = androidx.navigation.fragment.a.f10129j;
                if (aVar == androidx.lifecycle.b0.a.ON_RESUME && ((List) aVar2.b().f111900e.f150540a.getValue()).contains(vVar)) {
                    if (androidx.navigation.fragment.a.n()) {
                        Objects.toString(vVar);
                        n0Var.toString();
                    }
                    aVar2.b().b(vVar);
                }
                if (aVar == androidx.lifecycle.b0.a.ON_DESTROY) {
                    if (androidx.navigation.fragment.a.n()) {
                        Objects.toString(vVar);
                        n0Var.toString();
                    }
                    aVar2.b().b(vVar);
                }
                break;
            case 7:
                List<k31.a> list = (List) obj2;
                com.garmin.android.apps.connectmobile.onboarding.presentation.a aVar3 = (com.garmin.android.apps.connectmobile.onboarding.presentation.a) obj;
                if (aVar == androidx.lifecycle.b0.a.ON_START) {
                    for (k31.a aVar4 : list) {
                        s31.c cVar = aVar3.f39735a;
                        ge1.b.T(cVar, null, null, new s31.b(cVar, aVar4.f102603a, null), 3);
                    }
                }
                break;
            case 8:
                p1 p1Var = (p1) obj;
                if (aVar == ((androidx.lifecycle.b0.a) obj2)) {
                    ((e23.a) p1Var.getF182175a()).invoke();
                }
                break;
            default:
                za0.i iVar = (za0.i) obj2;
                Context context = (Context) obj;
                if (aVar == androidx.lifecycle.b0.a.ON_RESUME) {
                    context.getClass();
                    ge1.b.T(v1.a(iVar), null, null, new za0.m(context, iVar, null), 3);
                }
                break;
        }
    }
}
