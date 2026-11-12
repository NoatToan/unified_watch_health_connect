package com.mapbox.common.module.cronet;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0016\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0003"}, d2 = {"executor", "Ljava/util/concurrent/ScheduledExecutorService;", "kotlin.jvm.PlatformType", "common_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class CronetRequestDetailKt {
    private static final ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
}
