package com.huawei.pluginachievement.report.iterface;

import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.PluginAchieveAdapter;
import defpackage.oru;
import defpackage.osf;
import defpackage.otl;
import defpackage.oww;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public abstract class BaseCalculator {
    private static final String TAG = "BaseCalculator";
    private static JSONObject sAcquiredStar = new JSONObject();

    public abstract void compute(int i);

    public PluginAchieveAdapter getPluginAchieveAdapter() {
        return oru.a(BaseApplication.getContext()).getAdapter();
    }

    public void insertData(int i, String str, int i2, String str2) {
        otl otlVarB = otl.b(BaseApplication.getContext());
        osf osfVarC = oww.c(i, str, i2);
        osfVarC.setValues(str2);
        oww.a(osfVarC, otlVarB);
    }

    public void insertData(int i, String str, Map<Integer, String> map) {
        if (map == null || map.isEmpty()) {
            LogUtil.j(TAG, "insertData: dataMap is empty, type -> " + str);
        } else {
            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                insertData(i, str, entry.getKey().intValue(), entry.getValue());
            }
        }
    }

    public String getStarAcquired() {
        String string;
        synchronized (this) {
            string = sAcquiredStar.toString();
        }
        return string;
    }

    public boolean addStarData(String str, int i) {
        synchronized (this) {
            try {
                sAcquiredStar.put(str, i);
            } catch (JSONException unused) {
                return false;
            }
        }
        return true;
    }

    public void clearStarData() {
        synchronized (this) {
            try {
                JSONArray jSONArrayNames = sAcquiredStar.names();
                if (jSONArrayNames != null && jSONArrayNames.length() != 0) {
                    for (int i = 0; i < jSONArrayNames.length(); i++) {
                        sAcquiredStar.remove(jSONArrayNames.getString(i));
                    }
                }
            } catch (JSONException unused) {
                LogUtil.e(TAG, "clearStarData error");
            }
        }
    }
}
