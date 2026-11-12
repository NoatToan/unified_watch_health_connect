package com.huami.sleep.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.huami.sleep.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes13.dex */
public final class SleepDialogPanelBinding implements ViewBinding {

    @NonNull
    private final FrameLayout a;

    private SleepDialogPanelBinding(@NonNull FrameLayout rootView) {
        this.a = rootView;
    }

    @NonNull
    public static SleepDialogPanelBinding bind(@NonNull View rootView) {
        Objects.requireNonNull(rootView, "rootView");
        return new SleepDialogPanelBinding((FrameLayout) rootView);
    }

    @NonNull
    public static SleepDialogPanelBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static SleepDialogPanelBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.sleep_dialog_panel, parent, false);
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
