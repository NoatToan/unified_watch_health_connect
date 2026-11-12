package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityFwInfoBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final RelativeLayout fwInfoBaseResId;

    @NonNull
    public final TextView fwInfoBaseResSt;

    @NonNull
    public final TextView fwInfoBaseResVer;

    @NonNull
    public final RelativeLayout fwInfoFontId;

    @NonNull
    public final TextView fwInfoFontVer;

    @NonNull
    public final TextView fwInfoFontVerSt;

    @NonNull
    public final RelativeLayout fwInfoFwLt;

    @NonNull
    public final TextView fwInfoFwSt;

    @NonNull
    public final RelativeLayout fwInfoFwTop;

    @NonNull
    public final TextView fwInfoFwVer;

    @NonNull
    public final RelativeLayout fwInfoGpsId;

    @NonNull
    public final TextView fwInfoGpsSt;

    @NonNull
    public final RelativeLayout fwInfoResId;

    @NonNull
    public final TextView fwInfoResSt;

    @NonNull
    public final TextView fwInfoResVer;

    @NonNull
    public final FrameLayout fwTipsContainer;

    @NonNull
    public final TextView fwUpgradeLog;

    @NonNull
    public final View fwUpgradeMaskView;

    @NonNull
    public final Button miliFwInfoUpgradeNowBt;

    private ActivityFwInfoBinding(@NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull RelativeLayout relativeLayout3, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull RelativeLayout relativeLayout4, @NonNull TextView textView5, @NonNull RelativeLayout relativeLayout5, @NonNull TextView textView6, @NonNull RelativeLayout relativeLayout6, @NonNull TextView textView7, @NonNull RelativeLayout relativeLayout7, @NonNull TextView textView8, @NonNull TextView textView9, @NonNull FrameLayout frameLayout, @NonNull TextView textView10, @NonNull View view, @NonNull Button button) {
        this.a = relativeLayout;
        this.fwInfoBaseResId = relativeLayout2;
        this.fwInfoBaseResSt = textView;
        this.fwInfoBaseResVer = textView2;
        this.fwInfoFontId = relativeLayout3;
        this.fwInfoFontVer = textView3;
        this.fwInfoFontVerSt = textView4;
        this.fwInfoFwLt = relativeLayout4;
        this.fwInfoFwSt = textView5;
        this.fwInfoFwTop = relativeLayout5;
        this.fwInfoFwVer = textView6;
        this.fwInfoGpsId = relativeLayout6;
        this.fwInfoGpsSt = textView7;
        this.fwInfoResId = relativeLayout7;
        this.fwInfoResSt = textView8;
        this.fwInfoResVer = textView9;
        this.fwTipsContainer = frameLayout;
        this.fwUpgradeLog = textView10;
        this.fwUpgradeMaskView = view;
        this.miliFwInfoUpgradeNowBt = button;
    }

    @NonNull
    public static ActivityFwInfoBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.fw_info_base_res_id;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
        if (relativeLayout != null) {
            i = R.id.fw_info_base_res_st;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.fw_info_base_res_ver;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = R.id.fw_info_font_id;
                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                    if (relativeLayout2 != null) {
                        i = R.id.fw_info_font_ver;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView3 != null) {
                            i = R.id.fw_info_font_ver_st;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView4 != null) {
                                i = R.id.fw_info_fw_lt;
                                RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                if (relativeLayout3 != null) {
                                    i = R.id.fw_info_fw_st;
                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView5 != null) {
                                        i = R.id.fw_info_fw_top;
                                        RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                        if (relativeLayout4 != null) {
                                            i = R.id.fw_info_fw_ver;
                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView6 != null) {
                                                i = R.id.fw_info_gps_id;
                                                RelativeLayout relativeLayout5 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                                if (relativeLayout5 != null) {
                                                    i = R.id.fw_info_gps_st;
                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView7 != null) {
                                                        i = R.id.fw_info_res_id;
                                                        RelativeLayout relativeLayout6 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                                        if (relativeLayout6 != null) {
                                                            i = R.id.fw_info_res_st;
                                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(view, i);
                                                            if (textView8 != null) {
                                                                i = R.id.fw_info_res_ver;
                                                                TextView textView9 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                if (textView9 != null) {
                                                                    i = R.id.fw_tips_container;
                                                                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                                                    if (frameLayout != null) {
                                                                        i = R.id.fw_upgrade_log;
                                                                        TextView textView10 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                        if (textView10 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.fw_upgrade_mask_view))) != null) {
                                                                            i = R.id.mili_fw_info_upgrade_now_bt;
                                                                            Button button = (Button) ViewBindings.findChildViewById(view, i);
                                                                            if (button != null) {
                                                                                return new ActivityFwInfoBinding((RelativeLayout) view, relativeLayout, textView, textView2, relativeLayout2, textView3, textView4, relativeLayout3, textView5, relativeLayout4, textView6, relativeLayout5, textView7, relativeLayout6, textView8, textView9, frameLayout, textView10, viewFindChildViewById, button);
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
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityFwInfoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityFwInfoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_fw_info, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.a;
    }
}
