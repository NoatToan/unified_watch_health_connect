package com.huami.message.utils;

import android.os.SystemClock;
import android.util.ArrayMap;
import com.huami.passport.Configs;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\u000bR\"\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/huami/message/utils/TimeoutAction;", "KEY", "", "", "a", "key", "", "shouldAction", "(Ljava/lang/Object;)Z", "", "start", "(Ljava/lang/Object;)V", Configs.Params.RESET, "Landroid/util/ArrayMap;", "Landroid/util/ArrayMap;", "timestamps", "b", "J", "timeout", "", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "<init>", "(ILjava/util/concurrent/TimeUnit;)V", "message-mifit_release"}, k = 1, mv = {1, 5, 1})
public final class TimeoutAction<KEY> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ArrayMap<KEY, Long> timestamps = new ArrayMap<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long timeout;

    public TimeoutAction(int i, @NotNull TimeUnit timeUnit) {
        this.timeout = timeUnit.toMillis(i);
    }

    private final long a() {
        return SystemClock.uptimeMillis();
    }

    public final synchronized void reset(KEY key) {
        this.timestamps.remove(key);
    }

    public final synchronized boolean shouldAction(KEY key) {
        Long l = this.timestamps.get(key);
        return l != null && a() - l.longValue() > this.timeout;
    }

    public final synchronized void start(KEY key) {
        Long l = this.timestamps.get(key);
        long jA = a();
        if (l == null) {
            this.timestamps.put(key, Long.valueOf(jA));
        }
    }
}
