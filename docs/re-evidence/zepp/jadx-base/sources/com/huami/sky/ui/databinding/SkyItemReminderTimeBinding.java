package com.huami.sky.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import com.huami.sky.ui.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes13.dex */
public final class SkyItemReminderTimeBinding implements ViewBinding {

    @NonNull
    private final AppCompatTextView a;

    @NonNull
    public final AppCompatTextView itemReminderTime;

    private SkyItemReminderTimeBinding(@NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2) {
        this.a = appCompatTextView;
        this.itemReminderTime = appCompatTextView2;
    }

    @NonNull
    public static SkyItemReminderTimeBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        AppCompatTextView appCompatTextView = (AppCompatTextView) view;
        return new SkyItemReminderTimeBinding(appCompatTextView, appCompatTextView);
    }

    @NonNull
    public static SkyItemReminderTimeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static SkyItemReminderTimeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.sky_item_reminder_time, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public AppCompatTextView getRoot() {
        return this.a;
    }
}
