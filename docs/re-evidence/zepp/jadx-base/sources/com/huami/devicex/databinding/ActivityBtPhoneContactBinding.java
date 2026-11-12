package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.huami.devicex.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityBtPhoneContactBinding implements ViewBinding {

    @NonNull
    private final View a;

    private ActivityBtPhoneContactBinding(@NonNull View view) {
        this.a = view;
    }

    @NonNull
    public static ActivityBtPhoneContactBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        return new ActivityBtPhoneContactBinding(view);
    }

    @NonNull
    public static ActivityBtPhoneContactBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.a;
    }

    @NonNull
    public static ActivityBtPhoneContactBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_bt_phone_contact, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }
}
