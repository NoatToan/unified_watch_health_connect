package com.huami.respiratoryrate.core.data.local.entity;

import androidx.annotation.Keep;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.respiratoryrate.core.data.remote.entity.RespRateEventItem;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Entity(tableName = RespRateEventItem.EventType)
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0001$B9\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010#J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J;\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0010\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\n\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u000b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0019\u0010\r\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\"\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010!¨\u0006%"}, d2 = {"Lcom/huami/respiratoryrate/core/data/local/entity/RespRateEntity;", "", "", "component1", "", "component2", "component3", "", "component4", "component5", "respRateTime", "respRate", "offset", "userId", "sync", "copy", "toString", "hashCode", "other", "", "equals", "J", "getRespRateTime", "()J", LogUtil.I, "getRespRate", "()I", "getOffset", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "getSync", "setSync", "(I)V", "<init>", "(JIILjava/lang/String;I)V", "Companion", "core_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class RespRateEntity {
    public static final int SYNCED = 1;
    private final int offset;
    private final int respRate;

    @PrimaryKey
    private final long respRateTime;
    private int sync;

    @NotNull
    private final String userId;

    public RespRateEntity() {
        this(0L, 0, 0, null, 0, 31, null);
    }

    public RespRateEntity(long j, int i, int i2, @NotNull String str, int i3) {
        this.respRateTime = j;
        this.respRate = i;
        this.offset = i2;
        this.userId = str;
        this.sync = i3;
    }

    public static /* synthetic */ RespRateEntity copy$default(RespRateEntity respRateEntity, long j, int i, int i2, String str, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j = respRateEntity.respRateTime;
        }
        long j2 = j;
        if ((i4 & 2) != 0) {
            i = respRateEntity.respRate;
        }
        int i5 = i;
        if ((i4 & 4) != 0) {
            i2 = respRateEntity.offset;
        }
        int i6 = i2;
        if ((i4 & 8) != 0) {
            str = respRateEntity.userId;
        }
        String str2 = str;
        if ((i4 & 16) != 0) {
            i3 = respRateEntity.sync;
        }
        return respRateEntity.copy(j2, i5, i6, str2, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getRespRateTime() {
        return this.respRateTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getRespRate() {
        return this.respRate;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getOffset() {
        return this.offset;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getSync() {
        return this.sync;
    }

    @NotNull
    public final RespRateEntity copy(long respRateTime, int respRate, int offset, @NotNull String userId, int sync) {
        return new RespRateEntity(respRateTime, respRate, offset, userId, sync);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RespRateEntity)) {
            return false;
        }
        RespRateEntity respRateEntity = (RespRateEntity) other;
        return this.respRateTime == respRateEntity.respRateTime && this.respRate == respRateEntity.respRate && this.offset == respRateEntity.offset && Intrinsics.areEqual(this.userId, respRateEntity.userId) && this.sync == respRateEntity.sync;
    }

    public final int getOffset() {
        return this.offset;
    }

    public final int getRespRate() {
        return this.respRate;
    }

    public final long getRespRateTime() {
        return this.respRateTime;
    }

    public final int getSync() {
        return this.sync;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((((((b.a(this.respRateTime) * 31) + this.respRate) * 31) + this.offset) * 31) + this.userId.hashCode()) * 31) + this.sync;
    }

    public final void setSync(int i) {
        this.sync = i;
    }

    @NotNull
    public String toString() {
        return "RespRateEntity(respRateTime=" + this.respRateTime + ", respRate=" + this.respRate + ", offset=" + this.offset + ", userId=" + this.userId + ", sync=" + this.sync + ')';
    }

    public /* synthetic */ RespRateEntity(long j, int i, int i2, String str, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? -1L : j, (i4 & 2) != 0 ? 0 : i, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? "" : str, (i4 & 16) != 0 ? 0 : i3);
    }
}
