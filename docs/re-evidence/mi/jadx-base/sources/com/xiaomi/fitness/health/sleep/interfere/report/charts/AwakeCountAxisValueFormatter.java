package com.xiaomi.fitness.health.sleep.interfere.report.charts;

import android.content.Context;
import defpackage.fpc;
import defpackage.ft1;
import defpackage.qxi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\t\u0010\bR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/report/charts/AwakeCountAxisValueFormatter;", "Lfpc;", "", "value", "Lft1;", "axis", "", "getAxisLabel", "(FLft1;)Ljava/lang/String;", "getFormattedValue", "Landroid/content/Context;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class AwakeCountAxisValueFormatter implements fpc {

    @NotNull
    private final Context context;

    public AwakeCountAxisValueFormatter(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @Nullable
    public final String getAxisLabel(float value, @Nullable ft1 axis) {
        int i = (int) value;
        return this.context.getResources().getQuantityString(qxi.W0, i, Integer.valueOf(i));
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Override // defpackage.fpc
    @Nullable
    public String getFormattedValue(float value, @Nullable ft1 axis) {
        return getAxisLabel(value, axis);
    }
}
