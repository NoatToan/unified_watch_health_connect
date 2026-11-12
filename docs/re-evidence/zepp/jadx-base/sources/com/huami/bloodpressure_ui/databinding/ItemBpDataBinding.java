package com.huami.bloodpressure_ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.bloodpressure_ui.R;

/* JADX INFO: loaded from: classes6.dex */
public final class ItemBpDataBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final ConstraintLayout containerBpDataItem;

    @NonNull
    public final AppCompatImageView tvItemHistoryDevice;

    @NonNull
    public final AppCompatTextView tvItemHistoryFirst;

    @NonNull
    public final AppCompatTextView tvItemHistoryFirstDiv;

    @NonNull
    public final AppCompatImageView tvItemHistoryFirstStatus;

    @NonNull
    public final AppCompatTextView tvItemHistorySecond;

    @NonNull
    public final AppCompatImageView tvItemHistorySecondStatus;

    @NonNull
    public final AppCompatTextView tvItemHistoryTime;

    @NonNull
    public final AppCompatTextView tvItemHistoryUnit;

    private ItemBpDataBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2, @NonNull AppCompatImageView appCompatImageView2, @NonNull AppCompatTextView appCompatTextView3, @NonNull AppCompatImageView appCompatImageView3, @NonNull AppCompatTextView appCompatTextView4, @NonNull AppCompatTextView appCompatTextView5) {
        this.a = constraintLayout;
        this.containerBpDataItem = constraintLayout2;
        this.tvItemHistoryDevice = appCompatImageView;
        this.tvItemHistoryFirst = appCompatTextView;
        this.tvItemHistoryFirstDiv = appCompatTextView2;
        this.tvItemHistoryFirstStatus = appCompatImageView2;
        this.tvItemHistorySecond = appCompatTextView3;
        this.tvItemHistorySecondStatus = appCompatImageView3;
        this.tvItemHistoryTime = appCompatTextView4;
        this.tvItemHistoryUnit = appCompatTextView5;
    }

    @NonNull
    public static ItemBpDataBinding bind(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.tv_item_history_device;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = R.id.tv_item_history_first;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
            if (appCompatTextView != null) {
                i = R.id.tv_item_history_first_div;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView2 != null) {
                    i = R.id.tv_item_history_first_status;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                    if (appCompatImageView2 != null) {
                        i = R.id.tv_item_history_second;
                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView3 != null) {
                            i = R.id.tv_item_history_second_status;
                            AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                            if (appCompatImageView3 != null) {
                                i = R.id.tv_item_history_time;
                                AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                if (appCompatTextView4 != null) {
                                    i = R.id.tv_item_history_unit;
                                    AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                    if (appCompatTextView5 != null) {
                                        return new ItemBpDataBinding(constraintLayout, constraintLayout, appCompatImageView, appCompatTextView, appCompatTextView2, appCompatImageView2, appCompatTextView3, appCompatImageView3, appCompatTextView4, appCompatTextView5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemBpDataBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemBpDataBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_bp_data, viewGroup, false);
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
