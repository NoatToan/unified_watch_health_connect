package e51;

import android.content.Context;
import androidx.lifecycle.y0;
import bd0.c0;
import com.garmin.feature.garminpay.providers.gpay.ecom.EcomMainActivity;
import ew1.d2;
import ey0.g0;
import f12.l;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.TimeZone;
import m63.f1;
import org.joda.time.DateTimeZone;
import org.koin.java.KoinJavaComponent;
import org.slf4j.LoggerFactory;
import p005kotlin.Unit;
import p13.u;
import p3.a2;
import p3.b2;
import p3.p0;
import ps2.w;
import r53.q2;
import rd2.j;
import zn2.z0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f63054a;

    public /* synthetic */ c(int i14) {
        this.f63054a = i14;
    }

    @Override // e23.a
    public final Object invoke() {
        DateTimeZone dateTimeZoneForTimeZone;
        switch (this.f63054a) {
            case 0:
                return new a2(0);
            case 1:
                int i14 = e61.a.f63157j;
                return ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).g();
            case 2:
                int i15 = e61.c.f63169o;
                return ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).g();
            case 3:
                int i16 = e61.c.f63169o;
                String strO4 = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).O4();
                return (strO4 == null || (dateTimeZoneForTimeZone = DateTimeZone.forTimeZone(TimeZone.getTimeZone(strO4))) == null) ? DateTimeZone.getDefault() : dateTimeZoneForTimeZone;
            case 4:
                return new f1("com.garmin.android.apps.connectmobile.workouts.presentation.details.multisport.ViewMultisportWorkoutRoute", e62.e.INSTANCE, new Annotation[0]);
            case 5:
                return new y0();
            case 6:
                ed0.a aVar = ed0.a.f63825a;
                return LoggerFactory.getLogger(com.garmin.android.apps.connectmobile.a2.DEVICES.f28756a);
            case 7:
                ed0.a aVar2 = ed0.a.f63825a;
                return new ed0.a.c();
            case 8:
                ed0.a.f63825a.getClass();
                return new ed0.a.b(ed0.a.e(), ed0.a.f(), u.m0(new Integer[]{1, 2}), new e70.a(3));
            case 9:
                ed0.a aVar3 = ed0.a.f63825a;
                ((l80.b) KoinJavaComponent.get$default(l80.b.class, null, null, 6, null)).z();
                Context context = ((c0) lm2.h.d()).f17547a;
                ed0.a.f63825a.getClass();
                return new an2.a(context, (ed0.a.b) ed0.a.f63828d.getValue());
            case 10:
                ed0.a aVar4 = ed0.a.f63825a;
                rd2.f.a().f152045a.getClass();
                ArrayList arrayListD = j.d();
                return q2.a(Integer.valueOf(arrayListD != null ? arrayListD.size() : 0));
            case 11:
                ed0.a.f63825a.getClass();
                return q2.a(Integer.valueOf(ed0.a.i()));
            case 12:
                ed2.c.a aVar5 = ed2.c.C;
                return "Bearer";
            case 13:
                return Integer.valueOf(en1.c.f64736e.getF134973e());
            case 14:
                EcomMainActivity.a aVar6 = EcomMainActivity.f51133k;
                ms2.g gVarA = w.f140538a.a(is2.b.FITPAY);
                if (gVarA instanceof z0) {
                    return (z0) gVarA;
                }
                return null;
            case 15:
                return eq0.a.M();
            case 16:
                return Unit.INSTANCE;
            case 17:
                return Unit.INSTANCE;
            case 18:
                return Unit.INSTANCE;
            case 19:
                return Unit.INSTANCE;
            case 20:
                return Unit.INSTANCE;
            case 21:
                return Unit.INSTANCE;
            case 22:
                return new je2.a(null, 0.0f, 0.0f, 0.0f, 15, null);
            case 23:
                return new b2(-1L);
            case 24:
                return Unit.INSTANCE;
            case 25:
                return new ev.a();
            case 26:
                int i17 = ev1.b.f66163k0;
                return new y0();
            case 27:
                d2.a aVar7 = d2.f66384d;
                return p0.n(Boolean.TRUE);
            case 28:
                ex2.w wVar = ex2.w.f67058a;
                return new cx2.h("StringsHelper", null, 2, null);
            default:
                int i18 = g0.f67173j;
                return (dy0.f) KoinJavaComponent.get$default(dy0.f.class, null, null, 6, null);
        }
    }
}
