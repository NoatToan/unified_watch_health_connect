package com.xiaomi.fitness.aggregation.health.entity;

import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Entity(indices = {@Index(unique = true, value = {"startSec0TZ"}), @Index(unique = true, value = {"endSec0TZ"})}, tableName = "curse_record")
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\f\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/aggregation/health/entity/CurseRecordEntity;", "", "startSec0TZ", "", "endSec0TZ", "updateTime", "interval", "", "id", "<init>", "(JJJII)V", "getStartSec0TZ", "()J", "getEndSec0TZ", "setEndSec0TZ", "(J)V", "getUpdateTime", "setUpdateTime", "getInterval", "()I", "setInterval", "(I)V", "getId", "toString", "", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CurseRecordEntity {
    private long endSec0TZ;

    @PrimaryKey(autoGenerate = true)
    private final int id;
    private int interval;
    private final long startSec0TZ;
    private long updateTime;

    public CurseRecordEntity(long j, long j2, long j3, int i, int i2) {
        this.startSec0TZ = j;
        this.endSec0TZ = j2;
        this.updateTime = j3;
        this.interval = i;
        this.id = i2;
    }

    public final long getEndSec0TZ() {
        return this.endSec0TZ;
    }

    public final int getId() {
        return this.id;
    }

    public final int getInterval() {
        return this.interval;
    }

    public final long getStartSec0TZ() {
        return this.startSec0TZ;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    public final void setEndSec0TZ(long j) {
        this.endSec0TZ = j;
    }

    public final void setInterval(int i) {
        this.interval = i;
    }

    public final void setUpdateTime(long j) {
        this.updateTime = j;
    }

    @NotNull
    public String toString() {
        long j = 1000;
        String dateYYYYMMdd = TimeDateUtil.getDateYYYYMMdd(this.startSec0TZ * j);
        String dateYYYYMMdd2 = TimeDateUtil.getDateYYYYMMdd(this.endSec0TZ * j);
        int i = this.interval;
        int i2 = this.id;
        long j2 = this.updateTime;
        return "CurseRecordEntity(startSec0TZ=" + dateYYYYMMdd + " endSec0TZ=" + dateYYYYMMdd2 + ", interval=" + i + ", id=" + i2 + " , updateTime=" + (j2 == 0 ? 0 : TimeDateUtil.getDateYYYYMMDDHHmmLocalFormat$default(j2, false, 2, null)) + ")";
    }

    public /* synthetic */ CurseRecordEntity(long j, long j2, long j3, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, i, (i3 & 16) != 0 ? 0 : i2);
    }
}
