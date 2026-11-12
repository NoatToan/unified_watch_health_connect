package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.lib.rainbow.ListTile;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class ActivityAvoidDisturbBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final ListTile enableItem;

    @NonNull
    public final ListTile lightItem;

    @NonNull
    public final ListTile startTime;

    @NonNull
    public final ListTile stopTime;

    private ActivityAvoidDisturbBinding(@NonNull LinearLayout rootView, @NonNull ListTile enableItem, @NonNull ListTile lightItem, @NonNull ListTile startTime, @NonNull ListTile stopTime) {
        this.a = rootView;
        this.enableItem = enableItem;
        this.lightItem = lightItem;
        this.startTime = startTime;
        this.stopTime = stopTime;
    }

    @NonNull
    public static ActivityAvoidDisturbBinding bind(@NonNull View rootView) {
        int i = R.id.enable_item;
        ListTile listTile = (ListTile) ViewBindings.findChildViewById(rootView, R.id.enable_item);
        if (listTile != null) {
            i = R.id.light_item;
            ListTile listTile2 = (ListTile) ViewBindings.findChildViewById(rootView, R.id.light_item);
            if (listTile2 != null) {
                i = R.id.start_time;
                ListTile listTile3 = (ListTile) ViewBindings.findChildViewById(rootView, R.id.start_time);
                if (listTile3 != null) {
                    i = R.id.stop_time;
                    ListTile listTile4 = (ListTile) ViewBindings.findChildViewById(rootView, R.id.stop_time);
                    if (listTile4 != null) {
                        return new ActivityAvoidDisturbBinding((LinearLayout) rootView, listTile, listTile2, listTile3, listTile4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityAvoidDisturbBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityAvoidDisturbBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_avoid_disturb, parent, false);
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
