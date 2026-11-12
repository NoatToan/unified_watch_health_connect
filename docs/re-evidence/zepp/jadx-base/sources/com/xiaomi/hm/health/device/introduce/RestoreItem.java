package com.xiaomi.hm.health.device.introduce;

import androidx.annotation.MainThread;
import androidx.annotation.WorkerThread;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H'J\b\u0010\u0005\u001a\u00020\u0004H'J\b\u0010\u0006\u001a\u00020\u0002H'J\b\u0010\u0007\u001a\u00020\u0002H'J\b\u0010\t\u001a\u00020\bH\u0016R\u0016\u0010\f\u001a\u00020\b8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\b8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\b8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bR\u001c\u0010\u0005\u001a\u00020\u00048&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/hm/health/device/introduce/RestoreItem;", "", "", "beforeRestore", "", "restore", "afterRestore", "notRestore", "", "toString", "getRestoreName", "()Ljava/lang/String;", "restoreName", "getRestoreTips", "restoreTips", "getEnableRestoreTips", "enableRestoreTips", "getRestore", "()Z", "setRestore", "(Z)V", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public abstract class RestoreItem {
    @MainThread
    public abstract void afterRestore();

    @MainThread
    public abstract void beforeRestore();

    @NotNull
    public String getEnableRestoreTips() {
        return getRestoreTips();
    }

    public abstract boolean getRestore();

    @NotNull
    public abstract String getRestoreName();

    @NotNull
    public abstract String getRestoreTips();

    @WorkerThread
    public abstract void notRestore();

    @WorkerThread
    public abstract boolean restore();

    public abstract void setRestore(boolean z);

    @NotNull
    public String toString() {
        return "RestoreItem[restoreName: " + getRestoreName() + ", restore: " + getRestore() + "]";
    }
}
