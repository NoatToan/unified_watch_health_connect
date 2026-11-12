package com.xiaomi.hm.health.bodyfat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.xiaomi.hm.health.bodyfat.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes19.dex */
public final class PopwindowNoOwnerDataBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    private PopwindowNoOwnerDataBinding(@NonNull LinearLayout linearLayout) {
        this.a = linearLayout;
    }

    @NonNull
    public static PopwindowNoOwnerDataBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        return new PopwindowNoOwnerDataBinding((LinearLayout) view);
    }

    @NonNull
    public static PopwindowNoOwnerDataBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static PopwindowNoOwnerDataBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.popwindow_no_owner_data, viewGroup, false);
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
