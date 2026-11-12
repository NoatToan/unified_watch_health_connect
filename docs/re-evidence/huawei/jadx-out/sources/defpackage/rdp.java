package defpackage;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.ScanFilter;
import android.companion.AssociationInfo;
import android.companion.AssociationRequest;
import android.companion.BluetoothDeviceFilter;
import android.companion.BluetoothLeDeviceFilter;
import android.companion.CompanionDeviceManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.amap.api.services.geocoder.GeocodeSearch;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.huawei.browse.BrowsingBiEvent;
import com.huawei.haf.bundle.AppBundle;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.hms.hwid.f$$ExternalSyntheticApiModelOutline0;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.LifeBaseResponseCallback;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.h5pro.H5proUtil;
import com.huawei.operation.h5pro.jsmodules.device.MatterDataContans;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.edittext.HealthEditText;
import com.huawei.ui.device.R;
import com.huawei.ui.device.activity.adddevice.DeviceAutoSwitchActivity;
import com.huawei.ui.device.activity.adddevice.OneKeyScanActivity;
import com.huawei.ui.main.stories.keepalive.KeepAliveActivity;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.util.LogUtil;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class rdp {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f47192b = System.lineSeparator();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<String, Boolean> f47193c = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private NoTitleCustomAlertDialog f47194a;

    public static boolean b(Context context) {
        if (context == null) {
            LogUtil.d("DevicePairingPageUtils", "isSupportBluetooth, context is null");
            return false;
        }
        if ((context.getSystemService("bluetooth") instanceof BluetoothManager ? (BluetoothManager) context.getSystemService("bluetooth") : null) != null) {
            return true;
        }
        LogUtil.d("DevicePairingPageUtils", "no BT Manager in this phone");
        return false;
    }

    public static boolean d(Context context) {
        if (context == null) {
            LogUtil.d("DevicePairingPageUtils", "isSwitchPage, context is null");
            return false;
        }
        if (!CommonUtil.ap()) {
            return true;
        }
        String strE = SharedPreferenceManager.e(context, String.valueOf(10008), "key_device_pair_switch_ui");
        if (TextUtils.isEmpty(strE)) {
            return true;
        }
        return Boolean.parseBoolean(strE);
    }

    public static void a(String str, Context context, int i) {
        d(str, context, i, null);
    }

    public static void d(String str, Context context, int i, View.OnClickListener onClickListener) {
        ReleaseLogUtil.d("R_DevicePairingPageUtils", "choose mac is :", CommonUtil.n(str), ", bluetoothType is:", Integer.valueOf(i));
        if (!BluetoothAdapter.checkBluetoothAddress(str)) {
            ReleaseLogUtil.e("R_DevicePairingPageUtils", "mac is invalid." + str);
            return;
        }
        if (!(context instanceof Activity)) {
            LogUtil.a("DevicePairingPageUtils", "context is not instanceof activity" + str);
        } else {
            if (Build.VERSION.SDK_INT >= 31) {
                Activity activity = (Activity) context;
                AssociationRequest.Builder singleDevice = new AssociationRequest.Builder().addDeviceFilter(new BluetoothLeDeviceFilter.Builder().setScanFilter(new ScanFilter.Builder().setDeviceAddress(str).build()).build()).addDeviceFilter(new BluetoothDeviceFilter.Builder().setAddress(str).build()).setSingleDevice(true);
                if (Build.VERSION.SDK_INT >= 35) {
                    singleDevice.setDeviceProfile("android.app.role.COMPANION_DEVICE_WATCH");
                }
                b(singleDevice.build(), (CompanionDeviceManager) activity.getSystemService(CompanionDeviceManager.class), str, activity, onClickListener);
                return;
            }
            LogUtil.a("DevicePairingPageUtils", "SDK version is earlier than 35");
        }
    }

    private static void b(AssociationRequest associationRequest, CompanionDeviceManager companionDeviceManager, String str, final Activity activity, View.OnClickListener onClickListener) {
        ReleaseLogUtil.d("R_DevicePairingPageUtils", "startPair enter, mac: ", CommonUtil.n(str));
        companionDeviceManager.associate(associationRequest, new CompanionDeviceManager.Callback() { // from class: rdp.5
            @Override // android.companion.CompanionDeviceManager.Callback
            public void onDeviceFound(IntentSender intentSender) {
                try {
                    if (activity.isFinishing()) {
                        ReleaseLogUtil.d("DevicePairingPageUtils", "activity isFinishing. ");
                        return;
                    }
                    try {
                        activity.startIntentSenderForResult(intentSender, 608, null, 0, 0, 0);
                    } catch (IntentSender.SendIntentException unused) {
                        ReleaseLogUtil.a("R_DevicePairingPageUtils", "Failed to send intent");
                    }
                } catch (ActivityNotFoundException | IllegalStateException e) {
                    ReleaseLogUtil.a("R_DevicePairingPageUtils", "find device is error,exception is:", ExceptionUtils.c(e));
                }
            }

            @Override // android.companion.CompanionDeviceManager.Callback
            public void onFailure(CharSequence charSequence) {
                LogUtil.d("DevicePairingPageUtils", "find device error: ", charSequence);
            }
        }, (Handler) null);
    }

    public static boolean b(Fragment fragment) {
        if (fragment == null) {
            LogUtil.d("DevicePairingPageUtils", "startIntent, context is null");
            return false;
        }
        a((ComponentActivity) fragment.getActivity());
        return true;
    }

    public static boolean a(final ComponentActivity componentActivity) {
        if (componentActivity == null) {
            LogUtil.d("DevicePairingPageUtils", "startIntent, context is null");
            return false;
        }
        BrowsingBiEvent browsingBiEvent = LoginInit.getBrowsingBiEvent();
        if (SharedPreferenceManager.b(Integer.toString(PrebakedEffectId.RT_FLY), "is_base_service_model", false)) {
            if (browsingBiEvent != null) {
                browsingBiEvent.showFullServiceDialog(componentActivity);
            }
            return false;
        }
        if (!b((Context) componentActivity)) {
            e((Activity) componentActivity);
            return false;
        }
        e(new LifeBaseResponseCallback(componentActivity, new IBaseResponseCallback() { // from class: rdv
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                rdp.b(componentActivity, i, obj);
            }
        }));
        return true;
    }

    static /* synthetic */ void b(ComponentActivity componentActivity, int i, Object obj) {
        if (i == 0) {
            c((Context) componentActivity);
        } else {
            ReleaseLogUtil.d("R_DevicePairingPageUtils", "startIntent checkLogin errorCode:", Integer.valueOf(i));
        }
    }

    private static void e(IBaseResponseCallback iBaseResponseCallback) {
        if (!Utils.h()) {
            iBaseResponseCallback.a(0, "");
        } else if (!LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode()) {
            iBaseResponseCallback.a(0, "");
        } else {
            LoginInit.getInstance(BaseApplication.getContext()).browsingToLoginForBaseService(iBaseResponseCallback, "");
        }
    }

    public static void e(Activity activity) {
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(activity).b(R.string.IDS_pad_cannot_be_added).c(R.string.IDS_ota_update_know, new View.OnClickListener() { // from class: rdp.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("DevicePairingPageUtils", "Bluetooth not supported");
            }
        }).c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    public static void b(final Activity activity) {
        activity.runOnUiThread(new Runnable() { // from class: rdp.2
            @Override // java.lang.Runnable
            public void run() {
                NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(activity).b(R.string.IDS_pad_cannot_be_added).c(R.string.IDS_ota_update_know, new View.OnClickListener() { // from class: rdp.2.5
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        LogUtil.a("DevicePairingPageUtils", "QrCode Bluetooth not supported");
                        activity.finish();
                    }
                }).c();
                noTitleCustomAlertDialogC.setCancelable(false);
                noTitleCustomAlertDialogC.show();
            }
        });
    }

    public static void c(Context context) {
        if (context == null) {
            LogUtil.d("DevicePairingPageUtils", "startOneKeyActivity, context is null");
            return;
        }
        try {
            context.startActivity(new Intent(context, (Class<?>) OneKeyScanActivity.class));
        } catch (ActivityNotFoundException e) {
            LogUtil.c("DevicePairingPageUtils", "ActivityNotFoundException e:", e.getMessage());
        }
    }

    public static void a(Context context) {
        iov.d(context, new Intent(context, (Class<?>) DeviceAutoSwitchActivity.class));
    }

    public static boolean e(Context context) {
        if (context == null) {
            LogUtil.d("DevicePairingPageUtils", "checkGpsPermission, context is null");
            return false;
        }
        PermissionUtil.PermissionType permissionType = PermissionUtil.PermissionType.LOCATION;
        if (Build.VERSION.SDK_INT > 30) {
            permissionType = PermissionUtil.PermissionType.SCAN;
        }
        return PermissionUtil.e(context, permissionType) == PermissionUtil.PermissionResult.GRANTED;
    }

    public static List<DeviceInfo> e(int i) {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "DevicePairingPageUtils");
        ArrayList arrayList = new ArrayList();
        if (njy.e(deviceList)) {
            return arrayList;
        }
        for (DeviceInfo deviceInfo : deviceList) {
            if (deviceInfo != null && deviceInfo.getProductType() == i) {
                arrayList.add(deviceInfo);
            }
        }
        LogUtil.a("DevicePairingPageUtils", "getListByDeviceType matterDevices.size: ", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    public void c(final Activity activity) {
        if (activity == null) {
            LogUtil.d("DevicePairingPageUtils", "createGpsServiceDialog, context is null");
            return;
        }
        if (activity.isFinishing()) {
            LogUtil.d("DevicePairingPageUtils", "createGpsServiceDialog, activity is finishing");
            return;
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.f47194a;
        if (noTitleCustomAlertDialog != null) {
            if (noTitleCustomAlertDialog.isShowing()) {
                this.f47194a.dismiss();
            }
            this.f47194a = null;
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(activity).b(R.string.IDS_open_location_service).a(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: rdp.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (rdp.this.f47194a != null) {
                    rdp.this.f47194a.dismiss();
                    rdp.this.f47194a = null;
                }
            }
        }).c(R.string.IDS_open_location_service_allow, new View.OnClickListener() { // from class: rdp.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (rdp.this.f47194a != null) {
                    rdp.this.f47194a.dismiss();
                    rdp.this.f47194a = null;
                }
                activity.startActivityForResult(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), 3);
            }
        }).c();
        this.f47194a = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setCancelable(false);
        this.f47194a.show();
    }

    public static void c(Activity activity, int i) {
        if (activity == null) {
            LogUtil.d("DevicePairingPageUtils", "startAppSettingActivity, context is null");
            return;
        }
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", activity.getPackageName(), null));
        activity.startActivityForResult(intent, i);
    }

    public static SpannableString b(int i, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.d("DevicePairingPageUtils", "deviceText or searchKey is empty");
            return new SpannableString("");
        }
        String strReplaceAll = str2.toLowerCase(Locale.ENGLISH).replaceAll("\\s*", "");
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        int length = lowerCase.length();
        SpannableString spannableString = new SpannableString(str);
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (i3 > length) {
                break;
            }
            String strSubstring = lowerCase.substring(i2, i3);
            if (!TextUtils.isEmpty(strSubstring) && strReplaceAll.contains(strSubstring)) {
                spannableString.setSpan(new ForegroundColorSpan(i), i2, i3, 33);
            }
            i2 = i3;
        }
        return spannableString;
    }

    public static int c(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        int iB = lvi.b(str);
        edn ednVarC = lvi.c(str, false);
        return (iB != -1 || ednVarC == null) ? iB : ednVarC.l();
    }

    public static SpannableStringBuilder a(String str, Context context) {
        if (TextUtils.isEmpty(str) || context == null) {
            LogUtil.d("DevicePairingPageUtils", "getDevicePairGuide uuid or context is null");
            return null;
        }
        int iC = c(str);
        if (iC == 7) {
            return n(context);
        }
        if (iC == 14) {
            return k(context);
        }
        if (iC == 16) {
            return f(context);
        }
        if (iC == 20) {
            return h(context);
        }
        if (iC == 21) {
            return g(context);
        }
        if (iC == 34) {
            return j(context);
        }
        if (iC == 35) {
            return i(context);
        }
        LogUtil.d("DevicePairingPageUtils", "other deviceType");
        return null;
    }

    private static SpannableStringBuilder n(Context context) {
        Locale locale = Locale.ENGLISH;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) (String.format(locale, context.getResources().getString(R.string.IDS_device_pair_guide_step), 1) + " "));
        StringBuilder sb = new StringBuilder();
        sb.append(context.getResources().getString(R.string.IDS_device_pair_guide_b3_tip1_ex));
        String str = f47192b;
        sb.append(str);
        spannableStringBuilder.append((CharSequence) sb.toString());
        spannableStringBuilder.append((CharSequence) (String.format(locale, context.getResources().getString(R.string.IDS_device_pair_guide_step), 2) + " "));
        spannableStringBuilder.append((CharSequence) (context.getResources().getString(R.string.IDS_device_pair_guide_b3_tip2_ex) + str).replace("%1$s", "%2$s"));
        spannableStringBuilder.append((CharSequence) (String.format(locale, context.getResources().getString(R.string.IDS_device_pair_guide_step), 3) + " "));
        spannableStringBuilder.append((CharSequence) context.getResources().getString(R.string.IDS_device_pair_guide_b3_tip3));
        String string = spannableStringBuilder.toString();
        int iIndexOf = string.indexOf("%1$s");
        if (iIndexOf > 0) {
            Drawable drawable = context.getResources().getDrawable(R.drawable.img_pairing_more_new);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            spannableStringBuilder.setSpan(new ImageSpan(drawable, 1), iIndexOf, iIndexOf + 4, 33);
        }
        int iIndexOf2 = string.indexOf("%2$s");
        if (iIndexOf2 > 0) {
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.img_bluetooth_new);
            drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
            spannableStringBuilder.setSpan(new ImageSpan(drawable2, 1), iIndexOf2, iIndexOf2 + 4, 33);
        }
        return spannableStringBuilder;
    }

    private static SpannableStringBuilder k(Context context) {
        Locale locale = Locale.ENGLISH;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str = String.format(locale, context.getResources().getString(R.string.IDS_device_pair_guide_step), 1) + " ";
        StringBuilder sb = new StringBuilder();
        sb.append(context.getResources().getString(R.string.IDS_select_device_connect_grus_change_tip_1));
        String str2 = f47192b;
        sb.append(str2);
        String string = sb.toString();
        String str3 = String.format(locale, context.getResources().getString(R.string.IDS_device_pair_guide_step), 2) + " ";
        String str4 = context.getResources().getString(R.string.IDS_select_device_connect_grus_change_tip_2) + str2;
        String str5 = String.format(locale, context.getResources().getString(R.string.IDS_device_pair_guide_step), 3) + " ";
        String string2 = context.getResources().getString(R.string.IDS_device_pair_guide_b3_tip3);
        spannableStringBuilder.append((CharSequence) str);
        spannableStringBuilder.append((CharSequence) string);
        spannableStringBuilder.append((CharSequence) str3);
        spannableStringBuilder.append((CharSequence) str4);
        spannableStringBuilder.append((CharSequence) str5);
        spannableStringBuilder.append((CharSequence) string2);
        return spannableStringBuilder;
    }

    private static SpannableStringBuilder j(Context context) {
        Locale locale = Locale.ENGLISH;
        StringBuilder sb = new StringBuilder();
        sb.append(context.getResources().getString(R.string.IDS_device_janus_pair_guide_tip_b5_first));
        String str = f47192b;
        sb.append(str);
        String string = sb.toString();
        String str2 = String.format(locale, context.getResources().getString(R.string.IDS_device_latona_pair_guide_01), context.getResources().getString(R.string.IDS_device_start_paring_title).toUpperCase(locale)) + str + str;
        String str3 = context.getResources().getString(R.string.IDS_device_janus_pair_guide_tip_b5_again) + str;
        String str4 = String.format(locale, context.getResources().getString(R.string.IDS_device_pair_guide_step), 1) + " ";
        String str5 = context.getResources().getString(R.string.IDS_device_latona_pair_guide_tip1_new) + str;
        String str6 = String.format(locale, context.getResources().getString(R.string.IDS_device_pair_guide_step), 2) + " ";
        String str7 = String.format(locale, context.getResources().getString(R.string.IDS_device_latona_pair_guide_tip3), context.getString(R.string.IDS_device_start_paring_title).toUpperCase(locale));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        spannableStringBuilder.append((CharSequence) str2);
        spannableStringBuilder.append((CharSequence) str3);
        spannableStringBuilder.append((CharSequence) str4);
        spannableStringBuilder.append((CharSequence) str5);
        spannableStringBuilder.append((CharSequence) str6);
        spannableStringBuilder.append((CharSequence) str7);
        return spannableStringBuilder;
    }

    private static SpannableStringBuilder g(Context context) {
        Locale locale = Locale.ENGLISH;
        StringBuilder sb = new StringBuilder();
        sb.append(context.getResources().getString(R.string.IDS_device_janus_pair_guide_tip_b5_first));
        String str = f47192b;
        sb.append(str);
        String string = sb.toString();
        String str2 = String.format(locale, context.getResources().getString(R.string.IDS_device_latona_pair_guide_01), context.getResources().getString(R.string.IDS_device_start_paring_title).toUpperCase(locale)) + str + str;
        String str3 = context.getResources().getString(R.string.IDS_device_janus_pair_guide_tip_b5_again) + str;
        String str4 = String.format(locale, context.getResources().getString(R.string.IDS_device_pair_guide_step), 1) + " ";
        String str5 = context.getResources().getString(R.string.IDS_device_fortuna_pair_guide_tip1) + str;
        String str6 = String.format(locale, context.getResources().getString(R.string.IDS_device_pair_guide_step), 2) + " ";
        String str7 = String.format(locale, context.getResources().getString(R.string.IDS_device_latona_pair_guide_tip3), context.getString(R.string.IDS_device_start_paring_title).toUpperCase(locale));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        spannableStringBuilder.append((CharSequence) str2);
        spannableStringBuilder.append((CharSequence) str3);
        spannableStringBuilder.append((CharSequence) str4);
        spannableStringBuilder.append((CharSequence) str5);
        spannableStringBuilder.append((CharSequence) str6);
        spannableStringBuilder.append((CharSequence) str7);
        return spannableStringBuilder;
    }

    private static SpannableStringBuilder i(Context context) {
        Locale locale = Locale.ENGLISH;
        StringBuilder sb = new StringBuilder();
        sb.append(context.getResources().getString(R.string.IDS_device_janus_pair_guide_tip_b5_first));
        String str = f47192b;
        sb.append(str);
        String string = sb.toString();
        String str2 = String.format(locale, context.getResources().getString(R.string.IDS_device_latona_pair_guide_01), context.getResources().getString(R.string.IDS_device_start_paring_title).toUpperCase(locale)) + str + str;
        String str3 = context.getResources().getString(R.string.IDS_device_janus_pair_guide_tip_b5_again) + str;
        String str4 = String.format(locale, context.getResources().getString(R.string.IDS_device_pair_guide_step), 1) + " ";
        String str5 = context.getResources().getString(R.string.IDS_device_latona_pair_guide_tip1_new) + str;
        String str6 = String.format(locale, context.getResources().getString(R.string.IDS_device_pair_guide_step), 2) + " ";
        String str7 = String.format(locale, context.getResources().getString(R.string.IDS_device_latona_pair_guide_tip3), context.getString(R.string.IDS_device_start_paring_title).toUpperCase(locale));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        spannableStringBuilder.append((CharSequence) str2);
        spannableStringBuilder.append((CharSequence) str3);
        spannableStringBuilder.append((CharSequence) str4);
        spannableStringBuilder.append((CharSequence) str5);
        spannableStringBuilder.append((CharSequence) str6);
        spannableStringBuilder.append((CharSequence) str7);
        return spannableStringBuilder;
    }

    private static SpannableStringBuilder h(Context context) {
        Locale locale = Locale.ENGLISH;
        StringBuilder sb = new StringBuilder();
        sb.append(context.getResources().getString(R.string.IDS_device_janus_pair_guide_tip_b5_first));
        String str = f47192b;
        sb.append(str);
        String string = sb.toString();
        String str2 = String.format(locale, context.getResources().getString(R.string.IDS_device_latona_pair_guide_01), context.getResources().getString(R.string.IDS_device_start_paring_title).toUpperCase(locale)) + str + str;
        String str3 = context.getResources().getString(R.string.IDS_device_janus_pair_guide_tip_b5_again) + str;
        String str4 = String.format(locale, context.getResources().getString(R.string.IDS_device_pair_guide_step), 1) + " ";
        String str5 = context.getResources().getString(R.string.IDS_device_fortuna_pair_guide_tip1) + str;
        String str6 = String.format(locale, context.getResources().getString(R.string.IDS_device_pair_guide_step), 2) + " ";
        String str7 = String.format(locale, context.getResources().getString(R.string.IDS_device_latona_pair_guide_tip3), context.getString(R.string.IDS_device_start_paring_title).toUpperCase(locale));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        spannableStringBuilder.append((CharSequence) str2);
        spannableStringBuilder.append((CharSequence) str3);
        spannableStringBuilder.append((CharSequence) str4);
        spannableStringBuilder.append((CharSequence) str5);
        spannableStringBuilder.append((CharSequence) str6);
        spannableStringBuilder.append((CharSequence) str7);
        return spannableStringBuilder;
    }

    private static SpannableStringBuilder f(Context context) {
        Locale locale = Locale.ENGLISH;
        StringBuilder sb = new StringBuilder();
        sb.append(context.getResources().getString(R.string.IDS_device_janus_pair_guide_tip_b5_first));
        String str = f47192b;
        sb.append(str);
        String string = sb.toString();
        String str2 = String.format(locale, context.getResources().getString(R.string.IDS_device_latona_pair_guide_01), context.getResources().getString(R.string.IDS_device_start_paring_title).toUpperCase(locale)) + str + str;
        String str3 = context.getResources().getString(R.string.IDS_device_janus_pair_guide_tip_b5_again) + str;
        String str4 = String.format(locale, context.getResources().getString(R.string.IDS_device_pair_guide_step), 1) + " ";
        String str5 = context.getResources().getString(R.string.IDS_device_janus_pair_guide_tip1) + str;
        String str6 = String.format(locale, context.getResources().getString(R.string.IDS_device_pair_guide_step), 2) + " ";
        String str7 = String.format(locale, context.getResources().getString(R.string.IDS_device_latona_pair_guide_tip3), context.getString(R.string.IDS_device_start_paring_title).toUpperCase(locale));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        spannableStringBuilder.append((CharSequence) str2);
        spannableStringBuilder.append((CharSequence) str3);
        spannableStringBuilder.append((CharSequence) str4);
        spannableStringBuilder.append((CharSequence) str5);
        spannableStringBuilder.append((CharSequence) str6);
        spannableStringBuilder.append((CharSequence) str7);
        return spannableStringBuilder;
    }

    public static boolean a() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        return defaultAdapter == null || defaultAdapter.isEnabled();
    }

    public static boolean b() {
        if (!(com.huawei.haf.application.BaseApplication.b().getSystemService("location") instanceof LocationManager)) {
            LogUtil.d("DevicePairingPageUtils", "isGpsLocationEnable get Location Service fail");
            return false;
        }
        LocationManager locationManager = (LocationManager) com.huawei.haf.application.BaseApplication.b().getSystemService("location");
        boolean zIsProviderEnabled = locationManager.isProviderEnabled(GeocodeSearch.GPS);
        LogUtil.a("DevicePairingPageUtils", "isGPSLocationEnable：", Boolean.valueOf(zIsProviderEnabled));
        if (lmq.e() || lmq.c()) {
            return zIsProviderEnabled;
        }
        boolean zIsProviderEnabled2 = locationManager.isProviderEnabled("network");
        LogUtil.a("DevicePairingPageUtils", "isNetWorkLocationEnable：", Boolean.valueOf(zIsProviderEnabled2));
        return zIsProviderEnabled || zIsProviderEnabled2;
    }

    public static boolean d(int i) {
        LogUtil.a("DevicePairingPageUtils", "isFollowDeviceByType:", Integer.valueOf(i));
        if (eel.d(i)) {
            return false;
        }
        boolean zA = a(lvi.j(i));
        LogUtil.a("DevicePairingPageUtils", "isFollowDeviceByType result :", Boolean.valueOf(zA));
        return zA;
    }

    public static boolean a(String str) {
        boolean zEquals = false;
        if (TextUtils.isEmpty(str)) {
            LogUtil.d("DevicePairingPageUtils", "isFollowDeviceByUuid deviceUuid isEmpty");
            return false;
        }
        Map<String, Boolean> map = f47193c;
        Boolean bool = map.get(str);
        if (bool != null) {
            return bool.booleanValue();
        }
        LogUtil.a("DevicePairingPageUtils", "is plugin download uuid:", str);
        boolean zIsResourcesAvailable = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).isResourcesAvailable(str);
        LogUtil.a("DevicePairingPageUtils", "is plugin download isPluginAvailable:", Boolean.valueOf(zIsResourcesAvailable));
        if (zIsResourcesAvailable) {
            edl pluginInfoByUuid = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByUuid(str);
            LogUtil.a("DevicePairingPageUtils", "isFollowDeviceByUuid success update ui");
            if (pluginInfoByUuid == null || pluginInfoByUuid.i() == null) {
                LogUtil.d("DevicePairingPageUtils", "isFollowDeviceByUuid info or WearDeviceInfo is null");
                return false;
            }
            zEquals = "followed_relationship".equals(pluginInfoByUuid.i().bl());
            map.put(str, Boolean.valueOf(zEquals));
        }
        LogUtil.a("DevicePairingPageUtils", "isFollowDeviceByUuid result :", Boolean.valueOf(zEquals));
        return zEquals;
    }

    public static void d(final Context context, final String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            LogUtil.d("DevicePairingPageUtils", "gotoKeepAliveSetting, activity or cid is null");
            return;
        }
        Context contextB = com.huawei.haf.application.BaseApplication.b();
        final int iN = CommonUtil.n(contextB, LoginInit.getInstance(contextB).getAccountInfo(1009));
        if (iN == 1) {
            GRSManager.c(contextB).d("domainKlgMapDtlUrl", new GrsQueryCallback() { // from class: rdp.8
                @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
                public void onCallBackSuccess(String str2) {
                    rdp.b(context, iN, str2, str);
                }

                @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
                public void onCallBackFail(int i) {
                    LogUtil.d("DevicePairingPageUtils", "gotoKeepAlive, cn is fail");
                }
            });
        } else {
            GRSManager.c(contextB).d("helpCustomerUrl", new GrsQueryCallback() { // from class: rdp.9
                @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
                public void onCallBackSuccess(String str2) {
                    rdp.b(context, iN, str2, str);
                }

                @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
                public void onCallBackFail(int i) {
                    LogUtil.d("DevicePairingPageUtils", "gotoKeepAlive, oversea is fail");
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, int i, String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str)) {
            LogUtil.d("DevicePairingPageUtils", "getKeepAliveUrl, urlMain is ull");
            return;
        }
        if (i == 1) {
            if (LanguageUtil.f(com.huawei.haf.application.BaseApplication.b())) {
                str3 = str + nzz.a(str2);
            } else {
                str3 = str + String.format(Locale.ENGLISH, "/hwtips/protection_setup/%s/protection.html?cid=%s", "en-US", str2);
            }
            LogUtil.a("DevicePairingPageUtils", "keepAliveUrl cn: ", str3);
            b(context, str3);
            return;
        }
        String str4 = str + String.format(Locale.ENGLISH, "/handbook/SingleJumppage/protection_setup/en-US/index.html?lang=%s", CommonUtil.z());
        LogUtil.a("DevicePairingPageUtils", "keepAliveUrl oversea: ", str4);
        b(context, str4);
    }

    private static void b(final Context context, final String str) {
        if (context == null) {
            context = com.huawei.haf.application.BaseApplication.b();
        }
        HandlerExecutor.b(new Runnable() { // from class: rdx
            @Override // java.lang.Runnable
            public final void run() {
                rdp.b(str, context);
            }
        });
    }

    static /* synthetic */ void b(String str, Context context) {
        Intent intent = new Intent();
        intent.addFlags(268435456);
        intent.putExtra("keepAliveUrl", str);
        intent.putExtra("isDeviceJump", true);
        intent.setClass(context, KeepAliveActivity.class);
        iov.d(context, intent);
    }

    public static boolean c() {
        return (CommonUtil.ay() || CommonUtil.bd()) && AppBundle.c().isBundleModule("PluginHiAiEngine") && !AppBundle.d().getInstalledModules().contains("PluginHiAiEngine");
    }

    public static void e(String str) {
        DeviceInfo deviceInfoD = d(str);
        if (deviceInfoD == null || deviceInfoD.getDeviceConnectState() != 2) {
            ArrayList arrayList = new ArrayList(16);
            arrayList.add(str);
            rcv.a(com.huawei.haf.application.BaseApplication.b()).b((List<String>) arrayList, true);
        }
    }

    private static DeviceInfo d(String str) {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "DevicePairingPageUtils");
        if (njy.e(deviceList)) {
            return null;
        }
        for (DeviceInfo deviceInfo : deviceList) {
            if (deviceInfo != null && TextUtils.equals(str, deviceInfo.getDeviceIdentify())) {
                return deviceInfo;
            }
        }
        return null;
    }

    public static boolean a(Context context, int i) {
        if (!(context instanceof Activity)) {
            LogUtil.a("DevicePairingPageUtils", "context is not instanceof activity");
            return false;
        }
        if (CommonUtil.bg() || Build.VERSION.SDK_INT <= 31) {
            return false;
        }
        String strB = SharedPreferenceManager.b("SENSITIVE_PERMISSION_STATUS", "SENSITIVE_PERMISSION_STATUS", "");
        ReleaseLogUtil.d("R_DevicePairingPageUtils", "isNeedRequestNoticePermission sensitivePermissionStatus: ", strB);
        if (!TextUtils.isEmpty(strB)) {
            return false;
        }
        if (i != 1 && i != 3 && i != 2) {
            LogUtil.a("DevicePairingPageUtils", "bluetoothType is null ");
            return false;
        }
        if (Build.VERSION.SDK_INT < 35 || ContextCompat.checkSelfPermission((Activity) context, "android.permission.RECEIVE_SENSITIVE_NOTIFICATIONS") != 0) {
            return true;
        }
        LogUtil.a("DevicePairingPageUtils", "isHasPermission is :true.");
        return false;
    }

    private static boolean b(String str, Intent intent) {
        Objects.nonNull(intent);
        AssociationInfo associationInfoM = intent != null ? f$$ExternalSyntheticApiModelOutline0.m((Object) intent.getParcelableExtra("android.companion.extra.ASSOCIATION")) : null;
        Objects.isNull(associationInfoM);
        if (associationInfoM == null) {
            ReleaseLogUtil.a("R_DevicePairingPageUtils", "isUseNewDevicePresence associationInfo is null.");
            return false;
        }
        try {
            int id = associationInfoM.getId();
            LogUtil.a("DevicePairingPageUtils", "isUseNewDevicePresence enter. ", CommonUtil.n(str), ", associationId: ", Integer.valueOf(id));
            Object systemService = BaseApplication.getContext().getSystemService("companiondevice");
            if (systemService == null) {
                LogUtil.c("DevicePairingPageUtils", "CompanionDeviceManager service is not available");
                return false;
            }
            Class<?> cls = Class.forName("android.companion.ObservingDevicePresenceRequest");
            Class<?> cls2 = Class.forName("android.companion.ObservingDevicePresenceRequest$Builder");
            Object objNewInstance = cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
            Method method = cls2.getMethod("setAssociationId", Integer.TYPE);
            LogUtil.a("DevicePairingPageUtils", "devicePairingLauncher associationId: " + id);
            method.invoke(objNewInstance, Integer.valueOf(id));
            Class.forName("android.companion.CompanionDeviceManager").getMethod("startObservingDevicePresence", cls).invoke(systemService, cls2.getMethod(JsonPOJOBuilder.DEFAULT_BUILD_METHOD, new Class[0]).invoke(objNewInstance, new Object[0]));
            ReleaseLogUtil.d("R_DevicePairingPageUtils", "isUseNewDevicePresence end.");
            return true;
        } catch (ClassNotFoundException e) {
            LogUtil.c("DevicePairingPageUtils", "Class not found: " + e.getMessage());
            return false;
        } catch (NoSuchMethodException e2) {
            LogUtil.c("DevicePairingPageUtils", "Method not found: " + e2.getMessage());
            return false;
        } catch (Exception e3) {
            LogUtil.c("DevicePairingPageUtils", "Error starting device presence observation: " + e3.getMessage());
            return false;
        }
    }

    public static void d(String str, String str2, Intent intent) {
        ReleaseLogUtil.d("R_DevicePairingPageUtils", "startObservingDevicePresence enter. tag: ", str, ", mac: ", CommonUtil.n(str2), ", data: ", Boolean.valueOf(Objects.isNull(intent)));
        if (Build.VERSION.SDK_INT < 36) {
            a(str, str2);
        } else {
            if (b(str2, intent)) {
                return;
            }
            a(str, str2);
        }
    }

    private static void a(String str, String str2) {
        ReleaseLogUtil.d("R_DevicePairingPageUtils", "startObservingDevicePresenceUseMac enter. tag: ", str, ", mac: ", CommonUtil.n(str2));
        ((CompanionDeviceManager) BaseApplication.getContext().getSystemService("companiondevice")).startObservingDevicePresence(str2);
    }

    public static void e(final IBaseResponseCallback iBaseResponseCallback, Context context) {
        if (context == null) {
            return;
        }
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(context);
        builder.b(R.string.IDS_miss_sensitive_notification_content);
        builder.c(R.string.IDS_go_setting, new View.OnClickListener() { // from class: rdp.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IBaseResponseCallback iBaseResponseCallback2 = iBaseResponseCallback;
                if (iBaseResponseCallback2 != null) {
                    iBaseResponseCallback2.a(-1, null);
                }
            }
        });
        builder.a(R.string.IDS_hw_common_ui_dialog_cancel, new View.OnClickListener() { // from class: rdp.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IBaseResponseCallback iBaseResponseCallback2 = iBaseResponseCallback;
                if (iBaseResponseCallback2 != null) {
                    iBaseResponseCallback2.a(0, null);
                }
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    public static void c(final String str, final String str2, final Context context) {
        if (context == null) {
            LogUtil.a("DevicePairingPageUtils", "context is null");
            return;
        }
        final HealthEditText healthEditText = new HealthEditText(context);
        CustomAlertDialog customAlertDialogB = new CustomAlertDialog.Builder(context).d(R.string.IDS_pin_code).a(healthEditText).a(R.string.IDS_device_user_guide_cancel_btn, new DialogInterface.OnClickListener() { // from class: rdq
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).d(R.string.IDS_settings_button_ok, new DialogInterface.OnClickListener() { // from class: rdy
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                rdp.a(healthEditText, str2, str, context, dialogInterface, i);
            }
        }).b();
        customAlertDialogB.setCancelable(false);
        customAlertDialogB.show();
    }

    static /* synthetic */ void a(HealthEditText healthEditText, String str, String str2, Context context, DialogInterface dialogInterface, int i) {
        String string = healthEditText.getText().toString();
        H5proUtil.initH5pro();
        H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
        builder.addCustomizeArg(MatterDataContans.KEY_MAC_ADDRESS, str);
        builder.addCustomizeArg("pin", string);
        builder.addCustomizeArg(BleConstants.BLUETOOTH_NAME, str2);
        ddv.b().loadH5ProApp(context, "com.huawei.health.h5.matter", builder);
        if (context instanceof Activity) {
            ((Activity) context).finish();
        }
    }

    public static void d(final DeviceInfo deviceInfo, Context context, final IBaseResponseCallback iBaseResponseCallback) {
        CustomAlertDialog customAlertDialogB = new CustomAlertDialog.Builder(context).b(context.getString(R.string.multi_bind_matter_tip)).a(com.huawei.ui.commonui.R.string.cs_cancel, new DialogInterface.OnClickListener() { // from class: rdw
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                rdp.d(iBaseResponseCallback, dialogInterface, i);
            }
        }).d(R.string.IDS_contact_delete, new DialogInterface.OnClickListener() { // from class: rdu
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                rdp.a(deviceInfo, iBaseResponseCallback, dialogInterface, i);
            }
        }).b();
        customAlertDialogB.setCancelable(false);
        customAlertDialogB.show();
    }

    static /* synthetic */ void d(IBaseResponseCallback iBaseResponseCallback, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        iBaseResponseCallback.a(1, null);
    }

    static /* synthetic */ void a(DeviceInfo deviceInfo, IBaseResponseCallback iBaseResponseCallback, DialogInterface dialogInterface, int i) {
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(deviceInfo.getDeviceIdentify());
        ecu.d().unPair(arrayList, true);
        dialogInterface.dismiss();
        if (iBaseResponseCallback != null) {
            iBaseResponseCallback.a(0, null);
        }
    }
}
