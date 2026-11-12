package com.huami.xiaopeng.ui.amazfit.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.android.design.dialog.loading.LoadingView;
import com.huami.xiaopeng.ui.amazfit.R;

/* JADX INFO: loaded from: classes18.dex */
public final class FragmentCarCheckBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final LoadingView carCheckProgressBar;

    @NonNull
    public final TextView carCheckTv;

    @NonNull
    public final Button carRetryBt;

    @NonNull
    public final ConstraintLayout cardDetail;

    private FragmentCarCheckBinding(@NonNull ConstraintLayout constraintLayout, @NonNull LoadingView loadingView, @NonNull TextView textView, @NonNull Button button, @NonNull ConstraintLayout constraintLayout2) {
        this.a = constraintLayout;
        this.carCheckProgressBar = loadingView;
        this.carCheckTv = textView;
        this.carRetryBt = button;
        this.cardDetail = constraintLayout2;
    }

    @NonNull
    public static FragmentCarCheckBinding bind(@NonNull View view) {
        int i = R.id.car_check_progress_bar;
        LoadingView loadingView = (LoadingView) ViewBindings.findChildViewById(view, i);
        if (loadingView != null) {
            i = R.id.car_check_tv;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.car_retry_bt;
                Button button = (Button) ViewBindings.findChildViewById(view, i);
                if (button != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    return new FragmentCarCheckBinding(constraintLayout, loadingView, textView, button, constraintLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentCarCheckBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentCarCheckBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_car_check, viewGroup, false);
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
