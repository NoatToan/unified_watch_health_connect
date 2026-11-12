package com.huami.moving.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.moving.R;

/* JADX INFO: loaded from: classes11.dex */
public final class ActivityRunningGpsMainBinding implements ViewBinding {

    @NonNull
    private final FrameLayout a;

    @NonNull
    public final RelativeLayout fragmentContainer;

    @NonNull
    public final FrameLayout gpsMainRoot;

    @NonNull
    public final View overlayer;

    private ActivityRunningGpsMainBinding(@NonNull FrameLayout frameLayout, @NonNull RelativeLayout relativeLayout, @NonNull FrameLayout frameLayout2, @NonNull View view) {
        this.a = frameLayout;
        this.fragmentContainer = relativeLayout;
        this.gpsMainRoot = frameLayout2;
        this.overlayer = view;
    }

    @NonNull
    public static ActivityRunningGpsMainBinding bind(@NonNull View view) {
        int i = R.id.fragment_container;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
        if (relativeLayout != null) {
            FrameLayout frameLayout = (FrameLayout) view;
            int i2 = R.id.overlayer;
            View viewFindChildViewById = ViewBindings.findChildViewById(view, i2);
            if (viewFindChildViewById != null) {
                return new ActivityRunningGpsMainBinding(frameLayout, relativeLayout, frameLayout, viewFindChildViewById);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityRunningGpsMainBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityRunningGpsMainBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_running_gps_main, viewGroup, false);
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
