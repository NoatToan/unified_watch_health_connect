package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.huami.devicex.R;
import com.huami.lib.view.widget.ItemView2;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class ItemBeepBinding implements ViewBinding {

    @NonNull
    private final ItemView2 a;

    private ItemBeepBinding(@NonNull ItemView2 itemView2) {
        this.a = itemView2;
    }

    @NonNull
    public static ItemBeepBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        return new ItemBeepBinding((ItemView2) view);
    }

    @NonNull
    public static ItemBeepBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemBeepBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_beep, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ItemView2 getRoot() {
        return this.a;
    }
}
