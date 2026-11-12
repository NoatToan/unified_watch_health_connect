package defpackage;

import android.content.Context;
import android.text.format.DateUtils;
import android.util.ArrayMap;
import com.huawei.health.device.open.data.model.HealthData;
import com.huawei.health.h5pro.core.b;
import com.huawei.health.h5pro.utils.LogUtil;
import com.huawei.openalliance.ad.constant.ParamConstants;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes28.dex */
public final class exj {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ArrayMap<String, Integer> f33617c = new ArrayMap<>();

    private void b() {
        ArrayMap<String, Integer> arrayMap = f33617c;
        if (arrayMap.isEmpty()) {
            arrayMap.put("FORMAT_12HOUR", 64);
            arrayMap.put("FORMAT_24HOUR", 128);
            arrayMap.put("FORMAT_ABBREV_ALL", 524288);
            arrayMap.put("FORMAT_ABBREV_MONTH", 65536);
            arrayMap.put("FORMAT_ABBREV_RELATIVE", 262144);
            arrayMap.put("FORMAT_ABBREV_TIME", 16384);
            arrayMap.put("FORMAT_ABBREV_WEEKDAY", 32768);
            arrayMap.put("FORMAT_CAP_AMPM", 256);
            arrayMap.put("FORMAT_CAP_MIDNIGHT", 4096);
            arrayMap.put("FORMAT_CAP_NOON", 1024);
            arrayMap.put("FORMAT_CAP_NOON_MIDNIGHT", 5120);
            arrayMap.put("FORMAT_NO_MIDNIGHT", 2048);
            arrayMap.put("FORMAT_NO_MONTH_DAY", 32);
            arrayMap.put("FORMAT_NO_NOON", 512);
            arrayMap.put("FORMAT_NO_NOON_MIDNIGHT", Integer.valueOf(HealthData.ALTITUDE));
            arrayMap.put("FORMAT_NO_YEAR", 8);
            arrayMap.put("FORMAT_NUMERIC_DATE", 131072);
            arrayMap.put("FORMAT_SHOW_DATE", 16);
            arrayMap.put("FORMAT_SHOW_TIME", 1);
            arrayMap.put("FORMAT_SHOW_WEEKDAY", 2);
            arrayMap.put("FORMAT_SHOW_YEAR", 4);
            arrayMap.put("FORMAT_UTC", 8192);
        }
    }

    public JSONObject b(Context context, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            long jOptLong = jSONObject2.optLong("millis");
            String upperCase = jSONObject2.optString(ParamConstants.Param.FLAGS).toUpperCase(Locale.ENGLISH);
            b();
            int iIntValue = 0;
            for (Map.Entry<String, Integer> entry : f33617c.entrySet()) {
                if (upperCase.contains(entry.getKey())) {
                    iIntValue |= entry.getValue().intValue();
                }
            }
            jSONObject.put("dateTimeStr", DateUtils.formatDateTime(context, jOptLong, iIntValue));
            return jSONObject;
        } catch (JSONException e) {
            LogUtil.e("H5PRO_DateFormatUtils", b.a(e, new StringBuilder("formatDateTime: ")));
            return jSONObject;
        }
    }

    public JSONObject c(Context context, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            long jOptLong = jSONObject2.optLong("startMillis");
            long jOptLong2 = jSONObject2.optLong("endMillis");
            String upperCase = jSONObject2.optString(ParamConstants.Param.FLAGS).toUpperCase(Locale.ENGLISH);
            b();
            int iIntValue = 0;
            for (Map.Entry<String, Integer> entry : f33617c.entrySet()) {
                if (upperCase.contains(entry.getKey())) {
                    iIntValue |= entry.getValue().intValue();
                }
            }
            jSONObject.put("dateTimeStr", DateUtils.formatDateRange(context, jOptLong, jOptLong2, iIntValue));
            return jSONObject;
        } catch (JSONException e) {
            LogUtil.e("H5PRO_DateFormatUtils", b.a(e, new StringBuilder("formatDateRange: ")));
            return jSONObject;
        }
    }
}
