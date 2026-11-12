package d52;

import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.wheelchair.presentation.EditPushesGoalActivity;
import lc.u0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f57561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditPushesGoalActivity f57562b;

    public /* synthetic */ b(EditPushesGoalActivity editPushesGoalActivity, int i14) {
        this.f57561a = i14;
        this.f57562b = editPushesGoalActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        Integer deviceGoal;
        Integer deviceGoal2;
        Integer userGoal;
        int i14 = this.f57561a;
        int iIntValue = 2000;
        EditPushesGoalActivity editPushesGoalActivity = this.f57562b;
        switch (i14) {
            case 0:
                ((Boolean) obj).getClass();
                Integer deviceGoal3 = editPushesGoalActivity.f48022j.getDeviceGoal();
                editPushesGoalActivity.ja(deviceGoal3 != null ? deviceGoal3.intValue() : 2000);
                return Unit.INSTANCE;
            case 1:
                g3 g3Var = (g3) obj;
                EditPushesGoalActivity.a aVar = EditPushesGoalActivity.f48020l;
                int i15 = EditPushesGoalActivity.b.f48024a[g3Var.f35300a.ordinal()];
                if (i15 == 1) {
                    editPushesGoalActivity.showProgressOverlay();
                } else if (i15 == 2) {
                    editPushesGoalActivity.hideProgressOverlay();
                    zk0.a bVar = (zk0.a) g3Var.f35301b;
                    if (bVar == null) {
                        bVar = new zk0.b(null, null, false, null, null, 31, null);
                    }
                    editPushesGoalActivity.f48022j = bVar;
                    boolean zG = p005kotlin.jvm.internal.s.g(bVar.getUserGoalCategory(), "my-auto");
                    zk0.a aVar2 = editPushesGoalActivity.f48022j;
                    if (zG) {
                        Integer deviceGoal4 = aVar2.getDeviceGoal();
                        if (deviceGoal4 != null) {
                            iIntValue = deviceGoal4.intValue();
                        }
                    } else if (aVar2.getUserGoal() != null && ((userGoal = editPushesGoalActivity.f48022j.getUserGoal()) == null || userGoal.intValue() != 0)) {
                        Integer userGoal2 = editPushesGoalActivity.f48022j.getUserGoal();
                        if (userGoal2 != null) {
                            iIntValue = userGoal2.intValue();
                        }
                    } else if (editPushesGoalActivity.f48022j.getDeviceGoal() != null && (((deviceGoal = editPushesGoalActivity.f48022j.getDeviceGoal()) == null || deviceGoal.intValue() != 0) && (deviceGoal2 = editPushesGoalActivity.f48022j.getDeviceGoal()) != null)) {
                        iIntValue = deviceGoal2.intValue();
                    }
                    editPushesGoalActivity.ja(iIntValue);
                    editPushesGoalActivity.ka(p005kotlin.jvm.internal.s.g(editPushesGoalActivity.f48022j.getUserGoalCategory(), "my-auto"));
                } else {
                    if (i15 != 3) {
                        u0.r();
                        return null;
                    }
                    editPushesGoalActivity.hideProgressOverlay();
                    editPushesGoalActivity.displayFailedMessage();
                    editPushesGoalActivity.ja(2000);
                }
                return Unit.INSTANCE;
            default:
                EditPushesGoalActivity.a aVar3 = EditPushesGoalActivity.f48020l;
                int i16 = EditPushesGoalActivity.b.f48024a[((g3) obj).f35300a.ordinal()];
                if (i16 == 1) {
                    editPushesGoalActivity.showProgressOverlay();
                } else if (i16 == 2) {
                    ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).T3(true);
                    editPushesGoalActivity.setResult(-1);
                    editPushesGoalActivity.finish();
                } else {
                    if (i16 != 3) {
                        u0.r();
                        return null;
                    }
                    editPushesGoalActivity.hideProgressOverlay();
                    editPushesGoalActivity.displayFailedMessage();
                }
                return Unit.INSTANCE;
        }
    }
}
