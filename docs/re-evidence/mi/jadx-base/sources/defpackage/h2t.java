package defpackage;

import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.bt.profile.gdsp.pressure.HMPressureData;
import com.xiaomi.hm.health.bt.sdk.DeviceInfoExt;
import com.xiaomi.hm.health.bt.sdk.data.PaiData;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class h2t {
    public static String a(long j, DeviceInfoExt deviceInfoExt, ArrayList<HMPressureData> arrayList) {
        JSONArray jSONArray = new JSONArray();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (HMPressureData hMPressureData : arrayList) {
            if (!hMPressureData.inVaild() && !hMPressureData.repeat()) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(hMPressureData.getTime());
                calendar.set(11, 0);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                long timeInMillis = calendar.getTimeInMillis();
                ArrayList arrayList2 = (ArrayList) linkedHashMap.get(Long.valueOf(timeInMillis));
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(Long.valueOf(timeInMillis), arrayList2);
                }
                arrayList2.add(hMPressureData);
            }
        }
        for (Long l : linkedHashMap.keySet()) {
            ArrayList arrayList3 = (ArrayList) linkedHashMap.get(l);
            if (arrayList3 != null && arrayList3.size() != 0) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    b(j, deviceInfoExt, jSONObject, "all_day_stress");
                    jSONObject.put("timestamp", l.longValue() + 1);
                    jSONObject.put(PaiData.LAST_SYNC_TIME, l.longValue() / 1000);
                    c(arrayList3, jSONObject);
                    jSONArray.put(jSONObject);
                } catch (Exception e) {
                    t5t.d("PressureDataResult", e.getMessage());
                }
            }
        }
        return jSONArray.toString();
    }

    public static void b(long j, DeviceInfoExt deviceInfoExt, JSONObject jSONObject, String str) throws JSONException {
        Calendar calendar = Calendar.getInstance();
        jSONObject.put("userId", String.valueOf(j));
        jSONObject.put("eventType", str);
        jSONObject.put("timeZone", ProfileUtils.getTimezoneKey(calendar.getTimeZone()));
        jSONObject.put("deviceType", String.valueOf(deviceInfoExt.getDeviceType()));
        jSONObject.put("deviceSource", String.valueOf(deviceInfoExt.getDeviceSource()));
        jSONObject.put("deviceMac", deviceInfoExt.getMacAddress());
        jSONObject.put("deviceId", deviceInfoExt.getDeviceId());
    }

    public static void c(ArrayList<HMPressureData> arrayList, JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int iMin = -1;
        int iMax = -1;
        for (HMPressureData hMPressureData : arrayList) {
            int value = hMPressureData.getValue();
            iMax = iMax == -1 ? value : Math.max(iMax, value);
            iMin = iMin == -1 ? value : Math.min(iMin, value);
            i += value;
            if (value <= 39) {
                i2++;
            } else if (value <= 59) {
                i3++;
            } else if (value <= 79) {
                i4++;
            } else if (value <= 100) {
                i5++;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("value", String.valueOf(value));
            jSONObject2.put("time", String.valueOf(hMPressureData.getTime()));
            jSONArray.put(jSONObject2);
        }
        int iRound = Math.round((i * 1.0f) / arrayList.size());
        List<Integer> listA = vp.f37095a.a(i2, i3, i4, i5);
        jSONObject.put("data", jSONArray.toString());
        jSONObject.put("minStress", String.valueOf(iMin));
        jSONObject.put("avgStress", String.valueOf(iRound));
        jSONObject.put("relaxProportion", String.valueOf(listA.get(0)));
        jSONObject.put("normalProportion", String.valueOf(listA.get(1)));
        jSONObject.put("mediumProportion", String.valueOf(listA.get(2)));
        jSONObject.put("highProportion", String.valueOf(listA.get(3)));
    }

    public static String d(long j, DeviceInfoExt deviceInfoExt, ArrayList<HMPressureData> arrayList) {
        JSONArray jSONArray = new JSONArray();
        for (HMPressureData hMPressureData : arrayList) {
            try {
                JSONObject jSONObject = new JSONObject();
                b(j, deviceInfoExt, jSONObject, FitnessPersistKey.ManualStress);
                jSONObject.put("timestamp", hMPressureData.getTime());
                jSONObject.put(PaiData.LAST_SYNC_TIME, (hMPressureData.getTime() / 1000) + 1);
                jSONObject.put("value", String.valueOf(hMPressureData.getValue()));
                jSONArray.put(jSONObject);
            } catch (Exception e) {
                t5t.d("PressureDataResult", e.getMessage());
            }
        }
        return jSONArray.toString();
    }
}
