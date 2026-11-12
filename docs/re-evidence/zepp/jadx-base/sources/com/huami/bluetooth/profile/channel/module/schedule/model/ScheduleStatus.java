package com.huami.bluetooth.profile.channel.module.schedule.model;

import defpackage.b;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB!\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J'\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0004HÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\n\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u000b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016¨\u0006 "}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleStatus;", "Ljava/io/Serializable;", "", "toString", "", "component1", "", "component2", "component3", "id", "status", "updateVersion", "copy", "", "hashCode", "", "other", "", "equals", "a", "J", "getId", "()J", "b", "B", "getStatus", "()B", "c", "getUpdateVersion", "<init>", "(JBJ)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ScheduleStatus implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final byte status;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final long updateVersion;

    public ScheduleStatus(long j, byte b, long j2) {
        this.id = j;
        this.status = b;
        this.updateVersion = j2;
    }

    public static /* synthetic */ ScheduleStatus copy$default(ScheduleStatus scheduleStatus, long j, byte b, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = scheduleStatus.id;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            b = scheduleStatus.status;
        }
        byte b2 = b;
        if ((i & 4) != 0) {
            j2 = scheduleStatus.updateVersion;
        }
        return scheduleStatus.copy(j3, b2, j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final byte getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getUpdateVersion() {
        return this.updateVersion;
    }

    @NotNull
    public final ScheduleStatus copy(long id, byte status, long updateVersion) {
        return new ScheduleStatus(id, status, updateVersion);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScheduleStatus)) {
            return false;
        }
        ScheduleStatus scheduleStatus = (ScheduleStatus) other;
        return this.id == scheduleStatus.id && this.status == scheduleStatus.status && this.updateVersion == scheduleStatus.updateVersion;
    }

    public final long getId() {
        return this.id;
    }

    public final byte getStatus() {
        return this.status;
    }

    public final long getUpdateVersion() {
        return this.updateVersion;
    }

    public int hashCode() {
        return (((b.a(this.id) * 31) + this.status) * 31) + b.a(this.updateVersion);
    }

    @NotNull
    public String toString() {
        return "ScheduleStatus{id=" + this.id + ", status=" + ((int) this.status) + ", updateVersion=" + this.updateVersion + '}';
    }

    public /* synthetic */ ScheduleStatus(long j, byte b, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, b, (i & 4) != 0 ? 0L : j2);
    }
}
