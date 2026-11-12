package defpackage;

import android.text.TextUtils;
import com.huawei.operation.utils.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: loaded from: classes7.dex */
public class eah {
    private ArrayList<a> e;

    public ArrayList<a> e() {
        return this.e;
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f32572a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map<String, d> f32573b;

        public void b(String str) {
            this.f32572a = str;
        }

        public Map<String, d> a() {
            return this.f32573b;
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer("UserInfoData{dateTime ='");
            stringBuffer.append(this.f32572a).append("'userdata ='");
            Map<String, d> map = this.f32573b;
            stringBuffer.append(map == null ? Constants.NULL : map.toString()).append("'}");
            return stringBuffer.toString();
        }

        public void e(JSONObject jSONObject) {
            if (jSONObject != null) {
                try {
                    if (!jSONObject.has("dateTime")) {
                        dyg.a(false, "DeviceServiceUser", "UserData toObject not has dateTime");
                    } else {
                        b(jSONObject.getString("dateTime"));
                    }
                    this.f32573b = new HashMap(16);
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        if (next.contains("id_")) {
                            d dVar = new d();
                            dVar.c(jSONObject.getJSONObject(next));
                            this.f32573b.put(next, dVar);
                        }
                    }
                    if (this.f32573b.size() == 0) {
                        d dVar2 = new d();
                        dVar2.c(jSONObject);
                        this.f32573b.put("id_1", dVar2);
                    }
                } catch (JSONException e) {
                    dyg.c(false, "DeviceServiceUser", "UserInfoData toObject JSONException ", e.getMessage());
                }
            }
        }

        public d e(String str) {
            if (TextUtils.isEmpty(str)) {
                dyg.a(false, "DeviceServiceUser", "getUserData data accountId is null ");
                return null;
            }
            Map<String, d> mapA = a();
            if (mapA != null) {
                for (d dVar : mapA.values()) {
                    if (dVar != null && str.equals(dVar.e())) {
                        return dVar;
                    }
                }
            } else {
                dyg.a(false, "DeviceServiceUser", "UserInfoData getUserData userDataMap is null");
            }
            dyg.a(false, "DeviceServiceUser", "UserInfoData getUserData not foung UserData id", str);
            return null;
        }

        public void b(Map<String, String> map) {
            if (map == null) {
                dyg.d(false, "DeviceServiceUser", "UserInfoData mapToObject map is null ");
                return;
            }
            if (!map.containsKey("dateTime")) {
                dyg.d(false, "DeviceServiceUser", "UserInfoData mapToObject map has not dateTime");
            } else {
                b(map.get("dateTime"));
            }
            this.f32573b = new HashMap(16);
            d dVar = new d();
            dVar.b(map);
            this.f32573b.put("id_1", dVar);
        }
    }

    public static class d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Map<String, String> f32574c;
        private String d;

        public String e() {
            return this.d;
        }

        public void c(String str) {
            this.d = str;
        }

        public Map<String, String> d() {
            return this.f32574c;
        }

        public void c(JSONObject jSONObject) {
            if (jSONObject != null) {
                try {
                    if (jSONObject.has("id")) {
                        c(jSONObject.getString("id"));
                    } else {
                        dyg.a(false, "DeviceServiceUser", "UserData toObject not has id");
                    }
                    this.f32574c = new HashMap(16);
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        if (next.contains("userInfo")) {
                            String string = jSONObject.getString(next);
                            String[] strArrSplit = string.split("\\|");
                            dyg.e(false, "DeviceServiceUser", "UserData mapToObject userInfo ", string);
                            e(string, strArrSplit);
                        } else {
                            dyg.d(false, "DeviceServiceUser", "UserData toObject keyStr is error ", next);
                        }
                    }
                } catch (JSONException e) {
                    dyg.c(false, "DeviceServiceUser", "UserData toObject JSONException ", e.getMessage());
                }
            }
        }

        private void e(String str, String[] strArr) {
            if (strArr != null && strArr.length >= 4) {
                if (String.valueOf(0).equals(strArr[1])) {
                    strArr[1] = e();
                    StringBuffer stringBuffer = new StringBuffer(16);
                    stringBuffer.append("1|");
                    stringBuffer.append(strArr[1]).append("|");
                    stringBuffer.append(strArr[2]).append("|");
                    stringBuffer.append(strArr[3]);
                    this.f32574c.put(strArr[1], stringBuffer.toString());
                    return;
                }
                this.f32574c.put(strArr[1], str);
                return;
            }
            dyg.d(false, "DeviceServiceUser", "UserData toObject userInfo size is error ", str);
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer("UserData{id ='");
            stringBuffer.append(this.d).append("'user ='");
            Map<String, String> map = this.f32574c;
            stringBuffer.append(map == null ? Constants.NULL : map.toString()).append("'}");
            return stringBuffer.toString();
        }

        public void b(Map<String, String> map) {
            if (map == null) {
                dyg.d(false, "DeviceServiceUser", "UserData mapToObject map is null ");
                return;
            }
            this.f32574c = new HashMap(16);
            if (!map.containsKey("id")) {
                dyg.d(false, "DeviceServiceUser", "UserData mapToObject Not carrying id");
            } else {
                c(map.get("id"));
            }
            Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                c(it.next());
            }
        }

        private void c(Map.Entry<String, String> entry) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (TextUtils.isEmpty(key) || TextUtils.isEmpty(value) || !key.contains("userInfo")) {
                return;
            }
            String[] strArrSplit = value.split("\\|");
            dyg.e(false, "DeviceServiceUser", "UserData mapToObject userInfo ", value);
            if (strArrSplit != null && strArrSplit.length >= 4) {
                e(value, strArrSplit);
            } else {
                dyg.d(false, "DeviceServiceUser", "UserData mapToObject userInfo size is error ", value);
            }
        }
    }

    public void e(String str) {
        if (TextUtils.isEmpty(str)) {
            dyg.c(false, "DeviceServiceUser", "toObject json is null ");
            return;
        }
        try {
            Object objNextValue = new JSONTokener(str).nextValue();
            if (objNextValue instanceof JSONObject) {
                d((JSONObject) objNextValue);
            } else if (objNextValue instanceof JSONArray) {
                d((JSONArray) objNextValue);
            } else {
                dyg.d(false, "DeviceServiceUser", "toObject json type is error ", objNextValue.getClass().getSimpleName());
            }
        } catch (JSONException e) {
            dyg.c(false, "DeviceServiceUser", "toObject JSONException ", e.getMessage());
        }
    }

    private void d(JSONObject jSONObject) {
        if (jSONObject != null) {
            if (this.e == null) {
                this.e = new ArrayList<>(16);
            }
            a aVar = new a();
            aVar.e(jSONObject);
            this.e.add(aVar);
            return;
        }
        dyg.a(false, "DeviceServiceUser", "parserJsonObject jsonObject is null ");
    }

    private void d(JSONArray jSONArray) {
        if (jSONArray == null) {
            dyg.a(false, "DeviceServiceUser", "parserJsonArray jsonArray is null ");
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                d(jSONArray.getJSONObject(i));
            } catch (JSONException e) {
                dyg.c(false, "DeviceServiceUser", "parserJsonArray JSONException ", e.getMessage());
            }
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("DeviceServiceUser{data ='");
        ArrayList<a> arrayList = this.e;
        stringBuffer.append(arrayList == null ? Constants.NULL : arrayList.toString()).append("'}");
        return stringBuffer.toString();
    }

    public d b(String str) {
        if (TextUtils.isEmpty(str)) {
            dyg.a(false, "DeviceServiceUser", "getUserData accountId is null ");
            return null;
        }
        ArrayList<a> arrayListE = e();
        if (arrayListE != null && arrayListE.size() > 0) {
            dyg.a(false, "DeviceServiceUser", "getUserData datas ", arrayListE.toString());
            for (a aVar : arrayListE) {
                if (aVar != null) {
                    return aVar.e(str);
                }
            }
        } else {
            dyg.a(false, "DeviceServiceUser", "getUserData datas is null");
        }
        dyg.a(false, "DeviceServiceUser", "getUserData not found userdata");
        return null;
    }

    public void c(Map<String, String> map) {
        if (map != null) {
            if (this.e == null) {
                this.e = new ArrayList<>(16);
            }
            a aVar = new a();
            aVar.b(map);
            this.e.add(aVar);
            return;
        }
        dyg.d(false, "DeviceServiceUser", " mapToObject map is null ");
    }
}
