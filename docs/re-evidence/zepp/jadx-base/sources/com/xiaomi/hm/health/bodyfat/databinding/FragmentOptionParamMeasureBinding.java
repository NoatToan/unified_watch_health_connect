package com.xiaomi.hm.health.bodyfat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.xiaomi.hm.health.bodyfat.R;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentOptionParamMeasureBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final Button btnSkip;

    @NonNull
    public final RelativeLayout rootView;

    private FragmentOptionParamMeasureBinding(@NonNull RelativeLayout relativeLayout, @NonNull Button button, @NonNull RelativeLayout relativeLayout2) {
        this.a = relativeLayout;
        this.btnSkip = button;
        this.rootView = relativeLayout2;
    }

    @NonNull
    public static FragmentOptionParamMeasureBinding bind(@NonNull View view) {
        int i = R.id.btn_skip;
        Button button = (Button) ViewBindings.findChildViewById(view, i);
        if (button == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        }
        RelativeLayout relativeLayout = (RelativeLayout) view;
        return new FragmentOptionParamMeasureBinding(relativeLayout, button, relativeLayout);
    }

    @NonNull
    public static FragmentOptionParamMeasureBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOptionParamMeasureBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_option_param_measure, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.a;
    }
}
