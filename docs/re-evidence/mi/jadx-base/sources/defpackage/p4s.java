package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.amap.api.col.p0003sl.o;
import com.amap.api.col.p0003sl.p;
import com.amap.api.maps.AMapOptions;
import com.amap.api.maps.CameraUpdateFactory;
import com.amap.api.maps.UiSettings;
import com.amap.api.maps.model.CameraPosition;
import com.autonavi.amap.mapcore.interfaces.IAMap;
import com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate;

/* JADX INFO: loaded from: classes4.dex */
public final class p4s implements IMapFragmentDelegate {
    public static volatile Context f;
    public static String g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IAMap f30002a;
    public int c;
    public AMapOptions d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f30003b = 0;
    public boolean e = true;

    public p4s(int i) {
        this.c = i % 3;
        d();
    }

    public static void a() {
        try {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            for (int i = 0; i < stackTrace.length; i++) {
                if (stackTrace[i].getClassName() != null && stackTrace[i].getClassName().endsWith("TextureMapView")) {
                    z2 = true;
                }
                if (stackTrace[i].getClassName() != null && stackTrace[i].getClassName().endsWith("Fragment")) {
                    z = true;
                }
                if ("OnDestroyView".equalsIgnoreCase(stackTrace[i].getMethodName())) {
                    z3 = true;
                }
            }
            if (z && z2 && !z3) {
                e();
            }
        } catch (Throwable unused) {
        }
    }

    public static void b(Context context) {
        if (context != null) {
            f = context.getApplicationContext();
        }
    }

    public static void d() {
        try {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 80; i++) {
                sb.append("=");
            }
            g = sb.toString();
        } catch (Throwable unused) {
        }
    }

    public static void e() {
    }

    public final void c(AMapOptions aMapOptions) throws RemoteException {
        if (aMapOptions == null || this.f30002a == null) {
            return;
        }
        CameraPosition camera = aMapOptions.getCamera();
        if (camera != null) {
            this.f30002a.moveCamera(CameraUpdateFactory.newCameraPosition(camera));
        }
        UiSettings aMapUiSettings = this.f30002a.getAMapUiSettings();
        aMapUiSettings.setRotateGesturesEnabled(aMapOptions.getRotateGesturesEnabled());
        aMapUiSettings.setScrollGesturesEnabled(aMapOptions.getScrollGesturesEnabled());
        aMapUiSettings.setTiltGesturesEnabled(aMapOptions.getTiltGesturesEnabled());
        aMapUiSettings.setZoomControlsEnabled(aMapOptions.getZoomControlsEnabled());
        aMapUiSettings.setZoomGesturesEnabled(aMapOptions.getZoomGesturesEnabled());
        aMapUiSettings.setCompassEnabled(aMapOptions.getCompassEnabled());
        aMapUiSettings.setScaleControlsEnabled(aMapOptions.getScaleControlsEnabled());
        aMapUiSettings.setLogoPosition(aMapOptions.getLogoPosition());
        this.f30002a.setMapType(aMapOptions.getMapType());
        this.f30002a.setZOrderOnTop(aMapOptions.getZOrderOnTop());
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public final IAMap getMap() throws RemoteException {
        if (this.f30002a == null) {
            if (f == null) {
                return null;
            }
            int i = f.getResources().getDisplayMetrics().densityDpi;
            if (i <= 120) {
                ugt.f35750b = 0.5f;
            } else if (i <= 160) {
                ugt.f35750b = 0.8f;
            } else if (i <= 240) {
                ugt.f35750b = 0.87f;
            } else if (i <= 320) {
                ugt.f35750b = 1.0f;
            } else if (i <= 480) {
                ugt.f35750b = 1.5f;
            } else if (i <= 640) {
                ugt.f35750b = 1.8f;
            } else {
                ugt.f35750b = 0.9f;
            }
            int i2 = this.c;
            if (i2 == 0) {
                this.f30002a = new o(f, this.e).b();
            } else if (i2 == 1) {
                this.f30002a = new p(f, this.e).r();
            } else {
                this.f30002a = new q8t(f).a();
            }
        }
        return this.f30002a;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public final boolean isReady() throws RemoteException {
        return false;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public final void loadWorldVectorMap(boolean z) {
        this.e = z;
        IAMap iAMap = this.f30002a;
        if (iAMap != null) {
            iAMap.loadWorldVectorMap(z);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public final void onCreate(Bundle bundle) throws RemoteException {
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws RemoteException {
        byte[] byteArray;
        if (f == null && layoutInflater != null) {
            setContext(layoutInflater.getContext().getApplicationContext());
        }
        try {
            IAMap map = getMap();
            this.f30002a = map;
            map.setVisibilityEx(this.f30003b);
            if (this.d == null && bundle != null && (byteArray = bundle.getByteArray("MAP_OPTIONS")) != null) {
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.unmarshall(byteArray, 0, byteArray.length);
                parcelObtain.setDataPosition(0);
                this.d = AMapOptions.CREATOR.createFromParcel(parcelObtain);
            }
            c(this.d);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return this.f30002a.getView();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public final void onDestroy() throws RemoteException {
        a();
        IAMap iAMap = this.f30002a;
        if (iAMap != null) {
            iAMap.destroy();
            this.f30002a = null;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public final void onDestroyView() throws RemoteException {
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public final void onInflate(Activity activity, AMapOptions aMapOptions, Bundle bundle) throws RemoteException {
        setContext(activity.getApplicationContext());
        this.d = aMapOptions;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public final void onLowMemory() throws RemoteException {
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public final void onPause() throws RemoteException {
        IAMap iAMap = this.f30002a;
        if (iAMap != null) {
            iAMap.onActivityPause();
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public final void onResume() throws RemoteException {
        IAMap iAMap = this.f30002a;
        if (iAMap != null) {
            iAMap.onActivityResume();
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public final void onSaveInstanceState(Bundle bundle) throws RemoteException {
        if (this.f30002a != null) {
            if (this.d == null) {
                this.d = new AMapOptions();
            }
            try {
                Parcel parcelObtain = Parcel.obtain();
                AMapOptions aMapOptionsCamera = this.d.camera(getMap().getCameraPosition());
                this.d = aMapOptionsCamera;
                aMapOptionsCamera.writeToParcel(parcelObtain, 0);
                bundle.putByteArray("MAP_OPTIONS", parcelObtain.marshall());
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public final void setContext(Context context) {
        b(context);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public final void setOptions(AMapOptions aMapOptions) {
        this.d = aMapOptions;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public final void setUseForNavi(boolean z) {
        IAMap iAMap = this.f30002a;
        if (iAMap != null) {
            iAMap.setUseForNavi(z);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public final void setVisibility(int i) {
        this.f30003b = i;
        IAMap iAMap = this.f30002a;
        if (iAMap != null) {
            iAMap.setVisibilityEx(i);
        }
    }
}
