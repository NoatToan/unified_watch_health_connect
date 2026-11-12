package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.huami.devicex.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class ItemHotCityBinding implements ViewBinding {

    @NonNull
    private final TextView a;

    private ItemHotCityBinding(@NonNull TextView textView) {
        this.a = textView;
    }

    @NonNull
    public static ItemHotCityBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        return new ItemHotCityBinding((TextView) view);
    }

    @NonNull
    public static ItemHotCityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemHotCityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_hot_city, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public TextView getRoot() {
        return this.a;
    }
}
