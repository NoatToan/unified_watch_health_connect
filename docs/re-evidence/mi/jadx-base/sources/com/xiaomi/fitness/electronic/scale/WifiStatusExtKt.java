package com.xiaomi.fitness.electronic.scale;

import defpackage.jz7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003¨\u0006\u0005"}, d2 = {"Ljz7;", "", "isConfigured", "(Ljz7;)Z", "isConfiguredSuccess", "electronic-scale_chinaProductRelease"}, k = 2, mv = {2, 0, 0})
public final class WifiStatusExtKt {
    public static final boolean isConfigured(@NotNull jz7 jz7Var) {
        Intrinsics.checkNotNullParameter(jz7Var, "<this>");
        String ssid = jz7Var.d;
        Intrinsics.checkNotNullExpressionValue(ssid, "ssid");
        return ssid.length() > 0;
    }

    public static final boolean isConfiguredSuccess(@NotNull jz7 jz7Var) {
        Intrinsics.checkNotNullParameter(jz7Var, "<this>");
        return jz7Var.c == 2;
    }
}
