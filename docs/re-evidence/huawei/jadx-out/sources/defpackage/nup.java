package defpackage;

import android.content.Context;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.HwEncryptUtil;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class nup implements Serializable {
    private static final long serialVersionUID = -5057395571324649699L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f43762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f43763b;
    private String d;

    public nup(Context context, String str) throws JSONException, NumberFormatException {
        this.f43763b = 0;
        this.f43762a = "";
        this.d = "";
        String strA = HwEncryptUtil.b(context).a(str);
        LogUtil.d("RuleAttrInfo", "parseRuleAttr ruleAttr json : ", str, " decrypt ruleAttr json : ", strA);
        if (strA != null) {
            JSONObject jSONObject = new JSONObject(strA);
            if (jSONObject.has("mincode")) {
                this.f43763b = Integer.parseInt(jSONObject.getString("mincode"));
            }
            this.f43762a = jSONObject.optString("forcedupdate");
            this.d = jSONObject.optString("appforcedupdate");
        }
    }

    public int c() {
        return this.f43763b;
    }

    public String a() {
        return this.f43762a;
    }

    public String e() {
        return this.d;
    }
}
