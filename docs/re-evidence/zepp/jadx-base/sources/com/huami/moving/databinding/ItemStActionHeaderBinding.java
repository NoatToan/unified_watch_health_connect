package com.huami.moving.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.huami.moving.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public final class ItemStActionHeaderBinding implements ViewBinding {

    @NonNull
    private final TextView a;

    private ItemStActionHeaderBinding(@NonNull TextView textView) {
        this.a = textView;
    }

    @NonNull
    public static ItemStActionHeaderBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        return new ItemStActionHeaderBinding((TextView) view);
    }

    @NonNull
    public static ItemStActionHeaderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemStActionHeaderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_st_action_header, viewGroup, false);
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
