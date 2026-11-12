package com.huawei.hms.hatool;

import android.text.TextUtils;
import com.huawei.hianalytics.core.storage.Event;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class h1 implements o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<b1> f13433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private k0 f13434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private t0 f13435c;
    private o1 d;
    private String e = "";
    private String f;

    public void a(List<b1> list) {
        this.f13433a = list;
    }

    public void a(String str) {
        if (str != null) {
            this.e = str;
        }
    }

    public void a(t0 t0Var) {
        this.f13435c = t0Var;
    }

    public void a(l lVar) {
        this.d = lVar;
    }

    public void a(k0 k0Var) {
        this.f13434b = k0Var;
    }

    @Override // com.huawei.hms.hatool.o1
    public JSONObject a() throws JSONException {
        String str;
        List<b1> list = this.f13433a;
        if (list == null || list.size() == 0) {
            str = "Not have actionEvent to send";
        } else if (this.f13434b == null || this.f13435c == null || this.d == null) {
            str = "model in wrong format";
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("header", this.f13434b.a());
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObjectA = this.d.a();
            jSONObjectA.put(Event.EventConstants.PROPERTIES, this.f13435c.a());
            try {
                jSONObjectA.put("events_global_properties", new JSONObject(this.e));
            } catch (JSONException unused) {
                jSONObjectA.put("events_global_properties", this.e);
            }
            jSONObject2.put("events_common", jSONObjectA);
            JSONArray jSONArray = new JSONArray();
            Iterator<b1> it = this.f13433a.iterator();
            while (it.hasNext()) {
                JSONObject jSONObjectA2 = it.next().a();
                if (jSONObjectA2 != null) {
                    jSONArray.put(jSONObjectA2);
                } else {
                    v.e("hmsSdk", "custom event is empty,delete this event");
                }
            }
            jSONObject2.put(Event.EventConstants.EVENTS, jSONArray);
            try {
                String strA = n.a(k1.a(jSONObject2.toString().getBytes("UTF-8")), this.f);
                if (TextUtils.isEmpty(strA)) {
                    v.e("hmsSdk", "eventInfo encrypt failed,report over!");
                    return null;
                }
                jSONObject.put("event", strA);
                return jSONObject;
            } catch (UnsupportedEncodingException unused2) {
                str = "getBitZip(): Unsupported coding : utf-8";
            }
        }
        v.e("hmsSdk", str);
        return null;
    }

    public h1(String str) {
        this.f = str;
    }
}
