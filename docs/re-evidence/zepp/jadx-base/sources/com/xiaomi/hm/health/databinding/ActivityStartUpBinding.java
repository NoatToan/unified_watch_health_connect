package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.huami.watch.hmwatchmanager.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes20.dex */
public final class ActivityStartUpBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final RelativeLayout fragmentContainer;

    private ActivityStartUpBinding(@NonNull RelativeLayout rootView, @NonNull RelativeLayout fragmentContainer) {
        this.a = rootView;
        this.fragmentContainer = fragmentContainer;
    }

    @NonNull
    public static ActivityStartUpBinding bind(@NonNull View rootView) {
        Objects.requireNonNull(rootView, "rootView");
        RelativeLayout relativeLayout = (RelativeLayout) rootView;
        return new ActivityStartUpBinding(relativeLayout, relativeLayout);
    }

    @NonNull
    public static ActivityStartUpBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityStartUpBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_start_up, parent, false);
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
