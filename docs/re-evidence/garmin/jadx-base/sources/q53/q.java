package q53;

import androidx.lifecycle.p1;
import androidx.lifecycle.y0;
import java.lang.annotation.Annotation;
import m20.z;
import m63.b0;
import m63.f1;
import m63.y1;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p3.p0;
import ui1.o0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f143009a;

    public /* synthetic */ q(int i14) {
        this.f143009a = i14;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = 0;
        switch (this.f143009a) {
            case 0:
                return Unit.INSTANCE;
            case 1:
                return p0.n(Boolean.FALSE);
            case 2:
                q91.c[] cVarArrValues = q91.c.values();
                cVarArrValues.getClass();
                return new b0("com.garmin.android.apps.connectmobile.personalrecords.domain.PersonalRecordStatus", cVarArrValues);
            case 3:
                q91.g[] gVarArrValues = q91.g.values();
                gVarArrValues.getClass();
                return new b0("com.garmin.android.apps.connectmobile.personalrecords.domain.SportType", gVarArrValues);
            case 4:
                return p0.n(Boolean.FALSE);
            case 5:
                qb0.a aVar = qb0.a.f143954a;
                return Unit.INSTANCE;
            case 6:
                qb0.a aVar2 = qb0.a.f143954a;
                return Unit.INSTANCE;
            case 7:
                int i15 = qb1.f.D;
                cw.k.f55931b.getClass();
                return (cw.k) cw.k.f55932c.getValue();
            case 8:
                int i16 = qb1.f.D;
                return new y0(com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.e.TERMS_CONDITIONS);
            case 9:
                int i17 = qb1.f.D;
                return new y0();
            case 10:
                int i18 = qb1.f.D;
                return new y0();
            case 11:
                int i19 = qb1.f.D;
                return new y0();
            case 12:
                int i24 = qb1.f.D;
                return new y0();
            case 13:
                int i25 = qb1.f.D;
                return new y0();
            case 14:
                return new p1();
            case 15:
                u9.b bVar = new u9.b();
                bVar.a(s0.f105811a.b(qc.d.a.class), new qc.c(i14));
                return bVar.b();
            case 16:
                int i26 = qd.a.f144453i;
                return Unit.INSTANCE;
            case 17:
                int i27 = qi1.f.f144858o;
                o0.f171346d.getClass();
                return o0.a.a();
            case 18:
                int i28 = qi1.f.f144858o;
                return ((vi1.a) KoinJavaComponent.get$default(vi1.a.class, null, null, 6, null)).a();
            case 19:
                int i29 = qi1.f.f144858o;
                tj1.h.f165142b.getClass();
                return new tj1.h((tj1.f) ez0.b.a(ez0.b.f67468a, ez0.c.ECC_URL, tj1.f.class, new c83.h.a[0], null, null, null, 120));
            case 20:
                int i30 = qi1.f.f144858o;
                return (z) KoinJavaComponent.get$default(z.class, null, null, 6, null);
            case 21:
                qk0.c.Companion bVar2 = qk0.c.INSTANCE;
                return new m63.s0(c80.u.INSTANCE.serializer());
            case 22:
                qk0.c.Companion bVar3 = qk0.c.INSTANCE;
                return new m63.s0(y1.f117048a);
            case 23:
                qk0.c.Companion bVar4 = qk0.c.INSTANCE;
                return new m63.s0(y1.f117048a);
            case 24:
                return p0.n(Boolean.FALSE);
            case 25:
                return p0.n(null);
            case 26:
                return p0.n(i53.a.d());
            case 27:
                return p0.n(Boolean.FALSE);
            case 28:
                return new f1("com.garmin.android.apps.connectmobile.healthstatus.presentation.HealthStatusNavigation.EditSecondaryStats", qn0.j.INSTANCE, new Annotation[0]);
            default:
                return new f1("com.garmin.android.apps.connectmobile.healthstatus.presentation.HealthStatusNavigation.Reports", qn0.l.INSTANCE, new Annotation[0]);
        }
    }
}
