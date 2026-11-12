package com.huawei.health.ecologydevice.ui.measure.fragment.ropefragment;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.btsportdevice.callback.MessageOrStateCallback;
import com.huawei.ecologydevice.R;
import com.huawei.health.ecologydevice.ui.dialog.RopeSkipEnterNumberDialog;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.numberpicker.HealthNumberPicker;
import com.huawei.ui.commonui.popupview.PopViewList;
import com.huawei.ui.commonui.timepicker.HealthHourSecondNumberPicker;
import defpackage.emh;
import defpackage.era;
import defpackage.esn;
import defpackage.etl;
import defpackage.qpx;
import health.compact.a.LanguageUtil;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class RopeSkipIntermittentSettingFragment extends RopeSkipSettingBaseFragment {
    private static final int EXERCISE_EACH_GROUP_TIMES_DEFAULT = 100;
    private static final String EXERCISE_TIMES_EACH_GROUP_TYPE = "exercise_times_each_group_type";
    private static final String EXERCISE_TIME_EACH_GROUP_TYPE = "exercise_time_each_group_type";
    private static final int GROUP_DEFAULT = 5;
    private static final int GROUP_MAX = 20;
    private static final int GROUP_MIN = 2;
    private static final String GROUP_TYPE = "group_type";
    private static final float MAX_HOUR = 1.5f;
    private static final int MAX_HOUR_HIGH = 3;
    private static final int MAX_NUMBER = 20000;
    private static final int MAX_TIME = 5400;
    private static final int MAX_TIME_HIGH = 10800;
    private static final int NUMBER_TEN_THOUSAND = 2;
    private static final int QUERY_INTERMITTENT_JUMP_SETTING = 16;
    private static final String REST_EACH_GROUP_TYPE = "rest_each_group_type";
    private static final int SELECT_DATE_DEFAULT = 60;
    private static final int SELECT_DATE_MAX = 1800;
    private static final int SELECT_DATE_MAX_HIGH = 3600;
    private static final int SELECT_DATE_MIN = 30;
    private static final int SELECT_REST_DATE_MAX = 900;
    private static final int SELECT_REST_DATE_MIN = 5;
    private static final int TIMES_MODE = 1;
    private static final int TIME_MODE = 0;
    private int mIntermittentMode;
    protected HealthButton mStartSkipButton;
    protected HealthTextView mTipHealthTextView;
    private int mTimeExerciseEachGroup = 60;
    private int mTimeRestEachGroup = 60;
    private int mExerciseEachGroupNumber = 100;
    private int mExerciseGroups = 5;

    static /* synthetic */ void lambda$showSetTargetTimeDialog$2(View view) {
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.ropefragment.RopeSkipSettingBaseFragment
    public void initView(View view) {
        super.initView(view);
        this.mTipHealthTextView = (HealthTextView) view.findViewById(R.id.voice_settings_tips);
        this.mStartSkipButton = (HealthButton) view.findViewById(R.id.rope_device_btn_start_training);
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.ropefragment.RopeSkipSettingBaseFragment
    public void initData() {
        setTitle(getString(R.string.IDS_rope_customization));
        setMarginTop();
        super.initData();
        this.mStartSkipButton.setVisibility(0);
        this.mStartSkipButton.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.ropefragment.RopeSkipIntermittentSettingFragment$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m1069x7831ea2f(view);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$initData$0$com-huawei-health-ecologydevice-ui-measure-fragment-ropefragment-RopeSkipIntermittentSettingFragment, reason: not valid java name */
    /* synthetic */ void m1069x7831ea2f(View view) {
        LogUtil.a("RopeSkipSettingBaseFragment", "start skip");
        startIndoorEquipDisplay();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.ropefragment.RopeSkipSettingBaseFragment
    /* JADX INFO: renamed from: setItemClickListener */
    public void m1074x1c99b493(View view, int i, etl etlVar) {
        byte b2;
        if (etlVar == null || etlVar.a() == 1) {
            return;
        }
        String strD = etlVar.d();
        strD.hashCode();
        switch (strD) {
            case "intermitmode_type":
                b2 = 0;
                break;
            case "exercise_time_each_group_type":
                b2 = 1;
                break;
            case "rest_each_group_type":
                b2 = 2;
                break;
            case "exercise_times_each_group_type":
                b2 = 3;
                break;
            case "group_type":
                b2 = 4;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            showIntermitmodeSelectMenu(view);
            return;
        }
        if (b2 == 1) {
            showSetTargetTimeDialog(R.string.IDS_rope_exercise_each_group, i, etlVar.d(), 30, era.j(emh.b().i()) ? 3600 : 1800);
            return;
        }
        if (b2 == 2) {
            showSetTargetTimeDialog(R.string.IDS_rope_rest_each_group, i, etlVar.d(), 5, 900);
            return;
        }
        if (b2 == 3) {
            showSetTargetTimesDialog(i);
        } else if (b2 == 4) {
            showGroupsSetting(i);
        } else {
            LogUtil.a("RopeSkipSettingBaseFragment", "setItemClickListener settingType is null");
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.ropefragment.RopeSkipSettingBaseFragment
    public void initSettingsData() {
        emh.b().b("RopeSkipSettingBaseFragment", (MessageOrStateCallback) this, false);
        emh.b().b(3, 0, new int[]{16});
        setTimeModeData(0);
        setAdapterData();
    }

    private void setTimeModeData(int i) {
        int i2;
        String quantityString;
        String str;
        this.mIntermittentMode = i;
        this.mSettingsItemBeanArrayList.clear();
        etl itemBean = getItemBean(6, R.string.IDS_rope_intermittent_mode, getString(i == 0 ? R.string.IDS_rope_time_mode : R.string.IDS_rope_times_mode), R.drawable.list_item_background_single_normal);
        itemBean.e("intermitmode_type");
        this.mSettingsItemBeanArrayList.add(itemBean);
        this.mSettingsItemBeanArrayList.add(getDividerItemBean());
        if (i == 0) {
            i2 = R.string.IDS_rope_exercise_each_group;
            int i3 = this.mTimeExerciseEachGroup;
            if (i3 == 0) {
                i3 = 60;
            }
            this.mTimeExerciseEachGroup = i3;
            quantityString = esn.c(i3);
            str = EXERCISE_TIME_EACH_GROUP_TYPE;
        } else {
            i2 = R.string.IDS_rope_exercises_of_group;
            int i4 = this.mExerciseEachGroupNumber;
            if (i4 == 0) {
                i4 = 100;
            }
            this.mExerciseEachGroupNumber = i4;
            Resources resources = getResources();
            int i5 = R.plurals.IDS_indoor_skipper_number_unit_value;
            int i6 = this.mExerciseEachGroupNumber;
            quantityString = resources.getQuantityString(i5, i6, Integer.valueOf(i6));
            str = EXERCISE_TIMES_EACH_GROUP_TYPE;
        }
        etl itemBean2 = getItemBean(6, i2, quantityString, R.drawable.list_item_background_top_normal);
        itemBean2.e(str);
        this.mSettingsItemBeanArrayList.add(itemBean2);
        etl itemBean3 = getItemBean(6, R.string.IDS_rope_rest_each_group, esn.c(this.mTimeRestEachGroup), R.color.emui_card_panel_bg);
        itemBean3.e(REST_EACH_GROUP_TYPE);
        this.mSettingsItemBeanArrayList.add(itemBean3);
        etl itemBean4 = getItemBean(6, R.string.IDS_rope_number_of_groups, String.valueOf(this.mExerciseGroups), R.drawable.list_item_background_bottom_normal);
        itemBean4.e(GROUP_TYPE);
        this.mSettingsItemBeanArrayList.add(itemBean4);
        refreshView();
    }

    private void refreshView() {
        String strValueOf;
        int i;
        if (this.mIntermittentMode == 0) {
            int i2 = this.mTimeExerciseEachGroup;
            int i3 = this.mTimeRestEachGroup;
            int i4 = this.mExerciseGroups;
            if (era.j(emh.b().i())) {
                strValueOf = String.valueOf(3);
                i = MAX_TIME_HIGH;
            } else {
                strValueOf = String.valueOf(MAX_HOUR);
                i = MAX_TIME;
            }
            if ((i2 + i3) * i4 > i) {
                refreshDataEnableView(getQuantityStr(R.plurals.IDS_rope_max_time_within, i, strValueOf));
                return;
            } else {
                refreshDataDisableView();
                return;
            }
        }
        if (this.mExerciseEachGroupNumber * this.mExerciseGroups > 20000) {
            int i5 = LanguageUtil.f(BaseApplication.getContext()) ? 2 : 20000;
            refreshDataEnableView(getQuantityStr(R.plurals.IDS_rope_max_number_within, i5, String.valueOf(i5)));
        } else {
            refreshDataDisableView();
        }
    }

    private void refreshDataEnableView(String str) {
        this.mTipHealthTextView.setVisibility(0);
        this.mTipHealthTextView.setText(str);
        this.mStartSkipButton.setClickable(false);
        this.mStartSkipButton.setTextColor(getResources().getColor(R.color.common_colorAccent_disabled));
    }

    private void refreshDataDisableView() {
        this.mTipHealthTextView.setVisibility(8);
        this.mStartSkipButton.setClickable(true);
        this.mStartSkipButton.setTextColor(getResources().getColor(R.color.common_colorAccent));
    }

    private void showIntermitmodeSelectMenu(View view) {
        ArrayList arrayList = new ArrayList(Arrays.asList(getResources().getString(R.string.IDS_rope_time_mode), getResources().getString(R.string.IDS_rope_times_mode)));
        new PopViewList(this.mainActivity, view, arrayList).b(new PopViewList.PopViewClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.ropefragment.RopeSkipIntermittentSettingFragment$$ExternalSyntheticLambda3
            @Override // com.huawei.ui.commonui.popupview.PopViewList.PopViewClickListener
            public final void setOnClick(int i) {
                this.f$0.m1071xf423e571(i);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$showIntermitmodeSelectMenu$1$com-huawei-health-ecologydevice-ui-measure-fragment-ropefragment-RopeSkipIntermittentSettingFragment, reason: not valid java name */
    /* synthetic */ void m1071xf423e571(int i) {
        setTimeModeData(i);
        setAdapterData();
    }

    private void showSetTargetTimeDialog(int i, final int i2, final String str, int i3, int i4) {
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this.mainActivity);
        final HealthHourSecondNumberPicker healthHourSecondNumberPicker = new HealthHourSecondNumberPicker(this.mainActivity, i3, i4, 60);
        builder.b(i).d((View) healthHourSecondNumberPicker).c(R.string.IDS_dialog_checkbox_cancel, new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.ropefragment.RopeSkipIntermittentSettingFragment$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RopeSkipIntermittentSettingFragment.lambda$showSetTargetTimeDialog$2(view);
            }
        }).d(R.string.IDS_dialog_checkbox_confirm, new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.ropefragment.RopeSkipIntermittentSettingFragment$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m1072x139fa1f5(str, healthHourSecondNumberPicker, i2, view);
            }
        });
        builder.d().show();
    }

    /* JADX INFO: renamed from: lambda$showSetTargetTimeDialog$3$com-huawei-health-ecologydevice-ui-measure-fragment-ropefragment-RopeSkipIntermittentSettingFragment, reason: not valid java name */
    /* synthetic */ void m1072x139fa1f5(String str, HealthHourSecondNumberPicker healthHourSecondNumberPicker, int i, View view) {
        if (EXERCISE_TIME_EACH_GROUP_TYPE.equals(str)) {
            int selectedTime = healthHourSecondNumberPicker.getSelectedTime();
            this.mTimeExerciseEachGroup = selectedTime;
            setDetailPosition(i, esn.c(selectedTime));
        } else {
            int selectedTime2 = healthHourSecondNumberPicker.getSelectedTime();
            this.mTimeRestEachGroup = selectedTime2;
            setDetailPosition(i, esn.c(selectedTime2));
        }
        setAdapterData();
        refreshView();
    }

    private void showSetTargetTimesDialog(final int i) {
        RopeSkipEnterNumberDialog ropeSkipEnterNumberDialogC = new RopeSkipEnterNumberDialog.d(this.mainActivity, new RopeSkipEnterNumberDialog.OnConfirmClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.ropefragment.RopeSkipIntermittentSettingFragment$$ExternalSyntheticLambda6
            @Override // com.huawei.health.ecologydevice.ui.dialog.RopeSkipEnterNumberDialog.OnConfirmClickListener
            public final void onConfirmClick(int i2) {
                this.f$0.m1073x489cb18d(i, i2);
            }
        }).c();
        if (ropeSkipEnterNumberDialogC != null) {
            ropeSkipEnterNumberDialogC.show();
        }
    }

    /* JADX INFO: renamed from: lambda$showSetTargetTimesDialog$4$com-huawei-health-ecologydevice-ui-measure-fragment-ropefragment-RopeSkipIntermittentSettingFragment, reason: not valid java name */
    /* synthetic */ void m1073x489cb18d(int i, int i2) {
        this.mExerciseEachGroupNumber = i2;
        setDetailPosition(i, getQuantityStr(R.plurals.IDS_indoor_skipper_number_unit_value, i2));
        setAdapterData();
        refreshView();
    }

    private void showGroupsSetting(int i) {
        View viewInflate = getLayoutInflater().inflate(R.layout.health_picker_setting_dialog, (ViewGroup) null);
        HealthNumberPicker healthNumberPicker = (HealthNumberPicker) viewInflate.findViewById(R.id.pause_trackline_type_picker);
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (int i3 = 2; i3 <= 20; i3++) {
            arrayList.add(String.valueOf(i3));
            if (this.mExerciseGroups == i3) {
                i2 = i3 - 2;
            }
        }
        healthNumberPicker.setDisplayedValues((String[]) arrayList.toArray(new String[arrayList.size()]));
        healthNumberPicker.setMinValue(0);
        healthNumberPicker.setMaxValue(arrayList.size() - 1);
        healthNumberPicker.setValue(i2);
        showCustomViewDialog(i, R.string.IDS_rope_number_of_groups, viewInflate, healthNumberPicker);
    }

    private void showCustomViewDialog(final int i, int i2, View view, final HealthNumberPicker healthNumberPicker) {
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this.mainActivity);
        builder.a(getString(i2)).d(view).d(R.string.IDS_dialog_checkbox_confirm, new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.ropefragment.RopeSkipIntermittentSettingFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f$0.m1070x58cf5ac9(healthNumberPicker, i, view2);
            }
        }).c(R.string.IDS_dialog_checkbox_cancel, new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.ropefragment.RopeSkipIntermittentSettingFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LogUtil.a("RopeSkipSettingBaseFragment", "cancel button is click");
            }
        });
        builder.d().show();
    }

    /* JADX INFO: renamed from: lambda$showCustomViewDialog$5$com-huawei-health-ecologydevice-ui-measure-fragment-ropefragment-RopeSkipIntermittentSettingFragment, reason: not valid java name */
    /* synthetic */ void m1070x58cf5ac9(HealthNumberPicker healthNumberPicker, int i, View view) {
        LogUtil.a("RopeSkipSettingBaseFragment", "confirm button is click");
        int value = healthNumberPicker.getValue() + 2;
        this.mExerciseGroups = value;
        setDetailPosition(i, String.valueOf(value));
        setAdapterData();
        refreshView();
    }

    private void startIndoorEquipDisplay() {
        if (!emh.b().g()) {
            LogUtil.d("RopeSkipSettingBaseFragment", "Rope Device disconnect");
            qpx.e(this.mainActivity, R.string.IDS_bolt_bluetooth_disconnected);
            return;
        }
        int i = this.mIntermittentMode;
        jumpToDisplayActivity(i == 0 ? 1 : 0, i == 0 ? this.mTimeExerciseEachGroup : 0, i == 0 ? 0 : this.mExerciseEachGroupNumber, this.mTimeRestEachGroup, this.mExerciseGroups);
        this.mainActivity.onBackPressed();
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.ropefragment.RopeSkipSettingBaseFragment
    protected void onReceiveMessage(int i, HashMap<Integer, Object> map) {
        if (i != 27) {
            return;
        }
        int iIntValue = getIntValue(map, 40055).intValue();
        this.mTimeExerciseEachGroup = iIntValue;
        this.mIntermittentMode = iIntValue == 0 ? 1 : 0;
        this.mExerciseEachGroupNumber = getIntValue(map, 40053).intValue();
        this.mTimeRestEachGroup = getIntValue(map, 40056).intValue();
        this.mExerciseGroups = getIntValue(map, 40054).intValue();
        sendEmptyHandleMessage(101);
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.ropefragment.RopeSkipSettingBaseFragment
    protected void refreshPage() {
        super.refreshPage();
        if (this.mainActivity == null) {
            LogUtil.d("RopeSkipSettingBaseFragment", "refreshPage mainActivity is null");
        } else {
            setTimeModeData(this.mIntermittentMode);
            setAdapterData();
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.ropefragment.RopeSkipSettingBaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        emh.b().a("RopeSkipSettingBaseFragment", false);
    }
}
