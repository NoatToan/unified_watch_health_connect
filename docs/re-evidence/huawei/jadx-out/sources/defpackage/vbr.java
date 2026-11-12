package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.util.Pair;
import androidx.core.content.ContextCompat;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.adapter.RecyclerHolder;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.temperature.view.levelcard.TemperatureCardView;
import health.compact.a.UnitUtil;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes19.dex */
public class vbr {
    public static final int d = vbk.c().g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f50911b = vbk.c().o();
    public static final int e = vbk.c().q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f50910a = "";

    public static float b(float f, float f2, float f3, float f4) {
        if (f == 0.0f && f2 == 0.0f && f3 > 0.0f && f4 > 0.0f) {
            return f3 + 0.8f;
        }
        if (f <= 0.0f || f2 <= 0.0f || f3 != 0.0f || f4 != 0.0f) {
            if (f <= 0.0f || f2 <= 0.0f || f3 <= 0.0f || f4 <= 0.0f) {
                return 0.0f;
            }
            if (f3 > f) {
                return f3 + 0.8f;
            }
        }
        return f;
    }

    public static boolean i(float f) {
        return f > 42.0f || f < 34.0f;
    }

    public static long c(long j) {
        return lsl.i(j, 30);
    }

    public static long a(String str) {
        try {
            Date date = new SimpleDateFormat("HH:mm", Locale.getDefault()).parse(str);
            if (date == null) {
                LogUtil.j("TemperatureUtils", "getTimestampByString date is null ", str);
                return System.currentTimeMillis();
            }
            return date.getTime();
        } catch (ParseException unused) {
            LogUtil.j("TemperatureUtils", "getTimestampByString ParseException ", str);
            return System.currentTimeMillis();
        }
    }

    public static String a(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.set(14, 0);
        calendar.set(13, 0);
        calendar.set(12, 0);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.add(11, 1);
        return DateUtils.formatDateRange(BaseApplication.getContext(), timeInMillis, calendar.getTimeInMillis(), 129);
    }

    public static int e(float f) {
        int i;
        LogUtil.d("TemperatureUtils", "getProgressOfTemperature, value = ", Float.valueOf(f));
        if (f < 34.0f) {
            i = 0;
        } else if (f < 37.2f) {
            i = (int) (((f - 34.0f) * 68.0f) / 3.2000008f);
        } else if (f == 37.2f) {
            i = 68;
        } else {
            i = f <= 38.0f ? ((int) (((f - 37.2f) * 34.0f) / 0.79999924f)) + 68 : ((int) (((f - 38.0f) * 34.0f) / 4.0f)) + 102;
        }
        LogUtil.d("TemperatureUtils", "getProgressOfTemperature, progress = ", Integer.valueOf(i));
        return i + 3;
    }

    public static void a(List<HiHealthData> list, TemperatureCardView temperatureCardView) {
        if (temperatureCardView == null) {
            LogUtil.j("TemperatureUtils", "notifyLevelCardView mCardView is null");
            return;
        }
        HashMap map = new HashMap();
        if (njy.e(list)) {
            LogUtil.j("TemperatureUtils", "notifyLevelCardView data list is isEmpty");
            map.put("TEMPERATURE_MIN_MAX", "--");
            map.put("SKIN_TEMPERATURE_MIN_MAX", "--");
            temperatureCardView.b(map);
            return;
        }
        HiHealthData hiHealthData = list.get(0);
        String strA = a(hiHealthData.getFloat("body_min_key"));
        String strA2 = a(hiHealthData.getFloat("body_max_key"));
        String strA3 = a(hiHealthData.getFloat("skin_min_key"));
        String strA4 = a(hiHealthData.getFloat("skin_max_key"));
        String str = strA + Constants.LINK + strA2;
        if (str.equals("0.0-0.0")) {
            str = "--";
        }
        String str2 = strA3 + Constants.LINK + strA4;
        String str3 = str2.equals("0.0-0.0") ? "--" : str2;
        LogUtil.d("TemperatureUtils", "bodyMinMax ", str, "skinMinMax ", str3);
        map.put("TEMPERATURE_MIN_MAX", str);
        map.put("SKIN_TEMPERATURE_MIN_MAX", str3);
        temperatureCardView.b(map);
    }

    public static String e() {
        if (UnitUtil.a()) {
            return qre.a(R.string.IDS_settings_health_temperature_unit, "");
        }
        return qre.a(R.string.IDS_temp_unit_fahrenheit, "");
    }

    public static String a(float f) {
        return e(f, UnitUtil.a());
    }

    public static String e(float f, boolean z) {
        if (f == 0.0f) {
            return String.valueOf(f);
        }
        if (z) {
            return UnitUtil.e(f, 1, 1);
        }
        return UnitUtil.e((f * 1.8f) + 32.0f, 1, 1);
    }

    public static float c(float f) {
        if (f == 0.0f) {
            return f;
        }
        if (!UnitUtil.a()) {
            f = (f * 1.8f) + 32.0f;
        }
        return (float) UnitUtil.d(f, 1);
    }

    public static float h(float f) {
        return UnitUtil.a() ? f : b(f);
    }

    public static float b(float f) {
        return new BigDecimal((f * 1.8f) + 32.0f).setScale(1, 4).floatValue();
    }

    public static float d(float f) {
        return new BigDecimal((f - 32.0f) / 1.8f).setScale(1, 4).floatValue();
    }

    public static float a(float f, float f2, boolean z) {
        float fH = h(z ? 34.0f : 20.0f);
        float fH2 = h(42.0f);
        if (f2 <= f || f > fH2) {
            return fH;
        }
        float fFloor = (int) Math.floor(f);
        if (fFloor % 2.0f != 0.0f) {
            fFloor -= 1.0f;
        }
        if (f - fFloor < 0.5f) {
            fFloor -= 2.0f;
        }
        float f3 = fH - 2.0f;
        return fFloor < f3 ? f3 : fFloor;
    }

    public static float b(float f, float f2, boolean z) {
        float fH = h(z ? 34.0f : 20.0f);
        float fH2 = h(42.0f);
        if (f2 > f && f2 >= fH) {
            float fCeil = (int) Math.ceil(f2);
            if (fCeil % 2.0f != 0.0f) {
                fCeil += 1.0f;
            }
            if (fCeil <= fH2) {
                return fCeil;
            }
        }
        return fH2;
    }

    public static float b(boolean z) {
        return h(42.0f);
    }

    public static float c(boolean z) {
        return h(z ? 34.0f : 20.0f);
    }

    public static List<vae> c(List<HiHealthData> list) {
        ArrayList arrayList = new ArrayList();
        if (njy.e(list)) {
            return arrayList;
        }
        HashMap map = new HashMap();
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData != null) {
                long jF = ltb.f(hiHealthData.getStartTime());
                if (!map.containsKey(Long.valueOf(jF))) {
                    map.put(Long.valueOf(jF), new ArrayList());
                }
                ((List) map.get(Long.valueOf(jF))).add(hiHealthData);
            }
        }
        boolean zA = UnitUtil.a();
        for (Map.Entry entry : map.entrySet()) {
            if (entry != null) {
                vae vaeVar = new vae();
                vaeVar.d(((Long) entry.getKey()).longValue());
                List<vai> listE = e((List<HiHealthData>) entry.getValue(), zA);
                Collections.sort(listE, new Comparator() { // from class: vbn
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return Long.compare(((vai) obj2).e(), ((vai) obj).e());
                    }
                });
                vaeVar.setChildList(listE);
                arrayList.add(vaeVar);
            }
        }
        Collections.sort(arrayList, new Comparator() { // from class: vbq
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((vae) obj2).c(), ((vae) obj).c());
            }
        });
        return arrayList;
    }

    public static List<vai> b(List<HiHealthData> list) {
        return e(list, UnitUtil.a());
    }

    public static List<vai> e(List<HiHealthData> list, boolean z) {
        String strE;
        ArrayList arrayList = new ArrayList();
        if (njy.e(list)) {
            LogUtil.j("TemperatureUtils", "convert list is empty");
            return arrayList;
        }
        Context context = BaseApplication.getContext();
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData != null) {
                vai vaiVar = new vai(hiHealthData.getStartTime(), hiHealthData.getEndTime());
                vaiVar.c(hiHealthData.getType());
                long endTime = hiHealthData.getEndTime() - 600000;
                long endTime2 = hiHealthData.getEndTime();
                vaiVar.d(DateUtils.formatDateRange(context, endTime, endTime2, 137));
                vaiVar.b(DateUtils.formatDateRange(context, endTime, endTime2, 131225));
                if (hiHealthData.getType() == f50911b) {
                    strE = a(z, 37.2f);
                } else {
                    strE = e(hiHealthData.getMetaData(), z);
                }
                if (!strE.isEmpty()) {
                    vaiVar.a(strE);
                    arrayList.add(vaiVar);
                }
            }
        }
        return arrayList;
    }

    public static String a(boolean z, float f) {
        String string;
        if (z) {
            string = BaseApplication.getContext().getString(R.string.IDS_hw_health_blood_oxygen_measure_interval_greater_than, UnitUtil.e(f, 1, 1));
        } else {
            string = BaseApplication.getContext().getString(R.string.IDS_hw_health_blood_oxygen_measure_interval_greater_than, UnitUtil.e(b(f), 1, 1));
        }
        return BaseApplication.getContext().getString(R.string.IDS_temp_desc_suspect, string);
    }

    private static String e(String str, boolean z) {
        String string;
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("TemperatureUtils", "getCelsiusRange metaData is empty");
            return "";
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            float fMin = 0.0f;
            float fMax = 0.0f;
            for (int i = 0; i < jSONArray.length(); i++) {
                Object obj = jSONArray.get(i);
                if (obj instanceof Integer) {
                    int iIntValue = ((Integer) obj).intValue();
                    if (i == 0) {
                        fMin = iIntValue;
                    }
                    float f = iIntValue;
                    fMin = Math.min(fMin, f);
                    fMax = Math.max(fMax, f);
                } else {
                    LogUtil.j("TemperatureUtils", "convert no Integer");
                }
            }
            if (fMin == 0.0f || fMax == 0.0f) {
                LogUtil.j("TemperatureUtils", "max or min error");
                return "";
            }
            String strE = e(fMin / 10.0f, z);
            String strE2 = e(fMax / 10.0f, z);
            if (z) {
                string = BaseApplication.getContext().getString(R.string.IDS_temperature_warning_celsius);
            } else {
                string = BaseApplication.getContext().getString(R.string.IDS_temperature_warning_fahrenheit);
            }
            return String.format(Locale.ENGLISH, string, strE, strE2);
        } catch (JSONException unused) {
            LogUtil.e("TemperatureUtils", "convert JSONException");
            return "";
        }
    }

    public static boolean c(float f, String str) {
        if ("TEMPERATURE_MIN_MAX".equals(str)) {
            return f > 42.0f || f < 34.0f;
        }
        return f > 42.0f || f < 20.0f;
    }

    public static Pair<String, String> d(float f, float f2, float f3, float f4) {
        if (f == 0.0f && f2 == 0.0f && f3 > 0.0f && f4 > 0.0f) {
            if (f3 != f4) {
                return d(f3, f4);
            }
            return j(f4);
        }
        if (f > 0.0f && f2 > 0.0f && f3 == 0.0f && f4 == 0.0f) {
            return d(f, f2);
        }
        if (f > 0.0f && f2 > 0.0f && f3 > 0.0f && f4 > 0.0f) {
            return d(Math.max(f, f3), Math.min(f2, f4));
        }
        return new Pair<>("--", "");
    }

    private static Pair<String, String> d(float f, float f2) {
        String string;
        String string2 = BaseApplication.getContext().getString(R.string.IDS_hw_health_coresleep_standard_range_1, UnitUtil.e(f2, 1, 1), UnitUtil.e(f, 1, 1));
        if (UnitUtil.a()) {
            string = BaseApplication.getContext().getString(com.huawei.health.servicesui.R.string.IDS_temperature_celsius_unit, string2);
        } else {
            string = BaseApplication.getContext().getString(com.huawei.health.servicesui.R.string.IDS_temperature_fahrenheit_unit, string2);
        }
        return new Pair<>(string, string2);
    }

    private static Pair<String, String> j(float f) {
        String string;
        String strE = UnitUtil.e(f, 1, 1);
        if (UnitUtil.a()) {
            string = BaseApplication.getContext().getString(com.huawei.health.servicesui.R.string.IDS_temp_over_suspected_celsius_unit, strE);
        } else {
            string = BaseApplication.getContext().getString(com.huawei.health.servicesui.R.string.IDS_temp_over_suspected_fahrenheit_unit, strE);
        }
        return new Pair<>(string, strE);
    }

    public static float a(float f, float f2, float f3, float f4) {
        if (f == 0.0f && f2 == 0.0f && f3 > 0.0f && f4 > 0.0f) {
            return f4;
        }
        if (f > 0.0f && f2 > 0.0f && f3 == 0.0f && f4 == 0.0f) {
            return f2;
        }
        if (f <= 0.0f || f2 <= 0.0f || f3 <= 0.0f || f4 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(f2, f4);
    }

    public static void b(List<HiHealthData> list, List<HiHealthData> list2) {
        ArrayList arrayList = new ArrayList(16);
        ArrayList arrayList2 = new ArrayList(16);
        ArrayList arrayList3 = new ArrayList(16);
        if (njy.e(list)) {
            LogUtil.j("TemperatureUtils", "getCardMaxMin list is null");
            return;
        }
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData != null) {
                float fFloatValue = new BigDecimal(hiHealthData.getFloat("body_min_key")).setScale(1, 4).floatValue();
                if (!c(fFloatValue, "TEMPERATURE_MIN_MAX")) {
                    arrayList.add(Float.valueOf(fFloatValue));
                }
                float fFloatValue2 = new BigDecimal(hiHealthData.getFloat("body_max_key")).setScale(1, 4).floatValue();
                if (!c(fFloatValue2, "TEMPERATURE_MIN_MAX")) {
                    arrayList.add(Float.valueOf(fFloatValue2));
                }
                float fFloatValue3 = new BigDecimal(hiHealthData.getFloat("skin_min_key")).setScale(1, 4).floatValue();
                if (!c(fFloatValue3, "SKIN_TEMPERATURE_MIN_MAX")) {
                    arrayList2.add(Float.valueOf(fFloatValue3));
                }
                float fFloatValue4 = new BigDecimal(hiHealthData.getFloat("skin_max_key")).setScale(1, 4).floatValue();
                if (!c(fFloatValue4, "SKIN_TEMPERATURE_MIN_MAX")) {
                    arrayList2.add(Float.valueOf(fFloatValue4));
                }
                float fFloatValue5 = new BigDecimal(hiHealthData.getFloat("suspected_temperature_high_min_key")).setScale(1, 4).floatValue();
                if (!i(fFloatValue5)) {
                    arrayList3.add(Float.valueOf(fFloatValue5));
                }
                float fFloatValue6 = new BigDecimal(hiHealthData.getFloat("suspected_temperature_high_max_key")).setScale(1, 4).floatValue();
                if (!i(fFloatValue6)) {
                    arrayList3.add(Float.valueOf(fFloatValue6));
                }
            }
        }
        HiHealthData hiHealthData2 = new HiHealthData();
        if (njy.b(arrayList)) {
            hiHealthData2.putFloat("body_max_key", ((Float) Collections.max(arrayList)).floatValue());
            hiHealthData2.putFloat("body_min_key", ((Float) Collections.min(arrayList)).floatValue());
        }
        if (njy.b(arrayList2)) {
            hiHealthData2.putFloat("skin_max_key", ((Float) Collections.max(arrayList2)).floatValue());
            hiHealthData2.putFloat("skin_min_key", ((Float) Collections.min(arrayList2)).floatValue());
        }
        if (njy.b(arrayList3)) {
            hiHealthData2.putFloat("suspected_temperature_high_max_key", ((Float) Collections.max(arrayList3)).floatValue());
            hiHealthData2.putFloat("suspected_temperature_high_min_key", ((Float) Collections.min(arrayList3)).floatValue());
        }
        list2.add(hiHealthData2);
    }

    public static String d() {
        return f50910a;
    }

    public static void c(String str) {
        f50910a = str;
    }

    public static void d(vai vaiVar, RecyclerHolder recyclerHolder) {
        b(vaiVar, recyclerHolder, UnitUtil.a());
    }

    public static void b(vai vaiVar, RecyclerHolder recyclerHolder, boolean z) {
        String string;
        if (recyclerHolder == null || vaiVar == null) {
            LogUtil.j("TemperatureUtils", "setTextProperties holder or itemData is null");
            return;
        }
        Context context = BaseApplication.getContext();
        if (z) {
            string = context.getResources().getString(R.string.IDS_settings_health_temperature_unit, vaiVar.f());
        } else {
            string = context.getResources().getString(R.string.IDS_temp_unit_fahrenheit, vaiVar.f());
        }
        recyclerHolder.a(R.id.temperature_list_data, string);
        if (vaiVar.a() == d) {
            recyclerHolder.d(R.id.temperature_list_status, ContextCompat.getColor(context, R.color.temperature_level_low_color_blue));
            recyclerHolder.a(R.id.temperature_list_status, context.getString(R.string.IDS_temperature_warning_low));
        } else {
            recyclerHolder.d(R.id.temperature_list_status, ContextCompat.getColor(context, R.color.temperature_level_high_color_red));
            recyclerHolder.a(R.id.temperature_list_status, context.getString(R.string.IDS_temperature_warning_high));
        }
    }
}
