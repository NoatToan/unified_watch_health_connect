package com.xiaomi.fitness.health.sleep.rhythm.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.ViewGroupKt;
import androidx.fragment.app.FragmentActivity;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.dialog.HourMinutePickerDialog;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.health.sleep.rhythm.SleepRhythmMonitorViewModel;
import com.xiaomi.fitness.health.sleep.rhythm.data.SleepRhythmRemindConfig;
import com.xiaomi.fitness.health.sleep.rhythm.data.SleepRhythmRemindConfigKt;
import com.xiaomi.fitness.health.sleep.rhythm.ui.SleepRhythmRemindSettingFragment;
import com.xiaomi.fitness.health.sleep.rhythm.view.PickSleepTimeDialog;
import com.xiaomi.fitness.health.sleep.utils.SleepTrackHelper;
import com.xiaomi.fitness.widget.RightArrowSingleLineTextView;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import defpackage.c0j;
import defpackage.eri;
import defpackage.jui;
import defpackage.t64;
import defpackage.ut9;
import defpackage.yaa;
import defpackage.z1c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import miuix.appcompat.widget.Spinner;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 82\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u00018B\u0007¢\u0006\u0004\b7\u0010\u0007J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0017\u0010\u0007J\u000f\u0010\u0018\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0018\u0010\u0007J\u000f\u0010\u0019\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0019\u0010\u0007J\u000f\u0010\u001a\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001a\u0010\u0007J\u000f\u0010\u001b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001b\u0010\u0007J\u000f\u0010\u001c\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\"\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u001f\u0010$\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b&\u0010\u0016J!\u0010*\u001a\u00020\u00052\u0006\u0010(\u001a\u00020'2\b\u0010)\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J'\u0010/\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b/\u0010#R\u0016\u00101\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00103\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00102R\u0014\u00106\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00069"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/ui/SleepRhythmRemindSettingFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/health/sleep/rhythm/SleepRhythmMonitorViewModel;", "Lz1c;", "Lyaa;", "", "initView", "()V", "", "counts", "", "getNewRemindTimes", "(I)[I", "remindTimes", "dynamicRemindTimesView", "(I[I)V", "index", "minutes", "Lcom/xiaomi/fitness/widget/RightArrowSingleLineTextView;", "initNewRemindPreference", "(II)Lcom/xiaomi/fitness/widget/RightArrowSingleLineTextView;", "showRemindTimeDialogIfNeed", "(I)V", "syncConfigToDeviceIfNeed", "updateSwitchAssociatedView", "registerObserver", "refreshViewIfNeed", "requestMonitorConfig", "getReqCodeRange", "()[I", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/os/Bundle;", "data", "dealRemindTimeResult", "(IILandroid/os/Bundle;)V", "updateRemindTimeResult", "(II)V", "refreshRemindTime", "Landroid/view/View;", "view", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "onBackPressed", "()Z", "onFragmentResult", "Lcom/xiaomi/fitness/health/sleep/rhythm/data/SleepRhythmRemindConfig;", "helpCompareRemindConfig", "Lcom/xiaomi/fitness/health/sleep/rhythm/data/SleepRhythmRemindConfig;", "currentRemindConfig", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSleepRhythmRemindSettingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepRhythmRemindSettingFragment.kt\ncom/xiaomi/fitness/health/sleep/rhythm/ui/SleepRhythmRemindSettingFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,277:1\n1557#2:278\n1628#2,3:279\n*S KotlinDebug\n*F\n+ 1 SleepRhythmRemindSettingFragment.kt\ncom/xiaomi/fitness/health/sleep/rhythm/ui/SleepRhythmRemindSettingFragment\n*L\n187#1:278\n187#1:279,3\n*E\n"})
public final class SleepRhythmRemindSettingFragment extends Hilt_SleepRhythmRemindSettingFragment<SleepRhythmMonitorViewModel, z1c> implements yaa {
    public static final int DEFAULT_CUSTOM_START_REMIND_TIME = 480;
    public static final int REQ_REMIND_TIME_BASE = 100;

    @NotNull
    public static final String TAG = "SleepRhythmRemindTag";

    @NotNull
    private SleepRhythmRemindConfig helpCompareRemindConfig = new SleepRhythmRemindConfig(false, 0, new ArrayList());

    @NotNull
    private SleepRhythmRemindConfig currentRemindConfig = new SleepRhythmRemindConfig(false, 0, new ArrayList());

    private final void dealRemindTimeResult(int requestCode, int resultCode, Bundle data) {
        int[] reqCodeRange = getReqCodeRange();
        if (ArrayUtils.isEmpty(CollectionsKt__CollectionsJVMKt.listOf(reqCodeRange)) || requestCode < reqCodeRange[0] || requestCode > reqCodeRange[1] || resultCode != -1) {
            return;
        }
        int i = data.getInt(PickSleepTimeDialog.KEY_SELECT_HOUR, -1);
        int i2 = data.getInt(PickSleepTimeDialog.KEY_SELECT_MINUTE, -1);
        if (i == -1 || i2 == -1) {
            return;
        }
        updateRemindTimeResult(requestCode, (int) ((((long) i) * TimeUnit.HOURS.toMinutes(1L)) + ((long) i2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void dynamicRemindTimesView(int counts, int[] remindTimes) {
        if (counts == this.currentRemindConfig.getDayRemindCount()) {
            return;
        }
        ((z1c) getMBinding()).D.removeAllViews();
        if (!(remindTimes.length == 0)) {
            int length = remindTimes.length;
            for (int i = 0; i < length; i++) {
                ((z1c) getMBinding()).D.addView(initNewRemindPreference(i, remindTimes[i]));
            }
        }
        this.currentRemindConfig.setRemindTimes(ArraysKt___ArraysKt.toMutableList(remindTimes));
        this.currentRemindConfig.setDayRemindCount(counts);
        ((z1c) getMBinding()).C.setSpinnerSelection(this.currentRemindConfig.getDayRemindCount() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] getNewRemindTimes(int counts) {
        int[] iArr = new int[counts];
        for (int i = 0; i < counts; i++) {
            iArr[i] = (int) (((long) 480) + (((long) i) * TimeUnit.HOURS.toMinutes(1L)));
        }
        return iArr;
    }

    private final int[] getReqCodeRange() {
        return new int[]{100, this.currentRemindConfig.getRemindTimes().size() + 99};
    }

    private final RightArrowSingleLineTextView initNewRemindPreference(final int index, int minutes) {
        FragmentActivity mActivity = getMActivity();
        Intrinsics.checkNotNull(mActivity);
        RightArrowSingleLineTextView rightArrowSingleLineTextView = new RightArrowSingleLineTextView(mActivity, null, 0, 6, null);
        rightArrowSingleLineTextView.setTitle(getString(c0j.v2, Integer.valueOf(index + 1)));
        rightArrowSingleLineTextView.setRemindText(TimeUtils.parseMinutesToHHMM(minutes));
        rightArrowSingleLineTextView.setOnClickListener(new View.OnClickListener() { // from class: jvm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepRhythmRemindSettingFragment.initNewRemindPreference$lambda$1(this.f23188a, index, view);
            }
        });
        return rightArrowSingleLineTextView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initNewRemindPreference$lambda$1(SleepRhythmRemindSettingFragment this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showRemindTimeDialogIfNeed(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        ((z1c) getMBinding()).B.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: mvm
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                SleepRhythmRemindSettingFragment.initView$lambda$0(this.f27265a, z, iSwitchButton);
            }
        });
        ((Spinner) ((z1c) getMBinding()).C.findViewById(eri.Og)).setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: com.xiaomi.fitness.health.sleep.rhythm.ui.SleepRhythmRemindSettingFragment.initView.2
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Logger.d(SleepRhythmRemindSettingFragment.TAG, "spinner onItemSelected " + position);
                SleepRhythmRemindSettingFragment sleepRhythmRemindSettingFragment = SleepRhythmRemindSettingFragment.this;
                int i = position + 1;
                sleepRhythmRemindSettingFragment.dynamicRemindTimesView(i, sleepRhythmRemindSettingFragment.getNewRemindTimes(i));
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(SleepRhythmRemindSettingFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SleepTrackHelper.INSTANCE.trackSleepRhythmDairyRemindClick(z);
        this$0.currentRemindConfig.setEnable(z);
        this$0.updateSwitchAssociatedView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void refreshRemindTime(int index) {
        if (((z1c) getMBinding()).D.getChildCount() != this.currentRemindConfig.getRemindTimes().size()) {
            return;
        }
        LinearLayoutCompat remindRepeatTimesView = ((z1c) getMBinding()).D;
        Intrinsics.checkNotNullExpressionValue(remindRepeatTimesView, "remindRepeatTimesView");
        View view = ViewGroupKt.get(remindRepeatTimesView, index);
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.xiaomi.fitness.widget.RightArrowSingleLineTextView");
        ((RightArrowSingleLineTextView) view).setRemindText(TimeUtils.parseMinutesToHHMM(this.currentRemindConfig.getRemindTimes().get(index).intValue()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void refreshViewIfNeed() {
        ((z1c) getMBinding()).B.setSwitch(this.currentRemindConfig.isEnable());
        updateSwitchAssociatedView();
        ((z1c) getMBinding()).C.setSpinnerSelection(this.currentRemindConfig.getDayRemindCount() - 1);
        if (!this.currentRemindConfig.getRemindTimes().isEmpty()) {
            int size = this.currentRemindConfig.getRemindTimes().size();
            for (int i = 0; i < size; i++) {
                ((z1c) getMBinding()).D.addView(initNewRemindPreference(i, this.currentRemindConfig.getRemindTimes().get(i).intValue()));
            }
        }
        hideLoading();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void registerObserver() {
        ((SleepRhythmMonitorViewModel) getMViewModel()).getGetRemindResultLiveData().observe(getViewLifecycleOwner(), new SleepRhythmRemindSettingFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: kvm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepRhythmRemindSettingFragment.registerObserver$lambda$4(this.f24344a, (Pair) obj);
            }
        }));
        ((SleepRhythmMonitorViewModel) getMViewModel()).getSetRemindConfigResultLiveData().observe(getViewLifecycleOwner(), new SleepRhythmRemindSettingFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: lvm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepRhythmRemindSettingFragment.registerObserver$lambda$5(this.f25476a, (Pair) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit registerObserver$lambda$4(SleepRhythmRemindSettingFragment this$0, Pair pair) {
        List listEmptyList;
        t64[] t64VarArr;
        t64[] t64VarArr2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismissDialogForce();
        if (((Number) pair.getFirst()).intValue() == 0) {
            ut9 ut9Var = (ut9) pair.getSecond();
            SleepRhythmRemindConfig sleepRhythmRemindConfig = this$0.currentRemindConfig;
            int length = 0;
            sleepRhythmRemindConfig.setEnable(ut9Var != null ? ut9Var.c : false);
            if (ut9Var != null && (t64VarArr2 = ut9Var.d) != null) {
                length = t64VarArr2.length;
            }
            sleepRhythmRemindConfig.setDayRemindCount(length);
            if (ut9Var == null || (t64VarArr = ut9Var.d) == null || (listEmptyList = ArraysKt___ArraysKt.toList(t64VarArr)) == null) {
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            }
            List<t64> list = listEmptyList;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (t64 t64Var : list) {
                arrayList.add(Integer.valueOf((t64Var.c * 60) + t64Var.d));
            }
            sleepRhythmRemindConfig.setRemindTimes(arrayList);
            this$0.helpCompareRemindConfig = SleepRhythmRemindConfigKt.deepCopy(this$0.currentRemindConfig);
            this$0.refreshViewIfNeed();
        } else {
            Context context = this$0.getContext();
            if (context != null) {
                ToastExtKt.toastShort(context, c0j.f4801r);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit registerObserver$lambda$5(SleepRhythmRemindSettingFragment this$0, Pair pair) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismissDialogForce();
        if (((Number) pair.getFirst()).intValue() == 0) {
            Context context = this$0.getContext();
            if (context != null) {
                ToastExtKt.toastShort(context, c0j.common_set_success);
            }
        } else {
            Context context2 = this$0.getContext();
            if (context2 != null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format("%s %s", Arrays.copyOf(new Object[]{this$0.getString(c0j.common_set_error), this$0.getString(c0j.f4801r)}, 2));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                ToastExtKt.toastShort(context2, str);
            }
        }
        this$0.finish();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void requestMonitorConfig() {
        ((SleepRhythmMonitorViewModel) getMViewModel()).requestSleepRhythmRemind();
        PageState.DefaultImpls.showLoading$default(this, null, 0, false, 3, null);
    }

    private final void showRemindTimeDialogIfNeed(int index) {
        List<Integer> remindTimes = this.currentRemindConfig.getRemindTimes();
        if (index < 0 || index >= remindTimes.size()) {
            return;
        }
        HourMinutePickerDialog hourMinutePickerDialog = (HourMinutePickerDialog) getChildFragmentManager().l0("sleep_remind_hm");
        if (hourMinutePickerDialog == null || !hourMinutePickerDialog.isShowing()) {
            int iIntValue = remindTimes.get(index).intValue();
            int i = iIntValue / 60;
            int i2 = iIntValue % 60;
            if (hourMinutePickerDialog == null) {
                HourMinutePickerDialog hourMinutePickerDialogCreate = new HourMinutePickerDialog.a("hm").setCustomLayoutId(jui.f7).setPositiveText(c0j.J7).setNegativeText(c0j.D7).setCancelable(false).setDialogTitle(new DialogParams.DialogDescriptionString(c0j.v2, Integer.valueOf(index + 1))).create();
                Intrinsics.checkNotNullExpressionValue(hourMinutePickerDialogCreate, "create(...)");
                hourMinutePickerDialog = hourMinutePickerDialogCreate;
            }
            hourMinutePickerDialog.setRequestCode(index + 100);
            hourMinutePickerDialog.setValue(i, i2);
            hourMinutePickerDialog.showIfNeed(getChildFragmentManager());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void syncConfigToDeviceIfNeed() {
        Logger.i(TAG, "syncConfigToDeviceIfNeed old:" + this.helpCompareRemindConfig + " current:" + this.currentRemindConfig);
        if (Intrinsics.areEqual(this.currentRemindConfig, this.helpCompareRemindConfig)) {
            Logger.i(TAG, "syncConfigToDeviceIfNeed no modify.. ");
            finish();
        } else {
            ((SleepRhythmMonitorViewModel) getMViewModel()).setSleepRhythmRemind(this.currentRemindConfig.isEnable(), this.currentRemindConfig.getRemindTimes());
            PageState.DefaultImpls.showLoading$default(this, null, 0, false, 3, null);
        }
    }

    private final void updateRemindTimeResult(int requestCode, int minutes) {
        int i = requestCode - 100;
        int[] intArray = CollectionsKt___CollectionsKt.toIntArray(this.currentRemindConfig.getRemindTimes());
        if (i < 0 || i >= intArray.length) {
            return;
        }
        int[] iArr = (int[]) intArray.clone();
        iArr[i] = minutes;
        this.currentRemindConfig.setRemindTimes(ArraysKt___ArraysKt.toMutableList(iArr));
        refreshRemindTime(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateSwitchAssociatedView() {
        LinearLayoutCompat remindEnableContent = ((z1c) getMBinding()).A;
        Intrinsics.checkNotNullExpressionValue(remindEnableContent, "remindEnableContent");
        ExtUtilsKt.setVisible(remindEnableContent, this.currentRemindConfig.isEnable());
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jui.y5;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.view.BackPressHandler
    public boolean onBackPressed() {
        syncConfigToDeviceIfNeed();
        return true;
    }

    @Override // defpackage.yaa
    public void onFragmentResult(int requestCode, int resultCode, @NotNull Bundle data) {
        Intrinsics.checkNotNullParameter(data, "data");
        dealRemindTimeResult(requestCode, resultCode, data);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setActionBarExpandState(0);
        setActionBarResizeable(false);
        setTitle(c0j.Hj);
        initView();
        registerObserver();
        requestMonitorConfig();
    }
}
