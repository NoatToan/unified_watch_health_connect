package yk1;

import androidx.lifecycle.u1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.b1;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import o13.m;
import o13.t;
import p005kotlin.Metadata;
import r53.p2;
import r53.q2;
import ya0.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyk1/i;", "Landroidx/lifecycle/u1;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public al1.a f197615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public al1.a f197616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public al1.a f197617c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f197619e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f197620f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f197618d = m.b(new j(9));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f197621g = m.b(new j(10));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p2 f197622h = q2.a(new al1.a(0.0d, 0, 0, 0.0d));

    public i() {
        final int i14 = 0;
        this.f197619e = m.b(new e23.a(this) { // from class: yk1.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f197614b;

            {
                this.f197614b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                boolean zL0;
                switch (i14) {
                    case 0:
                        zL0 = ((b1) this.f197614b.f197618d.getValue()).l0();
                        break;
                    default:
                        zL0 = ((b1) this.f197614b.f197618d.getValue()).g0();
                        break;
                }
                return Boolean.valueOf(zL0);
            }
        });
        final int i15 = 1;
        this.f197620f = m.b(new e23.a(this) { // from class: yk1.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f197614b;

            {
                this.f197614b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                boolean zL0;
                switch (i15) {
                    case 0:
                        zL0 = ((b1) this.f197614b.f197618d.getValue()).l0();
                        break;
                    default:
                        zL0 = ((b1) this.f197614b.f197618d.getValue()).g0();
                        break;
                }
                return Boolean.valueOf(zL0);
            }
        });
    }

    public static al1.a A4() {
        double dV = GCMSettingManager.v();
        int i14 = GCMSettingManager.f41536b.getInt(GCMSettingManager.f41535a.getString(R.string.key_walking_measured_distance_unit), 0);
        int i15 = GCMSettingManager.f41536b.getInt(GCMSettingManager.f41535a.getString(R.string.key_walking_total_steps), 0);
        return new al1.a(dV, i14, i15, i15 == 0 ? 0.0d : dV / ((double) i15));
    }

    public static al1.a B4() {
        double dW = GCMSettingManager.w();
        int i14 = GCMSettingManager.f41536b.getInt(GCMSettingManager.f41535a.getString(R.string.key_wheelchair_measured_distance_unit), 0);
        int i15 = GCMSettingManager.f41536b.getInt(GCMSettingManager.f41535a.getString(R.string.key_wheelchair_total_pushes), 0);
        return new al1.a(dW, i14, i15, i15 == 0 ? 0.0d : dW / ((double) i15));
    }

    public static String x4(al1.a aVar, al1.a aVar2) {
        if (aVar == null) {
            return "create";
        }
        if (!aVar.a() && !aVar2.a()) {
            return null;
        }
        if (aVar.a() && !aVar2.a()) {
            return "delete";
        }
        if (!aVar.a() && aVar2.a()) {
            return "create";
        }
        if (aVar.a() && aVar2.a() && !aVar.equals(aVar2)) {
            return "update";
        }
        return null;
    }

    public static al1.a y4() {
        double dO = GCMSettingManager.o();
        int i14 = GCMSettingManager.f41536b.getInt(GCMSettingManager.f41535a.getString(R.string.key_running_measured_distance_unit), 0);
        int i15 = GCMSettingManager.f41536b.getInt(GCMSettingManager.f41535a.getString(R.string.key_running_total_steps), 0);
        return new al1.a(dO, i14, i15, i15 == 0 ? 0.0d : dO / ((double) i15));
    }

    public final boolean C4() {
        return ((Boolean) this.f197619e.getValue()).booleanValue();
    }

    public final void D4(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -2026200673) {
            if (iHashCode != -988312717) {
                if (iHashCode == 1836798297 && str.equals("WALKING")) {
                    GCMSettingManager.M(0.0d);
                    GCMSettingManager.O(0);
                    GCMSettingManager.L(0.0f);
                }
            } else if (str.equals("WHEELCHAIR_PUSHING")) {
                GCMSettingManager.Q(0.0d);
                GCMSettingManager.S(0);
                GCMSettingManager.P(0.0f);
            }
        } else if (str.equals("RUNNING")) {
            GCMSettingManager.F(0.0d);
            GCMSettingManager.H(0);
            GCMSettingManager.E(0.0f);
        }
        z4(str);
    }

    public final void z4(String str) {
        str.getClass();
        int iHashCode = str.hashCode();
        p2 p2Var = this.f197622h;
        if (iHashCode != -2026200673) {
            if (iHashCode != -988312717) {
                if (iHashCode == 1836798297 && str.equals("WALKING")) {
                    p2Var.k(null, A4());
                    return;
                }
            } else if (str.equals("WHEELCHAIR_PUSHING")) {
                p2Var.k(null, B4());
                return;
            }
        } else if (str.equals("RUNNING")) {
            p2Var.k(null, y4());
            return;
        }
        p2Var.k(null, new al1.a(0.0d, 0, 0, 0.0d));
    }
}
