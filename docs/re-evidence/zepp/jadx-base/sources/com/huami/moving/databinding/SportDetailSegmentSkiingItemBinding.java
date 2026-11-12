package com.huami.moving.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.moving.R;

/* JADX INFO: loaded from: classes11.dex */
public final class SportDetailSegmentSkiingItemBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final AppCompatTextView change;

    @NonNull
    public final AppCompatTextView index;

    @NonNull
    public final AppCompatTextView speed;

    @NonNull
    public final AppCompatTextView time;

    private SportDetailSegmentSkiingItemBinding(@NonNull LinearLayout linearLayout, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2, @NonNull AppCompatTextView appCompatTextView3, @NonNull AppCompatTextView appCompatTextView4) {
        this.a = linearLayout;
        this.change = appCompatTextView;
        this.index = appCompatTextView2;
        this.speed = appCompatTextView3;
        this.time = appCompatTextView4;
    }

    @NonNull
    public static SportDetailSegmentSkiingItemBinding bind(@NonNull View view) {
        int i = R.id.change;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
        if (appCompatTextView != null) {
            i = R.id.index;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
            if (appCompatTextView2 != null) {
                i = R.id.speed;
                AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView3 != null) {
                    i = R.id.time;
                    AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView4 != null) {
                        return new SportDetailSegmentSkiingItemBinding((LinearLayout) view, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static SportDetailSegmentSkiingItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static SportDetailSegmentSkiingItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.sport_detail_segment_skiing_item, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.a;
    }
}
