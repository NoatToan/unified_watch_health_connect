package sn1;

import com.garmin.android.apps.connectmobile.k1;
import java.util.ArrayList;
import km1.v;
import p005kotlin.Metadata;
import p13.h0;
import rl1.i;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsn1/b;", "", "<init>", "()V", "gcm-sleep_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f160414a = new b();

    private b() {
    }

    public static ArrayList a(km1.c cVar, int i14) {
        v dailySleep;
        Integer sleepVersion;
        ArrayList arrayList = new ArrayList();
        bv.b bVar = bv.b.f21239a;
        bVar.getClass();
        bv.b.a();
        k1 k1Var = k1.f37122a;
        k1Var.getClass();
        if (bo1.a.a().c().y()) {
            arrayList.add(i.BREATHING_VARIATIONS);
        }
        if (cVar == null || (dailySleep = cVar.getDailySleep()) == null || (sleepVersion = dailySleep.getSleepVersion()) == null || sleepVersion.intValue() != 2) {
            arrayList.add(i.MOVEMENT);
        } else {
            arrayList.add(i.AWAKE_RESTLESSNESS);
        }
        bVar.getClass();
        bv.b.a();
        if (k1Var.o0() && in1.a.a(cVar)) {
            arrayList.add(i.RESTING_HEART_RATE);
        }
        bVar.getClass();
        bv.b.a();
        if (k1Var.j()) {
            arrayList.add(i.BODY_BATTERY);
        }
        if (d()) {
            arrayList.add(i.SKIN_TEMP);
        }
        bVar.getClass();
        bv.b.a();
        if (k1Var.l()) {
            arrayList.add(i.PULSE_OX);
        }
        bVar.getClass();
        bv.b.a();
        if (k1Var.M0()) {
            if (i14 == 200) {
                arrayList.add(i.RESPIRATION_AVERAGES);
            } else {
                arrayList.add(i.RESPIRATION);
            }
        }
        bVar.getClass();
        bv.b.a();
        if (k1Var.j0()) {
            arrayList.add(i.OVERNIGHT_HRV);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0045  */
    public static com.garmin.android.apps.connectmobile.sleep.presentation.a.b b(boolean z14) {
        boolean z15;
        boolean zG = g();
        boolean zF = f();
        boolean zE = bo1.a.a().c().e();
        bv.b bVar = bv.b.f21239a;
        bVar.getClass();
        bv.b.a();
        k1 k1Var = k1.f37122a;
        k1Var.getClass();
        if (bo1.a.a().c().y()) {
            bVar.getClass();
            bv.b.a();
            if (k1Var.e0()) {
                z15 = true;
            } else {
                z15 = false;
            }
        } else {
            z15 = false;
        }
        boolean zG2 = g();
        bVar.getClass();
        bv.b.a();
        k1Var.getClass();
        boolean zY0 = bo1.a.a().c().y0();
        boolean z16 = false;
        boolean zD = d();
        bVar.getClass();
        bv.b.a();
        boolean zO0 = k1Var.o0();
        bVar.getClass();
        bv.b.a();
        boolean zJ = k1Var.j();
        bVar.getClass();
        bv.b.a();
        if (k1Var.l()) {
            bVar.getClass();
            bv.b.a();
            if (k1Var.e0()) {
                z16 = true;
            }
        }
        bVar.getClass();
        bv.b.a();
        boolean z17 = z16;
        boolean zM0 = k1Var.M0();
        bVar.getClass();
        bv.b.a();
        return new com.garmin.android.apps.connectmobile.sleep.presentation.a.b(zG, zF, zE, z14, new com.garmin.android.apps.connectmobile.sleep.presentation.a.d(z15, zG2, zY0, zD, zO0, zJ, z17, zM0, k1Var.j0(), e()));
    }

    public static ArrayList c(Integer num) {
        ArrayList arrayListD1 = h0.d1(i.f153434o);
        arrayListD1.remove(i.BREATHING_VARIATIONS);
        arrayListD1.remove(i.MOVEMENT);
        arrayListD1.remove(i.AWAKE_RESTLESSNESS);
        bv.b bVar = bv.b.f21239a;
        bVar.getClass();
        bv.b.a();
        k1 k1Var = k1.f37122a;
        if (!k1Var.o0()) {
            arrayListD1.remove(i.RESTING_HEART_RATE);
        }
        bVar.getClass();
        bv.b.a();
        if (!k1Var.n0()) {
            arrayListD1.remove(i.OVERNIGHT_HEART_RATE);
        }
        bVar.getClass();
        bv.b.a();
        if (!k1Var.j()) {
            arrayListD1.remove(i.BODY_BATTERY);
        }
        bVar.getClass();
        bv.b.a();
        if (!k1Var.l()) {
            arrayListD1.remove(i.PULSE_OX);
        }
        bVar.getClass();
        bv.b.a();
        if (!k1Var.M0()) {
            arrayListD1.remove(i.RESPIRATION);
            arrayListD1.remove(i.RESPIRATION_AVERAGES);
        } else if (num != null && num.intValue() == 200) {
            arrayListD1.remove(i.RESPIRATION);
        } else {
            arrayListD1.remove(i.RESPIRATION_AVERAGES);
        }
        bVar.getClass();
        bv.b.a();
        if (!k1Var.j0()) {
            arrayListD1.remove(i.OVERNIGHT_HRV);
        }
        if (!d()) {
            arrayListD1.remove(i.SKIN_TEMP);
        }
        return arrayListD1;
    }

    public static boolean d() {
        bv.b.f21239a.getClass();
        bv.b.a();
        return k1.f37122a.p();
    }

    public static boolean e() {
        bv.b.f21239a.getClass();
        bv.b.a();
        return k1.f37122a.m();
    }

    public static boolean f() {
        bv.b.f21239a.getClass();
        bv.b.a();
        return k1.f37122a.n();
    }

    public static boolean g() {
        bv.b.f21239a.getClass();
        bv.b.a();
        return k1.f37122a.o();
    }
}
