package com.huawei.hms.maps;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.hms.common.Preconditions;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.feature.dynamic.OnDelegateCreatedListener;
import com.huawei.hms.maps.auth.AuthClient;
import com.huawei.hms.maps.internal.HmsUtil;
import com.huawei.hms.maps.internal.ICreator;
import com.huawei.hms.maps.internal.IHuaweiMapDelegate;
import com.huawei.hms.maps.internal.IMapFragmentDelegate;
import com.huawei.hms.maps.internal.IOnMapReadyCallback;
import com.huawei.hms.maps.model.RuntimeRemoteException;
import com.huawei.hms.maps.provider.inhuawei.MapFragmentDelegate;
import com.huawei.hms.maps.utils.LogM;
import com.huawei.hms.maps.utils.MapClientUtil;
import com.huawei.hms.maps.utils.MapsAdvUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public class MapFragment extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f14129b = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final man f14130a;

    static class maa extends com.huawei.hms.maps.maa implements man {
        private final Fragment i;
        private OnDelegateCreatedListener k;
        private Activity l;
        private HuaweiMapOptions m;
        private boolean n;
        private final List j = new ArrayList();
        private boolean o = false;

        maa(Fragment fragment) {
            this.i = fragment;
        }

        protected IMapFragmentDelegate a(ICreator iCreator, Context context, HuaweiMapOptions huaweiMapOptions) {
            try {
                return this.n ? iCreator.newTextureMapFragmentDelegate(ObjectWrapper.wrap(context), huaweiMapOptions) : iCreator.newMapFragmentDelegate(ObjectWrapper.wrap(context), huaweiMapOptions);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        maa(Fragment fragment, boolean z) {
            this.i = fragment;
            this.n = z;
        }

        @Override // com.huawei.hms.maps.maa
        protected void a(ICreator iCreator) {
            LogM.i("MapFragment", "initDelegate: initDelegateFlag = " + this.o);
            if (this.o) {
                return;
            }
            this.o = true;
            try {
                MapClientIdentify mapClientIdentify = new MapClientIdentify();
                Context contextE = com.huawei.hms.maps.internal.mab.e(this.l);
                iCreator.initAppContext(ObjectWrapper.wrap(this.l));
                mapClientIdentify.regestIdentity(this.l, iCreator);
                IMapFragmentDelegate iMapFragmentDelegateA = contextE != null ? a(iCreator, contextE, this.m) : null;
                if (iMapFragmentDelegateA == null) {
                    LogM.w("MapFragment", "createDelegate: createDelegateRemote == null");
                    this.o = false;
                    return;
                }
                iMapFragmentDelegateA.onAttach(ObjectWrapper.wrap(this.l));
                OnDelegateCreatedListener onDelegateCreatedListener = this.k;
                if (onDelegateCreatedListener != null) {
                    onDelegateCreatedListener.onDelegateCreated(new mab(this.i, iMapFragmentDelegateA, this.l));
                }
                Iterator it = this.j.iterator();
                while (it.hasNext()) {
                    ((mab) getDelegate()).getMapAsync((OnMapReadyCallback) it.next());
                }
                this.j.clear();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.maps.man
        public void a(Activity activity) {
            this.l = activity;
        }

        @Override // com.huawei.hms.maps.man
        public final void getMapAsync(OnMapReadyCallback onMapReadyCallback) {
            if (getDelegate() != null) {
                ((mab) getDelegate()).getMapAsync(onMapReadyCallback);
            } else {
                this.j.add(onMapReadyCallback);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper
        public final void createDelegate(OnDelegateCreatedListener onDelegateCreatedListener) {
            if (MapFragment.b()) {
                return;
            }
            this.k = onDelegateCreatedListener;
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
            try {
                d();
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        }

        private void d() {
            if (c()) {
                return;
            }
            mac.a(this.l.getApplicationContext());
            MapsInitializer.initialize(this.l);
            int iIsHmsAvailable = HmsUtil.isHmsAvailable(this.l);
            if (iIsHmsAvailable != 0) {
                LogM.e("MapFragment", "not load map hmsState = " + iIsHmsAvailable);
                return;
            }
            MapClientIdentify.initApiKey(this.l.getApplicationContext());
            if (TextUtils.isEmpty(MapClientIdentify.getAppId())) {
                MapClientIdentify.setAppId(MapClientUtil.getAppId(this.l.getApplicationContext()));
            }
            Bundle arguments = this.i.getArguments();
            if (arguments != null && arguments.containsKey("HuaweiMapOptions")) {
                this.m = (HuaweiMapOptions) arguments.getParcelable("HuaweiMapOptions");
            }
            ICreator iCreatorA = com.huawei.hms.maps.internal.mab.a(this.l);
            if (iCreatorA == null) {
                a((Context) this.l);
            } else {
                a(iCreatorA);
            }
        }

        private boolean c() {
            return this.l == null || this.k == null || getDelegate() != null;
        }
    }

    static class mab extends maf implements man {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Fragment f14131a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private IMapFragmentDelegate f14132b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Activity f14133c;
        private HuaweiMapOptions e;
        private boolean d = false;
        private final List f = new ArrayList();

        public mab(Fragment fragment) {
            this.f14131a = (Fragment) Preconditions.checkNotNull(fragment);
        }

        public mab(Fragment fragment, IMapFragmentDelegate iMapFragmentDelegate, Activity activity) {
            this.f14132b = (IMapFragmentDelegate) Preconditions.checkNotNull(iMapFragmentDelegate);
            this.f14131a = (Fragment) Preconditions.checkNotNull(fragment);
            this.f14133c = activity;
        }

        private void a() {
            MapsInitializer.initialize(null);
            MapClientIdentify.setAppContext(null);
            com.huawei.hms.maps.internal.mab.a();
        }

        @Override // com.huawei.hms.maps.man
        public void a(Activity activity) {
            this.f14133c = activity;
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onStop() {
            try {
                this.f14132b.onStop();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onStart() {
            try {
                this.f14132b.onStart();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onSaveInstanceState(Bundle bundle) {
            try {
                this.f14132b.onSaveInstanceState(map.a(bundle));
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onResume() {
            try {
                this.f14132b.onResume();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onPause() {
            try {
                this.f14132b.onPause();
                Activity activity = this.f14133c;
                if (activity == null || !activity.isFinishing()) {
                    return;
                }
                LogM.d("MapFragment", "clearResource in onPause method");
                a();
                this.d = true;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onLowMemory() {
            try {
                this.f14132b.onLowMemory();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onInflate(Activity activity, Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                LogM.e("MapFragment", "onInflate Bundle is null!");
                return;
            }
            this.e = (HuaweiMapOptions) bundle.getParcelable("HuaweiMapOptions");
            if (MapsAdvUtil.containsMapsBasic()) {
                b();
            }
            try {
                this.f14132b.onInflate(ObjectWrapper.wrap(activity), this.e, map.a(bundle2));
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onDestroyView() {
            try {
                this.f14132b.onDestroyView();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onDestroy() {
            try {
                this.f14132b.onDestroy();
                if (this.d) {
                    return;
                }
                Activity activity = this.f14133c;
                if (activity == null || !activity.isFinishing()) {
                    LogM.d("MapFragment", "onDestroy: execute clearResource in onDestroy method, but activity is  running");
                } else {
                    LogM.d("MapFragment", "clearResource in onDestroy method");
                    a();
                }
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            return mao.a(this.f14133c, this.f14132b, layoutInflater, viewGroup, bundle);
        }

        class maa extends IOnMapReadyCallback.Stub {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ OnMapReadyCallback f14134a;

            @Override // com.huawei.hms.maps.internal.IOnMapReadyCallback
            public void onMapReady(IHuaweiMapDelegate iHuaweiMapDelegate) {
                if (this.f14134a != null) {
                    LogM.i("MapFragment", "onMapReady: mapReadyCallback is not null");
                    if (MapsAdvUtil.containsMapsAdvance()) {
                        LogM.i("MapFragment", "onMapReady: fullsdk ");
                        this.f14134a.onMapReady(mab.this.a((com.huawei.hms.maps.provider.inhuawei.IHuaweiMapDelegate) iHuaweiMapDelegate));
                    } else {
                        this.f14134a.onMapReady(new HuaweiMap(iHuaweiMapDelegate));
                    }
                } else {
                    LogM.w("MapFragment", "onMapReady: mapReadyCallback is null");
                }
                if (mab.this.f14131a.getView() != null) {
                    mab.this.f14131a.getView().setBackground(null);
                }
            }

            maa(OnMapReadyCallback onMapReadyCallback) {
                this.f14134a = onMapReadyCallback;
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onCreate(Bundle bundle) {
            try {
                Bundle bundleA = map.a(bundle);
                Bundle arguments = this.f14131a.getArguments();
                if (arguments != null && arguments.containsKey("HuaweiMapOptions")) {
                    HuaweiMapOptions huaweiMapOptions = (HuaweiMapOptions) arguments.getParcelable("HuaweiMapOptions");
                    this.e = huaweiMapOptions;
                    map.b(bundleA, "HuaweiMapOptions", huaweiMapOptions);
                }
                if (MapsAdvUtil.containsMapsBasic()) {
                    b();
                }
                this.f14132b.onCreate(bundleA);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.maps.man
        public final void getMapAsync(OnMapReadyCallback onMapReadyCallback) {
            IMapFragmentDelegate iMapFragmentDelegate = this.f14132b;
            if (iMapFragmentDelegate == null) {
                this.f.add(onMapReadyCallback);
                return;
            }
            try {
                iMapFragmentDelegate.getMapAsync(new maa(onMapReadyCallback));
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        private void b() {
            MapsInitializer.initialize(this.f14133c);
            MapFragmentDelegate mapFragmentDelegate = new MapFragmentDelegate(this.f14133c, this.e);
            this.f14132b = mapFragmentDelegate;
            try {
                mapFragmentDelegate.onAttach(ObjectWrapper.wrap(this.f14133c));
            } catch (RemoteException unused) {
                LogM.e("MapFragment", "delegate onAttach RemoteException.");
            }
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                getMapAsync((OnMapReadyCallback) it.next());
            }
            this.f.clear();
        }
    }

    public static MapFragment newInstance() {
        return new MapFragment();
    }

    private static void a(boolean z) {
        f14129b = z;
    }

    public static MapFragment newInstance(HuaweiMapOptions huaweiMapOptions) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("HuaweiMapOptions", huaweiMapOptions);
        MapFragment mapFragment = new MapFragment();
        mapFragment.setArguments(bundle);
        return mapFragment;
    }

    @Override // android.app.Fragment
    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }

    @Override // android.app.Fragment
    public void onStop() {
        man manVar = this.f14130a;
        if (manVar != null) {
            manVar.onStop();
        }
        super.onStop();
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        man manVar = this.f14130a;
        if (manVar != null) {
            manVar.onStart();
        }
    }

    @Override // android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        LogM.d("MapFragment", "onSaveInstanceState: ");
        if (bundle != null) {
            bundle.setClassLoader(MapFragment.class.getClassLoader());
            super.onSaveInstanceState(bundle);
            man manVar = this.f14130a;
            if (manVar != null) {
                manVar.onSaveInstanceState(bundle);
            }
        }
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        a(false);
        man manVar = this.f14130a;
        if (manVar != null) {
            manVar.onResume();
        }
    }

    @Override // android.app.Fragment
    public void onPause() {
        LogM.d("MapFragment", "onPause: ");
        man manVar = this.f14130a;
        if (manVar != null) {
            manVar.onPause();
        }
        super.onPause();
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        LogM.d("MapFragment", "onLowMemory: ");
        man manVar = this.f14130a;
        if (manVar != null) {
            manVar.onLowMemory();
        }
        super.onLowMemory();
    }

    @Override // android.app.Fragment
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        LogM.d("MapFragment", "onInflate: ");
        if (this.f14130a == null) {
            super.onInflate(activity, attributeSet, bundle);
            return;
        }
        MapClientIdentify.setMapAuthStartTime(System.currentTimeMillis());
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            HuaweiMapOptions huaweiMapOptionsCreateFromAttributes = HuaweiMapOptions.createFromAttributes(activity, attributeSet);
            super.onInflate(activity, attributeSet, bundle);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("HuaweiMapOptions", huaweiMapOptionsCreateFromAttributes);
            if (getArguments() == null) {
                setArguments(bundle2);
            }
            this.f14130a.a(activity);
            this.f14130a.onInflate(activity, bundle2, bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public final void onExitAmbient() {
        LogM.d("MapFragment", "onExitAmbient: ");
    }

    public final void onEnterAmbient(Bundle bundle) {
        LogM.d("MapFragment", "onEnterAmbient: ");
    }

    @Override // android.app.Fragment
    public void onDestroyView() {
        man manVar = this.f14130a;
        if (manVar != null) {
            manVar.onDestroyView();
        }
        super.onDestroyView();
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        LogM.d("MapFragment", "onDestroy: ");
        man manVar = this.f14130a;
        if (manVar != null) {
            manVar.onDestroy();
        }
        HmsUtil.setRepeatFlag(true);
        super.onDestroy();
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LogM.d("MapFragment", "onCreateView: ");
        if (this.f14130a == null) {
            LogM.e("MapFragment", "MapsInitializer is not initialized.");
            return new View(getActivity());
        }
        if (MapClientIdentify.getMapAuthStartTime() == 0) {
            MapClientIdentify.setMapAuthStartTime(System.currentTimeMillis());
        }
        View viewOnCreateView = this.f14130a.onCreateView(layoutInflater, viewGroup, bundle);
        viewOnCreateView.setBackground(new mam().a(viewOnCreateView));
        viewOnCreateView.setClickable(true);
        return viewOnCreateView;
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        LogM.d("MapFragment", "onCreate: ");
        super.onCreate(bundle);
        if (this.f14130a == null) {
            LogM.e("MapFragment", "MapsInitializer is not initialized.");
            return;
        }
        a(true);
        if (MapsAdvUtil.containsMapsBasic()) {
            mac.a(getActivity());
            AuthClient.getInstance().startAuth(getActivity());
        }
        com.huawei.hms.maps.internal.mab.f(getActivity());
        com.huawei.hms.maps.internal.mab.a(true);
        this.f14130a.onCreate(bundle);
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        LogM.d("MapFragment", "onAttach: ");
        man manVar = this.f14130a;
        if (manVar != null) {
            manVar.a(activity);
        }
        super.onAttach(activity);
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MapFragment.class.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }

    public void getMapAsync(OnMapReadyCallback onMapReadyCallback) {
        LogM.d("MapFragment", "getMapAsync: ");
        man manVar = this.f14130a;
        if (manVar != null) {
            manVar.getMapAsync(onMapReadyCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b() {
        return f14129b;
    }

    public MapFragment() {
        man mabVar;
        if (MapsInitializer.a()) {
            mabVar = MapsAdvUtil.containsMapsBasic() ? new mab(this) : new maa(this);
        } else {
            LogM.e("MapFragment", "MapsInitializer is not initialized.");
            mabVar = null;
        }
        this.f14130a = mabVar;
    }
}
