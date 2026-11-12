package defpackage;

import android.text.TextUtils;
import androidx.media3.extractor.AacUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.EventRecord;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.ui.main.stories.nps.interactors.mode.TypeParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class osv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f44674a = {2, 4, 6, 8, 10, 15, 20, 25, 30, 35, 40, 60, 80, 100};
    private static final int[] e = {2000, 4000, 6000, 8000, 10000, 12000, 14000, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, 18000, 20000};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final double[] f44675b = {6.16d, 10.55d, 16.96d, 19.51d, 16.89d, 12.12d, 7.61d, 4.44d, 2.51d, 1.4d, 1.84d};
    private static final double[] d = {28.67d, 16.7d, 12.92d, 7.95d, 5.4d, 9.98d, 5.59d, 3.95d, 2.42d, 1.77d, 1.2d, 2.32d, 0.75d, 0.3d, 0.08d};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final double[] f44676c = {28.32d, 15.48d, 10.46d, 6.68d, 4.83d, 8.38d, 5.3d, 3.75d, 2.79d, 2.19d, 1.74d, 4.54d, 2.47d, 1.51d, 1.56d};

    private static boolean e(int i) {
        return i == 6;
    }

    private static boolean e(int i, int i2) {
        return i == i2 + 1;
    }

    public static boolean d(String str) throws JSONException {
        return "0".equals(str);
    }

    public static String c(JSONArray jSONArray) throws JSONException {
        StringBuilder sb = new StringBuilder(16);
        if (jSONArray == null) {
            return sb.toString();
        }
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object objOpt = jSONArray.opt(i);
            if (objOpt instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) objOpt;
                String strOptString = jSONObject.optString(ParsedFieldTag.MEDAL_TYPE);
                sb.append(strOptString);
                if (b(strOptString)) {
                    sb.append("_");
                }
                sb.append(jSONObject.optInt(ParsedFieldTag.MEDAL_LEVEL));
            }
            if (!e(length, i)) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public static String e(JSONArray jSONArray) {
        StringBuilder sb = new StringBuilder(16);
        ArrayList arrayList = new ArrayList(16);
        if (jSONArray == null) {
            return sb.toString();
        }
        int length = jSONArray.length();
        boolean z = true;
        for (int i = 0; i < length; i++) {
            Object objOpt = jSONArray.opt(i);
            if (objOpt instanceof JSONObject) {
                String strC = c(ParsedFieldTag.MEDAL_ID, (JSONObject) objOpt);
                if (arrayList.contains(strC)) {
                    z = false;
                } else {
                    arrayList.add(strC);
                    sb.append(strC);
                    z = true;
                }
            }
            if (z && !e(length, i)) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    private static boolean b(String str) {
        return (str == null || "A".equals(str) || "B".equals(str) || TypeParams.SEARCH_CODE.equals(str)) ? false : true;
    }

    public static String e(String str, String str2) {
        StringBuilder sb = new StringBuilder(16);
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        return sb.toString();
    }

    private static boolean c(String str) {
        long j;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            j = Long.parseLong(str);
        } catch (NumberFormatException unused) {
            LogUtil.e("PLGACHIEVE_AchieveParserUtil", "judgeValidEvent Exception");
            j = 0;
        }
        return j != 0 && j <= System.currentTimeMillis();
    }

    private static String c() {
        HashMap map = new HashMap(16);
        map.put(MedalConstants.EVENT_OCCUR, "false");
        map.put(MedalConstants.EVENT_CONTENT, "-1");
        map.put("duration", "0");
        map.put(MedalConstants.EVENT_STEPS, "0");
        map.put("distance", "0");
        map.put("calorie", "0");
        return new JSONObject(map).toString();
    }

    public static EventRecord b(JSONObject jSONObject) {
        int iA = a(ParsedFieldTag.ACTION_TYPE, jSONObject);
        String strC = c("endTime", jSONObject);
        if (!e(iA) || !c(strC)) {
            return null;
        }
        EventRecord eventRecord = new EventRecord();
        eventRecord.saveEventType(1);
        eventRecord.saveEventStatus(MedalConstants.EVENT_NOT_UPLOAD);
        eventRecord.saveKey(MedalConstants.APP_OPENED);
        eventRecord.saveKeyType(MedalConstants.COMPLEX);
        eventRecord.saveValue(c());
        eventRecord.saveStartTime(c("startTime", jSONObject));
        eventRecord.saveEndTime(strC);
        return eventRecord;
    }

    public static String c(String str, String str2) {
        int i = 0;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return String.valueOf(0);
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() == 0) {
                return String.valueOf(0);
            }
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                int iA = a(str2, jSONArray.getJSONObject(i2));
                if (iA > i) {
                    i = iA;
                }
            }
        } catch (JSONException e2) {
            LogUtil.e("PLGACHIEVE_AchieveParserUtil", "getMaxValue JSONException:", e2.getMessage());
        }
        return String.valueOf(i);
    }

    public static String c(String str, JSONObject jSONObject) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return "";
        }
        try {
            return jSONObject.getString(str);
        } catch (JSONException unused) {
            LogUtil.e("PLGACHIEVE_AchieveParserUtil", "judgeValidKey Exception");
            return "";
        }
    }

    public static long e(String str, JSONObject jSONObject) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return 0L;
        }
        try {
            return jSONObject.getLong(str);
        } catch (JSONException unused) {
            LogUtil.e("PLGACHIEVE_AchieveParserUtil", "judgeValidKeyLong Exception");
            return 0L;
        }
    }

    public static int a(String str, JSONObject jSONObject) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return 0;
        }
        try {
            return jSONObject.getInt(str);
        } catch (JSONException unused) {
            LogUtil.e("PLGACHIEVE_AchieveParserUtil", "judgeValidKeyInt Exception");
            return 0;
        }
    }

    public static double d(String str, JSONObject jSONObject) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return 0.0d;
        }
        try {
            return jSONObject.getDouble(str);
        } catch (JSONException unused) {
            LogUtil.e("PLGACHIEVE_AchieveParserUtil", "judgeValidKeyDouble Exception");
            return 0.0d;
        }
    }

    public static Map<String, Object> d(String str, Map<String, Object> map) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next instanceof String) {
                    String str2 = next;
                    Object obj = jSONObject.get(str2);
                    if (obj instanceof JSONObject) {
                        d(String.valueOf(new JSONObject(String.valueOf(obj))), map);
                    } else if (obj instanceof List) {
                        List list = (List) obj;
                        if (!njy.e(list)) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                d(String.valueOf(it.next()), map);
                            }
                        }
                    } else {
                        map.put(str2, obj);
                    }
                }
            }
        } catch (JSONException e2) {
            LogUtil.e("PLGACHIEVE_AchieveParserUtil", "parseJsonToMap", e2.getMessage());
        }
        return map;
    }

    public static HashMap<String, String> b(HashMap<String, String> map, String str, String str2) {
        if (map == null || str == null || str2 == null) {
            return new HashMap<>();
        }
        if (!map.containsKey(str)) {
            map.put(str, str2);
            return map;
        }
        String str3 = map.get(str);
        StringBuilder sb = new StringBuilder(16);
        sb.append(str3);
        sb.append(",");
        sb.append(str2);
        map.put(str, sb.toString());
        return map;
    }

    private static int d(double d2) {
        for (int i = 0; i < 14; i++) {
            if (d2 < f44674a[i]) {
                return i;
            }
        }
        return 14;
    }

    public static double c(String str, JSONObject jSONObject, double d2, int i) {
        if (jSONObject != null && jSONObject.has(str)) {
            try {
                return jSONObject.getDouble(str);
            } catch (JSONException unused) {
                LogUtil.e("PLGACHIEVE_AchieveParserUtil", "judgeValidKeyDouble Exception");
                return 0.0d;
            }
        }
        return d(d2, i);
    }

    public static double c(int i, int i2) {
        return c(d(i, i2), i, i2);
    }

    private static int d(int i, int i2) {
        for (int i3 = 0; i3 < 10; i3++) {
            if (i < e[i3] * i2) {
                return i3;
            }
        }
        return 10;
    }

    public static double d(double d2, int i) {
        int iD = d(d2);
        if (i == 0) {
            return d(iD, d2, 0);
        }
        return d(iD, d2, 1);
    }

    private static double c(int i, int i2, int i3) {
        String strC;
        if (i > 9) {
            return 99.9d;
        }
        double d2 = 0.0d;
        for (int i4 = 0; i4 < i; i4++) {
            d2 += f44675b[i4];
        }
        double d3 = f44675b[i];
        if (i < 1) {
            strC = ltc.c(((double) (i2 / ((e[i] * i3) * 1.0f))) * d3, 1, 2);
        } else {
            int[] iArr = e;
            int i5 = iArr[i - 1];
            strC = ltc.c(((double) ((i2 - (i5 * i3)) / (((iArr[i] - i5) * i3) * 1.0f))) * d3, 1, 2);
        }
        try {
            return d2 + Double.parseDouble(strC);
        } catch (NumberFormatException unused) {
            LogUtil.e("PLGACHIEVE_AchieveParserUtil", "getPercentBySection Exception");
            return d2;
        }
    }

    private static double d(int i, double d2, int i2) {
        double d3;
        String strC;
        double d4;
        if (i > 13) {
            return 99.9d;
        }
        double d5 = 0.0d;
        for (int i3 = 0; i3 < i; i3++) {
            if (i2 == 0) {
                d4 = d[i3];
            } else {
                d4 = f44676c[i3];
            }
            d5 += d4;
        }
        if (i2 == 0) {
            d3 = d[i];
        } else {
            d3 = f44676c[i];
        }
        if (i < 1) {
            strC = ltc.c((d2 / ((double) f44674a[i])) * d3, 1, 2);
        } else {
            int[] iArr = f44674a;
            int i4 = iArr[i - 1];
            strC = ltc.c(((d2 - ((double) i4)) / ((double) (iArr[i] - i4))) * d3, 1, 2);
        }
        try {
            return d5 + Double.parseDouble(strC);
        } catch (NumberFormatException unused) {
            LogUtil.e("PLGACHIEVE_AchieveParserUtil", "getPercentBySection Exception");
            return d5;
        }
    }
}
