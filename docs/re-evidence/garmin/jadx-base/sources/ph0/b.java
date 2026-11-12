package ph0;

import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.s1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import p13.j0;

/* JADX INFO: loaded from: classes8.dex */
public abstract class b extends s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<String> f137704a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<String> f137705b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap<String, HashMap<String, HashMap<String, a>>> f137706c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap<String, HashMap<String, a>> f137707d = new HashMap<>();

    public abstract j0 C();

    public abstract List<String> D();

    public final void F(JSONObject jSONObject) {
        HashMap<String, HashMap<String, a>> map = new HashMap<>();
        HashMap<String, a> map2 = new HashMap<>();
        if (jSONObject == null) {
            return;
        }
        String strOptString = !jSONObject.isNull("date") ? jSONObject.optString("date") : null;
        if (!jSONObject.isNull("stats")) {
            JSONObject jSONObject2 = new JSONObject(jSONObject.optString("stats"));
            this.f137704a = C();
            this.f137705b = D();
            if (!this.f137704a.isEmpty()) {
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (jSONObject2.has(next)) {
                        JSONObject jSONObject3 = new JSONObject(jSONObject2.optString(next));
                        HashMap<String, a> map3 = new HashMap<>();
                        if (!this.f137705b.isEmpty()) {
                            for (String str : this.f137705b) {
                                if (jSONObject3.has(str)) {
                                    map3.put(str, new a(jSONObject3.optJSONObject(str)));
                                }
                            }
                        }
                        map.put(next, map3);
                    }
                }
            } else if (!this.f137705b.isEmpty()) {
                Iterator<String> itKeys2 = jSONObject2.keys();
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    if (jSONObject2.has(next2)) {
                        map2.put(next2, new a(jSONObject2.optJSONObject(next2)));
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(strOptString) && !map.isEmpty()) {
            this.f137706c.put(strOptString, map);
        }
        if (TextUtils.isEmpty(strOptString) || map2.isEmpty()) {
            return;
        }
        this.f137707d.put(strOptString, map2);
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void m(String str) throws JSONException {
        if (str != null) {
            Object objNextValue = new JSONTokener(str).nextValue();
            if (objNextValue instanceof JSONObject) {
                F((JSONObject) objNextValue);
                return;
            }
            if (objNextValue instanceof JSONArray) {
                JSONArray jSONArray = new JSONArray(str);
                for (int i14 = 0; i14 < jSONArray.length(); i14++) {
                    F(jSONArray.getJSONObject(i14));
                }
                k(new JSONObject());
            }
        }
    }
}
