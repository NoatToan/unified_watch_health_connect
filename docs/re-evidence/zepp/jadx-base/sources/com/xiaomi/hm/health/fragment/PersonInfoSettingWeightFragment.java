package com.xiaomi.hm.health.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huami.tools.log.HMLog;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.wheelview.OnWheelScrollListener;
import com.huami.widget.wheelview.WheelView;
import com.huami.widget.wheelview.adapters.PickAdapter;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.model.account.HMPersonInfo;

/* JADX INFO: loaded from: classes21.dex */
@Deprecated
public class PersonInfoSettingWeightFragment extends PersonInfoSettingBaseFragment {
    private static final String f = "PersonInfoSettingWeightFragment";
    private int e;

    public class a implements OnWheelScrollListener {
        public final /* synthetic */ WheelView a;
        public final /* synthetic */ PickAdapter b;

        public a(final WheelView val$wheelDecimal, final PickAdapter val$decimalAdapter) {
            this.a = val$wheelDecimal;
            this.b = val$decimalAdapter;
        }

        @Override // com.huami.widget.wheelview.OnWheelScrollListener
        public void onScrollingFinished(WheelView wheel) {
            HMLog.d(PersonInfoSettingWeightFragment.f, "item " + wheel.getCurrentItem(), new Object[0]);
            HMLog.d(PersonInfoSettingWeightFragment.f, "maxByUnit = " + HMWeightUtils.convertFromKg(632.0f, PersonInfoSettingWeightFragment.this.e), new Object[0]);
            try {
                if (wheel.getCurrentItem() == ((int) HMWeightUtils.convertFromKg(632.0f, PersonInfoSettingWeightFragment.this.e))) {
                    HMLog.d(PersonInfoSettingWeightFragment.f, " should refresh when max", new Object[0]);
                    PickAdapter pickAdapter = new PickAdapter(PersonInfoSettingWeightFragment.this.getActivity(), 0, 0, this.a, PersonInfoSettingWeightFragment.this.getResources().getColor(R.color.s15), PersonInfoSettingWeightFragment.this.getResources().getColor(R.color.s2), PersonInfoSettingWeightFragment.this.getResources().getColor(R.color.s1), false, 46, 20, 20, 15, 1, 0);
                    pickAdapter.setMode(19);
                    this.a.setCenterStyle(HMWeightUtils.toUnitStr(PersonInfoSettingWeightFragment.this.getContext(), PersonInfoSettingWeightFragment.this.e), R.color.s15, 25.0f).setViewAdapter(pickAdapter).setCurrentItem(0);
                } else {
                    this.a.setViewAdapter(this.b).setCenterStyle(HMWeightUtils.toUnitStr(PersonInfoSettingWeightFragment.this.getContext(), PersonInfoSettingWeightFragment.this.e), R.color.s15, 25.0f);
                    if (GlobalConfig.get().isBuildMidong()) {
                        this.a.setStyle(WheelView.Style.NORMAL);
                    }
                }
                if (GlobalConfig.get().isBuildMidong()) {
                    this.a.setStyle(WheelView.Style.NORMAL);
                }
                this.a.setCenterDrawable(R.drawable.wheel_view_select_bg_end);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // com.huami.widget.wheelview.OnWheelScrollListener
        public void onScrollingStarted(WheelView wheel) {
        }
    }

    private void h(final WheelView wheelInt, final WheelView wheelDecimal) {
        float fConvertFromKg;
        PickAdapter pickAdapter;
        PersonInfoSettingWeightFragment personInfoSettingWeightFragment;
        WheelView wheelView;
        float weight = this.mUserInfo.getWeight();
        if (weight > 0.0f) {
            int i = this.e;
            fConvertFromKg = i == 17 ? HMWeightUtils.convertFromKg(weight, i) : HMWeightUtils.convertFromKg(weight - 3.0f, i);
        } else {
            fConvertFromKg = HMWeightUtils.convertFromKg(57.0f, this.e);
        }
        int i2 = (int) fConvertFromKg;
        HMLog.d(f, " max currentItem " + i2, new Object[0]);
        int iConvertFromKg = (int) HMWeightUtils.convertFromKg(3.0f, this.e);
        int iConvertFromKg2 = (int) HMWeightUtils.convertFromKg(634.0f, this.e);
        wheelInt.setCenterStyle("", 25.0f).setViewAdapter(new PickAdapter(getActivity(), iConvertFromKg, iConvertFromKg2, wheelInt, getResources().getColor(GlobalConfig.get().isBuildMidong() ? R.color.p4 : R.color.s15), getResources().getColor(R.color.s2), getResources().getColor(R.color.s3), false, 46, 20, 20, 15, 1, 0)).setCurrentItem(i2);
        wheelInt.setCenterDrawable(R.drawable.wheel_view_select_bg_start);
        if (GlobalConfig.get().isBuildMidong()) {
            wheelInt.setStyle(WheelView.Style.NORMAL);
        }
        PickAdapter pickAdapter2 = new PickAdapter(getActivity(), 0, this.e == 17 ? 13 : 9, wheelDecimal, getResources().getColor(GlobalConfig.get().isBuildMidong() ? R.color.p4 : R.color.s15), getResources().getColor(R.color.s2), getResources().getColor(R.color.s3), false, 46, 24, 21, 21, 1, 0);
        if (this.e == 17) {
            pickAdapter = pickAdapter2;
            pickAdapter.setMode(25);
        } else {
            pickAdapter = pickAdapter2;
            pickAdapter.setMode(19);
        }
        if (HMWeightUtils.convertFromKg(weight, this.e) < iConvertFromKg2) {
            HMLog.d(f, " < max", new Object[0]);
            HMLog.d(f, " max weight: " + iConvertFromKg2, new Object[0]);
            int iScaleFloat = ((int) (HMWeightUtils.scaleFloat(HMWeightUtils.convertFromKg(weight, this.e), 1) * 10.0f)) - (((int) HMWeightUtils.convertFromKg(weight, this.e)) * 10);
            if (this.e == 17) {
                iScaleFloat = ((int) (HMWeightUtils.convertFromKg(weight, 1) + 0.5f)) % 14;
            }
            wheelDecimal.setCenterStyle(HMWeightUtils.toUnitStr(getContext(), this.e), R.color.s15, 25.0f).setViewAdapter(pickAdapter).setCurrentItem(iScaleFloat);
            HMLog.d(f, "raw " + weight, new Object[0]);
            HMLog.d(f, "to unit " + HMWeightUtils.convertFromKg(weight, this.e), new Object[0]);
            personInfoSettingWeightFragment = this;
            wheelView = wheelDecimal;
        } else {
            HMLog.d(f, " >= max", new Object[0]);
            PickAdapter pickAdapter3 = new PickAdapter(getActivity(), 0, 0, wheelDecimal, getResources().getColor(GlobalConfig.get().isBuildMidong() ? R.color.p4 : R.color.s15), getResources().getColor(R.color.s2), getResources().getColor(R.color.s3), false, 46, 20, 20, 15, 1, 0);
            pickAdapter3.setMode(19);
            personInfoSettingWeightFragment = this;
            wheelView = wheelDecimal;
            wheelView.setCenterStyle(HMWeightUtils.toUnitStr(getContext(), personInfoSettingWeightFragment.e), R.color.s15, 25.0f).setViewAdapter(pickAdapter3).setCurrentItem(((int) (HMWeightUtils.convertFromKg(weight, personInfoSettingWeightFragment.e) * 10.0f)) - (((int) HMWeightUtils.convertFromKg(weight, personInfoSettingWeightFragment.e)) * 10));
        }
        wheelView.setCenterDrawable(R.drawable.wheel_view_select_bg_end);
        if (GlobalConfig.get().isBuildMidong()) {
            wheelView.setStyle(WheelView.Style.NORMAL);
        }
        wheelInt.addScrollingListener(personInfoSettingWeightFragment.new a(wheelView, pickAdapter));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(WheelView wheelView, WheelView wheelView2, View view) {
        l(wheelView, wheelView2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(View view) {
        dismiss();
    }

    private void l(WheelView wheelInt, WheelView wheelDecimal) {
        float currentItem;
        float currentItem2;
        PersonInfoSettingBaseFragment.OnAddNewUserDataChangeListener onAddNewUserDataChangeListener;
        int i = this.e;
        if (i == 1) {
            currentItem = wheelInt.getCurrentItem() + (wheelDecimal.getCurrentItem() / 10.0f);
            currentItem2 = 6.0f;
        } else if (i != 17) {
            currentItem = wheelInt.getCurrentItem() + (wheelDecimal.getCurrentItem() / 10.0f);
            currentItem2 = HMWeightUtils.convertFromKg(3.0f, this.e);
        } else {
            currentItem = wheelInt.getCurrentItem();
            currentItem2 = wheelDecimal.getCurrentItem() / 14.0f;
        }
        this.mUserInfo.setWeight(HMWeightUtils.convertToKg(currentItem + currentItem2, this.e));
        if (!this.mIsAddNew || (onAddNewUserDataChangeListener = this.mAddNewListener) == null) {
            save(2);
            PersonInfoSettingBaseFragment.OnDataChangeListener onDataChangeListener = this.mListener;
            if (onDataChangeListener != null) {
                onDataChangeListener.onChange();
            }
        } else {
            onAddNewUserDataChangeListener.onChange(this.mUserInfo);
        }
        dismiss();
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    public boolean hasBackground() {
        return false;
    }

    @Override // com.xiaomi.hm.health.fragment.PersonInfoSettingBaseFragment, com.huami.android.design.dialog.BaseDialogFragment
    public boolean hasPadding() {
        return true;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    public View initView() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.fragment_person_info_setting_weight, (ViewGroup) null);
        final WheelView wheelView = (WheelView) viewInflate.findViewById(R.id.setting_weight_int_wheel);
        final WheelView wheelView2 = (WheelView) viewInflate.findViewById(R.id.setting_weight_decimal_wheel);
        h(wheelView, wheelView2);
        viewInflate.findViewById(R.id.weight_btn_save).setOnClickListener(new View.OnClickListener() { // from class: fv5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.i(wheelView, wheelView2, view);
            }
        });
        viewInflate.findViewById(R.id.weight_btn_cancel).setOnClickListener(new View.OnClickListener() { // from class: ev5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.j(view);
            }
        });
        viewInflate.findViewById(R.id.dlg_empty_area_btn).setOnClickListener(new View.OnClickListener() { // from class: dv5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.k(view);
            }
        });
        return viewInflate;
    }

    @Override // com.xiaomi.hm.health.fragment.PersonInfoSettingBaseFragment, com.huami.android.design.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int weightUnit = HMPersonInfo.getInstance().getMiliConfig().getWeightUnit();
        this.e = weightUnit;
        if (weightUnit == -1) {
            if (Language.isSimplifiedChinese()) {
                this.e = 16;
            } else if (Language.isUSA()) {
                this.e = 1;
            } else {
                this.e = 0;
            }
            HMPersonInfo.getInstance().getMiliConfig().setWeightUnit(this.e);
        }
    }
}
