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
public final class ActivitySportHrBroadcastBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final ListTile enableItem;

    private ActivitySportHrBroadcastBinding(@NonNull LinearLayout rootView, @NonNull ListTile enableItem) {
        this.a = rootView;
        this.enableItem = enableItem;
    }

    @NonNull
    public static ActivitySportHrBroadcastBinding bind(@NonNull View rootView) {
        ListTile listTile = (ListTile) ViewBindings.findChildViewById(rootView, R.id.enable_item);
        if (listTile != null) {
            return new ActivitySportHrBroadcastBinding((LinearLayout) rootView, listTile);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.enable_item)));
    }

    @NonNull
    public static ActivitySportHrBroadcastBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivitySportHrBroadcastBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_sport_hr_broadcast, parent, false);
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
