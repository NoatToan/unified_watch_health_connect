package com.xiaomi.hm.health.healthdata.utils.headset;

import com.baidu.ocr.sdk.utils.LogUtil;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.ranges.e;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/utils/headset/HeadsetHealth;", "", "", "a", LogUtil.I, "AVAILABLE_PROCESSORS", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "b", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "getNET", "()Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "NET", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class HeadsetHealth {

    @NotNull
    public static final HeadsetHealth INSTANCE = new HeadsetHealth();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final int AVAILABLE_PROCESSORS;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final ExecutorCoroutineDispatcher NET;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        AVAILABLE_PROCESSORS = iAvailableProcessors;
        NET = ExecutorsKt.from(Executors.newFixedThreadPool(e.coerceAtLeast(3, iAvailableProcessors)));
    }

    private HeadsetHealth() {
    }

    @NotNull
    public final ExecutorCoroutineDispatcher getNET() {
        return NET;
    }
}
