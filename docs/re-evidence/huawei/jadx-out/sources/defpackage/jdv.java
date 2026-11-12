package defpackage;

import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class jdv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f38440a = phs.d + "smart_coach_res" + File.separator;

    public static JSONObject e() {
        String strA = pia.a(new File(CommonUtil.c(f38440a + "1.1.1" + File.separator + "json" + File.separator + "smart_coach_params.json")));
        if ("".equals(strA)) {
            strA = a("local_smart_coach_params.json");
        }
        if (strA == null) {
            return null;
        }
        try {
            return new JSONObject(strA);
        } catch (JSONException e) {
            LogUtil.j("Track_CloudConfigParam", "getCloudConfigScriptJsonObject jsonException", LogAnonymous.b(e));
            return null;
        }
    }

    public static String e(boolean z, String str, boolean z2) {
        JSONObject jSONObjectE = e();
        if (jSONObjectE == null) {
            LogUtil.j("Track_CloudConfigParam", "getHeartRateRange jsonObject is null.");
            return "";
        }
        try {
            String strB = b(jSONObjectE.getString("data"), "heartRateRange");
            if (z) {
                String strB2 = b(strB, "hasReserveHeartRate");
                if (z2) {
                    return b(b(strB2, str), "max");
                }
                return b(b(strB2, str), "min");
            }
            String strB3 = b(strB, "noReserveHeartRate");
            if (z2) {
                return b(b(strB3, str), "max");
            }
            return b(b(strB3, str), "min");
        } catch (JSONException e) {
            LogUtil.j("Track_CloudConfigParam", "getHeartRateRange jsonException", LogAnonymous.b(e));
            return "";
        }
    }

    public static String a() {
        JSONObject jSONObjectE = e();
        if (jSONObjectE == null) {
            LogUtil.j("Track_CloudConfigParam", "getHeartRateRange jsonObject is null.");
            return "";
        }
        try {
            return b(b(b(jSONObjectE.getString("data"), "heartRateRange"), "noReserveHeartRate"), "restHeartRate");
        } catch (JSONException e) {
            LogUtil.j("Track_CloudConfigParam", "getRestHeartRate jsonException", LogAnonymous.b(e));
            return "";
        }
    }

    public static String b(boolean z, String str, String str2) {
        JSONObject jSONObjectE = e();
        if (jSONObjectE == null) {
            LogUtil.j("Track_CloudConfigParam", "getBeforeSportTime jsonObject is null.");
            return "";
        }
        try {
            String strB = b(b(jSONObjectE.getString("data"), "durationAndPace"), "duration");
            if (z) {
                return b(b(strB, "hasIntervals"), str);
            }
            return b(b(b(strB, "noIntervals"), str2), str);
        } catch (JSONException e) {
            LogUtil.j("Track_CloudConfigParam", "getBeforeSportTime jsonException", LogAnonymous.b(e));
            return "";
        }
    }

    public static String d() {
        JSONObject jSONObjectE = e();
        if (jSONObjectE == null) {
            LogUtil.j("Track_CloudConfigParam", "getMonthSportTimes jsonObject is null.");
            return "";
        }
        try {
            return b(b(jSONObjectE.getString("data"), "durationAndPace"), "MonthSportTimes");
        } catch (JSONException e) {
            LogUtil.j("Track_CloudConfigParam", "getMonthSportTimes jsonException", LogAnonymous.b(e));
            return "";
        }
    }

    public static String a(String str, int i, String str2, boolean z, boolean z2) {
        JSONObject jSONObjectE = e();
        if (jSONObjectE == null) {
            LogUtil.j("Track_CloudConfigParam", "getPaceValue jsonObject is null.");
            return "";
        }
        try {
            String strB = b(b(b(b(b(jSONObjectE.getString("data"), "durationAndPace"), "pace"), str), e(i)), str2);
            if ("recovery".equals(str2)) {
                if (z2) {
                    return b(strB, "max");
                }
                return b(strB, "min");
            }
            if (z) {
                if (z2) {
                    return "-1";
                }
                return b(b(strB, "hasHistory"), "min");
            }
            if (z2) {
                return b(b(strB, "noHistory"), "max");
            }
            return b(b(strB, "noHistory"), "min");
        } catch (JSONException e) {
            LogUtil.j("Track_CloudConfigParam", "getPaceValue jsonException", LogAnonymous.b(e));
            return "";
        }
    }

    public static String e(String str, int i, String str2, boolean z) {
        JSONObject jSONObjectE = e();
        if (jSONObjectE == null) {
            LogUtil.j("Track_CloudConfigParam", "getSpeedValue jsonObject is null.");
            return "";
        }
        String strE = e(i);
        try {
            String strB = b(b(b(jSONObjectE.getString("data"), "durationAndPace"), "speedForTreadmill"), str);
            if (z) {
                return b(b(b(strB, strE), str2), "max");
            }
            return b(b(b(strB, strE), str2), "min");
        } catch (JSONException e) {
            LogUtil.j("Track_CloudConfigParam", "getSpeedValue jsonException", LogAnonymous.b(e));
            return "";
        }
    }

    private static String e(int i) {
        if (i >= 18 && i <= 29) {
            return "age20s";
        }
        if (i >= 30 && i <= 39) {
            return "age30s";
        }
        if (i >= 40 && i <= 49) {
            return "age40s";
        }
        if (i >= 50 && i <= 59) {
            return "age50s";
        }
        LogUtil.j("Track_CloudConfigParam", "getPaceValue age is over section.");
        return "age20s";
    }

    private static String b(String str, String str2) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        if (str2 != null && str.charAt(0) == '[') {
            return e(str, str2);
        }
        try {
            return new JSONObject(str).getString(str2);
        } catch (JSONException e) {
            LogUtil.j("Track_CloudConfigParam", "getNextNodeString jsonException", LogAnonymous.b(e));
            return "";
        }
    }

    private static String e(String str, String str2) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (!jSONObject.isNull(str2)) {
                    return jSONObject.getString(str2);
                }
            }
            return "";
        } catch (JSONException e) {
            LogUtil.j("Track_CloudConfigParam", "parseJsonArrayUrl jsonException", LogAnonymous.b(e));
            return null;
        }
    }

    private static String a(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        try {
            return b(BaseApplication.getContext().getAssets().open(str));
        } catch (IOException e) {
            LogUtil.j("Track_CloudConfigParam", "parseAssestsJsonFile ioException", LogAnonymous.b(e));
            return "";
        }
    }

    public static String b(InputStream inputStream) {
        String str = "";
        if (inputStream == null) {
            return "";
        }
        try {
            try {
                byte[] bArr = new byte[inputStream.available()];
                if (inputStream.read(bArr) > 0) {
                    str = new String(bArr, "UTF-8");
                }
            } catch (IOException unused) {
                LogUtil.e("Track_CloudConfigParam", "getString IOException");
            }
            return str;
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                LogUtil.j("Track_CloudConfigParam", "getString ioException", LogAnonymous.b(e));
            }
        }
    }
}
