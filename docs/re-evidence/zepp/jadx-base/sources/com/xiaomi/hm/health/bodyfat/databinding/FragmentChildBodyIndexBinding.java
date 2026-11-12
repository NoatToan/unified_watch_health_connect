package com.xiaomi.hm.health.bodyfat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.view.FillRecyclerView;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentChildBodyIndexBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final FillRecyclerView allParamRv;

    private FragmentChildBodyIndexBinding(@NonNull LinearLayout linearLayout, @NonNull FillRecyclerView fillRecyclerView) {
        this.a = linearLayout;
        this.allParamRv = fillRecyclerView;
    }

    @NonNull
    public static FragmentChildBodyIndexBinding bind(@NonNull View view) {
        int i = R.id.all_param_rv;
        FillRecyclerView fillRecyclerView = (FillRecyclerView) ViewBindings.findChildViewById(view, i);
        if (fillRecyclerView != null) {
            return new FragmentChildBodyIndexBinding((LinearLayout) view, fillRecyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentChildBodyIndexBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentChildBodyIndexBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_child_body_index, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.a;
    }
}
