package com.xiaomi.eco.connection;

import com.xiaomi.fitness.common.log.Logger;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR&\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/eco/connection/ConnectSource;", "", "<init>", "()V", "time", "", "getTime", "()J", "setTime", "(J)V", "value", "", "fromMainProcess", "getFromMainProcess", "()Z", "setFromMainProcess", "(Z)V", "eco-common-connect_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ConnectSource {

    @NotNull
    public static final ConnectSource INSTANCE = new ConnectSource();
    private static volatile boolean fromMainProcess;
    private static long time;

    private ConnectSource() {
    }

    public final boolean getFromMainProcess() {
        Logger.i("EcoConnectSource", "connect from main process " + fromMainProcess);
        return fromMainProcess;
    }

    public final long getTime() {
        return time;
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
