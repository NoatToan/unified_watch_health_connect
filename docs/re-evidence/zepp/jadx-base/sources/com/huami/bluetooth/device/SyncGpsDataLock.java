package com.huami.bluetooth.device;

import java.util.Timer;
import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u0006\u0010\b\u001a\u00020\u0005R$\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/huami/bluetooth/device/SyncGpsDataLock;", "", "", "lockTime", "Lkotlin/Function0;", "", "runnable", "lock", "unLock", "", "<set-?>", "a", "Z", "isLocked", "()Z", "Ljava/util/Timer;", "b", "Ljava/util/Timer;", "timer", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class SyncGpsDataLock {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private volatile boolean isLocked;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private Timer timer;

    /* JADX INFO: renamed from: isLocked, reason: from getter */
    public final boolean getIsLocked() {
        return this.isLocked;
    }

    public final void lock(long lockTime, @NotNull final Function0<Unit> runnable) {
        synchronized (Boolean.valueOf(this.isLocked)) {
            if (getIsLocked()) {
                return;
            }
            this.isLocked = true;
            Timer timer = new Timer(true);
            timer.schedule(new TimerTask() { // from class: com.huami.bluetooth.device.SyncGpsDataLock$lock$1$1$1
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    this.a.isLocked = false;
                    runnable.invoke();
                }
            }, lockTime);
            Unit unit = Unit.INSTANCE;
            this.timer = timer;
        }
    }

    public final void unLock() {
        this.isLocked = false;
        Timer timer = this.timer;
        if (timer != null) {
            timer.cancel();
        }
        this.timer = null;
    }
}
