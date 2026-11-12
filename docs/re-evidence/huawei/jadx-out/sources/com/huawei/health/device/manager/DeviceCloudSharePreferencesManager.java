package com.huawei.health.device.manager;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class DeviceCloudSharePreferencesManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f6316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f6317c;
    private Context e;

    public DeviceCloudSharePreferencesManager(Context context) {
        this(context, null);
    }

    public DeviceCloudSharePreferencesManager(Context context, String str) {
        this.f6316b = "threedevicecloudSPfile";
        if (TextUtils.isEmpty(str)) {
            this.f6317c = this.f6316b;
        } else {
            this.f6317c = str;
        }
        this.e = context;
    }

    public void b(String str, String str2) {
        Context context;
        if (str2 == null || (context = this.e) == null) {
            LogUtil.j("Plugin_DeviceCloudSharePreferencesManager", "commitFreshTimeToSharePreferences mContext is null or value is null");
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(this.f6317c, 0).edit();
        editorEdit.putString(str, str2);
        editorEdit.commit();
    }

    public void c(String str, boolean z) {
        Context context = this.e;
        if (context == null) {
            LogUtil.j("Plugin_DeviceCloudSharePreferencesManager", "commitStatusToSharePreferences mContext is null");
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(this.f6317c, 0).edit();
        editorEdit.putBoolean(str, z);
        editorEdit.commit();
    }

    public String b(String str) {
        Context context = this.e;
        if (context == null) {
            LogUtil.j("Plugin_DeviceCloudSharePreferencesManager", "getFreshTimeFromSharePreferences mContext is null");
            return "0";
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(this.f6317c, 0);
        return !sharedPreferences.contains(str) ? "0" : sharedPreferences.getString(str, "0");
    }

    public void e(String str, boolean z) {
        Context context = this.e;
        if (context == null) {
            LogUtil.j("Plugin_DeviceCloudSharePreferencesManager", "commitUserDownloadToSharePreferences mContext is null");
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(this.f6317c, 0).edit();
        editorEdit.putBoolean(str, z);
        editorEdit.commit();
    }

    public boolean d(String str) {
        Context context = this.e;
        if (context == null) {
            LogUtil.j("Plugin_DeviceCloudSharePreferencesManager", "getStatusFromSharePreferences mContext is null");
            return false;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(this.f6317c, 0);
        if (sharedPreferences.contains(str)) {
            return sharedPreferences.getBoolean(str, false);
        }
        return false;
    }

    public boolean h(String str) {
        Context context = this.e;
        if (context == null) {
            LogUtil.j("Plugin_DeviceCloudSharePreferencesManager", "getUserDownloadFromSharePreferences mContext is null");
            return false;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(this.f6317c, 0);
        if (sharedPreferences.contains(str)) {
            return sharedPreferences.getBoolean(str, false);
        }
        return false;
    }

    public long c(String str) {
        Context context = this.e;
        if (context == null) {
            LogUtil.j("Plugin_DeviceCloudSharePreferencesManager", "getLongData mContext is null");
            return 0L;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(this.f6317c, 0);
        if (sharedPreferences.contains(str)) {
            return sharedPreferences.getLong(str, 0L);
        }
        return 0L;
    }

    public void e(String str, long j) {
        Context context = this.e;
        if (context == null) {
            LogUtil.j("Plugin_DeviceCloudSharePreferencesManager", "putLongData mContext is null");
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(this.f6317c, 0).edit();
        editorEdit.putLong(str, j);
        editorEdit.commit();
    }

    public String e(String str) {
        Context context = this.e;
        if (context == null) {
            return "";
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(this.f6317c, 0);
        return !sharedPreferences.contains(str) ? "" : sharedPreferences.getString(str, "");
    }

    public void a(String str, String str2) {
        Context context = this.e;
        if (context == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(this.f6317c, 0).edit();
        editorEdit.putString(str, str2);
        editorEdit.commit();
    }

    public void d(String str, Map<String, String> map) {
        if (this.e == null || TextUtils.isEmpty(str) || map == null) {
            LogUtil.d("Plugin_DeviceCloudSharePreferencesManager", "putHashMapData param is null");
            return;
        }
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), entry.getValue());
            } catch (JSONException unused) {
                LogUtil.e("Plugin_DeviceCloudSharePreferencesManager", "putHashMapData JSONException");
            }
        }
        jSONArray.put(jSONObject);
        SharedPreferences.Editor editorEdit = this.e.getSharedPreferences(this.f6317c, 0).edit();
        editorEdit.putString(str, jSONArray.toString());
        editorEdit.commit();
    }

    public Map<String, String> a(String str) {
        if (this.e == null) {
            return new HashMap();
        }
        HashMap map = new HashMap();
        try {
            JSONArray jSONArray = new JSONArray(this.e.getSharedPreferences(this.f6317c, 0).getString(str, ""));
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                JSONArray jSONArrayNames = jSONObject.names();
                if (jSONArrayNames != null) {
                    for (int i2 = 0; i2 < jSONArrayNames.length(); i2++) {
                        String string = jSONArrayNames.getString(i2);
                        map.put(string, jSONObject.getString(string));
                    }
                }
            }
        } catch (JSONException unused) {
            LogUtil.e("Plugin_DeviceCloudSharePreferencesManager", "getHashMapData JSONException");
        }
        return map;
    }
}
