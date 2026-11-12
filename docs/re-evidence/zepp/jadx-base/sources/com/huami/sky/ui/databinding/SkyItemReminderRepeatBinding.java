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
public final class SkyItemReminderRepeatBinding implements ViewBinding {

    @NonNull
    private final AppCompatTextView a;

    @NonNull
    public final AppCompatTextView repeatContent;

    private SkyItemReminderRepeatBinding(@NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2) {
        this.a = appCompatTextView;
        this.repeatContent = appCompatTextView2;
    }

    @NonNull
    public static SkyItemReminderRepeatBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        AppCompatTextView appCompatTextView = (AppCompatTextView) view;
        return new SkyItemReminderRepeatBinding(appCompatTextView, appCompatTextView);
    }

    @NonNull
    public static SkyItemReminderRepeatBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static SkyItemReminderRepeatBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.sky_item_reminder_repeat, viewGroup, false);
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
