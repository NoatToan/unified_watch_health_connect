package com.huami.third.wechat.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.third.wechat.ui.R;

/* JADX INFO: loaded from: classes14.dex */
public final class ActivityBindWechatBinding implements ViewBinding {

    @NonNull
    private final FrameLayout a;

    @NonNull
    public final FragmentContainerView fragmentContainer;

    private ActivityBindWechatBinding(@NonNull FrameLayout frameLayout, @NonNull FragmentContainerView fragmentContainerView) {
        this.a = frameLayout;
        this.fragmentContainer = fragmentContainerView;
    }

    @NonNull
    public static ActivityBindWechatBinding bind(@NonNull View view) {
        int i = R.id.fragment_container;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
        if (fragmentContainerView != null) {
            return new ActivityBindWechatBinding((FrameLayout) view, fragmentContainerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityBindWechatBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityBindWechatBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_bind_wechat, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.a;
    }
}
