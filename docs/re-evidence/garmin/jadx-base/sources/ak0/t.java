package ak0;

import am.x0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y0;
import c22.s3;
import com.garmin.android.apps.connectmobile.activities.stats.EditExercisesMultiSelectViewModel;
import com.garmin.feature.garminpay.providers.gpay.ui.addcard.FitPayAddCardActivity;
import java.lang.annotation.Annotation;
import m63.f1;
import org.joda.time.format.DateTimeFormat;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class t implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3678a;

    public /* synthetic */ t(int i14) {
        this.f3678a = i14;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f3678a) {
            case 0:
                return new f1("com.garmin.android.apps.connectmobile.gcplus.presentation.home.GCPlusHomeDestination.PaywallScreen", com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.k.INSTANCE, new Annotation[0]);
            case 1:
                return new f1("com.garmin.android.apps.connectmobile.gcplus.presentation.home.GCPlusHomeDestination.PlanSelectionScreen", com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.l.INSTANCE, new Annotation[0]);
            case 2:
                return p0.n(Boolean.FALSE);
            case 3:
                al2.f.a aVar = al2.f.f3791c;
                return o53.c0.a(t13.g.a.C3052a.d(new o53.a0("EventNotifier"), ge1.b.h()));
            case 4:
                x0[] x0VarArrValues = x0.values();
                x0VarArrValues.getClass();
                return new m63.b0("com.garmin.android.apps.connectmobile.activities.ActivityType", x0VarArrValues);
            case 5:
                return p0.n(Boolean.FALSE);
            case 6:
                return p0.n("");
            case 7:
                return CreationExtras.b.f8056c;
            case 8:
                androidx.room.x0.a aVar2 = androidx.room.x0.f10973l;
                return Boolean.TRUE;
            case 9:
                FitPayAddCardActivity.a aVar3 = FitPayAddCardActivity.f51376x;
                int i14 = gt2.c.f79010a;
                return gt2.b.f79005a.h("PAY#NEW_FITPAY#FitPayAddCardActivity");
            case 10:
                FitPayAddCardActivity.a aVar4 = FitPayAddCardActivity.f51376x;
                return new fp2.b();
            case 11:
                ap2.h.a aVar5 = ap2.h.f11695y;
                int i15 = gt2.c.f79010a;
                return gt2.b.f79005a.h("PAY#NEW_FITPAY#FitPayAddCardViewModel");
            case 12:
                int i16 = EditExercisesMultiSelectViewModel.f29788p;
                return ht.a.f85464a;
            case 13:
                return (yo.q) ez0.b.a(ez0.b.f67468a, ez0.c.GC, yo.q.class, new c83.h.a[0], null, null, null, 120);
            case 14:
                return new y0();
            case 15:
                s3.f23252a.getClass();
                return Boolean.valueOf(s3.a("ROLE_MBTESTER"));
            case 16:
                aq2.j jVar = aq2.j.f12491a;
                kj0.b.f104940a.getClass();
                return yr2.g.b(kj0.b.a()).concat("/com.garmin.connect/locale/garmin-pay/2.0/");
            case 17:
                aq2.j jVar2 = aq2.j.f12491a;
                ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).getClass();
                return "5.30.1";
            case 18:
                aq2.j jVar3 = aq2.j.f12491a;
                return DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").withZoneUTC();
            case 19:
                as.b bVar = as.b.f12618a;
                return Unit.INSTANCE;
            case 20:
                as.b bVar2 = as.b.f12618a;
                return Unit.INSTANCE;
            case 21:
                as.c cVar = as.c.f12621a;
                return Unit.INSTANCE;
            case 22:
                as.c cVar2 = as.c.f12621a;
                return Unit.INSTANCE;
            case 23:
                return Unit.INSTANCE;
            case 24:
                at1.b bVar3 = at1.b.f12757a;
                return Unit.INSTANCE;
            case 25:
                return Unit.INSTANCE;
            case 26:
                com.garmin.android.apps.connectmobile.training.atp.create.steps.b.a aVar6 = com.garmin.android.apps.connectmobile.training.atp.create.steps.b.f45247g;
                return Unit.INSTANCE;
            case 27:
                int i17 = aw1.h.S1;
                return kv1.y.a.a(kv1.y.f106802b);
            case 28:
                int i18 = aw1.h.S1;
                return new dw1.a();
            default:
                int i19 = aw1.h.S1;
                return new y0();
        }
    }
}
