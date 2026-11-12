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
public final class ActivityAnalyseBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final ListTile bodyAnalyseItem;

    @NonNull
    public final ListTile sleepAnalyseItem;

    private ActivityAnalyseBinding(@NonNull LinearLayout rootView, @NonNull ListTile bodyAnalyseItem, @NonNull ListTile sleepAnalyseItem) {
        this.a = rootView;
        this.bodyAnalyseItem = bodyAnalyseItem;
        this.sleepAnalyseItem = sleepAnalyseItem;
    }

    @NonNull
    public static ActivityAnalyseBinding bind(@NonNull View rootView) {
        int i = R.id.body_analyse_item;
        ListTile listTile = (ListTile) ViewBindings.findChildViewById(rootView, R.id.body_analyse_item);
        if (listTile != null) {
            i = R.id.sleep_analyse_item;
            ListTile listTile2 = (ListTile) ViewBindings.findChildViewById(rootView, R.id.sleep_analyse_item);
            if (listTile2 != null) {
                return new ActivityAnalyseBinding((LinearLayout) rootView, listTile, listTile2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityAnalyseBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityAnalyseBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_analyse, parent, false);
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
