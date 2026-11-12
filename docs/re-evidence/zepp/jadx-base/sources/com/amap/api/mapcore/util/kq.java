package com.amap.api.mapcore.util;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.autonavi.amap.mapcore.Inner_3dMap_location;
import com.autonavi.amap.mapcore.Inner_3dMap_locationOption;
import com.huami.mifit.sportlib.gpx.data.GPXBasePoint;
import com.xmlywind.sdk.common.mta.PointCategory;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class kq {
    private static int m = 200;
    private static boolean n = true;
    public Context a;
    public b d;
    public Handler e;
    public Handler f;
    public Inner_3dMap_locationOption i;
    public kj b = null;
    public kr c = null;
    public boolean g = false;
    public boolean h = false;
    public final int j = 500;
    public final int k = 30;
    private JSONArray o = null;
    public Object l = new Object();

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            kq.this.b();
        }
    }

    public static class b extends HandlerThread {
        public b(String str) {
            super(str);
        }

        @Override // android.os.HandlerThread
        public final void onLooperPrepared() {
            super.onLooperPrepared();
        }

        @Override // android.os.HandlerThread, java.lang.Thread, java.lang.Runnable
        public final void run() {
            try {
                super.run();
            } catch (Throwable unused) {
            }
        }
    }

    public kq(Context context, Handler handler) {
        this.a = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.i = null;
        try {
            if (context == null) {
                throw new IllegalArgumentException("Context参数不能为null");
            }
            this.a = context.getApplicationContext();
            this.f = handler;
            this.i = new Inner_3dMap_locationOption();
            e();
            b bVar = new b("locServiceAction");
            this.d = bVar;
            bVar.setPriority(5);
            this.d.start();
            this.e = new a(this.d.getLooper());
        } catch (Throwable th) {
            ke.a(th, "LocationService", "<init>");
        }
    }

    private void e() {
        try {
            if (this.i == null) {
                this.i = new Inner_3dMap_locationOption();
            }
            if (this.h) {
                return;
            }
            this.b = new kj(this.a);
            kr krVar = new kr(this.a);
            this.c = krVar;
            krVar.a(this.i);
            f();
            this.h = true;
        } catch (Throwable th) {
            ke.a(th, "LocationService", PointCategory.INIT);
        }
    }

    private void f() {
        try {
            n = kh.b(this.a, "maploc", "ue");
            int iA = kh.a(this.a, "maploc", "opn");
            m = iA;
            if (iA > 500) {
                m = 500;
            }
            if (m < 30) {
                m = 30;
            }
        } catch (Throwable th) {
            ke.a(th, "LocationService", "getSPConfig");
        }
    }

    private synchronized void g() {
        try {
            JSONArray jSONArray = this.o;
            if (jSONArray != null && jSONArray.length() > 0) {
                iy.a(new ix(this.a, ke.c(), this.o.toString()), this.a);
                this.o = null;
            }
        } catch (Throwable th) {
            ke.a(th, "LocationService", "writeOfflineLog");
        }
    }

    private void h() {
        synchronized (this.l) {
            Handler handler = this.e;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.e = null;
        }
    }

    private void i() {
        synchronized (this.l) {
            Handler handler = this.e;
            if (handler != null) {
                handler.removeMessages(1);
            }
        }
    }

    public final void a() {
        try {
            e();
            if (!this.i.getLocationMode().equals(Inner_3dMap_locationOption.Inner_3dMap_Enum_LocationMode.Battery_Saving) && !this.g) {
                this.g = true;
                kj kjVar = this.b;
                if (!kjVar.e) {
                    try {
                        Looper looperMyLooper = Looper.myLooper();
                        if (looperMyLooper == null) {
                            looperMyLooper = kjVar.a.getMainLooper();
                        }
                        Looper looper = looperMyLooper;
                        try {
                            kjVar.b.sendExtraCommand("gps", "force_xtra_injection", new Bundle());
                        } catch (Throwable unused) {
                        }
                        kjVar.b.requestLocationUpdates("gps", 800L, 0.0f, kjVar.j, looper);
                    } catch (SecurityException unused2) {
                    } catch (Throwable th) {
                        ke.a(th, "MAPGPSLocation", "requestLocationUpdates");
                    }
                    kjVar.e = true;
                }
            }
            Handler handler = this.e;
            if (handler != null) {
                handler.sendEmptyMessage(1);
            }
        } catch (Throwable th2) {
            ke.a(th2, "LocationService", "getLocation");
        }
    }

    public final void b() {
        boolean z;
        try {
            if (this.i.getLocationMode().equals(Inner_3dMap_locationOption.Inner_3dMap_Enum_LocationMode.Battery_Saving) && this.g) {
                this.b.a();
                this.g = false;
            }
            kj kjVar = this.b;
            Inner_3dMap_location inner_3dMap_locationA = null;
            if (!kjVar.d) {
                z = false;
            } else if (ki.b() - kjVar.c <= 10000) {
                z = true;
            } else {
                kjVar.f = null;
                z = false;
            }
            if (z) {
                inner_3dMap_locationA = this.b.b();
            } else if (!this.i.getLocationMode().equals(Inner_3dMap_locationOption.Inner_3dMap_Enum_LocationMode.Device_Sensors)) {
                inner_3dMap_locationA = this.c.a();
            }
            if (this.f != null && inner_3dMap_locationA != null) {
                Message messageObtain = Message.obtain();
                messageObtain.obj = inner_3dMap_locationA;
                messageObtain.what = 1;
                this.f.sendMessage(messageObtain);
            }
            try {
                if (n && inner_3dMap_locationA != null && inner_3dMap_locationA.getErrorCode() == 0 && inner_3dMap_locationA.getLocationType() == 1) {
                    if (this.o == null) {
                        this.o = new JSONArray();
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(GPXBasePoint.XML.ATTR_LON, inner_3dMap_locationA.getLongitude());
                    jSONObject.put(GPXBasePoint.XML.ATTR_LAT, inner_3dMap_locationA.getLatitude());
                    jSONObject.put("type", 0);
                    jSONObject.put("timestamp", ki.a());
                    JSONArray jSONArrayPut = this.o.put(jSONObject);
                    this.o = jSONArrayPut;
                    if (jSONArrayPut.length() >= m) {
                        g();
                    }
                }
            } catch (Throwable th) {
                ke.a(th, "LocationService", "recordOfflineLocLog");
            }
        } catch (Throwable th2) {
            ke.a(th2, "LocationService", "doGetLocation");
        }
    }

    public final void c() {
        this.g = false;
        try {
            i();
            kj kjVar = this.b;
            if (kjVar != null) {
                kjVar.a();
            }
        } catch (Throwable th) {
            ke.a(th, "LocationService", "stopLocation");
        }
    }

    public final void d() {
        try {
            c();
            h();
            b bVar = this.d;
            if (bVar != null) {
                if (Build.VERSION.SDK_INT >= 18) {
                    try {
                        kg.a(bVar, (Class<?>) HandlerThread.class, "quitSafely", new Object[0]);
                    } catch (Throwable unused) {
                        bVar = this.d;
                        bVar.quit();
                    }
                } else {
                    bVar.quit();
                }
            }
            this.d = null;
            this.c.b();
            this.g = false;
            this.h = false;
            g();
        } catch (Throwable th) {
            ke.a(th, "LocationService", "destroy");
        }
    }
}
