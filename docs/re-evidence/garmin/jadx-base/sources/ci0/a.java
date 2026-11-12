package ci0;

import com.garmin.android.apps.connectmobile.floors.presentation.details.EditFloorsGoalActivity;
import com.garmin.android.apps.connectmobile.g3;
import e23.l;
import lc.u0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditFloorsGoalActivity f27622b;

    public /* synthetic */ a(EditFloorsGoalActivity editFloorsGoalActivity, int i14) {
        this.f27621a = i14;
        this.f27622b = editFloorsGoalActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f27621a;
        EditFloorsGoalActivity editFloorsGoalActivity = this.f27622b;
        g3 g3Var = (g3) obj;
        switch (i14) {
            case 0:
                EditFloorsGoalActivity.a aVar = EditFloorsGoalActivity.f35236k;
                int i15 = EditFloorsGoalActivity.b.f35239a[g3Var.f35300a.ordinal()];
                if (i15 == 1) {
                    editFloorsGoalActivity.showProgressOverlay();
                } else if (i15 == 2) {
                    ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).T3(true);
                    editFloorsGoalActivity.setResult(-1);
                    editFloorsGoalActivity.finish();
                } else {
                    if (i15 != 3) {
                        u0.r();
                        return null;
                    }
                    editFloorsGoalActivity.hideProgressOverlay();
                    editFloorsGoalActivity.displayFailedMessage();
                }
                return Unit.INSTANCE;
            default:
                EditFloorsGoalActivity.a aVar2 = EditFloorsGoalActivity.f35236k;
                int i16 = EditFloorsGoalActivity.b.f35239a[g3Var.f35300a.ordinal()];
                if (i16 == 1) {
                    editFloorsGoalActivity.showProgressOverlay();
                } else if (i16 == 2) {
                    editFloorsGoalActivity.hideProgressOverlay();
                    zk0.h hVar = (zk0.h) g3Var.f35301b;
                    if (hVar == null) {
                        hVar = editFloorsGoalActivity.f35238j;
                    }
                    editFloorsGoalActivity.ja(hVar.C());
                    editFloorsGoalActivity.ka(false);
                } else {
                    if (i16 != 3) {
                        u0.r();
                        return null;
                    }
                    editFloorsGoalActivity.hideProgressOverlay();
                    editFloorsGoalActivity.displayFailedMessage();
                    editFloorsGoalActivity.ja(10);
                }
                return Unit.INSTANCE;
        }
    }
}
