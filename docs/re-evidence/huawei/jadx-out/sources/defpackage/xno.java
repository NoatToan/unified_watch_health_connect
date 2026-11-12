package defpackage;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class xno implements Serializable {
    private static final long serialVersionUID = -217188557650814492L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("codeMsg")
    private String f53205a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("displayOverview")
    private String f53207c;

    @SerializedName("displayDetail")
    private String d;

    @SerializedName("hwReturnCode")
    private String e;

    @SerializedName("suggestion")
    private String f;
    private String h;

    @SerializedName("originalCode")
    private String i;

    @SerializedName("supportRetry")
    private boolean j;
    private String g = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f53206b = 0;

    public void b(String str) {
        this.f53205a = str;
    }

    public void d(String str) {
        this.d = str;
    }

    public void a(String str) {
        this.f53207c = str;
    }

    public void i(String str) {
        this.f = str;
    }

    public void e(String str) {
        this.i = str;
    }

    public void c(String str) {
        this.e = str;
    }

    public void c(boolean z) {
        this.j = z;
    }

    public void g(String str) {
        this.h = str;
    }

    public void a(int i) {
        this.f53206b = i;
    }

    public static xno b(JSONObject jSONObject) throws JSONException {
        xno xnoVar = new xno();
        if (jSONObject.has("codeMsg")) {
            xnoVar.b(jSONObject.getString("codeMsg"));
        }
        if (jSONObject.has("displayDetail")) {
            xnoVar.d(jSONObject.getString("displayDetail"));
        }
        if (jSONObject.has("displayOverview")) {
            xnoVar.a(jSONObject.getString("displayOverview"));
        }
        if (jSONObject.has("originalCode")) {
            xnoVar.e(jSONObject.getString("originalCode"));
        }
        if (jSONObject.has("suggestion")) {
            xnoVar.i(jSONObject.getString("suggestion"));
        }
        if (jSONObject.has("supportRetry")) {
            xnoVar.c(jSONObject.getBoolean("supportRetry"));
        }
        if (jSONObject.has("tempAccessSec")) {
            xnoVar.g(jSONObject.getString("tempAccessSec"));
        }
        if (jSONObject.has("deal")) {
            xnoVar.a(jSONObject.getInt("deal"));
        }
        if (jSONObject.has("hwReturnCode")) {
            xnoVar.c(jSONObject.getString("hwReturnCode"));
        }
        return xnoVar;
    }

    public String toString() {
        return "ErrorInfo{codeMsg='" + this.f53205a + "', displayDetail='" + this.d + "', displayOverview='" + this.f53207c + "', suggestion='" + this.f + "', originalCode='" + this.i + "', hwReturnCode='" + this.e + "', supportRetry=" + this.j + ", tempAccessSec=" + this.h + '}';
    }
}
