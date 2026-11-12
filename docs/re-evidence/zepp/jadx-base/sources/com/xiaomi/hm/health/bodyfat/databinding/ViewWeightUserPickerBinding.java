package com.xiaomi.hm.health.bodyfat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.xiaomi.hm.health.bodyfat.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes19.dex */
public final class ViewWeightUserPickerBinding implements ViewBinding {

    @NonNull
    private final RecyclerView a;

    @NonNull
    public final RecyclerView userList;

    private ViewWeightUserPickerBinding(@NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2) {
        this.a = recyclerView;
        this.userList = recyclerView2;
    }

    @NonNull
    public static ViewWeightUserPickerBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        RecyclerView recyclerView = (RecyclerView) view;
        return new ViewWeightUserPickerBinding(recyclerView, recyclerView);
    }

    @NonNull
    public static ViewWeightUserPickerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ViewWeightUserPickerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.view_weight_user_picker, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RecyclerView getRoot() {
        return this.a;
    }
}
