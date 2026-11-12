package com.amap.api.col.p0003sl;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.AMapLocationListener;
import com.amap.api.maps.LocationSource;
import com.amap.api.maps.model.MyLocationStyle;
import com.autonavi.base.ae.gmap.glyph.ReflectUtil;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar;
import defpackage.zns;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements LocationSource {
    public Method A;
    public Method B;
    public Method C;
    public Method D;
    public Method E;
    public Method F;
    public Method G;
    public Method H;
    public Method I;
    public boolean J = false;
    public long K = VibrateModeProgressBar.sLongToLong;
    public InvocationHandler L = new C0124a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f5946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LocationSource.OnLocationChangedListener f5947b;
    public Object c;
    public Object d;
    public Object e;
    public Method f;
    public Method g;
    public Method h;
    public Method i;
    public Method j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Method f5948k;
    public Method l;
    public Method m;
    public Method n;
    public Method o;
    public Method p;
    public Method q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Method f5949r;
    public Method s;
    public Method t;
    public Method u;
    public Method v;
    public Method w;
    public Method x;
    public Method y;
    public Method z;

    /* JADX INFO: renamed from: com.amap.api.col.3sl.a$a, reason: collision with other inner class name */
    public class C0124a implements InvocationHandler {
        public C0124a() {
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            if (!TextUtils.equals(method.getName(), "onLocationChanged") || a.this.f5947b == null || objArr == null || objArr.length != 1) {
                return null;
            }
            Object obj2 = objArr[0];
            Location location = (Location) obj2;
            Bundle extras = location.getExtras();
            if (extras == null) {
                extras = new Bundle();
            }
            Object objInvokeMethod = ReflectUtil.invokeMethod(obj2, a.this.p, new Object[0]);
            if (objInvokeMethod instanceof Integer) {
                extras.putInt("errorCode", ((Integer) objInvokeMethod).intValue());
            }
            Object objInvokeMethod2 = ReflectUtil.invokeMethod(obj2, a.this.q, new Object[0]);
            if (objInvokeMethod2 instanceof String) {
                extras.putString(MyLocationStyle.ERROR_INFO, (String) objInvokeMethod2);
            }
            Object objInvokeMethod3 = ReflectUtil.invokeMethod(obj2, a.this.f5949r, new Object[0]);
            if (objInvokeMethod3 instanceof Integer) {
                extras.putInt(MyLocationStyle.LOCATION_TYPE, ((Integer) objInvokeMethod3).intValue());
            }
            Object objInvokeMethod4 = ReflectUtil.invokeMethod(obj2, a.this.s, new Object[0]);
            if (objInvokeMethod4 instanceof Float) {
                extras.putFloat("Accuracy", ((Float) objInvokeMethod4).floatValue());
            }
            Object objInvokeMethod5 = ReflectUtil.invokeMethod(obj2, a.this.t, new Object[0]);
            if (objInvokeMethod5 instanceof String) {
                extras.putString("AdCode", (String) objInvokeMethod5);
            }
            Object objInvokeMethod6 = ReflectUtil.invokeMethod(obj2, a.this.u, new Object[0]);
            if (objInvokeMethod6 instanceof String) {
                extras.putString("Address", (String) objInvokeMethod6);
            }
            Object objInvokeMethod7 = ReflectUtil.invokeMethod(obj2, a.this.v, new Object[0]);
            if (objInvokeMethod7 instanceof String) {
                extras.putString("AoiName", (String) objInvokeMethod7);
            }
            Object objInvokeMethod8 = ReflectUtil.invokeMethod(obj2, a.this.w, new Object[0]);
            if (objInvokeMethod8 instanceof String) {
                extras.putString("City", (String) objInvokeMethod8);
            }
            Object objInvokeMethod9 = ReflectUtil.invokeMethod(obj2, a.this.x, new Object[0]);
            if (objInvokeMethod9 instanceof String) {
                extras.putString("CityCode", (String) objInvokeMethod9);
            }
            Object objInvokeMethod10 = ReflectUtil.invokeMethod(obj2, a.this.y, new Object[0]);
            if (objInvokeMethod10 instanceof String) {
                extras.putString("Country", (String) objInvokeMethod10);
            }
            Object objInvokeMethod11 = ReflectUtil.invokeMethod(obj2, a.this.z, new Object[0]);
            if (objInvokeMethod11 instanceof String) {
                extras.putString("District", (String) objInvokeMethod11);
            }
            Object objInvokeMethod12 = ReflectUtil.invokeMethod(obj2, a.this.A, new Object[0]);
            if (objInvokeMethod12 instanceof String) {
                extras.putString("Street", (String) objInvokeMethod12);
            }
            Object objInvokeMethod13 = ReflectUtil.invokeMethod(obj2, a.this.B, new Object[0]);
            if (objInvokeMethod13 instanceof String) {
                extras.putString("StreetNum", (String) objInvokeMethod13);
            }
            Object objInvokeMethod14 = ReflectUtil.invokeMethod(obj2, a.this.C, new Object[0]);
            if (objInvokeMethod14 instanceof String) {
                extras.putString("PoiName", (String) objInvokeMethod14);
            }
            Object objInvokeMethod15 = ReflectUtil.invokeMethod(obj2, a.this.D, new Object[0]);
            if (objInvokeMethod15 instanceof String) {
                extras.putString("Province", (String) objInvokeMethod15);
            }
            Object objInvokeMethod16 = ReflectUtil.invokeMethod(obj2, a.this.E, new Object[0]);
            if (objInvokeMethod16 instanceof Float) {
                extras.putFloat("Speed", ((Float) objInvokeMethod16).floatValue());
            }
            Object objInvokeMethod17 = ReflectUtil.invokeMethod(obj2, a.this.F, new Object[0]);
            if (objInvokeMethod17 instanceof String) {
                extras.putString("Floor", (String) objInvokeMethod17);
            }
            Object objInvokeMethod18 = ReflectUtil.invokeMethod(obj2, a.this.G, new Object[0]);
            if (objInvokeMethod18 instanceof Float) {
                extras.putFloat("Bearing", ((Float) objInvokeMethod18).floatValue());
            }
            Object objInvokeMethod19 = ReflectUtil.invokeMethod(obj2, a.this.H, new Object[0]);
            if (objInvokeMethod19 instanceof String) {
                extras.putString("BuildingId", (String) objInvokeMethod19);
            }
            Object objInvokeMethod20 = ReflectUtil.invokeMethod(obj2, a.this.I, new Object[0]);
            if (objInvokeMethod20 instanceof Double) {
                extras.putDouble("Altitude", ((Double) objInvokeMethod20).doubleValue());
            }
            location.setExtras(extras);
            a.this.f5947b.onLocationChanged(location);
            return null;
        }
    }

    public a(Context context) {
        this.f5946a = context;
        b();
        g();
        i();
    }

    @Override // com.amap.api.maps.LocationSource
    public final void activate(LocationSource.OnLocationChangedListener onLocationChangedListener) {
        this.f5947b = onLocationChangedListener;
        if (iu.a(this.f5946a, zns.t()).f6352a == iu.c.SuccessCode && this.c == null) {
            try {
                Object objNewInstance = ReflectUtil.newInstance("com.amap.api.location.AMapLocationClient", new Class[]{Context.class}, new Object[]{this.f5946a});
                this.c = objNewInstance;
                if (objNewInstance == null) {
                    return;
                }
                this.d = ReflectUtil.newInstance("com.amap.api.location.AMapLocationClientOption", null, null);
                Object objNewProxyInstance = Proxy.newProxyInstance(a.class.getClassLoader(), new Class[]{AMapLocationListener.class}, this.L);
                this.e = objNewProxyInstance;
                ReflectUtil.invokeMethod(this.c, this.f, objNewProxyInstance);
                ReflectUtil.invokeMethod(this.d, this.f5948k, Long.valueOf(this.K));
                ReflectUtil.invokeMethod(this.d, this.l, Boolean.valueOf(this.J));
                ReflectUtil.invokeMethod(this.d, this.m, ReflectUtil.getField("com.amap.api.location.AMapLocationClientOption$AMapLocationMode", null, "Hight_Accuracy"));
                ReflectUtil.invokeMethod(this.d, this.n, Boolean.FALSE);
                ReflectUtil.invokeMethod(this.c, this.g, this.d);
                ReflectUtil.invokeMethod(this.c, this.h, new Object[0]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public final void b() {
        try {
            this.f = ReflectUtil.getMethod("com.amap.api.location.AMapLocationClient", "setLocationListener", AMapLocationListener.class);
            Parcelable.Creator<AMapLocationClientOption> creator = AMapLocationClientOption.CREATOR;
            this.g = ReflectUtil.getMethod("com.amap.api.location.AMapLocationClient", "setLocationOption", AMapLocationClientOption.class);
            this.h = ReflectUtil.getMethod("com.amap.api.location.AMapLocationClient", "startLocation", new Class[0]);
            this.i = ReflectUtil.getMethod("com.amap.api.location.AMapLocationClient", "stopLocation", new Class[0]);
            this.j = ReflectUtil.getMethod("com.amap.api.location.AMapLocationClient", LifecycleConstantKt.ON_DESTROY, new Class[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void c(int i) {
        if (i == 1 || i == 0) {
            e(true);
        } else {
            e(false);
        }
    }

    public final void d(long j) {
        Object obj = this.d;
        if (obj != null && this.c != null) {
            Object objInvokeMethod = ReflectUtil.invokeMethod(obj, this.o, new Object[0]);
            if ((objInvokeMethod instanceof Long) && ((Long) objInvokeMethod).longValue() != j) {
                ReflectUtil.invokeMethod(this.d, this.f5948k, Long.valueOf(j));
                ReflectUtil.invokeMethod(this.c, this.g, this.d);
            }
        }
        this.K = j;
    }

    @Override // com.amap.api.maps.LocationSource
    public final void deactivate() {
        this.f5947b = null;
        Object obj = this.c;
        if (obj != null) {
            ReflectUtil.invokeMethod(obj, this.i, new Object[0]);
            ReflectUtil.invokeMethod(this.c, this.j, new Object[0]);
        }
        this.c = null;
    }

    public final void e(boolean z) {
        Object obj;
        if (this.d != null && (obj = this.c) != null) {
            try {
                ReflectUtil.invokeMethod(obj, this.j, new Object[0]);
                this.c = ReflectUtil.newInstance("com.amap.api.location.AMapLocationClient", new Class[]{Context.class}, new Object[]{this.f5946a});
                Object objNewProxyInstance = Proxy.newProxyInstance(a.class.getClassLoader(), new Class[]{AMapLocationListener.class}, this.L);
                this.e = objNewProxyInstance;
                ReflectUtil.invokeMethod(this.c, this.f, objNewProxyInstance);
                ReflectUtil.invokeMethod(this.d, this.l, Boolean.valueOf(z));
                ReflectUtil.invokeMethod(this.d, this.n, Boolean.FALSE);
                if (!z) {
                    ReflectUtil.invokeMethod(this.d, this.f5948k, Long.valueOf(this.K));
                }
                ReflectUtil.invokeMethod(this.c, this.g, this.d);
                ReflectUtil.invokeMethod(this.c, this.h, new Object[0]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.J = z;
    }

    public final void g() {
        try {
            this.f5948k = ReflectUtil.getMethod("com.amap.api.location.AMapLocationClientOption", "setInterval", Long.TYPE);
            Class cls = Boolean.TYPE;
            this.l = ReflectUtil.getMethod("com.amap.api.location.AMapLocationClientOption", "setOnceLocation", cls);
            AMapLocationClientOption.AMapLocationMode aMapLocationMode = AMapLocationClientOption.AMapLocationMode.Battery_Saving;
            this.m = ReflectUtil.getMethod("com.amap.api.location.AMapLocationClientOption", "setLocationMode", AMapLocationClientOption.AMapLocationMode.class);
            this.n = ReflectUtil.getMethod("com.amap.api.location.AMapLocationClientOption", "setNeedAddress", cls);
            this.o = ReflectUtil.getMethod("com.amap.api.location.AMapLocationClientOption", "getInterval", new Class[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void i() {
        try {
            this.p = ReflectUtil.getMethod("com.amap.api.location.AMapLocation", "getErrorCode", new Class[0]);
            this.q = ReflectUtil.getMethod("com.amap.api.location.AMapLocation", "getErrorInfo", new Class[0]);
            this.f5949r = ReflectUtil.getMethod("com.amap.api.location.AMapLocation", "getLocationType", new Class[0]);
            this.s = ReflectUtil.getMethod("com.amap.api.location.AMapLocation", "getAccuracy", new Class[0]);
            this.t = ReflectUtil.getMethod("com.amap.api.location.AMapLocation", "getAdCode", new Class[0]);
            this.u = ReflectUtil.getMethod("com.amap.api.location.AMapLocation", "getAddress", new Class[0]);
            this.v = ReflectUtil.getMethod("com.amap.api.location.AMapLocation", "getAoiName", new Class[0]);
            this.w = ReflectUtil.getMethod("com.amap.api.location.AMapLocation", "getCity", new Class[0]);
            this.x = ReflectUtil.getMethod("com.amap.api.location.AMapLocation", "getCityCode", new Class[0]);
            this.y = ReflectUtil.getMethod("com.amap.api.location.AMapLocation", "getCountry", new Class[0]);
            this.z = ReflectUtil.getMethod("com.amap.api.location.AMapLocation", "getDistrict", new Class[0]);
            this.A = ReflectUtil.getMethod("com.amap.api.location.AMapLocation", "getStreet", new Class[0]);
            this.B = ReflectUtil.getMethod("com.amap.api.location.AMapLocation", "getStreetNum", new Class[0]);
            this.C = ReflectUtil.getMethod("com.amap.api.location.AMapLocation", "getPoiName", new Class[0]);
            this.D = ReflectUtil.getMethod("com.amap.api.location.AMapLocation", "getProvince", new Class[0]);
            this.E = ReflectUtil.getMethod("com.amap.api.location.AMapLocation", "getSpeed", new Class[0]);
            this.F = ReflectUtil.getMethod("com.amap.api.location.AMapLocation", "getFloor", new Class[0]);
            this.G = ReflectUtil.getMethod("com.amap.api.location.AMapLocation", "getBearing", new Class[0]);
            this.H = ReflectUtil.getMethod("com.amap.api.location.AMapLocation", "getBuildingId", new Class[0]);
            this.I = ReflectUtil.getMethod("com.amap.api.location.AMapLocation", "getAltitude", new Class[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
