package com.huami.watchfacesstore.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import com.huami.watchfacesstore.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes17.dex */
public final class WfHomeNpsBinding implements ViewBinding {

    @NonNull
    private final FragmentContainerView a;

    @NonNull
    public final FragmentContainerView nps;

    private WfHomeNpsBinding(@NonNull FragmentContainerView rootView, @NonNull FragmentContainerView nps) {
        this.a = rootView;
        this.nps = nps;
    }

    @NonNull
    public static WfHomeNpsBinding bind(@NonNull View rootView) {
        Objects.requireNonNull(rootView, "rootView");
        FragmentContainerView fragmentContainerView = (FragmentContainerView) rootView;
        return new WfHomeNpsBinding(fragmentContainerView, fragmentContainerView);
    }

    @NonNull
    public static WfHomeNpsBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static WfHomeNpsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.wf_home_nps, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FragmentContainerView getRoot() {
        return this.a;
    }
}
