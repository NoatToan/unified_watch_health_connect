package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.plugindevice.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import health.compact.a.CommonUtil;
import health.compact.a.CompileParameterUtil;
import health.compact.a.GRSManager;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class dxv {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f32492c = {"android.permission.ACCESS_COARSE_LOCATION"};

    public static boolean e(String str, List<ScanResult> list) {
        if (njy.e(list)) {
            return false;
        }
        Iterator<ScanResult> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().SSID.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(String str, List<WifiConfiguration> list) {
        if (njy.e(list)) {
            return false;
        }
        Iterator<WifiConfiguration> it = list.iterator();
        while (it.hasNext()) {
            if (ecs.c(it.next().SSID).equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean d(String str, List<ScanResult> list) {
        if (njy.e(list)) {
            return false;
        }
        Iterator<ScanResult> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().SSID.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean a() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null || !defaultAdapter.isEnabled()) {
            LogUtil.j("WifiInfoUtil", "bluetooth is disable");
            return false;
        }
        LogUtil.a("WifiInfoUtil", "bluetooth is currently enabled and ready for use");
        return true;
    }

    public static String b(String str, String str2) {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "hagrid_wifi_ssid" + str);
        if (!TextUtils.isEmpty(strE)) {
            return strE;
        }
        String strE2 = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "hagrid_wifi_ssid" + str2);
        return TextUtils.isEmpty(strE2) ? SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "hagrid_wifi_ssid") : strE2;
    }

    public static String c(boolean z) {
        String url;
        if (z) {
            url = GRSManager.c(dxw.d()).getUrl("hilinkDevicePrimaryCloudUrl");
        } else {
            url = GRSManager.c(dxw.d()).getUrl("hilinkDeviceStandbyCloudUrl");
        }
        if (!CommonUtil.ap()) {
            return url;
        }
        LogUtil.a("WifiInfoUtil", "hilink_json getDeviceCloudOtherUrl isPrimary is ", Boolean.valueOf(z), " and cloudDevoceUrl is ", url);
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1009);
        LogUtil.a("WifiInfoUtil", "getDeviceCloudOtherUrl currentUserSiteIdString is ", accountInfo);
        int i = 0;
        if (!TextUtils.isEmpty(accountInfo)) {
            try {
                i = Integer.parseInt(accountInfo);
            } catch (NumberFormatException unused) {
                LogUtil.e("WifiInfoUtil", "getDeviceCloudOtherUrl NumberFormatException");
            }
            LogUtil.a("WifiInfoUtil", "getDeviceCloudOtherUrl currentUserSiteId is ", Integer.valueOf(i));
        }
        LogUtil.d("WifiInfoUtil", "getDeviceCloudOtherUrl currentUserSiteId is:", Integer.valueOf(i));
        if (i == 5) {
            return CompileParameterUtil.b("GRAY_DEVICE_CLOUD_PRIMARY_URL_ASIA", "");
        }
        if (i == 7) {
            return CompileParameterUtil.b("GRAY_DEVICE_CLOUD_PRIMARY_URL_EU", "");
        }
        if (i == 8) {
            return CompileParameterUtil.b("GRAY_DEVICE_CLOUD_PRIMARY_URL_RU", "");
        }
        if (i == 1) {
            return CompileParameterUtil.b("GRAY_DEVICE_CLOUD_PRIMARY_URL_CN", "");
        }
        LogUtil.a("WifiInfoUtil", "do not hard code device cloud gray url for beta version for site id", Integer.valueOf(i));
        return CompileParameterUtil.b("GRAY_DEVICE_CLOUD_PRIMARY_URL_CN", "");
    }

    public static String b() {
        int i;
        String url = GRSManager.c(dxw.d()).getUrl("healthAPPToDeviceUrl");
        if (!CommonUtil.ap()) {
            return url;
        }
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1009);
        if (TextUtils.isEmpty(accountInfo)) {
            i = 0;
        } else {
            try {
                i = Integer.parseInt(accountInfo);
            } catch (NumberFormatException unused) {
                LogUtil.e("WifiInfoUtil", "getDeviceCloudUrl NumberFormatException");
                i = 0;
            }
        }
        LogUtil.a("WifiInfoUtil", "getDeviceCloudOtherUrl currentUserSiteId is ", Integer.valueOf(i));
        if (i == 5) {
            return CompileParameterUtil.b("GRAY_DEVICE_CLOUD_URL_ASIA", "");
        }
        if (i == 7) {
            return CompileParameterUtil.b("GRAY_DEVICE_CLOUD_URL_EU", "");
        }
        if (i == 8) {
            return CompileParameterUtil.b("GRAY_DEVICE_CLOUD_URL_RU", "");
        }
        LogUtil.a("WifiInfoUtil", "do not hard code device cloud gray url for beta version for site id", Integer.valueOf(i));
        return CompileParameterUtil.b("GRAY_DEVICE_CLOUD_URL_CN", "");
    }

    public static void c(View view, Context context, boolean z, boolean z2) {
        if (view == null) {
            LogUtil.j("WifiInfoUtil", "initAuthDialogContent, dialogView is null");
            return;
        }
        String string = context.getResources().getString(R.string.IDS_device_haige_user_permission_message, "");
        boolean z3 = z || z2;
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.dialog_text_alert_message);
        if (z3) {
            StringBuffer stringBuffer = new StringBuffer(16);
            if (z) {
                if (Utils.o()) {
                    stringBuffer.append(System.lineSeparator()).append(context.getResources().getString(R.string.IDS_health_item_oversea));
                } else {
                    stringBuffer.append(System.lineSeparator()).append(context.getResources().getString(R.string.IDS_device_haige_user_permission_message_health_item));
                }
            }
            if (z2) {
                stringBuffer.append(System.lineSeparator()).append(context.getResources().getString(R.string.IDS_device_wifi_user_permission_dialog_personal_infomation_message));
            }
            SpannableString spannableString = new SpannableString(context.getResources().getString(R.string.IDS_device_wifi_user_permission_dialog_message, context.getResources().getString(R.string.IDS_device_wifi_user_permission_dialog_params_message_new, stringBuffer)));
            qri.a(spannableString, stringBuffer.toString(), new AbsoluteSizeSpan(13, true));
            healthTextView.setText(spannableString);
            return;
        }
        healthTextView.setText(string);
    }
}
