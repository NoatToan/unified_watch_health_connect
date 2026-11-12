package com.xiaomi.wearable.connection;

import com.xiaomi.wearable.core.CoreExtKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR&\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/wearable/connection/ConnectSource;", "", "<init>", "()V", "time", "", "getTime", "()J", "setTime", "(J)V", "value", "", "fromMainProcess", "getFromMainProcess", "()Z", "setFromMainProcess", "(Z)V", "isForeground", "setForeground", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ConnectSource {

    @NotNull
    public static final ConnectSource INSTANCE = new ConnectSource();
    private static volatile boolean fromMainProcess;
    private static boolean isForeground;
    private static long time;

    private ConnectSource() {
    }

    public final boolean getFromMainProcess() {
        CoreExtKt.getLogger().i("ConnectSource", "connect from main process " + fromMainProcess);
        return fromMainProcess;
    }

    public final long getTime() {
        return time;
    }

    public final boolean isForeground() {
        return isForeground;
    }

    public final void setForeground(boolean z) {
        isForeground = z;
    }

    public final void setFromMainProcess(boolean z) {
        if (z) {
            fromMainProcess = z;
            time = System.currentTimeMillis();
        } else if (System.currentTimeMillis() - time > 1000) {
            fromMainProcess = z;
        }
    }

    public final void setTime(long j) {
        time = j;
    }
}
