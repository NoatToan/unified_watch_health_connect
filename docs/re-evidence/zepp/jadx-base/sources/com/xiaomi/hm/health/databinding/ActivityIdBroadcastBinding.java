package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.lib.rainbow.ListTile;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class ActivityIdBroadcastBinding implements ViewBinding {

    @NonNull
    private final FrameLayout a;

    @NonNull
    public final ListTile enableBroadcast;

    private ActivityIdBroadcastBinding(@NonNull FrameLayout rootView, @NonNull ListTile enableBroadcast) {
        this.a = rootView;
        this.enableBroadcast = enableBroadcast;
    }

    @NonNull
    public static ActivityIdBroadcastBinding bind(@NonNull View rootView) {
        ListTile listTile = (ListTile) ViewBindings.findChildViewById(rootView, R.id.enable_broadcast);
        if (listTile != null) {
            return new ActivityIdBroadcastBinding((FrameLayout) rootView, listTile);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.enable_broadcast)));
    }

    @NonNull
    public static ActivityIdBroadcastBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityIdBroadcastBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_id_broadcast, parent, false);
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
