package com.huami.watch.companion.device.config;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.util.ArraysUtil;
import com.huami.watch.util.Box;
import com.huami.watch.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class FeatureConfig {
    private static final String b = "FeatureConfig";
    private static FeatureConfig c;
    private Map<String, List<String>> a = new HashMap();

    private FeatureConfig() {
    }

    private String a() {
        String string = Box.get().getString(b);
        Log.d(b, "Read Saved : " + string, new Object[0]);
        return string;
    }

    public static FeatureConfig get() {
        if (c == null) {
            c = new FeatureConfig();
        }
        return c;
    }

    public void clear() {
        this.a.clear();
    }

    public void load(Device device) {
        JSONArray jSONArrayOptJSONArray;
        if (device == null || TextUtils.isEmpty(device.info().getHuamiModel())) {
            Log.w(b, "Load <" + device + "> is Null or Model is Empty!!", new Object[0]);
            return;
        }
        String huamiModel = device.info().getHuamiModel();
        ArrayList arrayList = new ArrayList();
        this.a.put(huamiModel, arrayList);
        String strA = a();
        if (!TextUtils.isEmpty(strA)) {
            try {
                JSONObject jSONObjectOptJSONObject = new JSONObject(strA).optJSONObject(huamiModel);
                if (jSONObjectOptJSONObject != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("support")) != null && jSONArrayOptJSONArray.length() > 0) {
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        arrayList.add(jSONArrayOptJSONArray.getString(i));
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        Log.d(b, "Load <" + huamiModel + ">, SupportFeatures : " + ArraysUtil.toString(arrayList), new Object[0]);
    }

    public void save(@NonNull Device device, JSONObject jSONObject) {
        String huamiModel = device.info().getHuamiModel();
        Log.d(b, "Save <" + huamiModel + "> : " + jSONObject, new Object[0]);
        String strA = a();
        try {
            JSONObject jSONObject2 = TextUtils.isEmpty(strA) ? new JSONObject() : new JSONObject(strA);
            jSONObject2.put(huamiModel, jSONObject);
            Box.get().put(b, jSONObject2.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public boolean support(Context context, String str) {
        return support(DeviceManager.getManager(context).getCurrentDevice(), str);
    }

    public boolean support(Device device, String str) {
        List<String> list;
        if (device == null || TextUtils.isEmpty(device.info().getHuamiModel())) {
            Log.w(b, "Support <" + device + "> is Null or Model is Empty!!", new Object[0]);
            return false;
        }
        String huamiModel = device.info().getHuamiModel();
        boolean zContains = (huamiModel == null || (list = this.a.get(huamiModel)) == null) ? false : list.contains(str);
        Log.d(b, "Support <" + huamiModel + ", " + str + "> : " + zContains, new Object[0]);
        return zContains;
    }
}
