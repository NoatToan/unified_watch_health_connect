package com.xiaomi.fitness.devicesettings.common;

import android.view.View;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.dialog.a;
import com.xiaomi.fitness.devicesettings.widget.TimePicker;
import defpackage.eui;
import defpackage.zqi;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001a\u001bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\nJ\u0006\u0010\u0014\u001a\u00020\nJ\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\nJ\u0006\u0010\u0017\u001a\u00020\nJ\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\nR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/TimePickerDialog;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "<init>", "()V", "mTimePicker", "Lcom/xiaomi/fitness/devicesettings/widget/TimePicker;", "is24Hour", "", "currentHour", "", "currentMinute", "minSpinnerVisible", "initCustomView", "", "rootView", "Landroid/view/View;", "setIs24HourView", "setCurrentHour", "hour", "getCurrentHour", "setCurrentMinute", "minute", "getCurrentMinute", "setMinSpinnerVisible", "visible", "Builder", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TimePickerDialog extends CommonDialog<DialogParams> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private int currentHour;
    private int currentMinute;
    private boolean is24Hour = true;

    @Nullable
    private TimePicker mTimePicker;
    private int minSpinnerVisible;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0004\u001a\u00020\u0000H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/TimePickerDialog$Builder;", "Lcom/xiaomi/fitness/baseui/dialog/a;", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "Lcom/xiaomi/fitness/devicesettings/common/TimePickerDialog;", "getThis", "()Lcom/xiaomi/fitness/devicesettings/common/TimePickerDialog$Builder;", "internalCreate", "()Lcom/xiaomi/fitness/devicesettings/common/TimePickerDialog;", "", "name", "<init>", "(Ljava/lang/String;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class Builder extends a<Builder, DialogParams, TimePickerDialog> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull String name) {
            super(new DialogParams(name));
            Intrinsics.checkNotNullParameter(name, "name");
        }

        @Override // com.xiaomi.fitness.baseui.dialog.a
        @NotNull
        public Builder getThis() {
            return this;
        }

        @Override // com.xiaomi.fitness.baseui.dialog.a
        @NotNull
        public TimePickerDialog internalCreate() {
            return new TimePickerDialog();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/TimePickerDialog$Companion;", "", "<init>", "()V", "defaultBuilder", "Lcom/xiaomi/fitness/devicesettings/common/TimePickerDialog$Builder;", "name", "", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Builder defaultBuilder(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            Builder canceledOnTouchOutside = new Builder(name).setCustomLayoutId(eui.m2).setCancelable(true).setCanceledOnTouchOutside(true);
            Intrinsics.checkNotNullExpressionValue(canceledOnTouchOutside, "setCanceledOnTouchOutside(...)");
            return canceledOnTouchOutside;
        }
    }

    public final int getCurrentHour() {
        Integer currentHour;
        TimePicker timePicker = this.mTimePicker;
        if (timePicker == null || (currentHour = timePicker.getCurrentHour()) == null) {
            return 0;
        }
        return currentHour.intValue();
    }

    public final int getCurrentMinute() {
        Integer currentMinute;
        TimePicker timePicker = this.mTimePicker;
        if (timePicker == null || (currentMinute = timePicker.getCurrentMinute()) == null) {
            return 0;
        }
        return currentMinute.intValue();
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public void initCustomView(@Nullable View rootView) {
        super.initCustomView(rootView);
        TimePicker timePicker = rootView != null ? (TimePicker) rootView.findViewById(zqi.M9) : null;
        this.mTimePicker = timePicker;
        if (timePicker != null) {
            timePicker.setIs24HourView(Boolean.valueOf(this.is24Hour));
            timePicker.setCurrentHour(Integer.valueOf(this.currentHour));
            timePicker.setCurrentMinute(Integer.valueOf(this.currentMinute));
            timePicker.setMinSpinnerVisible(this.minSpinnerVisible);
        }
    }

    @NotNull
    public final TimePickerDialog setCurrentHour(int hour) {
        this.currentHour = hour;
        return this;
    }

    @NotNull
    public final TimePickerDialog setCurrentMinute(int minute) {
        this.currentMinute = minute;
        return this;
    }

    @NotNull
    public final TimePickerDialog setIs24HourView(boolean is24Hour) {
        this.is24Hour = is24Hour;
        return this;
    }

    @NotNull
    public final TimePickerDialog setMinSpinnerVisible(int visible) {
        this.minSpinnerVisible = visible;
        return this;
    }
}
