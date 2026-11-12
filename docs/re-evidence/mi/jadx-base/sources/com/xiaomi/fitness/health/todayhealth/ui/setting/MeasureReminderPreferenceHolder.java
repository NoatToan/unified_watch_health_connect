package com.xiaomi.fitness.health.todayhealth.ui.setting;

import android.content.Context;
import android.content.DialogInterface;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.common.dialog.HourMinutePickerDialog;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.health.todayhealth.model.HealthCheckMeasureReminderSettingData;
import com.xiaomi.fitness.health.todayhealth.model.HealthCheckSettingUtils;
import com.xiaomi.fitness.health.todayhealth.ui.setting.MeasureReminderPreferenceHolder;
import defpackage.av6;
import defpackage.c0j;
import defpackage.jui;
import defpackage.ohi;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import miuix.preference.DropDownPreference;
import miuix.preference.PreferenceFragment;
import miuix.preference.TextPreference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0015\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\n\u0018\u0000 92\u00020\u0001:\u00019B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u001c\u001a\u00020\u001d2\b\u0010\n\u001a\u0004\u0018\u00010\tJ\b\u0010\u001e\u001a\u00020\u001dH\u0002J\b\u0010\u001f\u001a\u00020\u001dH\u0002J\u001e\u0010 \u001a\u00020\u001a2\u0014\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\"H\u0002J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aH\u0002J\u0018\u0010&\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020$H\u0002J \u0010(\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u0017H\u0002J\u0010\u0010,\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020\u001aH\u0002J#\u0010-\u001a\u0004\u0018\u0001H.\"\n\b\u0000\u0010.*\u0004\u0018\u00010/2\u0006\u0010+\u001a\u000200H\u0002¢\u0006\u0002\u00101J\b\u00102\u001a\u00020\u001dH\u0002J\u0010\u00103\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020\u001aH\u0002J\u0016\u00107\u001a\u00020\u001d2\u0006\u00108\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020\u001aR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u00104\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b5\u00106¨\u0006:"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/ui/setting/MeasureReminderPreferenceHolder;", "", "fragment", "Lcom/xiaomi/fitness/health/todayhealth/ui/setting/HealthCheckMeasureReminderSettingFragment;", "<init>", "(Lcom/xiaomi/fitness/health/todayhealth/ui/setting/HealthCheckMeasureReminderSettingFragment;)V", "mFragment", "Lmiuix/preference/PreferenceFragment;", "value", "Lcom/xiaomi/fitness/health/todayhealth/model/HealthCheckMeasureReminderSettingData;", "data", "getData", "()Lcom/xiaomi/fitness/health/todayhealth/model/HealthCheckMeasureReminderSettingData;", "mRepeatPref", "Lmiuix/preference/TextPreference;", "mDayCountPref", "Lmiuix/preference/DropDownPreference;", "mCategoryPref", "Landroidx/preference/PreferenceCategory;", "switch", "Lcom/xiaomi/fitness/health/todayhealth/ui/setting/HealthCheckMeasureReminderSwitchPreferenceCompat;", "mRemindPrefKeys", "", "", "mMultiDialogHelpMap", "", "", "", "updateData", "", "init", "showRepeatDialogIfNeed", "getRepeatCode", "multiDialogHelpMap", "", "getNewRemindTimes", "", "counts", "dynamicRemindTimesView", "remindTimes", "initNewRemindPreference", "index", "minutes", "key", "showRemindTimeDialogIfNeed", "findPreference", "T", "Landroidx/preference/Preference;", "", "(Ljava/lang/CharSequence;)Landroidx/preference/Preference;", "refreshViewIfNeed", "refreshRemindTime", "reqCodeRange", "getReqCodeRange", "()[I", "updateRemindTimeResult", AccountInteractActivity.KEY_REQUEST_CODE, "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MeasureReminderPreferenceHolder {
    private static final int REQ_REMIND_TIME_BASE = 400;

    @Nullable
    private HealthCheckMeasureReminderSettingData data;

    @Nullable
    private PreferenceCategory mCategoryPref;

    @Nullable
    private DropDownPreference mDayCountPref;

    @NotNull
    private final PreferenceFragment mFragment;

    @NotNull
    private Map<Integer, Boolean> mMultiDialogHelpMap;

    @Nullable
    private List<String> mRemindPrefKeys;

    @Nullable
    private TextPreference mRepeatPref;

    @Nullable
    private HealthCheckMeasureReminderSwitchPreferenceCompat switch;

    public MeasureReminderPreferenceHolder(@NotNull HealthCheckMeasureReminderSettingFragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.mFragment = fragment;
        this.mMultiDialogHelpMap = new LinkedHashMap();
        init();
    }

    private final void dynamicRemindTimesView(int counts, int[] remindTimes) {
        HealthCheckMeasureReminderSettingData healthCheckMeasureReminderSettingData = this.data;
        Intrinsics.checkNotNull(healthCheckMeasureReminderSettingData);
        healthCheckMeasureReminderSettingData.setRemindTimes(remindTimes);
        if (!ArrayUtils.isEmpty(this.mRemindPrefKeys)) {
            List<String> list = this.mRemindPrefKeys;
            Intrinsics.checkNotNull(list);
            for (String str : list) {
                PreferenceCategory preferenceCategory = this.mCategoryPref;
                Intrinsics.checkNotNull(preferenceCategory);
                Preference preferenceFindPreference = findPreference(str);
                Intrinsics.checkNotNull(preferenceFindPreference);
                preferenceCategory.r(preferenceFindPreference);
            }
            List<String> list2 = this.mRemindPrefKeys;
            Intrinsics.checkNotNull(list2);
            list2.clear();
        }
        HealthCheckMeasureReminderSwitchPreferenceCompat healthCheckMeasureReminderSwitchPreferenceCompat = this.switch;
        Intrinsics.checkNotNull(healthCheckMeasureReminderSwitchPreferenceCompat);
        boolean zIsChecked = healthCheckMeasureReminderSwitchPreferenceCompat.isChecked();
        for (int i = 0; i < counts; i++) {
            String str2 = HealthCheckSettingConfig.REMINDER_TIME_STR + i;
            TextPreference textPreferenceInitNewRemindPreference = initNewRemindPreference(i, remindTimes[i], str2);
            PreferenceCategory preferenceCategory2 = this.mCategoryPref;
            Intrinsics.checkNotNull(preferenceCategory2);
            preferenceCategory2.h(textPreferenceInitNewRemindPreference);
            List<String> list3 = this.mRemindPrefKeys;
            Intrinsics.checkNotNull(list3);
            list3.add(str2);
            if (!zIsChecked) {
                textPreferenceInitNewRemindPreference.setVisible(false);
            }
        }
    }

    private final <T extends Preference> T findPreference(CharSequence key) {
        return (T) this.mFragment.findPreference(key);
    }

    private final int[] getNewRemindTimes(int counts) {
        int[] iArr = new int[counts];
        for (int i = 0; i < counts; i++) {
            iArr[i] = (int) (((long) 480) + (((long) i) * TimeUnit.HOURS.toMinutes(1L)));
        }
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getRepeatCode(Map<Integer, Boolean> multiDialogHelpMap) {
        int i = 0;
        for (Map.Entry<Integer, Boolean> entry : multiDialogHelpMap.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            Boolean value = entry.getValue();
            if (value != null && value.booleanValue()) {
                i |= 1 << iIntValue;
            }
        }
        return i;
    }

    private final void init() {
        this.mRemindPrefKeys = new ArrayList();
        this.switch = (HealthCheckMeasureReminderSwitchPreferenceCompat) findPreference("reminder_enable");
        this.mCategoryPref = (PreferenceCategory) findPreference(HealthCheckSettingConfig.REMINDER_ENABLE_GROUP_STR);
        this.mRepeatPref = (TextPreference) findPreference(HealthCheckSettingConfig.REMINDER_REPEAT_MODE_STR);
        this.mDayCountPref = (DropDownPreference) findPreference(HealthCheckSettingConfig.REMINDER_DAILY_COUNT_STR);
        CharSequence[] charSequenceArr = new CharSequence[12];
        int i = 0;
        while (i < 12) {
            int i2 = i + 1;
            charSequenceArr[i] = String.valueOf(i2);
            i = i2;
        }
        DropDownPreference dropDownPreference = this.mDayCountPref;
        Intrinsics.checkNotNull(dropDownPreference);
        dropDownPreference.D(charSequenceArr);
        DropDownPreference dropDownPreference2 = this.mDayCountPref;
        Intrinsics.checkNotNull(dropDownPreference2);
        dropDownPreference2.F(charSequenceArr);
        DropDownPreference dropDownPreference3 = this.mDayCountPref;
        Intrinsics.checkNotNull(dropDownPreference3);
        dropDownPreference3.G(null);
        DropDownPreference dropDownPreference4 = this.mDayCountPref;
        Intrinsics.checkNotNull(dropDownPreference4);
        dropDownPreference4.E(null);
        DropDownPreference dropDownPreference5 = this.mDayCountPref;
        Intrinsics.checkNotNull(dropDownPreference5);
        dropDownPreference5.setOnPreferenceChangeListener(new Preference.c() { // from class: pbf
            @Override // androidx.preference.Preference.c
            public final boolean a(Preference preference, Object obj) {
                return MeasureReminderPreferenceHolder.init$lambda$0(this.f30202a, preference, obj);
            }
        });
        TextPreference textPreference = this.mRepeatPref;
        Intrinsics.checkNotNull(textPreference);
        textPreference.setOnPreferenceClickListener(new Preference.d() { // from class: qbf
            @Override // androidx.preference.Preference.d
            public final boolean a(Preference preference) {
                return MeasureReminderPreferenceHolder.init$lambda$1(this.f31323a, preference);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean init$lambda$0(MeasureReminderPreferenceHolder this$0, Preference preference, Object newValue) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        String str = (String) newValue;
        if (this$0.data == null) {
            return true;
        }
        int i = Integer.parseInt(str);
        HealthCheckMeasureReminderSettingData healthCheckMeasureReminderSettingData = this$0.data;
        Intrinsics.checkNotNull(healthCheckMeasureReminderSettingData);
        healthCheckMeasureReminderSettingData.setDayRemindCount(i);
        this$0.dynamicRemindTimesView(i, this$0.getNewRemindTimes(i));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean init$lambda$1(MeasureReminderPreferenceHolder this$0, Preference preference) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showRepeatDialogIfNeed();
        return true;
    }

    private final TextPreference initNewRemindPreference(final int index, int minutes, String key) {
        TextPreference textPreference = new TextPreference(this.mFragment.requireContext());
        textPreference.setTitle(this.mFragment.getString(c0j.S4, Integer.valueOf(index + 1)));
        textPreference.p(TimeUtils.parseMinutesToHHMM(minutes));
        textPreference.setKey(key);
        textPreference.setLayoutResource(jui.Y3);
        textPreference.setOnPreferenceClickListener(new Preference.d() { // from class: obf
            @Override // androidx.preference.Preference.d
            public final boolean a(Preference preference) {
                return MeasureReminderPreferenceHolder.initNewRemindPreference$lambda$2(this.f28968a, index, preference);
            }
        });
        return textPreference;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initNewRemindPreference$lambda$2(MeasureReminderPreferenceHolder this$0, int i, Preference preference) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showRemindTimeDialogIfNeed(i);
        return true;
    }

    private final void refreshRemindTime(int index) {
        List<String> list = this.mRemindPrefKeys;
        Intrinsics.checkNotNull(list);
        int size = list.size();
        HealthCheckMeasureReminderSettingData healthCheckMeasureReminderSettingData = this.data;
        Intrinsics.checkNotNull(healthCheckMeasureReminderSettingData);
        if (size != healthCheckMeasureReminderSettingData.getRemindTimes().length) {
            return;
        }
        List<String> list2 = this.mRemindPrefKeys;
        Intrinsics.checkNotNull(list2);
        Preference preferenceFindPreference = findPreference(list2.get(index));
        Intrinsics.checkNotNull(preferenceFindPreference);
        HealthCheckMeasureReminderSettingData healthCheckMeasureReminderSettingData2 = this.data;
        Intrinsics.checkNotNull(healthCheckMeasureReminderSettingData2);
        ((TextPreference) preferenceFindPreference).p(TimeUtils.parseMinutesToHHMM(healthCheckMeasureReminderSettingData2.getRemindTimes()[index]));
    }

    private final void refreshViewIfNeed() {
        HealthCheckMeasureReminderSettingData healthCheckMeasureReminderSettingData = this.data;
        Intrinsics.checkNotNull(healthCheckMeasureReminderSettingData);
        int[] repeatDays = HealthCheckSettingUtils.getRepeatDays(healthCheckMeasureReminderSettingData.getRepeat());
        Context contextRequireContext = this.mFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        String customRepeatFormatString = HealthCheckSettingUtils.getCustomRepeatFormatString(contextRequireContext, repeatDays);
        HealthCheckMeasureReminderSettingData healthCheckMeasureReminderSettingData2 = this.data;
        Intrinsics.checkNotNull(healthCheckMeasureReminderSettingData2);
        int dayRemindCount = healthCheckMeasureReminderSettingData2.getDayRemindCount();
        DropDownPreference dropDownPreference = this.mDayCountPref;
        Intrinsics.checkNotNull(dropDownPreference);
        dropDownPreference.H(String.valueOf(dayRemindCount));
        TextPreference textPreference = this.mRepeatPref;
        Intrinsics.checkNotNull(textPreference);
        textPreference.p(customRepeatFormatString);
        List<String> list = this.mRemindPrefKeys;
        Intrinsics.checkNotNull(list);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            refreshRemindTime(i);
        }
    }

    private final void showRemindTimeDialogIfNeed(int index) {
        HealthCheckMeasureReminderSettingData healthCheckMeasureReminderSettingData = this.data;
        if (healthCheckMeasureReminderSettingData == null) {
            return;
        }
        Intrinsics.checkNotNull(healthCheckMeasureReminderSettingData);
        int[] remindTimes = healthCheckMeasureReminderSettingData.getRemindTimes();
        if (index < 0 || index >= remindTimes.length) {
            return;
        }
        int i = remindTimes[index];
        int i2 = i / 60;
        int i3 = i % 60;
        HourMinutePickerDialog hourMinutePickerDialogCreate = new HourMinutePickerDialog.a("hm").setCustomLayoutId(jui.f7).setPositiveText(c0j.J7).setNegativeText(c0j.D7).setCancelable(false).setDialogTitle(new DialogParams.DialogDescriptionString(c0j.S4, Integer.valueOf(index + 1))).create();
        int[] iArr = new int[59];
        for (int i4 = 0; i4 < 59; i4++) {
            iArr[i4] = i4;
        }
        hourMinutePickerDialogCreate.setMinuteData(iArr);
        hourMinutePickerDialogCreate.setRequestCode(index + 400);
        hourMinutePickerDialogCreate.setValue(i2, i3);
        hourMinutePickerDialogCreate.showIfNeed(this.mFragment.getChildFragmentManager());
    }

    private final void showRepeatDialogIfNeed() {
        if (this.data == null) {
            return;
        }
        String[] stringArray = this.mFragment.getResources().getStringArray(ohi.e);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        int length = stringArray.length;
        boolean[] zArr = new boolean[length];
        HealthCheckMeasureReminderSettingData healthCheckMeasureReminderSettingData = this.data;
        Intrinsics.checkNotNull(healthCheckMeasureReminderSettingData);
        int[] repeatDays = HealthCheckSettingUtils.getRepeatDays(healthCheckMeasureReminderSettingData.getRepeat());
        this.mMultiDialogHelpMap.clear();
        for (int i : repeatDays) {
            int i2 = i - 1;
            if (i2 >= 0 && i2 < length) {
                zArr[i2] = true;
            }
        }
        for (int i3 = 0; i3 < length; i3++) {
            this.mMultiDialogHelpMap.put(Integer.valueOf(i3), Boolean.valueOf(zArr[i3]));
        }
        CommonDialog commonDialogCreate = new CommonDialog.c("repeat").setDialogTitle(c0j.V4).setNegativeText(c0j.D7).setPositiveText(c0j.J7).setItems(stringArray).setItemsChoices(zArr).create();
        Intrinsics.checkNotNullExpressionValue(commonDialogCreate, "create(...)");
        Intrinsics.checkNotNull(commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.health.todayhealth.ui.setting.MeasureReminderPreferenceHolder.showRepeatDialogIfNeed.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                Intrinsics.checkNotNullParameter(dialog, "dialog");
                super.onDialogClick(dialogName, dialog, which);
                if (which == -1) {
                    MeasureReminderPreferenceHolder measureReminderPreferenceHolder = MeasureReminderPreferenceHolder.this;
                    int repeatCode = measureReminderPreferenceHolder.getRepeatCode(measureReminderPreferenceHolder.mMultiDialogHelpMap);
                    int[] repeatDays2 = HealthCheckSettingUtils.getRepeatDays(repeatCode);
                    HealthCheckMeasureReminderSettingData data = MeasureReminderPreferenceHolder.this.getData();
                    Intrinsics.checkNotNull(data);
                    data.setRepeat(repeatCode);
                    TextPreference textPreference = MeasureReminderPreferenceHolder.this.mRepeatPref;
                    Intrinsics.checkNotNull(textPreference);
                    Context contextRequireContext = MeasureReminderPreferenceHolder.this.mFragment.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    textPreference.p(HealthCheckSettingUtils.getCustomRepeatFormatString(contextRequireContext, repeatDays2));
                }
            }

            @Override // defpackage.av6
            public void onDialogMultiClick(String dialogName, int which, boolean isChecked) {
                Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                super.onDialogMultiClick(dialogName, which, isChecked);
                if (which < 0 || which >= MeasureReminderPreferenceHolder.this.mMultiDialogHelpMap.size()) {
                    return;
                }
                MeasureReminderPreferenceHolder.this.mMultiDialogHelpMap.put(Integer.valueOf(which), Boolean.valueOf(isChecked));
            }
        }), "null cannot be cast to non-null type com.xiaomi.fitness.baseui.dialog.CommonDialog<com.xiaomi.fitness.baseui.dialog.DialogParams>");
        commonDialogCreate.showIfNeed(this.mFragment.getChildFragmentManager());
    }

    @Nullable
    public final HealthCheckMeasureReminderSettingData getData() {
        return this.data;
    }

    @NotNull
    public final int[] getReqCodeRange() {
        HealthCheckMeasureReminderSettingData healthCheckMeasureReminderSettingData = this.data;
        if (healthCheckMeasureReminderSettingData == null) {
            return new int[0];
        }
        Intrinsics.checkNotNull(healthCheckMeasureReminderSettingData);
        return new int[]{400, healthCheckMeasureReminderSettingData.getRemindTimes().length + 399};
    }

    public final void updateData(@Nullable HealthCheckMeasureReminderSettingData data) {
        if (data != null) {
            this.data = new HealthCheckMeasureReminderSettingData(data.getRepeat(), data.getDayRemindCount(), data.getRemindTimes());
            dynamicRemindTimesView(data.getDayRemindCount(), data.getRemindTimes());
            refreshViewIfNeed();
        }
    }

    public final void updateRemindTimeResult(int requestCode, int minutes) {
        int i = requestCode - 400;
        HealthCheckMeasureReminderSettingData healthCheckMeasureReminderSettingData = this.data;
        Intrinsics.checkNotNull(healthCheckMeasureReminderSettingData);
        int[] remindTimes = healthCheckMeasureReminderSettingData.getRemindTimes();
        if (remindTimes == null || i < 0 || i >= remindTimes.length) {
            return;
        }
        int[] iArr = (int[]) remindTimes.clone();
        iArr[i] = minutes;
        HealthCheckMeasureReminderSettingData healthCheckMeasureReminderSettingData2 = this.data;
        Intrinsics.checkNotNull(healthCheckMeasureReminderSettingData2);
        healthCheckMeasureReminderSettingData2.setRemindTimes(iArr);
        refreshRemindTime(i);
    }
}
