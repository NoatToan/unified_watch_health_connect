package com.xiaomi.smarthome.framework.plugin.rn.nativemodule;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Point;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.Uri;
import android.nfc.NfcAdapter;
import android.nfc.NfcManager;
import android.os.Build;
import android.os.RemoteException;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import androidx.core.content.FileProvider;
import com.example.statistics.export.OneTrackConstant;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.mi.health.uri_parser.links.UriMapKt;
import com.mibi.sdk.DeductConstants;
import com.miui.circulate.device.api.Constant;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import com.xiaomi.fitness.nfc.ui.IssuerActivity;
import com.xiaomi.smarthome.core.server.internal.globaldynamicsetting.GlobalDynamicSettingManager;
import com.xiaomi.smarthome.core.server.internal.plugin.util.ByteUtils;
import com.xiaomi.smarthome.device.api.DeviceStat;
import com.xiaomi.smarthome.frame.server_compact.ServerBean;
import com.xiaomi.smarthome.framework.plugin.rn.constants.RnApiErrorInfo;
import com.xiaomi.smarthome.framework.plugin.rn.core.api.IUIProvider;
import com.xiaomi.smarthome.framework.plugin.rn.fixbug.AndroidBug5497Workaround;
import com.xiaomi.smarthome.framework.plugin.rn.log.MRnLog;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTHostModuleCore;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.common.MRnCrossModuleConst;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.device.DeviceInfoHelper;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnNetReport;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MD5Util;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MIOTReadableMap;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import com.xiaomi.smarthome.framework.plugin.rn.utils.ModelUtil;
import com.xiaomi.smarthome.framework.plugin.rn.utils.PackageUtils;
import com.xiaomi.smarthome.framework.plugin.rn.utils.RnCallbackMapUtil;
import com.xiaomi.smarthome.framework.plugin.rn.utils.RnPluginLog;
import com.xiaomi.smarthome.framework.plugin.rn.utils.RnReadableMapUtil;
import com.xiaomi.smarthome.framework.plugin.rn.utils.SystemPropertiesUtils;
import com.xiaomi.smarthome.framework.plugin.rn.utils.ZipPluginFileUtils;
import com.xiaomi.smarthome.library.common.ApiHelper;
import com.xiaomi.smarthome.library.common.util.DisplayUtils;
import com.xiaomi.smarthome.library.commonapi.SystemApi;
import com.xiaomi.smarthome.library.file.FileUtil;
import com.xiaomi.smarthome.library.util.GlobalHandlerManager;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import com.xiaomi.smarthome.rn.core.bean.RnPluginDeviceInfo;
import com.xiaomi.smarthome.setting.ServerSetting;
import com.xiaomi.smarthome.shop.utils.ToastUtil;
import com.xiaomi.smarthome.utils.ScreenUtils;
import com.xiaomi.smarthome.utils.ViewUtils;
import defpackage.bg4;
import defpackage.bua;
import defpackage.ndj;
import defpackage.o4h;
import defpackage.ofl;
import defpackage.p4h;
import defpackage.pfl;
import defpackage.tc0;
import defpackage.ua1;
import java.io.File;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@ndj(name = MIOTHostModuleCore.NAME)
public class MIOTHostModuleCore extends MIOTBaseJavaModule implements ReactModuleWithSpec, IMIOTHost {
    public static final String NAME = "MIOTHost";
    private static final String TAG = "MIOTHostModuleCore";

    public MIOTHostModuleCore(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private boolean isSupportMiPay() {
        try {
            return getCurrentActivity() != null && getCurrentActivity().getPackageManager().getPackageInfo("com.miui.tsmclient", 0).versionCode >= 41;
        } catch (PackageManager.NameNotFoundException e) {
            RnPluginLog.e(e.toString());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$colorsToImageBase64$6(String str, String str2, String str3, String str4, String str5) throws Exception {
        byte[] bArrDecode = Base64.decode(str, 2);
        int iBytesToInt = MIOTUtils.bytesToInt(bArrDecode, 58);
        int iBytesToInt2 = MIOTUtils.bytesToInt(bArrDecode, 62);
        int color = Color.parseColor(str2);
        int color2 = Color.parseColor(str3);
        int color3 = Color.parseColor(str4);
        int i = iBytesToInt * iBytesToInt2;
        int[] iArr = new int[i];
        int i2 = 86;
        for (int i3 = 0; i3 < i; i3++) {
            byte b2 = bArrDecode[i2];
            if (b2 == -1) {
                iArr[i3] = color;
            } else if (b2 == 0) {
                iArr[i3] = color2;
            } else if (b2 == 1) {
                iArr[i3] = color3;
            }
            i2++;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(-1.0f, 1.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, iBytesToInt, iBytesToInt2, Bitmap.Config.ARGB_8888);
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, iBytesToInt, iBytesToInt2, matrix, true);
        String strBitmapToBase64 = MIOTUtils.bitmapToBase64(bitmapCreateBitmap2, 100);
        bitmapCreateBitmap.recycle();
        bitmapCreateBitmap2.recycle();
        return strBitmapToBase64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$colorsToImageBase64$7(Callback callback, String str) throws Exception {
        callback.invoke(Boolean.TRUE, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$colorsToImageBase64$8(Callback callback, Throwable th) throws Exception {
        MRnLog.e("MIOTHostModule", th.toString());
        callback.invoke(Boolean.FALSE, th.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$keepScreenNotLock$15(boolean z, Activity activity) {
        try {
            if (z) {
                activity.getWindow().addFlags(128);
            } else {
                activity.getWindow().clearFlags(128);
            }
        } catch (Exception e) {
            RnPluginLog.e(TAG, e.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openBleOtaDeviceUpgradePage$5(ReadableMap readableMap, DeviceStat deviceStat) {
        MIOTReadableMap mIOTReadableMap = new MIOTReadableMap(readableMap);
        int i = mIOTReadableMap.getInt("auth_type", -1);
        String string = mIOTReadableMap.getString("fake_dfu_name", null);
        String string2 = mIOTReadableMap.getString("fake_dfu_url", null);
        String string3 = mIOTReadableMap.getString("md5", null);
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            getUIProvider().goBleOtaDeviceUpdateActivity(currentActivity, i, string2, deviceStat.did, string, string3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openDeclarationWithConfig$4(ReadableMap readableMap, final DeviceStat deviceStat, Callback callback) {
        String strPrivacyHostReplace = privacyHostReplace(MIOTUtils.parseRequire(MIOTUtils.getArray(readableMap, "agreementURL")));
        String strPrivacyHostReplace2 = privacyHostReplace(MIOTUtils.parseRequire(MIOTUtils.getArray(readableMap, "privacyURL")));
        String strPrivacyHostReplace3 = privacyHostReplace(MIOTUtils.parseRequire(MIOTUtils.getArray(readableMap, "experiencePlanURL")));
        String strPrivacyHostReplace4 = privacyHostReplace(MIOTUtils.parseRequire(MIOTUtils.getArray(readableMap, "privacyURLForChildren")));
        String strPrivacyHostReplace5 = privacyHostReplace(MIOTUtils.parseRequire(MIOTUtils.getArray(readableMap, "privacyURLForWatch")));
        String string = MIOTUtils.getString(readableMap, "revokePrivacyContent");
        boolean z = MIOTUtils.getBoolean(readableMap, "hideAgreement");
        boolean z2 = MIOTUtils.getBoolean(readableMap, "hideUserExperiencePlan");
        if (z) {
            strPrivacyHostReplace = null;
        }
        String str = strPrivacyHostReplace;
        boolean z3 = TextUtils.isEmpty(strPrivacyHostReplace3) ? true : z2;
        Activity currentActivity = getCurrentActivity();
        RnPluginDeviceInfo pluginInfo = getPluginInfo();
        if (currentActivity == null || pluginInfo == null) {
            return;
        }
        getUIProvider().openDeclarationWithConfig(currentActivity, deviceStat, str, strPrivacyHostReplace2, strPrivacyHostReplace3, strPrivacyHostReplace4, strPrivacyHostReplace5, z, z3, 100, readableMap, pluginInfo.mProductId, string);
        RnCallbackHelper.getInstance().registerCallback(100, new RnCallbackHelper.ActivityResultParser() { // from class: com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTHostModuleCore.10
            @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.RnCallbackHelper.ActivityResultParser
            public void onActivityResult(int i, int i2, Intent intent) {
                if (-1 == i && intent != null && MRnCrossModuleConst.DeviceMoreActivity.ARGS_RESULT_REMOVE_LICENSE.equals(intent.getStringExtra("result_data"))) {
                    MIOTHostModuleCore.this.getEventProvider().sendLicenseRevokeEvent();
                    MIOTHostModuleCore.this.getRnPluginHostApiProvider().delDataWhileRevokeLicense(MIOTHostModuleCore.this.getPluginRecord(), deviceStat);
                    MIOTHostModuleCore.this.getRnPluginHostApiProvider().delDeviceNativeData(deviceStat.did);
                    if (MIOTHostModuleCore.this.getCurrentActivity() != null) {
                        MIOTHostModuleCore.this.getCurrentActivity().finish();
                    }
                }
            }
        });
        callback.invoke(Boolean.TRUE, "success...");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openRoomManagementPage$1(Activity activity, DeviceStat deviceStat) {
        getUIProvider().openRoomManagementPage(activity, deviceStat.did);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openSecuritySetting$2(Activity activity, DeviceStat deviceStat) {
        getUIProvider().openSecuritySetting(activity, deviceStat.did, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openShareDevicePage$0(Activity activity, DeviceStat deviceStat) {
        if (getCurrentActivity() != null) {
            getUIProvider().openShareDevicePage(activity, deviceStat.did);
        } else {
            RnPluginLog.e("current activity is null...");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$pointsScaleToImageBase64$12(int i, int i2, String str, int i3, String str2) throws Exception {
        RnPluginLog.i("width==" + i + "   height==" + i2 + "  colorsMap=" + str + "  scale=" + i3);
        JSONObject jSONObject = new JSONObject(str);
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, Integer.valueOf(Color.parseColor(jSONObject.getString(next))));
        }
        String[] strArrSplit = str2.split(",");
        int i4 = i * i3;
        int[] iArr = new int[i4 * i2 * i3];
        int i5 = i * i2;
        for (int i6 = 0; i6 < i5; i6++) {
            String str3 = strArrSplit[i6];
            Integer num = (Integer) map.get(str3);
            if (num == null) {
                RnPluginLog.e("colorKey=" + str3 + " is null");
                num = 0;
            }
            if (i3 == 1) {
                iArr[i6] = num.intValue();
            } else {
                int i7 = i6 / i;
                for (int i8 = 0; i8 < i3; i8++) {
                    int i9 = (i6 * i3) + ((i7 + i8) * i * i3);
                    for (int i10 = 0; i10 < i3; i10++) {
                        iArr[i9 + i10] = num.intValue();
                    }
                }
            }
        }
        Matrix matrix = new Matrix();
        matrix.setScale(1.0f, -1.0f);
        int i11 = i2 * i3;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, i4, i11, Bitmap.Config.ARGB_8888);
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, i4, i11, matrix, true);
        String strBitmapToBase64 = MIOTUtils.bitmapToBase64(bitmapCreateBitmap2, 100);
        bitmapCreateBitmap.recycle();
        bitmapCreateBitmap2.recycle();
        return strBitmapToBase64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$pointsScaleToImageBase64$13(Callback callback, String str) throws Exception {
        callback.invoke(Boolean.TRUE, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$pointsScaleToImageBase64$14(Callback callback, Throwable th) throws Exception {
        th.printStackTrace();
        callback.invoke(Boolean.FALSE, th.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$pointsToImageBase64$10(Callback callback, String str) throws Exception {
        callback.invoke(Boolean.TRUE, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$pointsToImageBase64$11(Callback callback, Throwable th) throws Exception {
        th.printStackTrace();
        callback.invoke(Boolean.FALSE, th.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$pointsToImageBase64$9(int i, int i2, String str, String str2) throws Exception {
        RnPluginLog.i("pointsToImageBase64:  width==" + i + "   height==" + i2);
        JSONObject jSONObject = new JSONObject(str);
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, Integer.valueOf(Color.parseColor(jSONObject.getString(next))));
        }
        String[] strArrSplit = str2.split(",");
        int i3 = i * i2;
        int[] iArr = new int[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            iArr[i4] = ((Integer) map.get(strArrSplit[i4])).intValue();
        }
        Matrix matrix = new Matrix();
        matrix.setScale(1.0f, -1.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, i, i2, Bitmap.Config.ARGB_8888);
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, i, i2, matrix, true);
        String strBitmapToBase64 = MIOTUtils.bitmapToBase64(bitmapCreateBitmap2, 100);
        bitmapCreateBitmap.recycle();
        bitmapCreateBitmap2.recycle();
        return strBitmapToBase64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showDeclarationWithConfig$3(ReadableMap readableMap, DeviceStat deviceStat, final Callback callback) {
        String strPrivacyHostReplace = privacyHostReplace(MIOTUtils.parseRequire(MIOTUtils.getArray(readableMap, "agreementURL")));
        String strPrivacyHostReplace2 = privacyHostReplace(MIOTUtils.parseRequire(MIOTUtils.getArray(readableMap, "privacyURL")));
        String strPrivacyHostReplace3 = privacyHostReplace(MIOTUtils.parseRequire(MIOTUtils.getArray(readableMap, "experiencePlanURL")));
        String strPrivacyHostReplace4 = privacyHostReplace(MIOTUtils.parseRequire(MIOTUtils.getArray(readableMap, "privacyURLForChildren")));
        String strPrivacyHostReplace5 = privacyHostReplace(MIOTUtils.parseRequire(MIOTUtils.getArray(readableMap, "privacyURLForWatch")));
        String string = MIOTUtils.getString(readableMap, "privacyChanges");
        boolean z = MIOTUtils.getBoolean(readableMap, "hideAgreement");
        boolean z2 = MIOTUtils.getBoolean(readableMap, "hideUserExperiencePlan");
        if (z) {
            strPrivacyHostReplace = null;
        }
        Intent intent = new Intent();
        if (z2) {
            intent.putExtra("enable_privacy_setting", false);
        } else {
            intent.putExtra("enable_privacy_setting", true);
            if (!TextUtils.isEmpty(strPrivacyHostReplace3)) {
                intent.putExtra(MRnCrossModuleConst.DeviceMoreActivity.ARGS_USR_EXP_PLAN_RN_URI, strPrivacyHostReplace3);
            }
        }
        if (!TextUtils.isEmpty(strPrivacyHostReplace4)) {
            intent.putExtra("privacy_for_children", strPrivacyHostReplace4);
        }
        if (!TextUtils.isEmpty(strPrivacyHostReplace5)) {
            intent.putExtra(MRnCrossModuleConst.UserLicenseDialog.ARGS_PRIVACY_FOR_WATCH, strPrivacyHostReplace5);
        }
        if (!TextUtils.isEmpty(string)) {
            intent.putExtra("privacy_content_changed", string);
        }
        intent.putExtra("is_rn_plugin", true);
        if (MIOTUtils.getBoolean(readableMap, "setPrivacyConfirmationInfo")) {
            String string2 = MIOTUtils.getString(readableMap, "privacyVersion");
            int i = MIOTUtils.getInt(readableMap, "privacyType");
            int i2 = MIOTUtils.getInt(readableMap, "privacyId");
            int i3 = MIOTUtils.getInt(readableMap, "popType");
            intent.putExtra("set_privacy_confirmation_Info", true);
            intent.putExtra("privacy_version", string2);
            intent.putExtra("client_id", 4);
            intent.putExtra("privacy_type", i);
            intent.putExtra("privacy_id", i2);
            intent.putExtra("pop_type", i3);
        }
        getUIProvider().showUserLicenseUriDialog(getCurrentActivity(), deviceStat, z, strPrivacyHostReplace, strPrivacyHostReplace2, new View.OnClickListener() { // from class: com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTHostModuleCore.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                callback.invoke(Boolean.TRUE);
            }
        }, intent);
    }

    private String privacyHostReplace(String str) {
        if (!TextUtils.isEmpty(str) && str.contains(UriMapKt.linkMijiaHost)) {
            ServerBean server = GlobalDynamicSettingManager.getInstance().getServer();
            if (server != null && "Staging".equalsIgnoreCase(server.name)) {
                return str.replace(UriMapKt.linkMijiaHost, "staging.home.mi.com");
            }
            String serverEnv = GlobalDynamicSettingManager.getInstance().getServerEnv();
            if (serverEnv.equalsIgnoreCase(ServerSetting.SERVER_ENV_PREVIEW)) {
                return str.replace(UriMapKt.linkMijiaHost, "preview.home.mi.com");
            }
            if (serverEnv.equalsIgnoreCase("at")) {
                return str.replace(UriMapKt.linkMijiaHost, "at.home.mi.com");
            }
            RnPluginLog.addFrameworkLog("replace privacy urls -> " + str);
        }
        return str;
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void bindProcessToNetwork(int i, Callback callback) {
        if (callback == null) {
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        if (reactApplicationContext == null) {
            RnPluginLog.e("rncamera ReactInstanceManager is null, can not show alarm videos");
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(RnApiErrorInfo.INVALID_ERROR, "null rn runtime"));
            return;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) reactApplicationContext.getSystemService(OneTrackConstant.EVENT_NAME_CONNECTIVITY);
        if (connectivityManager == null) {
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(RnApiErrorInfo.INVALID_ERROR, "null connectivityManager"));
            return;
        }
        if (!ApiHelper.IS_MARSHMALLOW) {
            callback.invoke(Boolean.TRUE, RnCallbackMapUtil.getCommonSuccessMap("ignored under os version 5.x"));
            return;
        }
        Network network = null;
        if (i == 2) {
            if (connectivityManager.bindProcessToNetwork(null)) {
                callback.invoke(Boolean.TRUE, RnCallbackMapUtil.getCommonSuccessMap("bind process to specific wifi success"));
                return;
            } else {
                callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(RnApiErrorInfo.INVALID_ERROR, "bind process to specific network failed"));
                return;
            }
        }
        Network[] allNetworks = connectivityManager.getAllNetworks();
        for (int i2 = 0; i2 < allNetworks.length; i2++) {
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(allNetworks[i2]);
            if (networkInfo != null) {
                if (networkInfo.getType() == (i == 0 ? 0 : 1)) {
                    network = allNetworks[i2];
                    break;
                }
            }
        }
        if (network == null) {
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(RnApiErrorInfo.INVALID_ERROR, "unable find specific type"));
        } else if (connectivityManager.bindProcessToNetwork(network)) {
            callback.invoke(Boolean.TRUE, RnCallbackMapUtil.getCommonSuccessMap("bind process to specific wifi success"));
        } else {
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(RnApiErrorInfo.INVALID_ERROR, "bind process to specific network failed"));
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void checkAbilityOfJumpToThirdpartyApplication(String str, Callback callback) {
        if (callback == null) {
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap("activity is null!"));
        } else {
            callback.invoke(Boolean.TRUE, RnCallbackMapUtil.getCommonSuccessMap(Boolean.valueOf(!currentActivity.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(str)), 0).isEmpty())));
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void checkAppIsExist(ReadableMap readableMap, Callback callback) {
        String string = MIOTUtils.getString(readableMap, PluginPackageConstant.RN_DIR_A);
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap("activity is null!"));
        } else {
            callback.invoke(Boolean.TRUE, RnCallbackMapUtil.getCommonSuccessMap(Boolean.valueOf(PackageUtils.isPackageInstalled(currentActivity, string))));
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void checkFirmwareAutoUpgradeOpen(ReadableMap readableMap, Callback callback) {
        onMethodNotImplamente(" checkFirmwareAutoUpgradeOpen(ReadableMap map, Callback callback) haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void checkPhoneLocationServerIsOpen(Callback callback) {
        if (callback == null) {
            return;
        }
        if (getCurrentActivity() == null) {
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap("current activity is null..."));
            return;
        }
        LocationManager locationManager = (LocationManager) getCurrentActivity().getSystemService("location");
        boolean z = locationManager.isProviderEnabled("gps") || locationManager.isProviderEnabled("network");
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putBoolean("locationServerIsOpen", z);
        callback.invoke(Boolean.TRUE, RnCallbackMapUtil.getCommonSuccessMap(0, writableMapCreateMap));
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void checkStoreSupportted(Callback callback) {
        onMethodNotImplamente(" checkStoreSupportted(Callback callback) haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void clearFreqCameraNeedShowRedPoint() {
        onMethodNotImplamente(" clearFreqCameraNeedShowRedPoint() haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void closeCurrentPage(ReadableMap readableMap) {
        getRnRuntimeProvider().closeCurrentPage(readableMap);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    @SuppressLint({"CheckResult"})
    public void colorsToImageBase64(final String str, final String str2, final String str3, final String str4, final Callback callback) {
        o4h.E(str).F(new bua() { // from class: txe
            @Override // defpackage.bua
            public final Object apply(Object obj) {
                return MIOTHostModuleCore.lambda$colorsToImageBase64$6(str, str2, str3, str4, (String) obj);
            }
        }).S(ofl.c()).H(ua1.c()).O(new bg4() { // from class: uxe
            @Override // defpackage.bg4
            public final void accept(Object obj) throws Exception {
                MIOTHostModuleCore.lambda$colorsToImageBase64$7(callback, (String) obj);
            }
        }, new bg4() { // from class: gxe
            @Override // defpackage.bg4
            public final void accept(Object obj) throws Exception {
                MIOTHostModuleCore.lambda$colorsToImageBase64$8(callback, (Throwable) obj);
            }
        });
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void connectWifiWithSSID(String str, Callback callback) {
        onMethodNotImplamente(" connectWifiWithSSID(String ssid, Callback callback) haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void convertCronToDate(ReadableMap readableMap, Callback callback) {
        onMethodNotImplamente(" convertCronToDate(ReadableMap params, Callback callback) haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void convertDateToCron(ReadableMap readableMap, Callback callback) {
        onMethodNotImplamente(" convertDateToCron(ReadableMap params, Callback callback) haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void createExecutor(String str, String str2, Callback callback) {
        getRnPluginHostApiProvider().createExecutor(getReactApplicationContext(), str, str2, callback);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void decodeBase64(String str, Callback callback) {
        try {
            Object[] objArr = new Object[2];
            objArr[0] = Boolean.TRUE;
            if (str == null) {
                str = "";
            }
            objArr[1] = new String(Base64.decode(str.getBytes(), 0));
            callback.invoke(objArr);
        } catch (Throwable th) {
            callback.invoke(Boolean.FALSE, Log.getStackTraceString(th));
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void encodeBase64(String str, Callback callback) {
        try {
            Object[] objArr = new Object[2];
            objArr[0] = Boolean.TRUE;
            if (str == null) {
                str = "";
            }
            objArr[1] = Base64.encodeToString(str.getBytes(), 0);
            callback.invoke(objArr);
        } catch (Throwable th) {
            callback.invoke(Boolean.FALSE, Log.getStackTraceString(th));
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void encodeMD5(String str, Callback callback) {
        try {
            callback.invoke(Boolean.TRUE, MD5Util.MD5_32(str));
        } catch (Throwable th) {
            callback.invoke(Boolean.FALSE, Log.getStackTraceString(th));
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void encodeSHA1(String str, Callback callback) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            Object[] objArr = new Object[2];
            objArr[0] = Boolean.TRUE;
            if (str == null) {
                str = "";
            }
            objArr[1] = ByteUtils.toHexString(messageDigest.digest(str.getBytes()));
            callback.invoke(objArr);
        } catch (Throwable th) {
            callback.invoke(Boolean.FALSE, Log.getStackTraceString(th));
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void encodeSHA2(String str, Callback callback) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(PluginPackageConstant.RN_BUNDLE_HASH_ALGORITHM);
            Object[] objArr = new Object[2];
            objArr[0] = Boolean.TRUE;
            if (str == null) {
                str = "";
            }
            objArr[1] = ByteUtils.toHexString(messageDigest.digest(str.getBytes()));
            callback.invoke(objArr);
        } catch (Throwable th) {
            callback.invoke(Boolean.FALSE, Log.getStackTraceString(th));
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void executeMethod(String str, String str2, String str3, Callback callback) {
        getRnPluginHostApiProvider().executeMethod(str, str2, str3, callback);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void generateECCCryptoObjectWithCurveType(int i, Callback callback) {
        onMethodNotImplamente(" generateECCCryptoObjectWithCurveType(int curveType, Callback callback) haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void getAppName(Callback callback) {
        String str;
        try {
            str = (String) getCurrentActivity().getApplicationContext().getPackageManager().getApplicationLabel(getCurrentActivity().getApplicationInfo());
        } catch (Exception e) {
            MRnLog.e(TAG, e.toString());
            str = "";
        }
        callback.invoke(str);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void getBtGateWaySubDeviceRSSIWithMac(String str, Callback callback) {
        onMethodNotImplamente(" getBtGateWaySubDeviceRSSIWithMac(String mac, Callback callback) haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void getConnectedWifi(Callback callback) {
        onMethodNotImplamente(" getConnectedWifi(Callback callback) haven't been impl");
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        String language;
        HashMap map = new HashMap();
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("mobileModel", Build.MODEL);
        writableMapCreateMap.putString("sysVersion", Build.VERSION.RELEASE);
        writableMapCreateMap.putInt("hostApiLevel", getRnPluginHostApiProvider().getSdkApiLevel());
        writableMapCreateMap.putBoolean("isXiaomiPhone", SystemApi.isXiaomiPhone());
        try {
            if (SystemApi.isMiui()) {
                writableMapCreateMap.putBoolean("isMiui", true);
                writableMapCreateMap.putString("miuiVersion", SystemPropertiesUtils.get("ro.miui.ui.version.name", ""));
            }
        } catch (Throwable unused) {
        }
        map.put("systemInfo", writableMapCreateMap);
        map.put("language", getRnRuntimeProvider().getLanguageStr());
        map.put("buildType", getRnRuntimeProvider().isReleaseBuildType() ? "release" : "debug");
        map.put("appVersion", SystemApi.getInstance().getAppVersion(getReactApplicationContext()));
        map.put("appVersionCode", Integer.valueOf(SystemApi.getInstance().getAppVersionCode(getReactApplicationContext())));
        map.put("timeZone", TimeZone.getDefault().getID());
        map.put("appConfigEnv", Integer.valueOf(getRnPluginHostApiProvider().getUsePreviewConfig()));
        map.put(DeductConstants.KEY_WX_BUSINESS_TYPE, getRnPluginHostApiProvider().getBusinessType());
        boolean zIs24HourFormat = DateFormat.is24HourFormat(getReactApplicationContext());
        MRnLog.i("MIOTHostModule", "is24: " + zIs24HourFormat);
        map.put("is24HourTime", Boolean.valueOf(zIs24HourFormat));
        map.put("displayCutoutTop", Integer.valueOf(ScreenUtils.getInsertTop(getCurrentActivity())));
        Locale locale = Locale.getDefault();
        if (locale != null) {
            String country = locale.getCountry();
            if (TextUtils.isEmpty(country)) {
                language = locale.getLanguage();
            } else {
                language = locale.getLanguage() + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + country;
            }
            map.put("systemLanguage", language);
        }
        map.put("isPad", Boolean.valueOf(getScreenInfoProvider().isPad()));
        map.put("mobileType", "phone");
        return map;
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void getCurrentTimeMillis(Callback callback) {
        callback.invoke(Double.valueOf(System.currentTimeMillis()));
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void getDevicesWithModel(String str, boolean z, Callback callback) {
        onMethodNotImplamente(" getDevicesWithModel(String model, boolean includeGroupedDevice, Callback callback) haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void getFreqCameraNeedShowRedPoint(Callback callback) {
        onMethodNotImplamente(" getFreqCameraNeedShowRedPoint(Callback callback) haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void getLocation(Callback callback) {
        onMethodNotImplamente(" getLocation(Callback callback) haven't been impl");
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void getNavigationBarHeight(Callback callback) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap("rn context is null"));
            return;
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("navigationBarHeight", ViewUtils.getNavigationBarHeight(currentActivity));
        callback.invoke(Boolean.TRUE, RnCallbackMapUtil.getCommonSuccessMap(writableMapCreateMap));
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void getPhoneScreenInfo(Callback callback) {
        if (callback != null) {
            WritableMap phoneScreenInfo = getPhoneScreenInfo();
            if (phoneScreenInfo != null) {
                callback.invoke(Boolean.TRUE, phoneScreenInfo);
            } else {
                callback.invoke(Boolean.FALSE, "current activity is not init...");
            }
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    public void getPhysicsDimension(Callback callback) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        if (windowManager == null) {
            callback.invoke(Boolean.FALSE, "can't get physics dimension...");
            return;
        }
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        writableMapCreateMap.putInt("width", DisplayUtils.px2dip(displayMetrics.widthPixels));
        writableMapCreateMap.putInt("height", DisplayUtils.px2dip(displayMetrics.heightPixels));
        writableMapCreateMap.putDouble("scale", displayMetrics.density);
        callback.invoke(Boolean.TRUE, writableMapCreateMap);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void getSystemTimeZoneOffset(Callback callback) {
        if (callback == null) {
            return;
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("timeZoneOffset", TimeZone.getDefault().getRawOffset());
        callback.invoke(Boolean.TRUE, RnCallbackMapUtil.getCommonSuccessMap(0, writableMapCreateMap));
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void getSystemTimezoneNameWithCallback(Callback callback) {
        if (callback == null) {
            return;
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("timeZone", TimeZone.getDefault().getID());
        callback.invoke(Boolean.TRUE, writableMapCreateMap);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void getUserConfigs(int i, ReadableArray readableArray, Callback callback) {
        onMethodNotImplamente(" getUserConfigs(int appId, ReadableArray array, Callback callback) haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void goCustomPlugin(ReadableMap readableMap) {
        onMethodNotImplamente(" goCustomPlugin(ReadableMap params) haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void ijaiBeautifyMap(String str, ReadableArray readableArray, ReadableMap readableMap, Callback callback) {
        onMethodNotImplamente(" ijaiBeautifyMap(String base64Map, ReadableArray chain, ReadableMap param, Callback callback) haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void isBatchConvertSceneVisisble(Callback callback) {
        getUIProvider().isBatchConvertSceneVisisbleWith(getCurrentActivity(), "{}", callback);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void isBatchConvertSceneVisisbleWith(ReadableMap readableMap, Callback callback) {
        getUIProvider().isBatchConvertSceneVisisbleWith(getCurrentActivity(), MIOTUtils.readableMapToJsonStr(readableMap), callback);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void jumpToThirdpartyApplication(String str, Callback callback) {
        if (getCurrentActivity() == null) {
            if (callback != null) {
                callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap("current activity is null..."));
                return;
            }
            return;
        }
        Uri uri = Uri.parse(str);
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        if (str.startsWith("market") && SystemApi.isSamsungPhone()) {
            String query = uri.getQuery();
            intent = new Intent("android.intent.action.VIEW", Uri.parse("http://apps.samsung.com/appquery/appDetail.as?" + (query.startsWith("id=") ? query.replace("id=", "appId=") : query.replace("&id=", "&appId="))));
            intent.setPackage("com.sec.android.app.samsungapps");
        }
        try {
            getRnPluginHostApiProvider().jumpToThirdPartApp(getCurrentActivity(), intent, callback);
        } catch (Exception e) {
            if (callback != null) {
                callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(e.toString()));
            }
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void keepScreenNotLock(final boolean z) {
        final Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        GlobalHandlerManager.getInstance().getGlobalHandler().post(new Runnable() { // from class: lxe
            @Override // java.lang.Runnable
            public final void run() {
                MIOTHostModuleCore.lambda$keepScreenNotLock$15(z, currentActivity);
            }
        });
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void launchCountDownWhenDevice(boolean z, ReadableMap readableMap) {
        onMethodNotImplamente(" launchCountDownWhenDevice(boolean isDevicePowerOn, ReadableMap setting) haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void loadCurrentCountryCode(Callback callback) {
        try {
            callback.invoke(new JSONObject(getRnPluginHostApiProvider().getCurrentServer()).optString("countryCode"));
        } catch (JSONException e) {
            callback.invoke(e.toString());
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void loadInfoCallback(String str, Callback callback) {
        String string = getSharedPreferencesV2().getString(str, "");
        if (TextUtils.isEmpty(string)) {
            string = getSharedPreferences().getString(str, "");
            if (!TextUtils.isEmpty(string)) {
                saveInfo(str, string);
            }
        }
        callback.invoke(string);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void loadOperatorsType(Callback callback) {
        if (getCurrentActivity() == null) {
            callback.invoke(Boolean.FALSE, "current activity is null ...");
            return;
        }
        TelephonyManager telephonyManager = (TelephonyManager) getCurrentActivity().getSystemService("phone");
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("name", telephonyManager.getSimOperatorName());
        writableMapCreateMap.putString("simOperator", telephonyManager.getSimOperator());
        writableMapCreateMap.putString("countryCode", telephonyManager.getSimCountryIso());
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putMap("1", writableMapCreateMap);
        callback.invoke(Boolean.TRUE, writableMapCreateMap2);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void loadRealDeviceConfig(String str, Callback callback) {
        onMethodNotImplamente(" loadRealDeviceConfig(String model, Callback callback) haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void notifyCameraStorageChangeStateChanged(ReadableMap readableMap) {
        onMethodNotImplamente(" notifyCameraStorageChangeStateChanged(ReadableMap param) haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void notifyMultikeyStateChanged(ReadableMap readableMap) {
        onMethodNotImplamente(" notifyMultikeyStateChanged(ReadableMap param) haven't been impl");
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openAddDeviceGroupPage() {
        onMethodNotImplamente(" openAddDeviceGroupPage() haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openAddDeviceGroupPageWithGroupModel(String str) {
        onMethodNotImplamente(" openAddDeviceGroupPageWithGroupModel(String virtualModel) haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openAddIRController(String str, final int i, final ReadableArray readableArray, final ReadableMap readableMap) {
        runOnMain(new Runnable() { // from class: com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTHostModuleCore.4
            @Override // java.lang.Runnable
            public void run() {
                ArrayList list = Arguments.toList(readableArray);
                Activity currentActivity = MIOTHostModuleCore.this.getCurrentActivity();
                DeviceStat device = MIOTHostModuleCore.this.getDevice();
                if (currentActivity == null || device == null) {
                    return;
                }
                MIOTHostModuleCore.this.getUIProvider().openAddIRController(currentActivity, device, i, list == null ? null : (String[]) list.toArray(new String[list.size()]), Arguments.toBundle(readableMap));
            }
        });
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openAddToDesktopPage() {
        onMethodNotImplamente(" openAddToDesktopPage() haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openAssociatePage(ReadableMap readableMap) {
        final DeviceStat device = getDevice();
        final Activity currentActivity = getCurrentActivity();
        if (device == null || currentActivity == null) {
            return;
        }
        runOnMain(new Runnable() { // from class: com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTHostModuleCore.3
            @Override // java.lang.Runnable
            public void run() {
                MIOTHostModuleCore.this.getUIProvider().openAssociatePage(currentActivity, device.did);
            }
        });
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openBatchConvertScene() {
        getUIProvider().openConvertScenePage(getCurrentActivity());
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openBleGroupUpgradePage(int i) {
        onMethodNotImplamente(" openBleGroupUpgradePage(int authType) haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openBleMeshDeviceUpgradePage() {
        onMethodNotImplamente(" openBleMeshDeviceUpgradePage() haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openBleOtaDeviceUpgradePage(final ReadableMap readableMap) {
        RnPluginLog.addFrameworkLog("MIOTHostModule openBleOtaDeviceUpgradePage");
        final DeviceStat device = getDevice();
        if (device != null) {
            runOnMain(new Runnable() { // from class: rxe
                @Override // java.lang.Runnable
                public final void run() {
                    this.f33033a.lambda$openBleOtaDeviceUpgradePage$5(readableMap, device);
                }
            });
        } else {
            RnPluginLog.addFrameworkLog("MIOTHostModule openBleOtaDeviceUpgradePage getDevice() == null");
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openBtGatewayActivity() {
        onMethodNotImplamente(" openBtGatewayActivity() haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openBtGatewayPage() {
        final DeviceStat device = getDevice();
        final Activity currentActivity = getCurrentActivity();
        if (device == null || currentActivity == null) {
            return;
        }
        runOnMain(new Runnable() { // from class: com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTHostModuleCore.5
            @Override // java.lang.Runnable
            public void run() {
                MIOTHostModuleCore.this.getUIProvider().openBtGatewayPage(currentActivity, device.did);
            }
        });
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openBtGatewayPageWithParams(ReadableMap readableMap, final Callback callback) {
        DeviceStat device = getDevice();
        final Activity currentActivity = getCurrentActivity();
        if (device == null || currentActivity == null) {
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-100, "current device is null or activity is null..."));
            return;
        }
        if (!DeviceInfoHelper.isOwner(device.permitLevel)) {
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-101, "method unallowed on shared curDevice"));
            return;
        }
        final String string = MIOTUtils.getString(readableMap, "did");
        if (TextUtils.isEmpty(string)) {
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-102, "error input params: check did"));
            return;
        }
        DeviceStat deviceByDid = getRnPluginHostApiProvider().getDeviceByDid(string);
        if (deviceByDid == null) {
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-202, "account find no specific device with input params did"));
            return;
        }
        boolean isStdPlugin = getRnRuntimeProvider().getCurrentRuntime().getIsStdPlugin();
        String str = device.model;
        String str2 = deviceByDid.model;
        if (!isStdPlugin) {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-203, "account find no specific device with input parmas did"));
                return;
            } else if (!TextUtils.equals(ModelUtil.getCompanyIdentifierByModel(str), ModelUtil.getCompanyIdentifierByModel(str2))) {
                callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-204, "could only open ble gateway page belongs same company, compared with opened plugin model"));
                return;
            }
        }
        runOnMain(new Runnable() { // from class: com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTHostModuleCore.6
            @Override // java.lang.Runnable
            public void run() {
                MIOTHostModuleCore.this.getUIProvider().openBtGatewayPage(currentActivity, string);
                callback.invoke(Boolean.TRUE, RnCallbackMapUtil.getCommonSuccessMap(0, "success"));
            }
        });
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openChangeDeviceIconDialog(ReadableMap readableMap, Callback callback) {
        onMethodNotImplamente(" openChangeDeviceIconDialog(ReadableMap param, Callback callback) haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openChangeDeviceName() {
        final DeviceStat device = getDevice();
        final Activity currentActivity = getCurrentActivity();
        if (device == null || currentActivity == null) {
            return;
        }
        runOnMain(new Runnable() { // from class: com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTHostModuleCore.13
            @Override // java.lang.Runnable
            public void run() {
                IUIProvider uIProvider = MIOTHostModuleCore.this.getUIProvider();
                Activity activity = currentActivity;
                DeviceStat deviceStat = device;
                uIProvider.openChangeDeviceName(activity, deviceStat.did, deviceStat.mac, deviceStat.pid, deviceStat.name, new Callback() { // from class: com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTHostModuleCore.13.1
                    @Override // com.facebook.react.bridge.Callback
                    public void invoke(Object... objArr) {
                        device.name = (String) objArr[0];
                    }
                });
            }
        });
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openCommonDeviceSettingPage(int i) {
        onMethodNotImplamente(" openCommonDeviceSettingPage(int type) haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openConfigRouterSubPage() {
        onMethodNotImplamente(" openConfigRouterSubPage() haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openConnectSucceedPage(final String str, final String str2) {
        runOnMain(new Runnable() { // from class: com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTHostModuleCore.17
            @Override // java.lang.Runnable
            public void run() {
                Activity currentActivity = MIOTHostModuleCore.this.getCurrentActivity();
                if (currentActivity != null) {
                    MIOTHostModuleCore.this.getUIProvider().openConnectSucceedPage(currentActivity, str, str2);
                }
            }
        });
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openConsumesDetailPage(ReadableMap readableMap, Callback callback) {
        onMethodNotImplamente(" openConsumesDetailPage(ReadableMap params, Callback callback) haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openConsumesPageWithParams(ReadableMap readableMap, Callback callback) {
        onMethodNotImplamente(" openConsumesPageWithParams(ReadableMap params, Callback callback) haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openCurtainGroupNamePage(final String str, final String str2, final String str3) {
        runOnMain(new Runnable() { // from class: com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTHostModuleCore.18
            @Override // java.lang.Runnable
            public void run() {
                Activity currentActivity = MIOTHostModuleCore.this.getCurrentActivity();
                if (currentActivity != null) {
                    MIOTHostModuleCore.this.getUIProvider().openCurtainGroupNamePage(currentActivity, str, str2, str3);
                }
            }
        });
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openDeclarationWithConfig(final ReadableMap readableMap, final Callback callback) {
        if (readableMap == null) {
            callback.invoke(Boolean.FALSE, "params is null...");
            return;
        }
        final DeviceStat device = getDevice();
        if (device == null || getCurrentActivity() == null) {
            callback.invoke(Boolean.FALSE, "current device is null or activity is null...");
        } else {
            runOnMain(new Runnable() { // from class: pxe
                @Override // java.lang.Runnable
                public final void run() {
                    this.f30877a.lambda$openDeclarationWithConfig$4(readableMap, device, callback);
                }
            });
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openDeleteDevice(String str) {
        DeviceStat device = getDevice();
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || device == null) {
            return;
        }
        getUIProvider().openDeleteDevice(currentActivity, str, device.did, device.pid);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openDevice(String str, String str2, ReadableMap readableMap, Callback callback) {
        if (getCurrentActivity() == null) {
            RnPluginLog.e("current activity is null...");
        } else {
            getRnPluginHostApiProvider().openDevice(getContext(), str, str2, readableMap, callback);
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openDeviceCallSettingPage(String str) {
        onMethodNotImplamente(" openDeviceCallSettingPage(String did) haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openDeviceHubGatewayPage(ReadableMap readableMap) {
        onMethodNotImplamente(" openDeviceHubGatewayPage(ReadableMap param) haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openDeviceOfflineAlert() {
        onMethodNotImplamente(" openDeviceOfflineAlert() haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openDeviceServicePage(ReadableMap readableMap) {
        final String string = MIOTUtils.getString(readableMap, "url");
        runOnMain(new Runnable() { // from class: com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTHostModuleCore.12
            @Override // java.lang.Runnable
            public void run() {
                try {
                    MIOTHostModuleCore.this.getUIProvider().loadUrl(string, "");
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openDeviceSettingPageWithType(int i) {
        onMethodNotImplamente(" openDeviceSettingPageWithType(int type) haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openDeviceTimeZoneSettingPage(ReadableMap readableMap) {
        onMethodNotImplamente(" openDeviceTimeZoneSettingPage(ReadableMap param) haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openDeviceUpgradeHistoryPage() {
        onMethodNotImplamente(" openDeviceUpgradeHistoryPage() haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openDeviceUpgradePage() {
        onMethodNotImplamente(" openDeviceUpgradePage() haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openDirectorySelectPage(Callback callback) {
        onMethodNotImplamente(" openDirectorySelectPage(Callback callback) haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openEditDeviceGroupPage(ReadableArray readableArray) {
        final DeviceStat device = getDevice();
        final Activity currentActivity = getCurrentActivity();
        if (device == null || currentActivity == null) {
            RnPluginLog.e("openEditDeviceGroupPage: device is null");
        } else {
            runOnMain(new Runnable() { // from class: com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTHostModuleCore.14
                @Override // java.lang.Runnable
                public void run() {
                    IUIProvider uIProvider = MIOTHostModuleCore.this.getUIProvider();
                    Activity activity = currentActivity;
                    DeviceStat deviceStat = device;
                    uIProvider.openEditDeviceGroupPage(activity, deviceStat.model, deviceStat.did);
                }
            });
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openFeedbackInput() {
        onMethodNotImplamente(" openFeedbackInput() haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openFileSelectPage(String str, Callback callback) {
        onMethodNotImplamente(" openFileSelectPage(String mimeType, Callback callback) haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openFirmWareAutoOTAPage() {
        onMethodNotImplamente(" openFirmWareAutoOTAPage() haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openFirmwareAutoUpgradeSwitch(ReadableMap readableMap, Callback callback) {
        onMethodNotImplamente(" openFirmwareAutoUpgradeSwitch(ReadableMap map, Callback callback) haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openGenerateCrontabStringPage(ReadableMap readableMap, Callback callback) {
        onMethodNotImplamente(" openGenerateCrontabStringPage(ReadableMap map, Callback callback) haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openHelpPage() {
        final DeviceStat device = getDevice();
        final Activity currentActivity = getCurrentActivity();
        if (device == null || currentActivity == null) {
            return;
        }
        runOnMain(new Runnable() { // from class: com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTHostModuleCore.2
            @Override // java.lang.Runnable
            public void run() {
                IUIProvider uIProvider = MIOTHostModuleCore.this.getUIProvider();
                Activity activity = currentActivity;
                DeviceStat deviceStat = device;
                uIProvider.openHelpPage(activity, deviceStat.model, deviceStat.did);
            }
        });
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openIftttAutoPage() {
        onMethodNotImplamente(" openIftttAutoPage() haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openIftttAutoPageWithDid(String str) {
        onMethodNotImplamente(" openIftttAutoPageWithDid(String did) haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openLightGroupUpgradePage() {
        onMethodNotImplamente(" openLightGroupUpgradePage() haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openMeshDeviceGroupPage(String str, String str2, int i) {
        onMethodNotImplamente(" openMeshDeviceGroupPage(String type, String did, int version) haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openMiPayPage(ReadableMap readableMap, Callback callback) {
        String str = String.format("https://tsmclient.miui.com?action=%1$s&type=%2$s&product_id=%3$s&source_channel=%4$s", MIOTUtils.getString(readableMap, "action", "issue_mifare"), MIOTUtils.getString(readableMap, "type", "1"), MIOTUtils.getString(readableMap, IssuerActivity.KEY_PRODUCT_ID, "66666-00211"), MIOTUtils.getString(readableMap, IssuerActivity.KEY_SOURCE_CHANNEL, Constant.DeviceCategory.MIJIA));
        RnPluginLog.i("MIOTHost openMiPayPage  url=" + str);
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        WritableMap writableMapCreateMap = Arguments.createMap();
        if (getCurrentActivity() == null) {
            writableMapCreateMap.putBoolean("result", false);
            writableMapCreateMap.putBoolean("isSupportMiPay", isSupportMiPay());
            writableMapCreateMap.putString("detail", "current activity is null");
            callback.invoke(Boolean.FALSE, writableMapCreateMap);
            return;
        }
        if (!isSupportMiPay()) {
            writableMapCreateMap.putBoolean("result", false);
            writableMapCreateMap.putBoolean("isSupportMiPay", false);
            writableMapCreateMap.putString("detail", "");
            callback.invoke(Boolean.FALSE, writableMapCreateMap);
            return;
        }
        getCurrentActivity().startActivity(intent);
        writableMapCreateMap.putBoolean("result", true);
        writableMapCreateMap.putBoolean("isSupportMiPay", true);
        writableMapCreateMap.putString("detail", "");
        callback.invoke(Boolean.TRUE, writableMapCreateMap);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openNFCWriteDeviceInfoPage(String str) {
        DeviceStat device = getDevice();
        if (device == null) {
            MRnLog.w(TAG, "openNFCWriteDeviceInfoPage device is null");
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            MRnLog.w(TAG, "openNFCWriteDeviceInfoPage activity is null");
        } else {
            getUIProvider().openNFCWriteActivityForOpenPlugin(currentActivity, device.did, device.model, str);
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openNFCWriteDeviceInfoPage_debugonly(ReadableMap readableMap) {
        onMethodNotImplamente(" openNFCWriteDeviceInfoPage_debugonly(ReadableMap params) haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openNFCWritePageForConnectTV(ReadableMap readableMap) {
        getUIProvider().openNFCWriteActivityForConnectTV(getCurrentActivity(), MIOTUtils.readableMapToJsonStr(readableMap));
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openOneTimePassword(String str, int i, int i2) {
        onMethodNotImplamente(" openOneTimePassword(String did, int interval, int digits) haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openOperationUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            RnPluginLog.w("MIOTHost#openOperationUrl: url is empty");
            return;
        }
        String host = Uri.parse(str).getHost();
        if (TextUtils.isEmpty(host)) {
            RnPluginLog.w("MIOTHost#openOperationUrl: host is empty");
            return;
        }
        if (!host.contains("mi.com") && !host.contains("xiaomi.com") && !host.contains("xiaomiyoupin.com")) {
            RnPluginLog.w("MIOTHost#openOperationUrl: not in the domain white-list");
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        getUIProvider().openOperationCommonWebView(currentActivity, str);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openPhoneBluSettingActivity() {
        runOnMain(new Runnable() { // from class: com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTHostModuleCore.15
            @Override // java.lang.Runnable
            public void run() {
                Activity currentActivity = MIOTHostModuleCore.this.getCurrentActivity();
                if (currentActivity != null) {
                    currentActivity.startActivity(new Intent("android.settings.BLUETOOTH_SETTINGS"));
                }
            }
        });
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openPhoneLocationServerSettingPage() {
        if (getCurrentActivity() == null) {
            RnPluginLog.e("current activity is null...");
        } else {
            getCurrentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openPluginPage(String str, String str2, ReadableMap readableMap, Callback callback) {
        if (callback == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            callback.invoke(Boolean.FALSE, "did is empty!");
        } else if (getCurrentActivity() == null) {
            callback.invoke(Boolean.FALSE, "current activity is null");
        } else {
            getRnPluginHostApiProvider().openPluginPage(getCurrentActivity(), str, str2, readableMap, callback);
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openPluginRecommendScene(String str, int i) {
        onMethodNotImplamente(" openPluginRecommendScene(String deviceId, int recommendId) haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openPowerMultikeyPage(String str, String str2) {
        onMethodNotImplamente(" openPowerMultikeyPage(String did, String mac) haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openPowerSwitchNameActivity() {
        onMethodNotImplamente(" openPowerSwitchNameActivity() haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openPrivacyLicense(final String str, final ReadableArray readableArray, final String str2, final ReadableArray readableArray2, final Callback callback) {
        final DeviceStat device = getDevice();
        final Activity currentActivity = getCurrentActivity();
        if (device == null || currentActivity == null) {
            return;
        }
        runOnMain(new Runnable() { // from class: com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTHostModuleCore.8
            @Override // java.lang.Runnable
            public void run() {
                IUIProvider uIProvider = MIOTHostModuleCore.this.getUIProvider();
                Activity activity = currentActivity;
                DeviceStat deviceStat = device;
                uIProvider.openPrivacyLicense(activity, deviceStat.did, deviceStat.name, str, readableArray, str2, readableArray2, callback);
            }
        });
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openResetAndConnectDevicePage() {
        onMethodNotImplamente(" openResetAndConnectDevicePage() haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openRoomManagementPage() {
        final DeviceStat device = getDevice();
        final Activity currentActivity = getCurrentActivity();
        if (device == null || currentActivity == null) {
            RnPluginLog.e("device is null or current activity is null...");
        } else {
            runOnMain(new Runnable() { // from class: hxe
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20568a.lambda$openRoomManagementPage$1(currentActivity, device);
                }
            });
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openRoomManagementPageByDid(final String str) {
        DeviceStat device;
        final Activity currentActivity = getCurrentActivity();
        if (TextUtils.isEmpty(str) && (device = getDevice()) != null) {
            str = device.did;
        }
        if (currentActivity != null) {
            runOnMain(new Runnable() { // from class: com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTHostModuleCore.1
                @Override // java.lang.Runnable
                public void run() {
                    MIOTHostModuleCore.this.getUIProvider().openRoomManagementPage(currentActivity, str);
                }
            });
        } else {
            RnPluginLog.e(" current activity is null...");
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openSecuritySetting() {
        final DeviceStat device = getDevice();
        final Activity currentActivity = getCurrentActivity();
        if (device == null || currentActivity == null) {
            return;
        }
        runOnMain(new Runnable() { // from class: qxe
            @Override // java.lang.Runnable
            public final void run() {
                this.f31936a.lambda$openSecuritySetting$2(currentActivity, device);
            }
        });
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openShareDevicePage() {
        final DeviceStat device = getDevice();
        final Activity currentActivity = getCurrentActivity();
        if (device == null || currentActivity == null) {
            return;
        }
        runOnMain(new Runnable() { // from class: oxe
            @Override // java.lang.Runnable
            public final void run() {
                this.f29786a.lambda$openShareDevicePage$0(currentActivity, device);
            }
        });
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openShareListBar(String str, String str2, ReadableArray readableArray, String str3) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            getUIProvider().openShareListBar(currentActivity, getDevice(), str, str2, readableArray, str3);
        } else {
            RnPluginLog.e("current activity is null...");
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openSystemFileWindow(String str) {
        onMethodNotImplamente(" openSystemFileWindow(String pathOrUrl) haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openSystemShareWindow(String str) {
        Uri uriForFile;
        RnPluginLog.w("MIOTHOST#openSystemShareWindow: pathOrUrl=" + str);
        if (TextUtils.isEmpty(str) || !(str.startsWith("content://") || MediaStoreUtil.isPublicMediaFiles(str) || ZipPluginFileUtils.verifyFileAbosolutePath(getFilesPath().getAbsolutePath(), str))) {
            RnPluginLog.w("MIOTHOST#openSystemShareWindow: pathOrUrl is illegal");
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        Uri uri = Uri.parse(str);
        String scheme = uri.getScheme();
        if (TextUtils.isEmpty(scheme) || !(scheme.startsWith("http") || scheme.startsWith(Constants.URI_SCHEME) || scheme.startsWith(MiuiCursorConstants.CONTENT))) {
            try {
                File file = new File(str);
                if (!file.exists()) {
                    RnPluginLog.w("MIOTHOST#openSystemShareWindow: pathOrUrl not exist");
                    return;
                } else if (MediaStoreUtil.isPublicMediaFiles(str)) {
                    uriForFile = Uri.parse(str);
                } else {
                    uriForFile = FileProvider.getUriForFile(currentActivity, currentActivity.getApplicationContext().getPackageName() + ".fileprovider", file);
                }
            } catch (IllegalArgumentException e) {
                RnPluginLog.w("MIOTHOST#openSystemShareWindow error:" + Log.getStackTraceString(e));
                uriForFile = null;
            }
        } else {
            uriForFile = Uri.parse(str);
        }
        if (uriForFile == null) {
            RnPluginLog.w("MIOTHOST#openSystemShareWindow error: fileUri = null,sdk_int:" + Build.VERSION.SDK_INT);
            return;
        }
        String mimeTypeFromFilePath = (TextUtils.isEmpty(scheme) || !scheme.startsWith(MiuiCursorConstants.CONTENT)) ? FileUtil.getMimeTypeFromFilePath(str) : FileUtil.getMimeTypeFromUri(currentActivity, uri);
        if (TextUtils.isEmpty(mimeTypeFromFilePath)) {
            mimeTypeFromFilePath = "*/*";
        }
        RnPluginLog.w("MIOTHOST#openSystemShareWindow: mimeType=" + mimeTypeFromFilePath);
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.STREAM", uriForFile);
        intent.addFlags(1);
        intent.addFlags(268435456);
        intent.setType(mimeTypeFromFilePath);
        currentActivity.startActivity(Intent.createChooser(intent, null));
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openTimerSettingPage(String str, String str2, String str3, String str4) {
        onMethodNotImplamente(" openTimerSettingPage(String onMethod, String onParam, String offMethod, String offParam) haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openTimerSettingPageWithCustomIdentifier(String str, String str2, String str3, String str4, String str5) {
        onMethodNotImplamente(" openTimerSettingPageWithCustomIdentifier(String customTimerIdentifier, String onMethod, String onParam, String offMethod, String offParam) haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openTimerSettingPageWithOptions(ReadableMap readableMap) {
        onMethodNotImplamente(" openTimerSettingPageWithOptions(ReadableMap readableMap) haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openTimerSettingPageWithOptionsV2(ReadableMap readableMap) {
        onMethodNotImplamente(" openTimerSettingPageWithOptionsV2(ReadableMap readableMap) haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openTimerSettingPageWithVariousTypeParams(String str, String str2, String str3, String str4) {
        onMethodNotImplamente(" openTimerSettingPageWithVariousTypeParams(String onMethod, String onParam, String offMethod, String offParam) haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openVirtualGroupInitPage(ReadableMap readableMap) {
        onMethodNotImplamente(" openVirtualGroupInitPage(ReadableMap map) haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openVoiceCtrlDevListPage() {
        onMethodNotImplamente(" openVoiceCtrlDevListPage() haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openVoiceCtrlDeviceAuthPage() {
        Activity currentActivity;
        DeviceStat device = getDevice();
        if (device == null || (currentActivity = getCurrentActivity()) == null) {
            return;
        }
        getUIProvider().openVoiceCtrlDeviceAuthPage(currentActivity, device.did);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openWebPage(final String str, final ReadableMap readableMap) {
        StringBuilder sb = new StringBuilder();
        sb.append("openWebPage ");
        sb.append(str);
        RnNetReport.reportWebPageURL(str);
        if (RnNetReport.isInWhiteListHost(str)) {
            runOnMain(new Runnable() { // from class: com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTHostModuleCore.11
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        boolean z = (!readableMap.hasKey("onCurrentPageIfAvailable") || readableMap.isNull("onCurrentPageIfAvailable")) ? true : readableMap.getBoolean("onCurrentPageIfAvailable");
                        if (MIOTUtils.getBoolean(readableMap, "legacy") && z) {
                            MIOTHostModuleCore.this.getUIProvider().loadUrlSupportRedirect(str, "", false);
                        } else {
                            MIOTHostModuleCore.this.getUIProvider().loadUrl(str, "");
                        }
                    } catch (RemoteException unused) {
                    }
                }
            });
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("openWebPage host is not in the whiteList url=");
        sb2.append(str);
        if (getRnRuntimeProvider().isReleaseBuildType()) {
            return;
        }
        ToastUtil.show(getContext(), "禁止访问的网页!");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openWifiChoosePage(Callback callback) {
        onMethodNotImplamente(" openWifiChoosePage(Callback callback) haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openXiaoAiLearnPage(final ReadableMap readableMap) {
        final boolean zOptBoolean = RnReadableMapUtil.optBoolean(readableMap, "newVerAiTrain");
        runOnMain(new Runnable() { // from class: com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTHostModuleCore.16
            @Override // java.lang.Runnable
            public void run() {
                Activity currentActivity = MIOTHostModuleCore.this.getCurrentActivity();
                if (currentActivity != null) {
                    MIOTHostModuleCore.this.getUIProvider().openXiaoAiLearnPage(currentActivity, RnReadableMapUtil.toJsonString(readableMap), true, zOptBoolean);
                }
            }
        });
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void openZigbeeConnectDeviceList(String str) {
        onMethodNotImplamente(" openZigbeeConnectDeviceList(String did) haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void pageShouldAdapterSoftKeyboard(final boolean z, Callback callback) {
        if (callback == null) {
            return;
        }
        if (getCurrentActivity() == null) {
            callback.invoke(Boolean.FALSE, "current activity is null...");
            return;
        }
        RnPluginLog.i("pageShouldFixSoftKeyboard-->pageShouldFix: " + z);
        final Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        currentActivity.runOnUiThread(new Runnable() { // from class: com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTHostModuleCore.23
            @Override // java.lang.Runnable
            public void run() {
                if (z) {
                    currentActivity.getWindow().setSoftInputMode(16);
                } else {
                    currentActivity.getWindow().setSoftInputMode(32);
                }
                AndroidBug5497Workaround.getInstance().setShouldFitSoftKeybord(z);
            }
        });
        Boolean bool = Boolean.TRUE;
        callback.invoke(bool, bool);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void phoneHasNfc(Callback callback) {
        if (callback == null) {
            return;
        }
        if (getCurrentActivity() == null) {
            callback.invoke(Boolean.FALSE, "current activity is null...");
            return;
        }
        NfcAdapter defaultAdapter = ((NfcManager) getCurrentActivity().getSystemService("nfc")).getDefaultAdapter();
        WritableMap writableMapCreateMap = Arguments.createMap();
        if (defaultAdapter == null || !defaultAdapter.isEnabled()) {
            writableMapCreateMap.putBoolean("hasNfc", false);
            callback.invoke(Boolean.TRUE, writableMapCreateMap);
        } else {
            writableMapCreateMap.putBoolean("hasNfc", true);
            callback.invoke(Boolean.TRUE, writableMapCreateMap);
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    @SuppressLint({"CheckResult"})
    public void pointsScaleToImageBase64(final int i, final int i2, String str, final String str2, final int i3, final Callback callback) {
        o4h.E(str).F(new bua() { // from class: ixe
            @Override // defpackage.bua
            public final Object apply(Object obj) {
                return MIOTHostModuleCore.lambda$pointsScaleToImageBase64$12(i, i2, str2, i3, (String) obj);
            }
        }).S(ofl.c()).H(ua1.c()).O(new bg4() { // from class: jxe
            @Override // defpackage.bg4
            public final void accept(Object obj) throws Exception {
                MIOTHostModuleCore.lambda$pointsScaleToImageBase64$13(callback, (String) obj);
            }
        }, new bg4() { // from class: kxe
            @Override // defpackage.bg4
            public final void accept(Object obj) throws Exception {
                MIOTHostModuleCore.lambda$pointsScaleToImageBase64$14(callback, (Throwable) obj);
            }
        });
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    @SuppressLint({"CheckResult"})
    public void pointsToImageBase64(final int i, final int i2, String str, final String str2, final Callback callback) {
        if (str == null) {
            callback.invoke(Boolean.FALSE, "param points null");
        } else {
            o4h.E(str).F(new bua() { // from class: fxe
                @Override // defpackage.bua
                public final Object apply(Object obj) {
                    return MIOTHostModuleCore.lambda$pointsToImageBase64$9(i, i2, str2, (String) obj);
                }
            }).S(ofl.c()).H(ua1.c()).O(new bg4() { // from class: mxe
                @Override // defpackage.bg4
                public final void accept(Object obj) throws Exception {
                    MIOTHostModuleCore.lambda$pointsToImageBase64$10(callback, (String) obj);
                }
            }, new bg4() { // from class: nxe
                @Override // defpackage.bg4
                public final void accept(Object obj) throws Exception {
                    MIOTHostModuleCore.lambda$pointsToImageBase64$11(callback, (Throwable) obj);
                }
            });
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void privacyAndProtocolReview(final String str, final ReadableArray readableArray, final String str2, final ReadableArray readableArray2) {
        final DeviceStat device = getDevice();
        final Activity currentActivity = getCurrentActivity();
        if (device == null || currentActivity == null) {
            return;
        }
        runOnMain(new Runnable() { // from class: com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTHostModuleCore.7
            @Override // java.lang.Runnable
            public void run() {
                MIOTHostModuleCore.this.getUIProvider().privacyAndProtocolReview(currentActivity, device.did, str, readableArray, str2, readableArray2, 100);
            }
        });
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void refreshDeviceList(Callback callback) {
        onMethodNotImplamente(" refreshDeviceList(Callback callback) haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void registerFontEnable(ReadableMap readableMap) {
        onMethodNotImplamente(" registerFontEnable(ReadableMap param) haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void removeExecutor(String str) {
        onMethodNotImplamente(" removeExecutor(String id) haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void saveInfo(String str, String str2) {
        getSharedPreferencesV2().edit().putString(str, str2).apply();
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void setPadScrollDealStrategy(ReadableMap readableMap) {
        onMethodNotImplamente(" setPadScrollDealStrategy(ReadableMap params) haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void sharedSecretFromCryptoObject(String str, String str2, Callback callback) {
        onMethodNotImplamente(" sharedSecretFromCryptoObject(String uuid, String otherPublicKey, Callback callback) haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void showDeclarationWithConfig(final ReadableMap readableMap, final Callback callback) {
        if (readableMap == null) {
            callback.invoke(Boolean.FALSE, "params is null...");
            return;
        }
        final DeviceStat device = getDevice();
        if (device == null || getCurrentActivity() == null) {
            callback.invoke(Boolean.FALSE, "current device is null or activity is null...");
        } else {
            runOnMain(new Runnable() { // from class: sxe
                @Override // java.lang.Runnable
                public final void run() {
                    this.f34080a.lambda$showDeclarationWithConfig$3(readableMap, device, callback);
                }
            });
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    @SuppressLint({"CheckResult"})
    public void zhuimiRobotTracesToImageBase64(final int i, final int i2, final String str, final Callback callback) {
        o4h.E(str).F(new bua<String, String>() { // from class: com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTHostModuleCore.21
            @Override // defpackage.bua
            public String apply(String str2) throws Exception {
                return MIOTUtils.createTracesImageBase64(i, i2, str);
            }
        }).S(ofl.c()).H(ua1.c()).O(new bg4<String>() { // from class: com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTHostModuleCore.19
            @Override // defpackage.bg4
            public void accept(String str2) throws Exception {
                callback.invoke(Boolean.TRUE, RnCallbackMapUtil.getCommonSuccessMap(str2));
            }
        }, new bg4<Throwable>() { // from class: com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTHostModuleCore.20
            @Override // defpackage.bg4
            public void accept(Throwable th) throws Exception {
                callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(th.toString()));
            }
        });
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTHost
    @ReactMethod
    public void zhuimiRobotTracesToImageBase64V2(final int i, final int i2, final String str, final Callback callback) {
        p4h.h(0).y(pfl.c()).t(new tc0<Integer>() { // from class: com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTHostModuleCore.22
            @Override // defpackage.tc0
            public void call(Integer num) {
                try {
                    callback.invoke(Boolean.TRUE, RnCallbackMapUtil.getCommonSuccessMap(MIOTUtils.createTracesImageBase64V2(i, i2, str)));
                } catch (Exception e) {
                    e.printStackTrace();
                    callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(e.toString()));
                }
            }
        });
    }

    private WritableMap getPhoneScreenInfo() {
        int height;
        int width;
        WritableMap writableMapCreateMap = Arguments.createMap();
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return null;
        }
        View rootView = getScreenInfoProvider().getRootView(currentActivity);
        if (rootView != null) {
            height = rootView.getHeight();
            width = rootView.getWidth();
        } else {
            height = -1;
            width = -1;
        }
        WindowManager windowManager = currentActivity.getWindowManager();
        if (windowManager == null) {
            return null;
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        Point point = new Point();
        Point point2 = new Point();
        defaultDisplay.getSize(point);
        defaultDisplay.getRealSize(point2);
        RnPluginLog.i("View宽高--> viewHeight:  " + height + "   viewWidth: " + width);
        if (height < 200 || width < 200) {
            height = point2.y;
            width = point2.x;
        }
        RnPluginLog.i("屏幕高度--> size.y:  " + point.y + "   realSize.y: " + point2.y + "  navigationBarHeight: " + Math.abs(point2.y - height));
        writableMapCreateMap.putInt("viewWidth", com.xiaomi.smarthome.framework.plugin.rn.utils.DisplayUtils.px2dip((float) width));
        writableMapCreateMap.putInt("viewHeight", com.xiaomi.smarthome.framework.plugin.rn.utils.DisplayUtils.px2dip((float) height));
        writableMapCreateMap.putInt("viewWidthPixel", width);
        writableMapCreateMap.putInt("viewHeightPixel", height);
        writableMapCreateMap.putInt("displayCutoutTop", ScreenUtils.getInsertTop(getCurrentActivity()));
        return writableMapCreateMap;
    }
}
