package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class LayoutAppBottomCommonBtnBinding implements ViewBinding {

    @NonNull
    private final FrameLayout a;

    @NonNull
    public final TextView centerBtn;

    @NonNull
    public final TextView leftBtn;

    @NonNull
    public final TextView rightBtn;

    private LayoutAppBottomCommonBtnBinding(@NonNull FrameLayout rootView, @NonNull TextView centerBtn, @NonNull TextView leftBtn, @NonNull TextView rightBtn) {
        this.a = rootView;
        this.centerBtn = centerBtn;
        this.leftBtn = leftBtn;
        this.rightBtn = rightBtn;
    }

    @NonNull
    public static LayoutAppBottomCommonBtnBinding bind(@NonNull View rootView) {
        int i = R.id.center_btn;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.center_btn);
        if (textView != null) {
            i = R.id.left_btn;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.left_btn);
            if (textView2 != null) {
                i = R.id.right_btn;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.right_btn);
                if (textView3 != null) {
                    return new LayoutAppBottomCommonBtnBinding((FrameLayout) rootView, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static LayoutAppBottomCommonBtnBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static LayoutAppBottomCommonBtnBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.layout_app_bottom_common_btn, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.a;
    }
}
