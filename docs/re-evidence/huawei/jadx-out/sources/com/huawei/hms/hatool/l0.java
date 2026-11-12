package com.huawei.hms.hatool;

import android.text.TextUtils;
import com.huawei.watchface.mvp.ui.activity.ScanImageActivity;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f13456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f13457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f13458c;
    private List<b1> d;
    private String e;

    public void a() {
        String strA = a(this.f13456a, this.f13457b);
        if (TextUtils.isEmpty(strA) && !"preins".equals(this.f13457b)) {
            v.e("hmsSdk", "collectUrl is empty");
            return;
        }
        if (!"_hms_config_tag".equals(this.f13456a) && !"_openness_config_tag".equals(this.f13456a)) {
            b();
        }
        h1 h1VarD = d();
        if (h1VarD == null) {
            b0.c().a(new d1(this.d, this.f13456a, this.e, this.f13457b));
            return;
        }
        byte[] bArrA = a(h1VarD);
        if (bArrA.length == 0) {
            v.e("hmsSdk", "request body is empty");
        } else {
            b0.b().a(new f(bArrA, strA, this.f13456a, this.f13457b, this.e, this.d));
        }
    }

    private h1 d() {
        return k.a(this.d, this.f13456a, this.f13457b, this.e, this.f13458c);
    }

    private JSONArray c() {
        JSONArray jSONArray = new JSONArray();
        Iterator<b1> it = this.d.iterator();
        while (it.hasNext()) {
            try {
                jSONArray.put(it.next().d());
            } catch (JSONException unused) {
                v.c("hmsSdk", "handleEvents: json error,Abandon this data");
            }
        }
        return jSONArray;
    }

    private void b() {
        if (c0.a(q0.i(), "backup_event", ScanImageActivity.SCAN_IMAGE_LENGTH_LIMIT)) {
            v.d("hmsSdk", "backup file reach max limited size, delete it");
            d.a(q0.i(), "backup_event", new String[0]);
            return;
        }
        JSONArray jSONArrayC = c();
        String strA = n1.a(this.f13456a, this.f13457b, this.e);
        v.c("hmsSdk", "Update data cached into backup,spKey: " + strA);
        d.b(q0.i(), "backup_event", strA, jSONArrayC.toString());
    }

    private byte[] a(h1 h1Var) {
        String str;
        try {
            JSONObject jSONObjectA = h1Var.a();
            if (jSONObjectA != null) {
                return k1.a(jSONObjectA.toString().getBytes("UTF-8"));
            }
            v.e("hmsSdk", "uploadEvents is null");
            return new byte[0];
        } catch (UnsupportedEncodingException unused) {
            str = "sendData(): getBytes - Unsupported coding format!!";
            v.e("hmsSdk", str);
            return new byte[0];
        } catch (JSONException unused2) {
            str = "uploadEvents to json error";
            v.e("hmsSdk", str);
            return new byte[0];
        }
    }

    private String a(String str, String str2) {
        String str3;
        String strF = a1.f(str, str2);
        if (TextUtils.isEmpty(strF)) {
            v.a("hmsSdk", "No report address,TAG : %s,TYPE: %s ", str, str2);
            return "";
        }
        if ("oper".equals(str2)) {
            str3 = "{url}/common/hmshioperqrt";
        } else if ("maint".equals(str2)) {
            str3 = "{url}/common/hmshimaintqrt";
        } else {
            if (!"diffprivacy".equals(str2)) {
                return "";
            }
            str3 = "{url}/common/common2";
        }
        return str3.replace("{url}", strF);
    }

    public l0(String str, String str2, String str3, List<b1> list, String str4) {
        this.f13456a = str;
        this.f13457b = str2;
        this.f13458c = str3;
        this.d = list;
        this.e = str4;
    }
}
