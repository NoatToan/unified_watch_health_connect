package com.xiaomi.fitness.health.sleep.rhythm.diary;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fit.fitness.export.data.project.SleepMedicationDetail;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.baseui.widget.NumberPickerView;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.sleep.rhythm.diary.SleepDiaryMedicationUpdateFragment;
import com.xiaomi.fitness.health.sleep.rhythm.view.PickSleepTimeDialog;
import defpackage.c0j;
import defpackage.eri;
import defpackage.ivb;
import defpackage.jui;
import defpackage.pni;
import defpackage.yaa;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\t\b\u0007\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\"B\u0007¢\u0006\u0004\b \u0010!J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\f*\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00110\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/diary/SleepDiaryMedicationUpdateFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/health/sleep/rhythm/diary/SleepDiaryUpdateViewModel;", "Livb;", "Lyaa;", "", "getYearRange", "()[J", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "bindView", "(Livb;)V", "", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "data", "onFragmentResult", "(IILandroid/os/Bundle;)V", "", "medicationSchedule", "Ljava/lang/Long;", "", "minuteRange", "Ljava/util/List;", "getDiaryTime", "()J", "diaryTime", "<init>", "()V", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SleepDiaryMedicationUpdateFragment extends Hilt_SleepDiaryMedicationUpdateFragment<SleepDiaryUpdateViewModel, ivb> implements yaa {

    @NotNull
    public static final String INTENT_REQUEST_ACTION_INDEX = "request_action";
    public static final int INTENT_REQUEST_CODE_ADD = 1000;
    public static final int INTENT_REQUEST_CODE_EDIT = 1001;

    @NotNull
    public static final String INTENT_REQUEST_DATA = "request_data";

    @NotNull
    public static final String INTENT_REQUEST_DATA_DIARY_TIME = "request_data_diary_time";

    @NotNull
    public static final String INTENT_REQUEST_DATA_SLEEP_TIME = "request_data_sleep_time";
    public static final int REQUEST_MEDICATION_TIME = 1002;

    @Nullable
    private Long medicationSchedule;

    @NotNull
    private final List<Integer> minuteRange;

    public SleepDiaryMedicationUpdateFragment() {
        super(jui.H3);
        this.minuteRange = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$1(SleepDiaryMedicationUpdateFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        long currentLastDaySleepOrMedicationTime = SleepDiaryHandle.INSTANCE.toCurrentLastDaySleepOrMedicationTime(this$0.medicationSchedule, this$0.getDiaryTime() * ((long) 1000));
        int i = Integer.parseInt(TimeUtils.formatDate("HH", Long.valueOf(currentLastDaySleepOrMedicationTime)));
        int i2 = Integer.parseInt(TimeUtils.formatDate("mm", Long.valueOf(currentLastDaySleepOrMedicationTime)));
        PickSleepTimeDialog pickSleepTimeDialogCreate = (PickSleepTimeDialog) this$0.getChildFragmentManager().l0("selectInDayGetUpTime");
        if (pickSleepTimeDialogCreate == null || !pickSleepTimeDialogCreate.isShowing()) {
            View viewInflate = this$0.getLayoutInflater().inflate(jui.L7, (ViewGroup) null);
            if (pickSleepTimeDialogCreate == null) {
                pickSleepTimeDialogCreate = new PickSleepTimeDialog.Builder("hm").setCustomView(viewInflate).setPositiveText(c0j.J7).setNegativeText(c0j.D7).setCancelable(false).setDialogTitle(new DialogParams.DialogDescriptionString(c0j.E, new Object[0])).create();
            }
            PickSleepTimeDialog pickSleepTimeDialog = pickSleepTimeDialogCreate;
            Intrinsics.checkNotNull(pickSleepTimeDialog);
            pickSleepTimeDialog.setRequestCode(1002);
            pickSleepTimeDialog.setRange(this$0.getYearRange(), currentLastDaySleepOrMedicationTime);
            pickSleepTimeDialog.setMinuteData(CollectionsKt___CollectionsKt.toIntArray(this$0.minuteRange));
            pickSleepTimeDialog.showIfNeed(this$0.getChildFragmentManager());
            Intrinsics.checkNotNull(viewInflate);
            View viewFindViewById = viewInflate.findViewById(eri.M3);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            NumberPickerView numberPickerView = (NumberPickerView) viewFindViewById;
            View viewFindViewById2 = viewInflate.findViewById(eri.N3);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            NumberPickerView numberPickerView2 = (NumberPickerView) viewFindViewById2;
            View viewFindViewById3 = viewInflate.findViewById(eri.Pk);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            pickSleepTimeDialog.setValue(numberPickerView, numberPickerView2, (TextView) viewFindViewById3, i, i2, currentLastDaySleepOrMedicationTime);
        }
    }

    private final long getDiaryTime() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getLong(INTENT_REQUEST_DATA_DIARY_TIME, 0L);
        }
        return 0L;
    }

    private final long[] getYearRange() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(1, -1);
        return new long[]{calendar.getTimeInMillis(), System.currentTimeMillis()};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onViewCreated$lambda$0(SleepDiaryMedicationUpdateFragment this$0, View view) {
        String str;
        CharSequence text;
        String str2;
        Long l;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        EditText medicationNameEt = ((ivb) this$0.getMBinding()).B;
        Intrinsics.checkNotNullExpressionValue(medicationNameEt, "medicationNameEt");
        if (!ViewExtKt.isTextNullOrEmpty(medicationNameEt)) {
            EditText medicationCountEt = ((ivb) this$0.getMBinding()).A;
            Intrinsics.checkNotNullExpressionValue(medicationCountEt, "medicationCountEt");
            if (!ViewExtKt.isTextNullOrEmpty(medicationCountEt) && (((l = this$0.medicationSchedule) == null || l.longValue() != 0) && this$0.medicationSchedule != null)) {
                if (Double.parseDouble(((ivb) this$0.getMBinding()).A.getText().toString()) == 0.0d) {
                    FragmentActivity mActivity = this$0.getMActivity();
                    if (mActivity != null) {
                        String string = this$0.getString(c0j.sj);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        ToastExtKt.toastShort(mActivity, string);
                        return;
                    }
                    return;
                }
                if (Double.parseDouble(((ivb) this$0.getMBinding()).A.getText().toString()) > 999.0d) {
                    FragmentActivity mActivity2 = this$0.getMActivity();
                    if (mActivity2 != null) {
                        String string2 = this$0.getString(c0j.tj);
                        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                        ToastExtKt.toastShort(mActivity2, string2);
                        return;
                    }
                    return;
                }
                Intent intent = new Intent();
                Bundle arguments = this$0.getArguments();
                Integer numValueOf = arguments != null ? Integer.valueOf(arguments.getInt(INTENT_REQUEST_ACTION_INDEX)) : null;
                String string3 = ((ivb) this$0.getMBinding()).B.getText().toString();
                Long l2 = this$0.medicationSchedule;
                Intrinsics.checkNotNull(l2);
                intent.putExtra(INTENT_REQUEST_DATA, new SleepMedicationDetail(string3, l2.longValue(), Integer.parseInt(((ivb) this$0.getMBinding()).A.getText().toString())));
                if (numValueOf == null || numValueOf.intValue() != -1) {
                    intent.putExtra(INTENT_REQUEST_ACTION_INDEX, numValueOf);
                }
                FragmentActivity mActivity3 = this$0.getMActivity();
                if (mActivity3 != null) {
                    mActivity3.setResult(-1, intent);
                }
                FragmentActivity mActivity4 = this$0.getMActivity();
                if (mActivity4 != null) {
                    mActivity4.finish();
                    return;
                }
                return;
            }
        }
        EditText medicationNameEt2 = ((ivb) this$0.getMBinding()).B;
        Intrinsics.checkNotNullExpressionValue(medicationNameEt2, "medicationNameEt");
        String str3 = "，";
        if (ViewExtKt.isTextNullOrEmpty(medicationNameEt2)) {
            String string4 = this$0.getString(c0j.O9);
            EditText medicationCountEt2 = ((ivb) this$0.getMBinding()).A;
            Intrinsics.checkNotNullExpressionValue(medicationCountEt2, "medicationCountEt");
            str = string4 + ((ViewExtKt.isTextNullOrEmpty(medicationCountEt2) || (text = ((ivb) this$0.getMBinding()).C.getMTvFeatureItemRemind().getText()) == null || text.length() == 0) ? "，" : "");
        } else {
            str = "";
        }
        EditText medicationCountEt3 = ((ivb) this$0.getMBinding()).A;
        Intrinsics.checkNotNullExpressionValue(medicationCountEt3, "medicationCountEt");
        if (ViewExtKt.isTextNullOrEmpty(medicationCountEt3)) {
            String string5 = this$0.getString(c0j.N9);
            Long l3 = this$0.medicationSchedule;
            if ((l3 == null || l3.longValue() != 0) && this$0.medicationSchedule != null) {
                str3 = "";
            }
            str2 = string5 + str3;
        } else {
            str2 = "";
        }
        Long l4 = this$0.medicationSchedule;
        String string6 = ((l4 != null && l4.longValue() == 0) || this$0.medicationSchedule == null) ? this$0.getString(c0j.P9) : "";
        Intrinsics.checkNotNull(string6);
        FragmentActivity mActivity5 = this$0.getMActivity();
        if (mActivity5 != null) {
            ToastExtKt.toastShort(mActivity5, str + str2 + string6 + this$0.getString(c0j.M9));
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull ivb ivbVar) {
        Intrinsics.checkNotNullParameter(ivbVar, "<this>");
        ivbVar.C.setOnClickListener(new View.OnClickListener() { // from class: qkm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepDiaryMedicationUpdateFragment.bindView$lambda$1(this.f31608a, view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.yaa
    public void onFragmentResult(int requestCode, int resultCode, @NotNull Bundle data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (resultCode == -1) {
            long j = data.getLong(PickSleepTimeDialog.KEY_SELECT_TIME, 0L);
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j != 0 ? j : System.currentTimeMillis());
            int i = data.getInt(PickSleepTimeDialog.KEY_SELECT_HOUR, -1);
            int i2 = data.getInt(PickSleepTimeDialog.KEY_SELECT_MINUTE, -1);
            calendar.set(11, i);
            calendar.set(12, i2);
            SleepDiaryHandle sleepDiaryHandle = SleepDiaryHandle.INSTANCE;
            long j2 = 1000;
            if (sleepDiaryHandle.isLimitSelectDay(j, getDiaryTime() * j2)) {
                String date = TimeUtils.formatDate("MM/dd", Long.valueOf(sleepDiaryHandle.getLastDayZeroTime(getDiaryTime() * j2)));
                String date2 = TimeUtils.formatDate("MM/dd", Long.valueOf(getDiaryTime() * j2));
                FragmentActivity mActivity = getMActivity();
                if (mActivity != null) {
                    String string = getString(c0j.bc, date, date2);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    ToastExtKt.toastShort(mActivity, string);
                    return;
                }
                return;
            }
            if (i == -1 || i2 == -1) {
                return;
            }
            Bundle arguments = getArguments();
            Long lValueOf = arguments != null ? Long.valueOf(arguments.getLong(INTENT_REQUEST_DATA_SLEEP_TIME)) : null;
            if (lValueOf == null || lValueOf.longValue() == 0 || calendar.getTimeInMillis() < lValueOf.longValue() * j2) {
                if (calendar.getTimeInMillis() == 0) {
                    return;
                }
                ((ivb) getMBinding()).C.setRemindText(TimeUtils.formatDate(TimeUtils.FORMAT_H_M, Long.valueOf(calendar.getTimeInMillis())));
                this.medicationSchedule = Long.valueOf(calendar.getTimeInMillis() / j2);
                return;
            }
            FragmentActivity mActivity2 = getMActivity();
            if (mActivity2 != null) {
                ToastExtKt.toastShort(mActivity2, c0j.R9);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(getString(c0j.E));
        setActionBarDisplayable(true);
        setActionBarExpandState(0);
        IActionBar.DefaultImpls.setEndView$default(this, 0, pni.O1, null, new View.OnClickListener() { // from class: rkm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SleepDiaryMedicationUpdateFragment.onViewCreated$lambda$0(this.f32643a, view2);
            }
        }, 5, null);
        for (int i = 0; i < 60; i++) {
            this.minuteRange.add(Integer.valueOf(i));
        }
        Bundle arguments = getArguments();
        if ((arguments != null ? arguments.getSerializable(INTENT_REQUEST_DATA) : null) != null) {
            Bundle arguments2 = getArguments();
            Serializable serializable = arguments2 != null ? arguments2.getSerializable(INTENT_REQUEST_DATA) : null;
            Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type com.xiaomi.fit.fitness.export.data.project.SleepMedicationDetail");
            SleepMedicationDetail sleepMedicationDetail = (SleepMedicationDetail) serializable;
            Logger.i("SLEEP DIARY", "SleepDiaryMedicationUpdateFragment init =  " + sleepMedicationDetail);
            ((ivb) getMBinding()).B.setText(sleepMedicationDetail.getMedicationName());
            ((ivb) getMBinding()).A.setText(String.valueOf(sleepMedicationDetail.getMedicationCount()));
            this.medicationSchedule = Long.valueOf(sleepMedicationDetail.getMedicationSchedule());
            ((ivb) getMBinding()).C.setRemindText(TimeUtils.formatDate(TimeUtils.FORMAT_H_M, Long.valueOf(sleepMedicationDetail.getMedicationSchedule() * ((long) 1000))));
        }
    }
}
