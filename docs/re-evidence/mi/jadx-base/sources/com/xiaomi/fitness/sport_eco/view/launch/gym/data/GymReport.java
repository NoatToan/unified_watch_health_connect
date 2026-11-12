package com.xiaomi.fitness.sport_eco.view.launch.gym.data;

import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/launch/gym/data/GymReport;", "Ljava/io/Serializable;", "<init>", "()V", "ids", "", "getIds", "()[B", "setIds", "([B)V", "distance", "", "getDistance", "()I", "setDistance", "(I)V", DailyRecordKey.sportType, "getSportType", "setSportType", "duration", "getDuration", "setDuration", "startTime", "", "getStartTime", "()J", "setStartTime", "(J)V", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GymReport implements Serializable {
    private int distance;
    private int duration;
    public byte[] ids;
    private int sportType;
    private long startTime;

    public final int getDistance() {
        return this.distance;
    }

    public final int getDuration() {
        return this.duration;
    }

    @NotNull
    public final byte[] getIds() {
        byte[] bArr = this.ids;
        if (bArr != null) {
            return bArr;
        }
        Intrinsics.throwUninitializedPropertyAccessException("ids");
        return null;
    }

    public final int getSportType() {
        return this.sportType;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final void setDistance(int i) {
        this.distance = i;
    }

    public final void setDuration(int i) {
        this.duration = i;
    }

    public final void setIds(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<set-?>");
        this.ids = bArr;
    }

    public final void setSportType(int i) {
        this.sportType = i;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }
}
