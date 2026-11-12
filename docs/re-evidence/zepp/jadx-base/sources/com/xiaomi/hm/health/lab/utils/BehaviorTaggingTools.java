package com.xiaomi.hm.health.lab.utils;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.profile.grsp.CommonSensorData;
import com.xiaomi.hm.health.bt.profile.grsp.GSensorData;
import com.xiaomi.hm.health.bt.profile.grsp.GeoData;
import com.xiaomi.hm.health.bt.profile.grsp.GyroData;
import com.xiaomi.hm.health.bt.profile.grsp.PPGSensorData;
import com.xiaomi.hm.health.databases.model.LabAction;
import com.xiaomi.hm.health.lab.R;
import com.xiaomi.hm.health.lab.init.LabCallbackInit;
import com.xiaomi.hm.health.lab.model.BehaviorTagEnity;
import com.xiaomi.hm.health.lab.model.CommonSensorRecord;
import com.xiaomi.hm.health.lab.model.GSensorRecord;
import com.xiaomi.hm.health.lab.model.GyroSensorRecord;
import com.xiaomi.hm.health.lab.model.MagnRecord;
import com.xiaomi.hm.health.lab.model.NmeaRecord;
import com.xiaomi.hm.health.lab.model.PPGSensorRecord;
import com.xiaomi.hm.health.lab.model.SensorRecordsEnity;
import com.xiaomi.hm.health.lab.utils.BehaviorTaggingTools;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class BehaviorTaggingTools {
    public static final String EARBUD_SLEEP = "earbud_sleep";
    public static final String HEADSET_SLEEP = "headset_sleep";
    public static final String LAST_LABACTION_ID = "lastLabactionId";
    public static final String NMEA = "nmea";
    public static final String SLEEP = "sleep";
    public static final String SWIM = "swim";
    public static final String TEMPERATURE = "temperature";
    private static final String c = "run";
    private static final String e = "walk";
    private static final String f = "badminton";
    private static final String g = "basketball";
    private static final String q = "BEHAVIOR_TAGGING_SHARE_PREFERENCE";
    private static final String k = "rope";
    private static final String l = "sit-up";
    private static final String d = "stand";
    private static final String o = "stairs";
    private static final String m = "cycling";
    private static final String n = "driving";
    private static final String j = "bus";
    private static final String h = "pingpong";
    private static final String i = "sit";
    private static final String p = "dining";
    private static final String a = "bath";
    private static final String b = "teeth";
    public static final String CUSTOMIZE = "customize";
    public static final BehaviorTagEnity[] BEHAVIOR_TAG_ENITIES = {new BehaviorTagEnity(R.string.action_rope, R.drawable.ic_rope, R.drawable.ic_rope_big, k, true, false), new BehaviorTagEnity(R.string.action_run, R.drawable.ic_run, R.drawable.ic_run_big, "run", true, false), new BehaviorTagEnity(R.string.action_sit_up, R.drawable.ic_sit_up, R.drawable.ic_sit_up_big, l, true, false), new BehaviorTagEnity(R.string.action_walk, R.drawable.ic_walk, R.drawable.ic_walk_big, "walk", true, false), new BehaviorTagEnity(R.string.action_stand, R.drawable.ic_stand, R.drawable.ic_stand_big, d, true, false), new BehaviorTagEnity(R.string.action_stairs, R.drawable.ic_stairs, R.drawable.ic_stairs_big, o, true, false), new BehaviorTagEnity(R.string.action_cycling, R.drawable.ic_cycling, R.drawable.ic_cycling_big, m, true, false), new BehaviorTagEnity(R.string.action_driving, R.drawable.ic_driving, R.drawable.ic_driving_big, n, true, false), new BehaviorTagEnity(R.string.action_bus, R.drawable.ic_bus, R.drawable.ic_bus_big, j, true, false), new BehaviorTagEnity(R.string.action_basketball, R.drawable.ic_basketball, R.drawable.ic_basketball_big, "basketball", true, false), new BehaviorTagEnity(R.string.action_badminton, R.drawable.ic_badminton, R.drawable.ic_badminton_big, "badminton", true, true), new BehaviorTagEnity(R.string.action_pingpong, R.drawable.ic_pingpong, R.drawable.ic_pingpong_big, h, true, true), new BehaviorTagEnity(R.string.action_sit, R.drawable.ic_sit, R.drawable.ic_sit_big, i, true, false), new BehaviorTagEnity(R.string.action_dining, R.drawable.ic_dining, R.drawable.ic_dining_big, p, false, true), new BehaviorTagEnity(R.string.action_sleep, R.drawable.ic_sleep, R.drawable.ic_sleep_big, "sleep", false, false), new BehaviorTagEnity(R.string.action_bath, R.drawable.ic_bath, R.drawable.ic_bath_big, a, false, true), new BehaviorTagEnity(R.string.action_brush_teeth, R.drawable.ic_brush_teeth, R.drawable.ic_brush_teeth_big, b, false, true), new BehaviorTagEnity(R.string.action_customize, R.drawable.ic_customize, R.drawable.ic_customize_big, CUSTOMIZE, true, false)};
    private static Map<String, Integer> r = new HashMap();

    public static void addBehaviorTaggingCountInSpf(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(b(), 0);
        final int i2 = sharedPreferences.getInt(str, 0);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putInt(str, i2 + 1);
        editorEdit.apply();
        HMLog.info("addBehaviorTaggingCountInSpf", new Function0() { // from class: lt
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BehaviorTaggingTools.c(i2);
            }
        });
    }

    private static String b() {
        return String.format(Locale.getDefault(), "%s%s", q, LabCallbackInit.getInitCallBack().getUserId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String c(int i2) {
        return "labs addBehaviorTaggingCountInSpf:" + (i2 + 1);
    }

    private static void d(Context context, JSONObject jSONObject, String str) throws JSONException {
        jSONObject.put(str, getBehaviorTagCountByKeyFromSpf(context, str));
    }

    public static int getBehaviorName(String str) {
        if (r.size() == 0) {
            r.put("sleep", Integer.valueOf(R.string.action_sleep));
            r.put(a, Integer.valueOf(R.string.action_bath));
            r.put(b, Integer.valueOf(R.string.action_brush_teeth));
            r.put("run", Integer.valueOf(R.string.action_run));
            r.put(d, Integer.valueOf(R.string.action_stand));
            r.put("walk", Integer.valueOf(R.string.action_walk));
            r.put("badminton", Integer.valueOf(R.string.action_badminton));
            r.put("basketball", Integer.valueOf(R.string.action_basketball));
            r.put(h, Integer.valueOf(R.string.action_pingpong));
            r.put(i, Integer.valueOf(R.string.action_sit));
            r.put(j, Integer.valueOf(R.string.action_bus));
            r.put(CUSTOMIZE, Integer.valueOf(R.string.action_customize));
            r.put(k, Integer.valueOf(R.string.action_rope));
            r.put(l, Integer.valueOf(R.string.action_sit_up));
            r.put(m, Integer.valueOf(R.string.action_cycling));
            r.put(n, Integer.valueOf(R.string.action_driving));
            r.put(o, Integer.valueOf(R.string.action_stairs));
            r.put(p, Integer.valueOf(R.string.action_dining));
            r.put(SWIM, Integer.valueOf(R.string.action_swim));
            r.put(EARBUD_SLEEP, Integer.valueOf(R.string.action_earbud_sleep));
            r.put(NMEA, Integer.valueOf(R.string.action_nmea));
            r.put("temperature", Integer.valueOf(R.string.action_temperature));
            r.put(HEADSET_SLEEP, Integer.valueOf(R.string.action_headset_sleep));
        }
        return r.containsKey(str) ? r.get(str).intValue() : R.string.action_customize;
    }

    public static int getBehaviorTagCountByKeyFromSpf(Context context, String str) {
        return context.getSharedPreferences(b(), 0).getInt(str, 0);
    }

    public static String getBehaviorTagCountJson(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            Iterator<String> it2 = r.keySet().iterator();
            while (it2.hasNext()) {
                d(context, jSONObject, it2.next());
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject.toString();
    }

    @NonNull
    public static List<CommonSensorRecord> getLabCommonSensors(List<CommonSensorData> list) {
        ArrayList arrayList = new ArrayList();
        for (CommonSensorData commonSensorData : list) {
            CommonSensorRecord commonSensorRecord = new CommonSensorRecord();
            commonSensorRecord.setData(commonSensorData.getData());
            if (commonSensorData.getTimestamp() != null) {
                commonSensorRecord.setTimeStamp(commonSensorData.getTimestamp().longValue());
            }
            arrayList.add(commonSensorRecord);
        }
        return arrayList;
    }

    @NonNull
    public static List<GSensorRecord> getLabGSensors(List<GSensorData> list) {
        ArrayList arrayList = new ArrayList();
        for (GSensorData gSensorData : list) {
            GSensorRecord gSensorRecord = new GSensorRecord();
            gSensorRecord.setAccX((short) gSensorData.getX());
            gSensorRecord.setAccY((short) gSensorData.getY());
            gSensorRecord.setAccZ((short) gSensorData.getZ());
            gSensorRecord.setTimeStamp(gSensorData.getTimestamp());
            arrayList.add(gSensorRecord);
        }
        return arrayList;
    }

    @NonNull
    public static List<GyroSensorRecord> getLabGyros(List<GyroData> list) {
        ArrayList arrayList = new ArrayList();
        for (GyroData gyroData : list) {
            GyroSensorRecord gyroSensorRecord = new GyroSensorRecord();
            gyroSensorRecord.setX((short) gyroData.getX());
            gyroSensorRecord.setY((short) gyroData.getY());
            gyroSensorRecord.setZ((short) gyroData.getZ());
            gyroSensorRecord.setTimeStamp(gyroData.getTimestamp());
            arrayList.add(gyroSensorRecord);
        }
        return arrayList;
    }

    @NonNull
    public static List<MagnRecord> getLabMagns(List<GeoData> list) {
        ArrayList arrayList = new ArrayList();
        for (GeoData geoData : list) {
            MagnRecord magnRecord = new MagnRecord();
            magnRecord.setX((short) geoData.getX());
            magnRecord.setY((short) geoData.getY());
            magnRecord.setZ((short) geoData.getZ());
            magnRecord.setTimeStamp(geoData.getTimestamp());
            arrayList.add(magnRecord);
        }
        return arrayList;
    }

    @NonNull
    public static List<NmeaRecord> getLabNmea(String str) {
        ArrayList arrayList = new ArrayList();
        NmeaRecord nmeaRecord = new NmeaRecord();
        nmeaRecord.setLog(str);
        arrayList.add(nmeaRecord);
        return arrayList;
    }

    @NonNull
    public static List<PPGSensorRecord> getLabPPGSensors(List<PPGSensorData> list) {
        ArrayList arrayList = new ArrayList();
        for (PPGSensorData pPGSensorData : list) {
            PPGSensorRecord pPGSensorRecord = new PPGSensorRecord();
            pPGSensorRecord.setPpg(pPGSensorData.getPpg());
            pPGSensorRecord.setTimeStamp(pPGSensorData.getTimestamp());
            arrayList.add(pPGSensorRecord);
        }
        return arrayList;
    }

    public static String getTaggingFileName(BehaviorTagEnity behaviorTagEnity, SensorRecordsEnity sensorRecordsEnity) {
        return getTaggingFileName(behaviorTagEnity, sensorRecordsEnity, "csv");
    }

    public static void initActionNameMap() {
        if (r.size() == 0) {
            r.put("sleep", Integer.valueOf(R.string.action_sleep));
            r.put(a, Integer.valueOf(R.string.action_bath));
            r.put(b, Integer.valueOf(R.string.action_brush_teeth));
            r.put("run", Integer.valueOf(R.string.action_run));
            r.put(d, Integer.valueOf(R.string.action_stand));
            r.put("walk", Integer.valueOf(R.string.action_walk));
            r.put("badminton", Integer.valueOf(R.string.action_badminton));
            r.put("basketball", Integer.valueOf(R.string.action_basketball));
            r.put(h, Integer.valueOf(R.string.action_pingpong));
            r.put(i, Integer.valueOf(R.string.action_sit));
            r.put(j, Integer.valueOf(R.string.action_bus));
            r.put(CUSTOMIZE, Integer.valueOf(R.string.action_customize));
            r.put(k, Integer.valueOf(R.string.action_rope));
            r.put(l, Integer.valueOf(R.string.action_sit_up));
            r.put(m, Integer.valueOf(R.string.action_cycling));
            r.put(n, Integer.valueOf(R.string.action_driving));
            r.put(o, Integer.valueOf(R.string.action_stairs));
            r.put(p, Integer.valueOf(R.string.action_dining));
            r.put(SWIM, Integer.valueOf(R.string.action_swim));
            r.put(EARBUD_SLEEP, Integer.valueOf(R.string.action_earbud_sleep));
            r.put(NMEA, Integer.valueOf(R.string.action_nmea));
            r.put("temperature", Integer.valueOf(R.string.action_temperature));
            r.put(HEADSET_SLEEP, Integer.valueOf(R.string.action_headset_sleep));
        }
    }

    public static boolean isLabActionStarted(Context context, long j2) {
        return j2 == context.getSharedPreferences(b(), 0).getLong(LAST_LABACTION_ID, 0L);
    }

    public static void resSetLastLabActionId(Context context, long j2) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(b(), 0).edit();
        editorEdit.putLong(LAST_LABACTION_ID, j2);
        editorEdit.apply();
    }

    public static void resetBehaviorTaggingCountInSpf(Context context, List<LabAction> list) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(b(), 0).edit();
        HashMap map = new HashMap();
        Iterator<LabAction> it2 = list.iterator();
        while (it2.hasNext()) {
            String behaviorName = it2.next().getBehaviorName();
            Integer num = (Integer) map.get(behaviorName);
            if (num == null) {
                map.put(behaviorName, 1);
            } else {
                map.put(behaviorName, Integer.valueOf(num.intValue() + 1));
            }
        }
        for (String str : map.keySet()) {
            editorEdit.putInt(str, ((Integer) map.get(str)).intValue());
        }
        editorEdit.apply();
    }

    public static void setByJsonData(String str, Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(b(), 0);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        int i2 = sharedPreferences.getInt(str, 0);
        if (i2 >= 1) {
            editorEdit.putInt(str, i2 - 1);
        }
        editorEdit.apply();
    }

    public static void setSpfByJsonData(Context context, JSONObject jSONObject) {
        if (jSONObject != null) {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(b(), 0).edit();
            for (String str : r.keySet()) {
                editorEdit.putInt(str, jSONObject.optInt(str));
            }
            editorEdit.apply();
        }
    }

    public static String getTaggingFileName(BehaviorTagEnity behaviorTagEnity, SensorRecordsEnity sensorRecordsEnity, String str) {
        if (sensorRecordsEnity == null) {
            return null;
        }
        String realName = TaggingFileUtils.getRealName(behaviorTagEnity.getBehaviorKey(), behaviorTagEnity.getCustomizeBehaviorName());
        String str2 = String.format(Locale.getDefault(), "%d_%s_%s_%s_%s." + str, Short.valueOf(sensorRecordsEnity.getSamplingRate()), sensorRecordsEnity.getSensorType().toLowerCase(), behaviorTagEnity.getUserId(), realName, Long.valueOf(sensorRecordsEnity.getStartTaggingTime()));
        sensorRecordsEnity.setFileName(str2);
        return str2;
    }
}
