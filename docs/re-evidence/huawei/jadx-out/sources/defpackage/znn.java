package defpackage;

import android.content.Context;
import android.os.Handler;
import lib.android.paypal.com.magnessdk.MagnesSettings;
import lib.android.paypal.com.magnessdk.b;
import lib.android.paypal.com.magnessdk.c;
import lib.android.paypal.com.magnessdk.g;
import lib.android.paypal.com.magnessdk.log.a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes46.dex */
public class znn extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f54355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MagnesSettings f54356c;
    public final String d = c.i.CONF_REFRESH_TIME_KEY.toString();
    private Context e;
    private JSONObject g;

    @Override // lib.android.paypal.com.magnessdk.b
    public String d() {
        return c.h.d.RAMP_CONFIG_URL.toString();
    }

    @Override // lib.android.paypal.com.magnessdk.b
    public JSONObject c() {
        try {
            JSONObject jSONObjectA = b.a("RAMP_CONFIG", this.f54356c.a());
            if (jSONObjectA == null) {
                new znx(c.h.d.RAMP_CONFIG_URL, this.f54356c, this.f54355b, null).c();
                return b();
            }
            if (b.a(jSONObjectA, Long.parseLong(b(this.e, "RAMP_CONFIG")), c.EnumC0335c.RAMP)) {
                a.e(getClass(), 0, "Cached config used while fetching.");
                new znx(c.h.d.RAMP_CONFIG_URL, this.f54356c, this.f54355b, null).c();
            }
            return jSONObjectA;
        } catch (Exception e) {
            a.e(getClass(), 3, e);
            return b();
        }
    }

    @Override // lib.android.paypal.com.magnessdk.b
    public JSONObject b() {
        a.e(getClass(), 0, "entering getDefaultConfig");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("s", e());
            jSONObject.put(g.r1, e());
            jSONObject.put("ts", e());
            jSONObject.put(g.t1, e());
            jSONObject.put(c.i.CONF_REFRESH_TIME_KEY.toString(), 7200);
            return jSONObject;
        } catch (JSONException e) {
            a.e(getClass(), 3, e);
            return jSONObject;
        }
    }

    @Override // lib.android.paypal.com.magnessdk.b
    public void a(JSONObject jSONObject) {
        this.g = jSONObject;
    }

    @Override // lib.android.paypal.com.magnessdk.b
    public JSONObject a() {
        return this.g;
    }

    private JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(c.i.OPEN.toString(), false);
            jSONObject.put(c.i.RAMP_THRESHOLD.toString(), 0);
            jSONObject.put(c.i.MIN_VERSION.toString(), "4.4.0");
            jSONObject.put(c.i.EXCLUDED.toString(), new JSONArray());
            jSONObject.put(c.i.APP_IDS.toString(), new JSONArray());
            jSONObject.put(c.i.APP_SOURCES.toString(), new JSONArray());
            return jSONObject;
        } catch (Exception e) {
            a.e(getClass(), 3, "Failed to create deafult config due to " + e.getLocalizedMessage());
            return jSONObject;
        }
    }

    public znn(MagnesSettings magnesSettings, Handler handler) {
        this.e = magnesSettings.a();
        this.f54356c = magnesSettings;
        this.f54355b = handler;
        a(c());
        try {
            a.e(getClass(), 0, a().toString(2));
        } catch (JSONException unused) {
        }
    }
}
