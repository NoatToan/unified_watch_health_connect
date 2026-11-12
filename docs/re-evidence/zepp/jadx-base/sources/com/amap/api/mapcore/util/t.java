package com.amap.api.mapcore.util;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.amap.api.maps.AMapOptions;
import com.amap.api.maps.CameraUpdateFactory;
import com.amap.api.maps.UiSettings;
import com.amap.api.maps.model.CameraPosition;
import com.autonavi.amap.mapcore.interfaces.IAMap;
import com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes2.dex */
public final class t implements IMapFragmentDelegate {
    public static volatile Context a;
    private static String f;
    public int b = 0;
    public boolean c = true;
    private IAMap d;
    private int e;
    private AMapOptions g;

    public t(int i) {
        this.e = 0;
        this.e = i % 3;
        a();
    }

    private static void a() {
        try {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 80; i++) {
                sb.append(SearchCriteria.EQ);
            }
            f = sb.toString();
        } catch (Throwable unused) {
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public final IAMap getMap() throws RemoteException {
        if (this.d == null) {
            if (a == null) {
                Log.w("MapFragmentDelegateImp", "Context 为 null 请在地图调用之前 使用 MapsInitializer.initialize(Context paramContext) 来设置Context");
                return null;
            }
            int i = a.getResources().getDisplayMetrics().densityDpi;
            if (i <= 120) {
                l.a = 0.5f;
            } else if (i <= 160) {
                l.a = 0.8f;
            } else if (i <= 240) {
                l.a = 0.87f;
            } else if (i <= 320) {
                l.a = 1.0f;
            } else if (i <= 480) {
                l.a = 1.5f;
            } else if (i <= 640) {
                l.a = 1.8f;
            } else {
                l.a = 0.9f;
            }
            int i2 = this.e;
            if (i2 == 0) {
                this.d = new d(a, this.c).a();
            } else if (i2 == 1) {
                this.d = new e(a, this.c).a();
            } else {
                this.d = new c(a).a();
            }
        }
        return this.d;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public final boolean isReady() throws RemoteException {
        return false;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public final void loadWorldVectorMap(boolean z) {
        this.c = z;
        IAMap iAMap = this.d;
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
        if (a == null && layoutInflater != null) {
            setContext(layoutInflater.getContext().getApplicationContext());
        }
        try {
            IAMap map = getMap();
            this.d = map;
            map.setVisibilityEx(this.b);
            if (this.g == null && bundle != null && (byteArray = bundle.getByteArray("MAP_OPTIONS")) != null) {
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.unmarshall(byteArray, 0, byteArray.length);
                parcelObtain.setDataPosition(0);
                this.g = AMapOptions.CREATOR.createFromParcel(parcelObtain);
            }
            AMapOptions aMapOptions = this.g;
            if (aMapOptions != null && this.d != null) {
                CameraPosition camera = aMapOptions.getCamera();
                if (camera != null) {
                    this.d.moveCamera(CameraUpdateFactory.newCameraPosition(camera));
                }
                UiSettings aMapUiSettings = this.d.getAMapUiSettings();
                aMapUiSettings.setRotateGesturesEnabled(aMapOptions.getRotateGesturesEnabled());
                aMapUiSettings.setScrollGesturesEnabled(aMapOptions.getScrollGesturesEnabled());
                aMapUiSettings.setTiltGesturesEnabled(aMapOptions.getTiltGesturesEnabled());
                aMapUiSettings.setZoomControlsEnabled(aMapOptions.getZoomControlsEnabled());
                aMapUiSettings.setZoomGesturesEnabled(aMapOptions.getZoomGesturesEnabled());
                aMapUiSettings.setCompassEnabled(aMapOptions.getCompassEnabled());
                aMapUiSettings.setScaleControlsEnabled(aMapOptions.getScaleControlsEnabled());
                aMapUiSettings.setLogoPosition(aMapOptions.getLogoPosition());
                this.d.setMapType(aMapOptions.getMapType());
                this.d.setZOrderOnTop(aMapOptions.getZOrderOnTop());
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return this.d.getView();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public final void onDestroy() throws RemoteException {
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
                Log.i("errorLog", f);
                Log.i("errorLog", "OnDestroy 方法需要在OnDestroyView中调用");
                Log.i("errorLog", f);
            }
        } catch (Throwable unused) {
        }
        IAMap iAMap = this.d;
        if (iAMap != null) {
            iAMap.clear();
            this.d.destroy();
            this.d = null;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public final void onDestroyView() throws RemoteException {
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public final void onInflate(Activity activity, AMapOptions aMapOptions, Bundle bundle) throws RemoteException {
        setContext(activity.getApplicationContext());
        this.g = aMapOptions;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public final void onLowMemory() throws RemoteException {
        Log.d("onLowMemory", "onLowMemory run");
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public final void onPause() throws RemoteException {
        IAMap iAMap = this.d;
        if (iAMap != null) {
            iAMap.onActivityPause();
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public final void onResume() throws RemoteException {
        IAMap iAMap = this.d;
        if (iAMap != null) {
            iAMap.onActivityResume();
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public final void onSaveInstanceState(Bundle bundle) throws RemoteException {
        if (this.d != null) {
            if (this.g == null) {
                this.g = new AMapOptions();
            }
            try {
                Parcel parcelObtain = Parcel.obtain();
                AMapOptions aMapOptionsCamera = this.g.camera(getMap().getCameraPosition());
                this.g = aMapOptionsCamera;
                aMapOptionsCamera.writeToParcel(parcelObtain, 0);
                bundle.putByteArray("MAP_OPTIONS", parcelObtain.marshall());
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public final void setContext(Context context) {
        if (context != null) {
            a = context.getApplicationContext();
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public final void setOptions(AMapOptions aMapOptions) {
        this.g = aMapOptions;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public final void setVisibility(int i) {
        this.b = i;
        IAMap iAMap = this.d;
        if (iAMap != null) {
            iAMap.setVisibilityEx(i);
        }
    }
}
