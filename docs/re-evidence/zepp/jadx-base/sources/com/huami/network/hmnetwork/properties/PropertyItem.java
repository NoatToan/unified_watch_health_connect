package com.huami.network.hmnetwork.properties;

import android.text.TextUtils;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class PropertyItem {
    private static final String c = "mode";
    private static final String d = "propertyName";
    private static final String e = "properties";
    private String a;
    private String b;

    public PropertyItem(String str) {
        this.a = str;
    }

    public static Map<String, Object> a(List<PropertyItem> list) {
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i == size - 1) {
                sb.append(list.get(i).a);
            } else {
                sb.append(list.get(i).a);
                sb.append(",");
            }
        }
        systemParams.put(d, sb.toString());
        systemParams.put("mode", "BATCH");
        return systemParams;
    }

    public static Set<Object> d(List<PropertyItem> list) {
        HashSet hashSet = new HashSet();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (PropertyItem propertyItem : list) {
            if (!TextUtils.isEmpty(propertyItem.b)) {
                try {
                    jSONObject2.put(propertyItem.a, propertyItem.b);
                } catch (Exception unused) {
                }
            }
        }
        if (jSONObject2.length() <= 0) {
            return hashSet;
        }
        try {
            jSONObject.put("properties", jSONObject2);
            hashSet.add("application/json");
            hashSet.add(jSONObject.toString());
        } catch (Exception unused2) {
        }
        return hashSet;
    }

    public Map<String, Object> b() {
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put(d, this.a);
        systemParams.put("mode", "SINGLE");
        return systemParams;
    }

    public Map<String, Object> c() {
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put(d, this.a);
        systemParams.put("mode", "RANGE");
        return systemParams;
    }

    public PropertyItem(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
