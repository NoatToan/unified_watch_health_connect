package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.xiaomi.hm.health.baseui.widget.ItemView;
import com.xiaomi.hm.health.device.earbud.view.EarbudImageView;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityEarbudOperSettingBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final TextView btnReset;

    @NonNull
    public final EarbudImageView deviceImg;

    @NonNull
    public final ItemView leftClick;

    @NonNull
    public final ItemView leftDoubleClick;

    @NonNull
    public final ItemView rightClick;

    @NonNull
    public final ItemView rightDoubleClick;

    @NonNull
    public final FrameLayout statusContent;

    private ActivityEarbudOperSettingBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull EarbudImageView earbudImageView, @NonNull ItemView itemView, @NonNull ItemView itemView2, @NonNull ItemView itemView3, @NonNull ItemView itemView4, @NonNull FrameLayout frameLayout) {
        this.a = linearLayout;
        this.btnReset = textView;
        this.deviceImg = earbudImageView;
        this.leftClick = itemView;
        this.leftDoubleClick = itemView2;
        this.rightClick = itemView3;
        this.rightDoubleClick = itemView4;
        this.statusContent = frameLayout;
    }

    @NonNull
    public static ActivityEarbudOperSettingBinding bind(@NonNull View view) {
        int i = R.id.btn_reset;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.device_img;
            EarbudImageView earbudImageView = (EarbudImageView) ViewBindings.findChildViewById(view, i);
            if (earbudImageView != null) {
                i = R.id.left_click;
                ItemView itemView = (ItemView) ViewBindings.findChildViewById(view, i);
                if (itemView != null) {
                    i = R.id.left_double_click;
                    ItemView itemView2 = (ItemView) ViewBindings.findChildViewById(view, i);
                    if (itemView2 != null) {
                        i = R.id.right_click;
                        ItemView itemView3 = (ItemView) ViewBindings.findChildViewById(view, i);
                        if (itemView3 != null) {
                            i = R.id.right_double_click;
                            ItemView itemView4 = (ItemView) ViewBindings.findChildViewById(view, i);
                            if (itemView4 != null) {
                                i = R.id.status_content;
                                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                if (frameLayout != null) {
                                    return new ActivityEarbudOperSettingBinding((LinearLayout) view, textView, earbudImageView, itemView, itemView2, itemView3, itemView4, frameLayout);
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
    public static ActivityEarbudOperSettingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityEarbudOperSettingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_earbud_oper_setting, viewGroup, false);
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
