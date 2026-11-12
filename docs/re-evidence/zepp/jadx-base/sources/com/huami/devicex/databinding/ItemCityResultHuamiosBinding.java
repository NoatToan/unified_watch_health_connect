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
public final class ItemCityResultHuamiosBinding implements ViewBinding {

    @NonNull
    private final TextView a;

    private ItemCityResultHuamiosBinding(@NonNull TextView textView) {
        this.a = textView;
    }

    @NonNull
    public static ItemCityResultHuamiosBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        return new ItemCityResultHuamiosBinding((TextView) view);
    }

    @NonNull
    public static ItemCityResultHuamiosBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemCityResultHuamiosBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_city_result_huamios, viewGroup, false);
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
