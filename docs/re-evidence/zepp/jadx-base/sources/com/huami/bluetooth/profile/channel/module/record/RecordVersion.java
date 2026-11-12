package com.huami.bluetooth.profile.channel.module.record;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0004\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/record/RecordVersion;", "", "", "component1", "version", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "B", "getVersion", "()B", "<init>", "(B)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class RecordVersion {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final byte version;

    public RecordVersion(byte b) {
        this.version = b;
    }

    public static /* synthetic */ RecordVersion copy$default(RecordVersion recordVersion, byte b, int i, Object obj) {
        if ((i & 1) != 0) {
            b = recordVersion.version;
        }
        return recordVersion.copy(b);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final byte getVersion() {
        return this.version;
    }

    @NotNull
    public final RecordVersion copy(byte version) {
        return new RecordVersion(version);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RecordVersion) && this.version == ((RecordVersion) other).version;
    }

    public final byte getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.version;
    }

    @NotNull
    public String toString() {
        return "RecordVersion(version=" + ((int) this.version) + ')';
    }
}
