package com.xiaomi.hm.health.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.TouchDelegate;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.fragment.app.FragmentActivity;
import com.facebook.appevents.UserDataStore;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.huami.account.HMLoginManager;
import com.huami.account.ui.areas.SelectAreaHelper;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.hid.takepic.TakePicSettingActivity;
import com.huami.lib.v2.ZeppPermissionManagerKt;
import com.huami.network.base.util.HMHttpUtils;
import com.huami.network.hmnetwork.properties.Property;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.update.UpdateManager;
import com.huami.watch.hmwatchmanager.R;
import com.huami.watch.ota.UpdateUtils;
import com.huami.widget.toast.CustomToast;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.Constant;
import com.xiaomi.hm.health.HMConfig;
import com.xiaomi.hm.health.baseutil.Country;
import com.xiaomi.hm.health.baseutil.DecimalUtil;
import com.xiaomi.hm.health.baseutil.FileUtils;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.bodyfat.manager.UserInfoManager;
import com.xiaomi.hm.health.bodyfat.model.Birthday;
import com.xiaomi.hm.health.bodyfat.utils.WeightGrantRequestDialogLis;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.model.HMStatisticInfo;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.DateData;
import com.xiaomi.hm.health.databases.model.UserInfos;
import com.xiaomi.hm.health.databases.model.WeightInfosDao;
import com.xiaomi.hm.health.dataprocess.UserInfo;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.sport.OriginSportData;
import com.xiaomi.hm.health.discovery.WebHelper;
import com.xiaomi.hm.health.keeper.HMKeeper;
import com.xiaomi.hm.health.manager.UnitManager;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.model.account.HMUserInfo;
import com.xiaomi.hm.health.ui.smartplay.MiuiAPI;
import com.xiaomi.hm.health.ui.statistic.StatisticUiHelperKt;
import com.xiaomi.hm.health.utils.Utils;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import io.netty.util.internal.StringUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class Utils {
    public static final String PARAMS_APPLICATION_NAME = "application_name";
    public static final String REF_DEVICE_TYPE = "REF_DEVICE_TYPE";
    public static final int RSSI_CLOSE = -55;
    public static final int RSSI_LITTEN_FRA = -85;
    public static final int RSSI_NORMAL = -70;
    public static final String TYPE_BAND = "TYPE_BAND";
    public static final int TYPE_NUMBER = 18;
    public static final int TYPE_STRING = 17;
    public static final String TYPE_UNLOCK_SCREEN = "TYPE_UNLOCK_SCREEN";
    public static final String TYPE_WEIGHT = "TYPE_WEIGHT";
    public static final String TYPE_WEIGHT_PAIR = "TYPE_WEIGHT_PAIR";
    public static final int UNLOCK_SCREEN_CLOSE_TYPE = 1;
    public static final int UNLOCK_SCREEN_LITTEN_FRA_TYPE = 3;
    public static final int UNLOCK_SCREEN_NORMAL_TYPE = 2;
    private static final String a = "Utils";
    private static final String b = "Millelet";
    private static final String c = "hk.alipay.wallet";
    private static final String d = "unknown";
    private static final String e = "HK";
    private static float f = -1.0f;
    private static float g = -1.0f;
    private static final int h = 8193;
    private static final String i = "WIFI";
    private static final String j = "2G";
    private static final String k = "3G+";
    private static int l = 0;
    private static int m = 0;
    private static int n = 0;
    private static final String o = "稳定版";
    private static final String p = "体验版";
    private static final String q = "开发版";
    private static final int r = 2000;
    private static long s = 0;
    private static int t = 0;
    private static final String u = "[a-zA-Z]";
    private static final String v = "\\.";
    private static final String w = "com.huami.zepp";
    private static final String x = "com.huami.app.amazfit";

    public class a implements DialogInterface.OnClickListener {
        public final /* synthetic */ AppCompatActivity a;

        public a(final AppCompatActivity val$activity) {
            this.a = val$activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialog, int which) {
            Utils.startAppSettings(this.a);
        }
    }

    public class b implements DialogInterface.OnClickListener {
        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialog, int which) {
            dialog.dismiss();
        }
    }

    public class c extends HMCallback<HMStatisticInfo> {
        private LoadingDialog a = null;
        public final /* synthetic */ FragmentActivity b;

        public c(final FragmentActivity val$activity) {
            this.b = val$activity;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onData(HMStatisticInfo hmStatisticInfo) {
            super.onData(hmStatisticInfo);
            if (this.b.isDestroyed()) {
                return;
            }
            LoadingDialog loadingDialog = this.a;
            if (loadingDialog != null) {
                loadingDialog.dismiss();
                this.a = null;
            }
            if (hmStatisticInfo == null) {
                Toast.makeText(this.b, "获取设备统计信息失败!", 0).show();
                return;
            }
            HMLog.d("test", "HMStatisticInfo:" + hmStatisticInfo.toJsonString(), new Object[0]);
            ArrayList arrayList = new ArrayList();
            int rebootCount = hmStatisticInfo.getRebootCount();
            if (rebootCount != -1) {
                arrayList.add(new Pair("重启次数", rebootCount + "次"));
            }
            int hardwareRebootCount = hmStatisticInfo.getHardwareRebootCount();
            if (hardwareRebootCount != -1) {
                arrayList.add(new Pair("硬件重启次数", hardwareRebootCount + "次"));
            }
            int appNotifyCount = hmStatisticInfo.getAppNotifyCount();
            if (appNotifyCount != -1) {
                arrayList.add(new Pair("App通知提醒次数", appNotifyCount + "次"));
            }
            int phoneNotifyCount = hmStatisticInfo.getPhoneNotifyCount();
            if (phoneNotifyCount != -1) {
                arrayList.add(new Pair("来电提醒次数", phoneNotifyCount + "次"));
            }
            int disconnectCount = hmStatisticInfo.getDisconnectCount();
            if (disconnectCount != -1) {
                arrayList.add(new Pair("蓝牙断开次数", disconnectCount + "次"));
            }
            int liftWristCount = hmStatisticInfo.getLiftWristCount();
            if (disconnectCount != -1) {
                arrayList.add(new Pair("抬腕次数", liftWristCount + "次"));
            }
            int keyCount = hmStatisticInfo.getKeyCount();
            if (keyCount != -1) {
                arrayList.add(new Pair("按键次数", keyCount + "次"));
            }
            int algorithmTime = hmStatisticInfo.getAlgorithmTime();
            if (algorithmTime != -1) {
                arrayList.add(new Pair("算法时间", algorithmTime + "毫秒"));
            }
            int connectionTime = hmStatisticInfo.getConnectionTime();
            if (connectionTime != -1) {
                arrayList.add(new Pair("蓝牙连接时间", connectionTime + "毫秒"));
            }
            int flashTime = hmStatisticInfo.getFlashTime();
            if (flashTime != -1) {
                arrayList.add(new Pair("flash读写时间", flashTime + "毫秒"));
            }
            int lcdTime = hmStatisticInfo.getLcdTime();
            if (lcdTime != -1) {
                arrayList.add(new Pair("亮屏时间", lcdTime + "毫秒"));
            }
            int ppgTime = hmStatisticInfo.getPpgTime();
            if (ppgTime != -1) {
                arrayList.add(new Pair("心率打开时间", ppgTime + "毫秒"));
            }
            int resumeTime = hmStatisticInfo.getResumeTime();
            if (resumeTime != -1) {
                arrayList.add(new Pair("唤醒时间", resumeTime + "毫秒"));
            }
            int upTime = hmStatisticInfo.getUpTime();
            if (upTime != -1) {
                arrayList.add(new Pair("系统启动时间", upTime + "秒"));
            }
            int vibrateTime = hmStatisticInfo.getVibrateTime();
            if (vibrateTime != -1) {
                arrayList.add(new Pair("震动时间", vibrateTime + "毫秒"));
            }
            int sixAxisTime = hmStatisticInfo.getSixAxisTime();
            if (sixAxisTime != -1) {
                arrayList.add(new Pair("6轴打开时间", sixAxisTime + "秒"));
            }
            int reconnectCount1 = hmStatisticInfo.getReconnectCount1();
            int reconnectCount2 = hmStatisticInfo.getReconnectCount2();
            int reconnectCount3 = hmStatisticInfo.getReconnectCount3();
            int reconnectCount4 = hmStatisticInfo.getReconnectCount4();
            if (reconnectCount1 != -1 || reconnectCount2 != -1 || reconnectCount3 != -1 || reconnectCount4 != -1) {
                arrayList.add(new Pair("重连次数", reconnectCount1 + "," + reconnectCount2 + "," + reconnectCount3 + "," + reconnectCount4));
            }
            if (arrayList.size() > 0) {
                StatisticUiHelperKt.showStatisticUi(this.b, arrayList);
            }
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onStart() {
            super.onStart();
            if (this.b.isDestroyed()) {
                return;
            }
            this.a = LoadingDialog.showDialog(this.b, "正在获取设备统计信息...");
        }
    }

    public static boolean archiveDir(String dir, File zipFile) {
        return archiveDir(dir, zipFile, null);
    }

    public static int calculateLength(String text) {
        int i2 = 0;
        for (int i3 = 0; i3 < text.length(); i3++) {
            i2 = p(text.charAt(i3)) ? i2 + 2 : i2 + 1;
        }
        return i2;
    }

    public static String captureViewShare(View view, Context context) throws Throwable {
        String absolutePath = FileUtils.getShareImagePath(context).getAbsolutePath();
        view.setDrawingCacheEnabled(true);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getDrawingCache());
        view.destroyDrawingCache();
        view.setDrawingCacheEnabled(false);
        boolean zSaveBitmapToFile = saveBitmapToFile(absolutePath, bitmapCreateBitmap, 100);
        if (!bitmapCreateBitmap.isRecycled()) {
            bitmapCreateBitmap.recycle();
        }
        return zSaveBitmapToFile ? absolutePath : "";
    }

    public static boolean checkAppInstalled(String packageName) {
        if (TextUtils.isEmpty(packageName)) {
            return false;
        }
        try {
            return BraceletApp.getContext().getPackageManager().getApplicationInfo(packageName, 8192) != null;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static boolean checkPermission(final Context context, String permission) {
        return Build.VERSION.SDK_INT < 23 || ContextCompat.checkSelfPermission(context, permission) == 0;
    }

    public static boolean checkRedRotOfAppUpgrade() {
        return UpdateManager.getInstance().shouldRedDotDisplay();
    }

    public static void closeSoftInput(Context context) {
        Objects.requireNonNull(context);
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        Objects.requireNonNull(inputMethodManager);
        inputMethodManager.toggleSoftInput(0, 2);
    }

    public static int cm2inch(int height) {
        return (int) Math.round(((double) height) * 0.394d);
    }

    public static boolean compareDateCalendar(Calendar calendar1, Calendar calendar2) {
        if (calendar1 == null || calendar2 == null) {
            return true;
        }
        return (calendar1.get(1) * 365) + calendar1.get(6) < (calendar2.get(1) * 365) + calendar2.get(6);
    }

    public static int compareVersion() {
        String strReplaceAll = Build.VERSION.INCREMENTAL.replaceAll(u, "");
        try {
            if (strReplaceAll.equals("7.1")) {
                return 0;
            }
            String[] strArrSplit = strReplaceAll.split(v);
            String[] strArrSplit2 = "7.1".split(v);
            int iMin = Math.min(strArrSplit.length, strArrSplit2.length);
            int i2 = 0;
            int i3 = 0;
            while (i2 < iMin) {
                i3 = Integer.parseInt(strArrSplit[i2]) - Integer.parseInt(strArrSplit2[i2]);
                if (i3 != 0) {
                    break;
                }
                i2++;
            }
            if (i3 != 0) {
                return i3 > 0 ? 1 : -1;
            }
            for (int i4 = i2; i4 < strArrSplit.length; i4++) {
                if (Integer.parseInt(strArrSplit[i4]) > 0) {
                    return 1;
                }
            }
            while (i2 < strArrSplit2.length) {
                if (Integer.parseInt(strArrSplit2[i2]) > 0) {
                    return -1;
                }
                i2++;
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static Calendar dateFormat(String birth) {
        return dateFormat(birth, "yy-MM");
    }

    public static int dip2px(Context context, float dipValue) {
        return (int) ((dipValue * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static boolean enableBluetooth(final Context context) {
        HMLog.i("Utils", "enable bluetooth ", new Object[0]);
        if (HMDeviceManager.isBluetoothSwitching()) {
            HMLog.i("Utils", "bluetooth is switching...", new Object[0]);
            return true;
        }
        if ((Build.VERSION.SDK_INT >= 31 && !ZeppPermissionManagerKt.hasPermission(context, "android.permission.BLUETOOTH_CONNECT")) || !HMDeviceManager.getInstance().isBluetoothSupportAndDisable()) {
            return true;
        }
        ((Activity) context).startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), h);
        HMLog.i("Utils", "startActivityForResult...", new Object[0]);
        return false;
    }

    public static void enableGetMacAddress(final Context context, final View view, final String address) {
        if (context == null || view == null || TextUtils.isEmpty(address)) {
            return;
        }
        view.setOnLongClickListener(new View.OnLongClickListener() { // from class: c88
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                return Utils.q(context, address, view2);
            }
        });
    }

    public static final String formatDecimal(int number) {
        return new DecimalFormat(",###").format(number);
    }

    public static final String formatDecimalNoSeparator(int number) {
        return new DecimalFormat(UpdateUtils.CMD_FILTER).format(number);
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0083 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:? A[SYNTHETIC] */
    public static boolean generateFileFromAssets(Context context, String str, File file) throws Throwable {
        InputStream inputStream;
        FileOutputStream fileOutputStream = null;
        inputStreamOpen = null;
        InputStream inputStreamOpen = null;
        fileOutputStream = null;
        try {
            if (file.exists()) {
                HMLog.d("Utils", "delete file ret:" + file.delete(), new Object[0]);
            }
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                inputStreamOpen = context.getResources().getAssets().open(str);
                int iAvailable = inputStreamOpen.available();
                byte[] bArr = new byte[iAvailable];
                if (inputStreamOpen.read(bArr) != iAvailable) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException unused) {
                    }
                    try {
                        inputStreamOpen.close();
                    } catch (IOException unused2) {
                    }
                    return false;
                }
                fileOutputStream2.write(bArr);
                fileOutputStream2.flush();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
                try {
                    inputStreamOpen.close();
                    return true;
                } catch (IOException unused4) {
                    return true;
                }
            } catch (Exception e2) {
                e = e2;
                inputStream = inputStreamOpen;
                fileOutputStream = fileOutputStream2;
                try {
                    HMLog.d("Utils", e.getMessage(), new Object[0]);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused5) {
                        }
                    }
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused6) {
                        }
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused7) {
                        }
                    }
                    if (inputStream != null) {
                        throw th;
                    }
                    try {
                        inputStream.close();
                        throw th;
                    } catch (IOException unused8) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream = inputStreamOpen;
                fileOutputStream = fileOutputStream2;
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                if (inputStream != null) {
                    throw th;
                }
                inputStream.close();
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            inputStream = null;
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
        }
    }

    public static UserInfo getAlgoUserInfo() {
        UserInfo userInfo = new UserInfo();
        UserInfos userInfos = new UserInfos();
        HMPersonInfo.getInstance().getUserInfo().getUserInfos(userInfos);
        userInfo.gender = userInfos.getGender().intValue();
        userInfo.height = userInfos.getHeight().intValue();
        userInfo.weight = userInfos.getWeight().floatValue();
        userInfo.age = HMUserInfo.getAgeByDate(userInfos.getBirthday());
        userInfo.goal = getGoalStepsCount();
        HMLog.d("Utils", "gender=" + userInfo.gender + ",height=" + userInfo.height + ",weight=" + userInfo.weight + "age=" + userInfo.age + ",goal=" + userInfo.goal, new Object[0]);
        return userInfo;
    }

    public static String getApplicationName() {
        return "amazfit".equals(HMConfig.Channel.production()) ? "com.huami.app.amazfit" : w;
    }

    public static int getBarHeight() {
        return m;
    }

    public static String getCalculateTimeByMinute(Context context, int minute, int type) {
        int i2 = minute / 60;
        int i3 = minute % 60;
        if (type == 18) {
            return TimeUtils.formatTime(BraceletApp.getContext(), minute);
        }
        if (type != 17) {
            return "";
        }
        if (i2 == 0) {
            return i3 + context.getString(R.string.unit_min_long);
        }
        if (Language.isChinese()) {
            return i2 + context.getString(R.string.unit_hour_long) + i3 + context.getString(R.string.unit_min);
        }
        return i2 + context.getString(R.string.unit_hour_long) + " " + i3 + context.getString(R.string.unit_min);
    }

    public static float getDensity(Context context) {
        if (f < 0.0f) {
            if (context == null) {
                return 3.0f;
            }
            float f2 = context.getResources().getDisplayMetrics().density;
            f = f2;
            if (g < 0.0f) {
                g = f2;
            }
        }
        return f;
    }

    public static int getGoalStepsCount() {
        HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
        if (hMPersonInfo.getMiliConfig() == null) {
            return 8000;
        }
        return hMPersonInfo.getMiliConfig().getGoalStepsCount();
    }

    public static Gson getGson() {
        return HMHttpUtils.getGson();
    }

    public static String getMiuiVersionName(Context c2) {
        return getSystemProperties(c2, "ro.miui.ui.version.name");
    }

    public static String getMiuiWholeVersionInfo() {
        if (!MiuiAPI.isMiui(BraceletApp.getContext())) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("MIUI ");
        String systemProperties = getSystemProperties(BraceletApp.getContext(), "ro.miui.ui.version.name");
        HMLog.i("Utils", String.valueOf(systemProperties.charAt(0)), new Object[0]);
        if ("V".equalsIgnoreCase(String.valueOf(systemProperties.charAt(0))) && systemProperties.length() > 1) {
            systemProperties = systemProperties.substring(1);
        }
        stringBuffer.append(systemProperties);
        stringBuffer.append(StringUtil.SPACE);
        stringBuffer.append(Build.VERSION.INCREMENTAL);
        stringBuffer.append(StringUtil.SPACE);
        stringBuffer.append('|');
        stringBuffer.append(StringUtil.SPACE);
        stringBuffer.append(o());
        return stringBuffer.toString();
    }

    public static String getOSVersion() {
        return Build.VERSION.RELEASE;
    }

    public static float getOriginalDensity(Context context) {
        if (g < 0.0f) {
            getDensity(context);
        }
        HMLog.d("Utils", "sOriginialDensity " + g, new Object[0]);
        return g;
    }

    public static String getPhoneBand() {
        return Build.BRAND;
    }

    public static String getPhoneModel() {
        return Build.MODEL;
    }

    public static int getRealHeight(Context context, float dipValue) {
        float screenHeight = getScreenHeight();
        float barHeight = getBarHeight();
        StringBuilder sb = new StringBuilder();
        sb.append("screenHeight ");
        sb.append(screenHeight);
        sb.append(" barHeight ");
        sb.append(barHeight);
        sb.append(" shownHeight ");
        float f2 = screenHeight - barHeight;
        sb.append(f2);
        HMLog.d("Utils", sb.toString(), new Object[0]);
        float f3 = ((3.0f * dipValue) * f2) / 1920.0f;
        HMLog.d("Utils", "from value " + dipValue + " toValue " + f3, new Object[0]);
        return (int) (f3 + 0.5f);
    }

    public static int getScreenHeight() {
        return n;
    }

    public static int getScreenWidth() {
        return l;
    }

    public static String getShoesDistanceDescription() {
        int i2 = HMKeeper.getSharedPref().getInt("TOTAL_SHOES_ANALYSIS_MILES", 0);
        UnitManager unitManager = UnitManager.getInstance();
        String value = unitManager.formatValue(i2, true);
        String unitStr = unitManager.getUnitStr();
        if (HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.SHOES) == HMDeviceSource.SHOES_MARS) {
            return value + unitStr;
        }
        return value + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + (unitManager.isMetric() ? 800 : 500) + unitStr;
    }

    public static int getSleepTimeZone(DateData dateDate) {
        OriginSportData originSportDataJsonToSportData;
        if (dateDate == null || TextUtils.isEmpty(dateDate.getData()) || (originSportDataJsonToSportData = OriginSportData.jsonToSportData(dateDate.getData())) == null) {
            return 0;
        }
        return ProfileUtils.getTimezone((byte) originSportDataJsonToSportData.getTimezone()).getRawOffset();
    }

    public static void getStatisticInfo(FragmentActivity activity, HMDeviceType deviceType) {
        if (!HMDeviceManager.getInstance().hasBound(deviceType)) {
            Toast.makeText(activity, "设备未绑定!", 0).show();
            return;
        }
        HMBaseDevice device = HMDeviceManager.getInstance().getDevice(deviceType);
        if (device == null || !device.isConnected()) {
            Toast.makeText(activity, "设备未连接!", 0).show();
        } else {
            device.getStatisticInfo(new c(activity));
        }
    }

    public static String getStoragePath(Context c2) {
        String externalStorageState = Environment.getExternalStorageState();
        HMLog.d("Utils", "ext state =" + externalStorageState, new Object[0]);
        File externalFilesDir = "mounted".equals(externalStorageState) ? c2.getExternalFilesDir(b) : c2.getFilesDir();
        if (externalFilesDir == null) {
            externalFilesDir = c2.getFilesDir();
        }
        if (externalFilesDir == null) {
            return FileUtils.getExternalStorageDirectoryCompatible(c2).getPath() + File.separator + b;
        }
        String path = externalFilesDir.getPath();
        HMLog.d("Utils", "getStoragePath:" + path, new Object[0]);
        return path;
    }

    public static int getSystemLang() {
        if (Language.isSimplifiedChinese()) {
            return 0;
        }
        return Language.isTraditionalChinese() ? 1 : 2;
    }

    public static String getSystemProperties(Context context, String key) throws IllegalArgumentException {
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("android.os.SystemProperties");
            return (String) clsLoadClass.getMethod("get", String.class).invoke(clsLoadClass, key);
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (Exception unused) {
            return "";
        }
    }

    public static Calendar getTime(long millis) {
        Date date = new Date(millis);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar;
    }

    public static String getUserAgentNetTypeParmas() {
        String netType = NetUtil.getNetType(BraceletApp.getContext());
        if (netType.equals("wifi")) {
            return i;
        }
        if (netType.equals("2g")) {
            return "2G";
        }
        return (netType.equals("3g") || netType.equals("4g")) ? k : "";
    }

    public static String getVersionName(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 16384).versionName;
        } catch (Exception unused) {
            return "";
        }
    }

    public static void goAccountMifit(Context context) {
        WebHelper.launch(HMServerDef.getUrl(GlobalConfig.get().isBuildMidong() ? "t/account_midong" : "t/account_mifit"));
    }

    public static void goToMarket(Context context, String packageName) {
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + packageName)));
        } catch (ActivityNotFoundException e2) {
            e2.printStackTrace();
        }
    }

    public static String handleUUID() {
        String uuid = HMKeeper.readUUID();
        if (uuid != null && uuid.length() >= 1) {
            return uuid;
        }
        String string = UUID.randomUUID().toString();
        HMLog.d("Utils", "\nuuid new : " + string, new Object[0]);
        HMKeeper.keepUUID(string);
        return string;
    }

    public static boolean isAdultByMonth(String birth) {
        if (HMLoginManager.isInNonContinental()) {
            return Birthday.fromStr(birth).getAgeInMonths() >= ((HMLoginManager.isInUSA() ? 13 : 16) * 12) + 1;
        }
        return true;
    }

    public static boolean isFastDoubleClick(View view) {
        if (view.getId() != t) {
            s = System.currentTimeMillis();
            t = view.getId();
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = jCurrentTimeMillis - s;
        if (0 < j2 && j2 < 2000) {
            return true;
        }
        s = jCurrentTimeMillis;
        return false;
    }

    public static boolean isHK(Context context) {
        if (isPkgInstalled(context, "hk.alipay.wallet")) {
            return true;
        }
        String value = SelectAreaHelper.getAreaBySave().getValue();
        if (TextUtils.equals(value, "HK")) {
            return true;
        }
        if (TextUtils.equals(value, "unknown")) {
            return Country.isHK();
        }
        return false;
    }

    public static boolean isHydrogen() {
        return Build.DEVICE.equalsIgnoreCase("hydrogen");
    }

    public static final boolean isLocationServerOpen(final Context context) {
        if (Build.BRAND.equalsIgnoreCase("vivo")) {
            return m(context);
        }
        try {
            LocationManager locationManager = (LocationManager) context.getSystemService("location");
            return locationManager.isProviderEnabled("gps") || locationManager.isProviderEnabled("network");
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static boolean isManualDataSlpValid(String summary, String oldSum) {
        long jOptLong;
        long jOptLong2;
        int iOptInt;
        int iOptInt2;
        try {
            if (TextUtils.isEmpty(oldSum)) {
                JSONObject jSONObject = new JSONObject(summary);
                return jSONObject.optInt(Constant.PAI_KEY_DAILY_PAI) + jSONObject.optInt("lt") > 0 || ((long) jSONObject.optInt("ed")) - ((long) jSONObject.optInt(UserDataStore.STATE)) > 0;
            }
            JSONObject jSONObject2 = new JSONObject(oldSum).getJSONObject("slp");
            if (jSONObject2 != null) {
                jOptLong = jSONObject2.optLong(UserDataStore.STATE);
                jOptLong2 = jSONObject2.optLong("ed");
                iOptInt2 = jSONObject2.optInt(Constant.PAI_KEY_DAILY_PAI);
                iOptInt = jSONObject2.optInt("lt");
            } else {
                jOptLong = 0;
                jOptLong2 = 0;
                iOptInt = 0;
                iOptInt2 = 0;
            }
            JSONObject jSONObject3 = new JSONObject(summary);
            int iOptInt3 = jSONObject3.optInt(Constant.PAI_KEY_DAILY_PAI);
            int iOptInt4 = jSONObject3.optInt("lt");
            long jOptLong3 = jSONObject3.optLong(UserDataStore.STATE);
            long jOptLong4 = jSONObject3.optLong("ed");
            if (jOptLong2 - jOptLong <= 0 || iOptInt2 <= 0 || iOptInt <= 0) {
                return iOptInt3 + iOptInt4 > 0 || jOptLong4 - jOptLong3 > 0;
            }
            return iOptInt3 + iOptInt4 > 0 && jOptLong4 - jOptLong3 > 0;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static boolean isMiMax(Context context) {
        return isHydrogen() && getOriginalDensity(context) != 3.0f;
    }

    public static boolean isMiNote(Context context) {
        HMLog.d("Utils", "originalDensity " + getOriginalDensity(context), new Object[0]);
        return isVirgoLTE() && getOriginalDensity(context) != 3.0f;
    }

    public static boolean isOverseaUser() {
        return (Language.isSimplifiedChinese() && HMLoginManager.isInChina()) ? false : true;
    }

    public static boolean isPkgInstalled(Context context, String pkgName) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(pkgName, 0);
        } catch (Exception e2) {
            e2.printStackTrace();
            packageInfo = null;
        }
        return packageInfo != null;
    }

    public static boolean isServiceRunning(Context context, String className) {
        List<ActivityManager.RunningServiceInfo> runningServices = ((ActivityManager) context.getSystemService("activity")).getRunningServices(Integer.MAX_VALUE);
        if (runningServices == null || runningServices.size() <= 0) {
            return false;
        }
        Iterator<ActivityManager.RunningServiceInfo> it2 = runningServices.iterator();
        while (it2.hasNext()) {
            if (className.equals(it2.next().service.getClassName())) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSupportMIUIPay(Context context) {
        if (!isPkgInstalled(context, "com.mipay.wallet") || !HMServerDef.isProductUrl() || !MiuiAPI.isMiui(BraceletApp.getContext())) {
            return false;
        }
        try {
            return compareVersion() >= 0;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isVirgoLTE() {
        StringBuilder sb = new StringBuilder();
        sb.append("build .device ");
        String str = Build.DEVICE;
        sb.append(str);
        HMLog.d("Utils", sb.toString(), new Object[0]);
        return str.equalsIgnoreCase("virgo");
    }

    private static void l(ZipOutputStream zos, File srcFile, String excludeName) {
        HMLog.d("Utils", "Adding directory: " + srcFile.getName() + ",excludeName:" + excludeName, new Object[0]);
        File[] fileArrListFiles = srcFile.listFiles();
        for (int i2 = 0; i2 < fileArrListFiles.length; i2++) {
            if (fileArrListFiles[i2].isDirectory()) {
                l(zos, fileArrListFiles[i2], excludeName);
            } else if (TextUtils.isEmpty(excludeName) || !excludeName.equals(fileArrListFiles[i2].getName())) {
                try {
                    HMLog.d("Utils", "Adding file: " + fileArrListFiles[i2].getName(), new Object[0]);
                    byte[] bArr = new byte[1024];
                    FileInputStream fileInputStream = new FileInputStream(fileArrListFiles[i2]);
                    zos.putNextEntry(new ZipEntry(fileArrListFiles[i2].getName()));
                    while (true) {
                        int i3 = fileInputStream.read(bArr);
                        if (i3 <= 0) {
                            break;
                        } else {
                            zos.write(bArr, 0, i3);
                        }
                    }
                    zos.closeEntry();
                    fileInputStream.close();
                } catch (IOException e2) {
                    HMLog.d("Utils", "IOException :" + e2, new Object[0]);
                }
            }
        }
    }

    private static boolean m(final Context context) {
        try {
            return Settings.Secure.getInt(context.getContentResolver(), "location_mode") != 0;
        } catch (Settings.SettingNotFoundException unused) {
            return false;
        }
    }

    private static void n() {
        List<UserInfos> allInfosNotWithSelf = UserInfoManager.getManager().getAllInfosNotWithSelf();
        if (allInfosNotWithSelf == null || allInfosNotWithSelf.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (UserInfos userInfos : allInfosNotWithSelf) {
            if (!isAdultByMonth(userInfos.getBirthday()) && !HMPropertyUtil.getPropertyToWeightPermission(userInfos.getUserId())) {
                arrayList.add(userInfos);
                HMDaoManager.getInstance().getWeightInfosDao().queryBuilder().where(WeightInfosDao.Properties.UserId.eq(userInfos.getUserId()), WeightInfosDao.Properties.Type.notEq(3)).buildDelete().executeDeleteWithoutDetachingEntities();
            }
        }
        if (!arrayList.isEmpty()) {
            HMDaoManager.getInstance().getUserInfosDao().deleteInTx(arrayList);
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("state", Boolean.TRUE);
        jsonObject.addProperty("time", Long.valueOf(System.currentTimeMillis() / 1000));
        HMPropertyUtil.setProperty(Property.PROPERTY_UNDER_AGE_LOCAL_DATAS_DELETED, jsonObject.toString());
        HMPropertyUtil.postPropertisToServer(true);
    }

    private static String o() {
        if (MiuiAPI.isMiuiStableVersion()) {
            return o;
        }
        if (MiuiAPI.isMiuiDevelopmentVersion()) {
            return q;
        }
        return MiuiAPI.isMiuiAlphaVersion(BraceletApp.getContext()) ? p : "";
    }

    private static boolean p(char c2) {
        return Pattern.compile("[^\\x00-\\xff]").matcher(String.valueOf(c2)).matches();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean q(Context context, String str, View view) {
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
        if (clipboardManager == null) {
            return true;
        }
        clipboardManager.setPrimaryClip(ClipData.newPlainText(TakePicSettingActivity.KEY_ADDRESS, str));
        CustomToast.makeText(context, context.getString(R.string.mac_address_copied), 0).show();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void r(View view) {
        if (view.getParent() instanceof View) {
            ((View) view.getParent()).setTouchDelegate(null);
        }
    }

    public static void removeViewTouchDelegate(final View view) {
        ((View) view.getParent()).post(new Runnable() { // from class: d88
            @Override // java.lang.Runnable
            public final void run() {
                Utils.r(view);
            }
        });
    }

    public static double round(double v2, int scale) {
        if (scale >= 0) {
            return new BigDecimal(DecimalUtil.doubleToStr(Double.valueOf(v2))).divide(BigDecimal.ONE, scale, 4).doubleValue();
        }
        throw new IllegalArgumentException("The scale must be a positive integer or zero");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void s(View view, int i2, int i3, int i4, int i5) {
        Rect rect = new Rect();
        view.setEnabled(true);
        view.getHitRect(rect);
        rect.top -= i2;
        rect.bottom += i3;
        rect.left -= i4;
        rect.right += i5;
        TouchDelegate touchDelegate = new TouchDelegate(rect, view);
        if (view.getParent() instanceof View) {
            ((View) view.getParent()).setTouchDelegate(touchDelegate);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static boolean saveBitmapToFile(String imagePath, Bitmap bmp, int quality) throws Throwable {
        FileOutputStream fileOutputStream;
        Throwable th;
        Exception e2;
        File file = new File(imagePath);
        if (file.exists()) {
            file.delete();
        }
        boolean zCompress = false;
        try {
            fileOutputStream = new FileOutputStream(file);
            try {
                try {
                    zCompress = bmp.compress(Bitmap.CompressFormat.JPEG, quality, fileOutputStream);
                } catch (Exception e3) {
                    e2 = e3;
                    HMLog.e("Utils", e2.getMessage(), new Object[0]);
                    if (fileOutputStream != null) {
                    }
                    return zCompress;
                }
            } catch (Throwable th2) {
                th = th2;
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                    }
                }
                throw th;
            }
        } catch (Exception e4) {
            fileOutputStream = null;
            e2 = e4;
        } catch (Throwable th3) {
            fileOutputStream = null;
            th = th3;
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            throw th;
        }
        try {
            fileOutputStream.close();
        } catch (IOException unused2) {
        }
        return zCompress;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x003c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static boolean saveBitmapToPngFile(String imagePath, Bitmap bmp) throws Throwable {
        FileOutputStream fileOutputStream;
        Throwable th;
        Exception e2;
        File file = new File(imagePath);
        if (file.exists()) {
            file.delete();
        }
        boolean zCompress = false;
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
                try {
                    zCompress = bmp.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                } catch (Exception e3) {
                    e2 = e3;
                    HMLog.e("Utils", e2.getMessage(), new Object[0]);
                    if (fileOutputStream != null) {
                    }
                    return zCompress;
                }
            } catch (Throwable th2) {
                th = th2;
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                    }
                }
                throw th;
            }
        } catch (Exception e4) {
            fileOutputStream = null;
            e2 = e4;
        } catch (Throwable th3) {
            fileOutputStream = null;
            th = th3;
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            throw th;
        }
        try {
            fileOutputStream.close();
        } catch (IOException unused2) {
        }
        return zCompress;
    }

    public static void setBarHeight(int height) {
        m = height;
    }

    public static void setScreenHeight(int height) {
        n = height;
    }

    public static void setScreenWidth(int width) {
        l = width;
    }

    public static void setViewTouchDelegate(final View view, final int top, final int bottom, final int left, final int right) {
        ((View) view.getParent()).post(new Runnable() { // from class: e88
            @Override // java.lang.Runnable
            public final void run() {
                Utils.s(view, top, bottom, left, right);
            }
        });
    }

    public static boolean shouldHideDiscovery() {
        return (Language.isSimplifiedChinese() && HMLoginManager.isInChina()) ? false : true;
    }

    public static boolean shouldShowAd() {
        return Language.isSimplifiedChinese() && HMLoginManager.isInChina();
    }

    public static void showDeleteAllMemberDataRequestDialog(final AppCompatActivity activity, final WeightGrantRequestDialogLis lis) {
        new AlertDialogFragment.Builder(activity).setCancelable(false).setTitle(R.string.delete_data_request).setMessage(activity.getString(R.string.delete_data_request_content, new Object[]{String.valueOf(HMLoginManager.isInUSA() ? 13 : 16), String.valueOf(30), String.valueOf(30)})).setNegativeButton(R.string.common_export, new DialogInterface.OnClickListener() { // from class: y78
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                Utils.u(lis, activity, dialogInterface, i2);
            }
        }).setPositiveButton(R.string.ble_known, new DialogInterface.OnClickListener() { // from class: x78
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                Utils.t(lis, dialogInterface, i2);
            }
        }).show(activity.getSupportFragmentManager());
    }

    public static void showGotoLocationServerDialog(final AppCompatActivity activity) {
        new AlertDialogFragment.Builder(activity).setTitle(R.string.loaction_tips).setMessage(R.string.open_loaction_msg).setPositiveButton(R.string.per_go_setting, new DialogInterface.OnClickListener() { // from class: n88
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                Utils.v(activity, dialogInterface, i2);
            }
        }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: a88
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                Utils.w(dialogInterface, i2);
            }
        }).create().show(activity.getSupportFragmentManager());
    }

    public static void showGrantWeightDataRequestDialog(AppCompatActivity activity, final String userId, final WeightGrantRequestDialogLis lis) {
        if (!HMLoginManager.isInNonContinental()) {
            lis.requestResult(true);
        } else if (HMPropertyUtil.getPropertyToWeightPermission(userId)) {
            HMLog.d("Utils", "has granted and return", new Object[0]);
            lis.requestResult(true);
        } else {
            String strValueOf = String.valueOf(HMLoginManager.isInUSA() ? 13 : 16);
            new AlertDialogFragment.Builder(activity).setCancelable(false).setTitle(R.string.collection_data_request).setMessage("all_member".equals(userId) ? activity.getString(R.string.collection_data_request_member_content, new Object[]{strValueOf}) : activity.getString(R.string.collection_data_request_content, new Object[]{strValueOf})).setNegativeButton(R.string.label_refuse, new DialogInterface.OnClickListener() { // from class: w78
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    lis.requestResult(false);
                }
            }).setPositiveButton(R.string.agree, new DialogInterface.OnClickListener() { // from class: z78
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    Utils.y(userId, lis, dialogInterface, i2);
                }
            }).show(activity.getSupportFragmentManager());
        }
    }

    public static void showNoSdcardPermissionDialog(final AppCompatActivity activity) {
        new AlertDialogFragment.Builder(activity).setTitle(R.string.no_sdcard_permission_title).setMessage(R.string.no_sdcard_permission_messgae).setCancelable(false).setNegativeButton(R.string.cancel, new b()).setPositiveButton(R.string.per_go_setting, new a(activity)).show(activity.getSupportFragmentManager());
    }

    public static void showPermissionDenieDialog(final AppCompatActivity activity, String msd) {
        new AlertDialogFragment.Builder(activity).setTitle(R.string.permisson_tips_dialog_title).setMessage(msd).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: b88
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                Utils.z(dialogInterface, i2);
            }
        }).setPositiveButton(R.string.per_go_setting, new DialogInterface.OnClickListener() { // from class: v78
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                Utils.startAppSettings(activity);
            }
        }).show(activity.getSupportFragmentManager());
    }

    public static void showSetDeviceSettingResult(Context context, boolean result) {
        if (result) {
            IconToast.showSuccess(context, R.string.long_sit_set_success);
        } else {
            IconToast.showError(context, R.string.long_sit_set_failed);
        }
    }

    public static void showSetFailedToast(Context context, boolean isOpen) {
        IconToast.showError(context, isOpen ? context.getResources().getString(R.string.mili_setting_sleep_assist_open_failed) : context.getResources().getString(R.string.mili_setting_sleep_assist_close_failed));
    }

    public static int sp2px(Context context, float spValue) {
        return (int) ((spValue * context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public static void startAppSettings(final Context context) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + context.getPackageName()));
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e2) {
            e2.printStackTrace();
            intent.setAction("android.settings.APPLICATION_SETTINGS");
            context.startActivity(intent);
        }
    }

    public static String substring(String str, int maxLength) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < str.length()) {
            i3 = p(str.charAt(i2)) ? i3 + 2 : i3 + 1;
            if (i3 > maxLength) {
                break;
            }
            i2++;
        }
        return str.substring(0, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void t(WeightGrantRequestDialogLis weightGrantRequestDialogLis, DialogInterface dialogInterface, int i2) {
        n();
        weightGrantRequestDialogLis.requestResult(true);
    }

    public static Drawable tintDrawable(Drawable drawable, ColorStateList colors) {
        Drawable drawableWrap = DrawableCompat.wrap(drawable);
        DrawableCompat.setTintList(drawableWrap, colors);
        return drawableWrap;
    }

    public static void toast(Context context, int resId, int duration) {
        Toast.makeText(context, resId, duration).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void u(WeightGrantRequestDialogLis weightGrantRequestDialogLis, AppCompatActivity appCompatActivity, DialogInterface dialogInterface, int i2) {
        weightGrantRequestDialogLis.requestResult(false);
        n();
        goAccountMifit(appCompatActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void v(AppCompatActivity appCompatActivity, DialogInterface dialogInterface, int i2) {
        appCompatActivity.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void w(DialogInterface dialogInterface, int i2) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void y(String str, WeightGrantRequestDialogLis weightGrantRequestDialogLis, DialogInterface dialogInterface, int i2) {
        HMPropertyUtil.setPropertyToWeightPermission(str);
        weightGrantRequestDialogLis.requestResult(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void z(DialogInterface dialogInterface, int i2) {
    }

    public static boolean archiveDir(String dir, File zipFile, String excludeName) {
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(zipFile));
            l(zipOutputStream, new File(dir), excludeName);
            zipOutputStream.close();
            return true;
        } catch (IOException e2) {
            HMLog.d("Utils", "Error creating zip file: " + e2, new Object[0]);
            return false;
        }
    }

    public static Calendar dateFormat(String birth, String pattern) {
        try {
            Date date = new SimpleDateFormat(pattern, Locale.getDefault()).parse(birth);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            return calendar;
        } catch (ParseException unused) {
            HMLog.d("Utils", "dateFormat ParseException", new Object[0]);
            return null;
        } catch (Exception unused2) {
            HMLog.d("Utils", "dateFormat Exception", new Object[0]);
            return null;
        }
    }

    public static final String formatDecimal(String number) {
        return formatDecimal(Integer.parseInt(number));
    }
}
