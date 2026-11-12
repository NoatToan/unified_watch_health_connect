package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import lib.android.paypal.com.magnessdk.MagnesSettings;
import lib.android.paypal.com.magnessdk.b;
import lib.android.paypal.com.magnessdk.c;
import lib.android.paypal.com.magnessdk.log.a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes46.dex */
public class zno extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static BitSet f54357b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f54358c = false;
    private static JSONArray d;
    public final String e = "conf_refresh_time_interval";
    private Context f;
    private Handler g;
    private MagnesSettings h;
    private boolean i;
    private JSONObject j;

    public boolean k() {
        return f54358c;
    }

    public int i() {
        return this.j.optInt(c.j.SENSOR_COLLECT_TIME.toString(), 5);
    }

    public JSONArray j() {
        return d;
    }

    public String f() {
        return this.j.optString(c.j.MG_ID.toString(), "QW5kcm9pZE1hZ25lcw==");
    }

    public String g() {
        return this.j.optString(c.j.CONF_ENDPOINT_URL.toString(), c.h.d.DEVICE_INFO_URL.toString());
    }

    public String h() {
        return this.j.optString(c.j.CONF_VERSION.toString());
    }

    public List<String> e() throws JSONException {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = this.j.optJSONArray(c.j.ANDROID_APPS_TO_CHECK.toString());
        for (int i = 0; jSONArrayOptJSONArray != null && i < jSONArrayOptJSONArray.length(); i++) {
            arrayList.add(jSONArrayOptJSONArray.getString(i));
        }
        return arrayList;
    }

    @Override // lib.android.paypal.com.magnessdk.b
    public String d() {
        return c.h.d.REMOTE_CONFIG_URL.toString();
    }

    @Override // lib.android.paypal.com.magnessdk.b
    public JSONObject c() {
        try {
            JSONObject jSONObjectA = b.a("REMOTE_CONFIG", this.f);
            if (jSONObjectA == null) {
                new znx(c.h.d.REMOTE_CONFIG_URL, this.h, this.g, null).c();
            } else {
                if (e(jSONObjectA.optString(c.e.CONF_VERSION.toString(), ""), "5.0")) {
                    boolean zA = b.a(jSONObjectA, Long.parseLong(b(this.f, "REMOTE_CONFIG")), c.EnumC0335c.REMOTE);
                    if (!this.i && zA) {
                        new znx(c.h.d.REMOTE_CONFIG_URL, this.h, this.g, null).c();
                    }
                    a.e(getClass(), 0, "Using cached currentConfig due to isRemoteConfigDisabled : " + this.i + " or isConfigExpired : " + zA);
                    return jSONObjectA;
                }
                b.c(this.f, "REMOTE_CONFIG");
            }
        } catch (Exception e) {
            a.e(getClass(), 3, e);
        }
        return b();
    }

    @Override // lib.android.paypal.com.magnessdk.b
    public JSONObject b() {
        a.e(getClass(), 0, "entering getDefaultRemoteConfig");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(c.j.CONF_VERSION.toString(), "5.0");
            jSONObject.put(c.j.CONF_REFRESH_TIME_KEY.toString(), 86400);
            jSONObject.put(c.j.CONF_ENDPOINT_URL.toString(), c.h.d.DEVICE_INFO_URL.toString());
            return jSONObject;
        } catch (JSONException e) {
            a.e(getClass(), 3, e);
            return jSONObject;
        }
    }

    public boolean d(int i) {
        return f54357b.get(i);
    }

    @Override // lib.android.paypal.com.magnessdk.b
    public void a(JSONObject jSONObject) {
        b(jSONObject);
        this.j = jSONObject;
    }

    @Override // lib.android.paypal.com.magnessdk.b
    public JSONObject a() {
        return this.j;
    }

    public static void b(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(c.j.NOT_COLLECTABLE.toString());
        if (jSONArrayOptJSONArray != null) {
            d = jSONArrayOptJSONArray;
        }
        BitSet bitSet = new BitSet(128);
        f54357b = bitSet;
        bitSet.set(0, 128, true);
        for (int i = 0; jSONArrayOptJSONArray != null && i < jSONArrayOptJSONArray.length(); i++) {
            try {
                f54357b.set(jSONArrayOptJSONArray.getInt(i), false);
            } catch (JSONException e) {
                a.e((Class<?>) zno.class, 3, e);
            }
        }
    }

    private boolean e(String str, String str2) {
        a.e(getClass(), 0, "entering shouldUseCachedConfiguration");
        String[] strArrSplit = str.split("\\.");
        String[] strArrSplit2 = str2.split("\\.");
        a.e(getClass(), 0, "Comparing Cached version is " + str + " default version is " + str2);
        int i = 0;
        while (i < strArrSplit.length && i < strArrSplit2.length && strArrSplit[i].equals(strArrSplit2[i])) {
            i++;
        }
        return Integer.valueOf(Integer.signum((i >= strArrSplit.length || i >= strArrSplit2.length) ? strArrSplit.length - strArrSplit2.length : Integer.valueOf(strArrSplit[i]).compareTo(Integer.valueOf(strArrSplit2[i])))).intValue() >= 0;
    }

    public static void e(boolean z) {
        f54358c = z;
    }

    public zno(MagnesSettings magnesSettings, Handler handler) {
        this.i = false;
        this.h = magnesSettings;
        this.f = magnesSettings.a();
        this.g = handler;
        this.i = magnesSettings.j();
        a(c());
        try {
            a.e(getClass(), 0, this.j.toString(2));
        } catch (JSONException e) {
            a.e(getClass(), 3, e);
        }
    }
}
