package com.huami.midong.ppg.ui.midong.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.huami.midong.ppg.ui.midong.R;
import com.huami.widget.typeface.TypefaceTextView;
import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public final class ItemAfppgHeadDescLayoutBinding implements ViewBinding {

    @NonNull
    private final TypefaceTextView a;

    @NonNull
    public final TypefaceTextView afppgHeadDesc;

    private ItemAfppgHeadDescLayoutBinding(@NonNull TypefaceTextView typefaceTextView, @NonNull TypefaceTextView typefaceTextView2) {
        this.a = typefaceTextView;
        this.afppgHeadDesc = typefaceTextView2;
    }

    @NonNull
    public static ItemAfppgHeadDescLayoutBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        TypefaceTextView typefaceTextView = (TypefaceTextView) view;
        return new ItemAfppgHeadDescLayoutBinding(typefaceTextView, typefaceTextView);
    }

    @NonNull
    public static ItemAfppgHeadDescLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemAfppgHeadDescLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_afppg_head_desc_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public TypefaceTextView getRoot() {
        return this.a;
    }
}
