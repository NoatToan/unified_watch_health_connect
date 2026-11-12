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
public final class ItemStatisticBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final TextView titleTv;

    @NonNull
    public final TextView valueTv;

    private ItemStatisticBinding(@NonNull ConstraintLayout rootView, @NonNull TextView titleTv, @NonNull TextView valueTv) {
        this.a = rootView;
        this.titleTv = titleTv;
        this.valueTv = valueTv;
    }

    @NonNull
    public static ItemStatisticBinding bind(@NonNull View rootView) {
        int i = R.id.title_tv;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_tv);
        if (textView != null) {
            i = R.id.value_tv;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.value_tv);
            if (textView2 != null) {
                return new ItemStatisticBinding((ConstraintLayout) rootView, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemStatisticBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemStatisticBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_statistic, parent, false);
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
