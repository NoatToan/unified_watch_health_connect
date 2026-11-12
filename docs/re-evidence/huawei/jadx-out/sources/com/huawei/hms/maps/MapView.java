package com.huawei.hms.maps;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.huawei.hms.common.Preconditions;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.feature.dynamic.OnDelegateCreatedListener;
import com.huawei.hms.maps.auth.AuthClient;
import com.huawei.hms.maps.internal.HmsUtil;
import com.huawei.hms.maps.internal.ICreator;
import com.huawei.hms.maps.internal.IHuaweiMapDelegate;
import com.huawei.hms.maps.internal.IMapViewDelegate;
import com.huawei.hms.maps.internal.IOnMapReadyCallback;
import com.huawei.hms.maps.model.RuntimeRemoteException;
import com.huawei.hms.maps.provider.inhuawei.MapViewDelegate;
import com.huawei.hms.maps.utils.LogM;
import com.huawei.hms.maps.utils.MapClientUtil;
import com.huawei.hms.maps.utils.MapsAdvUtil;
import com.huawei.ui.commonui.base.BaseDialog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class MapView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected MapLifecycleDelegate f14136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f14137b;

    static class maa extends com.huawei.hms.maps.maa implements MapLifecycleDelegate {
        private final ViewGroup i;
        private final Context j;
        private OnDelegateCreatedListener k;
        private final HuaweiMapOptions l;
        private final List m = new ArrayList();
        private boolean n = false;

        protected IMapViewDelegate a(ICreator iCreator, Context context, HuaweiMapOptions huaweiMapOptions) {
            if (MapsAdvUtil.containsMapsBasic()) {
                return new MapViewDelegate(context, huaweiMapOptions);
            }
            try {
                LogM.i("MapView", "createDelegate: createMapViewDelegateRemote");
                return iCreator.newMapViewDelegate(ObjectWrapper.wrap(context), huaweiMapOptions);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.maps.maa
        protected void a(ICreator iCreator) {
            LogM.i("MapView", "createDelegate: initDelegateFlag = " + this.n);
            if (this.n) {
                return;
            }
            this.n = true;
            try {
                MapClientIdentify mapClientIdentify = new MapClientIdentify();
                Context contextE = com.huawei.hms.maps.internal.mab.e(this.j);
                iCreator.initAppContext(ObjectWrapper.wrap(this.j));
                mapClientIdentify.regestIdentity(this.j, iCreator);
                IMapViewDelegate iMapViewDelegateA = contextE != null ? a(iCreator, contextE, this.l) : null;
                if (iMapViewDelegateA == null) {
                    LogM.w("MapView", "createDelegate: mapReadyCallbacks: mapViewDelegate is null");
                    this.n = false;
                    return;
                }
                LogM.i("MapView", "createDelegate: sdk MapView constructor mIMapViewDelegate:" + iMapViewDelegateA);
                iMapViewDelegateA.setActivity(ObjectWrapper.wrap(this.j));
                OnDelegateCreatedListener onDelegateCreatedListener = this.k;
                if (onDelegateCreatedListener != null) {
                    onDelegateCreatedListener.onDelegateCreated(new mab(this.i, this.j, iMapViewDelegateA));
                }
                LogM.i("MapView", "createDelegate: mapReadyCallbacks.size = " + this.m.size());
                Iterator it = this.m.iterator();
                while (it.hasNext()) {
                    ((mab) getDelegate()).getMapAsync((OnMapReadyCallback) it.next());
                }
                this.m.clear();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.maps.MapLifecycleDelegate
        public final void getMapAsync(OnMapReadyCallback onMapReadyCallback) {
            LogM.i("MapView", "getMapAsync: getDelegate = " + getDelegate());
            if (getDelegate() != null) {
                ((mab) getDelegate()).getMapAsync(onMapReadyCallback);
                return;
            }
            this.m.add(onMapReadyCallback);
            LogM.i("MapView", "getMapAsync: mapReadyCallbacks.size = " + this.m.size());
        }

        @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper
        public void createDelegate(OnDelegateCreatedListener onDelegateCreatedListener) {
            mac.a(this.j);
            this.k = onDelegateCreatedListener;
            if (onDelegateCreatedListener == null || getDelegate() != null) {
                LogM.e("MapView", "createDelegate: onDelegateCreatedListener = " + onDelegateCreatedListener + "; getDelegate = " + getDelegate());
                return;
            }
            MapsInitializer.initialize(this.j);
            int iIsHmsAvailable = HmsUtil.isHmsAvailable(this.j);
            if (iIsHmsAvailable != 0) {
                LogM.e("MapView", "not load map hmsState = " + iIsHmsAvailable);
                return;
            }
            MapClientIdentify.initApiKey(this.j);
            if (TextUtils.isEmpty(MapClientIdentify.getAppId())) {
                MapClientIdentify.setAppId(MapClientUtil.getAppId(this.j));
            }
            ICreator iCreatorA = com.huawei.hms.maps.internal.mab.a(this.j);
            if (iCreatorA == null) {
                LogM.e("MapView", "createDelegate: creator == null");
                a(this.j);
            } else {
                LogM.e("MapView", "createDelegate: innerCreateDelegate creator = " + iCreatorA);
                a(iCreatorA);
            }
        }

        maa(ViewGroup viewGroup, Context context, HuaweiMapOptions huaweiMapOptions) {
            this.i = viewGroup;
            this.j = context;
            this.l = huaweiMapOptions;
        }
    }

    static class mab extends maf implements MapLifecycleDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ViewGroup f14138a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private IMapViewDelegate f14139b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private View f14140c;
        private boolean d = false;
        private Context e;

        private void a() {
            Activity activityFindActivity = HmsUtil.findActivity(MapClientIdentify.getAppContext());
            if (activityFindActivity == null || !activityFindActivity.isFinishing()) {
                return;
            }
            MapsInitializer.initialize(null);
            MapClientIdentify.setAppContext(null);
            com.huawei.hms.maps.internal.mab.a();
            this.d = true;
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public void onStop() {
            try {
                this.f14139b.onStop();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public void onStart() {
            try {
                this.f14139b.onStart();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public void onSaveInstanceState(Bundle bundle) {
            try {
                this.f14139b.onSaveInstanceState(map.a(bundle));
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public void onResume() {
            try {
                LogM.d("MapView", "MapView:onResume");
                this.f14139b.onResume();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public void onPause() {
            try {
                LogM.d("MapView", "MapView:onResume");
                this.f14139b.onPause();
                if (MapClientIdentify.getAppContext() instanceof Activity) {
                    a();
                    if (this.d) {
                        LogM.d("MapView", "clearResource in onPause method");
                    }
                }
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public void onLowMemory() {
            try {
                this.f14139b.onLowMemory();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onInflate(Activity activity, Bundle bundle, Bundle bundle2) {
            throw new UnsupportedOperationException("onInflate prohibited on MapViewDelegate");
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public void onDestroyView() {
            throw new UnsupportedOperationException("onDestroyView prohibited on MapViewDelegate");
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public void onDestroy() {
            try {
                this.f14139b.onDestroy();
                if (this.d) {
                    return;
                }
                a();
                LogM.d("MapView", this.d ? "clearResource in onDestroy method" : "onDestroy: execute clearResource in onDestroy method, but activity is  running");
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            throw new UnsupportedOperationException("onCreateView prohibited on MapViewDelegate");
        }

        class maa extends IOnMapReadyCallback.Stub {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ OnMapReadyCallback f14141a;

            @Override // com.huawei.hms.maps.internal.IOnMapReadyCallback
            public void onMapReady(IHuaweiMapDelegate iHuaweiMapDelegate) {
                if (this.f14141a != null) {
                    LogM.i("MapView", "onMapReady: mapReadyCallback is not null");
                    if (MapsAdvUtil.containsMapsAdvance()) {
                        LogM.i("MapView", "onMapReady: fullsdk ");
                        this.f14141a.onMapReady(mab.this.a((com.huawei.hms.maps.provider.inhuawei.IHuaweiMapDelegate) iHuaweiMapDelegate));
                    } else {
                        this.f14141a.onMapReady(new HuaweiMap(iHuaweiMapDelegate));
                    }
                } else {
                    LogM.w("MapView", "onMapReady: mapReadyCallback is null");
                }
                if (mab.this.f14138a != null) {
                    mab.this.f14138a.setBackground(null);
                }
            }

            maa(OnMapReadyCallback onMapReadyCallback) {
                this.f14141a = onMapReadyCallback;
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public void onCreate(Bundle bundle) {
            try {
                this.f14139b.onCreate(map.a(bundle));
                this.f14139b.setActivity(ObjectWrapper.wrap(this.e));
                this.f14140c = !MapsAdvUtil.containsMapsBasic() ? (View) ObjectWrapper.unwrap(this.f14139b.getView()) : this.f14139b.getMapView();
                this.f14138a.removeAllViews();
                this.f14138a.addView(this.f14140c);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.maps.MapLifecycleDelegate
        public void getMapAsync(OnMapReadyCallback onMapReadyCallback) {
            try {
                this.f14139b.getMapAsync(new maa(onMapReadyCallback));
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public mab(ViewGroup viewGroup, Context context, IMapViewDelegate iMapViewDelegate) {
            this.f14138a = (ViewGroup) Preconditions.checkNotNull(viewGroup);
            this.f14139b = (IMapViewDelegate) Preconditions.checkNotNull(iMapViewDelegate);
            this.e = context;
            MapsInitializer.initialize(context);
        }
    }

    public MapView(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    public MapView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MapView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, false);
    }

    protected MapView(Context context, AttributeSet attributeSet, int i, boolean z) {
        super(context, attributeSet, i);
        this.f14137b = z;
        a(context, attributeSet != null ? HuaweiMapOptions.createFromAttributes(context, attributeSet) : null);
    }

    public MapView(Context context, HuaweiMapOptions huaweiMapOptions) {
        this(context, huaweiMapOptions, false);
    }

    protected MapView(Context context, HuaweiMapOptions huaweiMapOptions, boolean z) {
        super(context);
        this.f14137b = z;
        a(context, huaweiMapOptions);
    }

    public void onStop() {
        MapLifecycleDelegate mapLifecycleDelegate = this.f14136a;
        if (mapLifecycleDelegate != null) {
            mapLifecycleDelegate.onStop();
        }
    }

    public void onStart() {
        MapLifecycleDelegate mapLifecycleDelegate = this.f14136a;
        if (mapLifecycleDelegate != null) {
            mapLifecycleDelegate.onStart();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        MapLifecycleDelegate mapLifecycleDelegate = this.f14136a;
        if (mapLifecycleDelegate != null) {
            mapLifecycleDelegate.onSaveInstanceState(bundle);
        }
    }

    public void onResume() {
        MapLifecycleDelegate mapLifecycleDelegate = this.f14136a;
        if (mapLifecycleDelegate != null) {
            mapLifecycleDelegate.onResume();
        }
    }

    public void onPause() {
        LogM.d("MapView", BaseDialog.LIFE_CYCLE_ON_PAUSE);
        MapLifecycleDelegate mapLifecycleDelegate = this.f14136a;
        if (mapLifecycleDelegate != null) {
            mapLifecycleDelegate.onPause();
        }
    }

    public final void onLowMemory() {
        MapLifecycleDelegate mapLifecycleDelegate = this.f14136a;
        if (mapLifecycleDelegate != null) {
            mapLifecycleDelegate.onLowMemory();
        }
    }

    public final void onExitAmbient() {
        LogM.d("MapView", "onExitAmbient");
    }

    public final void onEnterAmbient(Bundle bundle) {
        LogM.d("MapView", "onEnterAmbient");
    }

    public void onDestroy() {
        MapLifecycleDelegate mapLifecycleDelegate = this.f14136a;
        if (mapLifecycleDelegate != null) {
            mapLifecycleDelegate.onDestroy();
        }
        HmsUtil.setRepeatFlag(true);
    }

    public void onCreate(Bundle bundle) {
        if (this.f14136a == null) {
            LogM.e("MapView", "MapsInitializer is not initialized.");
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        MapClientIdentify.setMapAuthStartTime(System.currentTimeMillis());
        com.huawei.hms.maps.internal.mab.f(getContext());
        com.huawei.hms.maps.internal.mab.a(true);
        try {
            this.f14136a.onCreate(bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void getMapAsync(OnMapReadyCallback onMapReadyCallback) {
        LogM.d("MapView", "getMapAsync: ");
        MapLifecycleDelegate mapLifecycleDelegate = this.f14136a;
        if (mapLifecycleDelegate != null) {
            mapLifecycleDelegate.getMapAsync(onMapReadyCallback);
        }
    }

    private void a(Context context, HuaweiMapOptions huaweiMapOptions) {
        MapLifecycleDelegate maaVar;
        LogM.d("MapView", "initMapView: ");
        if (!MapsInitializer.a()) {
            LogM.e("MapView", "MapsInitializer is not initialized.");
            this.f14136a = null;
            return;
        }
        if (MapClientIdentify.getMapAuthStartTime() == 0) {
            MapClientIdentify.setMapAuthStartTime(System.currentTimeMillis());
        }
        if (!this.f14137b) {
            if (MapsAdvUtil.containsMapsBasic()) {
                mac.a(context);
                AuthClient.getInstance().startAuth(context);
                maaVar = new mab(this, context, new MapViewDelegate(context, huaweiMapOptions));
            } else {
                maaVar = new maa(this, context, huaweiMapOptions);
            }
            this.f14136a = maaVar;
        }
        setClickable(true);
        setBackground(new mam().a(this));
    }
}
