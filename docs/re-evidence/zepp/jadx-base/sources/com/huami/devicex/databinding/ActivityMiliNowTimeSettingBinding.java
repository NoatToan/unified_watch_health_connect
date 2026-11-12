package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.xiaomi.hm.health.baseui.widget.ItemView;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityMiliNowTimeSettingBinding implements ViewBinding {

    @NonNull
    private final FrameLayout a;

    @NonNull
    public final ItemView itemEnable;

    @NonNull
    public final ItemView itemEndTime;

    @NonNull
    public final ItemView itemStartTime;

    @NonNull
    public final AppCompatImageView ivIcon;

    @NonNull
    public final View line1;

    @NonNull
    public final AppCompatTextView tvTips;

    private ActivityMiliNowTimeSettingBinding(@NonNull FrameLayout frameLayout, @NonNull ItemView itemView, @NonNull ItemView itemView2, @NonNull ItemView itemView3, @NonNull AppCompatImageView appCompatImageView, @NonNull View view, @NonNull AppCompatTextView appCompatTextView) {
        this.a = frameLayout;
        this.itemEnable = itemView;
        this.itemEndTime = itemView2;
        this.itemStartTime = itemView3;
        this.ivIcon = appCompatImageView;
        this.line1 = view;
        this.tvTips = appCompatTextView;
    }

    @NonNull
    public static ActivityMiliNowTimeSettingBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.item_enable;
        ItemView itemView = (ItemView) ViewBindings.findChildViewById(view, i);
        if (itemView != null) {
            i = R.id.item_end_time;
            ItemView itemView2 = (ItemView) ViewBindings.findChildViewById(view, i);
            if (itemView2 != null) {
                i = R.id.item_start_time;
                ItemView itemView3 = (ItemView) ViewBindings.findChildViewById(view, i);
                if (itemView3 != null) {
                    i = R.id.iv_icon;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                    if (appCompatImageView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.line1))) != null) {
                        i = R.id.tv_tips;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView != null) {
                            return new ActivityMiliNowTimeSettingBinding((FrameLayout) view, itemView, itemView2, itemView3, appCompatImageView, viewFindChildViewById, appCompatTextView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityMiliNowTimeSettingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityMiliNowTimeSettingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_mili_now_time_setting, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.a;
    }
}
