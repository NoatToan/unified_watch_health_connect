package fb1;

import android.content.Context;
import android.os.Build;
import android.view.animation.RotateAnimation;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.solarcharge.adapter.ShortDateTimeAdapter;
import com.garmin.garminpay.util.EnumTypeAdapterFactory;
import com.google.gson.GsonBuilder;
import java.util.List;
import o53.e2;
import org.joda.time.format.DateTimeFormat;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f70223a;

    public /* synthetic */ d0(int i14) {
        this.f70223a = i14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        switch (this.f70223a) {
            case 0:
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.h.a aVar = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.h.B;
                return i52.a.i();
            case 1:
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.l.a aVar2 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.l.f40695p;
                int i14 = gt2.c.f79010a;
                return gt2.b.f79005a.h("PregnancyDetailsFourWeekReportsFragment");
            case 2:
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.a aVar3 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.E;
                RotateAnimation rotateAnimation = new RotateAnimation(360.0f, 180.0f, 1, 0.5f, 1, 0.5f);
                rotateAnimation.setDuration(300L);
                rotateAnimation.setFillAfter(true);
                return rotateAnimation;
            case 3:
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.a aVar4 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.E;
                RotateAnimation rotateAnimation2 = new RotateAnimation(180.0f, 360.0f, 1, 0.5f, 1, 0.5f);
                rotateAnimation2.setDuration(300L);
                rotateAnimation2.setFillAfter(true);
                return rotateAnimation2;
            case 4:
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.q.a aVar5 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.q.f40794v;
                int i15 = gt2.c.f79010a;
                return gt2.b.f79005a.h("PregnancyDetailsOneDayFragment");
            case 5:
                fd2.a.C1446a c1446a = fd2.a.f70497e;
                e2 e2VarH = ge1.b.h();
                x53.c cVar = o53.s0.f129406a;
                return o53.c0.a(t13.g.a.C3052a.d(x53.b.f189152a, e2VarH));
            case 6:
                fd2.a.C1446a c1446a2 = fd2.a.f70497e;
                return "Bearer";
            case 7:
                return Unit.INSTANCE;
            case 8:
                int i16 = gt2.c.f79010a;
                return gt2.b.f79005a.h("CampaignRepository");
            case 9:
                fl2.i iVar = fl2.i.f72080a;
                String strA = td.b.a(td.b.f163878a);
                Context context = hl2.b.a(ok2.a0.f132585h.a()).f132622b;
                context.getClass();
                return td.a.a("SoftwareUpdateCheckerDataStore", strA, context, td.a.d.AES256_SIV, td.a.e.AES256_GCM);
            case 10:
                fm0.a aVar6 = fm0.a.f72093a;
                return (im0.a) KoinJavaComponent.get$default(im0.a.class, null, null, 6, null);
            case 11:
                return Unit.INSTANCE;
            case 12:
                fo.y yVar = fo.y.f72452a;
                return Unit.INSTANCE;
            case 13:
                fo.y yVar2 = fo.y.f72452a;
                return Unit.INSTANCE;
            case 14:
                fo.y yVar3 = fo.y.f72452a;
                return Unit.INSTANCE;
            case 15:
                fo.y yVar4 = fo.y.f72452a;
                return Unit.INSTANCE;
            case 16:
                int i17 = fo1.o0.H0;
                return (iz0.a) KoinJavaComponent.get$default(iz0.a.class, null, null, 6, null);
            case 17:
                int i18 = fo1.o0.H0;
                return (fo1.e) KoinJavaComponent.get$default(fo1.e.class, null, null, 6, null);
            case 18:
                return Unit.INSTANCE;
            case 19:
                return Unit.INSTANCE;
            case 20:
                return Unit.INSTANCE;
            case 21:
                int i19 = ShortDateTimeAdapter.f44779b;
                return DateTimeFormat.forPattern("yyyy-MM-dd").withZoneUTC();
            case 22:
                fp2.d.a aVar7 = fp2.d.f73189k;
                int i24 = gt2.c.f79010a;
                return gt2.b.f79005a.h("PAY#ECOM#FitPayCardNumberFormatTextWatcher");
            case 23:
                fq1.i.a aVar8 = fq1.i.f73249d;
                List listK = p13.x.k(KoinJavaComponent.get$default(fq1.d.class, null, null, 6, null), KoinJavaComponent.get$default(fq1.h.class, null, null, 6, null), KoinJavaComponent.get$default(fq1.e.class, null, null, 6, null), KoinJavaComponent.get$default(fq1.b.class, null, null, 6, null), KoinJavaComponent.get$default(fq1.l.class, null, null, 6, null), KoinJavaComponent.get$default(fq1.m.class, null, null, 6, null), KoinJavaComponent.get$default(fq1.c.class, null, null, 6, null), KoinJavaComponent.get$default(fq1.r.class, null, null, 6, null), KoinJavaComponent.get$default(fq1.g.class, null, null, 6, null), KoinJavaComponent.get$default(fq1.a.class, null, null, 6, null), KoinJavaComponent.get$default(fq1.q.class, null, null, 6, null));
                fq1.i.f73249d.getClass();
                int i25 = Build.VERSION.SDK_INT;
                return (i25 == 31 || i25 == 32) ? p13.h0.C0(fq1.i.a.a(), listK) : listK;
            case 24:
                fq1.i.a aVar9 = fq1.i.f73249d;
                e2 e2VarH2 = ge1.b.h();
                x53.c cVar2 = o53.s0.f129406a;
                return o53.c0.a(t13.g.a.C3052a.d(u53.o.f168762a, e2VarH2));
            case 25:
                i2.a aVar10 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar10.getClass();
                i2.a.b(a2Var, "MobileAuthInitializer", "onUserSignedOut: signing out");
                cw.c cVarM = cw.c.M();
                cVarM.getClass();
                com.garmin.android.library.backgroundtaskmanagement.c.d(new gw.c0(cVarM), null);
                GarminConnectMobileApp.f28685g.getClass();
                GarminConnectMobileApp.a.b().d();
                return Unit.INSTANCE;
            case 26:
                return Unit.INSTANCE;
            case 27:
                fs2.a.b bVar = fs2.a.f73423n;
                return new GsonBuilder().registerTypeAdapterFactory(new EnumTypeAdapterFactory()).create();
            case 28:
                fy1.i.a aVar11 = fy1.i.f73924a;
                return p13.x.k("trainingEffectLabel", "workoutId", "workoutType", "startLocal", "activityType", "distance", "name", "duration", "avgSpeed", "adaptiveCoachingWorkoutStatus", "aerobicTrainingEffect", "parentId", "workoutGroupEnumerator");
            default:
                fy1.i.a aVar12 = fy1.i.f73924a;
                return p13.x.k("workoutId", "workoutType", "activityType", "name", "adaptiveCoachingWorkoutStatus", "parentId", "calendarEventId", "calendarEventUuid");
        }
    }
}
