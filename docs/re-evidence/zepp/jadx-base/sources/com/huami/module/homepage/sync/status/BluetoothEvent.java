package com.huami.module.homepage.sync.status;

import com.google.firebase.perf.util.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0019\u0010\u0004\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u0004\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/huami/module/homepage/sync/status/BluetoothEvent;", "Lcom/huami/module/homepage/sync/status/SyncEvent;", "", "component1", Constants.ENABLE_DISABLE, "copy", "", "toString", "", "hashCode", "", "other", "equals", "a", "Z", "()Z", "<init>", "(Z)V", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BluetoothEvent extends SyncEvent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final boolean isEnabled;

    public BluetoothEvent(boolean z) {
        super(null);
        this.isEnabled = z;
    }

    public static /* synthetic */ BluetoothEvent copy$default(BluetoothEvent bluetoothEvent, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = bluetoothEvent.isEnabled;
        }
        return bluetoothEvent.copy(z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    @NotNull
    public final BluetoothEvent copy(boolean isEnabled) {
        return new BluetoothEvent(isEnabled);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BluetoothEvent) && this.isEnabled == ((BluetoothEvent) other).isEnabled;
    }

    public int hashCode() {
        boolean z = this.isEnabled;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    @NotNull
    public String toString() {
        return "BluetoothEvent(isEnabled=" + this.isEnabled + ")";
    }
}
