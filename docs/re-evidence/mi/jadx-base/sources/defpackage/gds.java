package defpackage;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class gds extends JSONObject implements bds {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f18869b = 2;
    public static final int c = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap<String, Integer> f18870a = new LinkedHashMap<>();

    @Override // defpackage.bds
    public int a() {
        int iIntValue = f18869b;
        Iterator<Integer> it = this.f18870a.values().iterator();
        while (it.hasNext()) {
            iIntValue += it.next().intValue();
        }
        return iIntValue + (length() - 1);
    }

    @Override // org.json.JSONObject
    public JSONObject put(String str, int i) {
        if (!TextUtils.isEmpty(str)) {
            this.f18870a.put(str, Integer.valueOf(str.length() + String.valueOf(i).length() + c));
        }
        return super.put(str, i);
    }

    @Override // org.json.JSONObject
    public Object remove(String str) {
        this.f18870a.remove(str);
        return super.remove(str);
    }

    @Override // org.json.JSONObject
    public JSONObject put(String str, long j) {
        if (!TextUtils.isEmpty(str)) {
            this.f18870a.put(str, Integer.valueOf(str.length() + String.valueOf(j).length() + c));
        }
        return super.put(str, j);
    }

    @Override // org.json.JSONObject
    public JSONObject put(String str, double d) {
        if (!TextUtils.isEmpty(str)) {
            this.f18870a.put(str, Integer.valueOf(str.length() + String.valueOf(d).length() + c));
        }
        return super.put(str, d);
    }

    @Override // org.json.JSONObject
    public JSONObject put(String str, Object obj) throws JSONException {
        JSONObject jSONObjectPut = super.put(str, obj);
        if (!TextUtils.isEmpty(str) && obj != null) {
            if (obj instanceof bds) {
                this.f18870a.put(str, Integer.valueOf(str.length() + ((bds) obj).a() + c));
            } else {
                this.f18870a.put(str, Integer.valueOf(str.length() + String.valueOf(obj).getBytes(StandardCharsets.UTF_8).length + c + f18869b));
            }
        }
        return jSONObjectPut;
    }

    @Override // org.json.JSONObject
    public JSONObject put(String str, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            this.f18870a.put(str, Integer.valueOf(str.length() + String.valueOf(z).length() + c));
        }
        return super.put(str, z);
    }
}
