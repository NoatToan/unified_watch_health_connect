package com.huami.bluetooth.profile.channel.module.record;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b!\u0010\"J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J1\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u0007HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\n\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u000b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0019\u0010\f\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/record/RecordFile;", "", "", "component1", "", "component2", "component3", "", "component4", "name", "size", "duration", ParamKey.createTime, "copy", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "b", LogUtil.I, "getSize", "()I", "c", "getDuration", GoogleApiAvailabilityLight.a, "J", "getCreateTime", "()J", "<init>", "(Ljava/lang/String;IIJ)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class RecordFile {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int size;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int duration;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final long createTime;

    public RecordFile(@NotNull String str, int i, int i2, long j) {
        this.name = str;
        this.size = i;
        this.duration = i2;
        this.createTime = j;
    }

    public static /* synthetic */ RecordFile copy$default(RecordFile recordFile, String str, int i, int i2, long j, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = recordFile.name;
        }
        if ((i3 & 2) != 0) {
            i = recordFile.size;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = recordFile.duration;
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            j = recordFile.createTime;
        }
        return recordFile.copy(str, i4, i5, j);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    @NotNull
    public final RecordFile copy(@NotNull String name, int size, int duration, long createTime) {
        return new RecordFile(name, size, duration, createTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecordFile)) {
            return false;
        }
        RecordFile recordFile = (RecordFile) other;
        return Intrinsics.areEqual(this.name, recordFile.name) && this.size == recordFile.size && this.duration == recordFile.duration && this.createTime == recordFile.createTime;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final int getDuration() {
        return this.duration;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getSize() {
        return this.size;
    }

    public int hashCode() {
        return (((((this.name.hashCode() * 31) + this.size) * 31) + this.duration) * 31) + b.a(this.createTime);
    }

    @NotNull
    public String toString() {
        return "RecordFile(name=" + this.name + ", size=" + this.size + ", duration=" + this.duration + ", createTime=" + this.createTime + ')';
    }
}
