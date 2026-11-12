package com.xiaomi.hm.health.bodyfat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.view.CirclePageIndicator;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityInstructionScale2Binding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final CirclePageIndicator indicator;

    @NonNull
    public final OneFootInstrcutionBinding oneFootPage;

    @NonNull
    public final InstructLowBatteryBinding pageLowBattery;

    @NonNull
    public final InstructOverloadBinding pageOverMax;

    @NonNull
    public final SmallThingWeightingInstrcutionBinding smallWPage;

    @NonNull
    public final ViewPager viewPager;

    @NonNull
    public final WeightInstructBinding weightInstrcut;

    @NonNull
    public final ScaleUnitInstrcutBinding weightUnitSetting;

    private ActivityInstructionScale2Binding(@NonNull RelativeLayout relativeLayout, @NonNull CirclePageIndicator circlePageIndicator, @NonNull OneFootInstrcutionBinding oneFootInstrcutionBinding, @NonNull InstructLowBatteryBinding instructLowBatteryBinding, @NonNull InstructOverloadBinding instructOverloadBinding, @NonNull SmallThingWeightingInstrcutionBinding smallThingWeightingInstrcutionBinding, @NonNull ViewPager viewPager, @NonNull WeightInstructBinding weightInstructBinding, @NonNull ScaleUnitInstrcutBinding scaleUnitInstrcutBinding) {
        this.a = relativeLayout;
        this.indicator = circlePageIndicator;
        this.oneFootPage = oneFootInstrcutionBinding;
        this.pageLowBattery = instructLowBatteryBinding;
        this.pageOverMax = instructOverloadBinding;
        this.smallWPage = smallThingWeightingInstrcutionBinding;
        this.viewPager = viewPager;
        this.weightInstrcut = weightInstructBinding;
        this.weightUnitSetting = scaleUnitInstrcutBinding;
    }

    @NonNull
    public static ActivityInstructionScale2Binding bind(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i = R.id.indicator;
        CirclePageIndicator circlePageIndicator = (CirclePageIndicator) ViewBindings.findChildViewById(view, i);
        if (circlePageIndicator != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.one_foot_page))) != null) {
            OneFootInstrcutionBinding oneFootInstrcutionBindingBind = OneFootInstrcutionBinding.bind(viewFindChildViewById);
            i = R.id.page_low_battery;
            View viewFindChildViewById3 = ViewBindings.findChildViewById(view, i);
            if (viewFindChildViewById3 != null) {
                InstructLowBatteryBinding instructLowBatteryBindingBind = InstructLowBatteryBinding.bind(viewFindChildViewById3);
                i = R.id.page_over_max;
                View viewFindChildViewById4 = ViewBindings.findChildViewById(view, i);
                if (viewFindChildViewById4 != null) {
                    InstructOverloadBinding instructOverloadBindingBind = InstructOverloadBinding.bind(viewFindChildViewById4);
                    i = R.id.small_w_page;
                    View viewFindChildViewById5 = ViewBindings.findChildViewById(view, i);
                    if (viewFindChildViewById5 != null) {
                        SmallThingWeightingInstrcutionBinding smallThingWeightingInstrcutionBindingBind = SmallThingWeightingInstrcutionBinding.bind(viewFindChildViewById5);
                        i = R.id.view_pager;
                        ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, i);
                        if (viewPager != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.weight_instrcut))) != null) {
                            WeightInstructBinding weightInstructBindingBind = WeightInstructBinding.bind(viewFindChildViewById2);
                            i = R.id.weight_unit_setting;
                            View viewFindChildViewById6 = ViewBindings.findChildViewById(view, i);
                            if (viewFindChildViewById6 != null) {
                                return new ActivityInstructionScale2Binding((RelativeLayout) view, circlePageIndicator, oneFootInstrcutionBindingBind, instructLowBatteryBindingBind, instructOverloadBindingBind, smallThingWeightingInstrcutionBindingBind, viewPager, weightInstructBindingBind, ScaleUnitInstrcutBinding.bind(viewFindChildViewById6));
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityInstructionScale2Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityInstructionScale2Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_instruction_scale2, viewGroup, false);
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
