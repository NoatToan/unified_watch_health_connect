package com.huami.healthlabel.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.healthlabel.R;
import com.huami.healthlabel.ui.custom.CircleView;

/* JADX INFO: loaded from: classes9.dex */
public final class InputSelectViewBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final CircleView inputItemBlue;

    @NonNull
    public final CircleView inputItemGreen;

    @NonNull
    public final CircleView inputItemOrange;

    @NonNull
    public final CircleView inputItemPurple;

    @NonNull
    public final CircleView inputItemRed;

    private InputSelectViewBinding(@NonNull ConstraintLayout rootView, @NonNull CircleView inputItemBlue, @NonNull CircleView inputItemGreen, @NonNull CircleView inputItemOrange, @NonNull CircleView inputItemPurple, @NonNull CircleView inputItemRed) {
        this.a = rootView;
        this.inputItemBlue = inputItemBlue;
        this.inputItemGreen = inputItemGreen;
        this.inputItemOrange = inputItemOrange;
        this.inputItemPurple = inputItemPurple;
        this.inputItemRed = inputItemRed;
    }

    @NonNull
    public static InputSelectViewBinding bind(@NonNull View rootView) {
        int i = R.id.input_item_blue;
        CircleView circleView = (CircleView) ViewBindings.findChildViewById(rootView, i);
        if (circleView != null) {
            i = R.id.input_item_green;
            CircleView circleView2 = (CircleView) ViewBindings.findChildViewById(rootView, i);
            if (circleView2 != null) {
                i = R.id.input_item_orange;
                CircleView circleView3 = (CircleView) ViewBindings.findChildViewById(rootView, i);
                if (circleView3 != null) {
                    i = R.id.input_item_purple;
                    CircleView circleView4 = (CircleView) ViewBindings.findChildViewById(rootView, i);
                    if (circleView4 != null) {
                        i = R.id.input_item_red;
                        CircleView circleView5 = (CircleView) ViewBindings.findChildViewById(rootView, i);
                        if (circleView5 != null) {
                            return new InputSelectViewBinding((ConstraintLayout) rootView, circleView, circleView2, circleView3, circleView4, circleView5);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static InputSelectViewBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static InputSelectViewBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.input_select_view, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.a;
    }
}
