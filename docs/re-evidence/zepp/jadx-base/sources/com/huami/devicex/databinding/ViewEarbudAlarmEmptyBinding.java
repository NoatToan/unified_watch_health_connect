package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.huami.devicex.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class ViewEarbudAlarmEmptyBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    private ViewEarbudAlarmEmptyBinding(@NonNull LinearLayout linearLayout) {
        this.a = linearLayout;
    }

    @NonNull
    public static ViewEarbudAlarmEmptyBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        return new ViewEarbudAlarmEmptyBinding((LinearLayout) view);
    }

    @NonNull
    public static ViewEarbudAlarmEmptyBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ViewEarbudAlarmEmptyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.view_earbud_alarm_empty, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.a;
    }
}
