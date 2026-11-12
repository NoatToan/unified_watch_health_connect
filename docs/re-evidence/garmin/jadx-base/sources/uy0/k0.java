package uy0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Luy0/k0;", "", "Lcom/garmin/android/apps/connectmobile/b1;", "itemAvailability", "<init>", "(Lcom/garmin/android/apps/connectmobile/b1;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.b1 f173220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ty0.b f173221b;

    public k0(com.garmin.android.apps.connectmobile.b1 b1Var) {
        b1Var.getClass();
        this.f173220a = b1Var;
        this.f173221b = ty0.b.R0;
    }

    public final List<com.garmin.android.apps.connectmobile.navigation.more.b.e> a() {
        ty0.b[] bVarArr = ty0.b.R0.f166941g;
        if (bVarArr == null) {
            return p13.j0.f134944a;
        }
        ArrayList arrayListL0 = p13.u.l0(bVarArr);
        com.garmin.android.apps.connectmobile.b1 b1Var = this.f173220a;
        if (b1Var.p0() || b1Var.N()) {
            arrayListL0.remove(ty0.b.I);
            if (!b1Var.p0()) {
                arrayListL0.remove(ty0.b.P);
            }
            if (!b1Var.N()) {
                arrayListL0.remove(ty0.b.T);
            }
        } else if (b1Var.K0()) {
            arrayListL0.remove(ty0.b.P);
            arrayListL0.remove(ty0.b.T);
        } else {
            arrayListL0.remove(ty0.b.I);
            arrayListL0.remove(ty0.b.P);
            arrayListL0.remove(ty0.b.T);
        }
        if (!b1Var.u0()) {
            arrayListL0.remove(ty0.b.X);
        }
        if (!b1Var.B0()) {
            arrayListL0.remove(ty0.b.Y);
        }
        if (!b1Var.b0()) {
            arrayListL0.remove(ty0.b.Z);
        }
        if (!b1Var.d0() && !b1Var.y0()) {
            arrayListL0.remove(ty0.b.f166885k0);
        }
        if (!b1Var.V()) {
            arrayListL0.remove(ty0.b.I0);
        }
        if (!b1Var.j0()) {
            arrayListL0.remove(ty0.b.K0);
        }
        if (!b1Var.f()) {
            arrayListL0.remove(ty0.b.J0);
        }
        if (!b1Var.c0()) {
            arrayListL0.remove(ty0.b.E);
        }
        if (!b1Var.A0()) {
            arrayListL0.remove(ty0.b.F);
        }
        if (!b1Var.f()) {
            arrayListL0.remove(ty0.b.J0);
        }
        if (!b1Var.V0()) {
            arrayListL0.remove(ty0.b.N0);
        }
        if (!b1Var.q0() && !b1Var.N0()) {
            arrayListL0.remove(ty0.b.D);
        }
        if (b1Var.l0() && !b1Var.t0()) {
            arrayListL0.remove(ty0.b.D);
        }
        if (!b1Var.J0()) {
            arrayListL0.remove(ty0.b.H0);
        }
        if (b1Var.I()) {
            ty0.b bVar = ty0.b.L0;
            if (!arrayListL0.contains(bVar)) {
                arrayListL0.add(bVar);
            }
        } else {
            arrayListL0.remove(ty0.b.L0);
        }
        if (b1Var.N()) {
            ty0.b bVar2 = ty0.b.M0;
            if (!arrayListL0.contains(bVar2)) {
                arrayListL0.add(bVar2);
            }
        } else {
            arrayListL0.remove(ty0.b.M0);
        }
        if (!b1Var.D0()) {
            arrayListL0.remove(ty0.b.P0);
            arrayListL0.remove(ty0.b.Q0);
            arrayListL0.remove(ty0.b.O0);
        }
        if (b1Var.X()) {
            arrayListL0.remove(ty0.b.P0);
        } else {
            arrayListL0.remove(ty0.b.Q0);
        }
        List listA = ty0.c.a(arrayListL0);
        ArrayList arrayList = new ArrayList(p13.y.r(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.garmin.android.apps.connectmobile.navigation.more.b.e(this.f173221b, (ty0.b) it.next(), null, false, 12, null));
        }
        return arrayList;
    }
}
