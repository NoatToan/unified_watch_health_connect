package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class ItemAllDataCategoryBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final RecyclerView rvItems;

    @NonNull
    public final TextView tvGroupName;

    private ItemAllDataCategoryBinding(@NonNull LinearLayout rootView, @NonNull RecyclerView rvItems, @NonNull TextView tvGroupName) {
        this.a = rootView;
        this.rvItems = rvItems;
        this.tvGroupName = tvGroupName;
    }

    @NonNull
    public static ItemAllDataCategoryBinding bind(@NonNull View rootView) {
        int i = R.id.rv_items;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rv_items);
        if (recyclerView != null) {
            i = R.id.tv_group_name;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_group_name);
            if (textView != null) {
                return new ItemAllDataCategoryBinding((LinearLayout) rootView, recyclerView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemAllDataCategoryBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemAllDataCategoryBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_all_data_category, parent, false);
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
