package am;

import com.garmin.android.apps.connectmobile.settings.developersettings.TestGoogleAgeSignalsActivity;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class j1 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f4038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f4039c;

    public /* synthetic */ j1(p3.p1 p1Var, p3.p1 p1Var2, int i14) {
        this.f4037a = i14;
        this.f4038b = p1Var;
        this.f4039c = p1Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f4037a;
        p3.p1 p1Var = this.f4039c;
        p3.p1 p1Var2 = this.f4038b;
        switch (i14) {
            case 0:
                p1Var.setValue(Boolean.FALSE);
                p1Var2.setValue("");
                return Unit.INSTANCE;
            case 1:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.d.a aVar = com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.d.f46013c;
                p1Var2.setValue(fz1.r.FINISH);
                p1Var.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 2:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.d.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.d.f46013c;
                p1Var2.setValue(fz1.r.FINISH_GOAL_DISTANCE);
                p1Var.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 3:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.d.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.d.f46013c;
                p1Var2.setValue(fz1.r.FINISH_LEG_GOALS);
                p1Var.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 4:
                p1Var2.setValue(Boolean.FALSE);
                p1Var.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 5:
                p1Var2.setValue(Boolean.FALSE);
                p1Var.setValue(null);
                return Unit.INSTANCE;
            case 6:
                p1Var2.setValue(Boolean.TRUE);
                p1Var.setValue(eo.e.MINIMUM);
                return Unit.INSTANCE;
            case 7:
                p1Var2.setValue(Boolean.TRUE);
                p1Var.setValue(eo.e.MAXIMUM);
                return Unit.INSTANCE;
            case 8:
                p1Var2.setValue(Boolean.TRUE);
                p1Var.setValue(eo.e.MINIMUM);
                return Unit.INSTANCE;
            case 9:
                p1Var2.setValue(Boolean.TRUE);
                p1Var.setValue(eo.e.MAXIMUM);
                return Unit.INSTANCE;
            case 10:
                return Float.valueOf(((Number) ((e23.a) p1Var2.getF182175a()).invoke()).floatValue() / (((Number) p1Var.getF182175a()).floatValue() / 1000.0f));
            case 11:
                p1Var2.setValue(Boolean.TRUE);
                p1Var.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 12:
                p1Var2.setValue(Boolean.TRUE);
                p1Var.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 13:
                p1Var2.setValue(Boolean.FALSE);
                p1Var.setValue(null);
                return Unit.INSTANCE;
            case 14:
                p1Var2.setValue(null);
                p1Var.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 15:
                p1Var2.setValue(Boolean.FALSE);
                p1Var.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 16:
                int i15 = TestGoogleAgeSignalsActivity.f41746b;
                ue2.a aVarValueOf = ue2.a.valueOf(d53.w.g0((String) p1Var2.getF182175a(), " ("));
                ue2.e eVar = new ue2.e();
                aVarValueOf.getClass();
                eVar.f170269a.warn("setTestError: " + aVarValueOf.name());
                eVar.i().edit().putString("testError", aVarValueOf.name()).commit();
                p1Var.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 17:
                p1Var2.setValue(oa0.f.f131057f);
                if (((j90.o) p1Var.getF182175a()) != ((oa0.f) p1Var2.getF182175a()).f131060b.f131054b && ((j90.o) p1Var.getF182175a()) != ((oa0.f) p1Var2.getF182175a()).f131061c.f131054b) {
                    p1Var.setValue(((oa0.f) p1Var2.getF182175a()).f131060b.f131054b);
                }
                return Unit.INSTANCE;
            case 18:
                p1Var2.setValue(oa0.f.f131056e);
                if (((j90.o) p1Var.getF182175a()) != ((oa0.f) p1Var2.getF182175a()).f131060b.f131054b && ((j90.o) p1Var.getF182175a()) != ((oa0.f) p1Var2.getF182175a()).f131061c.f131054b) {
                    p1Var.setValue(((oa0.f) p1Var2.getF182175a()).f131060b.f131054b);
                }
                return Unit.INSTANCE;
            case 19:
                p1Var2.setValue(Boolean.FALSE);
                p1Var.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 20:
                p1Var2.setValue(Boolean.FALSE);
                p1Var.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 21:
                p1Var2.setValue(Boolean.TRUE);
                p1Var.setValue(p40.u0.REST_BREAK);
                return Unit.INSTANCE;
            case 22:
                p1Var2.setValue(p40.u0.REST_BREAK);
                p1Var.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 23:
                p1Var2.setValue(Boolean.TRUE);
                p1Var.setValue(p40.u0.CUTOFF_TIME);
                return Unit.INSTANCE;
            case 24:
                p1Var2.setValue(p40.u0.CUTOFF_TIME);
                p1Var.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 25:
                p1Var2.setValue(Boolean.FALSE);
                p1Var.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 26:
                p40.c0.b(p1Var, true);
                p1Var2.setValue(t50.a.NOTES);
                return Unit.INSTANCE;
            case 27:
                p40.c0.b(p1Var, true);
                p1Var2.setValue(t50.a.RESTS);
                return Unit.INSTANCE;
            case 28:
                p40.c0.b(p1Var, true);
                p1Var2.setValue(t50.a.CUTOFFS);
                return Unit.INSTANCE;
            default:
                p1Var2.setValue(Boolean.TRUE);
                p1Var.setValue(p40.u0.REST_BREAK);
                return Unit.INSTANCE;
        }
    }
}
