package com.huami.moving.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.moving.R;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes11.dex */
public final class ItemTargetSportEndOverViewBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final TypefaceTextView overViewItemContentTarget;

    @NonNull
    public final TypefaceTextView overViewItemDescTarget;

    private ItemTargetSportEndOverViewBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TypefaceTextView typefaceTextView, @NonNull TypefaceTextView typefaceTextView2) {
        this.a = constraintLayout;
        this.overViewItemContentTarget = typefaceTextView;
        this.overViewItemDescTarget = typefaceTextView2;
    }

    @NonNull
    public static ItemTargetSportEndOverViewBinding bind(@NonNull View view) {
        int i = R.id.over_view_item_content_target;
        TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
        if (typefaceTextView != null) {
            i = R.id.over_view_item_desc_target;
            TypefaceTextView typefaceTextView2 = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
            if (typefaceTextView2 != null) {
                return new ItemTargetSportEndOverViewBinding((ConstraintLayout) view, typefaceTextView, typefaceTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemTargetSportEndOverViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemTargetSportEndOverViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_target_sport_end_over_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.a;
    }
}
