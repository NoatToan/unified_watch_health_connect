package com.huami.xiaopeng.ui.amazfit.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.xiaopeng.ui.amazfit.R;
import com.huami.xiaopeng.ui.amazfit.view.CarItemView;

/* JADX INFO: loaded from: classes18.dex */
public final class FragmentCarDetialBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final TextView carStatus;

    @NonNull
    public final CardView card;

    @NonNull
    public final ConstraintLayout cardDetail;

    @NonNull
    public final ImageView cardImageDetail;

    @NonNull
    public final CarItemView keyAdd;

    @NonNull
    public final CarItemView keyDefault;

    @NonNull
    public final CarItemView keyDelete;

    @NonNull
    public final CarItemView keyHelp;

    @NonNull
    public final CarItemView openedKeys;

    private FragmentCarDetialBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull CardView cardView, @NonNull ConstraintLayout constraintLayout2, @NonNull ImageView imageView, @NonNull CarItemView carItemView, @NonNull CarItemView carItemView2, @NonNull CarItemView carItemView3, @NonNull CarItemView carItemView4, @NonNull CarItemView carItemView5) {
        this.a = constraintLayout;
        this.carStatus = textView;
        this.card = cardView;
        this.cardDetail = constraintLayout2;
        this.cardImageDetail = imageView;
        this.keyAdd = carItemView;
        this.keyDefault = carItemView2;
        this.keyDelete = carItemView3;
        this.keyHelp = carItemView4;
        this.openedKeys = carItemView5;
    }

    @NonNull
    public static FragmentCarDetialBinding bind(@NonNull View view) {
        int i = R.id.carStatus;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.card;
            CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
            if (cardView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i = R.id.card_image_detail;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.keyAdd;
                    CarItemView carItemView = (CarItemView) ViewBindings.findChildViewById(view, i);
                    if (carItemView != null) {
                        i = R.id.keyDefault;
                        CarItemView carItemView2 = (CarItemView) ViewBindings.findChildViewById(view, i);
                        if (carItemView2 != null) {
                            i = R.id.keyDelete;
                            CarItemView carItemView3 = (CarItemView) ViewBindings.findChildViewById(view, i);
                            if (carItemView3 != null) {
                                i = R.id.keyHelp;
                                CarItemView carItemView4 = (CarItemView) ViewBindings.findChildViewById(view, i);
                                if (carItemView4 != null) {
                                    i = R.id.openedKeys;
                                    CarItemView carItemView5 = (CarItemView) ViewBindings.findChildViewById(view, i);
                                    if (carItemView5 != null) {
                                        return new FragmentCarDetialBinding(constraintLayout, textView, cardView, constraintLayout, imageView, carItemView, carItemView2, carItemView3, carItemView4, carItemView5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentCarDetialBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentCarDetialBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_car_detial, viewGroup, false);
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
