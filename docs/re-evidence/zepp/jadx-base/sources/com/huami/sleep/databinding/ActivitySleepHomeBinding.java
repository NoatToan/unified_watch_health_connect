package com.huami.sleep.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.sleep.R;

/* JADX INFO: loaded from: classes13.dex */
public final class ActivitySleepHomeBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final TextView cardStatusIntroduce;

    @NonNull
    public final TextView cardStatusTitle;

    @NonNull
    public final FrameLayout container;

    @NonNull
    public final FrameLayout sleepAdContainer;

    private ActivitySleepHomeBinding(@NonNull LinearLayout rootView, @NonNull TextView cardStatusIntroduce, @NonNull TextView cardStatusTitle, @NonNull FrameLayout container, @NonNull FrameLayout sleepAdContainer) {
        this.a = rootView;
        this.cardStatusIntroduce = cardStatusIntroduce;
        this.cardStatusTitle = cardStatusTitle;
        this.container = container;
        this.sleepAdContainer = sleepAdContainer;
    }

    @NonNull
    public static ActivitySleepHomeBinding bind(@NonNull View rootView) {
        int i = R.id.cardStatusIntroduce;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
        if (textView != null) {
            i = R.id.cardStatusTitle;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
            if (textView2 != null) {
                i = R.id.container;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, i);
                if (frameLayout != null) {
                    i = R.id.sleepAdContainer;
                    FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(rootView, i);
                    if (frameLayout2 != null) {
                        return new ActivitySleepHomeBinding((LinearLayout) rootView, textView, textView2, frameLayout, frameLayout2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivitySleepHomeBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivitySleepHomeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_sleep_home, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.a;
    }
}
