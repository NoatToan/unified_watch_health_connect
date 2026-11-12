package com.huami.heartrate.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.heartrate.R;

/* JADX INFO: loaded from: classes9.dex */
public final class HeartRateHistoryItemTitleBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final TextView date;

    @NonNull
    public final View dot;

    @NonNull
    public final View lineTop;

    @NonNull
    public final TextView year;

    private HeartRateHistoryItemTitleBinding(@NonNull ConstraintLayout rootView, @NonNull TextView date, @NonNull View dot, @NonNull View lineTop, @NonNull TextView year) {
        this.a = rootView;
        this.date = date;
        this.dot = dot;
        this.lineTop = lineTop;
        this.year = year;
    }

    @NonNull
    public static HeartRateHistoryItemTitleBinding bind(@NonNull View rootView) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i = R.id.date;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
        if (textView != null && (viewFindChildViewById = ViewBindings.findChildViewById(rootView, (i = R.id.dot))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, (i = R.id.line_top))) != null) {
            i = R.id.year;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
            if (textView2 != null) {
                return new HeartRateHistoryItemTitleBinding((ConstraintLayout) rootView, textView, viewFindChildViewById, viewFindChildViewById2, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static HeartRateHistoryItemTitleBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static HeartRateHistoryItemTitleBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.heart_rate_history_item_title, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.a;
    }
}
