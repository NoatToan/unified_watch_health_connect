package com.huami.watchfacesstore.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.huami.watchfacesstore.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes17.dex */
public final class WfDialogPanelBinding implements ViewBinding {

    @NonNull
    private final FrameLayout a;

    private WfDialogPanelBinding(@NonNull FrameLayout rootView) {
        this.a = rootView;
    }

    @NonNull
    public static WfDialogPanelBinding bind(@NonNull View rootView) {
        Objects.requireNonNull(rootView, "rootView");
        return new WfDialogPanelBinding((FrameLayout) rootView);
    }

    @NonNull
    public static WfDialogPanelBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static WfDialogPanelBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.wf_dialog_panel, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.a;
    }
}
