package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class ViewBaseLaunchBinding implements ViewBinding {

    @NonNull
    private final FrameLayout a;

    @NonNull
    public final ImageView appLogo;

    @NonNull
    public final TextView appName;

    @NonNull
    public final FrameLayout launchContent;

    @NonNull
    public final TextView skipText;

    @NonNull
    public final FrameLayout startUpBottom;

    @NonNull
    public final LinearLayout startUpEnterBtn;

    private ViewBaseLaunchBinding(@NonNull FrameLayout rootView, @NonNull ImageView appLogo, @NonNull TextView appName, @NonNull FrameLayout launchContent, @NonNull TextView skipText, @NonNull FrameLayout startUpBottom, @NonNull LinearLayout startUpEnterBtn) {
        this.a = rootView;
        this.appLogo = appLogo;
        this.appName = appName;
        this.launchContent = launchContent;
        this.skipText = skipText;
        this.startUpBottom = startUpBottom;
        this.startUpEnterBtn = startUpEnterBtn;
    }

    @NonNull
    public static ViewBaseLaunchBinding bind(@NonNull View rootView) {
        int i = R.id.app_logo;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.app_logo);
        if (imageView != null) {
            i = R.id.app_name;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.app_name);
            if (textView != null) {
                i = R.id.launch_content;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.launch_content);
                if (frameLayout != null) {
                    i = R.id.skip_text;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.skip_text);
                    if (textView2 != null) {
                        i = R.id.start_up_bottom;
                        FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.start_up_bottom);
                        if (frameLayout2 != null) {
                            i = R.id.start_up_enter_btn;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.start_up_enter_btn);
                            if (linearLayout != null) {
                                return new ViewBaseLaunchBinding((FrameLayout) rootView, imageView, textView, frameLayout, textView2, frameLayout2, linearLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ViewBaseLaunchBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ViewBaseLaunchBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.view_base_launch, parent, false);
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
