package defpackage;

import android.text.TextUtils;
import com.huawei.ads.adsrec.db.table.AdCreativeContentRecord;
import com.huawei.ads.adsrec.db.table.AdSlotMapRecord;
import com.huawei.ads.adsrec.db.table.MaterialSummaryRecord;
import com.huawei.ads.fund.anno.NoDbField;
import com.huawei.ads.fund.util.StringUtils;
import com.huawei.openalliance.ad.constant.MapKeyNames;
import com.huawei.openplatform.abl.log.HiAdLog;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class axh implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f743c;
    private String d;
    private String e;
    private double f;
    private String g;
    private String h;
    private String i;
    private double j;
    private double k;

    @NoDbField
    private String l;
    private double m;

    @NoDbField
    private Boolean n;
    private double o;
    private MaterialSummaryRecord p;
    private JSONObject q;
    private JSONObject r;
    private AdSlotMapRecord s;
    private AdCreativeContentRecord t;

    public Boolean w() {
        return this.n;
    }

    public String y() {
        return this.f742b;
    }

    public int r() {
        return this.f741a;
    }

    public String toString() {
        return "Content{pkgName='" + this.f743c + "', slotId='" + this.f742b + "', contentId='" + this.e + "', recallSource='" + this.f741a + '}';
    }

    public String p() {
        return this.f743c;
    }

    public double s() {
        return this.f;
    }

    public MaterialSummaryRecord t() {
        return this.p;
    }

    public String q() {
        return this.d;
    }

    public String n() {
        AdCreativeContentRecord adCreativeContentRecord = this.t;
        if (adCreativeContentRecord != null) {
            return adCreativeContentRecord.i();
        }
        return null;
    }

    public String l() {
        AdCreativeContentRecord adCreativeContentRecord = this.t;
        if (adCreativeContentRecord != null) {
            return adCreativeContentRecord.e();
        }
        return null;
    }

    public double k() {
        return this.j;
    }

    public String o() {
        if (StringUtils.isBlank(this.l)) {
            this.l = "1";
        }
        return this.l;
    }

    public JSONObject m() {
        axt.c(this.q, "recallSource", this.f741a);
        AdCreativeContentRecord adCreativeContentRecord = this.t;
        if (adCreativeContentRecord != null) {
            axt.e(this.q, "metaData", axt.d(adCreativeContentRecord.h()));
            axt.e(this.q, MapKeyNames.THIRD_MONITORS, axt.a(this.t.g()));
        }
        return this.q;
    }

    public String i() {
        return this.e;
    }

    public String h() {
        JSONObject jSONObject;
        if (this.g == null) {
            this.g = "";
            this.g = ("3".equals(this.q.optString("apiVer")) || (jSONObject = this.r) == null) ? axe.d(this.q) : jSONObject.optString("title");
        }
        return this.g;
    }

    public AdSlotMapRecord f() {
        return this.s;
    }

    public double g() {
        return this.m;
    }

    public double j() {
        return this.o;
    }

    public double b() {
        return this.k;
    }

    public String e() {
        JSONObject jSONObject;
        if (this.h == null && (jSONObject = this.r) != null) {
            this.h = jSONObject.optString("description");
        }
        return this.h;
    }

    public void e(double d) {
        this.j = d;
    }

    public AdCreativeContentRecord d() {
        return this.t;
    }

    public void c(double d) {
        this.m = d;
    }

    public String c() {
        JSONObject jSONObject;
        if (this.i == null) {
            this.i = "";
            this.i = ("3".equals(this.q.optString("apiVer")) || (jSONObject = this.r) == null) ? axe.e(this.q) : jSONObject.optString("label");
        }
        return this.i;
    }

    public void d(double d) {
        this.o = d;
    }

    public axh a() {
        try {
            axh axhVar = (axh) super.clone();
            AdCreativeContentRecord adCreativeContentRecord = this.t;
            if (adCreativeContentRecord != null) {
                axhVar.t = (AdCreativeContentRecord) adCreativeContentRecord.copy();
            }
            AdSlotMapRecord adSlotMapRecord = this.s;
            if (adSlotMapRecord != null) {
                axhVar.s = (AdSlotMapRecord) adSlotMapRecord.copy();
            }
            MaterialSummaryRecord materialSummaryRecord = this.p;
            if (materialSummaryRecord != null) {
                axhVar.p = (MaterialSummaryRecord) materialSummaryRecord.copy();
            }
            return axhVar;
        } catch (CloneNotSupportedException unused) {
            HiAdLog.w("Content", "copy failed");
            return null;
        }
    }

    public void a(boolean z) {
        this.n = Boolean.valueOf(z);
    }

    public void b(double d) {
        this.k = d;
    }

    private void x() {
        JSONObject jSONObject = this.q;
        if (jSONObject != null) {
            this.d = jSONObject.optString("interactiontype");
            this.l = this.q.optString("dspid");
        }
    }

    private static void b(JSONObject jSONObject) {
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("deviceAiParam");
            if (jSONObjectOptJSONObject != null) {
                String strOptString = jSONObjectOptJSONObject.optString("basicTargetTag");
                if (!StringUtils.isBlank(strOptString) && !StringUtils.isBlank(new JSONObject(strOptString).optString("not_app_first_open"))) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("not_app_first_open", "1");
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("basicTargetTag", jSONObject2.toString());
                    jSONObject.put("deviceAiParam", jSONObject3);
                    return;
                }
            }
            jSONObject.remove("deviceAiParam");
        } catch (JSONException unused) {
            jSONObject.remove("deviceAiParam");
        }
    }

    private void d(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.e = jSONObject.optString("contentid");
        this.f741a = 0;
        this.t = new AdCreativeContentRecord(jSONObject);
        this.r = axt.d(jSONObject.optString("metaData"));
        x();
        this.p = new MaterialSummaryRecord(this.f743c, str, this.f742b, this.e, jSONObject);
        jSONObject.remove("metaData");
        jSONObject.remove(MapKeyNames.THIRD_MONITORS);
        b(jSONObject);
        this.s = new AdSlotMapRecord(this.f743c, this.f742b, jSONObject);
    }

    private void u() {
        AdCreativeContentRecord adCreativeContentRecord;
        if (this.q == null) {
            this.q = e(this.s);
            x();
        }
        if (this.r != null || (adCreativeContentRecord = this.t) == null) {
            return;
        }
        this.r = axt.d(adCreativeContentRecord.h());
    }

    private JSONObject e(AdSlotMapRecord adSlotMapRecord) {
        if (adSlotMapRecord == null || TextUtils.isEmpty(adSlotMapRecord.a())) {
            return new JSONObject();
        }
        try {
            return new JSONObject(adSlotMapRecord.a());
        } catch (JSONException unused) {
            HiAdLog.w("Content", "create valued json obj err");
            return new JSONObject();
        }
    }

    public axh(String str, String str2, String str3, JSONObject jSONObject) {
        this.f = -100.0d;
        this.f743c = str;
        this.f742b = str3;
        this.q = jSONObject;
        d(str2, jSONObject);
    }

    public axh(AdSlotMapRecord adSlotMapRecord, AdCreativeContentRecord adCreativeContentRecord) {
        this.f = -100.0d;
        this.f741a = 1;
        this.s = adSlotMapRecord;
        this.t = adCreativeContentRecord;
        if (adSlotMapRecord != null) {
            this.f743c = adSlotMapRecord.e();
            this.f742b = adSlotMapRecord.c();
            this.e = adSlotMapRecord.d();
        }
        u();
    }
}
