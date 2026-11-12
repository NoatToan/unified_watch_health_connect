package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.health.h5pro.utils.GeneralUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.utils.OperationUtilsApi;
import com.huawei.operation.utils.PhoneInfoUtils;
import com.huawei.pluginachievement.R;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.profile.profile.ProfileExtendConstants;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class pax {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f45101a;
    private static final List<String> d = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19");
    private static final List<String> e = Arrays.asList("D1", "D2", "C6", "C7", "B8", "B9", "B10", "B11", "B12", "B13", "B14", "B15", "B16", "B17", "B18", "B19", "B20", "B21", "B22");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List<String> f45103c = Arrays.asList("B11", "B12", "B13", "B14", "B15", "B16", "B17", "B18", "B19", "B20", "B21", "B22");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f45102b = {"A5", "A10", "A20", "A40", WatchFaceConstant.PRESET_RES, "B7", "B21", "B100", "A2_10", "A2_50", "A2_100", "C10000", "C100000", "C300000", "C1000000", "C3000000", "C5000000", "C10000000", "C15000000"};

    public static boolean a(int i) {
        return i == 258 || i == 264 || i == 280 || i == 227;
    }

    public static boolean c(int i) {
        return i == 262 || i == 266;
    }

    public static boolean d(int i) {
        return i == 283;
    }

    public static boolean e(int i) {
        return i == 259;
    }

    public static boolean j(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return d.contains(str);
    }

    public static List<String> e() {
        return e;
    }

    public static boolean n(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return e.contains(str);
    }

    public static boolean m(String str) {
        return (TextUtils.isEmpty(str) || n(str) || str.length() < 3) ? false : true;
    }

    public static boolean h(String str) {
        if (!Utils.o() || !j(str) || oun.a(BaseApplication.getContext(), str)) {
            return true;
        }
        LogUtil.j("PLGACHIEVE_MedalUtil", "isDownload3dMedal: 2D not completed -> " + str);
        return false;
    }

    public static boolean d() {
        return Utils.o() && !((OperationUtilsApi) Services.b("PluginOperation", OperationUtilsApi.class)).isOperation(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010));
    }

    public static void e(Map<String, Integer> map) {
        if (map == null) {
            return;
        }
        String[] strArr = f45102b;
        map.put(strArr[0], Integer.valueOf(R.mipmap.ic_run_5km_copper_obtain));
        map.put(strArr[1], Integer.valueOf(R.mipmap.ic_run_10km_copper_obtain));
        map.put(strArr[2], Integer.valueOf(R.mipmap.ic_run_mls_copper_obtain));
        map.put(strArr[3], Integer.valueOf(R.mipmap.ic_run_mls_silver_obtain));
        map.put(strArr[4], Integer.valueOf(R.mipmap.ic_run_mls_gold_obtain));
        map.put(strArr[5], Integer.valueOf(R.mipmap.ic_walk_10000_7day_copper_obtain));
        map.put(strArr[6], Integer.valueOf(R.mipmap.ic_walk_10000_21day_silver_obtain));
        map.put(strArr[7], Integer.valueOf(R.mipmap.ic_walk_10000_100day_gold_obtain));
        map.put(strArr[8], Integer.valueOf(R.mipmap.ic_ride_10km_copper_obtain));
        map.put(strArr[9], Integer.valueOf(R.mipmap.ic_ride_50km_silver_obtain));
        map.put(strArr[10], Integer.valueOf(R.mipmap.ic_ride_100km_gold_obtain));
        if (Utils.o()) {
            map.put(strArr[11], Integer.valueOf(R.mipmap.ic_walk_10000copper_obtain));
            map.put(strArr[12], Integer.valueOf(R.mipmap.ic_walk_100k_real));
            map.put(strArr[13], Integer.valueOf(R.mipmap.ic_walk_300k_real));
            map.put(strArr[14], Integer.valueOf(R.mipmap.ic_walk_1million_real));
            map.put(strArr[15], Integer.valueOf(R.mipmap.ic_walk_3million_real));
            map.put(strArr[16], Integer.valueOf(R.mipmap.ic_walk_5million_real));
            map.put(strArr[17], Integer.valueOf(R.mipmap.ic_walk_10million_real));
            map.put(strArr[18], Integer.valueOf(R.mipmap.ic_walk_15million_real));
            return;
        }
        map.put(strArr[11], Integer.valueOf(R.mipmap.ic_walk_10000copper_obtain));
        map.put(strArr[12], Integer.valueOf(R.mipmap.ic_walk_100000_copper_obtain));
        map.put(strArr[13], Integer.valueOf(R.mipmap.ic_walk_300000_copper_obtain));
        map.put(strArr[14], Integer.valueOf(R.mipmap.ic_walk_1000000_silver_obtain));
        map.put(strArr[15], Integer.valueOf(R.mipmap.ic_walk_3000000_silver_obtain));
        map.put(strArr[16], Integer.valueOf(R.mipmap.ic_walk_5000000_silver_obtain));
        map.put(strArr[17], Integer.valueOf(R.mipmap.ic_walk_10000000_gold_obtain));
        map.put(strArr[18], Integer.valueOf(R.mipmap.ic_walk_15000000_gold_obtain));
    }

    public static void c(Map<String, Integer> map) {
        if (map == null) {
            return;
        }
        map.put("1", Integer.valueOf(R.mipmap.ic_run_5km_copper_obtain));
        map.put("2", Integer.valueOf(R.mipmap.ic_run_10km_copper_obtain));
        map.put("3", Integer.valueOf(R.mipmap.ic_run_mls_copper_obtain));
        map.put("4", Integer.valueOf(R.mipmap.ic_run_mls_silver_obtain));
        map.put("5", Integer.valueOf(R.mipmap.ic_run_mls_gold_obtain));
        map.put("6", Integer.valueOf(R.mipmap.ic_walk_10000_7day_copper_obtain));
        map.put("7", Integer.valueOf(R.mipmap.ic_walk_10000_21day_silver_obtain));
        map.put("8", Integer.valueOf(R.mipmap.ic_walk_10000_100day_gold_obtain));
        if (Utils.o()) {
            map.put("9", Integer.valueOf(R.mipmap.ic_walk_10000copper_obtain));
            map.put("10", Integer.valueOf(R.mipmap.ic_walk_100k_real));
            map.put("11", Integer.valueOf(R.mipmap.ic_walk_300k_real));
            map.put("12", Integer.valueOf(R.mipmap.ic_walk_1million_real));
            map.put("13", Integer.valueOf(R.mipmap.ic_walk_3million_real));
            map.put("14", Integer.valueOf(R.mipmap.ic_walk_5million_real));
            map.put("15", Integer.valueOf(R.mipmap.ic_walk_10million_real));
            map.put("16", Integer.valueOf(R.mipmap.ic_walk_15million_real));
        } else {
            map.put("9", Integer.valueOf(R.mipmap.ic_walk_10000copper_obtain));
            map.put("10", Integer.valueOf(R.mipmap.ic_walk_100000_copper_obtain));
            map.put("11", Integer.valueOf(R.mipmap.ic_walk_300000_copper_obtain));
            map.put("12", Integer.valueOf(R.mipmap.ic_walk_1000000_silver_obtain));
            map.put("13", Integer.valueOf(R.mipmap.ic_walk_3000000_silver_obtain));
            map.put("14", Integer.valueOf(R.mipmap.ic_walk_5000000_silver_obtain));
            map.put("15", Integer.valueOf(R.mipmap.ic_walk_10000000_gold_obtain));
            map.put("16", Integer.valueOf(R.mipmap.ic_walk_15000000_gold_obtain));
        }
        map.put("17", Integer.valueOf(R.mipmap.ic_ride_10km_copper_obtain));
        map.put("18", Integer.valueOf(R.mipmap.ic_ride_50km_silver_obtain));
        map.put("19", Integer.valueOf(R.mipmap.ic_ride_100km_gold_obtain));
    }

    public static void a(Map<String, Integer> map) {
        if (map == null) {
            return;
        }
        map.put("1", Integer.valueOf(R.mipmap.ic_run_5km_copper_obtain_sm));
        map.put("2", Integer.valueOf(R.mipmap.ic_run_10km_copper_obtain_sm));
        map.put("3", Integer.valueOf(R.mipmap.ic_run_mls_copper_obtain_sm));
        map.put("4", Integer.valueOf(R.mipmap.ic_run_mls_silver_obtain_sm));
        map.put("5", Integer.valueOf(R.mipmap.ic_run_mls_gold_obtain_sm));
        map.put("6", Integer.valueOf(R.mipmap.ic_walk_10000_7day_copper_obtain_sm));
        map.put("7", Integer.valueOf(R.mipmap.ic_walk_10000_21day_silver_obtain_sm));
        map.put("8", Integer.valueOf(R.mipmap.ic_walk_10000_100day_gold_obtain_sm));
        if (Utils.o()) {
            map.put("9", Integer.valueOf(R.mipmap.ic_walk_10000copper_obtain_sm));
            map.put("10", Integer.valueOf(R.mipmap.ic_walk_100k_real_sm));
            map.put("11", Integer.valueOf(R.mipmap.ic_walk_300k_real_sm));
            map.put("12", Integer.valueOf(R.mipmap.ic_walk_1million_real_sm));
            map.put("13", Integer.valueOf(R.mipmap.ic_walk_3million_real_sm));
            map.put("14", Integer.valueOf(R.mipmap.ic_walk_5million_real_sm));
            map.put("15", Integer.valueOf(R.mipmap.ic_walk_10million_real_sm));
            map.put("16", Integer.valueOf(R.mipmap.ic_walk_15million_real_sm));
        } else {
            map.put("9", Integer.valueOf(R.mipmap.ic_walk_10000copper_obtain_sm));
            map.put("10", Integer.valueOf(R.mipmap.ic_walk_100000_copper_obtain_sm));
            map.put("11", Integer.valueOf(R.mipmap.ic_walk_300000_copper_obtain_sm));
            map.put("12", Integer.valueOf(R.mipmap.ic_walk_1000000_silver_obtain_sm));
            map.put("13", Integer.valueOf(R.mipmap.ic_walk_3000000_silver_obtain_sm));
            map.put("14", Integer.valueOf(R.mipmap.ic_walk_5000000_silver_obtain_sm));
            map.put("15", Integer.valueOf(R.mipmap.ic_walk_10000000_gold_obtain_sm));
            map.put("16", Integer.valueOf(R.mipmap.ic_walk_15000000_gold_obtain_sm));
        }
        map.put("17", Integer.valueOf(R.mipmap.ic_ride_10km_copper_obtain_sm));
        map.put("18", Integer.valueOf(R.mipmap.ic_ride_50km_silver_obtain_sm));
        map.put("19", Integer.valueOf(R.mipmap.ic_ride_100km_gold_obtain_sm));
    }

    public static void b(Map<String, Integer> map) {
        if (map == null) {
            return;
        }
        String[] strArr = f45102b;
        map.put(strArr[0], Integer.valueOf(R.mipmap.ic_run_5km_copper_gray));
        map.put(strArr[1], Integer.valueOf(R.mipmap.ic_run_10km_copper_gray));
        map.put(strArr[2], Integer.valueOf(R.mipmap.ic_run_half_mal_copper_gray));
        map.put(strArr[3], Integer.valueOf(R.mipmap.ic_run_one_mal_copper_gray));
        map.put(strArr[4], Integer.valueOf(R.mipmap.ic_run_super_mal_copper_gray));
        map.put(strArr[5], Integer.valueOf(R.mipmap.ic_walk_7day_copper_gray));
        map.put(strArr[6], Integer.valueOf(R.mipmap.ic_walk_21day_silver_gray));
        map.put(strArr[7], Integer.valueOf(R.mipmap.ic_walk_100day_gold_gray));
        map.put(strArr[8], Integer.valueOf(R.mipmap.ic_ride_10km_copper_gray));
        map.put(strArr[9], Integer.valueOf(R.mipmap.ic_ride_50km_silver_gray));
        map.put(strArr[10], Integer.valueOf(R.mipmap.ic_ride_100km_gold_gray));
        if (Utils.o()) {
            map.put(strArr[11], Integer.valueOf(R.mipmap.ic_walk_1mstep_copper_gray));
            map.put(strArr[12], Integer.valueOf(R.mipmap.ic_walk_100k_empty_sm));
            map.put(strArr[13], Integer.valueOf(R.mipmap.ic_walk_300k_empty_sm));
            map.put(strArr[14], Integer.valueOf(R.mipmap.ic_walk_1million_empty_sm));
            map.put(strArr[15], Integer.valueOf(R.mipmap.ic_walk_3million_empty_sm));
            map.put(strArr[16], Integer.valueOf(R.mipmap.ic_walk_5million_empty_sm));
            map.put(strArr[17], Integer.valueOf(R.mipmap.ic_walk_10million_empty_sm));
            map.put(strArr[18], Integer.valueOf(R.mipmap.ic_walk_15million_empty_sm));
            return;
        }
        map.put(strArr[11], Integer.valueOf(R.mipmap.ic_walk_1mstep_copper_gray));
        map.put(strArr[12], Integer.valueOf(R.mipmap.ic_walk_10mstep_copper_gray));
        map.put(strArr[13], Integer.valueOf(R.mipmap.ic_walk_30mstep_copper_gray));
        map.put(strArr[14], Integer.valueOf(R.mipmap.ic_walk_100mstep_silver_gray));
        map.put(strArr[15], Integer.valueOf(R.mipmap.ic_walk_300mstep_silver_gray));
        map.put(strArr[16], Integer.valueOf(R.mipmap.ic_walk_500mstep_silver_gray));
        map.put(strArr[17], Integer.valueOf(R.mipmap.ic_walk_1000mstep_gold_gray));
        map.put(strArr[18], Integer.valueOf(R.mipmap.ic_walk_1500mstep_gold_gray));
    }

    public static void d(Map<String, Integer> map) {
        if (map == null) {
            return;
        }
        String[] strArr = f45102b;
        map.put(strArr[0], Integer.valueOf(R.mipmap.gray_ic_run_5km_copper_white));
        map.put(strArr[1], Integer.valueOf(R.mipmap.gray_ic_run_10km_copper_white));
        map.put(strArr[2], Integer.valueOf(R.mipmap.gray_ic_run_half_mal_white));
        map.put(strArr[3], Integer.valueOf(R.mipmap.gray_ic_run_one_mal_white));
        map.put(strArr[4], Integer.valueOf(R.mipmap.gray_ic_run_super_mal_white));
        map.put(strArr[5], Integer.valueOf(R.mipmap.gray_ic_walk_7day_copper_white));
        map.put(strArr[6], Integer.valueOf(R.mipmap.gray_ic_walk_21day_silver_white));
        map.put(strArr[7], Integer.valueOf(R.mipmap.gray_ic_walk_100day_gold_white));
        map.put(strArr[8], Integer.valueOf(R.mipmap.gray_ic_ride_10km_copper_white));
        map.put(strArr[9], Integer.valueOf(R.mipmap.gray_ic_ride_50km_silver_white));
        map.put(strArr[10], Integer.valueOf(R.mipmap.gray_ic_ride_100km_gold_white));
        if (Utils.o()) {
            map.put(strArr[11], Integer.valueOf(R.mipmap.gray_ic_walk_1mstep_copper_white));
            map.put(strArr[12], Integer.valueOf(R.mipmap.ic_walk_100k_empty));
            map.put(strArr[13], Integer.valueOf(R.mipmap.ic_walk_300k_empty));
            map.put(strArr[14], Integer.valueOf(R.mipmap.ic_walk_1million_empty));
            map.put(strArr[15], Integer.valueOf(R.mipmap.ic_walk_3million_empty));
            map.put(strArr[16], Integer.valueOf(R.mipmap.ic_walk_5million_empty));
            map.put(strArr[17], Integer.valueOf(R.mipmap.ic_walk_10million_empty));
            map.put(strArr[18], Integer.valueOf(R.mipmap.ic_walk_15million_empty));
            return;
        }
        map.put(strArr[11], Integer.valueOf(R.mipmap.gray_ic_walk_1mstep_copper_white));
        map.put(strArr[12], Integer.valueOf(R.mipmap.gray_ic_walk_10mstep_copper_white));
        map.put(strArr[13], Integer.valueOf(R.mipmap.gray_ic_walk_30mstep_copper_white));
        map.put(strArr[14], Integer.valueOf(R.mipmap.gray_ic_walk_100mstep_silver_white));
        map.put(strArr[15], Integer.valueOf(R.mipmap.gray_ic_walk_300mstep_silver_white));
        map.put(strArr[16], Integer.valueOf(R.mipmap.gray_ic_walk_500mstep_silver_white));
        map.put(strArr[17], Integer.valueOf(R.mipmap.gray_ic_walk_1000mstep_gold_white));
        map.put(strArr[18], Integer.valueOf(R.mipmap.gray_ic_walk_1500mstep_gold_white));
    }

    public static Bitmap a(String str, boolean z, boolean z2) {
        String strH;
        if (str == null) {
            return null;
        }
        if (z) {
            strH = h(str, ParsedFieldTag.LIGHT_DETAIL_STYLE);
        } else {
            strH = h(str, ParsedFieldTag.GRAY_DETAIL_STYLE);
        }
        if (!z2) {
            return b(str, strH);
        }
        return c(str, h(str, ParsedFieldTag.LIGHT_LIST_STYLE));
    }

    private static String h(String str, String str2) {
        if (str2 == null || str == null) {
            return "";
        }
        String strE = e(str);
        String strE2 = e(str, str2);
        return d(strE) + File.separator + strE2 + ".png";
    }

    public static Bitmap c(String str, String str2) {
        Bitmap bitmapDecodeFile = null;
        if (!GeneralUtil.isSafePath(str2)) {
            LogUtil.j("PLGACHIEVE_MedalUtil", "getSmallBitmap: untrusted -> " + str2);
            return null;
        }
        String strC = CommonUtil.c(str2);
        if (TextUtils.isEmpty(strC)) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(strC, options);
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        options.inSampleSize = 2;
        options.inJustDecodeBounds = false;
        try {
            bitmapDecodeFile = BitmapFactory.decodeFile(strC, options);
        } catch (OutOfMemoryError unused) {
            LogUtil.e("PLGACHIEVE_MedalUtil", "showMedalBitmap getSmallBitmap:OutOfMemoryError");
        }
        if (bitmapDecodeFile == null) {
            LogUtil.j("PLGACHIEVE_MedalUtil", "showMedalBitmap getSmallBitmap is null! getBitmapFromPath ", str);
        }
        return bitmapDecodeFile;
    }

    public static Bitmap g(String str) {
        if (str == null) {
            return null;
        }
        String strE = e(str);
        String strE2 = e(str, ParsedFieldTag.SHARE_IMAGE_URL);
        return b(str, d(strE) + File.separator + strE2 + ".png");
    }

    public static String a(String str, String str2) {
        String strE = e(str);
        String strE2 = e(str, str2);
        return d(strE) + File.separator + strE2 + ".png";
    }

    public static String e(String str) {
        return "medal_" + str;
    }

    public static String e(String str, String str2) {
        if (str == null) {
            str = "";
        }
        return str + "_" + str2;
    }

    public static String d(String str) {
        if (!GeneralUtil.isSafePath(str)) {
            LogUtil.j("PLGACHIEVE_MedalUtil", "getOneMedalPngPath: untrusted -> " + str);
            return "";
        }
        try {
            return (BaseApplication.getContext().getFilesDir().getCanonicalPath() + File.separator + "achievemedalpng") + File.separator + str;
        } catch (IOException unused) {
            LogUtil.d("PLGACHIEVE_MedalUtil", "getOneMedalPngPath IOException:");
            return null;
        }
    }

    public static Bitmap b(String str, String str2) {
        Bitmap bitmapDecodeFile = null;
        if (!GeneralUtil.isSafePath(str2)) {
            LogUtil.j("PLGACHIEVE_MedalUtil", "getBitmapFromPath: untrusted -> " + str2);
            return null;
        }
        String strC = CommonUtil.c(str2);
        if (TextUtils.isEmpty(strC)) {
            return null;
        }
        if (!new File(strC).exists()) {
            LogUtil.d("PLGACHIEVE_MedalUtil", "getBitmapFromPath: file not exists");
            return null;
        }
        try {
            bitmapDecodeFile = BitmapFactory.decodeFile(strC);
        } catch (OutOfMemoryError unused) {
            LogUtil.e("PLGACHIEVE_MedalUtil", "showMedalBitmap getBitmapFromPath:OutOfMemoryError");
        }
        if (bitmapDecodeFile == null) {
            LogUtil.j("PLGACHIEVE_MedalUtil", "showMedalBitmap is null! getBitmapFromPath ", str);
        }
        return bitmapDecodeFile;
    }

    public static boolean c(String str) {
        LogUtil.d("MedalUtil", "fileIsExists path=", str);
        if (!GeneralUtil.isSafePath(str)) {
            LogUtil.j("PLGACHIEVE_MedalUtil", "fileIsExists: untrusted -> " + str);
            return false;
        }
        String strC = CommonUtil.c(str);
        if (TextUtils.isEmpty(strC)) {
            return false;
        }
        if (!new File(strC).exists()) {
            LogUtil.d("MedalUtil", "file Is not Exists ");
            return false;
        }
        LogUtil.d("MedalUtil", "file Is Exists ");
        return true;
    }

    public static boolean d(String str, int i) {
        long j;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (i > 0 || TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            j = Long.parseLong(str);
        } catch (NumberFormatException unused) {
            LogUtil.e("PLGACHIEVE_MedalUtil", "isNeedShow NumberFormatException");
            j = 0;
        }
        if (jCurrentTimeMillis - 259200000 <= j) {
            return true;
        }
        LogUtil.d("PLGACHIEVE_MedalUtil", "isNeedShow =false");
        return false;
    }

    public static boolean o(String str) {
        return !TextUtils.isEmpty(str) && f45103c.contains(str);
    }

    public static boolean e(String str, String str2, String str3, int i) {
        if (i > 0) {
            return true;
        }
        return p(str2) && i(str3, PhoneInfoUtils.getPhoneType());
    }

    private static boolean i(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        return str.contains(str2);
    }

    private static boolean p(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        return str.contains("1");
    }

    public static String a(String str) {
        if (str == null) {
            return "";
        }
        return str.length() > 10 ? str.substring(0, 10).concat("...") : str;
    }

    public static boolean k(String str) {
        return MedalConstants.ACTION_MEDAL_TYPE.equals(str) || MedalConstants.MATCH_MEDAL_TYPE.equals(str);
    }

    public static boolean l(String str) {
        return k(str) || MedalConstants.HEALTH_MEDAL_TYPE.equals(str);
    }

    public static long d(String str, String str2) {
        try {
            return new SimpleDateFormat(str2, Locale.ENGLISH).parse(str).getTime();
        } catch (IllegalArgumentException unused) {
            LogUtil.e("PLGACHIEVE_MedalUtil", "date2Timestamp IllegalArgumentException");
            return 0L;
        } catch (ParseException unused2) {
            LogUtil.e("PLGACHIEVE_MedalUtil", "date2Timestamp ParseException");
            return 0L;
        }
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return UnitUtil.a(new Date(Long.parseLong(str)), 20);
        } catch (NumberFormatException unused) {
            LogUtil.e("PLGACHIEVE_MedalUtil", "setGainTime NumberFormatException");
            return str;
        }
    }

    public static String e(double d2, int i) {
        String strE;
        LogUtil.a("PLGACHIEVE_MedalUtil", "value = ", Double.valueOf(d2), " num = ", Integer.valueOf(i));
        double dE = UnitUtil.e(d2, 3);
        if (i == 0) {
            strE = UnitUtil.e(dE, 1, 0);
        } else if (4 == i) {
            strE = UnitUtil.e(dE, 1, 4);
        } else if (3 == i) {
            strE = UnitUtil.e(dE, 1, 3);
        } else {
            strE = "";
        }
        LogUtil.a("PLGACHIEVE_MedalUtil", "transferEnglishUnit():valueMile =", Double.valueOf(dE), ",valueMileStr = ", strE);
        return strE;
    }

    public static int s(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e2) {
            LogUtil.e("PLGACHIEVE_MedalUtil", "string2Int e=", e2.getMessage());
            return 0;
        }
    }

    public static String b(int i) {
        if (a(i)) {
            return "A";
        }
        if (e(i)) {
            return "A2";
        }
        if (c(i)) {
            return "A3";
        }
        if (d(i)) {
            return "A5";
        }
        return "";
    }

    public static String r(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String strA = UnitUtil.a(new Date(Long.parseLong(str)), 20);
            return String.format(Locale.ROOT, BaseApplication.getContext().getResources().getString(R.string.IDS_plugin_achievement_tab_people_get_medal_date), strA);
        } catch (NumberFormatException unused) {
            LogUtil.e("PLGACHIEVE_MedalUtil", "setGainTime NumberFormatException");
            return "";
        }
    }

    public static boolean i(String str) {
        if (MedalConstants.ACTION_MEDAL_TYPE.equals(str) && d()) {
            return true;
        }
        return m(str) && !VersionControlUtil.isSupportOperationAccount();
    }

    public static boolean b() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - f45101a < ProfileExtendConstants.TIME_OUT) {
            return true;
        }
        f45101a = jElapsedRealtime;
        return false;
    }

    public static boolean f(String str) {
        Context context = BaseApplication.getContext();
        String strE = osa.e(context, "_sportGainMedalIdArray");
        if (!TextUtils.isEmpty(strE) && Arrays.asList(strE.split(",")).contains(str)) {
            LogUtil.j("PLGACHIEVE_MedalUtil", "interceptMedalRemind: reminded -> " + str);
            return true;
        }
        StringBuilder sb = new StringBuilder();
        if (TextUtils.isEmpty(strE)) {
            sb.append(str);
        } else {
            sb.append(strE);
            sb.append(",");
            sb.append(str);
        }
        osa.b(context, "_sportGainMedalIdArray", sb.toString());
        return false;
    }
}
