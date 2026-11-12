package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.huami.watch.hmwatchmanager.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes20.dex */
public final class ActivityVibrateTypeBinding implements ViewBinding {

    @NonNull
    private final RecyclerView a;

    @NonNull
    public final RecyclerView vibrateTypeList;

    private ActivityVibrateTypeBinding(@NonNull RecyclerView rootView, @NonNull RecyclerView vibrateTypeList) {
        this.a = rootView;
        this.vibrateTypeList = vibrateTypeList;
    }

    @NonNull
    public static ActivityVibrateTypeBinding bind(@NonNull View rootView) {
        Objects.requireNonNull(rootView, "rootView");
        RecyclerView recyclerView = (RecyclerView) rootView;
        return new ActivityVibrateTypeBinding(recyclerView, recyclerView);
    }

    @NonNull
    public static ActivityVibrateTypeBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityVibrateTypeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_vibrate_type, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RecyclerView getRoot() {
        return this.a;
    }
}
