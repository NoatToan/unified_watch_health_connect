package com.huami.assistant.ui.v2.util;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/huami/assistant/ui/v2/util/ScheduleIdUtil;", "", "", "generateId", "Ljava/util/concurrent/atomic/AtomicLong;", "a", "Ljava/util/concurrent/atomic/AtomicLong;", "sIdCache", "<init>", "()V", "assistant_release"}, k = 1, mv = {1, 5, 1})
public final class ScheduleIdUtil {

    @NotNull
    public static final ScheduleIdUtil INSTANCE = new ScheduleIdUtil();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final AtomicLong sIdCache = new AtomicLong(0);

    private ScheduleIdUtil() {
    }

    public final synchronized long generateId() {
        long jCurrentTimeMillis;
        jCurrentTimeMillis = System.currentTimeMillis() / ((long) 1000);
        AtomicLong atomicLong = sIdCache;
        if (jCurrentTimeMillis <= atomicLong.get()) {
            jCurrentTimeMillis = atomicLong.get() + 1;
        }
        atomicLong.set(jCurrentTimeMillis);
        return jCurrentTimeMillis;
    }
}
