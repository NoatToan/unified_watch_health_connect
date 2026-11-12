package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class PlayItemTabLayoutBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final View itemRedot;

    @NonNull
    public final TextView itemTab;

    @NonNull
    public final View tabItemIndicator;

    private PlayItemTabLayoutBinding(@NonNull ConstraintLayout rootView, @NonNull View itemRedot, @NonNull TextView itemTab, @NonNull View tabItemIndicator) {
        this.a = rootView;
        this.itemRedot = itemRedot;
        this.itemTab = itemTab;
        this.tabItemIndicator = tabItemIndicator;
    }

    @NonNull
    public static PlayItemTabLayoutBinding bind(@NonNull View rootView) {
        int i = R.id.item_redot;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.item_redot);
        if (viewFindChildViewById != null) {
            i = R.id.item_tab;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.item_tab);
            if (textView != null) {
                i = R.id.tab_item_indicator;
                View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.tab_item_indicator);
                if (viewFindChildViewById2 != null) {
                    return new PlayItemTabLayoutBinding((ConstraintLayout) rootView, viewFindChildViewById, textView, viewFindChildViewById2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static PlayItemTabLayoutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static PlayItemTabLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.play_item_tab_layout, parent, false);
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
