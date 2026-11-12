package com.huawei.health.suggestion.customizecourse.manager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.customizecourse.manager.adapter.FitnessEditListMoreAdapter;
import com.huawei.health.suggestion.customizecourse.manager.model.CourseConfig;
import com.huawei.health.suggestion.model.customcourse.IntensityHeartRateRange;
import com.huawei.health.suggestion.model.customcourse.IntensityHeartRateSection;
import com.huawei.health.suggestion.model.customcourse.IntensityPace;
import com.huawei.health.suggestion.model.customcourse.IntensityPaceSection;
import com.huawei.health.suggestion.model.customcourse.IntensityStepRate;
import com.huawei.health.suggestion.model.customcourse.TargetCalorie;
import com.huawei.health.suggestion.model.customcourse.TargetDistance;
import com.huawei.health.suggestion.model.customcourse.TargetHeartRate;
import com.huawei.health.suggestion.model.customcourse.TypeConfig;
import com.huawei.health.suggestion.ui.run.adapter.ChoiceDataAdapter;
import com.huawei.health.suggestion.ui.run.holder.RadioViewHolder;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.pluginfitnessadvice.AtomicAction;
import com.huawei.pluginfitnessadvice.ChoreographedMultiActions;
import com.huawei.pluginfitnessadvice.ChoreographedSingleAction;
import com.huawei.pluginfitnessadvice.TargetConfig;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.numberpicker.HealthMultiNumberPicker;
import com.huawei.ui.commonui.numberpicker.HealthNumberPicker;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import defpackage.gzf;
import defpackage.hca;
import defpackage.hdr;
import defpackage.iat;
import defpackage.njy;
import defpackage.qpx;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class EditDialogBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CustomViewDialog f8852a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f8854c;
    private CustomViewDialog g;
    private CustomViewDialog i;
    private CustomViewDialog j;
    private OnDismissListener k;
    private CustomViewDialog n;
    private CustomViewDialog o;
    private CustomViewDialog p;
    private CustomViewDialog q;
    private CustomViewDialog t;
    private CustomViewDialog u;
    private CustomViewDialog v;
    private int[] d = {1, 0};
    private int[] w = {0, 3, 0};
    private int e = TargetCalorie.getDefaultValuePosition();
    private int[] f = {0, TargetHeartRate.getDefaultValuePosition()};
    private int[] l = {0, 0, 0, 0, 0};
    private int m = 0;
    private int[] s = {170, 0, 180};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f8853b = {40, 0, 50};
    private int[] h = {0, 1};
    private int r = 0;

    public interface OnDismissListener {
        void onDismiss();
    }

    public EditDialogBuilder(Context context, OnDismissListener onDismissListener) {
        this.f8854c = context;
        this.k = onDismissListener;
    }

    public void d(final ChoreographedSingleAction choreographedSingleAction, final Map<String, ChoreographedSingleAction> map) {
        if (choreographedSingleAction == null || map == null || map.isEmpty()) {
            LogUtil.e("Suggestion_EditDialogBuilder", "args is empty.");
            return;
        }
        final ArrayList arrayList = new ArrayList(map.size());
        c(map, choreographedSingleAction, arrayList);
        final ChoiceDataAdapter choiceDataAdapter = new ChoiceDataAdapter(this.f8854c, arrayList);
        choiceDataAdapter.d(new RadioViewHolder.OnItemClickListener() { // from class: com.huawei.health.suggestion.customizecourse.manager.EditDialogBuilder.4
            @Override // com.huawei.health.suggestion.ui.run.holder.RadioViewHolder.OnItemClickListener
            public void onItemClick(int i) {
                for (iat iatVar : arrayList) {
                    if (iatVar.b()) {
                        iatVar.e(false);
                    }
                }
                if (njy.e(arrayList, i)) {
                    LogUtil.e("Suggestion_EditDialogBuilder", "choiceList out of bound.");
                    return;
                }
                iat iatVar2 = (iat) arrayList.get(i);
                iatVar2.e(true);
                EditDialogBuilder.this.a(iatVar2, choreographedSingleAction, (Map<String, ChoreographedSingleAction>) map, choiceDataAdapter);
            }
        });
        b(choiceDataAdapter, this.f8854c.getResources().getString(R.string.IDS_start_track_sport_type));
    }

    private void c(Map<String, ChoreographedSingleAction> map, ChoreographedSingleAction choreographedSingleAction, List<iat> list) {
        for (ChoreographedSingleAction choreographedSingleAction2 : map.values()) {
            if (choreographedSingleAction2 != null) {
                AtomicAction action = choreographedSingleAction.getAction();
                AtomicAction action2 = choreographedSingleAction2.getAction();
                list.add(new iat((action == null || action2 == null || !action.getId().equals(action2.getId())) ? false : true, choreographedSingleAction2.getAction()));
            }
        }
        Collections.sort(list, new Comparator() { // from class: hdl
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((iat) obj).d().getId().compareTo(((iat) obj2).d().getId());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(iat iatVar, ChoreographedSingleAction choreographedSingleAction, Map<String, ChoreographedSingleAction> map, ChoiceDataAdapter choiceDataAdapter) {
        if (iatVar.d() instanceof AtomicAction) {
            AtomicAction atomicAction = (AtomicAction) iatVar.d();
            choreographedSingleAction.setAction(atomicAction);
            ChoreographedSingleAction choreographedSingleAction2 = map.get(atomicAction.getId());
            if (choreographedSingleAction2 != null) {
                choreographedSingleAction.setTargetConfig(choreographedSingleAction2.getTargetConfig());
                choreographedSingleAction.setIntensityConfig(choreographedSingleAction2.getIntensityConfig());
            }
            choiceDataAdapter.notifyDataSetChanged();
            b(this.f8852a);
            LogUtil.a("Suggestion_EditDialogBuilder", "action choose:", iatVar.d().toString());
        }
    }

    public void e(final TargetConfig targetConfig, final CourseConfig courseConfig) {
        if (targetConfig == null || courseConfig == null) {
            LogUtil.e("Suggestion_EditDialogBuilder", "args is empty.");
            return;
        }
        final List<iat> targetTypeList = TypeConfig.getTargetTypeList(this.f8854c, CommonUtil.e(targetConfig.getId(), 1));
        final ChoiceDataAdapter choiceDataAdapter = new ChoiceDataAdapter(this.f8854c, targetTypeList);
        choiceDataAdapter.d(new RadioViewHolder.OnItemClickListener() { // from class: com.huawei.health.suggestion.customizecourse.manager.EditDialogBuilder.7
            @Override // com.huawei.health.suggestion.ui.run.holder.RadioViewHolder.OnItemClickListener
            public void onItemClick(int i) {
                for (iat iatVar : targetTypeList) {
                    if (iatVar.b()) {
                        iatVar.e(false);
                    }
                }
                if (njy.e(targetTypeList, i)) {
                    LogUtil.e("Suggestion_EditDialogBuilder", "targetList out of bound.");
                    return;
                }
                iat iatVar2 = (iat) targetTypeList.get(i);
                iatVar2.e(true);
                targetConfig.saveId(iatVar2.d().getId());
                targetConfig.saveName(iatVar2.d().getName());
                targetConfig.setValueH(0.0d);
                targetConfig.setValueL(0.0d);
                targetConfig.setValueType(TargetConfig.ValueTypes.LOW_VALUE.getValue());
                for (TargetConfig targetConfig2 : courseConfig.getDefaultTargetConfigs()) {
                    if (targetConfig2.getId().equals(targetConfig.getId())) {
                        targetConfig.setValueType(targetConfig2.getValueType());
                        targetConfig.setValueL(targetConfig2.getValueL());
                        targetConfig.setValueH(targetConfig2.getValueH());
                    }
                }
                TypeConfig.setDefaultImperialData(targetConfig);
                LogUtil.a("Suggestion_EditDialogBuilder", "target:", targetConfig.toString());
                choiceDataAdapter.notifyDataSetChanged();
                EditDialogBuilder editDialogBuilder = EditDialogBuilder.this;
                editDialogBuilder.b(editDialogBuilder.f8852a);
                LogUtil.a("Suggestion_EditDialogBuilder", "target choose:", iatVar2.d().toString());
            }
        });
        b(choiceDataAdapter, this.f8854c.getResources().getString(R.string.IDS_sug_target_type));
    }

    public void c(final TargetConfig targetConfig, final CourseConfig courseConfig) {
        if (targetConfig == null || courseConfig == null) {
            LogUtil.e("Suggestion_EditDialogBuilder", "args is empty.");
            return;
        }
        final List<iat> intensityTypeList = TypeConfig.getIntensityTypeList(this.f8854c, CommonUtil.e(targetConfig.getId(), 255));
        final ChoiceDataAdapter choiceDataAdapter = new ChoiceDataAdapter(this.f8854c, intensityTypeList);
        choiceDataAdapter.d(new RadioViewHolder.OnItemClickListener() { // from class: com.huawei.health.suggestion.customizecourse.manager.EditDialogBuilder.23
            @Override // com.huawei.health.suggestion.ui.run.holder.RadioViewHolder.OnItemClickListener
            public void onItemClick(int i) {
                for (iat iatVar : intensityTypeList) {
                    if (iatVar.b()) {
                        iatVar.e(false);
                    }
                }
                if (njy.e(intensityTypeList, i)) {
                    return;
                }
                iat iatVar2 = (iat) intensityTypeList.get(i);
                iatVar2.e(true);
                targetConfig.saveId(iatVar2.d().getId());
                targetConfig.saveName(iatVar2.d().getName());
                targetConfig.setValueH(0.0d);
                targetConfig.setValueL(0.0d);
                targetConfig.setValueType(TargetConfig.ValueTypes.LOW_VALUE.getValue());
                for (TargetConfig targetConfig2 : courseConfig.getDefaultIntensityConfigs()) {
                    if (targetConfig2.getId().equals(targetConfig.getId())) {
                        targetConfig.setValueType(targetConfig2.getValueType());
                        targetConfig.setValueL(targetConfig2.getValueL());
                        targetConfig.setValueH(targetConfig2.getValueH());
                    }
                }
                TypeConfig.setDefaultImperialData(targetConfig);
                LogUtil.a("Suggestion_EditDialogBuilder", "intensity:", targetConfig.toString());
                choiceDataAdapter.notifyDataSetChanged();
                LogUtil.a("Suggestion_EditDialogBuilder", "intensity choose:", iatVar2.d().toString());
                EditDialogBuilder editDialogBuilder = EditDialogBuilder.this;
                editDialogBuilder.b(editDialogBuilder.f8852a);
            }
        });
        b(choiceDataAdapter, this.f8854c.getResources().getString(R.string.IDS_sug_intensity_type));
    }

    private void b(ChoiceDataAdapter choiceDataAdapter, String str) {
        HealthRecycleView healthRecycleView = new HealthRecycleView(this.f8854c);
        healthRecycleView.setHasFixedSize(true);
        healthRecycleView.setLayoutManager(new LinearLayoutManager(this.f8854c));
        healthRecycleView.setAdapter(choiceDataAdapter);
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this.f8854c);
        builder.a(str).d(healthRecycleView).c(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.health.suggestion.customizecourse.manager.EditDialogBuilder.28
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        CustomViewDialog customViewDialogD = builder.d();
        this.f8852a = customViewDialogD;
        customViewDialogD.show();
    }

    public void a(final TargetConfig targetConfig) {
        final HealthMultiNumberPicker healthMultiNumberPicker = new HealthMultiNumberPicker(this.f8854c);
        HashMap map = new HashMap(2);
        String[] kiloMeters = TargetDistance.getKiloMeters(this.f8854c);
        String[] meters = TargetDistance.getMeters(this.f8854c);
        map.put(0, kiloMeters);
        map.put(1, meters);
        if (targetConfig.getValueL() > 0.0d && !UnitUtil.f()) {
            int iFloor = (int) Math.floor(targetConfig.getValueL() / 1000.0d);
            int valueL = (int) targetConfig.getValueL();
            int[] iArr = this.d;
            iArr[0] = iFloor;
            iArr[1] = (valueL % 1000) / 50;
        }
        healthMultiNumberPicker.setDataContent(2, map, new boolean[]{true, true}, this.d);
        final CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this.f8854c);
        builder.c(false);
        builder.b(R.string.IDS_sport_distance).d((View) healthMultiNumberPicker).d(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: com.huawei.health.suggestion.customizecourse.manager.EditDialogBuilder.35
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (EditDialogBuilder.this.c(healthMultiNumberPicker, targetConfig) > 0) {
                    EditDialogBuilder editDialogBuilder = EditDialogBuilder.this;
                    editDialogBuilder.b(editDialogBuilder.p);
                } else {
                    builder.c(false);
                    qpx.e(EditDialogBuilder.this.f8854c, EditDialogBuilder.this.f8854c.getString(R.string.IDS_distance_target_zero_hint, 0));
                }
            }
        }).c(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.health.suggestion.customizecourse.manager.EditDialogBuilder.29
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        CustomViewDialog customViewDialogD = builder.d();
        this.p = customViewDialogD;
        customViewDialogD.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int c(HealthMultiNumberPicker healthMultiNumberPicker, TargetConfig targetConfig) {
        int[] selectedLocations = healthMultiNumberPicker.getSelectedLocations();
        if (selectedLocations.length < 2) {
            LogUtil.d("Suggestion_EditDialogBuilder", "the SelectedLocation Value is empty");
            return 0;
        }
        int i = selectedLocations[0];
        int i2 = selectedLocations[1];
        int[] iArr = this.d;
        iArr[0] = i;
        iArr[1] = i2;
        int iC = UnitUtil.f() ? (int) ((UnitUtil.c(i, 3) * 1000.0d) + UnitUtil.c(i2 * 50, 2)) : (i2 * 50) + (i * 1000);
        if (iC > 0) {
            double d = iC;
            targetConfig.setValueL(d);
            targetConfig.setValueH(d);
            targetConfig.setValueType(TargetConfig.ValueTypes.LOW_VALUE.getValue());
            LogUtil.a("Suggestion_EditDialogBuilder", "mDistanceTargetSelected is:", Integer.valueOf(iC));
            return iC;
        }
        LogUtil.e("Suggestion_EditDialogBuilder", "mDistanceTargetSelected is wrong");
        return iC;
    }

    public void d(final TargetConfig targetConfig) {
        if (targetConfig == null) {
            LogUtil.e("Suggestion_EditDialogBuilder", "args is empty.");
            return;
        }
        final HealthMultiNumberPicker healthMultiNumberPicker = new HealthMultiNumberPicker(this.f8854c);
        HashMap map = new HashMap(3);
        map.put(0, healthMultiNumberPicker.c(0, 23, null));
        map.put(1, healthMultiNumberPicker.c(0, 59, null));
        map.put(2, healthMultiNumberPicker.c(0, 59, null));
        if (targetConfig.getValueL() > 0.0d) {
            this.w[0] = ((int) targetConfig.getValueL()) / 3600;
            this.w[1] = ((int) (targetConfig.getValueL() % 3600.0d)) / 60;
            this.w[2] = ((int) targetConfig.getValueL()) % 60;
        }
        int[] iArr = this.w;
        healthMultiNumberPicker.setDataContent(3, map, new boolean[]{true, true, true}, new int[]{iArr[0], iArr[1], iArr[2]});
        healthMultiNumberPicker.setColonAndUnit(3);
        final CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this.f8854c);
        builder.c(false);
        builder.b(R.string.IDS_start_track_target_type_time).d((View) healthMultiNumberPicker).d(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: com.huawei.health.suggestion.customizecourse.manager.EditDialogBuilder.31
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                EditDialogBuilder.this.e(targetConfig, healthMultiNumberPicker, builder);
            }
        }).c(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.health.suggestion.customizecourse.manager.EditDialogBuilder.33
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                builder.c(true);
            }
        });
        CustomViewDialog customViewDialogD = builder.d();
        this.v = customViewDialogD;
        customViewDialogD.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(TargetConfig targetConfig, HealthMultiNumberPicker healthMultiNumberPicker, CustomViewDialog.Builder builder) {
        int iB = b(healthMultiNumberPicker);
        if (iB > 0) {
            LogUtil.a("Suggestion_EditDialogBuilder", "mTimeTargetSelected is ", Integer.valueOf(iB));
            double d = iB;
            targetConfig.setValueL(d);
            targetConfig.setValueH(d);
            targetConfig.setValueType(TargetConfig.ValueTypes.LOW_VALUE.getValue());
            builder.c(true);
            b(this.v);
            return;
        }
        LogUtil.j("Suggestion_EditDialogBuilder", "mTimeTargetSelected is wrong");
        builder.c(false);
        Context context = this.f8854c;
        qpx.e(context, context.getResources().getString(R.string.IDS_time_target_zero_hint, 0));
    }

    private int b(HealthMultiNumberPicker healthMultiNumberPicker) {
        int[] selectedLocations = healthMultiNumberPicker.getSelectedLocations();
        if (selectedLocations.length < 3) {
            LogUtil.d("Suggestion_EditDialogBuilder", "the minute and second SelectedLocation Value is empty");
            return 0;
        }
        int i = selectedLocations[0];
        int i2 = selectedLocations[1];
        int i3 = selectedLocations[2];
        int[] iArr = this.w;
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = i3;
        return (i * 3600) + (i2 * 60) + i3;
    }

    public void e(final TargetConfig targetConfig) {
        if (targetConfig == null) {
            LogUtil.e("Suggestion_EditDialogBuilder", "args is empty.");
            return;
        }
        HealthNumberPicker healthNumberPicker = new HealthNumberPicker(this.f8854c);
        String[] calorieArray = TargetCalorie.getCalorieArray(this.f8854c);
        healthNumberPicker.setDisplayedValues(calorieArray);
        healthNumberPicker.setMaxValue(calorieArray.length - 1);
        healthNumberPicker.setMinValue(0);
        if (targetConfig.getValueL() >= 50.0d) {
            this.e = (((int) targetConfig.getValueL()) / 50) - 1;
        }
        healthNumberPicker.setValue(this.e);
        healthNumberPicker.setSelectionDivider(ContextCompat.getDrawable(this.f8854c, R.drawable.numberpicker_line_title));
        healthNumberPicker.setOnValuePickedListener(new HealthNumberPicker.OnPickedListener() { // from class: com.huawei.health.suggestion.customizecourse.manager.EditDialogBuilder.34
            @Override // com.huawei.ui.commonui.numberpicker.HealthNumberPicker.OnPickedListener
            public void onValuePicked(int i, int i2) {
                EditDialogBuilder.this.e = i2;
                LogUtil.a("Suggestion_EditDialogBuilder", "caloriesTargetSelected:", Integer.valueOf(EditDialogBuilder.this.e));
            }
        });
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this.f8854c);
        builder.d(healthNumberPicker);
        builder.b(R.string.IDS_start_track_target_type_calorie);
        builder.d(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: com.huawei.health.suggestion.customizecourse.manager.EditDialogBuilder.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                targetConfig.setValueL((EditDialogBuilder.this.e + 1) * 50);
                targetConfig.setValueH((EditDialogBuilder.this.e + 1) * 50);
                targetConfig.setValueType(TargetConfig.ValueTypes.LOW_VALUE.getValue());
                EditDialogBuilder editDialogBuilder = EditDialogBuilder.this;
                editDialogBuilder.b(editDialogBuilder.t);
            }
        });
        builder.c(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.health.suggestion.customizecourse.manager.EditDialogBuilder.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        CustomViewDialog customViewDialogD = builder.d();
        this.t = customViewDialogD;
        customViewDialogD.show();
    }

    public void d(TargetConfig targetConfig, hca hcaVar) {
        if (targetConfig == null) {
            LogUtil.e("Suggestion_EditDialogBuilder", "args is empty.");
            return;
        }
        HealthMultiNumberPicker healthMultiNumberPicker = new HealthMultiNumberPicker(BaseApplication.getContext());
        HashMap map = new HashMap(2);
        String[] strArr = {this.f8854c.getResources().getString(R.string.IDS_sug_upper), this.f8854c.getResources().getString(R.string.IDS_sug_lower)};
        String[] hearRateArray = TargetHeartRate.getHearRateArray();
        map.put(0, strArr);
        map.put(1, hearRateArray);
        if (targetConfig.getValueL() > 0.0d) {
            if (targetConfig.getId().equals(Integer.toString(4))) {
                int[] iArr = this.f;
                iArr[0] = 0;
                iArr[1] = TargetHeartRate.getPositionByHeartRateValue((int) targetConfig.getValueL());
            } else {
                int[] iArr2 = this.f;
                iArr2[0] = 1;
                iArr2[1] = TargetHeartRate.getPositionByHeartRateValue((int) targetConfig.getValueH());
            }
        }
        healthMultiNumberPicker.setPickerCount(2, new boolean[]{true, true});
        healthMultiNumberPicker.setDisplayedValues(0, strArr, this.f[0]);
        healthMultiNumberPicker.setDisplayedValues(1, hearRateArray, this.f[1]);
        View viewInflate = LayoutInflater.from(this.f8854c).inflate(R.layout.dialog_custom_courses_edit, (ViewGroup) null);
        b(viewInflate, healthMultiNumberPicker, hcaVar);
        d(viewInflate, healthMultiNumberPicker, targetConfig);
    }

    private void b(View view, final HealthMultiNumberPicker healthMultiNumberPicker, final hca hcaVar) {
        HealthSubHeader healthSubHeader = (HealthSubHeader) view.findViewById(R.id.custom_courses_sub_header);
        healthSubHeader.setLayoutManager(new LinearLayoutManager(this.f8854c, 1, false) { // from class: com.huawei.health.suggestion.customizecourse.manager.EditDialogBuilder.12
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        });
        final FitnessEditListMoreAdapter fitnessEditListMoreAdapter = new FitnessEditListMoreAdapter(this.f8854c.getResources().getString(R.string.sug_run_chart_heartrate_unit), "");
        healthSubHeader.setAdapter(fitnessEditListMoreAdapter);
        if (hcaVar != null) {
            fitnessEditListMoreAdapter.e(c(this.f, hcaVar));
        }
        ((RelativeLayout) view.findViewById(R.id.custom_courses_pick_content)).addView(healthMultiNumberPicker);
        healthMultiNumberPicker.setOnValueChangeListener(new HealthMultiNumberPicker.OnValueChangeListener() { // from class: com.huawei.health.suggestion.customizecourse.manager.EditDialogBuilder.3
            @Override // com.huawei.ui.commonui.numberpicker.HealthMultiNumberPicker.OnValueChangeListener
            public void onValueChange(int i, HealthMultiNumberPicker healthMultiNumberPicker2, int i2, int i3) {
                if (hcaVar == null) {
                    LogUtil.j("Suggestion_EditDialogBuilder", "maxHeartRateZoneConfig == null");
                } else {
                    fitnessEditListMoreAdapter.e(EditDialogBuilder.this.c(healthMultiNumberPicker.getSelectedLocations(), hcaVar));
                }
            }
        });
    }

    private void d(View view, final HealthMultiNumberPicker healthMultiNumberPicker, final TargetConfig targetConfig) {
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this.f8854c);
        builder.b(false).d(view).d(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: com.huawei.health.suggestion.customizecourse.manager.EditDialogBuilder.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                EditDialogBuilder.this.d(healthMultiNumberPicker, targetConfig);
                EditDialogBuilder editDialogBuilder = EditDialogBuilder.this;
                editDialogBuilder.b(editDialogBuilder.u);
            }
        }).c(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.health.suggestion.customizecourse.manager.EditDialogBuilder.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
            }
        });
        CustomViewDialog customViewDialogD = builder.d();
        this.u = customViewDialogD;
        customViewDialogD.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c(int[] iArr, hca hcaVar) {
        int i = iArr[0];
        int iD = (int) UnitUtil.d((((double) (hcaVar.b() * TargetHeartRate.getHeartRateValueByPosition(iArr[1]))) * 1.0d) / 100.0d, 0);
        if (i == 0) {
            return this.f8854c.getResources().getQuantityString(R.plurals.sug_courses_heart_rate_height, iD, Integer.valueOf(iD));
        }
        return this.f8854c.getResources().getQuantityString(R.plurals.sug_courses_heart_rate_lower, iD, Integer.valueOf(iD));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(HealthMultiNumberPicker healthMultiNumberPicker, TargetConfig targetConfig) {
        int[] selectedLocations = healthMultiNumberPicker.getSelectedLocations();
        if (selectedLocations.length < 2) {
            LogUtil.d("Suggestion_EditDialogBuilder", "the SelectedLocation Value is empty");
            return;
        }
        int i = selectedLocations[0];
        int i2 = selectedLocations[1];
        int[] iArr = this.f;
        iArr[0] = i;
        iArr[1] = i2;
        int heartRateValueByPosition = TargetHeartRate.getHeartRateValueByPosition(i2);
        if (i == 0) {
            targetConfig.setValueType(TargetConfig.ValueTypes.LOW_VALUE.getValue());
            double d = heartRateValueByPosition;
            targetConfig.setValueL(d);
            targetConfig.setValueH(d);
            targetConfig.setId(Integer.toString(4));
        } else {
            targetConfig.setValueType(TargetConfig.ValueTypes.HIGH_VALUE.getValue());
            double d2 = heartRateValueByPosition;
            targetConfig.setValueH(d2);
            targetConfig.setValueL(d2);
            targetConfig.setId(Integer.toString(5));
        }
        if (heartRateValueByPosition > 0) {
            LogUtil.a("Suggestion_EditDialogBuilder", "heartRateTargetSelected is:", Integer.valueOf(heartRateValueByPosition));
        } else {
            LogUtil.e("Suggestion_EditDialogBuilder", "heartRateTargetSelected is wrong");
        }
    }

    public void b(TargetConfig targetConfig) {
        String[] paceMinuteArray;
        String[] paceMinuteArray2;
        if (targetConfig == null) {
            LogUtil.e("Suggestion_EditDialogBuilder", "args is empty.");
            return;
        }
        if (UnitUtil.f()) {
            paceMinuteArray = IntensityPace.getPaceMinuteInchArray();
            paceMinuteArray2 = IntensityPace.getPaceMinuteInchArray();
        } else {
            paceMinuteArray = IntensityPace.getPaceMinuteArray();
            paceMinuteArray2 = IntensityPace.getPaceMinuteArray();
        }
        String[] paceSecondArray = IntensityPace.getPaceSecondArray();
        String[] paceSecondArray2 = IntensityPace.getPaceSecondArray();
        HashMap map = new HashMap(5);
        map.put(0, paceMinuteArray);
        map.put(1, paceSecondArray);
        map.put(2, new String[]{Constants.LINK});
        map.put(3, paceMinuteArray2);
        map.put(4, paceSecondArray2);
        g(targetConfig);
        c(map, targetConfig);
    }

    private void g(TargetConfig targetConfig) {
        int iC;
        int iC2;
        int iC3;
        int iC4;
        if (UnitUtil.f()) {
            int[] iArr = this.l;
            iArr[0] = 9;
            iArr[1] = 30;
            iArr[3] = 11;
            iArr[4] = 0;
        } else {
            int[] iArr2 = this.l;
            iArr2[0] = 5;
            iArr2[1] = 30;
            iArr2[3] = 6;
            iArr2[4] = 30;
        }
        if (targetConfig.getValueL() <= 0.0d || targetConfig.getValueH() <= 0.0d) {
            return;
        }
        if (!UnitUtil.f()) {
            iC = ((int) targetConfig.getValueL()) / 60000;
            iC2 = (((int) targetConfig.getValueL()) % 60000) / 1000;
            iC3 = ((int) targetConfig.getValueH()) / 60000;
            iC4 = (((int) targetConfig.getValueH()) % 60000) / 1000;
        } else {
            iC = (int) (UnitUtil.c(targetConfig.getValueL(), 3) / 60000.0d);
            iC2 = (int) ((UnitUtil.c(targetConfig.getValueL(), 3) % 60000.0d) / 1000.0d);
            iC3 = (int) (UnitUtil.c(targetConfig.getValueH(), 3) / 60000.0d);
            iC4 = (int) ((UnitUtil.c(targetConfig.getValueH(), 3) % 60000.0d) / 1000.0d);
        }
        int[] iArr3 = this.l;
        iArr3[0] = iC - 1;
        iArr3[1] = iC2;
        iArr3[3] = iC3 - 1;
        iArr3[4] = iC4;
    }

    private void c(Map<Integer, String[]> map, final TargetConfig targetConfig) {
        final HealthMultiNumberPicker healthMultiNumberPicker = new HealthMultiNumberPicker(BaseApplication.getContext());
        healthMultiNumberPicker.setDataContent(5, map, new boolean[]{true, true, true, true, true}, this.l);
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this.f8854c);
        if (UnitUtil.f()) {
            builder.b(R.string.IDS_hwh_motiontrack_show_pace_mi_hour);
        } else {
            builder.b(R.string.IDS_hwh_motiontrack_show_pace_km_hour);
        }
        builder.d((View) healthMultiNumberPicker).d(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: com.huawei.health.suggestion.customizecourse.manager.EditDialogBuilder.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                EditDialogBuilder.this.b(healthMultiNumberPicker, targetConfig);
                EditDialogBuilder editDialogBuilder = EditDialogBuilder.this;
                editDialogBuilder.b(editDialogBuilder.j);
            }
        }).c(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.health.suggestion.customizecourse.manager.EditDialogBuilder.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        CustomViewDialog customViewDialogD = builder.d();
        this.j = customViewDialogD;
        customViewDialogD.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(HealthMultiNumberPicker healthMultiNumberPicker, TargetConfig targetConfig) {
        int[] selectedLocations = healthMultiNumberPicker.getSelectedLocations();
        if (selectedLocations.length < 5) {
            LogUtil.d("Suggestion_EditDialogBuilder", "the SelectedLocation Value is empty");
            return;
        }
        int i = selectedLocations[0];
        int i2 = selectedLocations[1];
        int[] iArr = this.l;
        int i3 = i + 1;
        iArr[0] = i3;
        iArr[1] = i2;
        int i4 = selectedLocations[3];
        int i5 = selectedLocations[4];
        int i6 = i4 + 1;
        iArr[3] = i6;
        iArr[4] = i5;
        int i7 = (i3 * 60) + i2;
        int i8 = (i6 * 60) + i5;
        if (i7 > i8) {
            i8 = i7;
            i7 = i8;
        }
        if (UnitUtil.f()) {
            targetConfig.setValueL(UnitUtil.e(i7, 3) * 1000.0d);
            targetConfig.setValueH(UnitUtil.e(i8, 3) * 1000.0d);
        } else {
            targetConfig.setValueL(i7 * 1000);
            targetConfig.setValueH(i8 * 1000);
        }
        targetConfig.setValueType(TargetConfig.ValueTypes.RANGE_VALUE.getValue());
        LogUtil.a("Suggestion_EditDialogBuilder", "mPacePickerSelected ", Integer.valueOf(i), " ", Integer.valueOf(i2), " ", Integer.valueOf(i4), " ", Integer.valueOf(i5));
    }

    public void e(TargetConfig targetConfig, gzf gzfVar) {
        if (targetConfig == null) {
            LogUtil.e("Suggestion_EditDialogBuilder", "args is empty.");
            return;
        }
        HealthNumberPicker healthNumberPicker = new HealthNumberPicker(this.f8854c);
        String[] paceSectionArrays = IntensityPaceSection.getPaceSectionArrays(this.f8854c);
        healthNumberPicker.setDisplayedValues(paceSectionArrays);
        healthNumberPicker.setMaxValue(paceSectionArrays.length - 1);
        healthNumberPicker.setMinValue(0);
        if (targetConfig.getValueL() > 0.0d) {
            this.m = ((int) targetConfig.getValueL()) - 1;
        }
        healthNumberPicker.setValue(this.m);
        healthNumberPicker.setSelectionDivider(ContextCompat.getDrawable(this.f8854c, R.drawable.numberpicker_line_title));
        View viewInflate = LayoutInflater.from(this.f8854c).inflate(R.layout.dialog_custom_courses_edit, (ViewGroup) null);
        b(viewInflate, gzfVar, healthNumberPicker);
        e(viewInflate, healthNumberPicker, targetConfig);
    }

    private void b(View view, final gzf gzfVar, HealthNumberPicker healthNumberPicker) {
        HealthSubHeader healthSubHeader = (HealthSubHeader) view.findViewById(R.id.custom_courses_sub_header);
        healthSubHeader.setLayoutManager(new LinearLayoutManager(this.f8854c, 1, false) { // from class: com.huawei.health.suggestion.customizecourse.manager.EditDialogBuilder.18
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        });
        final FitnessEditListMoreAdapter fitnessEditListMoreAdapter = new FitnessEditListMoreAdapter(this.f8854c.getResources().getString(R.string.IDS_hwh_motiontrack_speed_range), a(this.m, gzfVar));
        healthSubHeader.setAdapter(fitnessEditListMoreAdapter);
        healthNumberPicker.setOnValuePickedListener(new HealthNumberPicker.OnPickedListener() { // from class: com.huawei.health.suggestion.customizecourse.manager.EditDialogBuilder.10
            @Override // com.huawei.ui.commonui.numberpicker.HealthNumberPicker.OnPickedListener
            public void onValuePicked(int i, int i2) {
                fitnessEditListMoreAdapter.e(EditDialogBuilder.this.a(i2, gzfVar));
            }
        });
    }

    private void e(View view, HealthNumberPicker healthNumberPicker, final TargetConfig targetConfig) {
        ((RelativeLayout) view.findViewById(R.id.custom_courses_pick_content)).addView(healthNumberPicker);
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this.f8854c);
        builder.b(false);
        builder.d(view);
        builder.d(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: com.huawei.health.suggestion.customizecourse.manager.EditDialogBuilder.13
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                targetConfig.setValueL(EditDialogBuilder.this.m + 1);
                targetConfig.setValueH(EditDialogBuilder.this.m + 1);
                targetConfig.setValueType(TargetConfig.ValueTypes.LOW_VALUE.getValue());
                EditDialogBuilder editDialogBuilder = EditDialogBuilder.this;
                editDialogBuilder.b(editDialogBuilder.n);
            }
        });
        builder.c(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.health.suggestion.customizecourse.manager.EditDialogBuilder.15
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
            }
        });
        CustomViewDialog customViewDialogD = builder.d();
        this.n = customViewDialogD;
        customViewDialogD.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(int i, gzf gzfVar) {
        this.m = i;
        int iB = gzfVar.b(i + 1, true);
        int iB2 = gzfVar.b(this.m + 1, false);
        LogUtil.a("Suggestion_EditDialogBuilder", "paceSectionSelected:", Integer.valueOf(this.m), " ", Integer.valueOf(iB), " ", Integer.valueOf(iB2));
        String strA = hdr.a(this.f8854c, iB);
        String strA2 = hdr.a(this.f8854c, iB2);
        if (iB > iB2) {
            return a(this.f8854c, iB, strA2, strA);
        }
        return a(this.f8854c, iB2, strA, strA2);
    }

    private String a(Context context, int i, String str, String str2) {
        String string = context.getResources().getString(R.string.sug_his_time_formart, str, str2);
        if (UnitUtil.f()) {
            return context.getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_pre_unit_mi, i, string);
        }
        return context.getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_pre_unit_km, i, string);
    }

    public void c(final TargetConfig targetConfig) {
        if (targetConfig == null) {
            LogUtil.e("Suggestion_EditDialogBuilder", "args is empty.");
            return;
        }
        HashMap map = new HashMap(3);
        String[] strArr = {Constants.LINK};
        String[] stepRateArray = IntensityStepRate.getStepRateArray();
        String[] stepRateArray2 = IntensityStepRate.getStepRateArray();
        map.put(0, stepRateArray);
        map.put(1, strArr);
        map.put(2, stepRateArray2);
        if (targetConfig.getValueL() > 0.0d && targetConfig.getValueH() > 0.0d) {
            this.s[0] = IntensityStepRate.getPositionByStepRateValue((int) targetConfig.getValueL());
            this.s[2] = IntensityStepRate.getPositionByStepRateValue((int) targetConfig.getValueH());
        }
        final HealthMultiNumberPicker healthMultiNumberPicker = new HealthMultiNumberPicker(this.f8854c);
        healthMultiNumberPicker.setDataContent(3, map, new boolean[]{true, true, true}, this.s);
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this.f8854c);
        builder.b(R.string.IDS_motiontrack_detail_fm_heart_bupin_with_unit).d((View) healthMultiNumberPicker).d(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: com.huawei.health.suggestion.customizecourse.manager.EditDialogBuilder.14
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                EditDialogBuilder.this.e(healthMultiNumberPicker, targetConfig);
                EditDialogBuilder editDialogBuilder = EditDialogBuilder.this;
                editDialogBuilder.b(editDialogBuilder.o);
            }
        }).c(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.health.suggestion.customizecourse.manager.EditDialogBuilder.11
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        CustomViewDialog customViewDialogD = builder.d();
        this.o = customViewDialogD;
        customViewDialogD.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(HealthMultiNumberPicker healthMultiNumberPicker, TargetConfig targetConfig) {
        int[] selectedLocations = healthMultiNumberPicker.getSelectedLocations();
        if (selectedLocations.length < 3) {
            LogUtil.d("Suggestion_EditDialogBuilder", "the SelectedLocation Value is empty");
            return;
        }
        int[] iArr = this.s;
        int i = selectedLocations[0];
        iArr[0] = i;
        iArr[2] = selectedLocations[2];
        int stepRateValueByPosition = IntensityStepRate.getStepRateValueByPosition(i);
        int stepRateValueByPosition2 = IntensityStepRate.getStepRateValueByPosition(this.s[2]);
        targetConfig.setValueType(TargetConfig.ValueTypes.RANGE_VALUE.getValue());
        if (stepRateValueByPosition >= stepRateValueByPosition2) {
            LogUtil.e("Suggestion_EditDialogBuilder", "mStepRateSelected is wrong.", Integer.valueOf(stepRateValueByPosition), Integer.valueOf(stepRateValueByPosition2));
            targetConfig.setValueL(stepRateValueByPosition2);
            targetConfig.setValueH(stepRateValueByPosition);
        } else {
            targetConfig.setValueL(stepRateValueByPosition);
            targetConfig.setValueH(stepRateValueByPosition2);
            LogUtil.a("Suggestion_EditDialogBuilder", "mStepRateSelected is right.", Integer.valueOf(stepRateValueByPosition), Integer.valueOf(stepRateValueByPosition2));
        }
    }

    public void c(TargetConfig targetConfig, final hca hcaVar) {
        HashMap map = new HashMap(3);
        String[] strArr = {Constants.LINK};
        String[] hearRateRangeArray = IntensityHeartRateRange.getHearRateRangeArray();
        String[] hearRateRangeArray2 = IntensityHeartRateRange.getHearRateRangeArray();
        boolean z = false;
        map.put(0, hearRateRangeArray);
        int i = 1;
        map.put(1, strArr);
        if (targetConfig.getValueL() >= 20.0d && targetConfig.getValueH() >= 20.0d) {
            this.f8853b[0] = ((int) targetConfig.getValueL()) - 20;
            this.f8853b[2] = ((int) targetConfig.getValueH()) - 20;
        }
        map.put(2, hearRateRangeArray2);
        final HealthMultiNumberPicker healthMultiNumberPicker = new HealthMultiNumberPicker(BaseApplication.getContext());
        healthMultiNumberPicker.setPickerCount(3, new boolean[]{false, false, false});
        healthMultiNumberPicker.setDisplayedValues(0, hearRateRangeArray, this.f8853b[0]);
        healthMultiNumberPicker.setDisplayedValues(1, strArr, this.f8853b[1]);
        healthMultiNumberPicker.setDisplayedValues(2, hearRateRangeArray2, this.f8853b[2]);
        View viewInflate = LayoutInflater.from(this.f8854c).inflate(R.layout.dialog_custom_courses_edit, (ViewGroup) null);
        HealthSubHeader healthSubHeader = (HealthSubHeader) viewInflate.findViewById(R.id.custom_courses_sub_header);
        healthSubHeader.setLayoutManager(new LinearLayoutManager(this.f8854c, i, z) { // from class: com.huawei.health.suggestion.customizecourse.manager.EditDialogBuilder.24
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        });
        final FitnessEditListMoreAdapter fitnessEditListMoreAdapter = new FitnessEditListMoreAdapter(this.f8854c.getResources().getString(R.string.IDS_hw_health_show_healthdata_heartrate_range), b(this.f8853b, hcaVar));
        healthSubHeader.setAdapter(fitnessEditListMoreAdapter);
        ((RelativeLayout) viewInflate.findViewById(R.id.custom_courses_pick_content)).addView(healthMultiNumberPicker);
        healthMultiNumberPicker.setOnValueChangeListener(new HealthMultiNumberPicker.OnValueChangeListener() { // from class: com.huawei.health.suggestion.customizecourse.manager.EditDialogBuilder.20
            @Override // com.huawei.ui.commonui.numberpicker.HealthMultiNumberPicker.OnValueChangeListener
            public void onValueChange(int i2, HealthMultiNumberPicker healthMultiNumberPicker2, int i3, int i4) {
                int[] selectedLocations = healthMultiNumberPicker.getSelectedLocations();
                selectedLocations[i2] = i4;
                fitnessEditListMoreAdapter.e(EditDialogBuilder.this.b(selectedLocations, hcaVar));
            }
        });
        a(viewInflate, healthMultiNumberPicker, targetConfig);
    }

    private void a(View view, final HealthMultiNumberPicker healthMultiNumberPicker, final TargetConfig targetConfig) {
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this.f8854c);
        builder.b(false).d(view).d(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: com.huawei.health.suggestion.customizecourse.manager.EditDialogBuilder.16
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                EditDialogBuilder.this.a(healthMultiNumberPicker, targetConfig);
                EditDialogBuilder editDialogBuilder = EditDialogBuilder.this;
                editDialogBuilder.b(editDialogBuilder.g);
            }
        }).c(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.health.suggestion.customizecourse.manager.EditDialogBuilder.19
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
            }
        });
        CustomViewDialog customViewDialogD = builder.d();
        this.g = customViewDialogD;
        customViewDialogD.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(int[] iArr, hca hcaVar) {
        double d;
        double d2;
        int i = iArr[0] + 20;
        int i2 = iArr[2] + 20;
        if (i >= i2) {
            d = i2;
            d2 = i;
        } else {
            d = i;
            d2 = i2;
        }
        return a(this.f8854c, hcaVar, d, d2);
    }

    private String a(Context context, hca hcaVar, double d, double d2) {
        if (d > 0.0d && d2 > 0.0d && hcaVar != null) {
            int iD = (int) UnitUtil.d((((double) hcaVar.b()) * d) / 100.0d, 0);
            return context.getResources().getQuantityString(R.plurals.sug_courses_times_min, iD, Integer.valueOf(iD), Integer.valueOf((int) UnitUtil.d((((double) hcaVar.b()) * d2) / 100.0d, 0)));
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(HealthMultiNumberPicker healthMultiNumberPicker, TargetConfig targetConfig) {
        int[] selectedLocations = healthMultiNumberPicker.getSelectedLocations();
        if (selectedLocations.length < 3) {
            LogUtil.d("Suggestion_EditDialogBuilder", "the SelectedLocation Value is empty");
            return;
        }
        int[] iArr = this.f8853b;
        int i = selectedLocations[0];
        iArr[0] = i;
        int i2 = selectedLocations[2];
        iArr[2] = i2;
        int i3 = i + 20;
        int i4 = i2 + 20;
        targetConfig.setValueType(TargetConfig.ValueTypes.RANGE_VALUE.getValue());
        if (i3 >= i4) {
            LogUtil.e("Suggestion_EditDialogBuilder", "mHeartRateIntensitySelected is wrong ", Integer.valueOf(i3), Integer.valueOf(i4));
            targetConfig.setValueL(i4);
            targetConfig.setValueH(i3);
        } else {
            targetConfig.setValueL(i3);
            targetConfig.setValueH(i4);
            LogUtil.a("Suggestion_EditDialogBuilder", "mHeartRateTargetSelected is ", Integer.valueOf(i3), Integer.valueOf(i4));
        }
    }

    public void a(final TargetConfig targetConfig, final hca hcaVar, final hca hcaVar2, final int i) {
        final HealthMultiNumberPicker healthMultiNumberPicker = new HealthMultiNumberPicker(BaseApplication.getContext());
        a(i, healthMultiNumberPicker, targetConfig);
        View viewB = b(hcaVar, hcaVar2, i, healthMultiNumberPicker);
        ((RelativeLayout) viewB.findViewById(R.id.custom_courses_pick_content)).addView(healthMultiNumberPicker);
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this.f8854c);
        builder.b(false).d(viewB).d(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: com.huawei.health.suggestion.customizecourse.manager.EditDialogBuilder.25
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                EditDialogBuilder.this.a(healthMultiNumberPicker, targetConfig, hcaVar, hcaVar2, i);
                EditDialogBuilder editDialogBuilder = EditDialogBuilder.this;
                editDialogBuilder.b(editDialogBuilder.i);
            }
        }).c(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.health.suggestion.customizecourse.manager.EditDialogBuilder.17
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        CustomViewDialog customViewDialogD = builder.d();
        this.i = customViewDialogD;
        customViewDialogD.show();
    }

    private View b(final hca hcaVar, final hca hcaVar2, final int i, final HealthMultiNumberPicker healthMultiNumberPicker) {
        View viewInflate = LayoutInflater.from(this.f8854c).inflate(R.layout.dialog_custom_courses_edit, (ViewGroup) null);
        HealthSubHeader healthSubHeader = (HealthSubHeader) viewInflate.findViewById(R.id.custom_courses_sub_header);
        healthSubHeader.setLayoutManager(new LinearLayoutManager(this.f8854c, 1, false) { // from class: com.huawei.health.suggestion.customizecourse.manager.EditDialogBuilder.30
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        });
        final FitnessEditListMoreAdapter fitnessEditListMoreAdapter = new FitnessEditListMoreAdapter(this.f8854c.getResources().getString(R.string.IDS_rate_zone_text), b(this.h, hcaVar, hcaVar2, i));
        healthSubHeader.setAdapter(fitnessEditListMoreAdapter);
        healthMultiNumberPicker.setOnValueChangeListener(new HealthMultiNumberPicker.OnValueChangeListener() { // from class: com.huawei.health.suggestion.customizecourse.manager.EditDialogBuilder.22
            @Override // com.huawei.ui.commonui.numberpicker.HealthMultiNumberPicker.OnValueChangeListener
            public void onValueChange(int i2, HealthMultiNumberPicker healthMultiNumberPicker2, int i3, int i4) {
                int[] selectedLocations = healthMultiNumberPicker.getSelectedLocations();
                selectedLocations[i2] = i4;
                fitnessEditListMoreAdapter.e(EditDialogBuilder.this.b(selectedLocations, hcaVar, hcaVar2, i));
            }
        });
        return viewInflate;
    }

    private void a(int i, HealthMultiNumberPicker healthMultiNumberPicker, TargetConfig targetConfig) {
        String[] strArr;
        String[] reserveHeartRateSectionArray;
        if (i == 0) {
            strArr = new String[]{this.f8854c.getResources().getString(R.string.IDS_main_max_heart_rate_percentage)};
            reserveHeartRateSectionArray = IntensityHeartRateSection.getMaxHeartRateSectionArray(this.f8854c);
        } else {
            strArr = new String[]{this.f8854c.getResources().getString(R.string.IDS_main_hrr_heart_rate_percentage)};
            reserveHeartRateSectionArray = IntensityHeartRateSection.getReserveHeartRateSectionArray(this.f8854c);
        }
        healthMultiNumberPicker.setPickerCount(2, new boolean[]{false, false});
        if (targetConfig.getValueL() > 0.0d) {
            this.h[1] = ((int) targetConfig.getValueL()) - 1;
        }
        boolean zBa = LanguageUtil.ba(this.f8854c);
        healthMultiNumberPicker.setDisplayedValues(zBa ? 1 : 0, strArr, this.h[0]);
        healthMultiNumberPicker.setDisplayedValues(!LanguageUtil.ba(this.f8854c) ? 1 : 0, reserveHeartRateSectionArray, this.h[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:12:0x0029  */
    public String b(int[] iArr, hca hcaVar, hca hcaVar2, int i) {
        int iE;
        if (iArr.length < 2) {
            return "";
        }
        int i2 = iArr[1];
        int i3 = 0;
        if (i == 0) {
            if (hcaVar != null) {
                int i4 = i2 + 1;
                int iE2 = hcaVar.e(i4, true);
                iE = hcaVar.e(i4, false);
                i3 = iE2;
            } else {
                iE = 0;
            }
        } else if (hcaVar2 != null) {
            int i5 = i2 + 1;
            int iE3 = hcaVar2.e(i5, true);
            iE = hcaVar2.e(i5, false);
            i3 = iE3;
        } else {
            iE = 0;
        }
        return this.f8854c.getResources().getQuantityString(R.plurals.sug_courses_times_min, iE, Integer.valueOf(i3), Integer.valueOf(iE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(HealthMultiNumberPicker healthMultiNumberPicker, TargetConfig targetConfig, hca hcaVar, hca hcaVar2, int i) {
        int[] selectedLocations = healthMultiNumberPicker.getSelectedLocations();
        if (selectedLocations.length < 2) {
            LogUtil.d("Suggestion_EditDialogBuilder", "the SelectedLocation Value is empty");
            return;
        }
        int i2 = selectedLocations[1];
        this.h[1] = i2;
        targetConfig.setId(Integer.toString(17));
        if (i == 0) {
            if (hcaVar != null) {
                int i3 = i2 + 1;
                LogUtil.a("Suggestion_EditDialogBuilder", "maxHeartRateZoneConfig lowHeartRate:", Integer.valueOf(hcaVar.e(i3, true)), " highHeartRate:", Integer.valueOf(hcaVar.e(i3, false)));
            }
        } else if (hcaVar2 != null) {
            int i4 = i2 + 1;
            LogUtil.a("Suggestion_EditDialogBuilder", "reserveHeartRateZoneConfig lowHeartRate:", Integer.valueOf(hcaVar2.e(i4, true)), " highHeartRate:", Integer.valueOf(hcaVar2.e(i4, false)));
        }
        double d = i2 + 1;
        targetConfig.setValueL(d);
        targetConfig.setValueH(d);
        targetConfig.setValueType(TargetConfig.ValueTypes.LOW_VALUE.getValue());
        LogUtil.a("Suggestion_EditDialogBuilder", "mHeartRateSectionSelected is ", Integer.valueOf(i2));
    }

    public void c(final ChoreographedMultiActions choreographedMultiActions, int i) {
        final HealthNumberPicker healthNumberPicker = new HealthNumberPicker(this.f8854c);
        String[] repeatTimeArray = TypeConfig.getRepeatTimeArray(this.f8854c, i);
        healthNumberPicker.setDisplayedValues(repeatTimeArray);
        healthNumberPicker.setMaxValue(repeatTimeArray.length - 1);
        healthNumberPicker.setMinValue(0);
        if (choreographedMultiActions.getRepeatTimes() >= 2) {
            this.r = choreographedMultiActions.getRepeatTimes() - 2;
        }
        healthNumberPicker.setValue(this.r);
        healthNumberPicker.setSelectionDivider(ContextCompat.getDrawable(this.f8854c, R.drawable.numberpicker_line_title));
        healthNumberPicker.setOnValuePickedListener(new HealthNumberPicker.OnPickedListener() { // from class: com.huawei.health.suggestion.customizecourse.manager.EditDialogBuilder.21
            @Override // com.huawei.ui.commonui.numberpicker.HealthNumberPicker.OnPickedListener
            public void onValuePicked(int i2, int i3) {
                LogUtil.a("Suggestion_EditDialogBuilder", "repeat times oldValue:", Integer.valueOf(i2), " newValue:", Integer.valueOf(i3));
            }
        });
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this.f8854c);
        builder.d(healthNumberPicker);
        builder.b(R.string.IDS_settings_repeat);
        builder.d(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: com.huawei.health.suggestion.customizecourse.manager.EditDialogBuilder.27
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                EditDialogBuilder.this.r = healthNumberPicker.getValue();
                LogUtil.a("Suggestion_EditDialogBuilder", "repeat times selected:", Integer.valueOf(EditDialogBuilder.this.r));
                choreographedMultiActions.setRepeatTimes(EditDialogBuilder.this.r + 2);
                EditDialogBuilder editDialogBuilder = EditDialogBuilder.this;
                editDialogBuilder.b(editDialogBuilder.q);
            }
        });
        builder.c(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.health.suggestion.customizecourse.manager.EditDialogBuilder.26
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        CustomViewDialog customViewDialogD = builder.d();
        this.q = customViewDialogD;
        customViewDialogD.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(CustomViewDialog customViewDialog) {
        OnDismissListener onDismissListener = this.k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
        if (customViewDialog != null) {
            customViewDialog.dismiss();
        }
    }
}
