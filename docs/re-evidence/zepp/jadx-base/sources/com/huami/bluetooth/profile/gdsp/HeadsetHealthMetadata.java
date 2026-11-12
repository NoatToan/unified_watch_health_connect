package com.huami.bluetooth.profile.gdsp;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.UserDataStore;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\u000b\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/huami/bluetooth/profile/gdsp/HeadsetHealthMetadata;", "", "", "component1", "", "component2", UserDataStore.DATE_OF_BIRTH, "time", "copy", "", "toString", "hashCode", "other", "", "equals", "a", "B", "getDb", "()B", "b", LogUtil.I, "getTime", "()I", "<init>", "(BI)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class HeadsetHealthMetadata {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final byte db;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int time;

    public HeadsetHealthMetadata(byte b, int i) {
        this.db = b;
        this.time = i;
    }

    public static /* synthetic */ HeadsetHealthMetadata copy$default(HeadsetHealthMetadata headsetHealthMetadata, byte b, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            b = headsetHealthMetadata.db;
        }
        if ((i2 & 2) != 0) {
            i = headsetHealthMetadata.time;
        }
        return headsetHealthMetadata.copy(b, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final byte getDb() {
        return this.db;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTime() {
        return this.time;
    }

    @NotNull
    public final HeadsetHealthMetadata copy(byte db, int time) {
        return new HeadsetHealthMetadata(db, time);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeadsetHealthMetadata)) {
            return false;
        }
        HeadsetHealthMetadata headsetHealthMetadata = (HeadsetHealthMetadata) other;
        return this.db == headsetHealthMetadata.db && this.time == headsetHealthMetadata.time;
    }

    public final byte getDb() {
        return this.db;
    }

    public final int getTime() {
        return this.time;
    }

    public int hashCode() {
        return (this.db * 31) + this.time;
    }

    @NotNull
    public String toString() {
        return "HeadsetHealthMetadata(db=" + ((int) this.db) + ", time=" + this.time + ')';
    }
}
