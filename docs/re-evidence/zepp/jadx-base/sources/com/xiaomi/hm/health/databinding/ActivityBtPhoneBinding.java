package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.huami.watch.hmwatchmanager.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes20.dex */
public final class ActivityBtPhoneBinding implements ViewBinding {

    @NonNull
    private final View a;

    private ActivityBtPhoneBinding(@NonNull View rootView) {
        this.a = rootView;
    }

    @NonNull
    public static ActivityBtPhoneBinding bind(@NonNull View rootView) {
        Objects.requireNonNull(rootView, "rootView");
        return new ActivityBtPhoneBinding(rootView);
    }

    @NonNull
    public static ActivityBtPhoneBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.a;
    }

    @NonNull
    public static ActivityBtPhoneBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_bt_phone, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }
}
