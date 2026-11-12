package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.health.MainActivityHandlerMsg;
import com.huawei.health.R;
import com.huawei.hiai.awareness.AwarenessConstants;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import health.compact.a.CommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.LogUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.utils.StringUtils;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes6.dex */
public class dcb {
    public static void d(Context context, Handler handler) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (CommonUtil.cj()) {
            LogUtil.b("PreLauncherDialogHelper", "isTestThirdDeviceVersion return true, showing dialog...");
            b(context, CommonUtil.an(), CommonUtil.am(), handler);
        } else if (wsp.d()) {
            LogUtil.b("PreLauncherDialogHelper", "BetaVersion&ChinaRom detected, showing dialog...");
            b(context, CommonUtil.d(), CommonUtil.b(), handler);
        } else if (wsp.f() && wsp.j()) {
            LogUtil.b("PreLauncherDialogHelper", "preLaunchCheck isBlockedBetaSubmission = false, isNotAgreeBetaVersion = true");
            handler.sendEmptyMessage(Constants.ON_PAGE_STARTED);
        } else {
            LogUtil.b("PreLauncherDialogHelper", "common version, no dialog, keep going...");
            handler.sendEmptyMessage(MainActivityHandlerMsg.AFTER_LAUNCH_CHECK);
        }
        LogUtil.b("PreLauncherDialogHelper", "preLaunchCheck finished, time cost:", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    private static void b(Context context, long j, long j2, Handler handler) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (j <= jCurrentTimeMillis && jCurrentTimeMillis <= j2) {
            if (wsp.a()) {
                c((Activity) context, handler);
                return;
            }
            if (wjs.e(context)) {
                handler.sendEmptyMessage(MainActivityHandlerMsg.CHECK_BETA_AGREEMENTS_UPDATE);
            }
            handler.sendEmptyMessage(MainActivityHandlerMsg.AFTER_LAUNCH_CHECK);
            return;
        }
        if (StringUtils.g(SharedPreferenceManager.e(context, Integer.toString(PrebakedEffectId.RT_ASSAULT_RIFLE), HiDateUtil.d("yyyyMMdd")))) {
            a((Activity) context, handler);
        } else {
            handler.sendEmptyMessage(MainActivityHandlerMsg.AFTER_LAUNCH_CHECK);
        }
    }

    public static void c(final Activity activity, final Handler handler) {
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        View viewInflate = View.inflate(activity, R.layout.services_custom_view_beta_dialog, null);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        String str = simpleDateFormat.format(new Date(CommonUtil.d()));
        String str2 = simpleDateFormat.format(new Date(CommonUtil.b()));
        if (CommonUtil.cj()) {
            str2 = simpleDateFormat.format(new Date(CommonUtil.am()));
        }
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.hw_health_service_item_two);
        HealthTextView healthTextView2 = (HealthTextView) viewInflate.findViewById(R.id.hw_health_service_item_three);
        HealthTextView healthTextView3 = (HealthTextView) viewInflate.findViewById(R.id.hw_health_service_item_four);
        healthTextView.setText(activity.getString(R.string.IDS_beta_text_one) + ":" + str + AwarenessConstants.SECOND_ACTION_SPLITE_TAG + str2);
        healthTextView2.setText(activity.getString(R.string.IDS_beta_text_two));
        healthTextView3.setText(activity.getString(R.string.IDS_beta_text_three));
        if (qrs.v()) {
            healthTextView.setTextSize(1, 26.0f);
            healthTextView2.setTextSize(1, 26.0f);
            healthTextView3.setTextSize(1, 26.0f);
        }
        CustomViewDialog customViewDialogD = new CustomViewDialog.Builder(activity).a(activity.getString(R.string.IDS_hw_show_main_beta_dialog_title)).d(viewInflate).c(activity.getString(R.string.IDS_hw_show_cancel), new View.OnClickListener() { // from class: dcc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dcb.e(view);
            }
        }).a(activity.getString(R.string.IDS_hw_show_agree), new View.OnClickListener() { // from class: dce
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dcb.e(handler, activity, view);
            }
        }).d();
        customViewDialogD.setCancelable(false);
        customViewDialogD.show();
    }

    static /* synthetic */ void e(View view) {
        Intent intent = new Intent();
        intent.setAction("com.huawei.commonui.CLEAN_ACTIVITY");
        LocalBroadcastManager.getInstance().sendBroadcast(intent);
    }

    static /* synthetic */ void e(Handler handler, Activity activity, View view) {
        if (wsp.d()) {
            handler.sendEmptyMessage(Constants.ON_PAGE_STARTED);
            return;
        }
        SharedPreferenceManager.e(activity, Integer.toString(10000), "health_beta_user_agree", Integer.toString(1), new StorageParams());
        handler.sendEmptyMessage(MainActivityHandlerMsg.AFTER_LAUNCH_CHECK);
    }

    private static void a(final Activity activity, final Handler handler) {
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        View viewInflate = View.inflate(activity, R.layout.services_custom_view_beta_dialog, null);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.hw_health_service_item_image_two);
        ((HealthTextView) viewInflate.findViewById(R.id.hw_health_service_item_two)).setText(activity.getString(R.string.IDS_beta_text_expired));
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.hw_health_services_three_layout);
        LinearLayout linearLayout2 = (LinearLayout) viewInflate.findViewById(R.id.hw_health_services_four_layout);
        imageView.setVisibility(8);
        linearLayout.setVisibility(8);
        linearLayout2.setVisibility(8);
        CustomViewDialog customViewDialogD = new CustomViewDialog.Builder(activity).a(activity.getString(R.string.IDS_hw_show_main_beta_dialog_title)).d(viewInflate).a(activity.getString(R.string.IDS_settings_firmware_upgrade_exit), new View.OnClickListener() { // from class: dcb.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction("com.huawei.commonui.CLEAN_ACTIVITY");
                LocalBroadcastManager.getInstance().sendBroadcast(intent);
            }
        }).c(activity.getString(R.string.IDS_beta_continue_use), new View.OnClickListener() { // from class: dcb.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                String strD = HiDateUtil.d("yyyyMMdd");
                SharedPreferenceManager.e(activity, Integer.toString(PrebakedEffectId.RT_ASSAULT_RIFLE), strD, strD, new StorageParams());
                handler.sendEmptyMessage(MainActivityHandlerMsg.AFTER_LAUNCH_CHECK);
            }
        }).d();
        customViewDialogD.setCancelable(false);
        customViewDialogD.show();
    }
}
