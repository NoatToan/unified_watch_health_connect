package com.huami.healthlabel.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import com.huami.healthlabel.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
public final class ItemLabelHistoryDayLabelBinding implements ViewBinding {

    @NonNull
    private final AppCompatTextView a;

    @NonNull
    public final AppCompatTextView itemLabelHistoryDayLabel;

    private ItemLabelHistoryDayLabelBinding(@NonNull AppCompatTextView rootView, @NonNull AppCompatTextView itemLabelHistoryDayLabel) {
        this.a = rootView;
        this.itemLabelHistoryDayLabel = itemLabelHistoryDayLabel;
    }

    @NonNull
    public static ItemLabelHistoryDayLabelBinding bind(@NonNull View rootView) {
        Objects.requireNonNull(rootView, "rootView");
        AppCompatTextView appCompatTextView = (AppCompatTextView) rootView;
        return new ItemLabelHistoryDayLabelBinding(appCompatTextView, appCompatTextView);
    }

    @NonNull
    public static ItemLabelHistoryDayLabelBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemLabelHistoryDayLabelBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_label_history_day_label, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public AppCompatTextView getRoot() {
        return this.a;
    }
}
