package com.xiaomi.fitness.devicesettings.common.ecg;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.collection.ArrayMap;
import androidx.core.view.ViewGroupKt;
import androidx.fragment.app.FragmentActivity;
import com.google.gson.Gson;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingFragment;
import com.xiaomi.fitness.devicesettings.common.ecg.ECGMeasureRemindData;
import com.xiaomi.fitness.devicesettings.common.ecg.ECGMeasureRemindFragment;
import com.xiaomi.fitness.devicesettings.utils.DeviceSettingsPreference;
import com.xiaomi.fitness.devicesettings.utils.UtilsKt;
import com.xiaomi.fitness.health.sleep.rhythm.view.PickSleepTimeDialog;
import com.xiaomi.fitness.widget.RightArrowSingleLineTextView;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import defpackage.av6;
import defpackage.eui;
import defpackage.ig6;
import defpackage.lhi;
import defpackage.wzi;
import defpackage.yaa;
import defpackage.zqi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import miuix.appcompat.widget.Spinner;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 D2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001DB\u0007¢\u0006\u0004\bC\u0010\u0007J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u0007J\u001f\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0019\u0010\u0007J#\u0010\u001d\u001a\u00020\t2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001f\u0010\fJ\u0017\u0010!\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u000fH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u000fH\u0002¢\u0006\u0004\b#\u0010$J'\u0010)\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020\t2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J\u001f\u0010+\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0002¢\u0006\u0004\b+\u0010,J!\u00100\u001a\u00020\u00052\u0006\u0010.\u001a\u00020-2\b\u0010/\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u001bH\u0016¢\u0006\u0004\b2\u00103J\u0015\u00105\u001a\u00020\u000f2\u0006\u00104\u001a\u00020\t¢\u0006\u0004\b5\u0010\u0018J\u0015\u00107\u001a\u0002062\u0006\u0010 \u001a\u00020\u000f¢\u0006\u0004\b7\u00108J'\u00109\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020\t2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b9\u0010*R\u0016\u0010;\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R$\u0010>\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001b\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010B\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006E"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/ecg/ECGMeasureRemindFragment;", "Lcom/xiaomi/fitness/devicesettings/base/BaseLoadableBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/common/ecg/ECGMeasureRemindViewModel;", "Lig6;", "Lyaa;", "", "refreshViewIfNeed", "()V", "updateViewWithOpen", "", "index", "refreshRemindTime", "(I)V", "initRepeatCountDialog", "counts", "", "remindTimes", "dynamicRemindTimesView", "(I[I)V", "minutes", "Lcom/xiaomi/fitness/widget/RightArrowSingleLineTextView;", "initNewRemindPreference", "(II)Lcom/xiaomi/fitness/widget/RightArrowSingleLineTextView;", "getNewRemindTimes", "(I)[I", "showRepeatDialogIfNeed", "", "", "multiDialogHelpMap", "getRepeatCode", "(Ljava/util/Map;)I", "showRemindTimeDialogIfNeed", "days", "checkIsSuccessive", "([I)Z", "getReqCodeRange", "()[I", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/os/Bundle;", "data", "dealRemindTimeResult", "(IILandroid/os/Bundle;)V", "updateRemindTimeResult", "(II)V", "Landroid/view/View;", "view", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onBackPressed", "()Z", "code", "getRepeatDays", "", "getCustomRepeatFormatString", "([I)Ljava/lang/String;", "onFragmentResult", "Lcom/xiaomi/fitness/devicesettings/common/ecg/ECGMeasureRemindData;", "mRemindData", "Lcom/xiaomi/fitness/devicesettings/common/ecg/ECGMeasureRemindData;", "Landroidx/collection/ArrayMap;", "mMultiDialogHelpMap", "Landroidx/collection/ArrayMap;", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class ECGMeasureRemindFragment extends BaseLoadableBindingFragment<ECGMeasureRemindViewModel, ig6> implements yaa {
    public static final int DEFAULT_CUSTOM_START_REMIND_TIME = 480;
    public static final int REQ_REMIND_TIME_BASE = 400;

    @NotNull
    public static final String TAG = "ECGMeasureRemindFragment";

    @Nullable
    private ArrayMap<Integer, Boolean> mMultiDialogHelpMap;

    @NotNull
    private ECGMeasureRemindData mRemindData = new ECGMeasureRemindData(false, 127, 1, CollectionsKt__CollectionsKt.mutableListOf(480));

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ ig6 access$getMBinding(ECGMeasureRemindFragment eCGMeasureRemindFragment) {
        return (ig6) eCGMeasureRemindFragment.getMBinding();
    }

    private final boolean checkIsSuccessive(int[] days) {
        int length = days.length;
        for (int i = 1; i < length; i++) {
            if (days[i - 1] != days[i] - 1) {
                return false;
            }
        }
        return true;
    }

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
        Logger.d(TAG, "dynamicRemindTimesView counts = " + counts + ",mRemindData.dayRemindCount = " + this.mRemindData.getDayRemindCount() + ",mBinding.remindRepeatTimesView.childCount = " + ((ig6) getMBinding()).E.getChildCount());
        if (counts == this.mRemindData.getDayRemindCount()) {
            return;
        }
        if (counts <= this.mRemindData.getDayRemindCount()) {
            int dayRemindCount = this.mRemindData.getDayRemindCount() - 1;
            if (counts <= dayRemindCount) {
                while (true) {
                    ((ig6) getMBinding()).E.removeViewAt(dayRemindCount);
                    if (dayRemindCount == counts) {
                        break;
                    } else {
                        dayRemindCount--;
                    }
                }
            }
        } else {
            for (int dayRemindCount2 = this.mRemindData.getDayRemindCount(); dayRemindCount2 < counts; dayRemindCount2++) {
                ((ig6) getMBinding()).E.addView(initNewRemindPreference(dayRemindCount2, remindTimes[dayRemindCount2]));
            }
        }
        this.mRemindData.setRemindTimes(ArraysKt___ArraysKt.toMutableList(remindTimes));
        this.mRemindData.setDayRemindCount(counts);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] getNewRemindTimes(int counts) {
        int[] iArr = new int[counts];
        for (int i = 0; i < counts; i++) {
            iArr[i] = (int) (((long) 480) + (((long) i) * TimeUnit.HOURS.toMinutes(1L)));
        }
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getRepeatCode(Map<Integer, Boolean> multiDialogHelpMap) {
        int iIntValue = 0;
        for (Map.Entry<Integer, Boolean> entry : multiDialogHelpMap.entrySet()) {
            if (entry.getValue() != null && entry.getValue().booleanValue()) {
                iIntValue |= 1 << entry.getKey().intValue();
            }
        }
        return iIntValue;
    }

    private final int[] getReqCodeRange() {
        return new int[]{400, this.mRemindData.getRemindTimes().size() + 399};
    }

    private final RightArrowSingleLineTextView initNewRemindPreference(final int index, int minutes) {
        FragmentActivity mActivity = getMActivity();
        Intrinsics.checkNotNull(mActivity);
        RightArrowSingleLineTextView rightArrowSingleLineTextView = new RightArrowSingleLineTextView(mActivity, null, 0, 6, null);
        rightArrowSingleLineTextView.setTitle(getString(wzi.y3, Integer.valueOf(index + 1)));
        rightArrowSingleLineTextView.setRemindText(TimeUtils.parseMinutesToHHMM(minutes));
        rightArrowSingleLineTextView.setOnClickListener(new View.OnClickListener() { // from class: m87
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ECGMeasureRemindFragment.initNewRemindPreference$lambda$4(this.f25876a, index, view);
            }
        });
        return rightArrowSingleLineTextView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initNewRemindPreference$lambda$4(ECGMeasureRemindFragment this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (UtilsKt.isDeviceNotConnection()) {
            ToastUtil.showShortToast(wzi.u);
        } else {
            this$0.showRemindTimeDialogIfNeed(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initRepeatCountDialog() {
        ((Spinner) ((ig6) getMBinding()).C.findViewById(zqi.E8)).setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: com.xiaomi.fitness.devicesettings.common.ecg.ECGMeasureRemindFragment.initRepeatCountDialog.1
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (UtilsKt.isDeviceNotConnection()) {
                    ToastUtil.showShortToast(wzi.u);
                    ECGMeasureRemindFragment.access$getMBinding(ECGMeasureRemindFragment.this).C.getSpinner().setSelection(ECGMeasureRemindFragment.this.mRemindData.getDayRemindCount() - 1);
                } else {
                    ECGMeasureRemindFragment eCGMeasureRemindFragment = ECGMeasureRemindFragment.this;
                    int i = position + 1;
                    eCGMeasureRemindFragment.dynamicRemindTimesView(i, eCGMeasureRemindFragment.getNewRemindTimes(i));
                }
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(ECGMeasureRemindFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (UtilsKt.isDeviceNotConnection()) {
            iSwitchButton.setChecked(!z);
            ToastUtil.showShortToast(wzi.u);
        } else {
            this$0.mRemindData.setEnable(z);
            this$0.updateViewWithOpen();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1(ECGMeasureRemindFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (UtilsKt.isDeviceNotConnection()) {
            ToastUtil.showShortToast(wzi.u);
        } else {
            this$0.showRepeatDialogIfNeed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(ECGMeasureRemindFragment this$0, ECGMeasureRemindData it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        AnyExtKt.main$default(null, new ECGMeasureRemindFragment$onViewCreated$3$1(this$0, it, null), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(ECGMeasureRemindFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        this$0.finish();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void refreshRemindTime(int index) {
        if (((ig6) getMBinding()).E.getChildCount() != this.mRemindData.getRemindTimes().size()) {
            return;
        }
        LinearLayoutCompat remindRepeatTimesView = ((ig6) getMBinding()).E;
        Intrinsics.checkNotNullExpressionValue(remindRepeatTimesView, "remindRepeatTimesView");
        View view = ViewGroupKt.get(remindRepeatTimesView, index);
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.xiaomi.fitness.widget.RightArrowSingleLineTextView");
        ((RightArrowSingleLineTextView) view).setRemindText(TimeUtils.parseMinutesToHHMM(this.mRemindData.getRemindTimes().get(index).intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void refreshViewIfNeed() {
        ((ig6) getMBinding()).B.setSwitch(this.mRemindData.isEnable());
        updateViewWithOpen();
        String customRepeatFormatString = getCustomRepeatFormatString(getRepeatDays(this.mRemindData.getRepeat()));
        ((ig6) getMBinding()).C.getSpinner().setSelection(this.mRemindData.getDayRemindCount() - 1);
        ((ig6) getMBinding()).D.setRemindText(customRepeatFormatString);
        if (!this.mRemindData.getRemindTimes().isEmpty()) {
            int size = this.mRemindData.getRemindTimes().size();
            for (int i = 0; i < size; i++) {
                ((ig6) getMBinding()).E.addView(initNewRemindPreference(i, this.mRemindData.getRemindTimes().get(i).intValue()));
            }
        }
        hideLoading();
    }

    private final void showRemindTimeDialogIfNeed(int index) {
        List<Integer> remindTimes = this.mRemindData.getRemindTimes();
        if (index < 0 || index >= remindTimes.size()) {
            return;
        }
        int iIntValue = remindTimes.get(index).intValue();
        HourMinutePickerDialog hourMinutePickerDialogCreate = new HourMinutePickerDialog.a("hm").setCustomLayoutId(eui.v1).setPositiveText(wzi.i8).setNegativeText(wzi.common_cancel).setCancelable(false).setDialogTitle(new DialogParams.DialogDescriptionString(wzi.y3, Integer.valueOf(index + 1))).create();
        Intrinsics.checkNotNullExpressionValue(hourMinutePickerDialogCreate, "create(...)");
        HourMinutePickerDialog hourMinutePickerDialog = hourMinutePickerDialogCreate;
        hourMinutePickerDialog.setRequestCode(index + 400);
        hourMinutePickerDialog.setValue(iIntValue / 60, iIntValue % 60);
        hourMinutePickerDialog.showIfNeed(getChildFragmentManager());
    }

    private final void showRepeatDialogIfNeed() {
        String[] stringArray = ResourceExtKt.getStringArray(ApplicationExtKt.getApplication(), lhi.l);
        int length = stringArray.length;
        boolean[] zArr = new boolean[length];
        int[] repeatDays = getRepeatDays(this.mRemindData.getRepeat());
        this.mMultiDialogHelpMap = new ArrayMap<>(stringArray.length);
        for (int i : repeatDays) {
            int i2 = i - 1;
            if (i2 >= 0 && i2 < length) {
                zArr[i2] = true;
            }
        }
        for (int i3 = 0; i3 < length; i3++) {
            ArrayMap<Integer, Boolean> arrayMap = this.mMultiDialogHelpMap;
            Intrinsics.checkNotNull(arrayMap, "null cannot be cast to non-null type androidx.collection.ArrayMap<kotlin.Int, kotlin.Boolean>");
            arrayMap.put(Integer.valueOf(i3), Boolean.valueOf(zArr[i3]));
        }
        final CommonDialog commonDialogCreate = new CommonDialog.c("repeat").setDialogTitle(wzi.z3).setNegativeText(wzi.common_cancel).setPositiveText(wzi.i8).setItems(stringArray).setItemsChoices(zArr).create();
        Intrinsics.checkNotNullExpressionValue(commonDialogCreate, "create(...)");
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.common.ecg.ECGMeasureRemindFragment.showRepeatDialogIfNeed.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                Intrinsics.checkNotNullParameter(dialog, "dialog");
                super.onDialogClick(dialogName, dialog, which);
                if (which == -1) {
                    ECGMeasureRemindFragment eCGMeasureRemindFragment = ECGMeasureRemindFragment.this;
                    ArrayMap arrayMap2 = eCGMeasureRemindFragment.mMultiDialogHelpMap;
                    Intrinsics.checkNotNull(arrayMap2);
                    int repeatCode = eCGMeasureRemindFragment.getRepeatCode(arrayMap2);
                    int[] repeatDays2 = ECGMeasureRemindFragment.this.getRepeatDays(repeatCode);
                    ECGMeasureRemindFragment.this.mRemindData.setRepeat(repeatCode);
                    ECGMeasureRemindFragment.access$getMBinding(ECGMeasureRemindFragment.this).D.setRemindText(ECGMeasureRemindFragment.this.getCustomRepeatFormatString(repeatDays2));
                }
            }

            @Override // defpackage.av6
            public void onDialogMultiClick(String dialogName, int which, boolean isChecked) {
                Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                super.onDialogMultiClick(dialogName, which, isChecked);
                if (which >= 0) {
                    ArrayMap arrayMap2 = ECGMeasureRemindFragment.this.mMultiDialogHelpMap;
                    Intrinsics.checkNotNull(arrayMap2);
                    if (which < arrayMap2.getSize()) {
                        Integer numValueOf = Integer.valueOf(which);
                        Boolean boolValueOf = Boolean.valueOf(isChecked);
                        ArrayMap arrayMap3 = ECGMeasureRemindFragment.this.mMultiDialogHelpMap;
                        Intrinsics.checkNotNull(arrayMap3);
                        arrayMap3.put(numValueOf, boolValueOf);
                    }
                }
                if (commonDialogCreate.getDialog() instanceof miuix.appcompat.app.c) {
                    Dialog dialog = commonDialogCreate.getDialog();
                    Intrinsics.checkNotNull(dialog, "null cannot be cast to non-null type miuix.appcompat.app.AlertDialog");
                    Button buttonM = ((miuix.appcompat.app.c) dialog).m(-1);
                    ECGMeasureRemindFragment eCGMeasureRemindFragment = ECGMeasureRemindFragment.this;
                    ArrayMap arrayMap4 = eCGMeasureRemindFragment.mMultiDialogHelpMap;
                    Intrinsics.checkNotNull(arrayMap4);
                    buttonM.setEnabled(eCGMeasureRemindFragment.getRepeatCode(arrayMap4) != 0);
                }
            }
        });
        commonDialogCreate.showIfNeed(getChildFragmentManager());
    }

    private final void updateRemindTimeResult(int requestCode, int minutes) {
        int i = requestCode - 400;
        int[] intArray = CollectionsKt___CollectionsKt.toIntArray(this.mRemindData.getRemindTimes());
        if (i < 0 || i >= intArray.length) {
            return;
        }
        int[] iArr = (int[]) intArray.clone();
        iArr[i] = minutes;
        this.mRemindData.setRemindTimes(ArraysKt___ArraysKt.toMutableList(iArr));
        refreshRemindTime(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateViewWithOpen() {
        LinearLayoutCompat remindEnableContent = ((ig6) getMBinding()).A;
        Intrinsics.checkNotNullExpressionValue(remindEnableContent, "remindEnableContent");
        ExtUtilsKt.setVisible(remindEnableContent, this.mRemindData.isEnable());
        ((ig6) getMBinding()).B.setSubtitle(this.mRemindData.isEnable() ? wzi.B3 : wzi.A3);
    }

    @NotNull
    public final String getCustomRepeatFormatString(@NotNull int[] days) {
        Intrinsics.checkNotNullParameter(days, "days");
        Objects.requireNonNull(days);
        int length = days.length;
        boolean zCheckIsSuccessive = checkIsSuccessive(days);
        String[] stringArray = getResources().getStringArray(lhi.l);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        if (length == 0) {
            return "";
        }
        if (length == 7) {
            String string = getResources().getString(wzi.x3);
            Intrinsics.checkNotNull(string);
            return string;
        }
        if (length == 1) {
            String string2 = getResources().getString(wzi.u3, stringArray[days[0] - 1]);
            Intrinsics.checkNotNull(string2);
            return string2;
        }
        if (length > 3 && zCheckIsSuccessive) {
            String string3 = getResources().getString(wzi.v3, stringArray[days[0] - 1], stringArray[days[days.length - 1] - 1]);
            Intrinsics.checkNotNull(string3);
            return string3;
        }
        StringBuilder sb = new StringBuilder(getResources().getString(wzi.u3));
        int i = 2;
        if (2 <= length) {
            while (true) {
                sb.append(",%");
                sb.append(i);
                sb.append("$");
                sb.append("s");
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        int length2 = days.length;
        String[] strArr = new String[length2];
        int length3 = days.length;
        for (int i2 = 0; i2 < length3; i2++) {
            strArr[i2] = stringArray[days[i2] - 1];
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string4 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
        Object[] objArrCopyOf = Arrays.copyOf(strArr, length2);
        String str = String.format(string4, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.Y;
    }

    @NotNull
    public final int[] getRepeatDays(int code) {
        ArrayList arrayList = new ArrayList();
        int i = 1;
        while (code != 0) {
            if ((code & 1) == 1) {
                arrayList.add(Integer.valueOf(i));
            }
            i++;
            code >>= 1;
        }
        return ArrayUtils.INSTANCE.toIntArray(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.view.BackPressHandler
    public boolean onBackPressed() {
        PageState.DefaultImpls.showLoading$default(this, null, 0, false, 5, null);
        DeviceSettingsPreference.INSTANCE.setDEVICE_SETTINGS_ECG_MEASURE_REMIND(new Gson().toJson(this.mRemindData));
        ((ECGMeasureRemindViewModel) getMViewModel()).updateRemindDataToDevice();
        return true;
    }

    @Override // defpackage.yaa
    public void onFragmentResult(int requestCode, int resultCode, @NotNull Bundle data) {
        Intrinsics.checkNotNullParameter(data, "data");
        dealRemindTimeResult(requestCode, resultCode, data);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingFragment, com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(wzi.t3);
        ((ig6) getMBinding()).B.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: i87
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                ECGMeasureRemindFragment.onViewCreated$lambda$0(this.f20879a, z, iSwitchButton);
            }
        });
        ((ig6) getMBinding()).D.setOnClickListener(new View.OnClickListener() { // from class: j87
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ECGMeasureRemindFragment.onViewCreated$lambda$1(this.f22517a, view2);
            }
        });
        initRepeatCountDialog();
        PageState.DefaultImpls.showLoading$default(this, null, 0, false, 5, null);
        ((ECGMeasureRemindViewModel) getMViewModel()).getRemindValue(new Function1() { // from class: k87
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ECGMeasureRemindFragment.onViewCreated$lambda$2(this.f23581a, (ECGMeasureRemindData) obj);
            }
        });
        ((ECGMeasureRemindViewModel) getMViewModel()).getSyncResult().observe(getViewLifecycleOwner(), new ECGMeasureRemindFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: l87
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ECGMeasureRemindFragment.onViewCreated$lambda$3(this.f24763a, (Boolean) obj);
            }
        }));
    }
}
