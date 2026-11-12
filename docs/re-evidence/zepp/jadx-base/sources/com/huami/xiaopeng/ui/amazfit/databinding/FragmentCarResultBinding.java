package com.huami.xiaopeng.ui.amazfit.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.xiaopeng.ui.amazfit.R;

/* JADX INFO: loaded from: classes18.dex */
public final class FragmentCarResultBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final Button carResultBt;

    @NonNull
    public final TextView carResultError;

    @NonNull
    public final TextView carResultErrorCode;

    @NonNull
    public final ImageView carResultIv;

    @NonNull
    public final TextView carResultReminds;

    private FragmentCarResultBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Button button, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ImageView imageView, @NonNull TextView textView3) {
        this.a = constraintLayout;
        this.carResultBt = button;
        this.carResultError = textView;
        this.carResultErrorCode = textView2;
        this.carResultIv = imageView;
        this.carResultReminds = textView3;
    }

    @NonNull
    public static FragmentCarResultBinding bind(@NonNull View view) {
        int i = R.id.car_result_bt;
        Button button = (Button) ViewBindings.findChildViewById(view, i);
        if (button != null) {
            i = R.id.car_result_error;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.car_result_error_code;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = R.id.car_result_iv;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = R.id.car_result_reminds;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView3 != null) {
                            return new FragmentCarResultBinding((ConstraintLayout) view, button, textView, textView2, imageView, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentCarResultBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentCarResultBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_car_result, viewGroup, false);
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
