package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.HashMap;
import lib.android.paypal.com.magnessdk.Environment;
import lib.android.paypal.com.magnessdk.MagnesSettings;
import lib.android.paypal.com.magnessdk.c;
import lib.android.paypal.com.magnessdk.log.a;
import lib.android.paypal.com.magnessdk.network.base.e;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes46.dex */
public final class znq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static znq f54359b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Handler f54360a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public zno f54361c;
    private JSONObject d;
    MagnesSettings e;
    private znn f;
    private HandlerThread i;
    private znv j;
    private znz h = znz.e();
    private zoa g = zoa.d();

    public MagnesSettings b(MagnesSettings magnesSettings) {
        this.e = magnesSettings;
        a();
        this.f54361c = new zno(magnesSettings, this.f54360a);
        znn znnVar = new znn(magnesSettings, this.f54360a);
        this.f = znnVar;
        this.h.b(znnVar, this.e, this.f54360a);
        this.g.c(this.f, this.e, this.f54360a);
        if (this.j == null) {
            znv znvVar = new znv();
            this.j = znvVar;
            this.d = znvVar.a(magnesSettings, this.f, this.f54361c);
        }
        return magnesSettings;
    }

    public znj a(Context context, String str, HashMap<String, String> map) throws znh {
        StringBuilder sb = new StringBuilder("SUBMIT method called with paypalClientMetaDataId : ");
        sb.append(str);
        sb.append(" , Is pass in additionalData null? : ");
        sb.append(Boolean.toString(map == null));
        a.e((Class<?>) znq.class, 0, sb.toString());
        if (str != null && str.length() > 32) {
            throw new znh(c.b.EnumC0334c.CMID_EXCEPTION_MESSAGE.toString());
        }
        znj znjVarC = c(context, str, map, true);
        b(context, znjVarC.c());
        return znjVarC;
    }

    public znn b() {
        if (this.f == null) {
            this.f = new znn(this.e, this.f54360a);
        }
        return this.f;
    }

    public static znq d() {
        znq znqVar;
        synchronized (znq.class) {
            if (f54359b == null) {
                f54359b = new znq();
            }
            znqVar = f54359b;
        }
        return znqVar;
    }

    private boolean c() {
        return !this.e.g() && this.e.c() == Environment.LIVE;
    }

    private void a() {
        if (this.i == null) {
            HandlerThread handlerThread = new HandlerThread("MagnesHandlerThread");
            this.i = handlerThread;
            handlerThread.start();
            this.f54360a = e.a(this.i.getLooper(), this);
        }
    }

    private void b(Context context, JSONObject jSONObject) {
        new znw(c.h.d.DEVICE_INFO_URL, jSONObject, false, this.e, this.f54360a).c();
        if (c()) {
            new znx(c.h.d.PRODUCTION_BEACON_URL, this.e, this.f54360a, jSONObject).c();
        }
    }

    private znj c(Context context, String str, HashMap<String, String> map, boolean z) throws znh {
        String string;
        StringBuilder sb = new StringBuilder("COLLECT method called with paypalClientMetaDataId : ");
        sb.append(str);
        sb.append(" , Is pass in additionalData null? : ");
        sb.append(Boolean.toString(map == null));
        a.e((Class<?>) znq.class, 0, sb.toString());
        if (str != null && str.length() > 32) {
            throw new znh(c.b.EnumC0334c.CMID_EXCEPTION_MESSAGE.toString());
        }
        if (this.e == null) {
            a.e((Class<?>) znq.class, 2, "No MagnesSettings specified, using platform default.");
            MagnesSettings magnesSettingsE = new MagnesSettings.Builder(context).e();
            this.e = magnesSettingsE;
            b(magnesSettingsE);
        }
        if (this.f54361c.k()) {
            a.e((Class<?>) znq.class, 0, "nc presents, collecting coreData.");
            znv znvVar = new znv();
            this.j = znvVar;
            this.d = znvVar.a(this.e, this.f, this.f54361c);
            zno.e(false);
        }
        JSONObject jSONObjectA = this.j.a(new zns(z).b(this.e, this.f, this.f54361c, this.j.e(), str, map, this.f54360a));
        try {
            a.e((Class<?>) znq.class, 0, "Device Info JSONObject : " + jSONObjectA.toString(2));
            string = jSONObjectA.getString("pairing_id");
        } catch (JSONException e) {
            a.e((Class<?>) znq.class, 3, e);
            string = null;
        }
        return new znj().a(jSONObjectA).b(string);
    }

    private znq() {
    }
}
