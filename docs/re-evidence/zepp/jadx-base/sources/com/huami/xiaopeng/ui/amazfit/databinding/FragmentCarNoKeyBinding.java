package com.huami.xiaopeng.ui.amazfit.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.xiaopeng.ui.amazfit.R;
import com.huami.xiaopeng.ui.amazfit.view.CarItemView;

/* JADX INFO: loaded from: classes18.dex */
public final class FragmentCarNoKeyBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final CarItemView carHelp;

    @NonNull
    public final CardView card;

    @NonNull
    public final ImageView cardImageDetail;

    @NonNull
    public final CarItemView createVKey;

    private FragmentCarNoKeyBinding(@NonNull ConstraintLayout constraintLayout, @NonNull CarItemView carItemView, @NonNull CardView cardView, @NonNull ImageView imageView, @NonNull CarItemView carItemView2) {
        this.a = constraintLayout;
        this.carHelp = carItemView;
        this.card = cardView;
        this.cardImageDetail = imageView;
        this.createVKey = carItemView2;
    }

    @NonNull
    public static FragmentCarNoKeyBinding bind(@NonNull View view) {
        int i = R.id.carHelp;
        CarItemView carItemView = (CarItemView) ViewBindings.findChildViewById(view, i);
        if (carItemView != null) {
            i = R.id.card;
            CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
            if (cardView != null) {
                i = R.id.card_image_detail;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.createVKey;
                    CarItemView carItemView2 = (CarItemView) ViewBindings.findChildViewById(view, i);
                    if (carItemView2 != null) {
                        return new FragmentCarNoKeyBinding((ConstraintLayout) view, carItemView, cardView, imageView, carItemView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentCarNoKeyBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentCarNoKeyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_car_no_key, viewGroup, false);
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
