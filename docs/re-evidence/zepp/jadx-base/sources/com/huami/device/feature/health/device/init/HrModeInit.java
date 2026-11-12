package com.huami.device.feature.health.device.init;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ;\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/huami/device/feature/health/device/init/HrModeInit;", "Lcom/huami/device/feature/health/device/init/BaseHealthInit;", "", "hrEnable", "", "hrInterval", "hrSleepEnable", "atrialFibEnable", "isSupportAtrial", "recoverHrSettings", "(ZIZZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "health-base_release"}, k = 1, mv = {1, 5, 1})
public abstract class HrModeInit extends BaseHealthInit {
    @Nullable
    public abstract Object recoverHrSettings(boolean z, int i, boolean z2, boolean z3, boolean z4, @NotNull Continuation<? super Boolean> continuation);
}
