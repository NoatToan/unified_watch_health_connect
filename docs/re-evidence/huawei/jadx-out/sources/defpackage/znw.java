package defpackage;

import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import lib.android.paypal.com.magnessdk.Environment;
import lib.android.paypal.com.magnessdk.MagnesSettings;
import lib.android.paypal.com.magnessdk.log.a;
import lib.android.paypal.com.magnessdk.network.base.MagnesNetworking;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes46.dex */
public class znw extends lib.android.paypal.com.magnessdk.network.base.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private zoe f54367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private lib.android.paypal.com.magnessdk.c.h.d f54368c;
    private Map<String, String> d = new HashMap();
    private Handler e;
    private boolean f;
    private JSONObject i;
    private MagnesSettings j;

    @Override // java.lang.Runnable
    public void run() {
        if (this.e == null) {
            return;
        }
        d();
    }

    @Override // lib.android.paypal.com.magnessdk.network.base.c
    public void d() {
        Handler handler;
        Message messageObtain;
        a();
        try {
            MagnesNetworking magnesNetworkingCreateHttpClient = this.f54367b.createHttpClient(lib.android.paypal.com.magnessdk.c.h.b.POST);
            String strH = h();
            String strG = g();
            if (strH != null && strG != null) {
                magnesNetworkingCreateHttpClient.setUri(Uri.parse(strH));
                magnesNetworkingCreateHttpClient.setHeader(this.d);
                Handler handler2 = this.e;
                handler2.sendMessage(Message.obtain(handler2, lib.android.paypal.com.magnessdk.c.h.EnumC0339c.POST_REQUEST_STARTED.a(), strH));
                int iExecute = magnesNetworkingCreateHttpClient.execute(strG.getBytes("UTF-8"));
                String str = new String(magnesNetworkingCreateHttpClient.getResponseContent(), "UTF-8");
                Log.d("MagnesPostRequest", "MagnesPostRequest returned PayPal-Debug-Id: " + magnesNetworkingCreateHttpClient.getPayPalDebugId());
                a(iExecute, str, strH);
                if (iExecute == lib.android.paypal.com.magnessdk.c.h.EnumC0339c.HTTP_STATUS_200.a()) {
                    handler = this.e;
                    if (handler == null) {
                        return;
                    } else {
                        messageObtain = Message.obtain(handler, lib.android.paypal.com.magnessdk.c.h.EnumC0339c.POST_REQUEST_SUCCEEDED.a(), str);
                    }
                } else {
                    handler = this.e;
                    if (handler == null) {
                        return;
                    } else {
                        messageObtain = Message.obtain(handler, lib.android.paypal.com.magnessdk.c.h.EnumC0339c.POST_REQUEST_ERROR.a(), Integer.valueOf(iExecute));
                    }
                }
                handler.sendMessage(messageObtain);
            }
        } catch (Exception e) {
            a.e(getClass(), 3, e);
            Handler handler3 = this.e;
            if (handler3 != null) {
                handler3.sendMessage(Message.obtain(handler3, lib.android.paypal.com.magnessdk.c.h.EnumC0339c.POST_REQUEST_ERROR.a(), e));
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
        Map<String, String> mapD;
        if (this.j == null) {
            return;
        }
        try {
            int i = c.e[this.f54368c.ordinal()];
            if (i == 1 || i == 2) {
                mapD = znp.d(this.j.a());
                if (mapD == null) {
                    return;
                }
            } else {
                mapD = znp.a(this.j.a());
                if (mapD == null) {
                    return;
                }
            }
            this.d = mapD;
        } catch (Exception e) {
            a.e((Class<?>) znp.class, 3, e);
        }
    }

    private String h() {
        if (this.j == null || this.e == null) {
            return null;
        }
        int i = c.e[this.f54368c.ordinal()];
        if (i == 1 || i == 2) {
            return this.j.c() == Environment.LIVE ? znq.d().f54361c.g() : lib.android.paypal.com.magnessdk.c.h.d.SANDBOX_DEVICE_INFO_URL.toString();
        }
        if (i != 3 && i != 4) {
            return this.f54368c.toString();
        }
        if (this.j.c() == Environment.LIVE) {
            return this.f ? lib.android.paypal.com.magnessdk.c.h.d.AUDIT_JSON_URL.toString() : lib.android.paypal.com.magnessdk.c.h.d.PRODUCTION_JSON_URL.toString();
        }
        return this.f ? lib.android.paypal.com.magnessdk.c.h.d.SANDBOX_AUDIT_JSON_URL.toString() : lib.android.paypal.com.magnessdk.c.h.d.SANDBOX_PROD_JSON_URL.toString();
    }

    private String g() throws Exception {
        if (this.i == null) {
            return null;
        }
        int i = c.e[this.f54368c.ordinal()];
        if (i != 1 && i != 2) {
            return this.i.toString();
        }
        String strE = e();
        if (strE == null) {
            return null;
        }
        return strE;
    }

    private String e() throws Exception {
        if (this.i == null) {
            return null;
        }
        HashMap map = new HashMap();
        map.put("appGuid", this.i.optString(lib.android.paypal.com.magnessdk.c.d.APP_GUID.toString()));
        map.put("libraryVersion", d(this.i));
        map.put("additionalData", this.i.toString());
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Map.Entry entry : map.entrySet()) {
            if (z) {
                z = false;
            } else {
                sb.append("&");
            }
            sb.append(URLEncoder.encode((String) entry.getKey(), "UTF-8"));
            sb.append("=");
            sb.append(URLEncoder.encode((String) entry.getValue(), "UTF-8"));
        }
        a.e(getClass(), 0, "Encoded Device info payload : " + sb.toString());
        return sb.toString();
    }

    private void a(int i, String str, String str2) {
        a.e(getClass(), 0, "MagnesPostRequest for " + str2 + " returned status code " + i + ", and responseString: " + str);
    }

    static /* synthetic */ class c {
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[lib.android.paypal.com.magnessdk.c.h.d.values().length];
            e = iArr;
            try {
                iArr[lib.android.paypal.com.magnessdk.c.h.d.DEVICE_INFO_URL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e[lib.android.paypal.com.magnessdk.c.h.d.SANDBOX_DEVICE_INFO_URL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                e[lib.android.paypal.com.magnessdk.c.h.d.PRODUCTION_JSON_URL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                e[lib.android.paypal.com.magnessdk.c.h.d.AUDIT_JSON_URL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private String d(JSONObject jSONObject) {
        return String.format(Locale.US, "Dyson/%S (%S %S)", jSONObject.optString(lib.android.paypal.com.magnessdk.c.d.COMP_VERSION.toString()), jSONObject.optString(lib.android.paypal.com.magnessdk.c.d.OS_TYPE.toString()), Build.VERSION.RELEASE);
    }

    public znw(lib.android.paypal.com.magnessdk.c.h.d dVar, JSONObject jSONObject, boolean z, MagnesSettings magnesSettings, Handler handler) {
        this.f54368c = dVar;
        this.i = jSONObject;
        this.f = z;
        this.e = handler;
        this.j = magnesSettings;
        this.f54367b = magnesSettings.d() == null ? new zoe() : magnesSettings.d();
    }
}
