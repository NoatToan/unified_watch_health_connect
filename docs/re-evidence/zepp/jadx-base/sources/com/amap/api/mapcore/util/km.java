package com.amap.api.mapcore.util;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.autonavi.amap.mapcore.Inner_3dMap_location;
import com.autonavi.amap.mapcore.Inner_3dMap_locationListener;
import com.autonavi.amap.mapcore.Inner_3dMap_locationManagerBase;
import com.autonavi.amap.mapcore.Inner_3dMap_locationOption;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class km implements Inner_3dMap_locationManagerBase {
    public Context a;
    public Handler d;
    public a e;
    public Handler f;
    public ArrayList<Inner_3dMap_locationListener> b = new ArrayList<>();
    public Object c = new Object();
    public Inner_3dMap_locationOption g = new Inner_3dMap_locationOption();
    public kq h = null;
    public Inner_3dMap_locationOption.Inner_3dMap_Enum_LocationMode i = Inner_3dMap_locationOption.Inner_3dMap_Enum_LocationMode.Hight_Accuracy;
    public boolean j = false;

    public static class a extends HandlerThread {
        public km a;

        public a(String str, km kmVar) {
            super(str);
            this.a = kmVar;
        }

        @Override // android.os.HandlerThread
        public final void onLooperPrepared() {
            try {
                km kmVar = this.a;
                km kmVar2 = this.a;
                kmVar.h = new kq(kmVar2.a, kmVar2.d);
                super.onLooperPrepared();
            } catch (Throwable unused) {
            }
        }

        @Override // android.os.HandlerThread, java.lang.Thread, java.lang.Runnable
        public final void run() {
            try {
                super.run();
            } catch (Throwable unused) {
            }
        }
    }

    public km(Context context) {
        this.a = null;
        this.d = null;
        this.e = null;
        this.f = null;
        if (context == null) {
            throw new IllegalArgumentException("Context参数不能为null");
        }
        this.a = context.getApplicationContext();
        try {
            this.d = Looper.myLooper() == null ? new ko(this.a.getMainLooper(), this) : new ko(this);
        } catch (Throwable th) {
            ke.a(th, "MapLocationManager", "initResultHandler");
        }
        try {
            a aVar = new a("locaitonClientActionThread", this);
            this.e = aVar;
            aVar.setPriority(5);
            this.e.start();
            this.f = a(this.e.getLooper());
        } catch (Throwable th2) {
            ke.a(th2, "MapLocationManager", "initActionThreadAndActionHandler");
        }
    }

    private Handler a(Looper looper) {
        kn knVar;
        synchronized (this.c) {
            knVar = new kn(looper, this);
            this.f = knVar;
        }
        return knVar;
    }

    private void a(int i) {
        synchronized (this.c) {
            Handler handler = this.f;
            if (handler != null) {
                handler.removeMessages(i);
            }
        }
    }

    private void a(int i, Object obj, long j) {
        synchronized (this.c) {
            if (this.f != null) {
                Message messageObtain = Message.obtain();
                messageObtain.what = i;
                messageObtain.obj = obj;
                this.f.sendMessageDelayed(messageObtain, j);
            }
        }
    }

    public final void a() {
        try {
            if (this.j) {
                return;
            }
            this.j = true;
            a(1005, null, 0L);
        } catch (Throwable th) {
            ke.a(th, "MapLocationManager", "doStartLocation");
        }
    }

    public final void a(Inner_3dMap_location inner_3dMap_location) {
        if (inner_3dMap_location != null) {
            try {
                if (kt.a(inner_3dMap_location)) {
                    kk.a = inner_3dMap_location;
                }
            } catch (Throwable th) {
                ke.a(th, "MapLocationManager", "callBackLocation");
                return;
            }
        }
        if (this.j) {
            if (!"gps".equalsIgnoreCase(inner_3dMap_location.getProvider())) {
                inner_3dMap_location.setProvider("lbs");
            }
            inner_3dMap_location.setAltitude(ki.b(inner_3dMap_location.getAltitude()));
            inner_3dMap_location.setBearing(ki.a(inner_3dMap_location.getBearing()));
            inner_3dMap_location.setSpeed(ki.a(inner_3dMap_location.getSpeed()));
            Iterator<Inner_3dMap_locationListener> it2 = this.b.iterator();
            while (it2.hasNext()) {
                it2.next().onLocationChanged(inner_3dMap_location);
            }
        }
        if (this.g.isOnceLocation()) {
            c();
        }
    }

    public final void a(Inner_3dMap_locationListener inner_3dMap_locationListener) {
        if (inner_3dMap_locationListener != null) {
            try {
                if (!this.b.isEmpty() && this.b.contains(inner_3dMap_locationListener)) {
                    this.b.remove(inner_3dMap_locationListener);
                }
            } catch (Throwable th) {
                ke.a(th, "MapLocationManager", "doUnregisterListener");
                return;
            }
        }
        if (this.b.isEmpty()) {
            c();
        }
    }

    public final void a(Inner_3dMap_locationOption inner_3dMap_locationOption) {
        this.g = inner_3dMap_locationOption;
        if (inner_3dMap_locationOption == null) {
            this.g = new Inner_3dMap_locationOption();
        }
        kq kqVar = this.h;
        if (kqVar != null) {
            Inner_3dMap_locationOption inner_3dMap_locationOption2 = this.g;
            kqVar.i = inner_3dMap_locationOption2;
            if (inner_3dMap_locationOption2 == null) {
                kqVar.i = new Inner_3dMap_locationOption();
            }
            kr krVar = kqVar.c;
            if (krVar != null) {
                krVar.a(inner_3dMap_locationOption2);
            }
        }
        if (this.j && !this.i.equals(inner_3dMap_locationOption.getLocationMode())) {
            c();
            a();
        }
        this.i = this.g.getLocationMode();
    }

    public final void b() {
        long interval = 1000;
        try {
            kq kqVar = this.h;
            if (kqVar != null) {
                kqVar.a();
            }
            if (this.g.isOnceLocation()) {
                return;
            }
            a(1005, null, this.g.getInterval() >= 1000 ? this.g.getInterval() : 1000L);
        } catch (Throwable th) {
            try {
                ke.a(th, "MapLocationManager", "doGetLocation");
            } finally {
                if (!this.g.isOnceLocation()) {
                    a(1005, null, this.g.getInterval() >= 1000 ? this.g.getInterval() : 1000L);
                }
            }
        }
    }

    public final void c() {
        try {
            this.j = false;
            a(1004);
            a(1005);
            kq kqVar = this.h;
            if (kqVar != null) {
                kqVar.c();
            }
        } catch (Throwable th) {
            ke.a(th, "MapLocationManager", "doStopLocation");
        }
    }

    public final void d() {
        c();
        kq kqVar = this.h;
        if (kqVar != null) {
            kqVar.d();
        }
        ArrayList<Inner_3dMap_locationListener> arrayList = this.b;
        if (arrayList != null) {
            arrayList.clear();
            this.b = null;
        }
        synchronized (this.c) {
            Handler handler = this.f;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.f = null;
        }
        a aVar = this.e;
        if (aVar != null) {
            if (Build.VERSION.SDK_INT >= 18) {
                try {
                    kg.a(aVar, (Class<?>) HandlerThread.class, "quitSafely", new Object[0]);
                } catch (Throwable unused) {
                    aVar = this.e;
                    aVar.quit();
                }
            } else {
                aVar.quit();
            }
        }
        this.e = null;
        Handler handler2 = this.d;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
            this.d = null;
        }
    }

    @Override // com.autonavi.amap.mapcore.Inner_3dMap_locationManagerBase
    public final void destroy() {
        try {
            a(1007, null, 0L);
        } catch (Throwable th) {
            ke.a(th, "MapLocationManager", "stopLocation");
        }
    }

    @Override // com.autonavi.amap.mapcore.Inner_3dMap_locationManagerBase
    public final Inner_3dMap_location getLastKnownLocation() {
        return kk.a;
    }

    @Override // com.autonavi.amap.mapcore.Inner_3dMap_locationManagerBase
    public final void setLocationListener(Inner_3dMap_locationListener inner_3dMap_locationListener) {
        try {
            a(1002, inner_3dMap_locationListener, 0L);
        } catch (Throwable th) {
            ke.a(th, "MapLocationManager", "setLocationListener");
        }
    }

    @Override // com.autonavi.amap.mapcore.Inner_3dMap_locationManagerBase
    public final void setLocationOption(Inner_3dMap_locationOption inner_3dMap_locationOption) {
        try {
            a(1001, inner_3dMap_locationOption, 0L);
        } catch (Throwable th) {
            ke.a(th, "LocationClientManager", "setLocationOption");
        }
    }

    @Override // com.autonavi.amap.mapcore.Inner_3dMap_locationManagerBase
    public final void startLocation() {
        try {
            a(1004, null, 0L);
        } catch (Throwable th) {
            ke.a(th, "MapLocationManager", "startLocation");
        }
    }

    @Override // com.autonavi.amap.mapcore.Inner_3dMap_locationManagerBase
    public final void stopLocation() {
        try {
            a(1006, null, 0L);
        } catch (Throwable th) {
            ke.a(th, "MapLocationManager", "stopLocation");
        }
    }

    @Override // com.autonavi.amap.mapcore.Inner_3dMap_locationManagerBase
    public final void unRegisterLocationListener(Inner_3dMap_locationListener inner_3dMap_locationListener) {
        try {
            a(1003, inner_3dMap_locationListener, 0L);
        } catch (Throwable th) {
            ke.a(th, "MapLocationManager", "stopLocation");
        }
    }
}
