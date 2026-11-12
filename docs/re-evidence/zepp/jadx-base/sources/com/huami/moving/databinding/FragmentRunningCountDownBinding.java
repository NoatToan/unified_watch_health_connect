package com.huami.moving.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.moving.R;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes11.dex */
public final class FragmentRunningCountDownBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final TypefaceTextView counter;

    private FragmentRunningCountDownBinding(@NonNull RelativeLayout relativeLayout, @NonNull TypefaceTextView typefaceTextView) {
        this.a = relativeLayout;
        this.counter = typefaceTextView;
    }

    @NonNull
    public static FragmentRunningCountDownBinding bind(@NonNull View view) {
        int i = R.id.counter;
        TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
        if (typefaceTextView != null) {
            return new FragmentRunningCountDownBinding((RelativeLayout) view, typefaceTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentRunningCountDownBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentRunningCountDownBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_running_count_down, viewGroup, false);
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
