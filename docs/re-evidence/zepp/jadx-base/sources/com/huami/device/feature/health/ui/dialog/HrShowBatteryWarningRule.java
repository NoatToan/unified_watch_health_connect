package com.huami.device.feature.health.ui.dialog;

import com.huami.device.feature.health.res.AppResKt;
import com.huami.device.feature.health.res.IAppRes;
import com.huami.device.feature.health.ui.model.DialogParams;
import com.huami.device.feature.health.ui.model.IIntervalDialogRule;
import com.huami.device.feature.health.ui.model.IntervalExp;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/huami/device/feature/health/ui/dialog/HrShowBatteryWarningRule;", "Lcom/huami/device/feature/health/ui/model/IIntervalDialogRule;", "Lcom/huami/device/feature/health/ui/model/IntervalExp;", "expression", "", "evaluate", "Lcom/huami/device/feature/health/ui/model/DialogParams;", "process", "<init>", "()V", "health-ui_release"}, k = 1, mv = {1, 5, 1})
public final class HrShowBatteryWarningRule implements IIntervalDialogRule {
    @Override // com.huami.device.feature.health.ui.model.IIntervalDialogRule
    public boolean evaluate(@NotNull IntervalExp expression) {
        return (expression.getPreValue() == 0) || (expression.getUserChoose() < expression.getPreValue() && expression.getUserChoose() != 0);
    }

    @Override // com.huami.device.feature.health.ui.model.IIntervalDialogRule
    @Nullable
    public DialogParams process(@NotNull IntervalExp expression) {
        IAppRes healthStr = AppResKt.getHealthStr();
        return new DialogParams(healthStr.getDeviceBatteryWarningTitle(), healthStr.getHrFreqIncreaseWarningSummary(), healthStr.getBtnYes(), healthStr.getBtnCancel());
    }
}
