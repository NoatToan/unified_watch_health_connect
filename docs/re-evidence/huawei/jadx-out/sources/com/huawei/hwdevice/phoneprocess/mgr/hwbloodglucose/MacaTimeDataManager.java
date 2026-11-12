package com.huawei.hwdevice.phoneprocess.mgr.hwbloodglucose;

import android.content.Context;
import android.content.SharedPreferences;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.mqt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class MacaTimeDataManager {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f17468c = new Object();
    private SharedPreferences d;

    public MacaTimeDataManager(Context context) {
        this.d = context.getSharedPreferences("TimeServicePrefs", 0);
    }

    public void a(String str, mqt mqtVar) {
        if (str == null || mqtVar == null) {
            return;
        }
        synchronized (this.f17468c) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("brm", mqtVar.f42198b);
                jSONObject.put("bit", mqtVar.f42197a);
                jSONObject.put("bat", mqtVar.e);
                jSONObject.put("luts", mqtVar.f42199c);
                jSONObject.put("luerts", mqtVar.d);
                SharedPreferences.Editor editorEdit = this.d.edit();
                editorEdit.putString("timedata_" + str, jSONObject.toString());
                editorEdit.apply();
            } catch (JSONException e) {
                LogUtil.j("MACATimeDataManager", "save maca time failed " + e);
            }
        }
    }

    public mqt b(String str) {
        if (str == null) {
            return new mqt();
        }
        synchronized (this.f17468c) {
            String string = this.d.getString("timedata_" + str, null);
            if (string != null) {
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    return new mqt(jSONObject.optInt("brm", 0), jSONObject.optInt("bit", 0), jSONObject.optInt("bat", 0), jSONObject.optLong("luts", 0L), jSONObject.optLong("luerts", 0L));
                } catch (JSONException e) {
                    LogUtil.j("MACATimeDataManager", "load maca time failed " + e);
                    return new mqt();
                }
            }
            LogUtil.j("MACATimeDataManager", "not find maca time");
            return new mqt();
        }
    }
}
