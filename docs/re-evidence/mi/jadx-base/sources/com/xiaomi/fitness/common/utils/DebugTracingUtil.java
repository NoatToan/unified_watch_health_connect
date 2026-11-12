package com.xiaomi.fitness.common.utils;

import android.os.Debug;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/common/utils/DebugTracingUtil;", "", "<init>", "()V", "startMethodTracingWithTimeTracePath", "", "stopMethodTracing", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DebugTracingUtil {

    @NotNull
    public static final DebugTracingUtil INSTANCE = new DebugTracingUtil();

    private DebugTracingUtil() {
    }

    public final void startMethodTracingWithTimeTracePath() {
        String str = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss", Locale.getDefault()).format(new Date());
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        Debug.startMethodTracing("sample-" + str);
    }

    public final void stopMethodTracing() {
        Debug.stopMethodTracing();
    }
}
