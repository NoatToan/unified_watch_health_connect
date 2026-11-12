package com.huami.moving.webapi;

import com.google.gson.JsonParser;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.mifit.sportlib.model.RunnerData;
import com.huami.mifit.sportlib.utils.HeartRateConstant;
import com.huami.mifit.sportlib.webkit.ISportHttpRequester;
import com.huami.mifit.sportlib.webkit.ISportHttpResponseHandler;
import com.huami.mifit.sportlib.webkit.SportHttpKit;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.Runconfig;
import com.xiaomi.hm.health.databases.model.RunconfigDao;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.query.QueryBuilder;
import org.greenrobot.greendao.query.WhereCondition;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class ConfigAPI {
    private static final String a = "v1/sport/config.json";
    private static final String b = "run";
    private static final String c = "config";
    private static final String d = "sportSetting";
    private static final String e = "sportType";
    private static final String f = "remindPaceEnable";
    private static final String g = "voicePlayEnable";
    private static final String h = "remindHREnable";
    private static final String i = "remindHeartRate";
    private static final String j = "autoPauseEnable";
    private static final String k = "remindPace";
    private static final String l = "measureHREnable";
    private static final String m = "lockScreenDisplay";
    private static final String n = "indoorLearnArray";
    private static final String o = "indoorStepLArray";
    private static final String p = "keepScreenOn";
    private static final String q = "choose_map";
    private static final String r = "chooseDevices";
    private static final String s = "devicesCount";
    private static final String t = "dataItems";
    private static final String u = "autoPausePace";
    private static final String v = "beatEnable";
    private static final String w = "beatValue";

    public class a implements ISportHttpResponseHandler {
        @Override // com.huami.mifit.sportlib.webkit.ISportHttpResponseHandler
        public void onCanceled(int i) {
        }

        @Override // com.huami.mifit.sportlib.webkit.ISportHttpResponseHandler
        public void onFailed(String str) {
        }

        @Override // com.huami.mifit.sportlib.webkit.ISportHttpResponseHandler
        public void onSuccessed(String str) {
            ConfigAPI.d(str);
        }
    }

    public class b implements ISportHttpResponseHandler {
        public final /* synthetic */ List a;

        public b(List list) {
            this.a = list;
        }

        @Override // com.huami.mifit.sportlib.webkit.ISportHttpResponseHandler
        public void onCanceled(int i) {
        }

        @Override // com.huami.mifit.sportlib.webkit.ISportHttpResponseHandler
        public void onFailed(String str) {
        }

        @Override // com.huami.mifit.sportlib.webkit.ISportHttpResponseHandler
        public void onSuccessed(String str) {
            for (Runconfig runconfig : this.a) {
                runconfig.setSynced(0);
                HMDaoManager.getInstance().getRunconfigDao().insertOrReplace(runconfig);
            }
        }
    }

    private static void b() {
        HashMap map = new HashMap();
        map.put("source", DataTypeSource.RunSource.RUN_SOURCE_PHONE.getSource());
        map.put("type", "run");
        ISportHttpRequester requester = SportHttpKit.getInstance().getRequester();
        if (requester == null) {
            return;
        }
        requester.doHttpRequest(a, map, 27, new a());
    }

    private static List<Runconfig> c() {
        QueryBuilder<Runconfig> queryBuilder = HMDaoManager.getInstance().getDaoSession().getRunconfigDao().queryBuilder();
        Property property = RunconfigDao.Properties.Type;
        return queryBuilder.where(property.isNotNull(), new WhereCondition[0]).where(property.gt(0), new WhereCondition[0]).orderAsc(property).list();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(String str) {
        try {
            String strDecode = URLDecoder.decode(new JSONObject(str).getString("config"), "utf-8");
            if (new JsonParser().parse(strDecode).isJsonArray()) {
                JSONArray jSONArray = new JSONArray(strDecode);
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    j(jSONArray.getJSONObject(i2), 0);
                }
                return;
            }
            JSONObject jSONObject = new JSONObject(strDecode);
            if (!jSONObject.has(d)) {
                j(jSONObject, 1);
                j(jSONObject, 8);
                j(jSONObject, 9);
                j(jSONObject, 6);
                return;
            }
            JSONArray jSONArray2 = jSONObject.getJSONArray(d);
            for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                j(jSONArray2.getJSONObject(i3), 0);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            HMLog.i("RunConfigAPI", e2.getMessage(), new Object[0]);
        }
    }

    private static boolean e(JSONArray jSONArray, int i2) {
        if (jSONArray.length() > 0) {
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                try {
                    if (jSONArray.getJSONObject(i3).getInt("sportType") == i2) {
                        return true;
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
        return false;
    }

    private static boolean f(List<Runconfig> list) {
        if (list != null) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (list.get(i2).getSynced().intValue() == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    private static void g(List<Runconfig> list) {
        ISportHttpRequester requester = SportHttpKit.getInstance().getRequester();
        if (requester == null) {
            return;
        }
        requester.doHttpRequest(a, h(list), 26, new b(list));
    }

    private static Map<String, Object> h(List<Runconfig> list) {
        HashMap map = new HashMap();
        try {
            JSONArray jSONArray = new JSONArray();
            for (Runconfig runconfig : list) {
                if (!e(jSONArray, runconfig.getType().intValue())) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("sportType", runconfig.getType());
                    jSONObject.put(f, runconfig.getRemindPaceEnable());
                    jSONObject.put(g, runconfig.getVoicePlayEnable());
                    jSONObject.put(h, runconfig.getRemindHREnable());
                    jSONObject.put(i, runconfig.getRemindHeartRate());
                    jSONObject.put(j, runconfig.getAutoPauseEnable());
                    jSONObject.put(k, ((double) runconfig.getRemindPace().intValue()) / 1000.0d);
                    jSONObject.put(l, runconfig.getMeasureHREnable());
                    jSONObject.put(m, runconfig.getLockScreenDisplay());
                    jSONObject.put(n, runconfig.getIndoorModelArray());
                    jSONObject.put(o, runconfig.getStepLengthArray());
                    jSONObject.put(p, runconfig.getKeepScreenOn());
                    jSONObject.put(q, runconfig.getChooseMap());
                    jSONObject.put(r, runconfig.getChooseDevices());
                    jSONObject.put(s, runconfig.getDevicesCount());
                    jSONObject.put(t, runconfig.getDataItems());
                    jSONObject.put(u, ((double) runconfig.getAutoPausePace().intValue()) / 1000.0d);
                    jSONObject.put(v, runconfig.getBeatEnable());
                    jSONObject.put(w, runconfig.getBeatValue());
                    jSONArray.put(jSONObject);
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            if (jSONArray.length() > 0) {
                jSONObject2 = new JSONObject(jSONArray.getJSONObject(0).toString());
                jSONObject2.put(d, jSONArray);
            }
            map.put("source", DataTypeSource.RunSource.RUN_SOURCE_PHONE.getSource());
            map.put("type", "run");
            map.put("config", URLEncoder.encode(jSONObject2.toString(), "utf-8"));
        } catch (Exception e2) {
            e2.printStackTrace();
            HMLog.e("RunConfigAPI", e2.getMessage(), new Object[0]);
        }
        return map;
    }

    private static Runconfig i(int i2) {
        List<Runconfig> list = HMDaoManager.getInstance().getDaoSession().getRunconfigDao().queryBuilder().where(RunconfigDao.Properties.Type.eq(Integer.valueOf(i2)), new WhereCondition[0]).list();
        if (list == null || list.size() <= 0) {
            return null;
        }
        Runconfig runconfig = list.get(0);
        if (list.size() <= 1) {
            return runconfig;
        }
        for (int i3 = 1; i3 < list.size(); i3++) {
            HMDaoManager.getInstance().getDaoSession().getRunconfigDao().delete(list.get(i3));
        }
        return runconfig;
    }

    private static void j(JSONObject jSONObject, int i2) {
        Runconfig runconfig = new Runconfig();
        runconfig.setType(Integer.valueOf(i2 == 0 ? jSONObject.optInt("sportType", 1) : i2));
        runconfig.setAutoPauseEnable(Boolean.valueOf(jSONObject.optBoolean(j, false)));
        runconfig.setVoicePlayEnable(Boolean.valueOf(jSONObject.optBoolean(g, true)));
        runconfig.setMeasureHREnable(Boolean.valueOf(jSONObject.optBoolean(l, true)));
        runconfig.setRemindHREnable(Boolean.valueOf(jSONObject.optBoolean(h, false)));
        runconfig.setRemindPaceEnable(Boolean.valueOf(jSONObject.optBoolean(f, false)));
        runconfig.setLockScreenDisplay(Boolean.valueOf(jSONObject.optBoolean(m, true)));
        runconfig.setIndoorModelArray(jSONObject.optString(n));
        runconfig.setStepLengthArray(jSONObject.optString(o));
        runconfig.setKeepScreenOn(Boolean.valueOf(jSONObject.optBoolean(p, false)));
        runconfig.setChooseMap(0);
        runconfig.setChooseDevices(jSONObject.optString(r));
        runconfig.setDevicesCount(Integer.valueOf(jSONObject.optInt(s)));
        runconfig.setDataItems(jSONObject.optString(t));
        runconfig.setBeatEnable(Boolean.valueOf(jSONObject.optBoolean(v, false)));
        runconfig.setBeatValue(Integer.valueOf(jSONObject.optInt(w, 180)));
        double dOptDouble = jSONObject.optDouble(k, -1.0d) * 1000.0d;
        if (dOptDouble > 1.0d) {
            runconfig.setRemindPace(Integer.valueOf((int) dOptDouble));
        } else if (runconfig.getType().intValue() == 9) {
            runconfig.setRemindPace(144);
        } else {
            runconfig.setRemindPace(360);
        }
        int iOptInt = jSONObject.optInt(i, 39);
        if (HeartRateConstant.isHRValueValid(iOptInt)) {
            runconfig.setRemindHeartRate(Integer.valueOf(iOptInt));
        } else {
            int age = RunnerData.getRunner().getAge();
            if (age > 0) {
                runconfig.setRemindHeartRate(Integer.valueOf((int) (((double) (220 - age)) * 0.8d)));
            } else {
                runconfig.setRemindHeartRate(150);
            }
        }
        double dOptDouble2 = jSONObject.optDouble(u, -1.0d);
        if (dOptDouble2 > 0.0d) {
            runconfig.setAutoPausePace(Integer.valueOf((int) (dOptDouble2 * 1000.0d)));
        } else if (runconfig.getType().intValue() == 9) {
            runconfig.setAutoPausePace(360);
        } else if (runconfig.getType().intValue() == 6) {
            runconfig.setAutoPausePace(720);
        } else {
            runconfig.setAutoPausePace(600);
        }
        runconfig.setSynced(Integer.valueOf(i2 <= 0 ? 0 : 1));
        Runconfig runconfigI = i(runconfig.getType().intValue());
        if (runconfigI != null) {
            runconfig.setId(runconfigI.getId());
        }
        HMDaoManager.getInstance().getRunconfigDao().insertOrReplace(runconfig);
    }

    public static boolean postRunConfigInSynced() {
        List<Runconfig> listC = c();
        if (!f(listC)) {
            return true;
        }
        ISportHttpRequester requester = SportHttpKit.getInstance().getRequester();
        if (requester == null) {
            return false;
        }
        boolean zDoHttpRequestSync = requester.doHttpRequestSync(a, h(listC), 26, null);
        if (zDoHttpRequestSync) {
            for (Runconfig runconfig : listC) {
                runconfig.setSynced(0);
                HMDaoManager.getInstance().getRunconfigDao().insertOrReplace(runconfig);
            }
        }
        return zDoHttpRequestSync;
    }

    public static void requestRunConfig() {
        b();
    }

    public static void syncRunConfigs() {
        List<Runconfig> listC = c();
        if (f(listC)) {
            g(listC);
        }
    }
}
