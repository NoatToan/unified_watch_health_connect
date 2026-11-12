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
import androidx.fragment.app.Fragment;
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
import com.huawei.phoneservice.faq.base.constants.TrackConstants$Events;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public class SupportMapFragment extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f14149b = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final man f14150a;

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
            LogM.i("SupportMapFragment", "initDelegate: initDelegateFlag = " + this.o);
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
                    LogM.w("SupportMapFragment", "innerCreateDelegate: supportMapFragmentDelegate is null");
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
            if (SupportMapFragment.b()) {
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
                LogM.e("SupportMapFragment", "not load map hmsState = " + iIsHmsAvailable);
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
        private final Fragment f14151a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private IMapFragmentDelegate f14152b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Activity f14153c;
        private boolean d;
        private boolean e;
        private HuaweiMapOptions f;
        private final List g;

        public mab(Fragment fragment, IMapFragmentDelegate iMapFragmentDelegate, Activity activity) {
            this.d = false;
            this.e = false;
            this.g = new ArrayList();
            this.f14152b = (IMapFragmentDelegate) Preconditions.checkNotNull(iMapFragmentDelegate);
            this.f14151a = (Fragment) Preconditions.checkNotNull(fragment);
            this.f14153c = activity;
        }

        public mab(Fragment fragment, boolean z) {
            this.d = false;
            this.e = false;
            this.g = new ArrayList();
            this.e = z;
            this.f14151a = (Fragment) Preconditions.checkNotNull(fragment);
        }

        private void a() {
            MapsInitializer.initialize(null);
            MapClientIdentify.setAppContext(null);
            com.huawei.hms.maps.internal.mab.a();
        }

        @Override // com.huawei.hms.maps.man
        public void a(Activity activity) {
            this.f14153c = activity;
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onStop() {
            try {
                this.f14152b.onStop();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onStart() {
            try {
                this.f14152b.onStart();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onSaveInstanceState(Bundle bundle) {
            try {
                this.f14152b.onSaveInstanceState(map.a(bundle));
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onResume() {
            try {
                this.f14152b.onResume();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onPause() {
            try {
                this.f14152b.onPause();
                Activity activity = this.f14153c;
                if (activity == null || !activity.isFinishing()) {
                    return;
                }
                LogM.d("SupportMapFragment", "clearResource in onPause method");
                a();
                this.d = true;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onLowMemory() {
            try {
                this.f14152b.onLowMemory();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onInflate(Activity activity, Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                LogM.e("SupportMapFragment", "onInflate Bundle is null!");
                return;
            }
            this.f = (HuaweiMapOptions) bundle.getParcelable("HuaweiMapOptions");
            try {
                if (MapsAdvUtil.containsMapsBasic()) {
                    b();
                }
                this.f14152b.onInflate(ObjectWrapper.wrap(activity), this.f, map.a(bundle2));
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onDestroyView() {
            try {
                this.f14152b.onDestroyView();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onDestroy() {
            try {
                this.f14152b.onDestroy();
                if (this.d) {
                    return;
                }
                Activity activity = this.f14153c;
                if (activity == null || !activity.isFinishing()) {
                    LogM.d("SupportMapFragment", "onDestroy: execute clearResource in onDestroy method, but activity is  running");
                } else {
                    LogM.d("SupportMapFragment", "clearResource in onDestroy method");
                    a();
                }
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            return mao.a(this.f14153c, this.f14152b, layoutInflater, viewGroup, bundle);
        }

        class maa extends IOnMapReadyCallback.Stub {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ OnMapReadyCallback f14154a;

            @Override // com.huawei.hms.maps.internal.IOnMapReadyCallback
            public void onMapReady(IHuaweiMapDelegate iHuaweiMapDelegate) {
                if (this.f14154a != null) {
                    LogM.i("SupportMapFragment", "onMapReady: mapReadyCallback is not null");
                    if (MapsAdvUtil.containsMapsAdvance()) {
                        LogM.i("SupportMapFragment", "onMapReady: fullsdk ");
                        this.f14154a.onMapReady(mab.this.a((com.huawei.hms.maps.provider.inhuawei.IHuaweiMapDelegate) iHuaweiMapDelegate));
                    } else {
                        this.f14154a.onMapReady(new HuaweiMap(iHuaweiMapDelegate));
                    }
                } else {
                    LogM.w("SupportMapFragment", "onMapReady: mapReadyCallback is null");
                }
                if (mab.this.f14151a.getView() != null) {
                    mab.this.f14151a.getView().setBackground(null);
                }
            }

            maa(OnMapReadyCallback onMapReadyCallback) {
                this.f14154a = onMapReadyCallback;
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onCreate(Bundle bundle) {
            try {
                Bundle bundleA = map.a(bundle);
                Bundle arguments = this.f14151a.getArguments();
                if (arguments != null && arguments.containsKey("HuaweiMapOptions")) {
                    HuaweiMapOptions huaweiMapOptions = (HuaweiMapOptions) arguments.getParcelable("HuaweiMapOptions");
                    this.f = huaweiMapOptions;
                    map.b(bundleA, "HuaweiMapOptions", huaweiMapOptions);
                }
                if (MapsAdvUtil.containsMapsBasic()) {
                    b();
                }
                this.f14152b.onCreate(bundleA);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.maps.man
        public final void getMapAsync(OnMapReadyCallback onMapReadyCallback) {
            IMapFragmentDelegate iMapFragmentDelegate = this.f14152b;
            if (iMapFragmentDelegate == null) {
                this.g.add(onMapReadyCallback);
                return;
            }
            try {
                iMapFragmentDelegate.getMapAsync(new maa(onMapReadyCallback));
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        private void b() {
            MapsInitializer.initialize(this.f14153c);
            MapFragmentDelegate mapFragmentDelegate = new MapFragmentDelegate(this.f14153c, this.f, this.e);
            this.f14152b = mapFragmentDelegate;
            try {
                mapFragmentDelegate.onAttach(ObjectWrapper.wrap(this.f14153c));
            } catch (RemoteException unused) {
                LogM.w("SupportMapFragment", TrackConstants$Events.EXCEPTION);
            }
            Iterator it = this.g.iterator();
            while (it.hasNext()) {
                getMapAsync((OnMapReadyCallback) it.next());
            }
            this.g.clear();
        }
    }

    public static SupportMapFragment newInstance() {
        return new SupportMapFragment();
    }

    private static void a(boolean z) {
        f14149b = z;
    }

    public static SupportMapFragment newInstance(HuaweiMapOptions huaweiMapOptions) {
        LogM.i("SupportMapFragment", "SupportMapFragment construct");
        SupportMapFragment supportMapFragment = new SupportMapFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("HuaweiMapOptions", huaweiMapOptions);
        supportMapFragment.setArguments(bundle);
        return supportMapFragment;
    }

    @Override // androidx.fragment.app.Fragment
    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        man manVar = this.f14150a;
        if (manVar != null) {
            manVar.onStop();
        }
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        man manVar = this.f14150a;
        if (manVar != null) {
            manVar.onStart();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        LogM.d("SupportMapFragment", "onSaveInstanceState");
        if (bundle != null) {
            bundle.setClassLoader(SupportMapFragment.class.getClassLoader());
            super.onSaveInstanceState(bundle);
            man manVar = this.f14150a;
            if (manVar != null) {
                manVar.onSaveInstanceState(bundle);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        a(false);
        man manVar = this.f14150a;
        if (manVar != null) {
            manVar.onResume();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        man manVar = this.f14150a;
        if (manVar != null) {
            manVar.onPause();
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        LogM.d("SupportMapFragment", "onLowMemory");
        man manVar = this.f14150a;
        if (manVar != null) {
            manVar.onLowMemory();
        }
        super.onLowMemory();
    }

    @Override // androidx.fragment.app.Fragment
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        LogM.d("SupportMapFragment", "onInflate");
        if (this.f14150a == null) {
            LogM.e("SupportMapFragment", "MapsInitializer is not initialized.");
            super.onInflate(activity, attributeSet, bundle);
            return;
        }
        MapClientIdentify.setMapAuthStartTime(System.currentTimeMillis());
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            LogM.d("SupportMapFragment", "onInflate");
            super.onInflate(activity, attributeSet, bundle);
            HuaweiMapOptions huaweiMapOptionsCreateFromAttributes = HuaweiMapOptions.createFromAttributes(activity, attributeSet);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("HuaweiMapOptions", huaweiMapOptionsCreateFromAttributes);
            if (getArguments() == null) {
                setArguments(bundle2);
            }
            this.f14150a.a(activity);
            this.f14150a.onInflate(activity, bundle2, bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public final void onExitAmbient() {
        LogM.d("SupportMapFragment", "onExitAmbient: ");
    }

    public final void onEnterAmbient(Bundle bundle) {
        LogM.d("SupportMapFragment", "onEnterAmbient: ");
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        LogM.d("SupportMapFragment", "onDestroyView");
        man manVar = this.f14150a;
        if (manVar != null) {
            manVar.onDestroyView();
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        LogM.d("SupportMapFragment", "onDestroy");
        man manVar = this.f14150a;
        if (manVar != null) {
            manVar.onDestroy();
        }
        HmsUtil.setRepeatFlag(true);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LogM.d("SupportMapFragment", "onCreateView: ");
        if (this.f14150a == null) {
            LogM.e("SupportMapFragment", "MapsInitializer is not initialized.");
            return new View(getActivity());
        }
        if (MapClientIdentify.getMapAuthStartTime() == 0) {
            MapClientIdentify.setMapAuthStartTime(System.currentTimeMillis());
        }
        View viewOnCreateView = this.f14150a.onCreateView(layoutInflater, viewGroup, bundle);
        viewOnCreateView.setBackground(new mam().a(viewOnCreateView));
        viewOnCreateView.setClickable(true);
        return viewOnCreateView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f14150a == null) {
            LogM.e("SupportMapFragment", "MapsInitializer is not initialized.");
            return;
        }
        a(true);
        com.huawei.hms.maps.internal.mab.f(getActivity());
        com.huawei.hms.maps.internal.mab.a(true);
        if (MapsAdvUtil.containsMapsBasic()) {
            mac.a(getActivity());
            AuthClient.getInstance().startAuth(getActivity());
        }
        this.f14150a.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        LogM.d("SupportMapFragment", "onAttach");
        super.onAttach(activity);
        man manVar = this.f14150a;
        if (manVar != null) {
            manVar.a(activity);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(SupportMapFragment.class.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }

    public void getMapAsync(OnMapReadyCallback onMapReadyCallback) {
        LogM.d("SupportMapFragment", "getMapAsync: ");
        man manVar = this.f14150a;
        if (manVar != null) {
            manVar.getMapAsync(onMapReadyCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b() {
        return f14149b;
    }

    public SupportMapFragment() {
        man mabVar;
        if (MapsInitializer.a()) {
            mabVar = MapsAdvUtil.containsMapsBasic() ? new mab(this, false) : new maa(this);
        } else {
            LogM.e("SupportMapFragment", "MapsInitializer is not initialized.");
            mabVar = null;
        }
        this.f14150a = mabVar;
    }
}
