package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.huami.devicex.R;
import com.xiaomi.hm.health.view.indicator.CirclePageIndicator;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityInstructionWeightBfsBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final CirclePageIndicator indicator;

    @NonNull
    public final View oneFootPage;

    @NonNull
    public final RelativeLayout page2Layout;

    @NonNull
    public final RelativeLayout page3Layout;

    @NonNull
    public final RelativeLayout page3LayoutNoJin;

    @NonNull
    public final RelativeLayout pageLowBattery;

    @NonNull
    public final RelativeLayout pageOverMax;

    @NonNull
    public final View smallWPage;

    @NonNull
    public final ViewPager viewPager;

    private ActivityInstructionWeightBfsBinding(@NonNull RelativeLayout relativeLayout, @NonNull CirclePageIndicator circlePageIndicator, @NonNull View view, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3, @NonNull RelativeLayout relativeLayout4, @NonNull RelativeLayout relativeLayout5, @NonNull RelativeLayout relativeLayout6, @NonNull View view2, @NonNull ViewPager viewPager) {
        this.a = relativeLayout;
        this.indicator = circlePageIndicator;
        this.oneFootPage = view;
        this.page2Layout = relativeLayout2;
        this.page3Layout = relativeLayout3;
        this.page3LayoutNoJin = relativeLayout4;
        this.pageLowBattery = relativeLayout5;
        this.pageOverMax = relativeLayout6;
        this.smallWPage = view2;
        this.viewPager = viewPager;
    }

    @NonNull
    public static ActivityInstructionWeightBfsBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i = R.id.indicator;
        CirclePageIndicator circlePageIndicator = (CirclePageIndicator) ViewBindings.findChildViewById(view, i);
        if (circlePageIndicator != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.one_foot_page))) != null) {
            i = R.id.page_2_layout;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
            if (relativeLayout != null) {
                i = R.id.page_3_layout;
                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                if (relativeLayout2 != null) {
                    i = R.id.page_3_layout_no_jin;
                    RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                    if (relativeLayout3 != null) {
                        i = R.id.page_low_battery;
                        RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                        if (relativeLayout4 != null) {
                            i = R.id.page_over_max;
                            RelativeLayout relativeLayout5 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                            if (relativeLayout5 != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.small_w_page))) != null) {
                                i = R.id.view_pager;
                                ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, i);
                                if (viewPager != null) {
                                    return new ActivityInstructionWeightBfsBinding((RelativeLayout) view, circlePageIndicator, viewFindChildViewById, relativeLayout, relativeLayout2, relativeLayout3, relativeLayout4, relativeLayout5, viewFindChildViewById2, viewPager);
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
    public static ActivityInstructionWeightBfsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityInstructionWeightBfsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_instruction_weight_bfs, viewGroup, false);
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
