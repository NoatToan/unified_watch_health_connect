package com.huami.watchfacesstore.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.huami.watchfacesstore.R;

/* JADX INFO: loaded from: classes17.dex */
public final class WfHomeItemRankingBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final ViewPager2 viewPager;

    private WfHomeItemRankingBinding(@NonNull LinearLayout rootView, @NonNull ViewPager2 viewPager) {
        this.a = rootView;
        this.viewPager = viewPager;
    }

    @NonNull
    public static WfHomeItemRankingBinding bind(@NonNull View rootView) {
        int i = R.id.view_pager;
        ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(rootView, i);
        if (viewPager2 != null) {
            return new WfHomeItemRankingBinding((LinearLayout) rootView, viewPager2);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static WfHomeItemRankingBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static WfHomeItemRankingBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.wf_home_item_ranking, parent, false);
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
