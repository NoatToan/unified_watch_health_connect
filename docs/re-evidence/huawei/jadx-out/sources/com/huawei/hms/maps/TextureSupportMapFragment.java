package com.huawei.hms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.huawei.hms.maps.auth.AuthClient;
import com.huawei.hms.maps.internal.HmsUtil;
import com.huawei.hms.maps.utils.LogM;
import com.huawei.hms.maps.utils.MapsAdvUtil;

/* JADX INFO: loaded from: classes34.dex */
public class TextureSupportMapFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final man f14157a;

    public static TextureSupportMapFragment newInstance() {
        return new TextureSupportMapFragment();
    }

    public static TextureSupportMapFragment newInstance(HuaweiMapOptions huaweiMapOptions) {
        LogM.i("TextureSupportFragment", "TextureSupportMapFragment construct");
        Bundle bundle = new Bundle();
        bundle.putParcelable("HuaweiMapOptions", huaweiMapOptions);
        TextureSupportMapFragment textureSupportMapFragment = new TextureSupportMapFragment();
        textureSupportMapFragment.setArguments(bundle);
        return textureSupportMapFragment;
    }

    @Override // androidx.fragment.app.Fragment
    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        man manVar = this.f14157a;
        if (manVar != null) {
            manVar.onStop();
        }
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        man manVar = this.f14157a;
        if (manVar != null) {
            manVar.onStart();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        LogM.d("TextureSupportFragment", "onSaveInstanceState");
        if (bundle != null) {
            bundle.setClassLoader(SupportMapFragment.class.getClassLoader());
            super.onSaveInstanceState(bundle);
            man manVar = this.f14157a;
            if (manVar != null) {
                manVar.onSaveInstanceState(bundle);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        man manVar = this.f14157a;
        if (manVar != null) {
            manVar.onResume();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        man manVar = this.f14157a;
        if (manVar != null) {
            manVar.onPause();
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        LogM.d("TextureSupportFragment", "onLowMemory");
        man manVar = this.f14157a;
        if (manVar != null) {
            manVar.onLowMemory();
        }
        super.onLowMemory();
    }

    @Override // androidx.fragment.app.Fragment
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        LogM.d("TextureSupportFragment", "onInflate");
        if (this.f14157a == null) {
            LogM.e("TextureSupportFragment", "MapsInitializer is not initialized.");
            super.onInflate(activity, attributeSet, bundle);
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            LogM.d("TextureSupportFragment", "onInflate");
            super.onInflate(activity, attributeSet, bundle);
            HuaweiMapOptions huaweiMapOptionsCreateFromAttributes = HuaweiMapOptions.createFromAttributes(activity, attributeSet);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("HuaweiMapOptions", huaweiMapOptionsCreateFromAttributes);
            if (getArguments() == null) {
                setArguments(bundle2);
            }
            this.f14157a.a(activity);
            this.f14157a.onInflate(activity, bundle2, bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public final void onExitAmbient() {
        LogM.d("TextureSupportFragment", "onExitAmbient: ");
    }

    public final void onEnterAmbient(Bundle bundle) {
        LogM.d("TextureSupportFragment", "onEnterAmbient: ");
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        LogM.d("TextureSupportFragment", "onDestroyView");
        man manVar = this.f14157a;
        if (manVar != null) {
            manVar.onDestroyView();
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        LogM.d("TextureSupportFragment", "onDestroy");
        man manVar = this.f14157a;
        if (manVar != null) {
            manVar.onDestroy();
        }
        HmsUtil.setRepeatFlag(true);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LogM.d("TextureSupportFragment", "onCreateView: ");
        if (this.f14157a == null) {
            LogM.e("TextureSupportFragment", "MapsInitializer is not initialized.");
            return new View(getActivity());
        }
        if (MapClientIdentify.getMapAuthStartTime() == 0) {
            MapClientIdentify.setMapAuthStartTime(System.currentTimeMillis());
        }
        View viewOnCreateView = this.f14157a.onCreateView(layoutInflater, viewGroup, bundle);
        viewOnCreateView.setBackground(new mam().a(viewOnCreateView));
        viewOnCreateView.setClickable(true);
        return viewOnCreateView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f14157a == null) {
            LogM.e("TextureSupportFragment", "MapsInitializer is not initialized.");
            return;
        }
        if (MapsAdvUtil.containsMapsBasic()) {
            mac.a(getActivity());
            AuthClient.getInstance().startAuth(getActivity());
        }
        this.f14157a.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        LogM.d("TextureSupportFragment", "onAttach");
        super.onAttach(activity);
        man manVar = this.f14157a;
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
        LogM.d("TextureSupportFragment", "getMapAsync: ");
        man manVar = this.f14157a;
        if (manVar != null) {
            manVar.getMapAsync(onMapReadyCallback);
        }
    }

    public TextureSupportMapFragment() {
        man mabVar;
        if (MapsInitializer.a()) {
            mabVar = MapsAdvUtil.containsMapsBasic() ? new SupportMapFragment.mab(this, true) : new SupportMapFragment.maa(this, true);
        } else {
            LogM.e("TextureSupportFragment", "MapsInitializer is not initialized.");
            mabVar = null;
        }
        this.f14157a = mabVar;
    }
}
