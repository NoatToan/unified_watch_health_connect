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
public final class ActivityAddNotifyAppBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final RelativeLayout container;

    private ActivityAddNotifyAppBinding(@NonNull RelativeLayout rootView, @NonNull RelativeLayout container) {
        this.a = rootView;
        this.container = container;
    }

    @NonNull
    public static ActivityAddNotifyAppBinding bind(@NonNull View rootView) {
        Objects.requireNonNull(rootView, "rootView");
        RelativeLayout relativeLayout = (RelativeLayout) rootView;
        return new ActivityAddNotifyAppBinding(relativeLayout, relativeLayout);
    }

    @NonNull
    public static ActivityAddNotifyAppBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityAddNotifyAppBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_add_notify_app, parent, false);
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
