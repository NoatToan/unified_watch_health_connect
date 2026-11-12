package com.huami.moving.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.moving.R;

/* JADX INFO: loaded from: classes11.dex */
public final class ItemStrengthEditValueBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final ImageView ivRemove;

    @NonNull
    public final TextView tvCountValue;

    @NonNull
    public final TextView tvNameValue;

    @NonNull
    public final TextView tvWeightValue;

    @NonNull
    public final View vLineCount;

    @NonNull
    public final View vLineName;

    @NonNull
    public final View vLineWeight;

    private ItemStrengthEditValueBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull View view, @NonNull View view2, @NonNull View view3) {
        this.a = constraintLayout;
        this.ivRemove = imageView;
        this.tvCountValue = textView;
        this.tvNameValue = textView2;
        this.tvWeightValue = textView3;
        this.vLineCount = view;
        this.vLineName = view2;
        this.vLineWeight = view3;
    }

    @NonNull
    public static ItemStrengthEditValueBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        View viewFindChildViewById3;
        int i = R.id.iv_remove;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.tv_count_value;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.tv_name_value;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = R.id.tv_weight_value;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView3 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.v_line_count))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.v_line_name))) != null && (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i = R.id.v_line_weight))) != null) {
                        return new ItemStrengthEditValueBinding((ConstraintLayout) view, imageView, textView, textView2, textView3, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemStrengthEditValueBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemStrengthEditValueBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_strength_edit_value, viewGroup, false);
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
