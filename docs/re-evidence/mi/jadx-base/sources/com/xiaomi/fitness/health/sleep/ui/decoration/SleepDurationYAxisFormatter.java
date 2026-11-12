package com.xiaomi.fitness.health.sleep.ui.decoration;

import defpackage.onq;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/decoration/SleepDurationYAxisFormatter;", "Lonq;", "", "value", "", "getFormattedValue", "(F)Ljava/lang/String;", "<init>", "()V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SleepDurationYAxisFormatter extends onq {
    @Override // defpackage.onq
    @NotNull
    public String getFormattedValue(float value) {
        return String.valueOf((int) value);
    }
}
