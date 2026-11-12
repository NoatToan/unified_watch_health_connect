package com.xiaomi.hm.health.device.firmware;

import android.app.Activity;
import android.content.Context;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.HMOtherVersion;
import com.xiaomi.hm.health.bt.profile.base.HardwareInfo;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.device.BaseEarbudDeviceActivity;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Lazy;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes20.dex */
public class HMFwUtils {
    private static final String a = "HMFwUtils";
    private static final Lazy<DeviceUtilsApi> b = KoinJavaComponent.inject(DeviceUtilsApi.class);

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[HMDeviceSource.values().length];
            a = iArr;
            try {
                iArr[HMDeviceSource.MILI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[HMDeviceSource.SHOES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[HMDeviceSource.WEIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[HMDeviceSource.MILI_1A.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[HMDeviceSource.MILI_1S.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[HMDeviceSource.MILI_NFC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[HMDeviceSource.MILI_PRO.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[HMDeviceSource.MILI_PEYTO.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[HMDeviceSource.MILI_PRO_I.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[HMDeviceSource.MILI_ROCKY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[HMDeviceSource.MILI_TEMPO.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[HMDeviceSource.MILI_WUHAN.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[HMDeviceSource.MILI_CHONGQING.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[HMDeviceSource.SHOES_MARS.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[HMDeviceSource.SHOES_CHILD.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[HMDeviceSource.SHOES_LIGHT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[HMDeviceSource.MILI_QINLING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[HMDeviceSource.SHOES_SPRANDI.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                a[HMDeviceSource.WEIGHT_BODYFAT.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                a[HMDeviceSource.MILI_BEATS.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                a[HMDeviceSource.MILI_BEATS_P.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                a[HMDeviceSource.MILI_DTH.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                a[HMDeviceSource.MILI_BEATS_W.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                a[HMDeviceSource.MILI_DTH_W.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                a[HMDeviceSource.WEIGHT_BFS.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                a[HMDeviceSource.OTHER_BM.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                a[HMDeviceSource.WEIGHT_SCALE2.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                a[HMDeviceSource.MILI_CINCO.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                a[HMDeviceSource.MILI_CINCO_L.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                a[HMDeviceSource.MILI_TONLESAP.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                a[HMDeviceSource.MILI_TONLESAP_L.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                a[HMDeviceSource.MILI_TONLESAP_O.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                a[HMDeviceSource.MILI_TONLESAP_OL.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                a[HMDeviceSource.MILI_PYH.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                a[HMDeviceSource.MILI_PYH_W.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                a[HMDeviceSource.MILI_RIO.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                a[HMDeviceSource.MILI_FALCON.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                a[HMDeviceSource.MILI_FALCON_W.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                a[HMDeviceSource.MILI_PEYTO_L.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                a[HMDeviceSource.MILI_PEYTO_WL.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
        }
    }

    public static boolean allowDataSync(HMDeviceType hMDeviceType) {
        Activity topActivity = DeviceXFunctionsKt.getAppStateApi().getTopActivity();
        if (topActivity == null) {
            return true;
        }
        IHMFwUpgradeInfo upgradeInfo = (DeviceXFunctionsKt.getBuildConfigApi().isSupportCloudFwUpgrade() && HMFwOnlineUpgradeManager.getInstance().useOnline(hMDeviceType)) ? HMFwOnlineUpgradeManager.getInstance().getUpgradeInfo() : HMFwUpgradeManager.getInstance().getUpgradeInfo();
        return (upgradeInfo != null && upgradeInfo.getDeviceSource().getType() == hMDeviceType && (topActivity instanceof HMFwUpgradeFailedActivity)) ? false : true;
    }

    public static boolean allowEarbudDataSync() {
        Activity topActivity = DeviceXFunctionsKt.getAppStateApi().getTopActivity();
        if (topActivity == null) {
            return true;
        }
        return !(topActivity instanceof BaseEarbudDeviceActivity);
    }

    public static String convertVersionCodeToName(int i) {
        String str = ((i >> 24) & 255) + "." + ((i >> 16) & 255) + "." + ((i >> 8) & 255) + "." + (i & 255);
        HMLog.d(a, "versionName:" + str, new Object[0]);
        return str;
    }

    public static void deleteFwFile(HMFwUpgradeInfo hMFwUpgradeInfo) {
        boolean isFromFileFw = hMFwUpgradeInfo.getIsFromFileFw();
        if (hMFwUpgradeInfo.getFwType() == 1 || hMFwUpgradeInfo.getIsFromFileFw()) {
            if (hMFwUpgradeInfo.getIsFromFileFw()) {
                HMLog.i(a, "is from isFwFile , not delete !", new Object[0]);
                return;
            } else {
                HMLog.i(a, " fw upgrade is 1s，need twice upgrade , not delete ! ", new Object[0]);
                return;
            }
        }
        HMLog.d(a, "delete file ret:" + (!isFromFileFw ? generateFwFileFromAssets(hMFwUpgradeInfo.getContext(), hMFwUpgradeInfo.getFwName()).delete() : hMFwUpgradeInfo.deleteFwFile()), new Object[0]);
    }

    public static File generateFwFileFromAssets(Context context, String str) {
        String str2 = context.getFilesDir().getPath() + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + str;
        HMLog.d(a, "generateFwFileFromAssets:" + str2, new Object[0]);
        File file = new File(str2);
        b.getValue().generateFileFromAssets(context, str, file);
        return file;
    }

    public static int getCurrentFontFlag(HMDeviceSource hMDeviceSource, String str) {
        if (hMDeviceSource == HMDeviceSource.MILI_WUHAN) {
            if (HardwareInfo.isYD(str)) {
                return 4;
            }
            if (b.getValue().isSupportWuhanLanguage()) {
                if (Language.isJapanese() || Language.isKorean()) {
                    return 4;
                }
                if (Language.isSimplifiedChinese() || Language.isTraditionalChinese()) {
                    return 1;
                }
                return Language.isEnglish() ? -1 : 2;
            }
            if (HardwareInfo.isInland(str)) {
                return 1;
            }
        } else {
            if (hMDeviceSource == HMDeviceSource.MILI_PEYTO || hMDeviceSource == HMDeviceSource.MILI_PEYTO_L || hMDeviceSource == HMDeviceSource.MILI_PEYTO_WL) {
                HardwareInfo hardwareInfo = HardwareInfo.parseHardwareInfo(str);
                if (hardwareInfo == null || !hardwareInfo.isInland()) {
                    return (Language.isSpainish() || Language.isRussia() || Language.isGerman() || Language.isItalian() || Language.isFrench() || Language.isTurkish()) ? 2 : 1;
                }
                return 1;
            }
            if (hMDeviceSource == HMDeviceSource.MILI_TEMPO) {
                HardwareInfo hardwareInfo2 = HardwareInfo.parseHardwareInfo(str);
                if (hardwareInfo2 == null || !hardwareInfo2.isInland()) {
                    return (Language.isSpainish() || Language.isRussia()) ? 2 : 1;
                }
                return 1;
            }
            if (hMDeviceSource == HMDeviceSource.MILI_DTH_W) {
                if (Language.isKorean()) {
                    return 4;
                }
                return (Language.isSimplifiedChinese() || Language.isTraditionalChinese() || Language.isEnglish()) ? 1 : 2;
            }
            if (hMDeviceSource == HMDeviceSource.MILI_BEATS_W) {
                return (Language.isSpainish() || Language.isRussia()) ? 2 : 1;
            }
            if (hMDeviceSource == HMDeviceSource.MILI_PRO || hMDeviceSource == HMDeviceSource.MILI_NFC || hMDeviceSource == HMDeviceSource.MILI_PRO_I || hMDeviceSource == HMDeviceSource.MILI_ROCKY || hMDeviceSource == HMDeviceSource.MILI_QINLING) {
                if (Language.isSimplifiedChinese()) {
                    return 255;
                }
                if (Language.isEnglish()) {
                    return 0;
                }
            } else {
                if (hMDeviceSource == HMDeviceSource.MILI_TONLESAP_O || hMDeviceSource == HMDeviceSource.MILI_TONLESAP_OL || hMDeviceSource == HMDeviceSource.MILI_PYH || hMDeviceSource == HMDeviceSource.MILI_PYH_W || hMDeviceSource == HMDeviceSource.MILI_FALCON || hMDeviceSource == HMDeviceSource.MILI_FALCON_W) {
                    return 1;
                }
                if (hMDeviceSource == HMDeviceSource.MILI_RIO) {
                    return 2;
                }
                if (hMDeviceSource == HMDeviceSource.MILI_CINCO) {
                    return 1;
                }
                if (hMDeviceSource == HMDeviceSource.MILI_CINCO_L) {
                    return (Language.isSpainish() || Language.isRussia()) ? 2 : 1;
                }
            }
        }
        return -1;
    }

    public static int getFontVersion(HMOtherVersion hMOtherVersion, String str, HMDeviceSource hMDeviceSource) {
        int fontVersion = hMOtherVersion.getFontVersion();
        int fontFlag = hMOtherVersion.getFontFlag();
        int currentFontFlag = getCurrentFontFlag(hMDeviceSource, str);
        if (currentFontFlag == -1) {
            return fontVersion;
        }
        if (currentFontFlag == 0 || currentFontFlag == 255) {
            if (fontFlag != currentFontFlag) {
                return -1;
            }
            return fontVersion;
        }
        if ((fontFlag & currentFontFlag) == 0) {
            return -1;
        }
        return fontVersion;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x005e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static byte[] getFwDataFromAssets(Context context, String str) throws Throwable {
        InputStream inputStreamOpen;
        InputStream inputStream = null;
        try {
            inputStreamOpen = context.getResources().getAssets().open(str);
            try {
                try {
                    int iAvailable = inputStreamOpen.available();
                    byte[] bArr = new byte[iAvailable];
                    if (inputStreamOpen.read(bArr) != iAvailable) {
                        try {
                            inputStreamOpen.close();
                        } catch (IOException e) {
                            HMLog.d(a, e.toString(), new Object[0]);
                        }
                        return null;
                    }
                    try {
                        inputStreamOpen.close();
                    } catch (IOException e2) {
                        HMLog.d(a, e2.toString(), new Object[0]);
                    }
                    return bArr;
                } catch (Exception e3) {
                    e = e3;
                    HMLog.d(a, e.getMessage(), new Object[0]);
                    if (inputStreamOpen != null) {
                        try {
                            inputStreamOpen.close();
                        } catch (IOException e4) {
                            HMLog.d(a, e4.toString(), new Object[0]);
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                inputStream = inputStreamOpen;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e5) {
                        HMLog.d(a, e5.toString(), new Object[0]);
                    }
                }
                throw th;
            }
        } catch (Exception e6) {
            e = e6;
            inputStreamOpen = null;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }

    public static int getFwOrder(Context context, String str) {
        int fwOrder = -1;
        InputStream inputStreamOpen = null;
        try {
            try {
                inputStreamOpen = context.getResources().getAssets().open(str);
                long jSkip = inputStreamOpen.skip(inputStreamOpen.available() - 96);
                byte[] bArr = new byte[32];
                int i = inputStreamOpen.read(bArr);
                HMFwHeader hMFwHeader = HMFwHeader.parse(bArr);
                HMLog.d(a, "HMFwHeader:" + hMFwHeader, new Object[0]);
                HMLog.d(a, "skip:" + jSkip + ";read:" + i, new Object[0]);
                if (hMFwHeader != null && hMFwHeader.isValid()) {
                    fwOrder = hMFwHeader.getFwOrder();
                }
                try {
                    inputStreamOpen.close();
                } catch (IOException e) {
                    HMLog.d(a, e.toString(), new Object[0]);
                }
                return fwOrder;
            } catch (Exception e2) {
                HMLog.d(a, e2.getMessage(), new Object[0]);
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (IOException e3) {
                        HMLog.d(a, e3.toString(), new Object[0]);
                    }
                }
                return -1;
            }
        } catch (Throwable th) {
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (IOException e4) {
                    HMLog.d(a, e4.toString(), new Object[0]);
                }
            }
            throw th;
        }
    }

    public static String getInfoFtType(HMDeviceSource hMDeviceSource, String str, int i) {
        int currentFontFlag = getCurrentFontFlag(hMDeviceSource, str);
        if (HMDeviceConfig.hasFeatureLatinFw(hMDeviceSource)) {
            if (currentFontFlag == 2) {
                return com.xiaomi.hm.health.device.firmware.a.Z;
            }
            return currentFontFlag == 4 ? com.xiaomi.hm.health.device.firmware.a.a0 : "ft";
        }
        if (hMDeviceSource == HMDeviceSource.MILI_WUHAN) {
            if (currentFontFlag == 2) {
                return ((i & 1) == 0 && (i & 4) != 0) ? com.xiaomi.hm.health.device.firmware.a.a0 : "ft";
            }
            if (currentFontFlag == 4) {
                return com.xiaomi.hm.health.device.firmware.a.a0;
            }
            if (currentFontFlag == 1) {
                return "ft";
            }
            return null;
        }
        if (hMDeviceSource == HMDeviceSource.MILI_RIO) {
            return com.xiaomi.hm.health.device.firmware.a.Z;
        }
        if (currentFontFlag == 0) {
            return com.xiaomi.hm.health.device.firmware.a.Y;
        }
        if (currentFontFlag == 255) {
            return "ft";
        }
        return null;
    }

    public static String getInfoFwType(String str, HMDeviceSource hMDeviceSource) {
        if (!HMDeviceConfig.hasFeatureLatinFw(hMDeviceSource)) {
            return "fw";
        }
        int currentFontFlag = getCurrentFontFlag(hMDeviceSource, str);
        if (currentFontFlag == 2) {
            return com.xiaomi.hm.health.device.firmware.a.Q;
        }
        return currentFontFlag == 4 ? com.xiaomi.hm.health.device.firmware.a.R : "fw";
    }

    public static String getInfoResType(String str, HMDeviceSource hMDeviceSource) {
        if (!HMDeviceConfig.hasFeatureLatinFw(hMDeviceSource)) {
            return "res";
        }
        int currentFontFlag = getCurrentFontFlag(hMDeviceSource, str);
        if (currentFontFlag == 2) {
            return com.xiaomi.hm.health.device.firmware.a.U;
        }
        return currentFontFlag == 4 ? com.xiaomi.hm.health.device.firmware.a.V : "res";
    }

    public static int getResVersion(HMOtherVersion hMOtherVersion, String str, HMDeviceSource hMDeviceSource) {
        int resourceVersion = hMOtherVersion.getResourceVersion();
        if (!HMDeviceConfig.hasFeatureLatinFw(hMDeviceSource) || (hMOtherVersion.getResourceFlag() & getCurrentFontFlag(hMDeviceSource, str)) != 0) {
            return resourceVersion;
        }
        HMLog.i(a, "flag not match,need upgrade!", new Object[0]);
        return -1;
    }

    public static String getType(HMDeviceSource hMDeviceSource) {
        switch (a.a[hMDeviceSource.ordinal()]) {
            case 1:
                return com.xiaomi.hm.health.device.firmware.a.v;
            case 2:
                return com.xiaomi.hm.health.device.firmware.a.r;
            case 3:
                return "weight";
            case 4:
                return com.xiaomi.hm.health.device.firmware.a.w;
            case 5:
                return com.xiaomi.hm.health.device.firmware.a.x;
            case 6:
                return com.xiaomi.hm.health.device.firmware.a.k;
            case 7:
                return com.xiaomi.hm.health.device.firmware.a.g;
            case 8:
                return com.xiaomi.hm.health.device.firmware.a.d;
            case 9:
                return com.xiaomi.hm.health.device.firmware.a.n;
            case 10:
                return com.xiaomi.hm.health.device.firmware.a.l;
            case 11:
                return com.xiaomi.hm.health.device.firmware.a.f;
            case 12:
                return com.xiaomi.hm.health.device.firmware.a.b;
            case 13:
                return com.xiaomi.hm.health.device.firmware.a.a;
            case 14:
                return com.xiaomi.hm.health.device.firmware.a.o;
            case 15:
                return com.xiaomi.hm.health.device.firmware.a.s;
            case 16:
                return com.xiaomi.hm.health.device.firmware.a.t;
            case 17:
                return com.xiaomi.hm.health.device.firmware.a.m;
            case 18:
                return com.xiaomi.hm.health.device.firmware.a.u;
            case 19:
                return com.xiaomi.hm.health.device.firmware.a.q;
            case 20:
                return com.xiaomi.hm.health.device.firmware.a.y;
            case 21:
                return com.xiaomi.hm.health.device.firmware.a.A;
            case 22:
                return com.xiaomi.hm.health.device.firmware.a.B;
            case 23:
                return com.xiaomi.hm.health.device.firmware.a.z;
            case 24:
                return com.xiaomi.hm.health.device.firmware.a.C;
            case 25:
                return com.xiaomi.hm.health.device.firmware.a.F;
            case 26:
                return com.xiaomi.hm.health.device.firmware.a.G;
            case 27:
                return com.xiaomi.hm.health.device.firmware.a.H;
            case 28:
            case 29:
                return com.xiaomi.hm.health.device.firmware.a.I;
            case 30:
            case 31:
            case 32:
            case 33:
                return com.xiaomi.hm.health.device.firmware.a.J;
            case 34:
                return com.xiaomi.hm.health.device.firmware.a.K;
            case 35:
                return com.xiaomi.hm.health.device.firmware.a.L;
            case 36:
                return com.xiaomi.hm.health.device.firmware.a.O;
            case 37:
                return com.xiaomi.hm.health.device.firmware.a.M;
            case 38:
                return com.xiaomi.hm.health.device.firmware.a.N;
            case 39:
            case 40:
                return com.xiaomi.hm.health.device.firmware.a.e;
            default:
                return null;
        }
    }

    public static int getVersionCode(String str) {
        return ProfileUtils.getVersionCodeFromVersionName(str);
    }

    public static boolean isFwCondition(DeviceInfo deviceInfo, HMFirmware hMFirmware) {
        int versionCodeFromVersionName = ProfileUtils.getVersionCodeFromVersionName(hMFirmware.getFwVersion());
        int firmwareVersion = deviceInfo.getFirmwareVersion();
        HMDeviceSource deviceSource = deviceInfo.getDeviceSource();
        boolean z = (versionCodeFromVersionName == -1 || firmwareVersion == -1 || versionCodeFromVersionName <= firmwareVersion) ? false : true;
        if (!HMDeviceConfig.hasFeatureLatinFw(deviceSource)) {
            return z;
        }
        int currentFontFlag = getCurrentFontFlag(deviceSource, deviceInfo.getHardwareVersionStr());
        HMOtherVersion otherVersion = deviceInfo.getOtherVersion();
        if (otherVersion == null) {
            return false;
        }
        int fwFlag = otherVersion.getFwFlag();
        return fwFlag == -1 || (fwFlag & currentFontFlag) == 0 || z;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:? A[SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0102: MOVE (r2 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:43:0x0101 */
    public static HashMap<String, b> loadFirmwareInfos(Context context) throws Throwable {
        Throwable th;
        InputStream inputStream;
        InputStream inputStreamOpen;
        InputStream inputStream2;
        JSONObject jSONObject;
        String[] strArr;
        try {
            try {
                HashMap<String, b> map = new HashMap<>();
                inputStreamOpen = context.getAssets().open("firmwares.json");
                try {
                    byte[] bArr = new byte[inputStreamOpen.available()];
                    inputStreamOpen.read(bArr);
                    JSONObject jSONObject2 = new JSONObject(new String(bArr, Charset.defaultCharset()));
                    String[] strArr2 = com.xiaomi.hm.health.device.firmware.a.e0;
                    int length = strArr2.length;
                    int i = 0;
                    while (i < length) {
                        String str = strArr2[i];
                        if (jSONObject2.has(str)) {
                            b bVar = new b(str);
                            JSONObject jSONObject3 = jSONObject2.getJSONObject(str);
                            String[] strArr3 = com.xiaomi.hm.health.device.firmware.a.f0;
                            int length2 = strArr3.length;
                            int i2 = 0;
                            while (i2 < length2) {
                                String str2 = strArr3[i2];
                                if (jSONObject3.has(str2)) {
                                    JSONObject jSONObject4 = jSONObject3.getJSONObject(str2);
                                    bVar.a(str2, new HMFirmware(jSONObject4.getString("name"), jSONObject4.optString("version")));
                                }
                                i2++;
                                jSONObject2 = jSONObject2;
                                strArr2 = strArr2;
                            }
                            jSONObject = jSONObject2;
                            strArr = strArr2;
                            map.put(str, bVar);
                        } else {
                            jSONObject = jSONObject2;
                            strArr = strArr2;
                        }
                        i++;
                        jSONObject2 = jSONObject;
                        strArr2 = strArr;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("\n");
                    Iterator<b> it2 = map.values().iterator();
                    while (it2.hasNext()) {
                        sb.append(it2.next().toString());
                    }
                    HMLog.i(a, sb.toString(), new Object[0]);
                    try {
                        inputStreamOpen.close();
                    } catch (Exception e) {
                        HMLog.d(a, e.toString(), new Object[0]);
                    }
                    return map;
                } catch (Exception e2) {
                    e = e2;
                    HMLog.i(a, "exception:" + e.getMessage(), new Object[0]);
                    if (inputStreamOpen == null) {
                        return null;
                    }
                    try {
                        inputStreamOpen.close();
                        return null;
                    } catch (Exception e3) {
                        HMLog.d(a, e3.toString(), new Object[0]);
                        return null;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream = inputStream2;
                if (inputStream != null) {
                    throw th;
                }
                try {
                    inputStream.close();
                    throw th;
                } catch (Exception e4) {
                    HMLog.d(a, e4.toString(), new Object[0]);
                    throw th;
                }
            }
        } catch (Exception e5) {
            e = e5;
            inputStreamOpen = null;
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
            if (inputStream != null) {
                throw th;
            }
            inputStream.close();
            throw th;
        }
    }
}
