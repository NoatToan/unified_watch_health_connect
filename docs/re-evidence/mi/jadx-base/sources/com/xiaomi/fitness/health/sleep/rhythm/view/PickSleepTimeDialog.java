package com.xiaomi.fitness.health.sleep.rhythm.view;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.miui.tsmclient.entity.UIConfig;
import com.miui.tsmclient.util.StringUtils;
import com.xiaomi.fit.fitness.parser.schema.FitnessRecordKey;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.dialog.a;
import com.xiaomi.fitness.baseui.widget.NumberPickerView;
import com.xiaomi.fitness.baseui.widget.SpinnerDatePicker;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.calendar.CalendarActivity;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.health.sleep.rhythm.diary.SleepDiaryHandle;
import com.xiaomi.fitness.health.sleep.rhythm.view.PickSleepTimeDialog;
import com.xiaomi.fitness.util.ExtUtilKt;
import defpackage.c0j;
import defpackage.clb;
import defpackage.eri;
import defpackage.qxi;
import defpackage.yo2;
import java.io.Serializable;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 ^2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002]^B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0018\u0010%\u001a\u00020 2\b\u0010&\u001a\u0004\u0018\u00010\u000f2\u0006\u0010'\u001a\u00020\u0011J\u0010\u0010.\u001a\u00020 2\u0006\u0010/\u001a\u00020$H\u0016J\u0010\u00100\u001a\u00020 2\u0006\u00101\u001a\u00020\u0019H\u0014J\u0010\u00102\u001a\u00020 2\u0006\u00103\u001a\u00020\"H\u0014J\b\u00104\u001a\u00020 H\u0002J\u0010\u0010:\u001a\u00020 2\b\u0010;\u001a\u0004\u0018\u00010\u001dJ\u0010\u0010<\u001a\u00020 2\b\u0010=\u001a\u0004\u0018\u00010\u001dJ\b\u0010C\u001a\u00020 H\u0002J\u0010\u0010D\u001a\u00020 2\u0006\u0010E\u001a\u00020FH\u0016J\u0018\u0010G\u001a\u00020 2\u0006\u0010H\u001a\u00020\u00192\u0006\u0010I\u001a\u00020\u0019H\u0002J\u0018\u0010J\u001a\u00020 2\u0006\u0010H\u001a\u00020\u00192\u0006\u0010I\u001a\u00020\u0019H\u0002J\u0010\u0010K\u001a\u00020 2\u0006\u0010L\u001a\u00020\u0016H\u0002J\u000e\u0010M\u001a\u00020 2\u0006\u0010N\u001a\u00020\u0013J\"\u0010O\u001a\u00020 2\u0006\u0010P\u001a\u00020\u00192\u0006\u0010Q\u001a\u00020\u00192\b\u0010R\u001a\u0004\u0018\u00010SH\u0016J\b\u0010T\u001a\u00020 H\u0016J\u000e\u0010U\u001a\u00020 2\u0006\u0010V\u001a\u00020\u0019J\u000e\u0010W\u001a\u00020 2\u0006\u0010X\u001a\u00020\u0011J6\u0010Y\u001a\u00020 2\u0006\u0010Z\u001a\u00020\u00162\u0006\u0010[\u001a\u00020\u00162\u0006\u0010\\\u001a\u00020\f2\u0006\u0010H\u001a\u00020\u00192\u0006\u0010I\u001a\u00020\u00192\u0006\u0010X\u001a\u00020\u0011R\u0018\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010(\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u001c\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u000107068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0011\u0010>\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0011\u0010A\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bB\u0010@¨\u0006_"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/view/PickSleepTimeDialog;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "<init>", "()V", "mCalendar", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "Ljava/util/Calendar;", "mPicker", "Lcom/xiaomi/fitness/baseui/widget/SpinnerDatePicker;", "mTitle", "Landroid/widget/TextView;", "mDescription", "mDateRange", "", "mDefaultTime", "", "mAttached", "", "mIsShowBirthDesc", "mHourPickerView", "Lcom/xiaomi/fitness/baseui/widget/NumberPickerView;", "mMinutePickerView", "mDeferredHourPickValue", "", "mDeferredMinutesPickValue", "mInitOver", "mHourRange", "", "mMinuteData", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setRange", "time", "defaultTime", "selectTime", "getSelectTime", "()J", "dateRange", "getDateRange", "()[J", "onSaveInstanceState", "outState", "onDialogDismiss", "cause", "initCustomView", "rootView", "showCalendar", "minutesData", "", "", "getMinutesData", "()[Ljava/lang/String;", "setHourRange", "hourRange", "setMinuteData", "minuteData", "minuteValue", "getMinuteValue", "()I", "hourValue", "getHourValue", "updateDescIfNeed", "onAttach", "context", "Landroid/content/Context;", FitnessRecordKey.updateValue, "hour", "minute", "updateFocusContentDescription", "updatePickerOnValueChange", "picker", "setShowBirthDesc", "showBirthDesc", "onActivityResult", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "data", "Landroid/content/Intent;", LifecycleConstantKt.ON_RESUME, "setDialogTitle", "resId", "updateTime", UIConfig.KEY_CURRENT_TIME, "setValue", "hourView", "minutesView", "descriptionTV", "Builder", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPickSleepTimeDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PickSleepTimeDialog.kt\ncom/xiaomi/fitness/health/sleep/rhythm/view/PickSleepTimeDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,424:1\n1#2:425\n*E\n"})
public final class PickSleepTimeDialog extends CommonDialog<DialogParams> {

    @NotNull
    private static final String KEY_MAX_TIME = "max_time";

    @NotNull
    private static final String KEY_MIN_TIME = "min_time";

    @NotNull
    public static final String KEY_SELECT_HOUR = "key_select_hour";

    @NotNull
    public static final String KEY_SELECT_MINUTE = "key_select_minute";

    @NotNull
    public static final String KEY_SELECT_TIME = "select_time";
    private boolean mAttached;

    @Nullable
    private long[] mDateRange;
    private long mDefaultTime;

    @Nullable
    private TextView mDescription;

    @Nullable
    private NumberPickerView mHourPickerView;

    @Nullable
    private int[] mHourRange;
    private boolean mInitOver;
    private boolean mIsShowBirthDesc;

    @Nullable
    private int[] mMinuteData;

    @Nullable
    private NumberPickerView mMinutePickerView;

    @Nullable
    private SpinnerDatePicker mPicker;

    @Nullable
    private TextView mTitle;

    @NotNull
    private static final int[] VALID_HOUR_RANGE = {0, 23};

    @NotNull
    private static final int[] VALID_MINUTE_DATA = {0, 10, 20, 30, 40, 50};
    private final Calendar mCalendar = Calendar.getInstance();
    private int mDeferredHourPickValue = -1;
    private int mDeferredMinutesPickValue = -1;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0011\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nB\u0013\b\u0016\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\t\u0010\rJ\u000f\u0010\u0004\u001a\u00020\u0000H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/view/PickSleepTimeDialog$Builder;", "Lcom/xiaomi/fitness/baseui/dialog/a;", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "Lcom/xiaomi/fitness/health/sleep/rhythm/view/PickSleepTimeDialog;", "getThis", "()Lcom/xiaomi/fitness/health/sleep/rhythm/view/PickSleepTimeDialog$Builder;", "internalCreate", "()Lcom/xiaomi/fitness/health/sleep/rhythm/view/PickSleepTimeDialog;", "dialogParams", "<init>", "(Lcom/xiaomi/fitness/baseui/dialog/DialogParams;)V", "", "name", "(Ljava/lang/String;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class Builder extends a<Builder, DialogParams, PickSleepTimeDialog> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull DialogParams dialogParams) {
            super(dialogParams);
            Intrinsics.checkNotNullParameter(dialogParams, "dialogParams");
        }

        @Override // com.xiaomi.fitness.baseui.dialog.a
        @NotNull
        public Builder getThis() {
            return this;
        }

        public Builder(@Nullable String str) {
            this(new DialogParams(str));
        }

        @Override // com.xiaomi.fitness.baseui.dialog.a
        @NotNull
        public PickSleepTimeDialog internalCreate() {
            return new PickSleepTimeDialog();
        }
    }

    private final long[] getDateRange() {
        long[] jArr = this.mDateRange;
        if (jArr != null) {
            Intrinsics.checkNotNull(jArr);
            if (jArr.length == 2) {
                long[] jArr2 = this.mDateRange;
                Intrinsics.checkNotNull(jArr2);
                return jArr2;
            }
        }
        Calendar calendar = Calendar.getInstance();
        calendar.add(1, -1);
        calendar.set(2, 0);
        calendar.set(5, 1);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.add(1, 2);
        calendar.set(2, 11);
        calendar.set(5, 31);
        return new long[]{timeInMillis, calendar.getTimeInMillis()};
    }

    private final String[] getMinutesData() {
        int[] iArr = this.mMinuteData;
        Intrinsics.checkNotNull(iArr);
        int length = iArr.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = String.valueOf(iArr[i]);
        }
        return strArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initCustomView$lambda$2(PickSleepTimeDialog this$0, NumberPickerView numberPickerView, NumberPickerView numberPickerView2, NumberPickerView numberPickerView3, SpinnerDatePicker spinnerDatePicker, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.isRemoving() || this$0.isDetached()) {
            return;
        }
        this$0.mCalendar.set(i, i2, i3);
        numberPickerView.setContentDescription(ApplicationExtKt.getApplication().getString(c0j.Zq, Integer.valueOf(i)));
        numberPickerView2.setContentDescription(ApplicationExtKt.getApplication().getString(c0j.Yq, Integer.valueOf(i2)));
        numberPickerView3.setContentDescription(ApplicationExtKt.getApplication().getString(c0j.Xq, Integer.valueOf(i3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initCustomView$lambda$3(PickSleepTimeDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showCalendar();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setValue$lambda$4(PickSleepTimeDialog this$0, NumberPickerView numberPickerView, int i, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(numberPickerView);
        this$0.updatePickerOnValueChange(numberPickerView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setValue$lambda$5(PickSleepTimeDialog this$0, NumberPickerView numberPickerView, int i, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        clb.a(this$0.getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setValue$lambda$6(PickSleepTimeDialog this$0, NumberPickerView numberPickerView, int i, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        clb.a(this$0.getContext());
    }

    private final void showCalendar() {
        Bundle bundle = new Bundle();
        bundle.putInt("position", 2);
        bundle.putSerializable("local_date", TimeDateUtil.timestampToLocalDateInner(this.mCalendar.getTimeInMillis()));
        bundle.putBoolean("from_activity", true);
        bundle.putBoolean("switch_day_week_month", false);
        bundle.putBoolean("only_day", true);
        bundle.putBoolean("calendar_show_future", true);
        bundle.putString("show_switch_title", " ");
        Intent intent = new Intent(ApplicationExtKt.getApplication(), (Class<?>) CalendarActivity.class);
        intent.putExtras(bundle);
        startActivityForResult(intent, 54321);
    }

    private final void updateDescIfNeed() {
        if (!this.mIsShowBirthDesc || getContext() == null) {
            return;
        }
        String string = getString(c0j.Wq);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        yo2 yo2Var = new yo2(getSelectTime());
        String str = TimeUtils.formatDate(string, Long.valueOf(yo2Var.b())) + ApplicationExtKt.getApplication().getResources().getQuantityString(qxi.W1, yo2Var.a(), Integer.valueOf(yo2Var.a()));
        TextView textView = this.mDescription;
        Intrinsics.checkNotNull(textView);
        textView.setText(str);
    }

    private final void updateFocusContentDescription(int hour, int minute) {
        if (getContext() == null) {
            return;
        }
        String quantityString = getResources().getQuantityString(qxi.O1, hour, Integer.valueOf(hour));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        String quantityString2 = getResources().getQuantityString(qxi.Q1, minute, Integer.valueOf(minute));
        Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
        NumberPickerView numberPickerView = this.mHourPickerView;
        Intrinsics.checkNotNull(numberPickerView);
        numberPickerView.setContentDescription(getString(c0j.Ul, quantityString));
        NumberPickerView numberPickerView2 = this.mMinutePickerView;
        Intrinsics.checkNotNull(numberPickerView2);
        numberPickerView2.setContentDescription(getString(c0j.Ul, quantityString2));
    }

    private final void updatePickerOnValueChange(NumberPickerView picker) {
        if (getContext() == null) {
            return;
        }
        String quantityString = getResources().getQuantityString(qxi.O1, getHourValue(), Integer.valueOf(getHourValue()));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        String quantityString2 = getResources().getQuantityString(qxi.Q1, getMinuteValue(), Integer.valueOf(getMinuteValue()));
        Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
        picker.setContentDescription(getString(c0j.Ul, quantityString + quantityString2));
    }

    private final void updateValue(int hour, int minute) {
        NumberPickerView numberPickerView = this.mHourPickerView;
        Intrinsics.checkNotNull(numberPickerView);
        numberPickerView.setValue(hour);
        int[] iArr = this.mMinuteData;
        Intrinsics.checkNotNull(iArr);
        NumberPickerView numberPickerView2 = this.mMinutePickerView;
        Intrinsics.checkNotNull(numberPickerView2);
        if (iArr[numberPickerView2.getMaxValue()] >= minute) {
            int i = 0;
            for (int i2 : iArr) {
                if (i2 == minute) {
                    NumberPickerView numberPickerView3 = this.mMinutePickerView;
                    Intrinsics.checkNotNull(numberPickerView3);
                    numberPickerView3.setValue(i);
                    break;
                }
                i++;
            }
        } else {
            NumberPickerView numberPickerView4 = this.mMinutePickerView;
            Intrinsics.checkNotNull(numberPickerView4);
            NumberPickerView numberPickerView5 = this.mMinutePickerView;
            Intrinsics.checkNotNull(numberPickerView5);
            numberPickerView4.setValue(numberPickerView5.getMaxValue());
        }
        updateFocusContentDescription(hour, minute);
    }

    public final int getHourValue() {
        NumberPickerView numberPickerView = this.mHourPickerView;
        if (numberPickerView == null) {
            return -1;
        }
        Intrinsics.checkNotNull(numberPickerView);
        return numberPickerView.getValue();
    }

    public final int getMinuteValue() {
        NumberPickerView numberPickerView = this.mMinutePickerView;
        if (numberPickerView == null) {
            return this.mDeferredMinutesPickValue;
        }
        Intrinsics.checkNotNull(numberPickerView);
        int pickedIndexRelativeToRaw = numberPickerView.getPickedIndexRelativeToRaw();
        int[] iArr = this.mMinuteData;
        Intrinsics.checkNotNull(iArr);
        return pickedIndexRelativeToRaw < iArr.length ? iArr[pickedIndexRelativeToRaw] : this.mDeferredMinutesPickValue;
    }

    public final long getSelectTime() {
        return this.mCalendar.getTimeInMillis();
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public void initCustomView(@NotNull View rootView) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        super.initCustomView(rootView);
        this.mTitle = (TextView) rootView.findViewById(eri.Qk);
        this.mPicker = (SpinnerDatePicker) rootView.findViewById(eri.W2);
        long[] dateRange = getDateRange();
        SpinnerDatePicker spinnerDatePicker = this.mPicker;
        Intrinsics.checkNotNull(spinnerDatePicker);
        spinnerDatePicker.b(dateRange[0], dateRange[1]);
        int i = this.mCalendar.get(1);
        int i2 = this.mCalendar.get(2);
        int i3 = this.mCalendar.get(5);
        SpinnerDatePicker spinnerDatePicker2 = this.mPicker;
        Intrinsics.checkNotNull(spinnerDatePicker2);
        spinnerDatePicker2.c(i, i2, i3);
        SpinnerDatePicker spinnerDatePicker3 = this.mPicker;
        Intrinsics.checkNotNull(spinnerDatePicker3);
        final NumberPickerView numberPickerView = (NumberPickerView) spinnerDatePicker3.findViewById(eri.Ep);
        SpinnerDatePicker spinnerDatePicker4 = this.mPicker;
        Intrinsics.checkNotNull(spinnerDatePicker4);
        final NumberPickerView numberPickerView2 = (NumberPickerView) spinnerDatePicker4.findViewById(eri.Nb);
        SpinnerDatePicker spinnerDatePicker5 = this.mPicker;
        Intrinsics.checkNotNull(spinnerDatePicker5);
        final NumberPickerView numberPickerView3 = (NumberPickerView) spinnerDatePicker5.findViewById(eri.X2);
        numberPickerView.setContentDescription(getString(c0j.Zq, Integer.valueOf(i)));
        numberPickerView2.setContentDescription(getString(c0j.Yq, Integer.valueOf(i2)));
        numberPickerView3.setContentDescription(getString(c0j.Xq, Integer.valueOf(i3)));
        if (LocaleUtil.isCN()) {
            numberPickerView.setHintText(getString(c0j.cr));
            numberPickerView2.setHintText(getString(c0j.jq));
            numberPickerView3.setHintText(getString(c0j.q));
        }
        SpinnerDatePicker spinnerDatePicker6 = this.mPicker;
        Intrinsics.checkNotNull(spinnerDatePicker6);
        spinnerDatePicker6.setOnDateChangedListener(new SpinnerDatePicker.d() { // from class: xvh
            @Override // com.xiaomi.fitness.baseui.widget.SpinnerDatePicker.d
            public final void a(SpinnerDatePicker spinnerDatePicker7, int i4, int i5, int i6) {
                PickSleepTimeDialog.initCustomView$lambda$2(this.f39511a, numberPickerView, numberPickerView2, numberPickerView3, spinnerDatePicker7, i4, i5, i6);
            }
        });
        TextView textView = this.mDescription;
        Intrinsics.checkNotNull(textView);
        textView.setOnClickListener(new View.OnClickListener() { // from class: yvh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PickSleepTimeDialog.initCustomView$lambda$3(this.f40613a, view);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Serializable serializableExtra = data != null ? data.getSerializableExtra("calendar_date") : null;
        LocalDate localDate = serializableExtra instanceof LocalDate ? (LocalDate) serializableExtra : null;
        if (localDate != null) {
            this.mCalendar.setTimeInMillis(ExtUtilKt.getMills(localDate));
            TextView textView = this.mDescription;
            Intrinsics.checkNotNull(textView);
            textView.setText(TimeDateUtil.getDateFormated(ExtUtilKt.getMills(localDate), StringUtils.EXPECT_DATE_FORMAT));
        }
        Logger.d(SleepDiaryHandle.TAG, "showCalendar: " + resultCode + ", " + (data != null ? data.getSerializableExtra("calendar_date") : null));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        this.mAttached = true;
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public void onDialogDismiss(int cause) {
        super.onDialogDismiss(cause);
        if (cause == -1) {
            Bundle bundle = new Bundle();
            bundle.putLong(KEY_SELECT_TIME, getSelectTime());
            bundle.putInt(KEY_SELECT_HOUR, getHourValue());
            bundle.putInt(KEY_SELECT_MINUTE, getMinuteValue());
            setResultData(-1, bundle);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putLong(KEY_SELECT_TIME, getSelectTime());
        outState.putLong(KEY_MIN_TIME, getDateRange()[0]);
        outState.putLong(KEY_MAX_TIME, getDateRange()[1]);
        NumberPickerView numberPickerView = this.mHourPickerView;
        if (numberPickerView == null || this.mMinutePickerView == null) {
            return;
        }
        Intrinsics.checkNotNull(numberPickerView);
        outState.putInt(KEY_SELECT_HOUR, numberPickerView.getValue());
        NumberPickerView numberPickerView2 = this.mMinutePickerView;
        Intrinsics.checkNotNull(numberPickerView2);
        outState.putInt(KEY_SELECT_MINUTE, numberPickerView2.getValue());
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (savedInstanceState != null) {
            long[] jArr = {savedInstanceState.getLong(KEY_MIN_TIME), 0};
            this.mDateRange = jArr;
            Intrinsics.checkNotNull(jArr);
            long[] jArr2 = this.mDateRange;
            Intrinsics.checkNotNull(jArr2);
            jArr2[1] = savedInstanceState.getLong(KEY_MAX_TIME);
            SpinnerDatePicker spinnerDatePicker = this.mPicker;
            Intrinsics.checkNotNull(spinnerDatePicker);
            long[] jArr3 = this.mDateRange;
            Intrinsics.checkNotNull(jArr3);
            long j = jArr3[0];
            long[] jArr4 = this.mDateRange;
            Intrinsics.checkNotNull(jArr4);
            spinnerDatePicker.b(j, jArr4[1]);
            this.mCalendar.setTimeInMillis(savedInstanceState.getLong(KEY_SELECT_TIME));
            SpinnerDatePicker spinnerDatePicker2 = this.mPicker;
            Intrinsics.checkNotNull(spinnerDatePicker2);
            spinnerDatePicker2.c(this.mCalendar.get(1), this.mCalendar.get(2), this.mCalendar.get(5));
        }
    }

    public final void setDialogTitle(int resId) {
        TextView textView;
        if (!this.mAttached || (textView = this.mTitle) == null || resId == 0) {
            return;
        }
        Intrinsics.checkNotNull(textView);
        textView.setText(resId);
    }

    public final void setHourRange(@Nullable int[] hourRange) {
        this.mHourRange = hourRange;
    }

    public final void setMinuteData(@Nullable int[] minuteData) {
        this.mMinuteData = minuteData;
    }

    public final void setRange(@Nullable long[] time, long defaultTime) {
        if (time == null) {
            throw new IllegalArgumentException("range time is null".toString());
        }
        if (time.length < 2) {
            throw new IllegalArgumentException(("the length of range time is " + time.length).toString());
        }
        this.mDateRange = time;
        this.mDefaultTime = defaultTime;
        Intrinsics.checkNotNull(time);
        if (defaultTime > time[1]) {
            long[] jArr = this.mDateRange;
            Intrinsics.checkNotNull(jArr);
            this.mDefaultTime = jArr[1];
            return;
        }
        long j = this.mDefaultTime;
        long[] jArr2 = this.mDateRange;
        Intrinsics.checkNotNull(jArr2);
        if (j < jArr2[0]) {
            long[] jArr3 = this.mDateRange;
            Intrinsics.checkNotNull(jArr3);
            this.mDefaultTime = jArr3[0];
        }
    }

    public final void setShowBirthDesc(boolean showBirthDesc) {
        this.mIsShowBirthDesc = showBirthDesc;
    }

    public final void setValue(@NotNull NumberPickerView hourView, @NotNull NumberPickerView minutesView, @NotNull TextView descriptionTV, int hour, int minute, long currentTime) {
        Intrinsics.checkNotNullParameter(hourView, "hourView");
        Intrinsics.checkNotNullParameter(minutesView, "minutesView");
        Intrinsics.checkNotNullParameter(descriptionTV, "descriptionTV");
        Logger.i(SleepDiaryHandle.TAG, "setValue hour:" + hour + " minute:" + minute);
        this.mHourPickerView = hourView;
        this.mMinutePickerView = minutesView;
        this.mDescription = descriptionTV;
        int[] iArr = this.mHourRange;
        if (iArr == null) {
            iArr = VALID_HOUR_RANGE;
        }
        this.mHourRange = iArr;
        int[] iArr2 = this.mMinuteData;
        if (iArr2 == null) {
            iArr2 = VALID_MINUTE_DATA;
        }
        this.mMinuteData = iArr2;
        Intrinsics.checkNotNull(hourView);
        int[] iArr3 = this.mHourRange;
        Intrinsics.checkNotNull(iArr3);
        hourView.setMinValue(iArr3[0]);
        NumberPickerView numberPickerView = this.mHourPickerView;
        Intrinsics.checkNotNull(numberPickerView);
        int[] iArr4 = this.mHourRange;
        Intrinsics.checkNotNull(iArr4);
        int[] iArr5 = this.mHourRange;
        Intrinsics.checkNotNull(iArr5);
        numberPickerView.setMaxValue(iArr4[iArr5.length - 1]);
        NumberPickerView numberPickerView2 = this.mMinutePickerView;
        Intrinsics.checkNotNull(numberPickerView2);
        numberPickerView2.setDisplayedValues(getMinutesData());
        NumberPickerView numberPickerView3 = this.mMinutePickerView;
        Intrinsics.checkNotNull(numberPickerView3);
        numberPickerView3.setMinValue(0);
        NumberPickerView numberPickerView4 = this.mMinutePickerView;
        Intrinsics.checkNotNull(numberPickerView4);
        numberPickerView4.setMaxValue(getMinutesData().length - 1);
        NumberPickerView.d dVar = new NumberPickerView.d() { // from class: uvh
            @Override // com.xiaomi.fitness.baseui.widget.NumberPickerView.d
            public final void onValueChange(NumberPickerView numberPickerView5, int i, int i2) {
                PickSleepTimeDialog.setValue$lambda$4(this.f36189a, numberPickerView5, i, i2);
            }
        };
        NumberPickerView numberPickerView5 = this.mHourPickerView;
        Intrinsics.checkNotNull(numberPickerView5);
        numberPickerView5.setOnValueChangedListener(dVar);
        NumberPickerView numberPickerView6 = this.mMinutePickerView;
        Intrinsics.checkNotNull(numberPickerView6);
        numberPickerView6.setOnValueChangedListener(dVar);
        this.mInitOver = true;
        NumberPickerView numberPickerView7 = this.mHourPickerView;
        Intrinsics.checkNotNull(numberPickerView7);
        numberPickerView7.setOnValueChangeListenerInScrolling(new NumberPickerView.e() { // from class: vvh
            @Override // com.xiaomi.fitness.baseui.widget.NumberPickerView.e
            public final void a(NumberPickerView numberPickerView8, int i, int i2) {
                PickSleepTimeDialog.setValue$lambda$5(this.f37273a, numberPickerView8, i, i2);
            }
        });
        NumberPickerView numberPickerView8 = this.mMinutePickerView;
        Intrinsics.checkNotNull(numberPickerView8);
        numberPickerView8.setOnValueChangeListenerInScrolling(new NumberPickerView.e() { // from class: wvh
            @Override // com.xiaomi.fitness.baseui.widget.NumberPickerView.e
            public final void a(NumberPickerView numberPickerView9, int i, int i2) {
                PickSleepTimeDialog.setValue$lambda$6(this.f38406a, numberPickerView9, i, i2);
            }
        });
        int[] iArr6 = this.mHourRange;
        if (iArr6 == null) {
            iArr6 = VALID_HOUR_RANGE;
        }
        this.mHourRange = iArr6;
        Intrinsics.checkNotNull(iArr6);
        if (hour < iArr6[0]) {
            int[] iArr7 = this.mHourRange;
            Intrinsics.checkNotNull(iArr7);
            hour = iArr7[0];
        }
        int[] iArr8 = this.mHourRange;
        Intrinsics.checkNotNull(iArr8);
        int[] iArr9 = this.mHourRange;
        Intrinsics.checkNotNull(iArr9);
        int iMin = Math.min(hour, iArr8[iArr9.length - 1]);
        int[] iArr10 = VALID_MINUTE_DATA;
        int i = iArr10[0];
        if (minute < i) {
            minute = i;
        }
        int i2 = iArr10[iArr10.length - 1];
        if (minute > i2) {
            minute = i2;
        }
        Logger.i(SleepDiaryHandle.TAG, "updateValue hour:" + iMin + " minute:" + minute);
        TextView textView = this.mDescription;
        Intrinsics.checkNotNull(textView);
        textView.setText(TimeDateUtil.getDateFormated(currentTime, StringUtils.EXPECT_DATE_FORMAT));
        this.mCalendar.setTimeInMillis(currentTime);
        updateValue(iMin, minute);
    }

    public final void updateTime(long currentTime) {
        TextView textView = this.mDescription;
        if (textView != null) {
            Intrinsics.checkNotNull(textView);
            textView.setText(TimeDateUtil.getDateFormated(currentTime, StringUtils.EXPECT_DATE_FORMAT));
        }
        this.mCalendar.setTimeInMillis(currentTime);
        this.mDefaultTime = currentTime;
    }
}
