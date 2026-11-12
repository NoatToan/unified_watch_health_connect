package com.huami.bloodpressure_ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import com.huami.bloodpressure_ui.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class LayoutBpHistoryEmptyBinding implements ViewBinding {

    @NonNull
    private final AppCompatTextView a;

    @NonNull
    public final AppCompatTextView noData;

    private LayoutBpHistoryEmptyBinding(@NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2) {
        this.a = appCompatTextView;
        this.noData = appCompatTextView2;
    }

    @NonNull
    public static LayoutBpHistoryEmptyBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        AppCompatTextView appCompatTextView = (AppCompatTextView) view;
        return new LayoutBpHistoryEmptyBinding(appCompatTextView, appCompatTextView);
    }

    @NonNull
    public static LayoutBpHistoryEmptyBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static LayoutBpHistoryEmptyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_bp_history_empty, viewGroup, false);
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
