package com.huami.watchfacesstore.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.huami.watchfacesstore.R;
import com.huami.watchfacesstore.view.SelectColorView;
import java.util.Objects;

/* JADX INFO: loaded from: classes17.dex */
public final class WfItemColorSelectorBinding implements ViewBinding {

    @NonNull
    private final SelectColorView a;

    private WfItemColorSelectorBinding(@NonNull SelectColorView rootView) {
        this.a = rootView;
    }

    @NonNull
    public static WfItemColorSelectorBinding bind(@NonNull View rootView) {
        Objects.requireNonNull(rootView, "rootView");
        return new WfItemColorSelectorBinding((SelectColorView) rootView);
    }

    @NonNull
    public static WfItemColorSelectorBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static WfItemColorSelectorBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.wf_item_color_selector, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public SelectColorView getRoot() {
        return this.a;
    }
}
