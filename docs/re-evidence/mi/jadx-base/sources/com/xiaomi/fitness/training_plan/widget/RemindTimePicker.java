package com.xiaomi.fitness.training_plan.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import com.google.android.material.timepicker.TimeModel;
import com.xiaomi.fitness.baseui.widget.NumberPickerView;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.training_plan.widget.RemindTimePicker;
import defpackage.csi;
import defpackage.jvi;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Formatter;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import miuix.pickerwidget.widget.NumberPicker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 ?2\u00020\u0001:\u0003=>?B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0010H\u0016J\b\u0010\u0019\u001a\u00020\u0010H\u0016J\u0010\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001cH\u0014J\u0010\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u0016H\u0002J\u0010\u0010\u001f\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u0012J\b\u0010.\u001a\u00020\u0007H\u0016J\u0010\u0010/\u001a\u00020\u00102\u0006\u00100\u001a\u000201H\u0016J\u0010\u00102\u001a\u00020\u000b2\u0006\u00100\u001a\u000201H\u0016J\u0010\u00103\u001a\u00020\u000b2\u0006\u00100\u001a\u000201H\u0016J\u0010\u00104\u001a\u00020\u000b2\u0006\u00105\u001a\u000206H\u0016J\u0016\u00107\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u0007J\b\u00108\u001a\u00020\u000bH\u0002J\b\u00109\u001a\u00020\u000bH\u0002J\u001a\u0010:\u001a\u00020\u000b2\b\b\u0001\u0010;\u001a\u00020\u00072\b\b\u0001\u0010<\u001a\u00020\u0007R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R,\u0010\"\u001a\u0004\u0018\u00010\u00072\b\u0010!\u001a\u0004\u0018\u00010\u00078F@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010'\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R&\u0010)\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u0006@"}, d2 = {"Lcom/xiaomi/fitness/training_plan/widget/RemindTimePicker;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "callOnTimeChanged", "", "mHourSpinner", "Lcom/xiaomi/fitness/baseui/widget/NumberPickerView;", "mMinuteSpinner", "mIsEnabled", "", "mOnTimeChangedListener", "Lcom/xiaomi/fitness/training_plan/widget/RemindTimePicker$OnTimeChangedListener;", "mTempCalendar", "Ljava/util/Calendar;", "mCurrentLocale", "Ljava/util/Locale;", "setEnabled", "enabled", "isEnabled", "onConfigurationChanged", StandardComponentEvent.KEY_NEW_CONFIG, "Landroid/content/res/Configuration;", "setCurrentLocale", "locale", "setOnTimeChangedListener", "onTimeChangedListener", "hour", "currentHour", "getCurrentHour", "()Ljava/lang/Integer;", "setCurrentHour", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "minute", "currentMinute", "getCurrentMinute", "()I", "setCurrentMinute", "(I)V", "getBaseline", "dispatchPopulateAccessibilityEvent", "event", "Landroid/view/accessibility/AccessibilityEvent;", "onPopulateAccessibilityEvent", "onInitializeAccessibilityEvent", "onInitializeAccessibilityNodeInfo", "info", "Landroid/view/accessibility/AccessibilityNodeInfo;", "setMaxTime", "updateHourControl", "onTimeChanged", "setLabel", "hourLabel", "minuteLabel", "OnMinuteChangeListener", "OnTimeChangedListener", "Companion", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RemindTimePicker extends FrameLayout {
    private static final boolean DEFAULT_ENABLED_STATE = true;
    private static final int HOURS_IN_HALF_DAY = 12;

    @Nullable
    private Integer currentHour;
    private int currentMinute;

    @Nullable
    private Locale mCurrentLocale;

    @NotNull
    private final NumberPickerView mHourSpinner;
    private boolean mIsEnabled;

    @NotNull
    private final NumberPickerView mMinuteSpinner;

    @Nullable
    private OnTimeChangedListener mOnTimeChangedListener;

    @Nullable
    private Calendar mTempCalendar;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final NumberPicker.d TWO_DIGIT_FORMATTER = new NumberPicker.d() { // from class: com.xiaomi.fitness.training_plan.widget.RemindTimePicker$Companion$TWO_DIGIT_FORMATTER$1
        private final Object[] mArgs;
        private final StringBuilder mBuilder;
        private final Formatter mFmt;

        {
            StringBuilder sb = new StringBuilder();
            this.mBuilder = sb;
            this.mFmt = new Formatter(sb, Locale.US);
            this.mArgs = new Object[1];
        }

        @Override // miuix.pickerwidget.widget.NumberPicker.d
        public String format(int value) {
            this.mArgs[0] = Integer.valueOf(value);
            StringBuilder sb = this.mBuilder;
            sb.delete(0, sb.length());
            Formatter formatter = this.mFmt;
            Object[] objArr = this.mArgs;
            formatter.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(objArr, objArr.length));
            String string = this.mFmt.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }

        public final Object[] getMArgs() {
            return this.mArgs;
        }

        public final StringBuilder getMBuilder() {
            return this.mBuilder;
        }

        public final Formatter getMFmt() {
            return this.mFmt;
        }
    };

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/training_plan/widget/RemindTimePicker$Companion;", "", "Lmiuix/pickerwidget/widget/NumberPicker$d;", "TWO_DIGIT_FORMATTER", "Lmiuix/pickerwidget/widget/NumberPicker$d;", "getTWO_DIGIT_FORMATTER", "()Lmiuix/pickerwidget/widget/NumberPicker$d;", "", "DEFAULT_ENABLED_STATE", "Z", "", "HOURS_IN_HALF_DAY", "I", "<init>", "()V", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final NumberPicker.d getTWO_DIGIT_FORMATTER() {
            return RemindTimePicker.TWO_DIGIT_FORMATTER;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/training_plan/widget/RemindTimePicker$OnMinuteChangeListener;", "Lcom/xiaomi/fitness/baseui/widget/NumberPickerView$d;", "Lcom/xiaomi/fitness/baseui/widget/NumberPickerView;", "picker", "", "oldVal", "newVal", "", "onValueChange", "(Lcom/xiaomi/fitness/baseui/widget/NumberPickerView;II)V", "<init>", "(Lcom/xiaomi/fitness/training_plan/widget/RemindTimePicker;)V", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class OnMinuteChangeListener implements NumberPickerView.d {
        public OnMinuteChangeListener() {
        }

        @Override // com.xiaomi.fitness.baseui.widget.NumberPickerView.d
        public void onValueChange(@NotNull NumberPickerView picker, int oldVal, int newVal) {
            Intrinsics.checkNotNullParameter(picker, "picker");
            RemindTimePicker.this.callOnTimeChanged();
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J+\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/training_plan/widget/RemindTimePicker$OnTimeChangedListener;", "", "onTimeChanged", "", "view", "Lcom/xiaomi/fitness/training_plan/widget/RemindTimePicker;", "hourOfDay", "", "minute", "(Lcom/xiaomi/fitness/training_plan/widget/RemindTimePicker;Ljava/lang/Integer;Ljava/lang/Integer;)V", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnTimeChangedListener {
        void onTimeChanged(@Nullable RemindTimePicker view, @Nullable Integer hourOfDay, @Nullable Integer minute);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RemindTimePicker(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(RemindTimePicker this$0, NumberPickerView numberPickerView, int i, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onTimeChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(RemindTimePicker this$0, NumberPickerView numberPickerView, int i, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int minValue = this$0.mMinuteSpinner.getMinValue();
        int maxValue = this$0.mMinuteSpinner.getMaxValue();
        if (i == maxValue && i2 == minValue) {
            this$0.mHourSpinner.setValue(this$0.mHourSpinner.getValue() + 1);
        } else if (i == minValue && i2 == maxValue) {
            this$0.mHourSpinner.setValue(this$0.mHourSpinner.getValue() - 1);
        }
        this$0.onTimeChanged();
    }

    private final void onTimeChanged() {
        sendAccessibilityEvent(4);
        OnTimeChangedListener onTimeChangedListener = this.mOnTimeChangedListener;
        if (onTimeChangedListener != null) {
            onTimeChangedListener.onTimeChanged(this, getCurrentHour(), Integer.valueOf(getCurrentMinute()));
        }
    }

    private final void setCurrentLocale(Locale locale) {
        if (Intrinsics.areEqual(locale, this.mCurrentLocale)) {
            return;
        }
        this.mCurrentLocale = locale;
        this.mTempCalendar = Calendar.getInstance(locale);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setMaxTime$lambda$0(int i, RemindTimePicker this$0, NumberPickerView numberPickerView, int i2, int i3) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i3 == i) {
            this$0.mHourSpinner.h0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setMaxTime$lambda$1(int i, RemindTimePicker this$0, int i2, NumberPickerView numberPickerView, int i3, int i4) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i == this$0.mHourSpinner.getValue() && i4 == i2) {
            this$0.mMinuteSpinner.h0();
        }
    }

    private final void updateHourControl() {
        this.mHourSpinner.setMinValue(0);
        this.mHourSpinner.setMaxValue(23);
    }

    public final void callOnTimeChanged() {
        onTimeChanged();
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(@NotNull AccessibilityEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        onPopulateAccessibilityEvent(event);
        return true;
    }

    @Override // android.view.View
    public int getBaseline() {
        return this.mHourSpinner.getBaseline();
    }

    @Nullable
    public final Integer getCurrentHour() {
        return Integer.valueOf(this.mHourSpinner.getValue());
    }

    public final int getCurrentMinute() {
        return this.mMinuteSpinner.getValue();
    }

    @Override // android.view.View
    public boolean isEnabled() {
        return this.mIsEnabled;
    }

    @Override // android.view.View
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Locale locale = newConfig.locale;
        Intrinsics.checkNotNullExpressionValue(locale, "locale");
        setCurrentLocale(locale);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(@NotNull AccessibilityEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        super.onInitializeAccessibilityEvent(event);
        event.setClassName(RemindTimePicker.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NotNull AccessibilityNodeInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.onInitializeAccessibilityNodeInfo(info);
        info.setClassName(RemindTimePicker.class.getName());
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(@NotNull AccessibilityEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        super.onPopulateAccessibilityEvent(event);
        Calendar calendar = this.mTempCalendar;
        Intrinsics.checkNotNull(calendar);
        Integer currentHour = getCurrentHour();
        Intrinsics.checkNotNull(currentHour);
        calendar.set(11, currentHour.intValue());
        Calendar calendar2 = this.mTempCalendar;
        Intrinsics.checkNotNull(calendar2);
        calendar2.set(12, getCurrentMinute());
        Context context = getContext();
        Calendar calendar3 = this.mTempCalendar;
        Intrinsics.checkNotNull(calendar3);
        event.getText().add(DateUtils.formatDateTime(context, calendar3.getTimeInMillis(), 129));
    }

    public final void setCurrentHour(@Nullable Integer num) {
        if (num == null || this.currentHour == num) {
            return;
        }
        this.mHourSpinner.setValue(num.intValue());
        this.currentHour = num;
        onTimeChanged();
    }

    public final void setCurrentMinute(int i) {
        this.mMinuteSpinner.setValue(i);
        onTimeChanged();
        this.currentMinute = i;
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        if (this.mIsEnabled == enabled) {
            return;
        }
        super.setEnabled(enabled);
        this.mMinuteSpinner.setEnabled(enabled);
        this.mHourSpinner.setEnabled(enabled);
        this.mIsEnabled = enabled;
    }

    public final void setLabel(int hourLabel, int minuteLabel) {
        if (hourLabel != 0) {
            this.mHourSpinner.setHintText(getContext().getString(hourLabel));
        }
        if (minuteLabel != 0) {
            this.mMinuteSpinner.setHintText(getContext().getString(minuteLabel));
        }
    }

    public final void setMaxTime(final int hour, final int minute) {
        this.mHourSpinner.setOnValueChangedListener(new NumberPickerView.d() { // from class: hjk
            @Override // com.xiaomi.fitness.baseui.widget.NumberPickerView.d
            public final void onValueChange(NumberPickerView numberPickerView, int i, int i2) {
                RemindTimePicker.setMaxTime$lambda$0(hour, this, numberPickerView, i, i2);
            }
        });
        this.mMinuteSpinner.setOnValueChangedListener(new NumberPickerView.d() { // from class: ijk
            @Override // com.xiaomi.fitness.baseui.widget.NumberPickerView.d
            public final void onValueChange(NumberPickerView numberPickerView, int i, int i2) {
                RemindTimePicker.setMaxTime$lambda$1(hour, this, minute, numberPickerView, i, i2);
            }
        });
    }

    public final void setOnTimeChangedListener(@Nullable OnTimeChangedListener onTimeChangedListener) {
        this.mOnTimeChangedListener = onTimeChangedListener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RemindTimePicker(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ RemindTimePicker(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RemindTimePicker(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mIsEnabled = true;
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        setCurrentLocale(locale);
        int i2 = jvi.g0;
        Object systemService = context.getSystemService("layout_inflater");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        ((LayoutInflater) systemService).inflate(i2, (ViewGroup) this, true);
        NumberPickerView numberPickerView = (NumberPickerView) findViewById(csi.y0);
        this.mHourSpinner = numberPickerView;
        numberPickerView.setOnValueChangedListener(new NumberPickerView.d() { // from class: jjk
            @Override // com.xiaomi.fitness.baseui.widget.NumberPickerView.d
            public final void onValueChange(NumberPickerView numberPickerView2, int i3, int i4) {
                RemindTimePicker._init_$lambda$2(this.f22868a, numberPickerView2, i3, i4);
            }
        });
        NumberPickerView numberPickerView2 = (NumberPickerView) findViewById(csi.H1);
        this.mMinuteSpinner = numberPickerView2;
        numberPickerView2.setMinValue(0);
        numberPickerView2.setMaxValue(59);
        numberPickerView2.setOnValueChangedListener(new NumberPickerView.d() { // from class: kjk
            @Override // com.xiaomi.fitness.baseui.widget.NumberPickerView.d
            public final void onValueChange(NumberPickerView numberPickerView3, int i3, int i4) {
                RemindTimePicker._init_$lambda$3(this.f23924a, numberPickerView3, i3, i4);
            }
        });
        numberPickerView2.setOnValueChangedListener(new OnMinuteChangeListener());
        updateHourControl();
        Calendar calendar = this.mTempCalendar;
        Intrinsics.checkNotNull(calendar);
        setCurrentHour(Integer.valueOf(calendar.get(11)));
        Calendar calendar2 = this.mTempCalendar;
        Intrinsics.checkNotNull(calendar2);
        setCurrentMinute(calendar2.get(12));
        if (!isEnabled()) {
            setEnabled(false);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }
}
