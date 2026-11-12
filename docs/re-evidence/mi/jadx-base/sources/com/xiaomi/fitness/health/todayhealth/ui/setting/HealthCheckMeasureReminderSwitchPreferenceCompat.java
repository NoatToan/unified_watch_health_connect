package com.xiaomi.fitness.health.todayhealth.ui.setting;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.preference.SwitchPreferenceCompat;
import com.xiaomi.fitness.health.todayhealth.ui.setting.HealthCheckMeasureReminderSwitchPreferenceCompat;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import com.xiaomi.fitness.widget.button.SwitchButton;
import defpackage.eri;
import defpackage.g7i;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B3\b\u0007\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u000f¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0012R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/ui/setting/HealthCheckMeasureReminderSwitchPreferenceCompat;", "Landroidx/preference/SwitchPreferenceCompat;", "Landroid/view/View;", "view", "", "syncSwitchView", "(Landroid/view/View;)V", "Lg7i;", "holder", "onBindViewHolder", "(Lg7i;)V", "", "isSwitch", "setSwitchButton", "(Ljava/lang/Boolean;)V", "", "resId", "setSwitchTextOn", "(I)V", "setSwitchTextOff", "Lcom/xiaomi/fitness/widget/button/SwitchButton;", "switchView", "Lcom/xiaomi/fitness/widget/button/SwitchButton;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class HealthCheckMeasureReminderSwitchPreferenceCompat extends SwitchPreferenceCompat {

    @Nullable
    private SwitchButton switchView;

    @JvmOverloads
    public HealthCheckMeasureReminderSwitchPreferenceCompat(@Nullable Context context) {
        this(context, null, 0, 0, 14, null);
    }

    private final void syncSwitchView(View view) {
        if (view instanceof SwitchButton) {
            SwitchButton switchButton = (SwitchButton) view;
            this.switchView = switchButton;
            Intrinsics.checkNotNull(switchButton);
            switchButton.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: dpb
                @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
                public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                    HealthCheckMeasureReminderSwitchPreferenceCompat.syncSwitchView$lambda$0(this.f15787a, z, iSwitchButton);
                }
            });
            SwitchButton switchButton2 = this.switchView;
            Intrinsics.checkNotNull(switchButton2);
            switchButton2.setChecked(isChecked());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void syncSwitchView$lambda$0(HealthCheckMeasureReminderSwitchPreferenceCompat this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setChecked(z);
    }

    @Override // androidx.preference.SwitchPreferenceCompat, androidx.preference.Preference
    public void onBindViewHolder(@NotNull g7i holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onBindViewHolder(holder);
        View viewA = holder.a(eri.Ap);
        Intrinsics.checkNotNull(viewA);
        syncSwitchView(viewA);
        super.syncSummaryView(holder);
    }

    public final void setSwitchButton(@Nullable Boolean isSwitch) {
        SwitchButton switchButton = this.switchView;
        if (switchButton != null) {
            Intrinsics.checkNotNull(switchButton);
            Intrinsics.checkNotNull(isSwitch);
            switchButton.i(isSwitch.booleanValue(), false, false);
        }
    }

    @Override // androidx.preference.SwitchPreferenceCompat
    public void setSwitchTextOff(int resId) {
        setSwitchTextOff(getContext().getString(resId));
    }

    @Override // androidx.preference.SwitchPreferenceCompat
    public void setSwitchTextOn(int resId) {
        setSwitchTextOn(getContext().getString(resId));
    }

    @JvmOverloads
    public HealthCheckMeasureReminderSwitchPreferenceCompat(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    @JvmOverloads
    public HealthCheckMeasureReminderSwitchPreferenceCompat(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public /* synthetic */ HealthCheckMeasureReminderSwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HealthCheckMeasureReminderSwitchPreferenceCompat(@Nullable Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNull(context);
    }
}
