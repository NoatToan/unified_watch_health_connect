package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.health.suggestion.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import health.compact.a.LogAnonymous;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes9.dex */
public class huq {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IntPlan f37173c;
    private Context e;

    static /* synthetic */ void a(View view) {
    }

    public huq(Context context, IntPlan intPlan) {
        this.e = context;
        this.f37173c = intPlan;
    }

    public void d() {
        if (btw.n(this.f37173c)) {
            ReleaseLogUtil.e("Suggestion_IntPlanWatchInteract", "pushPlanFirstCreated plan need update");
            return;
        }
        String strB = SharedPreferenceManager.b("MMKV_SUGGEST_MODULE_TAG", "isSendCourseDevice", "");
        ReleaseLogUtil.d("Suggestion_IntPlanWatchInteract", "pushPlanFirstCreated:", strB);
        if (TextUtils.isEmpty(strB) || strB.split(" ").length < 2) {
            if (ifz.d()) {
                hve.e(this.f37173c, this.e);
                return;
            }
            return;
        }
        String[] strArrSplit = strB.split(" ");
        String str = strArrSplit[0];
        String str2 = strArrSplit[1];
        if (!(this.f37173c.getPlanId().equals(str) && Boolean.parseBoolean(str2)) && ifz.d()) {
            hve.e(this.f37173c, this.e);
        }
    }

    public void a() {
        if (!iem.b()) {
            LogUtil.j("Suggestion_IntPlanWatchInteract", "initPushToWatchView bluetooth is disable");
            b();
            return;
        }
        if (!hve.d()) {
            hkt.c(this.e, this.e.getString(R.string.IDS_plan_device_connect), this.e.getString(R.string.IDS_plan_view_supported_devices));
        } else {
            if (!ifz.d()) {
                Context context = this.e;
                hkt.b(context, context.getString(R.string.IDS_fitness_plan_not_pair), this.e.getString(R.string.IDS_plan_view_supported_devices));
                return;
            }
            boolean zU = hvu.u(this.f37173c);
            ReleaseLogUtil.d("Suggestion_IntPlanWatchInteract", "handlePushToWatch isPlanOverdue ", Boolean.valueOf(zU));
            if (zU) {
                qpx.e(this.e, R.string.IDS_plan_sync_fail);
            } else {
                hve.e(this.f37173c, this.e);
            }
        }
    }

    public void b() {
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this.e).a(this.e.getResources().getString(com.huawei.health.servicesui.R.string.IDS_device_bluetooth_open_request)).c(com.huawei.ui.commonui.R.string.IDS_device_bt_right_btn_info, new View.OnClickListener() { // from class: huq.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("Suggestion_IntPlanWatchInteract", "user choose open BT");
                try {
                    BluetoothAdapter.getDefaultAdapter().enable();
                } catch (RuntimeException e) {
                    ReleaseLogUtil.a("Suggestion_IntPlanWatchInteract", "user choose open BT error :", LogAnonymous.b(e));
                }
            }
        }).a(com.huawei.ui.commonui.R.string.IDS_device_bt_left_btn_info, new View.OnClickListener() { // from class: huy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                huq.a(view);
            }
        }).c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }
}
