package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivitySelectWatchBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final View amazfitContainer;

    @NonNull
    public final TextView cancelTv;

    @NonNull
    public final RecyclerView watchRv;

    private ActivitySelectWatchBinding(@NonNull RelativeLayout relativeLayout, @NonNull View view, @NonNull TextView textView, @NonNull RecyclerView recyclerView) {
        this.a = relativeLayout;
        this.amazfitContainer = view;
        this.cancelTv = textView;
        this.watchRv = recyclerView;
    }

    @NonNull
    public static ActivitySelectWatchBinding bind(@NonNull View view) {
        int i = R.id.amazfit_container;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            i = R.id.cancel_tv;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.watch_rv;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    return new ActivitySelectWatchBinding((RelativeLayout) view, viewFindChildViewById, textView, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivitySelectWatchBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivitySelectWatchBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_select_watch, viewGroup, false);
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
