package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class ItemExerciseHisHeaderSportBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final ImageView ivSport;

    @NonNull
    public final TextView tvSportName;

    private ItemExerciseHisHeaderSportBinding(@NonNull LinearLayout rootView, @NonNull ImageView ivSport, @NonNull TextView tvSportName) {
        this.a = rootView;
        this.ivSport = ivSport;
        this.tvSportName = tvSportName;
    }

    @NonNull
    public static ItemExerciseHisHeaderSportBinding bind(@NonNull View rootView) {
        int i = R.id.iv_sport;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_sport);
        if (imageView != null) {
            i = R.id.tv_sport_name;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_sport_name);
            if (textView != null) {
                return new ItemExerciseHisHeaderSportBinding((LinearLayout) rootView, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemExerciseHisHeaderSportBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemExerciseHisHeaderSportBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_exercise_his_header_sport, parent, false);
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
