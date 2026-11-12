package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.xiaomi.hm.health.baseui.widget.ItemView;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityHealthSettingBakBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final ItemView itemCalGoalView;

    @NonNull
    public final ItemView itemLongSitView;

    @NonNull
    public final ItemView itemStepGoalView;

    private ActivityHealthSettingBakBinding(@NonNull LinearLayout linearLayout, @NonNull ItemView itemView, @NonNull ItemView itemView2, @NonNull ItemView itemView3) {
        this.a = linearLayout;
        this.itemCalGoalView = itemView;
        this.itemLongSitView = itemView2;
        this.itemStepGoalView = itemView3;
    }

    @NonNull
    public static ActivityHealthSettingBakBinding bind(@NonNull View view) {
        int i = R.id.itemCalGoalView;
        ItemView itemView = (ItemView) ViewBindings.findChildViewById(view, i);
        if (itemView != null) {
            i = R.id.itemLongSitView;
            ItemView itemView2 = (ItemView) ViewBindings.findChildViewById(view, i);
            if (itemView2 != null) {
                i = R.id.itemStepGoalView;
                ItemView itemView3 = (ItemView) ViewBindings.findChildViewById(view, i);
                if (itemView3 != null) {
                    return new ActivityHealthSettingBakBinding((LinearLayout) view, itemView, itemView2, itemView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityHealthSettingBakBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityHealthSettingBakBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_health_setting_bak, viewGroup, false);
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
