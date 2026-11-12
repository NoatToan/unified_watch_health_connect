package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.lib.rainbow.ListTile;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class ActivityAvoidSpiteBindingBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final ListTile enableItem;

    @NonNull
    public final TextView tipsTv;

    private ActivityAvoidSpiteBindingBinding(@NonNull LinearLayout rootView, @NonNull ListTile enableItem, @NonNull TextView tipsTv) {
        this.a = rootView;
        this.enableItem = enableItem;
        this.tipsTv = tipsTv;
    }

    @NonNull
    public static ActivityAvoidSpiteBindingBinding bind(@NonNull View rootView) {
        int i = R.id.enable_item;
        ListTile listTile = (ListTile) ViewBindings.findChildViewById(rootView, R.id.enable_item);
        if (listTile != null) {
            i = R.id.tips_tv;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tips_tv);
            if (textView != null) {
                return new ActivityAvoidSpiteBindingBinding((LinearLayout) rootView, listTile, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityAvoidSpiteBindingBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityAvoidSpiteBindingBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_avoid_spite_binding, parent, false);
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
