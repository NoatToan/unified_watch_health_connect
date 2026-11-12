package io.netty.util;

import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public interface Timer {
    Timeout newTimeout(TimerTask timerTask, long j, TimeUnit timeUnit);

    Set<Timeout> stop();
}
