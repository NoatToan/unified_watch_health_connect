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
public final class LayoutExerciseChooseTypeItemBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final ImageView sportTypeImg;

    @NonNull
    public final TextView sportTypeTxt;

    private LayoutExerciseChooseTypeItemBinding(@NonNull LinearLayout rootView, @NonNull ImageView sportTypeImg, @NonNull TextView sportTypeTxt) {
        this.a = rootView;
        this.sportTypeImg = sportTypeImg;
        this.sportTypeTxt = sportTypeTxt;
    }

    @NonNull
    public static LayoutExerciseChooseTypeItemBinding bind(@NonNull View rootView) {
        int i = R.id.sport_type_img;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.sport_type_img);
        if (imageView != null) {
            i = R.id.sport_type_txt;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.sport_type_txt);
            if (textView != null) {
                return new LayoutExerciseChooseTypeItemBinding((LinearLayout) rootView, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static LayoutExerciseChooseTypeItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static LayoutExerciseChooseTypeItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.layout_exercise_choose_type_item, parent, false);
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
