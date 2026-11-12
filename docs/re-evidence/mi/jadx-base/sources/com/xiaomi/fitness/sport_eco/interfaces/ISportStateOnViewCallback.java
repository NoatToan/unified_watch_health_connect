package com.xiaomi.fitness.sport_eco.interfaces;

import defpackage.m0d;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/interfaces/ISportStateOnViewCallback;", "", "Lm0d;", "callback", "", "onViewRestart", "(Lm0d;)V", "onViewPaused", "onViewFinish", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public interface ISportStateOnViewCallback {
    void onViewFinish(@NotNull m0d callback);

    void onViewPaused(@NotNull m0d callback);

    void onViewRestart(@NotNull m0d callback);
}
