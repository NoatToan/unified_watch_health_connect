package ey;

import android.content.SharedPreferences;
import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.calendar.model.WorkoutScheduleSummaryDTO;
import com.garmin.android.apps.connectmobile.calendar.presentation.GCMCalendarActivity;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.device.datatypes.DeviceProfile;
import java.util.List;
import lc.u0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p13.j0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class k implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f67097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GCMCalendarActivity f67098b;

    public /* synthetic */ k(GCMCalendarActivity gCMCalendarActivity, int i14) {
        this.f67097a = i14;
        this.f67098b = gCMCalendarActivity;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x01a6  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f67097a;
        GCMCalendarActivity gCMCalendarActivity = this.f67098b;
        g3 g3Var = (g3) obj;
        switch (i14) {
            case 0:
                GCMCalendarActivity.a aVar = GCMCalendarActivity.F;
                if (g3Var.f35300a == fw.p.SUCCESS) {
                    T t7 = g3Var.f35301b;
                    t7.getClass();
                    gCMCalendarActivity.B = (WorkoutScheduleSummaryDTO) t7;
                    androidx.appcompat.app.e.a aVar2 = new androidx.appcompat.app.e.a(gCMCalendarActivity);
                    WorkoutScheduleSummaryDTO workoutScheduleSummaryDTO = gCMCalendarActivity.B;
                    if ((workoutScheduleSummaryDTO != null ? workoutScheduleSummaryDTO.f31051c : 0) > 0) {
                        rd2.f.a().f152045a.getClass();
                        List listE = rd2.j.e();
                        if (listE == null) {
                            listE = j0.f134944a;
                        }
                        if (listE.size() == 1 && ((l80.b) KoinJavaComponent.get$default(l80.b.class, null, null, 6, null)).w().size() == 1) {
                            rd2.f.a().f152045a.getClass();
                            List listE2 = rd2.j.e();
                            if (listE2 == null) {
                                listE2 = j0.f134944a;
                            }
                            if (((sd2.f) listE2.get(0)).getUnitID() == ((DeviceProfile) ((l80.b) KoinJavaComponent.get$default(l80.b.class, null, null, 6, null)).w().get(0)).getF92746j()) {
                                rd2.f.a().f152045a.getClass();
                                List listE3 = rd2.j.e();
                                if (listE3 == null) {
                                    listE3 = j0.f134944a;
                                }
                                gCMCalendarActivity.oa((sd2.f) listE3.get(0));
                            } else {
                                ((vx.f) KoinJavaComponent.get$default(vx.f.class, null, null, 6, null)).O(gCMCalendarActivity);
                            }
                        } else {
                            ((vx.f) KoinJavaComponent.get$default(vx.f.class, null, null, 6, null)).O(gCMCalendarActivity);
                        }
                    } else {
                        aVar2.setMessage(R.string.no_workouts_to_send).setCancelable(false).setPositiveButton(R.string.lbl_ok, new com.garmin.android.apps.connectmobile.connectiq.i(29)).show();
                    }
                }
                return Unit.INSTANCE;
            case 1:
                GCMCalendarActivity.a aVar3 = GCMCalendarActivity.F;
                g3Var.getClass();
                fw.p pVar = g3Var.f35300a;
                xx.f fVar = (xx.f) g3Var.f35301b;
                int i15 = GCMCalendarActivity.b.f31088a[pVar.ordinal()];
                if (i15 == 1) {
                    gCMCalendarActivity.showProgressOverlay();
                } else if (i15 == 2) {
                    gCMCalendarActivity.f31079p--;
                    if (fVar != null) {
                        gCMCalendarActivity.f31077n = fVar.getCalendarUserPrefValue();
                        gCMCalendarActivity.invalidateOptionsMenu();
                    }
                    gCMCalendarActivity.ma();
                } else {
                    if (i15 != 3) {
                        u0.r();
                        return null;
                    }
                    gCMCalendarActivity.f31079p--;
                    Toast.makeText(gCMCalendarActivity, R.string.txt_error_occurred, 0).show();
                    gCMCalendarActivity.ma();
                }
                return Unit.INSTANCE;
            case 2:
                GCMCalendarActivity.a aVar4 = GCMCalendarActivity.F;
                g3Var.getClass();
                fw.p pVar2 = g3Var.f35300a;
                xx.f fVar2 = (xx.f) g3Var.f35301b;
                int i16 = GCMCalendarActivity.b.f31088a[pVar2.ordinal()];
                if (i16 == 1) {
                    gCMCalendarActivity.showProgressOverlay();
                } else if (i16 == 2) {
                    gCMCalendarActivity.f31076m = false;
                    if (fVar2 != null) {
                        boolean z14 = !fVar2.getCalendarUserPrefValue();
                        SharedPreferences.Editor editorEdit = gCMCalendarActivity.getSharedPreferences(gCMCalendarActivity.getString(R.string.one_time_shared_pref_name), 0).edit();
                        editorEdit.putBoolean(gCMCalendarActivity.getString(R.string.one_time_shared_pref_key), z14);
                        editorEdit.apply();
                    }
                    gCMCalendarActivity.hideProgressOverlay();
                } else {
                    if (i16 != 3) {
                        u0.r();
                        return null;
                    }
                    Toast.makeText(gCMCalendarActivity, R.string.txt_error_occurred, 0).show();
                    gCMCalendarActivity.hideProgressOverlay();
                }
                return Unit.INSTANCE;
            default:
                GCMCalendarActivity.a aVar5 = GCMCalendarActivity.F;
                g3Var.getClass();
                fw.p pVar3 = g3Var.f35300a;
                xx.f fVar3 = (xx.f) g3Var.f35301b;
                int i17 = GCMCalendarActivity.b.f31088a[pVar3.ordinal()];
                if (i17 == 1) {
                    gCMCalendarActivity.showProgressOverlay();
                } else if (i17 == 2) {
                    gCMCalendarActivity.f31079p--;
                    if (fVar3 != null) {
                        boolean z15 = !fVar3.getCalendarUserPrefValue();
                        gCMCalendarActivity.f31076m = z15;
                        SharedPreferences.Editor editorEdit2 = gCMCalendarActivity.getSharedPreferences(gCMCalendarActivity.getString(R.string.one_time_shared_pref_name), 0).edit();
                        editorEdit2.putBoolean(gCMCalendarActivity.getString(R.string.one_time_shared_pref_key), z15);
                        editorEdit2.apply();
                    }
                    gCMCalendarActivity.ma();
                } else {
                    if (i17 != 3) {
                        u0.r();
                        return null;
                    }
                    gCMCalendarActivity.f31079p--;
                    Toast.makeText(gCMCalendarActivity, R.string.txt_error_occurred, 0).show();
                    gCMCalendarActivity.ma();
                }
                return Unit.INSTANCE;
        }
    }
}
