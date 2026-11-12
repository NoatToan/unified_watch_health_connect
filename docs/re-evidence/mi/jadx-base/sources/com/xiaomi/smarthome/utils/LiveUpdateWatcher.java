package com.xiaomi.smarthome.utils;

import androidx.health.connect.client.records.CervicalMucusRecord;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u001f\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\r\u001a\u00020\u000bH\u0014¢\u0006\u0002\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\u00102\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0012H\u0016R\u001e\u0010\u0004\u001a\u0004\u0018\u00018\u0000X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/smarthome/utils/LiveUpdateWatcher;", "T", "Lcom/xiaomi/smarthome/utils/UpdateWatcher;", "()V", "mCache", "getMCache", "()Ljava/lang/Object;", "setMCache", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "dispatchUpdate", "", DeviceTagInterface.CUSTOM_TAG_TYPE, CervicalMucusRecord.Appearance.CLEAR, "(Ljava/lang/Object;Z)Z", "registUpdateListener", "", "watcher", "Lcom/xiaomi/smarthome/utils/Watcher;", "base-utils_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class LiveUpdateWatcher<T> extends UpdateWatcher<T> {

    @Nullable
    private T mCache;

    @Override // com.xiaomi.smarthome.utils.UpdateWatcher
    public boolean dispatchUpdate(@Nullable T t, boolean clear) {
        if (Intrinsics.areEqual(t, this.mCache)) {
            return false;
        }
        this.mCache = t;
        return super.dispatchUpdate(t, clear);
    }

    @Nullable
    public final T getMCache() {
        return this.mCache;
    }

    @Override // com.xiaomi.smarthome.utils.UpdateWatcher
    public void registUpdateListener(@NotNull Watcher<T> watcher) {
        Intrinsics.checkNotNullParameter(watcher, "watcher");
        T t = this.mCache;
        StringBuilder sb = new StringBuilder();
        sb.append("registUpdateListener ");
        sb.append(t);
        sb.append(' ');
        sb.append(watcher);
        if (t != null) {
            watcher.accept(t);
        } else {
            super.registUpdateListener(watcher);
        }
    }

    public final void setMCache(@Nullable T t) {
        this.mCache = t;
    }
}
