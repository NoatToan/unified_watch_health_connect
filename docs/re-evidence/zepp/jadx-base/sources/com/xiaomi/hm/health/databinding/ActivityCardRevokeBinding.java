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
public final class ActivityCardRevokeBinding implements ViewBinding {

    @NonNull
    private final FrameLayout a;

    private ActivityCardRevokeBinding(@NonNull FrameLayout rootView) {
        this.a = rootView;
    }

    @NonNull
    public static ActivityCardRevokeBinding bind(@NonNull View rootView) {
        Objects.requireNonNull(rootView, "rootView");
        return new ActivityCardRevokeBinding((FrameLayout) rootView);
    }

    @NonNull
    public static ActivityCardRevokeBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityCardRevokeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_card_revoke, parent, false);
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
