package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.lib.rainbow.button.RainbowButton;
import com.huami.lib.view.widget.TipComponent;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class ActivityUnlockScreenBinding implements ViewBinding {

    @NonNull
    private final FrameLayout a;

    @NonNull
    public final RelativeLayout hasUnlockWithBraceletLl;

    @NonNull
    public final View miuiMaskView;

    @NonNull
    public final TextView noMiuiStep3;

    @NonNull
    public final RelativeLayout nonMiuiLayout;

    @NonNull
    public final View normalMaskView;

    @NonNull
    public final FrameLayout setMibandUnlockLayout;

    @NonNull
    public final TextView setMibandUnlockText;

    @NonNull
    public final ImageView setUnlockScreenPasswordIcon;

    @NonNull
    public final FrameLayout setUnlockScreenPasswordLayout;

    @NonNull
    public final TextView setUnlockScreenPasswordTextTip;

    @NonNull
    public final FrameLayout smartlockFl;

    @NonNull
    public final RainbowButton startSetting;

    @NonNull
    public final TipComponent tips;

    @NonNull
    public final TextView tips1;

    @NonNull
    public final TextView tips2;

    @NonNull
    public final TextView unlockScreenInvalidTv;

    @NonNull
    public final LinearLayout unlockScreenSetLayout;

    @NonNull
    public final TextView unlockTitleTv;

    private ActivityUnlockScreenBinding(@NonNull FrameLayout rootView, @NonNull RelativeLayout hasUnlockWithBraceletLl, @NonNull View miuiMaskView, @NonNull TextView noMiuiStep3, @NonNull RelativeLayout nonMiuiLayout, @NonNull View normalMaskView, @NonNull FrameLayout setMibandUnlockLayout, @NonNull TextView setMibandUnlockText, @NonNull ImageView setUnlockScreenPasswordIcon, @NonNull FrameLayout setUnlockScreenPasswordLayout, @NonNull TextView setUnlockScreenPasswordTextTip, @NonNull FrameLayout smartlockFl, @NonNull RainbowButton startSetting, @NonNull TipComponent tips, @NonNull TextView tips1, @NonNull TextView tips2, @NonNull TextView unlockScreenInvalidTv, @NonNull LinearLayout unlockScreenSetLayout, @NonNull TextView unlockTitleTv) {
        this.a = rootView;
        this.hasUnlockWithBraceletLl = hasUnlockWithBraceletLl;
        this.miuiMaskView = miuiMaskView;
        this.noMiuiStep3 = noMiuiStep3;
        this.nonMiuiLayout = nonMiuiLayout;
        this.normalMaskView = normalMaskView;
        this.setMibandUnlockLayout = setMibandUnlockLayout;
        this.setMibandUnlockText = setMibandUnlockText;
        this.setUnlockScreenPasswordIcon = setUnlockScreenPasswordIcon;
        this.setUnlockScreenPasswordLayout = setUnlockScreenPasswordLayout;
        this.setUnlockScreenPasswordTextTip = setUnlockScreenPasswordTextTip;
        this.smartlockFl = smartlockFl;
        this.startSetting = startSetting;
        this.tips = tips;
        this.tips1 = tips1;
        this.tips2 = tips2;
        this.unlockScreenInvalidTv = unlockScreenInvalidTv;
        this.unlockScreenSetLayout = unlockScreenSetLayout;
        this.unlockTitleTv = unlockTitleTv;
    }

    @NonNull
    public static ActivityUnlockScreenBinding bind(@NonNull View rootView) {
        int i = R.id.has_unlock_with_bracelet_ll;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.has_unlock_with_bracelet_ll);
        if (relativeLayout != null) {
            i = R.id.miui_mask_view;
            View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.miui_mask_view);
            if (viewFindChildViewById != null) {
                i = R.id.no_miui_step_3;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.no_miui_step_3);
                if (textView != null) {
                    i = R.id.non_miui_layout;
                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.non_miui_layout);
                    if (relativeLayout2 != null) {
                        i = R.id.normal_mask_view;
                        View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.normal_mask_view);
                        if (viewFindChildViewById2 != null) {
                            i = R.id.set_miband_unlock_layout;
                            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.set_miband_unlock_layout);
                            if (frameLayout != null) {
                                i = R.id.set_miband_unlock_text;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.set_miband_unlock_text);
                                if (textView2 != null) {
                                    i = R.id.set_unlock_screen_password_icon;
                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.set_unlock_screen_password_icon);
                                    if (imageView != null) {
                                        i = R.id.set_unlock_screen_password_layout;
                                        FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.set_unlock_screen_password_layout);
                                        if (frameLayout2 != null) {
                                            i = R.id.set_unlock_screen_password_text_tip;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.set_unlock_screen_password_text_tip);
                                            if (textView3 != null) {
                                                i = R.id.smartlock_fl;
                                                FrameLayout frameLayout3 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.smartlock_fl);
                                                if (frameLayout3 != null) {
                                                    i = R.id.start_setting;
                                                    RainbowButton rainbowButton = (RainbowButton) ViewBindings.findChildViewById(rootView, R.id.start_setting);
                                                    if (rainbowButton != null) {
                                                        i = R.id.tips;
                                                        TipComponent tipComponent = (TipComponent) ViewBindings.findChildViewById(rootView, R.id.tips);
                                                        if (tipComponent != null) {
                                                            i = R.id.tips_1;
                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tips_1);
                                                            if (textView4 != null) {
                                                                i = R.id.tips_2;
                                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tips_2);
                                                                if (textView5 != null) {
                                                                    i = R.id.unlock_screen_invalid_tv;
                                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.unlock_screen_invalid_tv);
                                                                    if (textView6 != null) {
                                                                        i = R.id.unlock_screen_set_layout;
                                                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.unlock_screen_set_layout);
                                                                        if (linearLayout != null) {
                                                                            i = R.id.unlock_title_tv;
                                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.unlock_title_tv);
                                                                            if (textView7 != null) {
                                                                                return new ActivityUnlockScreenBinding((FrameLayout) rootView, relativeLayout, viewFindChildViewById, textView, relativeLayout2, viewFindChildViewById2, frameLayout, textView2, imageView, frameLayout2, textView3, frameLayout3, rainbowButton, tipComponent, textView4, textView5, textView6, linearLayout, textView7);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityUnlockScreenBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityUnlockScreenBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_unlock_screen, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.a;
    }
}
