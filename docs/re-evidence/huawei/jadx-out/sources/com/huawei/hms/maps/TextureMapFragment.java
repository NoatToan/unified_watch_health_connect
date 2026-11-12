package com.huawei.hms.maps;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.hms.maps.auth.AuthClient;
import com.huawei.hms.maps.internal.HmsUtil;
import com.huawei.hms.maps.utils.LogM;
import com.huawei.hms.maps.utils.MapsAdvUtil;

/* JADX INFO: loaded from: classes34.dex */
public class TextureMapFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final man f14156a;

    public static TextureMapFragment newInstance() {
        return new TextureMapFragment();
    }

    public static TextureMapFragment newInstance(HuaweiMapOptions huaweiMapOptions) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("HuaweiMapOptions", huaweiMapOptions);
        TextureMapFragment textureMapFragment = new TextureMapFragment();
        textureMapFragment.setArguments(bundle);
        return textureMapFragment;
    }

    @Override // android.app.Fragment
    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }

    @Override // android.app.Fragment
    public void onStop() {
        man manVar = this.f14156a;
        if (manVar != null) {
            manVar.onStop();
        }
        super.onStop();
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        man manVar = this.f14156a;
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
            man manVar = this.f14156a;
            if (manVar != null) {
                manVar.onSaveInstanceState(bundle);
            }
        }
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        man manVar = this.f14156a;
        if (manVar != null) {
            manVar.onResume();
        }
    }

    @Override // android.app.Fragment
    public void onPause() {
        LogM.d("MapFragment", "onPause: ");
        man manVar = this.f14156a;
        if (manVar != null) {
            manVar.onPause();
        }
        super.onPause();
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        LogM.d("MapFragment", "onLowMemory: ");
        man manVar = this.f14156a;
        if (manVar != null) {
            manVar.onLowMemory();
        }
        super.onLowMemory();
    }

    @Override // android.app.Fragment
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        LogM.d("MapFragment", "onInflate: ");
        if (this.f14156a == null) {
            LogM.e("MapFragment", "MapsInitializer is not initialized.");
            super.onInflate(activity, attributeSet, bundle);
            return;
        }
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
            this.f14156a.a(activity);
            this.f14156a.onInflate(activity, bundle2, bundle);
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
        man manVar = this.f14156a;
        if (manVar != null) {
            manVar.onDestroyView();
        }
        super.onDestroyView();
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        LogM.d("MapFragment", "onDestroy: ");
        man manVar = this.f14156a;
        if (manVar != null) {
            manVar.onDestroy();
        }
        HmsUtil.setRepeatFlag(true);
        super.onDestroy();
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LogM.d("MapFragment", "onCreateView: ");
        if (this.f14156a == null) {
            LogM.e("MapFragment", "MapsInitializer is not initialized.");
            return new View(getActivity());
        }
        if (MapClientIdentify.getMapAuthStartTime() == 0) {
            MapClientIdentify.setMapAuthStartTime(System.currentTimeMillis());
        }
        View viewOnCreateView = this.f14156a.onCreateView(layoutInflater, viewGroup, bundle);
        viewOnCreateView.setBackground(new mam().a(viewOnCreateView));
        viewOnCreateView.setClickable(true);
        return viewOnCreateView;
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        LogM.d("MapFragment", "onCreate: ");
        super.onCreate(bundle);
        if (this.f14156a == null) {
            LogM.e("MapFragment", "MapsInitializer is not initialized.");
            return;
        }
        if (MapsAdvUtil.containsMapsBasic()) {
            mac.a(getActivity());
            AuthClient.getInstance().startAuth(getActivity());
        }
        this.f14156a.onCreate(bundle);
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        LogM.d("MapFragment", "onAttach: ");
        super.onAttach(activity);
        man manVar = this.f14156a;
        if (manVar != null) {
            manVar.a(activity);
        }
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
        man manVar = this.f14156a;
        if (manVar != null) {
            manVar.getMapAsync(onMapReadyCallback);
        }
    }

    public TextureMapFragment() {
        man mabVar;
        if (MapsInitializer.a()) {
            mabVar = MapsAdvUtil.containsMapsBasic() ? new MapFragment.mab(this) : new MapFragment.maa(this, true);
        } else {
            LogM.e("MapFragment", "MapsInitializer is not initialized.");
            mabVar = null;
        }
        this.f14156a = mabVar;
    }
}
