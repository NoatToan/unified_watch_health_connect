package com.huami.xiaopeng.ui.amazfit.databinding;

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
import com.huami.xiaopeng.ui.amazfit.R;

/* JADX INFO: loaded from: classes18.dex */
public final class CarViewItemBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final ImageView carItemArrowRight;

    @NonNull
    public final TextView carItemTitle;

    @NonNull
    public final View cardItemDividerBottom;

    @NonNull
    public final View cardItemDividerTop;

    private CarViewItemBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull View view, @NonNull View view2) {
        this.a = constraintLayout;
        this.carItemArrowRight = imageView;
        this.carItemTitle = textView;
        this.cardItemDividerBottom = view;
        this.cardItemDividerTop = view2;
    }

    @NonNull
    public static CarViewItemBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i = R.id.car_item_arrow_right;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.car_item_title;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.card_item_divider_bottom))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.card_item_divider_top))) != null) {
                return new CarViewItemBinding((ConstraintLayout) view, imageView, textView, viewFindChildViewById, viewFindChildViewById2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static CarViewItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static CarViewItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.car_view_item, viewGroup, false);
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
