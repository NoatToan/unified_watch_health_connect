package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import defpackage.CrossFitType;
import defpackage.c3;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0005\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/CrossFitInfo;", "Ljava/io/Serializable;", "", "toString", "", "segmentCount", "I", "getSegmentCount", "()I", "score", "getScore", "Lq5;", "type", "Lq5;", "getType", "()Lq5;", "", "data", "<init>", "([B)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class CrossFitInfo implements Serializable {
    public static final int DATA_LEN = 4;
    private static final int DATA_SCORE_LEN = 2;
    private static final int SCORE_START_INDEX = 2;
    private static final long serialVersionUID = 1;
    private final int score;
    private final int segmentCount;

    @NotNull
    private final CrossFitType type;

    public CrossFitInfo(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (data.length < 4) {
            this.type = CrossFitType.e.d;
            this.segmentCount = 0;
            this.score = -1;
        } else {
            this.type = CrossFitType.c.a(c3.a(data, 1, 0, 2, null));
            this.segmentCount = c3.a(data, 1, 1);
            this.score = CoachingInfo.INSTANCE.getValidScore$bluetooth_release(c3.a(new byte[]{data[2], (byte) (data[3] & 15)}, 2, 0, 2, null));
        }
    }

    public final int getScore() {
        return this.score;
    }

    public final int getSegmentCount() {
        return this.segmentCount;
    }

    @NotNull
    public final CrossFitType getType() {
        return this.type;
    }

    @NotNull
    public String toString() {
        return "CrossFitInfo(type='" + this.type + "', score='" + this.score + "', segmentCount='" + this.segmentCount + "')";
    }
}
