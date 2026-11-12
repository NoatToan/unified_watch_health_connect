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
public final class ItemSportEndOverViewBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final TypefaceTextView overViewItemContent;

    @NonNull
    public final TypefaceTextView overViewItemDesc;

    private ItemSportEndOverViewBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TypefaceTextView typefaceTextView, @NonNull TypefaceTextView typefaceTextView2) {
        this.a = constraintLayout;
        this.overViewItemContent = typefaceTextView;
        this.overViewItemDesc = typefaceTextView2;
    }

    @NonNull
    public static ItemSportEndOverViewBinding bind(@NonNull View view) {
        int i = R.id.over_view_item_content;
        TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
        if (typefaceTextView != null) {
            i = R.id.over_view_item_desc;
            TypefaceTextView typefaceTextView2 = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
            if (typefaceTextView2 != null) {
                return new ItemSportEndOverViewBinding((ConstraintLayout) view, typefaceTextView, typefaceTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemSportEndOverViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemSportEndOverViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_sport_end_over_view, viewGroup, false);
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
