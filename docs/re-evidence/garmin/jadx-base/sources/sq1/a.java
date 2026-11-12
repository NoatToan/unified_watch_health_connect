package sq1;

import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.steps.presentation.details.EditStepsGoalActivity;
import e23.l;
import lc.u0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f160527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditStepsGoalActivity f160528b;

    public /* synthetic */ a(EditStepsGoalActivity editStepsGoalActivity, int i14) {
        this.f160527a = i14;
        this.f160528b = editStepsGoalActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        Integer deviceGoal;
        Integer deviceGoal2;
        Integer userGoal;
        int i14 = this.f160527a;
        int iIntValue = 7500;
        EditStepsGoalActivity editStepsGoalActivity = this.f160528b;
        switch (i14) {
            case 0:
                EditStepsGoalActivity.a aVar = EditStepsGoalActivity.f44923l;
                int i15 = EditStepsGoalActivity.b.f44927a[((g3) obj).f35300a.ordinal()];
                if (i15 == 1) {
                    editStepsGoalActivity.showProgressOverlay();
                } else if (i15 == 2) {
                    ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).T3(true);
                    editStepsGoalActivity.setResult(-1);
                    editStepsGoalActivity.finish();
                } else {
                    if (i15 != 3) {
                        u0.r();
                        return null;
                    }
                    editStepsGoalActivity.hideProgressOverlay();
                    editStepsGoalActivity.displayFailedMessage();
                }
                return Unit.INSTANCE;
            case 1:
                ((Boolean) obj).getClass();
                Integer deviceGoal3 = editStepsGoalActivity.f44925j.getDeviceGoal();
                editStepsGoalActivity.ja(deviceGoal3 != null ? deviceGoal3.intValue() : 7500);
                return Unit.INSTANCE;
            default:
                g3 g3Var = (g3) obj;
                EditStepsGoalActivity.a aVar2 = EditStepsGoalActivity.f44923l;
                int i16 = EditStepsGoalActivity.b.f44927a[g3Var.f35300a.ordinal()];
                if (i16 == 1) {
                    editStepsGoalActivity.showProgressOverlay();
                } else if (i16 == 2) {
                    editStepsGoalActivity.hideProgressOverlay();
                    zk0.c cVar = (zk0.c) g3Var.f35301b;
                    if (cVar == null) {
                        cVar = new zk0.c(null, null, false, null, null, 31, null);
                    }
                    editStepsGoalActivity.f44925j = cVar;
                    boolean zF = cVar.f();
                    zk0.c cVar2 = editStepsGoalActivity.f44925j;
                    if (zF) {
                        Integer deviceGoal4 = cVar2.getDeviceGoal();
                        if (deviceGoal4 != null) {
                            iIntValue = deviceGoal4.intValue();
                        }
                    } else if (cVar2.getUserGoal() != null && ((userGoal = editStepsGoalActivity.f44925j.getUserGoal()) == null || userGoal.intValue() != 0)) {
                        Integer userGoal2 = editStepsGoalActivity.f44925j.getUserGoal();
                        if (userGoal2 != null) {
                            iIntValue = userGoal2.intValue();
                        }
                    } else if (editStepsGoalActivity.f44925j.getDeviceGoal() != null && (((deviceGoal = editStepsGoalActivity.f44925j.getDeviceGoal()) == null || deviceGoal.intValue() != 0) && (deviceGoal2 = editStepsGoalActivity.f44925j.getDeviceGoal()) != null)) {
                        iIntValue = deviceGoal2.intValue();
                    }
                    editStepsGoalActivity.ja(iIntValue);
                    editStepsGoalActivity.ka(editStepsGoalActivity.f44925j.f());
                } else {
                    if (i16 != 3) {
                        u0.r();
                        return null;
                    }
                    editStepsGoalActivity.hideProgressOverlay();
                    editStepsGoalActivity.displayFailedMessage();
                    editStepsGoalActivity.ja(7500);
                }
                return Unit.INSTANCE;
        }
    }
}
