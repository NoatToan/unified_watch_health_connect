package com.xiaomi.fitness.health.sleep.interfere.widget;

import android.view.View;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.dialog.a;
import defpackage.eri;
import defpackage.jui;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0015B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\bJ\u0006\u0010\u0010\u001a\u00020\bJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\bJ\u0006\u0010\u0013\u001a\u00020\bR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/widget/SleepInterfereTimeSetDialog;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "<init>", "()V", "mTimePicker", "Lcom/xiaomi/fitness/health/sleep/interfere/widget/SleepTimePicker;", "currentHour", "", "currentMinute", "initCustomView", "", "rootView", "Landroid/view/View;", "setCurrentHour", "hour", "getCurrentHour", "setCurrentMinute", "minute", "getCurrentMinute", "Builder", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepInterfereTimeSetDialog extends CommonDialog<DialogParams> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private int currentHour;
    private int currentMinute;

    @Nullable
    private SleepTimePicker mTimePicker;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0004\u001a\u00020\u0000H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/widget/SleepInterfereTimeSetDialog$Builder;", "Lcom/xiaomi/fitness/baseui/dialog/a;", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "Lcom/xiaomi/fitness/health/sleep/interfere/widget/SleepInterfereTimeSetDialog;", "getThis", "()Lcom/xiaomi/fitness/health/sleep/interfere/widget/SleepInterfereTimeSetDialog$Builder;", "internalCreate", "()Lcom/xiaomi/fitness/health/sleep/interfere/widget/SleepInterfereTimeSetDialog;", "", "name", "<init>", "(Ljava/lang/String;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class Builder extends a<Builder, DialogParams, SleepInterfereTimeSetDialog> {
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
        public SleepInterfereTimeSetDialog internalCreate() {
            return new SleepInterfereTimeSetDialog();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/widget/SleepInterfereTimeSetDialog$Companion;", "", "<init>", "()V", "defaultBuilder", "Lcom/xiaomi/fitness/health/sleep/interfere/widget/SleepInterfereTimeSetDialog$Builder;", "name", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Builder defaultBuilder(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            Builder canceledOnTouchOutside = new Builder(name).setCustomLayoutId(jui.A8).setCancelable(true).setCanceledOnTouchOutside(true);
            Intrinsics.checkNotNullExpressionValue(canceledOnTouchOutside, "setCanceledOnTouchOutside(...)");
            return canceledOnTouchOutside;
        }
    }

    public final int getCurrentHour() {
        Integer currentHour;
        SleepTimePicker sleepTimePicker = this.mTimePicker;
        if (sleepTimePicker == null || (currentHour = sleepTimePicker.getCurrentHour()) == null) {
            return 0;
        }
        return currentHour.intValue();
    }

    public final int getCurrentMinute() {
        SleepTimePicker sleepTimePicker = this.mTimePicker;
        if (sleepTimePicker != null) {
            return sleepTimePicker.getCurrentMinute();
        }
        return 0;
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public void initCustomView(@Nullable View rootView) {
        super.initCustomView(rootView);
        SleepTimePicker sleepTimePicker = rootView != null ? (SleepTimePicker) rootView.findViewById(eri.Wi) : null;
        this.mTimePicker = sleepTimePicker;
        if (sleepTimePicker != null) {
            sleepTimePicker.setCurrentHour(Integer.valueOf(this.currentHour));
            sleepTimePicker.setCurrentMinute(this.currentMinute);
        }
    }

    @NotNull
    public final SleepInterfereTimeSetDialog setCurrentHour(int hour) {
        this.currentHour = hour;
        return this;
    }

    @NotNull
    public final SleepInterfereTimeSetDialog setCurrentMinute(int minute) {
        this.currentMinute = minute;
        return this;
    }
}
