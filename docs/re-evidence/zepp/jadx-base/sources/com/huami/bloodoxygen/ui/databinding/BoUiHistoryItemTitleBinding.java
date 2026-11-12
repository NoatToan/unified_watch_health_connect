package com.huami.bloodoxygen.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.bloodoxygen.ui.R;

/* JADX INFO: loaded from: classes5.dex */
public final class BoUiHistoryItemTitleBinding implements ViewBinding {

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

    private BoUiHistoryItemTitleBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull View view, @NonNull View view2, @NonNull TextView textView2) {
        this.a = constraintLayout;
        this.date = textView;
        this.dot = view;
        this.lineTop = view2;
        this.year = textView2;
    }

    @NonNull
    public static BoUiHistoryItemTitleBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i = R.id.date;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.dot))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.line_top))) != null) {
            i = R.id.year;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                return new BoUiHistoryItemTitleBinding((ConstraintLayout) view, textView, viewFindChildViewById, viewFindChildViewById2, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static BoUiHistoryItemTitleBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static BoUiHistoryItemTitleBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.bo_ui_history_item_title, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.a;
    }
}
