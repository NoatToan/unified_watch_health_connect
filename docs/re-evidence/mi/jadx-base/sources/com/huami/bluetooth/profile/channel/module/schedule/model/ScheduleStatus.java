package com.huami.bluetooth.profile.channel.module.schedule.model;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.onetrack.api.c;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB!\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J'\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0004HÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015¨\u0006\u001e"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleStatus;", "Ljava/io/Serializable;", "", "toString", "", "component1", "", "component2", "component3", "id", "status", "updateVersion", "copy", "", "hashCode", "", "other", "", "equals", "J", "getId", "()J", c.f13755a, "getStatus", "()B", "getUpdateVersion", "<init>", "(JBJ)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class ScheduleStatus implements Serializable {
    private static final long serialVersionUID = 1;
    private final long id;
    private final byte status;
    private final long updateVersion;

    public ScheduleStatus(long j, byte b2, long j2) {
        this.id = j;
        this.status = b2;
        this.updateVersion = j2;
    }

    public static /* synthetic */ ScheduleStatus copy$default(ScheduleStatus scheduleStatus, long j, byte b2, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = scheduleStatus.id;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            b2 = scheduleStatus.status;
        }
        byte b3 = b2;
        if ((i & 4) != 0) {
            j2 = scheduleStatus.updateVersion;
        }
        return scheduleStatus.copy(j3, b3, j2);
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
        return (((Long.hashCode(this.id) * 31) + Byte.hashCode(this.status)) * 31) + Long.hashCode(this.updateVersion);
    }

    @NotNull
    public String toString() {
        return "ScheduleStatus{id=" + this.id + ", status=" + ((int) this.status) + ", updateVersion=" + this.updateVersion + AbstractJsonLexerKt.END_OBJ;
    }

    public /* synthetic */ ScheduleStatus(long j, byte b2, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, b2, (i & 4) != 0 ? 0L : j2);
    }
}
