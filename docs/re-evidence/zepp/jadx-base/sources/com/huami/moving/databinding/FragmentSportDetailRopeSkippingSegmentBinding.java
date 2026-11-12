package com.huami.moving.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.moving.R;

/* JADX INFO: loaded from: classes11.dex */
public final class FragmentSportDetailRopeSkippingSegmentBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final RecyclerView recyclerView;

    private FragmentSportDetailRopeSkippingSegmentBinding(@NonNull RelativeLayout relativeLayout, @NonNull RecyclerView recyclerView) {
        this.a = relativeLayout;
        this.recyclerView = recyclerView;
    }

    @NonNull
    public static FragmentSportDetailRopeSkippingSegmentBinding bind(@NonNull View view) {
        int i = R.id.recycler_view;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            return new FragmentSportDetailRopeSkippingSegmentBinding((RelativeLayout) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentSportDetailRopeSkippingSegmentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentSportDetailRopeSkippingSegmentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_sport_detail_rope_skipping_segment, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.a;
    }
}
