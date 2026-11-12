package com.xiaomi.fitness.health.sleep.ui.decoration;

import android.content.Context;
import defpackage.onq;
import defpackage.qxi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/decoration/SleepWakeCountYAxisFormatter;", "Lonq;", "", "value", "", "getFormattedValue", "(F)Ljava/lang/String;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SleepWakeCountYAxisFormatter extends onq {

    @NotNull
    private final Context context;

    public SleepWakeCountYAxisFormatter(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @Override // defpackage.onq
    @NotNull
    public String getFormattedValue(float value) {
        int i = (int) value;
        String quantityString = this.context.getResources().getQuantityString(qxi.i0, i, Integer.valueOf(i));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        return quantityString;
    }
}
