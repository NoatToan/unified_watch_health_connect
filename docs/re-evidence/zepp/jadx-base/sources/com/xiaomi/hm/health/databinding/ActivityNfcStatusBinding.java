package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.huami.watch.hmwatchmanager.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes20.dex */
public final class ActivityNfcStatusBinding implements ViewBinding {

    @NonNull
    private final FrameLayout a;

    @NonNull
    public final FrameLayout nfcDialogRoot;

    private ActivityNfcStatusBinding(@NonNull FrameLayout rootView, @NonNull FrameLayout nfcDialogRoot) {
        this.a = rootView;
        this.nfcDialogRoot = nfcDialogRoot;
    }

    @NonNull
    public static ActivityNfcStatusBinding bind(@NonNull View rootView) {
        Objects.requireNonNull(rootView, "rootView");
        FrameLayout frameLayout = (FrameLayout) rootView;
        return new ActivityNfcStatusBinding(frameLayout, frameLayout);
    }

    @NonNull
    public static ActivityNfcStatusBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityNfcStatusBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_nfc_status, parent, false);
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
