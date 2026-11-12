package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes20.dex */
public final class ActivityThirdBindBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final ListView listview;

    @NonNull
    public final SmartRefreshLayout refreshLayout;

    private ActivityThirdBindBinding(@NonNull RelativeLayout rootView, @NonNull ListView listview, @NonNull SmartRefreshLayout refreshLayout) {
        this.a = rootView;
        this.listview = listview;
        this.refreshLayout = refreshLayout;
    }

    @NonNull
    public static ActivityThirdBindBinding bind(@NonNull View rootView) {
        int i = R.id.listview;
        ListView listView = (ListView) ViewBindings.findChildViewById(rootView, R.id.listview);
        if (listView != null) {
            i = R.id.refresh_layout;
            SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) ViewBindings.findChildViewById(rootView, R.id.refresh_layout);
            if (smartRefreshLayout != null) {
                return new ActivityThirdBindBinding((RelativeLayout) rootView, listView, smartRefreshLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityThirdBindBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityThirdBindBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_third_bind, parent, false);
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
