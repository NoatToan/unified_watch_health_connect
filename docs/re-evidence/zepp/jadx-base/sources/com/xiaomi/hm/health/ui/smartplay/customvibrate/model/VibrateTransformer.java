package com.xiaomi.hm.health.ui.smartplay.customvibrate.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.ui.smartplay.customvibrate.VibrateController;
import com.xiaomi.hm.health.ui.smartplay.customvibrate.VibrateHelperKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class VibrateTransformer {
    private static final String a = "VibrateTransformer";
    private static final String b = "type";
    private static final String c = "name";
    private static final String d = "id";
    private static final String e = "times";
    private static final String f = "select_id";
    private static final String g = "vibrate_config";

    @Nullable
    private static VibrateEntity a(JSONObject jsonObject) {
        try {
            VibrateEntity vibrateEntity = new VibrateEntity();
            vibrateEntity.name = jsonObject.getString("name");
            vibrateEntity.id = (short) jsonObject.getInt("id");
            String[] strArrSplit = jsonObject.getString(e).split(",");
            short[] sArr = new short[strArrSplit.length];
            for (int i = 0; i < strArrSplit.length; i++) {
                sArr[i] = Short.valueOf(strArrSplit[i]).shortValue();
            }
            vibrateEntity.times = sArr;
            return vibrateEntity;
        } catch (NumberFormatException e2) {
            HMLog.i(a, "invalid config format: " + e2, new Object[0]);
            return null;
        } catch (JSONException e3) {
            HMLog.i(a, "fromJSON exception: " + e3, new Object[0]);
            return null;
        }
    }

    @NonNull
    public static Object[] b(String jsonStr) {
        HMLog.i(a, "vibrate config: " + jsonStr, new Object[0]);
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject(jsonStr);
            JSONArray jSONArray = jSONObject.getJSONArray(f);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                int i2 = -1;
                VibrateType vibrateTypeFromValue = VibrateType.fromValue(jSONObject2.optInt("type", -1));
                if (VibrateType.INVALID != vibrateTypeFromValue) {
                    int iOptInt = jSONObject2.optInt("id", -1);
                    if (iOptInt != -2) {
                        i2 = iOptInt;
                    }
                    map.put(vibrateTypeFromValue, Integer.valueOf(i2));
                }
            }
            JSONArray jSONArray2 = jSONObject.getJSONArray(g);
            for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                VibrateEntity vibrateEntityA = a(jSONArray2.getJSONObject(i3));
                if (vibrateEntityA != null) {
                    arrayList.add(vibrateEntityA);
                }
            }
        } catch (JSONException e2) {
            HMLog.i(a, "fromJsonStr exception: " + e2, new Object[0]);
        }
        return new Object[]{map, arrayList};
    }

    @Nullable
    private static JSONObject c(VibrateEntity entity) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", entity.name);
            jSONObject.put("id", (int) entity.id);
            StringBuilder sb = new StringBuilder();
            for (short s : entity.times) {
                sb.append((int) s);
                sb.append(",");
            }
            jSONObject.put(e, sb.substring(0, sb.length() - 1));
            return jSONObject;
        } catch (JSONException e2) {
            HMLog.i(a, "toJson exception: " + e2, new Object[0]);
            return null;
        }
    }

    @Nullable
    public static String d(HashMap<VibrateType, Integer> selectedIds, List<VibrateEntity> entities) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry<VibrateType, Integer> entry : selectedIds.entrySet()) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("type", entry.getKey().ordinal());
                jSONObject2.put("id", entry.getValue());
                jSONArray.put(jSONObject2);
            }
            jSONObject.put(f, jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            Iterator<VibrateEntity> it2 = entities.iterator();
            while (it2.hasNext()) {
                JSONObject jSONObjectC = c(it2.next());
                if (jSONObjectC != null) {
                    jSONArray2.put(jSONObjectC);
                }
            }
            jSONObject.put(g, jSONArray2);
            return jSONObject.toString();
        } catch (JSONException e2) {
            HMLog.i(a, "toJSONString: " + e2, new Object[0]);
            return null;
        }
    }

    public static VibrateEntity getVibrateEntity(String name, List<VibrateController.DataSegment> config) {
        ArrayList arrayList = new ArrayList();
        for (VibrateController.DataSegment dataSegment : config) {
            arrayList.add(new VibrateController.DataSegment(dataSegment.vibrate, dataSegment.duration));
        }
        VibrateHelperKt.checkVibrateConfig(arrayList);
        short[] sArr = new short[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            sArr[i] = (short) ((VibrateController.DataSegment) arrayList.get(i)).duration;
        }
        return new VibrateEntity(name, (short) VibrateRepo.getInstance().b(), sArr);
    }
}
