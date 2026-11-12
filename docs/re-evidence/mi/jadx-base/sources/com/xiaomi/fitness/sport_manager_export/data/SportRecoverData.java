package com.xiaomi.fitness.sport_manager_export.data;

import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import java.io.Serializable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/sport_manager_export/data/SportRecoverData;", "Ljava/io/Serializable;", "<init>", "()V", DailyRecordKey.sportType, "", "getSportType", "()I", "setSportType", "(I)V", "cacheTime", "", "getCacheTime", "()J", "setCacheTime", "(J)V", "duration", "getDuration", "setDuration", "sport-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportRecoverData implements Serializable {
    private long cacheTime;
    private long duration;
    private int sportType;

    public final long getCacheTime() {
        return this.cacheTime;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final int getSportType() {
        return this.sportType;
    }

    public final void setCacheTime(long j) {
        this.cacheTime = j;
    }

    public final void setDuration(long j) {
        this.duration = j;
    }

    public final void setSportType(int i) {
        this.sportType = i;
    }
}
