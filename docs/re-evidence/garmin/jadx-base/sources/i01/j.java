package i01;

import com.garmin.android.apps.connectmobile.onboarding.domain.FetchDevicesOnboardingWorker;
import f5.p;
import i3.db;
import i3.ec;
import i3.g5;
import i3.h5;
import i3.j2;
import i3.j9;
import i3.k2;
import i3.k5;
import i3.m5;
import i3.p7;
import i3.rj;
import i3.u7;
import i31.c0;
import java.lang.annotation.Annotation;
import java.util.UUID;
import m20.n0;
import m63.b0;
import m63.k1;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.p0;
import p3.y3;
import s5.w0;
import x5.l0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class j implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f86777a;

    public /* synthetic */ j(int i14) {
        this.f86777a = i14;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f86777a) {
            case 0:
                k.Companion companion = k.INSTANCE;
                return new u01.a();
            case 1:
                k.Companion companion2 = k.INSTANCE;
                return l.Companion.serializer();
            case 2:
                return k1.d("com.garmin.android.apps.connectmobile.nutrition.data.model.log.LoggedFoodType", l.values(), new String[]{"FOOD", "RECIPE"}, new Annotation[][]{null, null});
            case 3:
                m.Companion companion3 = m.INSTANCE;
                return i.INSTANCE.serializer();
            case 4:
                m.Companion companion4 = m.INSTANCE;
                return new u01.a();
            case 5:
                m.Companion companion5 = m.INSTANCE;
                e[] eVarArrValues = e.values();
                eVarArrValues.getClass();
                return new b0("com.garmin.android.apps.connectmobile.nutrition.data.model.log.FoodLogAction", eVarArrValues);
            case 6:
                return Unit.INSTANCE;
            case 7:
                return (n0) KoinJavaComponent.get$default(n0.class, null, null, 6, null);
            case 8:
                return g5.f88187a;
            case 9:
                return k5.f88664a;
            case 10:
                return m5.f88951a;
            case 11:
                n3.l.f123059a.getClass();
                long j8 = n3.l.A;
                return new j2(j8, n3.l.f123069k, n3.l.B, n3.l.f123070l, n3.l.f123064f, n3.l.F, n3.l.f123073o, n3.l.G, n3.l.f123074p, n3.l.S, n3.l.f123079u, n3.l.T, n3.l.f123080v, n3.l.f123060b, n3.l.f123066h, n3.l.J, n3.l.f123077s, n3.l.R, n3.l.f123078t, j8, n3.l.f123065g, n3.l.f123063e, n3.l.f123061c, n3.l.f123067i, n3.l.f123062d, n3.l.f123068j, n3.l.f123083y, n3.l.f123084z, n3.l.E, n3.l.K, n3.l.Q, n3.l.L, n3.l.M, n3.l.N, n3.l.O, n3.l.P, n3.l.C, n3.l.D, n3.l.f123071m, n3.l.f123072n, n3.l.H, n3.l.I, n3.l.f123075q, n3.l.f123076r, n3.l.U, n3.l.V, n3.l.f123081w, n3.l.f123082x, null);
            case 12:
                y3 y3Var = k2.f88658a;
                return Boolean.TRUE;
            case 13:
                return p0.n(new l0((String) null, 0L, (w0) null, 7, (p005kotlin.jvm.internal.j) null));
            case 14:
                return p0.n(Boolean.FALSE);
            case 15:
                return Float.valueOf(0.0f);
            case 16:
                k5 k5Var = k5.f88664a;
                return Float.valueOf(1.0f);
            case 17:
                p pVar = p7.f89279a;
                return Boolean.TRUE;
            case 18:
                return g6.f.a(48);
            case 19:
                y3 y3Var2 = u7.f89886a;
                return Boolean.FALSE;
            case 20:
                j9.f88548a.getClass();
                return j9.b.f88550b;
            case 21:
                return UUID.randomUUID();
            case 22:
                return h5.f88293a;
            case 23:
                return new db(0L, null, 3, null);
            case 24:
                return new ec(null, null, null, null, null, 31, null);
            case 25:
                return g6.f.a(0);
            case 26:
                return n3.k1.f123058a;
            case 27:
                return new rj(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
            case 28:
                FetchDevicesOnboardingWorker.a aVar = FetchDevicesOnboardingWorker.f39672j;
                return (i31.c) KoinJavaComponent.get$default(i31.c.class, null, null, 6, null);
            default:
                FetchDevicesOnboardingWorker.a aVar2 = FetchDevicesOnboardingWorker.f39672j;
                return (c0) KoinJavaComponent.get$default(c0.class, null, null, 6, null);
        }
    }
}
