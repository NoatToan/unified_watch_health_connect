package ph0;

import com.garmin.android.apps.connectmobile.s1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class a extends s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f137698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f137699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f137700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f137701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f137702e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f137703f = true;

    public a(JSONObject jSONObject) {
        try {
            k(jSONObject);
        } catch (JSONException e4) {
            e4.printStackTrace();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        boolean z14;
        boolean z15;
        boolean z16;
        if (!jSONObject.isNull("count")) {
            this.f137698a = jSONObject.getInt("count");
        }
        boolean z17 = true;
        if (jSONObject.isNull("min")) {
            z14 = false;
        } else {
            this.f137699b = jSONObject.getDouble("min");
            z14 = true;
        }
        if (jSONObject.isNull("max")) {
            z15 = false;
        } else {
            this.f137700c = jSONObject.getDouble("max");
            z15 = true;
        }
        if (jSONObject.isNull("avg")) {
            z16 = false;
        } else {
            this.f137701d = jSONObject.getDouble("avg");
            z16 = true;
        }
        if (!jSONObject.isNull("sum")) {
            this.f137702e = jSONObject.getDouble("sum");
        }
        if (!z15 && !z14 && !z16) {
            z17 = false;
        }
        this.f137703f = z17;
    }

    public final String toString() {
        return " count: " + this.f137698a + " min: " + this.f137699b + " max: " + this.f137700c + " avg: " + this.f137701d + " sum: " + this.f137702e;
    }

    public a() {
    }
}
