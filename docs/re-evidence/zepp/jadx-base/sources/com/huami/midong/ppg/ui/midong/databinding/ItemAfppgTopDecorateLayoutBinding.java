package com.huami.midong.ppg.ui.midong.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.huami.midong.ppg.ui.midong.R;

/* JADX INFO: loaded from: classes11.dex */
public final class ItemAfppgTopDecorateLayoutBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final View afppgTopRoundSpace;

    @NonNull
    public final View afppgTopSpace;

    private ItemAfppgTopDecorateLayoutBinding(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull View view2) {
        this.a = constraintLayout;
        this.afppgTopRoundSpace = view;
        this.afppgTopSpace = view2;
    }

    @NonNull
    public static ItemAfppgTopDecorateLayoutBinding bind(@NonNull View view) {
        View viewFindViewById;
        int i = R.id.afppgTopRoundSpace;
        View viewFindViewById2 = view.findViewById(i);
        if (viewFindViewById2 == null || (viewFindViewById = view.findViewById((i = R.id.afppgTopSpace))) == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        }
        return new ItemAfppgTopDecorateLayoutBinding((ConstraintLayout) view, viewFindViewById2, viewFindViewById);
    }

    @NonNull
    public static ItemAfppgTopDecorateLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemAfppgTopDecorateLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_afppg_top_decorate_layout, viewGroup, false);
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
