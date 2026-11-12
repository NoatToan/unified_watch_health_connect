package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import java.util.HashMap;
import java.util.Map;
import lib.android.paypal.com.magnessdk.MagnesSettings;
import lib.android.paypal.com.magnessdk.b;
import lib.android.paypal.com.magnessdk.log.a;
import lib.android.paypal.com.magnessdk.network.base.MagnesNetworking;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes46.dex */
public class znx extends lib.android.paypal.com.magnessdk.network.base.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, String> f54369b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f54370c;
    private lib.android.paypal.com.magnessdk.c.h.d d;
    private zoe e;
    private JSONObject h;
    private MagnesSettings j;

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        if (this.f54370c == null) {
            return;
        }
        d();
    }

    @Override // lib.android.paypal.com.magnessdk.network.base.c
    public void d() throws Throwable {
        Handler handler;
        Message messageObtain;
        a();
        try {
            MagnesNetworking magnesNetworkingCreateHttpClient = this.e.createHttpClient(lib.android.paypal.com.magnessdk.c.h.b.GET);
            String strF = f();
            if (strF == null) {
                return;
            }
            magnesNetworkingCreateHttpClient.setUri(Uri.parse(strF));
            Map<String, String> map = this.f54369b;
            if (map != null && !map.isEmpty()) {
                magnesNetworkingCreateHttpClient.setHeader(this.f54369b);
            }
            Handler handler2 = this.f54370c;
            if (handler2 != null) {
                handler2.sendMessage(Message.obtain(handler2, lib.android.paypal.com.magnessdk.c.h.EnumC0339c.GET_REQUEST_STARTED.a(), "Magnes Request Started for URL: " + strF));
            }
            int iExecute = magnesNetworkingCreateHttpClient.execute(null);
            String str = new String(magnesNetworkingCreateHttpClient.getResponseContent(), "UTF-8");
            e(iExecute, str);
            if (iExecute == lib.android.paypal.com.magnessdk.c.h.EnumC0339c.HTTP_STATUS_200.a()) {
                a(str);
                handler = this.f54370c;
                if (handler == null) {
                    return;
                } else {
                    messageObtain = Message.obtain(handler, lib.android.paypal.com.magnessdk.c.h.EnumC0339c.GET_REQUEST_SUCCEEDED.a(), str);
                }
            } else {
                handler = this.f54370c;
                if (handler == null) {
                    return;
                }
                messageObtain = Message.obtain(handler, lib.android.paypal.com.magnessdk.c.h.EnumC0339c.GET_REQUEST_ERROR.a(), iExecute + " : " + str);
            }
            handler.sendMessage(messageObtain);
        } catch (Exception e) {
            Handler handler3 = this.f54370c;
            if (handler3 != null) {
                handler3.sendMessage(Message.obtain(handler3, lib.android.paypal.com.magnessdk.c.h.EnumC0339c.GET_REQUEST_ERROR.a(), e));
            }
        }
    }

    @Override // lib.android.paypal.com.magnessdk.network.base.c
    public void c() {
        if (this.j.i()) {
            d();
        } else {
            b();
        }
    }

    @Override // lib.android.paypal.com.magnessdk.network.base.c
    public void a() {
        if (this.d == lib.android.paypal.com.magnessdk.c.h.d.PRODUCTION_BEACON_URL) {
            h();
        }
    }

    private void h() {
        JSONObject jSONObject = this.h;
        if (jSONObject == null) {
            return;
        }
        this.f54369b.put("User-Agent", String.format("%s/%s/%s/Android", jSONObject.optString(lib.android.paypal.com.magnessdk.c.d.APP_ID.toString()), this.h.optString(lib.android.paypal.com.magnessdk.c.d.APP_VERSION.toString()), this.h.optString(lib.android.paypal.com.magnessdk.c.d.APP_GUID.toString())));
        this.f54369b.put("Accept-Language", "en-us");
    }

    private String f() {
        if (this.d == lib.android.paypal.com.magnessdk.c.h.d.PRODUCTION_BEACON_URL) {
            if (this.h == null) {
                return null;
            }
            String strE = e();
            if (strE != null && strE.length() > 0) {
                return strE;
            }
        }
        return this.d.toString();
    }

    private String e() {
        if (this.h == null) {
            return null;
        }
        return lib.android.paypal.com.magnessdk.c.h.d.PRODUCTION_BEACON_URL.toString() + "?p=" + this.h.optString("pairing_id") + "&i=" + this.h.optString(lib.android.paypal.com.magnessdk.c.e.IP_ADDRS.toString()) + "&t=" + String.valueOf(System.currentTimeMillis() / 1000) + "&a=" + this.j.e();
    }

    private void a(String str) throws Throwable {
        int i = c.e[this.d.ordinal()];
        if (i == 1) {
            b.a(this.j.a(), str, "RAMP_CONFIG");
            return;
        }
        if (i != 2) {
            return;
        }
        JSONObject jSONObject = new JSONObject(str);
        b.a(this.j.a(), jSONObject.toString(), "REMOTE_CONFIG");
        zno.b(jSONObject);
        if (jSONObject.optJSONArray(lib.android.paypal.com.magnessdk.c.d.NOT_COLLECTIBLE_LIST.toString()) != null) {
            zno.e(true);
        }
    }

    static /* synthetic */ class c {
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[lib.android.paypal.com.magnessdk.c.h.d.values().length];
            e = iArr;
            try {
                iArr[lib.android.paypal.com.magnessdk.c.h.d.RAMP_CONFIG_URL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e[lib.android.paypal.com.magnessdk.c.h.d.REMOTE_CONFIG_URL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private void e(int i, String str) {
        a.e(getClass(), 0, "MagesGetRequest for " + this.d.toString() + " returned status code " + i + ", and responseString: " + str);
    }

    public znx(lib.android.paypal.com.magnessdk.c.h.d dVar, MagnesSettings magnesSettings, Handler handler, JSONObject jSONObject) {
        this.d = dVar;
        this.j = magnesSettings;
        this.f54370c = handler;
        this.e = magnesSettings.d() == null ? new zoe() : magnesSettings.d();
        this.h = jSONObject;
    }
}
