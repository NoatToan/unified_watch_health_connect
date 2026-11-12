package ro0;

import com.garmin.android.apps.connectmobile.personalrecords.presentation.activity.PersonalRecordsActivity;
import com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.FitPayIssuerBankTermsConditionActivity;
import java.lang.annotation.Annotation;
import m63.b0;
import m63.f1;
import m63.k1;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p3.j0;
import p3.p0;
import s00.d0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class h implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f153766a;

    public /* synthetic */ h(int i14) {
        this.f153766a = i14;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f153766a) {
            case 0:
                i.Companion companion = i.INSTANCE;
                l[] lVarArrValues = l.values();
                lVarArrValues.getClass();
                return new b0("com.garmin.android.apps.connectmobile.help.HelpScreenFeatures", lVarArrValues);
            case 1:
                return new f1("com.garmin.android.apps.connectmobile.activities.reports.presentation.navigation.ActivityReports", rp.a.INSTANCE, new Annotation[0]);
            case 2:
                rp.e.a aVar = rp.e.Companion;
                t0 t0Var = s0.f105811a;
                return new i63.g("com.garmin.android.apps.connectmobile.activities.reports.presentation.navigation.ActivityReportsRoute", t0Var.b(rp.e.class), new k23.d[]{t0Var.b(rp.a.class), t0Var.b(rp.f.class)}, new i63.c[]{new f1("com.garmin.android.apps.connectmobile.activities.reports.presentation.navigation.ActivityReports", rp.a.INSTANCE, new Annotation[0]), rp.f.a.f154063a}, new Annotation[0]);
            case 3:
                FitPayIssuerBankTermsConditionActivity.a aVar2 = FitPayIssuerBankTermsConditionActivity.f51592t;
                int i14 = gt2.c.f79010a;
                return gt2.b.f79005a.h("PAY#NEW_FITPAY#FitPayIssuerBankTermsConditionActivity");
            case 4:
                return rs2.b.extensionsByNameField_delegate$lambda$5();
            case 5:
                return rs2.b.getAllFieldsMethod_delegate$lambda$6();
            case 6:
                rw0.a aVar3 = rw0.a.f154819a;
                return Unit.INSTANCE;
            case 7:
                return Unit.INSTANCE;
            case 8:
                return p0.n(Boolean.FALSE);
            case 9:
                return p0.n(Boolean.FALSE);
            case 10:
                return p0.n("");
            case 11:
                return p0.n(Boolean.FALSE);
            case 12:
                s00.l.a aVar4 = s00.l.f155311a;
                int i15 = gt2.c.f79010a;
                return gt2.b.f79005a.h("CIQMsgNotifHandler");
            case 13:
                int i16 = d0.f155291b;
                return (vi1.a) KoinJavaComponent.get$default(vi1.a.class, null, null, 6, null);
            case 14:
                f4.v vVar = new f4.v(new rw0.b(7));
                f4.f.f68735e.getClass();
                vVar.f68820h = f4.f.a.d(vVar.f68816d);
                return vVar;
            case 15:
                j0 j0Var = s2.g.f156002a;
                return null;
            case 16:
                s21.o.Companion companion2 = s21.o.INSTANCE;
                return new m63.e(s21.n.a.f156157a);
            case 17:
                return k1.d("com.garmin.android.apps.connectmobile.nutrition.presentation.setup.model.NutritionGoalType", s21.s.values(), new String[]{"MAINTAIN", "LOSS", "GAIN", "NO_GOAL"}, new Annotation[][]{null, null, null, null});
            case 18:
                return s5.j0.f157231d;
            case 19:
                return Unit.INSTANCE;
            case 20:
                return Unit.INSTANCE;
            case 21:
                return p0.n(null);
            case 22:
                return p0.n(Boolean.FALSE);
            case 23:
                return Unit.INSTANCE;
            case 24:
                return p0.n(null);
            case 25:
                return p0.n(Boolean.FALSE);
            case 26:
                return Unit.INSTANCE;
            case 27:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 28:
                PersonalRecordsActivity.a aVar5 = PersonalRecordsActivity.f40337b;
                return Unit.INSTANCE;
            default:
                sa0.c cVar = sa0.c.f158169a;
                return Unit.INSTANCE;
        }
    }
}
