package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.huami.lib.rainbow.ListTile;
import com.huami.watch.hmwatchmanager.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes20.dex */
public final class LayoutVibrateItemBinding implements ViewBinding {

    @NonNull
    private final ListTile a;

    private LayoutVibrateItemBinding(@NonNull ListTile rootView) {
        this.a = rootView;
    }

    @NonNull
    public static LayoutVibrateItemBinding bind(@NonNull View rootView) {
        Objects.requireNonNull(rootView, "rootView");
        return new LayoutVibrateItemBinding((ListTile) rootView);
    }

    @NonNull
    public static LayoutVibrateItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static LayoutVibrateItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.layout_vibrate_item, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ListTile getRoot() {
        return this.a;
    }
}
