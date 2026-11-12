package com.xiaomi.smarthome.server;

import android.text.TextUtils;
import android.util.Log;
import com.xiaomi.smarthome.framework.plugin.FileUtils;
import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class PluginJsonExtra {
    public static final String FILE_MODEL_LIST = "model_list.json";
    private static final String KEY_MODELS = "model_list";
    private static final String KEY_VERSION = "version";
    private static final String TAG = "PluginJsonExtra";
    private JSONObject json;
    private String modelListFile;

    public PluginJsonExtra(File file) {
        if (file == null || !file.isDirectory()) {
            MiJiaLog.writeLogOnAll(LogType.PLUGIN, "PluginManager", TAG, "is dir path:" + file);
            return;
        }
        String str = file + File.separator + FILE_MODEL_LIST;
        this.modelListFile = str;
        String txtFromFile = FileUtils.readTxtFromFile(str);
        if (TextUtils.isEmpty(txtFromFile)) {
            this.json = new JSONObject();
            return;
        }
        try {
            this.json = new JSONObject(txtFromFile);
        } catch (JSONException unused) {
            JSONObject jSONObject = new JSONObject();
            this.json = jSONObject;
            try {
                jSONObject.put(KEY_MODELS, new JSONArray(txtFromFile));
            } catch (JSONException e) {
                MiJiaLog.writeLogOnAll(LogType.PLUGIN, "PluginManager", TAG, Log.getStackTraceString(e));
            }
        }
    }

    public ArrayList<String> readModelList() {
        JSONArray jSONArrayOptJSONArray;
        ArrayList<String> arrayList = new ArrayList<>();
        JSONObject jSONObject = this.json;
        if (jSONObject != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray(KEY_MODELS)) != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                arrayList.add(jSONArrayOptJSONArray.optString(i));
            }
        }
        return arrayList;
    }

    public int readVersion() {
        JSONObject jSONObject = this.json;
        if (jSONObject != null) {
            return jSONObject.optInt("version", 0);
        }
        return 0;
    }

    public boolean save() {
        JSONObject jSONObject;
        String str = this.modelListFile;
        if (str == null || (jSONObject = this.json) == null) {
            return false;
        }
        return FileUtils.writeTxtToFile(str, jSONObject.toString());
    }

    public PluginJsonExtra setModelList(Collection<String> collection) {
        JSONArray jSONArray;
        JSONException e;
        JSONObject jSONObject = this.json;
        if (jSONObject != null) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(KEY_MODELS);
            if (jSONArrayOptJSONArray == null) {
                try {
                    JSONObject jSONObject2 = this.json;
                    jSONArray = new JSONArray();
                    try {
                        jSONObject2.put(KEY_MODELS, jSONArray);
                    } catch (JSONException e2) {
                        e = e2;
                        MiJiaLog.writeLogOnAll(LogType.PLUGIN, "PluginManager", TAG, "setModelList error:" + Log.getStackTraceString(e));
                    }
                } catch (JSONException e3) {
                    jSONArray = jSONArrayOptJSONArray;
                    e = e3;
                }
                jSONArrayOptJSONArray = jSONArray;
            } else {
                HashSet hashSet = new HashSet(collection);
                Iterator<String> it = readModelList().iterator();
                while (it.hasNext()) {
                    hashSet.remove(it.next());
                }
                collection = hashSet;
            }
            Iterator<String> it2 = collection.iterator();
            while (it2.hasNext()) {
                jSONArrayOptJSONArray.put(it2.next());
            }
        }
        return this;
    }

    public PluginJsonExtra setVersion(int i) {
        JSONObject jSONObject = this.json;
        if (jSONObject != null) {
            try {
                jSONObject.put("version", i);
            } catch (JSONException e) {
                MiJiaLog.writeLogOnAll(LogType.PLUGIN, "PluginManager", TAG, "setVersion error:" + Log.getStackTraceString(e));
            }
        }
        return this;
    }
}
