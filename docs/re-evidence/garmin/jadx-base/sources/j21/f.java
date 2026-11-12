package j21;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.logdelivery.PregnancyLogDeliveryDateActivity;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import j31.k1;
import java.lang.annotation.Annotation;
import m63.b0;
import m63.q0;
import m63.v0;
import m63.y1;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f96655a;

    public /* synthetic */ f(int i14) {
        this.f96655a = i14;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f96655a) {
            case 0:
                return p0.n(Boolean.FALSE);
            case 1:
                return Unit.INSTANCE;
            case 2:
                return Unit.INSTANCE;
            case 3:
                return Unit.INSTANCE;
            case 4:
                k1.a aVar = k1.f96902c;
                int i14 = gt2.c.f79010a;
                return gt2.b.f79005a.h("SmartWakeAlarmFeatureHandler");
            case 5:
                int i15 = j40.c.V0;
                return new l40.e();
            case 6:
                j61.i.Companion bVar = j61.i.INSTANCE;
                j61.k[] kVarArrValues = j61.k.values();
                kVarArrValues.getClass();
                return new b0("com.garmin.android.apps.connectmobile.performance.cyclingability.model.CyclingProfileType", kVarArrValues);
            case 7:
                j61.i.Companion bVar2 = j61.i.INSTANCE;
                j61.l[] lVarArrValues = j61.l.values();
                lVarArrValues.getClass();
                return new b0("com.garmin.android.apps.connectmobile.performance.cyclingability.model.CyclingProfileTypeFeedback", lVarArrValues);
            case 8:
                j61.i.Companion bVar3 = j61.i.INSTANCE;
                j61.c[] cVarArrValues = j61.c.values();
                cVarArrValues.getClass();
                return new b0("com.garmin.android.apps.connectmobile.performance.cyclingability.model.AnaerobicCapacityFeedback", cVarArrValues);
            case 9:
                j61.i.Companion bVar4 = j61.i.INSTANCE;
                j61.a[] aVarArrValues = j61.a.values();
                aVarArrValues.getClass();
                return new b0("com.garmin.android.apps.connectmobile.performance.cyclingability.model.AerobicCapacityFeedback", aVarArrValues);
            case 10:
                j61.i.Companion bVar5 = j61.i.INSTANCE;
                j61.b[] bVarArrValues = j61.b.values();
                bVarArrValues.getClass();
                return new b0("com.garmin.android.apps.connectmobile.performance.cyclingability.model.AerobicEnduranceFeedback", bVarArrValues);
            case 11:
                j61.j.Companion bVar6 = j61.j.INSTANCE;
                return new g61.a();
            case 12:
                j61.j.Companion bVar7 = j61.j.INSTANCE;
                return new g61.a();
            case 13:
                j61.j.Companion bVar8 = j61.j.INSTANCE;
                return new q0(y1.f117048a, j63.a.d(j61.i.a.f97355a));
            case 14:
                j90.b.C1868b c1868b = j90.b.Companion;
                j90.a[] aVarArrValues2 = j90.a.values();
                aVarArrValues2.getClass();
                return new b0("com.garmin.android.apps.connectmobile.device.setup.domain.customization.model.ActivityOption", aVarArrValues2);
            case 15:
                PregnancyLogDeliveryDateActivity.a aVar2 = PregnancyLogDeliveryDateActivity.f40875e;
                int i16 = gt2.c.f79010a;
                return gt2.b.f79005a.h("PregnancyLogDeliveryDateActivity");
            case 16:
                jc0.a.b bVar9 = jc0.a.Companion;
                return new m63.e(jc0.d.a.f98159a);
            case 17:
                jc0.d.Companion bVar10 = jc0.d.INSTANCE;
                return new m63.e(y1.f117048a);
            case 18:
                jc0.d.Companion bVar11 = jc0.d.INSTANCE;
                return new m63.e(y1.f117048a);
            case 19:
                int i17 = jd1.f.f98420q;
                int i18 = gt2.c.f79010a;
                return gt2.b.f79005a.h("RemindersFragment");
            case 20:
                int i19 = gt2.c.f79010a;
                return gt2.b.f79005a.h("RemindersViewModel");
            case 21:
                return new y0();
            case 22:
                je0.e.b bVar12 = je0.e.Companion;
                return new m63.e(v0.f117027a);
            case 23:
                je0.f.Companion bVar13 = je0.f.INSTANCE;
                return new m63.e(je0.d.a.f98489a);
            case 24:
                je0.f.Companion bVar14 = je0.f.INSTANCE;
                return je0.g.Companion.serializer();
            case 25:
                je0.f.Companion bVar15 = je0.f.INSTANCE;
                return je0.j.INSTANCE.serializer();
            case 26:
                return m63.k1.d("com.garmin.android.apps.connectmobile.domaindogs.data.model.DogGender", je0.g.values(), new String[]{"male", "female", "other"}, new Annotation[][]{null, null, null});
            case 27:
                je0.h.b bVar16 = je0.h.Companion;
                y1 y1Var = y1.f117048a;
                return new q0(y1Var, new q0(y1Var, je0.h.c.a.f98535a));
            case 28:
                return m63.k1.d("com.garmin.android.apps.connectmobile.domaindogs.data.model.DogStatus", je0.j.values(), new String[]{AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "retired"}, new Annotation[][]{null, null});
            default:
                je0.k.b bVar17 = je0.k.Companion;
                return new m63.e(je0.m.a.f98557a);
        }
    }
}
