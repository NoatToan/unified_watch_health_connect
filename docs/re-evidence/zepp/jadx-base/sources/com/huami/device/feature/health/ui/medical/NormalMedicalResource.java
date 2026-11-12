package com.huami.device.feature.health.ui.medical;

import com.huami.device.feature.health.res.AppResKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00028V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/huami/device/feature/health/ui/medical/NormalMedicalResource;", "Lcom/huami/device/feature/health/ui/medical/MedicalResource;", "", "getAtrial_fib_text", "()Ljava/lang/String;", "atrial_fib_text", "getAtrial_fib_summary", "atrial_fib_summary", "<init>", "()V", "health-ui_release"}, k = 1, mv = {1, 5, 1})
public final class NormalMedicalResource extends MedicalResource {
    @Override // com.huami.device.feature.health.ui.medical.MedicalResource
    @NotNull
    public String getAtrial_fib_summary() {
        return AppResKt.getHealthStr().getHrAtrialFibSummary();
    }

    @Override // com.huami.device.feature.health.ui.medical.MedicalResource
    @NotNull
    public String getAtrial_fib_text() {
        return AppResKt.getHealthStr().getAtrialFib();
    }
}
