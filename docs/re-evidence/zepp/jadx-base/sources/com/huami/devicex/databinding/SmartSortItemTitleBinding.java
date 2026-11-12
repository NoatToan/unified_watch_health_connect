package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;

/* JADX INFO: loaded from: classes7.dex */
public final class SmartSortItemTitleBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final TextView sortItemTitle;

    private SmartSortItemTitleBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView) {
        this.a = linearLayout;
        this.sortItemTitle = textView;
    }

    @NonNull
    public static SmartSortItemTitleBinding bind(@NonNull View view) {
        int i = R.id.sort_item_title;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            return new SmartSortItemTitleBinding((LinearLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static SmartSortItemTitleBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static SmartSortItemTitleBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.smart_sort_item_title, viewGroup, false);
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
