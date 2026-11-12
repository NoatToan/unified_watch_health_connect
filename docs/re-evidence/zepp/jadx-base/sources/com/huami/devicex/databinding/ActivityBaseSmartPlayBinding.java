package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityBaseSmartPlayBinding implements ViewBinding {

    @NonNull
    private final ScrollView a;

    @NonNull
    public final RelativeLayout backgroundLayout;

    @NonNull
    public final FrameLayout container;

    @NonNull
    public final LinearLayout smartContent;

    @NonNull
    public final ImageView smartIcon;

    @NonNull
    public final FrameLayout smartLogo;

    @NonNull
    public final TextView smartTips;

    private ActivityBaseSmartPlayBinding(@NonNull ScrollView scrollView, @NonNull RelativeLayout relativeLayout, @NonNull FrameLayout frameLayout, @NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull FrameLayout frameLayout2, @NonNull TextView textView) {
        this.a = scrollView;
        this.backgroundLayout = relativeLayout;
        this.container = frameLayout;
        this.smartContent = linearLayout;
        this.smartIcon = imageView;
        this.smartLogo = frameLayout2;
        this.smartTips = textView;
    }

    @NonNull
    public static ActivityBaseSmartPlayBinding bind(@NonNull View view) {
        int i = R.id.background_layout;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
        if (relativeLayout != null) {
            i = R.id.container;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = R.id.smart_content;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = R.id.smart_icon;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = R.id.smart_logo;
                        FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                        if (frameLayout2 != null) {
                            i = R.id.smart_tips;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                return new ActivityBaseSmartPlayBinding((ScrollView) view, relativeLayout, frameLayout, linearLayout, imageView, frameLayout2, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityBaseSmartPlayBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityBaseSmartPlayBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_base_smart_play, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ScrollView getRoot() {
        return this.a;
    }
}
