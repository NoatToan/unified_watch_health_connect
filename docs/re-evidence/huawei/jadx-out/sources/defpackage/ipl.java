package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.media3.common.C;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.R;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.h5pro.H5ProClient;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.interactor.MainInteractors;
import com.huawei.health.messagecenter.api.MessageCenterApi;
import com.huawei.health.messagecenter.model.MessageConstant;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.model.ecgservice.EcgServiceActivationData;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.h5pro.H5proUtil;
import com.huawei.operation.h5pro.ble.BleJsInteractionCompact;
import com.huawei.pluginhealthzone.interactors.HealthZonePushReceiver;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.dialog.HealthButtonBarLayout;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.ipl;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class ipl {
    static /* synthetic */ void b(View view) {
    }

    static /* synthetic */ void e(View view) {
    }

    public static void e(Activity activity, Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("ecgBundle");
        if (activity == null || bundleExtra == null) {
            return;
        }
        LogUtil.a("Ecg_EcgUtils", "skip ecgPage from MainActivity");
        a(activity, bundleExtra);
        activity.finish();
    }

    public static void c(Activity activity, Intent intent) {
        if (activity == null || intent == null) {
            LogUtil.j("Ecg_EcgUtils", "jumpToMainActivity activity or intent is null");
            return;
        }
        int intExtra = intent.getIntExtra("ecgNotification", -1);
        if (intExtra == 1 || intExtra == 2) {
            LogUtil.a("Ecg_EcgUtils", "pullEcgQuick from EcgPushReceiver");
            if (intExtra == 1) {
                HashMap map = new HashMap(1);
                map.put("click", 1);
                lmf.d().c(BaseApplication.getContext(), AnalyticsValue.ECG_QUICK_APP_NOTIFICATION_RECODE_JUMP_11000314.value(), map, 0);
            }
            a(activity, intent);
            return;
        }
        LogUtil.j("Ecg_EcgUtils", "ecgNotification type is undefined");
    }

    private static void a(Activity activity, Intent intent) {
        String stringExtra = intent.getStringExtra("ecgPageType");
        boolean isLogined = LoginInit.getInstance(BaseApplication.getContext()).getIsLogined();
        if (!MainInteractors.e() || !isLogined) {
            LogUtil.a("Ecg_EcgUtils", "StartHealth to MainActivity");
            Intent launchIntentForPackage = activity.getPackageManager().getLaunchIntentForPackage(activity.getPackageName());
            if (launchIntentForPackage == null) {
                LogUtil.e("Ecg_EcgUtils", "launchIntentForPackage is null");
                activity.finish();
                return;
            }
            launchIntentForPackage.putExtra("pullEcgQuick", 1);
            launchIntentForPackage.putExtra("ecgPageType", stringExtra);
            if ("donate".equals(stringExtra)) {
                launchIntentForPackage.putExtra("donateId", intent.getStringExtra("donateId"));
            }
            launchIntentForPackage.putExtra("needLogin", !isLogined);
            activity.startActivity(launchIntentForPackage);
            if (intent.getIntExtra("ecgNotification", -1) == 1) {
                activity.finish();
                return;
            }
            return;
        }
        if ("ecgStrap".equals(stringExtra)) {
            H5proUtil.initH5pro();
            H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
            builder.addCustomizeJsModule(BleConstants.BLE_JSINTERACTION, BleJsInteractionCompact.class);
            builder.addCustomizeJsModule(BleConstants.BLE_HI_LINK, BleJsInteractionCompact.class);
            builder.showStatusBar();
            builder.setStatusBarTextBlack(true);
            H5ProClient.startH5MiniProgram(activity, "com.huawei.health.device.203358f2-9be7-4846-85dc-d22dbc53359e", builder.build());
            activity.finish();
            return;
        }
        prf.c(activity, intent.getStringExtra("donateId"), stringExtra);
    }

    public static void c(Activity activity, Uri uri) {
        if (activity == null) {
            LogUtil.j("Ecg_EcgUtils", "goToSkipEcgPageFromEcgQuick activity is null");
            return;
        }
        Bundle bundleD = d(uri);
        if (bundleD == null) {
            LogUtil.j("Ecg_EcgUtils", "parsesSchemeData failed");
            activity.finish();
            return;
        }
        boolean isLogined = LoginInit.getInstance(BaseApplication.getContext()).getIsLogined();
        if (!MainInteractors.e() || !isLogined) {
            LogUtil.j("Ecg_EcgUtils", "Huawei Health is not logged in or the process is killed");
            a(activity, bundleD, isLogined);
        } else {
            a(activity, bundleD);
        }
        activity.finish();
    }

    private static Bundle d(Uri uri) {
        try {
            Bundle bundle = new Bundle();
            String queryParameter = uri.getQueryParameter("ecgH5Page");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("ecgH5Page", queryParameter);
                bundle.putString("donateId", uri.getQueryParameter("donateId"));
                return bundle;
            }
            bundle.putString("ecgPage", uri.getQueryParameter("ecgPage"));
            bundle.putString("orderId", uri.getQueryParameter("orderId"));
            bundle.putString("startTime", uri.getQueryParameter("startTime"));
            bundle.putString("endTime", uri.getQueryParameter("endTime"));
            bundle.putString("deviceCode", uri.getQueryParameter("deviceCode"));
            bundle.putString("validationCode", uri.getQueryParameter("validationCode"));
            bundle.putString("toUrl", uri.getQueryParameter("toUrl"));
            bundle.putString("openId", uri.getQueryParameter("openId"));
            bundle.putString("sourcesUrl", uri.getQueryParameter("sourcesUrl"));
            bundle.putString("reportId", uri.getQueryParameter("reportId"));
            bundle.putString("hlwToken", uri.getQueryParameter("hlwToken"));
            bundle.putString("cardNumber", uri.getQueryParameter("cardNumber"));
            return bundle;
        } catch (IllegalArgumentException unused) {
            LogUtil.e("Ecg_EcgUtils", "getEcgData IllegalArgumentException,will finish");
            return null;
        }
    }

    private static String b(Bundle bundle, String str) {
        if (bundle == null) {
            LogUtil.e("Ecg_EcgUtils", "getStringFromBundle bundle is null,key:", str);
            return "";
        }
        if (bundle.containsKey(str)) {
            String string = bundle.getString(str);
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
            LogUtil.a("Ecg_EcgUtils", "getStringFromBundle isEmpty,key:", str);
            return "";
        }
        LogUtil.e("Ecg_EcgUtils", "getStringFromBundle not containsKey,key:", str);
        return "";
    }

    private static void a(Activity activity, Bundle bundle, boolean z) {
        LogUtil.a("Ecg_EcgUtils", "jump to mainActivity");
        Intent launchIntentForPackage = activity.getPackageManager().getLaunchIntentForPackage(activity.getPackageName());
        if (launchIntentForPackage == null) {
            LogUtil.j("Ecg_EcgUtils", "launchIntentForPackage is null");
            return;
        }
        launchIntentForPackage.putExtra("ecgBundle", bundle);
        launchIntentForPackage.putExtra("needLogin", !z);
        activity.startActivity(launchIntentForPackage);
    }

    private static void a(Activity activity, Bundle bundle) {
        String strB = b(bundle, "ecgH5Page");
        LogUtil.a("Ecg_EcgUtils", "ecgH5Page = ", strB);
        if ("donate".equals(strB)) {
            prf.b(activity, b(bundle, "donateId"), "donate");
        } else {
            e(activity, bundle);
        }
    }

    private static String b() {
        String strD = lon.c().d("ecg_helowin");
        if (!TextUtils.isEmpty(strD)) {
            return strD;
        }
        LogUtil.j("Ecg_EcgUtils", "ecgHelowinUrl is empty,will get it from XmlFile");
        return "";
    }

    private static void e(final Activity activity, final Bundle bundle) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: ipy
            @Override // java.lang.Runnable
            public final void run() {
                ipl.b(bundle, activity);
            }
        });
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:40:0x0091  */
    static /* synthetic */ void b(Bundle bundle, Activity activity) {
        String strB = b();
        if (TextUtils.isEmpty(strB)) {
        }
        String strB2 = b(bundle, "ecgPage");
        LogUtil.a("Ecg_EcgUtils", "ecgPage = ", strB2);
        String str = strB + "/hwhealth-h5/#/hw_authorized";
        strB2.hashCode();
        switch (strB2) {
            case "activite":
                c(activity, str, strB + "/hwhealth-h5/#/Carmiactivation", bundle);
                break;
            case "authorized":
                a(activity, strB, bundle);
                break;
            case "packagePayment":
                c(activity, str, strB + "/hwhealth-h5/#/financed", bundle);
                break;
            case "faq":
                c(activity, str, strB + "/hwhealth-h5/#/server", bundle);
                break;
            case "reportDetail":
                c(activity, str, strB + "/hwhealth-h5/#/hw_detail", bundle);
                break;
            case "historicalBillQuery":
                c(activity, str, strB + "/hwhealth-h5/#/hw_order", bundle);
                break;
            case "submitAlgorithmAnalysis":
                c(activity, str, strB + "/hwhealth-h5/#/export", bundle);
                break;
            case "reportList":
                c(activity, str, strB + "/hwhealth-h5/#/", bundle);
                break;
            default:
                LogUtil.j("Ecg_EcgUtils", "ecgPage is error:", strB2);
                break;
        }
    }

    private static void a(Activity activity, String str, Bundle bundle) {
        String str2 = str + "/hwhealth-h5/#/hw_authorized";
        String strB = b(bundle, "toUrl");
        if (strB != null && (strB.startsWith("hap://app/com.huawei.health.ecg.collection/") || strB.startsWith("hwfastapp://com.huawei.health.ecg.collection/"))) {
            c(activity, str2, strB, bundle);
        } else {
            LogUtil.j("Ecg_EcgUtils", "the toUrl is illegal");
            c(activity, str2, "", bundle);
        }
    }

    private static void c(final Activity activity, final String str, final String str2, final Bundle bundle) {
        activity.runOnUiThread(new Runnable() { // from class: ipq
            @Override // java.lang.Runnable
            public final void run() {
                ipl.d(str, bundle, str2, activity);
            }
        });
    }

    static /* synthetic */ void d(String str, Bundle bundle, String str2, Activity activity) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("Ecg_EcgUtils", "webUrl is null");
            return;
        }
        H5proUtil.initH5pro();
        H5ProLaunchOption h5ProLaunchOption = new H5ProLaunchOption();
        h5ProLaunchOption.addCustomizeArg("orderId", b(bundle, "orderId"));
        h5ProLaunchOption.addCustomizeArg("startTime", b(bundle, "startTime"));
        h5ProLaunchOption.addCustomizeArg("endTime", b(bundle, "endTime"));
        h5ProLaunchOption.addCustomizeArg("deviceCode", b(bundle, "deviceCode"));
        h5ProLaunchOption.addCustomizeArg("validationCode", b(bundle, "validationCode"));
        if (!TextUtils.isEmpty(str2)) {
            h5ProLaunchOption.addCustomizeArg("toUrl", str2);
        }
        h5ProLaunchOption.addCustomizeArg("openId", b(bundle, "openId"));
        h5ProLaunchOption.addCustomizeArg("sourcesUrl", b(bundle, "sourcesUrl"));
        h5ProLaunchOption.addCustomizeArg("reportId", b(bundle, "reportId"));
        h5ProLaunchOption.addCustomizeArg("hlwToken", b(bundle, "hlwToken"));
        h5ProLaunchOption.addCustomizeArg("cardNumber", b(bundle, "cardNumber"));
        H5ProClient.startH5LightApp(activity, str, h5ProLaunchOption);
    }

    public static void d(Activity activity, Intent intent) {
        if (e(intent) == 1) {
            LogUtil.a("Ecg_EcgUtils", "jump to HwSchemeBasicHealthActivity,pull ecgQuick");
            intent.putExtra("ecgNotification", 2);
            intent.setClassName(activity, "com.huawei.health.browseraction.HwSchemeBasicHealthActivity");
            activity.startActivity(intent);
        }
    }

    public static void b(Activity activity, Intent intent) {
        if (c(intent) == null || intent == null) {
            return;
        }
        LogUtil.a("Ecg_EcgUtils", "jump to HwSchemeBasicHealthActivity");
        intent.setClassName(activity, "com.huawei.health.browseraction.HwSchemeBasicHealthActivity");
        activity.startActivity(intent);
    }

    public static Bundle c(Intent intent) {
        if (intent == null) {
            LogUtil.j("Ecg_EcgUtils", "getEcgBundle intent is null");
            return null;
        }
        return intent.getBundleExtra("ecgBundle");
    }

    public static int e(Intent intent) {
        if (intent == null) {
            LogUtil.j("Ecg_EcgUtils", "getPullEcgQuick intent is null");
            return -1;
        }
        return intent.getIntExtra("pullEcgQuick", -1);
    }

    public static void a(final Context context) {
        View viewInflate = View.inflate(context, R.layout.reminder_with_checkbox_dialog, null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.reminder_context);
        ((HealthCheckBox) viewInflate.findViewById(R.id.no_more_reminder_checkbox)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.health.utils.EcgUtils$$ExternalSyntheticLambda2
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                SharedPreferenceManager.e(context, Integer.toString(10000), "last_time_show_activate_ecg_dialog", String.valueOf(z ? -1L : System.currentTimeMillis()), null);
            }
        });
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(context);
        final String str = efe.a() ? "com.huawei.health.ecg.collection" : "com.huawei.health.h5.ecgce";
        if ("com.huawei.health.ecg.collection".equals(str)) {
            textView.setText(R.string.IDS_activate_ecg_reminder);
        } else {
            textView.setText(R.string.IDS_activate_ecgce_reminder);
        }
        builder.b(R.string.IDS_device_replace_dialog_title_notification).d(viewInflate).c(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: ipp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ipl.b(view);
            }
        }).d(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: ips
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                prf.d(BaseApplication.getContext(), str, 7, (String) null);
            }
        });
        CustomViewDialog customViewDialogD = builder.d();
        customViewDialogD.setCancelable(false);
        customViewDialogD.show();
        SharedPreferenceManager.e(context, Integer.toString(10000), "last_time_show_activate_ecg_dialog", String.valueOf(System.currentTimeMillis()), null);
    }

    public static void e(final Context context) {
        View viewInflate = View.inflate(context, R.layout.dialog_first_ecg_service_tip, null);
        ((HealthTextView) out.b(viewInflate, com.huawei.ui.homewear21.R.id.ecg_collect_text)).setText(context.getResources().getString(com.huawei.ui.homewear21.R.string.IDS_ecg_service_tip_msg, "599"));
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(context);
        builder.d(viewInflate).c(R.string.IDS_hw_common_active_later, new View.OnClickListener() { // from class: com.huawei.health.utils.EcgUtils$$ExternalSyntheticLambda7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ipl.d(context, 3);
            }
        }).d(R.string.IDS_hw_common_ui_dialog_active, new View.OnClickListener() { // from class: com.huawei.health.utils.EcgUtils$$ExternalSyntheticLambda8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ipl.d(context, view);
            }
        });
        CustomViewDialog customViewDialogD = builder.d();
        HealthButton healthButton = (HealthButton) customViewDialogD.findViewById(R.id.dialog_btn_positive);
        healthButton.setTextColor(context.getResources().getColor(R.color.hwbutton_selector_text_emphasize_emui, null));
        healthButton.setBackgroundResource(R.drawable.button_background_emphasize);
        ((HealthButtonBarLayout) customViewDialogD.findViewById(R.id.button_bar)).setDividerDrawable(context.getResources().getDrawable(R.drawable.custom_dialog_divider_vertical_trusparent, null));
        customViewDialogD.setCancelable(false);
        customViewDialogD.show();
        SharedPreferenceManager.e(context, Integer.toString(1), "KEY_SHOW_ECG_SERVICE_ACTIVATION_TIP_FLAG", String.valueOf(System.currentTimeMillis()), null);
        d(context, 1);
    }

    public static /* synthetic */ void d(Context context, View view) {
        prf.d(BaseApplication.getContext(), "com.huawei.health.ecg.collection", 9, "interpretation");
        d(context, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Context context, int i) {
        HashMap map = new HashMap(3);
        map.put("click", 1);
        map.put("type", Integer.valueOf(i));
        map.put("dialogType", 0);
        map.put("position", 2);
        lmf.d().c(context, AnalyticsValue.ECG_DIALOG_SHOW_COUNT.value(), map, 0);
    }

    public static void d(final Context context, final Bundle bundle) {
        String string;
        int i;
        int i2;
        if (bundle == null) {
            LogUtil.j("Ecg_EcgUtils", "showGiftCardDialog bundle is null");
            return;
        }
        int i3 = bundle.getInt(HealthZonePushReceiver.DETAIL_TYPE);
        if (i3 == 301 || i3 == 305) {
            String string2 = bundle.getString("nickname");
            if (TextUtils.isEmpty(string2)) {
                string = context.getResources().getString(efe.a() ? R.string.IDS_ecg_card_dialog_default : R.string.IDS_ecg_ce_card_dialog_default);
            } else {
                string = context.getResources().getString(efe.a() ? R.string.IDS_ecg_get_card_dialog : R.string.IDS_ecg_ce_get_card_dialog, string2);
            }
            i = R.string.IDS_ecg_collect_later;
            i2 = R.string.IDS_ecg_collect_now;
        } else if (i3 == 302) {
            string = context.getResources().getString(R.string.IDS_ecg_card_to_be_presented);
            i = R.string.IDS_ecg_later;
            i2 = R.string.IDS_hw_health_show_healthdata_know_detail;
        } else if (i3 != 303) {
            LogUtil.j("Ecg_EcgUtils", "showGiftCardDialog detailType is invalid");
            return;
        } else {
            string = context.getResources().getString(R.string.IDS_ecg_card_presenting);
            i = R.string.IDS_ecg_later;
            i2 = R.string.IDS_hw_health_show_healthdata_know_detail;
        }
        View viewInflate = View.inflate(context, R.layout.dialog_first_ecg_service_tip, null);
        ((HealthTextView) viewInflate.findViewById(R.id.ecg_collect_text)).setText(string);
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(context);
        builder.d(viewInflate).c(i, new View.OnClickListener() { // from class: ipw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ipl.e(view);
            }
        }).d(i2, new View.OnClickListener() { // from class: ipv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ipl.b(context, bundle, view);
            }
        });
        CustomViewDialog customViewDialogD = builder.d();
        customViewDialogD.setCancelable(false);
        customViewDialogD.show();
        ((MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class)).setMessageRead(bundle.getString("msgId"));
    }

    static /* synthetic */ void b(Context context, Bundle bundle, View view) {
        if (context instanceof Activity) {
            prf.b((Activity) context, bundle.getString("donateId"), "donate");
        }
    }

    public static void d(boolean z, boolean z2, final Handler handler) {
        if (z) {
            LogUtil.a("Ecg_EcgUtils", "showActivateEcgDialog is Oversea version");
            return;
        }
        if (z2) {
            LogUtil.a("Ecg_EcgUtils", "showActivateEcgDialog isAccountOut");
        } else if (tfk.e()) {
            LogUtil.a("Ecg_EcgUtils", "showActivateEcgDialog isCloudDataSyncing");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: ipt
                @Override // java.lang.Runnable
                public final void run() {
                    ipl.a(handler);
                }
            });
        }
    }

    static /* synthetic */ void a(Handler handler) {
        if (b(handler)) {
            return;
        }
        DeviceInfo deviceInfoC = mgg.c("Ecg_EcgUtils");
        if (deviceInfoC == null || deviceInfoC.getDeviceConnectState() != 2) {
            LogUtil.a("Ecg_EcgUtils", "showActivateEcgDialog deviceInfo is null or deviceInfo != DEVICE_CONNECTED");
            return;
        }
        DeviceCapability deviceCapabilityC = eej.c();
        if (deviceCapabilityC == null || !deviceCapabilityC.isSupportEcgAuth()) {
            LogUtil.a("Ecg_EcgUtils", "showActivateEcgDialog device not support ecg");
        } else if (eey.d(deviceInfoC, 45)) {
            e(deviceInfoC, handler);
        } else {
            e(handler);
        }
    }

    private static void e(DeviceInfo deviceInfo, final Handler handler) {
        lvr.a().c(new IBaseResponseCallback() { // from class: ipr
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                ipl.a(handler, i, obj);
            }
        }, deviceInfo);
    }

    static /* synthetic */ void a(Handler handler, int i, Object obj) {
        if (!(obj instanceof EcgServiceActivationData)) {
            LogUtil.j("Ecg_EcgUtils", "showActivateEcgCardDialog getEcgIv object error.");
            return;
        }
        EcgServiceActivationData ecgServiceActivationData = (EcgServiceActivationData) obj;
        if (ecgServiceActivationData.getStatus() == 0 || (ecgServiceActivationData.getStatus() == 1 && ecgServiceActivationData.getProbationUser() == 0)) {
            LogUtil.a("Ecg_EcgUtils", "showActivateEcgCardDialog allowed");
            long jF = qrs.f(SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(1), "KEY_SHOW_ECG_SERVICE_ACTIVATION_TIP_FLAG"));
            if (jF < 0 || (System.currentTimeMillis() - jF) / 60000.0f < 1440.0f) {
                LogUtil.a("Ecg_EcgUtils", "showActivateEcgCardDialog in time range");
            } else if (handler != null) {
                handler.sendEmptyMessage(4021);
            }
        }
    }

    private static void e(Handler handler) {
        long jF = qrs.f(SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "last_time_show_activate_ecg_dialog"));
        if (jF < 0 || (System.currentTimeMillis() - jF) / 60000.0f < 10080.0f) {
            LogUtil.a("Ecg_EcgUtils", "showActivateEcgAccountDialog in time range");
        } else if (handler != null) {
            d(handler);
        }
    }

    private static void d(final Handler handler) {
        edc.e().registerDeviceSampleListener("hw.health.ecganalysis", new DataReceiveCallback() { // from class: ipl.3
            @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
            public void onDataReceived(int i, DeviceInfo deviceInfo, eec eecVar) {
                if (!(eecVar instanceof eef)) {
                    LogUtil.e("Ecg_EcgUtils", "Received a message with wrong format");
                    return;
                }
                List<eeg> configInfoList = ((eef) eecVar).getConfigInfoList();
                if (configInfoList == null || configInfoList.size() == 0) {
                    LogUtil.e("Ecg_EcgUtils", "Received a message are missing config info list");
                    return;
                }
                eeg eegVar = configInfoList.get(0);
                if (eegVar == null) {
                    LogUtil.e("Ecg_EcgUtils", "Received a message are missing config info");
                    return;
                }
                byte[] bArrE = eegVar.e();
                if (bArrE == null) {
                    LogUtil.e("Ecg_EcgUtils", "Received a message are missing byte data");
                    return;
                }
                if (bArrE[bArrE.length - 1] == 0) {
                    handler.sendEmptyMessage(4020);
                }
                edc.e().unRegisterDeviceSampleListener("hw.health.ecganalysis");
            }
        });
        eeg eegVar = new eeg();
        eegVar.b(900300006L);
        eegVar.b(2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(eegVar);
        eef eefVar = new eef();
        eefVar.setConfigInfoList(arrayList);
        eefVar.setSrcPkgName("hw.health.ecganalysis");
        eefVar.setWearPkgName("hw.watch.health.ecganalysis");
        eefVar.setCommandId(0);
        edc.e().sendSampleConfigCommand(ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "Ecg_EcgUtils"), eefVar, "Ecg_EcgUtils");
    }

    private static boolean b(Handler handler) {
        List<MessageObject> messages = ((MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class)).getMessages(String.valueOf(19), MessageConstant.ECG_MEDAL_TYPE);
        for (int i = 0; i < messages.size(); i++) {
            MessageObject messageObject = messages.get(i);
            if (messageObject != null && messageObject.getMsgFrom() != null && messageObject.getReadFlag() != 1) {
                String[] strArrSplit = messageObject.getMsgFrom().split(Constants.LINK);
                if (strArrSplit.length < 2) {
                    LogUtil.j("Ecg_EcgUtils", "msgFrom is invalid");
                } else {
                    int iA = qrs.a(strArrSplit[0]);
                    if ((iA == 301 || iA == 302 || iA == 303 || iA == 305) && handler != null) {
                        Bundle bundle = new Bundle();
                        bundle.putInt(HealthZonePushReceiver.DETAIL_TYPE, iA);
                        bundle.putString("donateId", strArrSplit[1]);
                        if (strArrSplit.length > 2) {
                            bundle.putString("nickname", strArrSplit[2]);
                        }
                        bundle.putString("msgId", messageObject.getMsgId());
                        Message messageObtainMessage = handler.obtainMessage(4025);
                        messageObtainMessage.setData(bundle);
                        handler.sendMessageDelayed(messageObtainMessage, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
                        return true;
                    }
                }
            }
        }
        LogUtil.a("Ecg_EcgUtils", "isShowGiftCardDialog messageObjects is null or have read");
        return false;
    }
}
