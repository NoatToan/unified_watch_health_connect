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

/* JADX INFO: loaded from: classes19.dex */
public final class ViewFatMeasuringBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final View view1;

    @NonNull
    public final View view2;

    @NonNull
    public final View view3;

    @NonNull
    public final View view4;

    @NonNull
    public final View view5;

    private ViewFatMeasuringBinding(@NonNull LinearLayout linearLayout, @NonNull View view, @NonNull View view2, @NonNull View view3, @NonNull View view4, @NonNull View view5) {
        this.a = linearLayout;
        this.view1 = view;
        this.view2 = view2;
        this.view3 = view3;
        this.view4 = view4;
        this.view5 = view5;
    }

    @NonNull
    public static ViewFatMeasuringBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        View viewFindChildViewById3;
        View viewFindChildViewById4;
        int i = R.id.view1;
        View viewFindChildViewById5 = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById5 == null || (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.view2))) == null || (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.view3))) == null || (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i = R.id.view4))) == null || (viewFindChildViewById4 = ViewBindings.findChildViewById(view, (i = R.id.view5))) == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        }
        return new ViewFatMeasuringBinding((LinearLayout) view, viewFindChildViewById5, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, viewFindChildViewById4);
    }

    @NonNull
    public static ViewFatMeasuringBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ViewFatMeasuringBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.view_fat_measuring, viewGroup, false);
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
