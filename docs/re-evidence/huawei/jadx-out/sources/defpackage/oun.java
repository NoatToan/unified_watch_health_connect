package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.R;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.profile.coordinator.ProfileRequestConstants;
import com.huawei.thirdloginbasemodule.ThirdLoginDataStorageUtil;
import health.compact.a.CommonUtil;
import health.compact.a.Utils;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class oun {
    public static boolean a(int i) {
        return 258 == i || 264 == i || 280 == i || 227 == i;
    }

    public static boolean b(int i) {
        return 259 == i;
    }

    public static boolean e(int i) {
        return 283 == i;
    }

    public static boolean g(int i) {
        return 257 == i;
    }

    public static boolean j(int i) {
        return 262 == i || 266 == i;
    }

    public static int d(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            LogUtil.e("AchieveUtils", "string2Int e=", e.getMessage());
            return 0;
        }
    }

    public static String d() {
        Locale locale = BaseApplication.getContext().getResources().getConfiguration().locale;
        String str = ProfileRequestConstants.X_LANGUAGE_VALUE;
        if (locale == null) {
            LogUtil.j("AchieveUtils", "getLanguage, locale == null");
            return ProfileRequestConstants.X_LANGUAGE_VALUE;
        }
        String strB = pjn.b(locale);
        if (strB == null) {
            LogUtil.j("AchieveUtils", "getSupportLanguageName get null");
            return ProfileRequestConstants.X_LANGUAGE_VALUE;
        }
        if ("en".equals(strB)) {
            str = "en_US";
        } else if (!"zh-CN".equals(strB)) {
            str = strB;
        }
        String strB2 = b(str);
        LogUtil.a("AchieveUtils", "getConvertLanguage is ", strB2);
        return strB2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:51:0x0092  */
    private static String b(String str) {
        if (str == null) {
            return str;
        }
        str.hashCode();
        switch (str) {
            case "b+my+Qaag":
                return "my-ZG";
            case "eu":
                return "eu-ES";
            case "gl":
                return "gl-ES";
            case "ka":
                return "ka-GE";
            case "kk":
                return "kk-KZ";
            case "km":
                return "km-KH";
            case "lo":
                return "lo-LA";
            case "my":
                return "my-MM";
            case "pt":
                return "pt-PT";
            case "si":
                return "si-LK";
            case "uz":
                return "uz-UZ";
            default:
                return str;
        }
    }

    public static void d(Context context) {
        if (context == null) {
            LogUtil.j("AchieveUtils", "saveCurrentLanguage context is null");
        } else {
            osa.b(context, "_current_language", context.getResources().getConfiguration().locale.getLanguage());
        }
    }

    public static boolean e(Context context) {
        if (context != null) {
            return !osa.e(context, "_current_language").equals(context.getResources().getConfiguration().locale.getLanguage());
        }
        LogUtil.j("AchieveUtils", "isLocalLanguageChanged context is null");
        return false;
    }

    public static boolean a(Context context, String str) {
        return d(osa.e(context, "_medalPngStatusDownload"), str, context);
    }

    public static int e() {
        return ThirdLoginDataStorageUtil.getTokenTypeValue();
    }

    public static long a(long j, boolean z) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j + ((long) b(TimeZone.getDefault())));
        if (z) {
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
        } else {
            calendar.set(11, 23);
            calendar.set(12, 59);
            calendar.set(13, 59);
            calendar.set(14, 999);
        }
        return calendar.getTimeInMillis();
    }

    public static int b(TimeZone timeZone) {
        return TimeZone.getTimeZone("Asia/Shanghai").getRawOffset() - timeZone.getRawOffset();
    }

    public static boolean a(String str) {
        return !TextUtils.isEmpty(str);
    }

    public static String b(Context context) {
        try {
            PackageManager packageManager = BaseApplication.getContext().getPackageManager();
            return String.valueOf(packageManager.getApplicationLabel(packageManager.getApplicationInfo(BaseApplication.getContext().getPackageName(), 0)));
        } catch (PackageManager.NameNotFoundException e) {
            LogUtil.e("AchieveUtils", "getApplicationName e=", e.getMessage());
            return "";
        }
    }

    public static boolean a(String str, String str2, Context context, String str3) {
        int i = 0;
        if (context == null || TextUtils.isEmpty(str2)) {
            return false;
        }
        try {
            i = Integer.parseInt(str2);
        } catch (NumberFormatException unused) {
            LogUtil.e("AchieveUtils", "NumberFormatException");
        }
        if (str == null || i <= 19) {
            return true;
        }
        return d(str3, str2, context);
    }

    public static void c(String str, Context context) {
        if (context == null) {
            LogUtil.d("AchieveUtils", "refreshSharePrefrence context is null");
            return;
        }
        String strD = d(osa.e(context, "_medalPngStatusDownload"), str);
        if (TextUtils.isEmpty(strD)) {
            LogUtil.d("AchieveUtils", "refreshSharePrefrence failed");
        } else {
            osa.b(context, "_medalPngStatusDownload", strD);
        }
    }

    public static String d(String str, String str2) {
        JSONObject jSONObject;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str);
                try {
                    HashMap map = new HashMap(5);
                    map.put(ParsedFieldTag.GRAY_LIST_STYLE, 0);
                    map.put(ParsedFieldTag.LIGHT_LIST_STYLE, 0);
                    map.put(ParsedFieldTag.GRAY_DETAIL_STYLE, 0);
                    map.put(ParsedFieldTag.LIGHT_DETAIL_STYLE, 0);
                    map.put(ParsedFieldTag.SHARE_IMAGE_URL, 0);
                    JSONObject jSONObject2 = new JSONObject(map);
                    if (jSONObject.has(str2)) {
                        jSONObject.remove(str2);
                    }
                    jSONObject.put(str2, jSONObject2);
                } catch (JSONException unused) {
                    LogUtil.a("AchieveUtils", "parseJsonData JSONException!");
                }
            } catch (JSONException unused2) {
                jSONObject = null;
            }
            if (jSONObject != null) {
                return jSONObject.toString();
            }
        }
        return "";
    }

    public static boolean d(String str, String str2, Context context) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has(str2)) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(str2);
                    int iD = d(ParsedFieldTag.GRAY_LIST_STYLE, jSONObject2);
                    int iD2 = d(ParsedFieldTag.LIGHT_LIST_STYLE, jSONObject2);
                    int iD3 = d(ParsedFieldTag.LIGHT_DETAIL_STYLE, jSONObject2);
                    int iD4 = d(ParsedFieldTag.GRAY_DETAIL_STYLE, jSONObject2);
                    if (iD2 != 0 && iD != 0 && iD3 != 0 && iD4 != 0) {
                        if (pax.c(pax.a(str2, ParsedFieldTag.LIGHT_LIST_STYLE)) && pax.c(pax.a(str2, ParsedFieldTag.LIGHT_DETAIL_STYLE))) {
                            LogUtil.a("AchieveUtils", "parseJsonData Id=", str2);
                            return true;
                        }
                        c(str2, context);
                        return false;
                    }
                }
            } catch (JSONException unused) {
                LogUtil.a("AchieveUtils", "parseJsonData JSONException!");
            }
        }
        return false;
    }

    private static int d(String str, JSONObject jSONObject) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return 0;
        }
        try {
            return jSONObject.getInt(str);
        } catch (JSONException unused) {
            LogUtil.e("AchieveUtils", "judgeValidKey Exception");
            return 0;
        }
    }

    public static String a(String str, String str2) {
        JSONObject jSONObject;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str);
                try {
                    if (jSONObject.has(str2)) {
                        jSONObject.remove(str2);
                    }
                    jSONObject.put(str2, 0);
                } catch (JSONException unused) {
                    LogUtil.a("AchieveUtils", "parseTextureJsonData JSONException!");
                }
            } catch (JSONException unused2) {
                jSONObject = null;
            }
            if (jSONObject != null) {
                return jSONObject.toString();
            }
        }
        return "";
    }

    public static void b(Map<Integer, String> map, Context context) {
        if (map == null || context == null) {
            return;
        }
        map.put(1, context.getResources().getString(R.string.IDS_plugin_achievement_level_1_title_textview));
        map.put(2, context.getResources().getString(R.string.IDS_plugin_achievement_level_2_title_textview));
        map.put(3, context.getResources().getString(R.string.IDS_plugin_achievement_level_3_title_textview));
        map.put(4, context.getResources().getString(R.string.IDS_plugin_achievement_level_4_title_textview));
        map.put(5, context.getResources().getString(R.string.IDS_plugin_achievement_level_5_title_textview));
    }

    public static boolean c(int i) {
        if (Utils.o()) {
            return false;
        }
        return a(i) || b(i) || j(i) || e(i);
    }

    public static void a(Context context) {
        LogUtil.a("AchieveUtils", "overridePendingNoAnim currentTimeMillis ", Long.valueOf(System.currentTimeMillis()));
        if (context instanceof Activity) {
            ((Activity) context).overridePendingTransition(0, com.huawei.ui.commonui.R.anim.activity_no_animation_short);
        }
    }

    public static boolean d(int i) {
        boolean zE = true;
        if (!CommonUtil.ao() && !CommonUtil.ap()) {
            return true;
        }
        if (i == 0) {
            zE = gyl.d();
        } else if (i == 1) {
            zE = gyl.e();
        }
        LogUtil.a("AchieveUtils", "isShareShowAccount type=", Integer.valueOf(i), " isShareShowAccount=", Boolean.valueOf(zE));
        return zE;
    }

    public static String b(Cursor cursor, String str) {
        if (cursor == null || TextUtils.isEmpty(str)) {
            LogUtil.j("AchieveUtils", "getStringFromCursor: cursor or columnName is null");
            return "";
        }
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex < 0) {
            LogUtil.j("AchieveUtils", "getStringFromCursor: The column name does not exist -> " + str);
            return "";
        }
        return cursor.getString(columnIndex);
    }

    public static int e(Cursor cursor, String str) {
        if (cursor == null || TextUtils.isEmpty(str)) {
            LogUtil.j("AchieveUtils", "getIntFromCursor: cursor or columnName is null");
            return 0;
        }
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex < 0) {
            LogUtil.j("AchieveUtils", "getIntFromCursor: The column name does not exist -> " + str);
            return 0;
        }
        return cursor.getInt(columnIndex);
    }

    public static long c(Cursor cursor, String str) {
        if (cursor == null || TextUtils.isEmpty(str)) {
            LogUtil.j("AchieveUtils", "getLongFromCursor: cursor or columnName is null");
            return 0L;
        }
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex < 0) {
            LogUtil.j("AchieveUtils", "getLongFromCursor: The column name does not exist -> " + str);
            return 0L;
        }
        return cursor.getLong(columnIndex);
    }
}
