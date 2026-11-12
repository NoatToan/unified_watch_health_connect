package com.huami.device.feature.health.ui.dialog;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.device.feature.health.device.HealthFunc;
import com.huami.device.feature.health.res.AppResKt;
import com.huami.device.feature.health.ui.model.DialogParams;
import com.huami.device.feature.health.ui.model.IIntervalDialogRule;
import com.huami.device.feature.health.ui.model.IntervalExp;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0016\u0010\u000b\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\nR\u0016\u0010\r\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0016\u0010\u000f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0016\u0010\u0011\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/huami/device/feature/health/ui/dialog/HuamiOSHrChangeRule;", "Lcom/huami/device/feature/health/ui/model/IIntervalDialogRule;", "", "a", "Lcom/huami/device/feature/health/ui/model/IntervalExp;", "expression", "", "evaluate", "Lcom/huami/device/feature/health/ui/model/DialogParams;", "process", "Z", "highWarningOpen", "b", "lowWarningOpen", "c", "needShowForHighFreq", GoogleApiAvailabilityLight.a, "needShowForLowFreq", "<init>", "()V", "health-ui_release"}, k = 1, mv = {1, 5, 1})
public final class HuamiOSHrChangeRule implements IIntervalDialogRule {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean highWarningOpen;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean lowWarningOpen;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean needShowForHighFreq;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean needShowForLowFreq;

    private final void a() {
        this.highWarningOpen = false;
        this.lowWarningOpen = false;
        this.needShowForHighFreq = false;
        this.needShowForLowFreq = false;
    }

    @Override // com.huami.device.feature.health.ui.model.IIntervalDialogRule
    public boolean evaluate(@NotNull IntervalExp expression) {
        boolean zIsHuamiOs = expression.isHuamiOs();
        this.highWarningOpen = HealthFunc.HIGH_HR_ALERT.INSTANCE.isSupport() && expression.getUserConfig().getHighWarningValue() != 0;
        boolean z = expression.getUserChoose() == 0 || expression.getUserChoose() > 1;
        this.lowWarningOpen = HealthFunc.LOW_HR_ALERT.INSTANCE.isSupport() && expression.getUserConfig().getLowWarningValue() != 0;
        boolean z2 = expression.getPreValue() != 0 && expression.getPreValue() <= 1;
        boolean z3 = z && this.highWarningOpen;
        this.needShowForHighFreq = z3;
        boolean z4 = z && this.lowWarningOpen;
        this.needShowForLowFreq = z4;
        if (zIsHuamiOs) {
            return (z3 || z4) && z2;
        }
        return false;
    }

    @Override // com.huami.device.feature.health.ui.model.IIntervalDialogRule
    @Nullable
    public DialogParams process(@NotNull IntervalExp expression) {
        String lowHrAlertFreqNotSupportWarning;
        boolean z = this.needShowForHighFreq;
        if (z && this.needShowForLowFreq) {
            lowHrAlertFreqNotSupportWarning = AppResKt.getHealthStr().getHighLowHrAlertFreqNotSupportWarning();
        } else if (z) {
            lowHrAlertFreqNotSupportWarning = AppResKt.getHealthStr().getHighHrAlertFreqNotSupportWarning();
        } else {
            lowHrAlertFreqNotSupportWarning = this.needShowForLowFreq ? AppResKt.getHealthStr().getLowHrAlertFreqNotSupportWarning() : null;
        }
        if (lowHrAlertFreqNotSupportWarning == null) {
            return null;
        }
        a();
        return new DialogParams(AppResKt.getHealthStr().getAlldayHrFreqTooLow(), lowHrAlertFreqNotSupportWarning, AppResKt.getHealthStr().getBtnYes(), AppResKt.getHealthStr().getBtnCancel());
    }
}
