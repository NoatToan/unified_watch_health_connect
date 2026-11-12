package com.huami.account.userinfo.ui;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.account.userinfo.R;
import com.huami.account.userinfo.ui.PersonInfoSettingWeightFragment;
import com.huami.account.userinfo.utils.WeightUtil;
import com.huami.tools.log.HMLog;
import com.huami.widget.wheelview.OnWheelScrollListener;
import com.huami.widget.wheelview.WheelView;
import com.huami.widget.wheelview.adapters.PickAdapter;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated(message = "使用体重模块提供的选择器，类名同名")
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0012\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0014J\b\u0010\u000e\u001a\u00020\rH\u0014J\b\u0010\u000f\u001a\u00020\rH\u0014R\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/huami/account/userinfo/ui/PersonInfoSettingWeightFragment;", "Lcom/huami/account/userinfo/ui/PersonInfoSettingBaseFragment;", "Lcom/huami/widget/wheelview/WheelView;", "wheelInt", "wheelDecimal", "", "l", hl.k, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/View;", "initView", "", "hasPadding", "hasBackground", "", "i", LogUtil.I, "mWeightUnit", "<init>", "()V", "Companion", "userinfo_release"}, k = 1, mv = {1, 5, 1})
public final class PersonInfoSettingWeightFragment extends PersonInfoSettingBaseFragment {

    @NotNull
    private static final String j = "PersonInfoSettingWeightFragment";

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private int mWeightUnit;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(PersonInfoSettingWeightFragment personInfoSettingWeightFragment, WheelView wheelView, WheelView wheelView2, View view) {
        personInfoSettingWeightFragment.l(wheelView, wheelView2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(PersonInfoSettingWeightFragment personInfoSettingWeightFragment, View view) {
        personInfoSettingWeightFragment.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(PersonInfoSettingWeightFragment personInfoSettingWeightFragment, View view) {
        personInfoSettingWeightFragment.dismiss();
    }

    private final void k(WheelView wheelInt, WheelView wheelDecimal) {
        float fConvertFromKg;
        PickAdapter pickAdapter;
        final WheelView wheelView;
        float weight = getMUserInfo().getWeight();
        if (weight > 0.0f) {
            int i = this.mWeightUnit;
            fConvertFromKg = i == 17 ? WeightUtil.INSTANCE.convertFromKg(weight, i) : WeightUtil.INSTANCE.convertFromKg(weight - 3, i);
        } else {
            fConvertFromKg = WeightUtil.INSTANCE.convertFromKg(57.0f, this.mWeightUnit);
        }
        int i2 = (int) fConvertFromKg;
        HMLog.d(j, Intrinsics.stringPlus(" max currentItem ", Integer.valueOf(i2)), new Object[0]);
        WeightUtil weightUtil = WeightUtil.INSTANCE;
        int iConvertFromKg = (int) weightUtil.convertFromKg(3.0f, this.mWeightUnit);
        int iConvertFromKg2 = (int) weightUtil.convertFromKg(634.0f, this.mWeightUnit);
        FragmentActivity activity = getActivity();
        int color = getResources().getColor(GlobalConfig.get().isBuildMidong() ? R.color.p4 : R.color.s15);
        Resources resources = getResources();
        int i3 = R.color.s2;
        int color2 = resources.getColor(i3);
        Resources resources2 = getResources();
        int i4 = R.color.s3;
        wheelInt.setCenterStyle("", 25.0f).setViewAdapter(new PickAdapter(activity, iConvertFromKg, iConvertFromKg2, wheelInt, color, color2, resources2.getColor(i4), false, 46, 20, 20, 15, 1, 0)).setCurrentItem(i2);
        wheelInt.setCenterDrawable(R.drawable.wheel_view_select_bg_start);
        if (GlobalConfig.get().isBuildMidong()) {
            wheelInt.setStyle(WheelView.Style.NORMAL);
        }
        final PersonInfoSettingWeightFragment personInfoSettingWeightFragment = this;
        PickAdapter pickAdapter2 = new PickAdapter(getActivity(), 0, personInfoSettingWeightFragment.mWeightUnit == 17 ? 13 : 9, wheelDecimal, getResources().getColor(GlobalConfig.get().isBuildMidong() ? R.color.p4 : R.color.s15), getResources().getColor(i3), getResources().getColor(i4), false, 46, 24, 21, 21, 1, 0);
        if (personInfoSettingWeightFragment.mWeightUnit == 17) {
            pickAdapter = pickAdapter2;
            pickAdapter.setMode(25);
        } else {
            pickAdapter = pickAdapter2;
            pickAdapter.setMode(19);
        }
        if (weightUtil.convertFromKg(weight, personInfoSettingWeightFragment.mWeightUnit) < iConvertFromKg2) {
            HMLog.d(j, " < max", new Object[0]);
            HMLog.d(j, Intrinsics.stringPlus(" max weight: ", Integer.valueOf(iConvertFromKg2)), new Object[0]);
            int iScaleFloat = ((int) (weightUtil.scaleFloat(weightUtil.convertFromKg(weight, personInfoSettingWeightFragment.mWeightUnit), 1) * 10)) - (((int) weightUtil.convertFromKg(weight, personInfoSettingWeightFragment.mWeightUnit)) * 10);
            if (personInfoSettingWeightFragment.mWeightUnit == 17) {
                iScaleFloat = ((int) (weightUtil.convertFromKg(weight, 1) + 0.5f)) % 14;
            }
            wheelDecimal.setCenterStyle(weightUtil.toUnitStr(personInfoSettingWeightFragment.mWeightUnit), R.color.s15, 25.0f).setViewAdapter(pickAdapter).setCurrentItem(iScaleFloat);
            HMLog.d(j, Intrinsics.stringPlus("raw ", Float.valueOf(weight)), new Object[0]);
            HMLog.d(j, Intrinsics.stringPlus("to unit ", Float.valueOf(weightUtil.convertFromKg(weight, personInfoSettingWeightFragment.mWeightUnit))), new Object[0]);
            wheelView = wheelDecimal;
        } else {
            HMLog.d(j, " >= max", new Object[0]);
            wheelView = wheelDecimal;
            PickAdapter pickAdapter3 = new PickAdapter(getActivity(), 0, 0, wheelView, getResources().getColor(GlobalConfig.get().isBuildMidong() ? R.color.p4 : R.color.s15), getResources().getColor(i3), getResources().getColor(i4), false, 46, 20, 20, 15, 1, 0);
            pickAdapter3.setMode(19);
            personInfoSettingWeightFragment = this;
            wheelView.setCenterStyle(weightUtil.toUnitStr(personInfoSettingWeightFragment.mWeightUnit), R.color.s15, 25.0f).setViewAdapter(pickAdapter3).setCurrentItem(((int) (weightUtil.convertFromKg(weight, personInfoSettingWeightFragment.mWeightUnit) * 10)) - (((int) weightUtil.convertFromKg(weight, personInfoSettingWeightFragment.mWeightUnit)) * 10));
        }
        wheelView.setCenterDrawable(R.drawable.wheel_view_select_bg_end);
        if (GlobalConfig.get().isBuildMidong()) {
            wheelView.setStyle(WheelView.Style.NORMAL);
        }
        final PickAdapter pickAdapter4 = pickAdapter;
        wheelInt.addScrollingListener(new OnWheelScrollListener() { // from class: com.huami.account.userinfo.ui.PersonInfoSettingWeightFragment$initWheel$1
            @Override // com.huami.widget.wheelview.OnWheelScrollListener
            public void onScrollingFinished(@NotNull WheelView wheel) {
                HMLog.d("PersonInfoSettingWeightFragment", Intrinsics.stringPlus("item ", Integer.valueOf(wheel.getCurrentItem())), new Object[0]);
                WeightUtil weightUtil2 = WeightUtil.INSTANCE;
                HMLog.d("PersonInfoSettingWeightFragment", Intrinsics.stringPlus("maxByUnit = ", Float.valueOf(weightUtil2.convertFromKg(632.0f, this.a.mWeightUnit))), new Object[0]);
                try {
                    if (wheel.getCurrentItem() == ((int) weightUtil2.convertFromKg(632.0f, this.a.mWeightUnit))) {
                        HMLog.d("PersonInfoSettingWeightFragment", " should refresh when max", new Object[0]);
                        FragmentActivity activity2 = this.a.getActivity();
                        WheelView wheelView2 = wheelView;
                        Resources resources3 = this.a.getResources();
                        int i5 = R.color.s15;
                        PickAdapter pickAdapter5 = new PickAdapter(activity2, 0, 0, wheelView2, resources3.getColor(i5), this.a.getResources().getColor(R.color.s2), this.a.getResources().getColor(R.color.s1), false, 46, 20, 20, 15, 1, 0);
                        pickAdapter5.setMode(19);
                        wheelView.setCenterStyle(weightUtil2.toUnitStr(this.a.mWeightUnit), i5, 25.0f).setViewAdapter(pickAdapter5).setCurrentItem(0);
                    } else {
                        wheelView.setViewAdapter(pickAdapter4).setCenterStyle(weightUtil2.toUnitStr(this.a.mWeightUnit), R.color.s15, 25.0f);
                        if (GlobalConfig.get().isBuildMidong()) {
                            wheelView.setStyle(WheelView.Style.NORMAL);
                        }
                    }
                    if (GlobalConfig.get().isBuildMidong()) {
                        wheelView.setStyle(WheelView.Style.NORMAL);
                    }
                    wheelView.setCenterDrawable(R.drawable.wheel_view_select_bg_end);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override // com.huami.widget.wheelview.OnWheelScrollListener
            public void onScrollingStarted(@NotNull WheelView wheel) {
            }
        });
    }

    private final void l(WheelView wheelInt, WheelView wheelDecimal) {
        float currentItem;
        float currentItem2;
        int i = this.mWeightUnit;
        if (i == 1) {
            currentItem = wheelInt.getCurrentItem() + (wheelDecimal.getCurrentItem() / 10);
            currentItem2 = 6;
        } else if (i != 17) {
            currentItem = wheelInt.getCurrentItem() + (wheelDecimal.getCurrentItem() / 10);
            currentItem2 = WeightUtil.INSTANCE.convertFromKg(3.0f, this.mWeightUnit);
        } else {
            currentItem = wheelInt.getCurrentItem();
            currentItem2 = wheelDecimal.getCurrentItem() / 14;
        }
        getMUserInfo().setWeight(WeightUtil.INSTANCE.convertToKg(currentItem + currentItem2, this.mWeightUnit));
        updatePersonInfoParam(q.mapOf(TuplesKt.to("weight", String.valueOf(getMUserInfo().getWeight()))));
        dismiss();
    }

    @Override // com.huami.account.userinfo.ui.PersonInfoSettingBaseFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    public boolean hasBackground() {
        return false;
    }

    @Override // com.huami.account.userinfo.ui.PersonInfoSettingBaseFragment, com.huami.android.design.dialog.BaseDialogFragment
    public boolean hasPadding() {
        return true;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    @NotNull
    public View initView() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.user_info_fragment_person_info_setting_weight, (ViewGroup) null);
        final WheelView wheelView = (WheelView) viewInflate.findViewById(R.id.setting_weight_int_wheel);
        final WheelView wheelView2 = (WheelView) viewInflate.findViewById(R.id.setting_weight_decimal_wheel);
        k(wheelView, wheelView2);
        viewInflate.findViewById(R.id.weight_btn_save).setOnClickListener(new View.OnClickListener() { // from class: cv5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PersonInfoSettingWeightFragment.h(this.a, wheelView, wheelView2, view);
            }
        });
        viewInflate.findViewById(R.id.weight_btn_cancel).setOnClickListener(new View.OnClickListener() { // from class: bv5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PersonInfoSettingWeightFragment.i(this.a, view);
            }
        });
        viewInflate.findViewById(R.id.dlg_empty_area_btn).setOnClickListener(new View.OnClickListener() { // from class: av5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PersonInfoSettingWeightFragment.j(this.a, view);
            }
        });
        return viewInflate;
    }

    @Override // com.huami.account.userinfo.ui.PersonInfoSettingBaseFragment, com.huami.android.design.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.mWeightUnit = HMPersonInfo.getInstance().getMiliConfig().getWeightUnit();
    }
}
