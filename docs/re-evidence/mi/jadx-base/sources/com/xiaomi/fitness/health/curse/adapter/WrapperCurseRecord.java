package com.xiaomi.fitness.health.curse.adapter;

import com.xiaomi.fitness.common.recycer.expandable.ExpandableBaseDataItem;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0015\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001a\u0010\t\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/health/curse/adapter/WrapperCurseRecord;", "Lcom/xiaomi/fitness/common/recycer/expandable/ExpandableBaseDataItem;", "startMills", "", "endMills", "updateTime", "interval", "", "inDays", "id", "<init>", "(JJJIII)V", "getStartMills", "()J", "setStartMills", "(J)V", "getEndMills", "setEndMills", "getUpdateTime", "setUpdateTime", "getInterval", "()I", "setInterval", "(I)V", "getInDays", "setInDays", "getId", "setId", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WrapperCurseRecord extends ExpandableBaseDataItem {
    private long endMills;
    private int id;
    private int inDays;
    private int interval;
    private long startMills;
    private long updateTime;

    public /* synthetic */ WrapperCurseRecord(long j, long j2, long j3, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, i, i2, (i4 & 32) != 0 ? 0 : i3);
    }

    public final long getEndMills() {
        return this.endMills;
    }

    public final int getId() {
        return this.id;
    }

    public final int getInDays() {
        return this.inDays;
    }

    public final int getInterval() {
        return this.interval;
    }

    public final long getStartMills() {
        return this.startMills;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    public final void setEndMills(long j) {
        this.endMills = j;
    }

    public final void setId(int i) {
        this.id = i;
    }

    public final void setInDays(int i) {
        this.inDays = i;
    }

    public final void setInterval(int i) {
        this.interval = i;
    }

    public final void setStartMills(long j) {
        this.startMills = j;
    }

    public final void setUpdateTime(long j) {
        this.updateTime = j;
    }

    public WrapperCurseRecord(long j, long j2, long j3, int i, int i2, int i3) {
        super(j, 0L, 2, null);
        this.startMills = j;
        this.endMills = j2;
        this.updateTime = j3;
        this.interval = i;
        this.inDays = i2;
        this.id = i3;
    }
}
