package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.xiaomi.hm.health.bt.profile.sport.coaching.CrossFitType;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\u000f\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0012\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/CrossFitInfo;", "Ljava/io/Serializable;", "", "toString", "Lcom/xiaomi/hm/health/bt/profile/sport/coaching/CrossFitType;", "a", "Lcom/xiaomi/hm/health/bt/profile/sport/coaching/CrossFitType;", "getType", "()Lcom/xiaomi/hm/health/bt/profile/sport/coaching/CrossFitType;", "type", "", "b", LogUtil.I, "getSegmentCount", "()I", "segmentCount", "c", "getScore", "score", "", "data", "<init>", "([B)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class CrossFitInfo implements Serializable {
    public static final int DATA_LEN = 4;
    private static final int d = 2;
    private static final int e = 2;
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final CrossFitType type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int segmentCount;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int score;

    public CrossFitInfo(@NotNull byte[] bArr) {
        if (bArr.length < 4) {
            this.type = CrossFitType.Unknown.INSTANCE;
            this.segmentCount = 0;
            this.score = -1;
        } else {
            this.type = CrossFitType.INSTANCE.valueOf(ByteUtilsKt.toInt$default(bArr, 1, 0, 2, null));
            this.segmentCount = ByteUtilsKt.toInt(bArr, 1, 1);
            this.score = CoachingInfo.INSTANCE.getValidScore$bluetooth_release(ByteUtilsKt.toInt$default(new byte[]{bArr[2], (byte) (bArr[3] & 15)}, 2, 0, 2, null));
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
