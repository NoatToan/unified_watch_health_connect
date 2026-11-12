package com.huami.wallet.accessdoor.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.huami.wallet.accessdoor.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes15.dex */
public final class FragmentAccessSupportRangeBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    private FragmentAccessSupportRangeBinding(@NonNull RelativeLayout relativeLayout) {
        this.a = relativeLayout;
    }

    @NonNull
    public static FragmentAccessSupportRangeBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        return new FragmentAccessSupportRangeBinding((RelativeLayout) view);
    }

    @NonNull
    public static FragmentAccessSupportRangeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentAccessSupportRangeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_access_support_range, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.a;
    }
}
