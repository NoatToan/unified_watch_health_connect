package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class FragmentLaunchAdBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final LayoutStartupDefaultBinding defaultView;

    @NonNull
    public final ViewStub viewStubAd;

    private FragmentLaunchAdBinding(@NonNull RelativeLayout rootView, @NonNull LayoutStartupDefaultBinding defaultView, @NonNull ViewStub viewStubAd) {
        this.a = rootView;
        this.defaultView = defaultView;
        this.viewStubAd = viewStubAd;
    }

    @NonNull
    public static FragmentLaunchAdBinding bind(@NonNull View rootView) {
        int i = R.id.default_view;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.default_view);
        if (viewFindChildViewById != null) {
            LayoutStartupDefaultBinding layoutStartupDefaultBindingBind = LayoutStartupDefaultBinding.bind(viewFindChildViewById);
            ViewStub viewStub = (ViewStub) ViewBindings.findChildViewById(rootView, R.id.view_stub_ad);
            if (viewStub != null) {
                return new FragmentLaunchAdBinding((RelativeLayout) rootView, layoutStartupDefaultBindingBind, viewStub);
            }
            i = R.id.view_stub_ad;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentLaunchAdBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentLaunchAdBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_launch_ad, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.a;
    }
}
