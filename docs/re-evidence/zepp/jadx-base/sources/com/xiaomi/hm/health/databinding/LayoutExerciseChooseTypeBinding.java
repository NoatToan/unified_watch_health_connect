package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class LayoutExerciseChooseTypeBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final GridView sportTypeGridView;

    @NonNull
    public final ImageView typeCloseButton;

    @NonNull
    public final TextView typeTitle;

    @NonNull
    public final RelativeLayout typeTitleLayout;

    private LayoutExerciseChooseTypeBinding(@NonNull RelativeLayout rootView, @NonNull GridView sportTypeGridView, @NonNull ImageView typeCloseButton, @NonNull TextView typeTitle, @NonNull RelativeLayout typeTitleLayout) {
        this.a = rootView;
        this.sportTypeGridView = sportTypeGridView;
        this.typeCloseButton = typeCloseButton;
        this.typeTitle = typeTitle;
        this.typeTitleLayout = typeTitleLayout;
    }

    @NonNull
    public static LayoutExerciseChooseTypeBinding bind(@NonNull View rootView) {
        int i = R.id.sport_type_grid_view;
        GridView gridView = (GridView) ViewBindings.findChildViewById(rootView, R.id.sport_type_grid_view);
        if (gridView != null) {
            i = R.id.type_close_button;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.type_close_button);
            if (imageView != null) {
                i = R.id.type_title;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.type_title);
                if (textView != null) {
                    i = R.id.type_title_layout;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.type_title_layout);
                    if (relativeLayout != null) {
                        return new LayoutExerciseChooseTypeBinding((RelativeLayout) rootView, gridView, imageView, textView, relativeLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static LayoutExerciseChooseTypeBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static LayoutExerciseChooseTypeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.layout_exercise_choose_type, parent, false);
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
