package com.huami.tools.analytics;

import androidx.annotation.NonNull;
import com.huami.tools.analytics.internal.utils.Const;
import com.huami.tools.analytics.internal.utils.DefaultClock;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes15.dex */
class g implements Executor {
    private final String a;

    @NonNull
    private Executor b;
    private long c;
    private long d;

    public g(@NonNull Executor executor, long j, boolean z) {
        this.b = executor;
        this.c = j;
        StringBuilder sb = new StringBuilder();
        sb.append(Const.LOG_TAG_PREFIX);
        sb.append(z ? "AnonymousDebounceExecutor" : "IdentifiedDebounceExecutor");
        this.a = sb.toString();
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NonNull Runnable runnable) {
        long jCurrentTimeMillis = DefaultClock.get().currentTimeMillis();
        if (jCurrentTimeMillis - this.d <= this.c) {
            p.b().v(this.a, "未到达防抖动超时时间，不执行任务");
        } else {
            this.b.execute(runnable);
            this.d = jCurrentTimeMillis;
        }
    }
}
