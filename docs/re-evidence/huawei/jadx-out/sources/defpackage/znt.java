package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import lib.android.paypal.com.magnessdk.MagnesSettings;
import lib.android.paypal.com.magnessdk.c;
import lib.android.paypal.com.magnessdk.g;
import lib.android.paypal.com.magnessdk.log.a;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes46.dex */
final class znt extends g {
    private static znt ab;
    private MagnesSettings aa;
    private Handler ac;
    private JSONArray ad;
    private zny ae;
    private zny af;
    private String ag = "";
    private JSONObject ah;
    private zny ai;
    private zno al;

    @Override // lib.android.paypal.com.magnessdk.g
    public JSONObject a() {
        return null;
    }

    @Override // lib.android.paypal.com.magnessdk.g
    public JSONObject a(MagnesSettings magnesSettings, znn znnVar, zno znoVar) {
        return null;
    }

    void a(zno znoVar, Handler handler, MagnesSettings magnesSettings) {
        this.ac = handler;
        this.al = znoVar;
        this.aa = magnesSettings;
        this.ad = new JSONArray();
    }

    @Override // lib.android.paypal.com.magnessdk.g
    public void a(int i, MagnesSettings magnesSettings) {
        zny znyVar;
        try {
            Context contextA = magnesSettings.a();
            if (i != 96) {
                if (i != 97) {
                    if (i != 102 || !this.al.d(i)) {
                        return;
                    }
                    this.ai = new zny(contextA, this.ac, 2);
                    if (!this.ah.optBoolean(c.l.MG.toString(), false)) {
                        return;
                    } else {
                        znyVar = this.ai;
                    }
                } else {
                    if (!this.al.d(i)) {
                        return;
                    }
                    this.ae = new zny(contextA, this.ac, 4);
                    if (!this.ah.optBoolean(c.l.GY.toString(), false)) {
                        return;
                    } else {
                        znyVar = this.ae;
                    }
                }
            } else {
                if (!this.al.d(i)) {
                    return;
                }
                this.af = new zny(contextA, this.ac, 1);
                if (!this.ah.optBoolean(c.l.AC.toString(), false)) {
                    return;
                } else {
                    znyVar = this.af;
                }
            }
            znyVar.c();
        } catch (Exception e2) {
            a.e((Class<?>) znt.class, 3, e2);
        }
    }

    JSONObject e(MagnesSettings magnesSettings, String str, JSONObject jSONObject) {
        this.ag = str;
        this.ah = jSONObject;
        a(96, magnesSettings);
        a(97, magnesSettings);
        a(102, magnesSettings);
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorServiceNewSingleThreadScheduledExecutor.schedule(new e(jSONObject), this.al.i(), TimeUnit.SECONDS);
        scheduledExecutorServiceNewSingleThreadScheduledExecutor.shutdown();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        try {
            boolean zA = g.a("s");
            JSONObject jSONObjectA = zA ? g.a(this.ag, this.ad, "s") : g.b(this.ag, this.ad, "s");
            if (jSONObjectA != null) {
                new znw(c.h.d.PRODUCTION_JSON_URL, jSONObjectA, zA, this.aa, this.ac).c();
            }
        } catch (Exception e2) {
            a.e((Class<?>) znt.class, 3, e2);
        }
    }

    class e implements Runnable {
        final /* synthetic */ JSONObject e;

        @Override // java.lang.Runnable
        public void run() {
            if (znt.this.af != null && this.e.optBoolean(c.l.AC.toString(), false)) {
                znt.this.ad.put(znt.this.af.e());
            }
            if (znt.this.ae != null && this.e.optBoolean(c.l.GY.toString(), false)) {
                znt.this.ad.put(znt.this.ae.e());
            }
            if (znt.this.ai != null && this.e.optBoolean(c.l.MG.toString(), false)) {
                znt.this.ad.put(znt.this.ai.e());
            }
            znt.this.d();
        }

        e(JSONObject jSONObject) {
            this.e = jSONObject;
        }
    }

    static znt b() {
        znt zntVar;
        synchronized (znt.class) {
            if (ab == null) {
                ab = new znt();
            }
            zntVar = ab;
        }
        return zntVar;
    }

    znt() {
    }
}
