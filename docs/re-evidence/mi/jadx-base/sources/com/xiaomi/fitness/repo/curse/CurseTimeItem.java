package com.xiaomi.fitness.repo.curse;

import com.xiaomi.fitness.common.utils.TimeDateUtil;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/repo/curse/CurseTimeItem;", "Ljava/io/Serializable;", "time", "", "status", "", "updateTime", "isDelete", "", "isUpload", "<init>", "(JIJZZ)V", "getTime", "()J", "setTime", "(J)V", "getStatus", "()I", "setStatus", "(I)V", "getUpdateTime", "setUpdateTime", "()Z", "setDelete", "(Z)V", "toString", "", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CurseTimeItem implements Serializable {
    private boolean isDelete;
    private final boolean isUpload;
    private int status;
    private long time;
    private long updateTime;

    public CurseTimeItem(long j, int i, long j2, boolean z, boolean z2) {
        this.time = j;
        this.status = i;
        this.updateTime = j2;
        this.isDelete = z;
        this.isUpload = z2;
    }

    public final int getStatus() {
        return this.status;
    }

    public final long getTime() {
        return this.time;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    /* JADX INFO: renamed from: isDelete, reason: from getter */
    public final boolean getIsDelete() {
        return this.isDelete;
    }

    /* JADX INFO: renamed from: isUpload, reason: from getter */
    public final boolean getIsUpload() {
        return this.isUpload;
    }

    public final void setDelete(boolean z) {
        this.isDelete = z;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    public final void setUpdateTime(long j) {
        this.updateTime = j;
    }

    @NotNull
    public String toString() {
        long j = this.time;
        return "CurseTimeItem(time=" + j + ", formatTime=" + TimeDateUtil.getDateYYYYMMdd(((long) 1000) * j) + ", status=" + this.status + ", isDelete=" + this.isDelete + ", isUpload=" + this.isUpload + ", updateTime=" + this.updateTime + ")";
    }
}
