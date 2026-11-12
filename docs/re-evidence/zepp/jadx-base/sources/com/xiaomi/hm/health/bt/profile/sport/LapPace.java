package com.xiaomi.hm.health.bt.profile.sport;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.utils.ByteUtilsKt;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\u0005\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/sport/LapPace;", "Ljava/io/Serializable;", "", "toString", "", "a", LogUtil.I, "getDistance", "()I", "distance", "b", "getPace", "pace", "", "data", "<init>", "([B)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class LapPace implements Serializable {
    public static final int DATA_LEN = 6;
    private static final int c = 2;
    private static final int d = 2;
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int distance;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int pace;

    public LapPace(@NotNull byte[] bArr) {
        if (bArr.length < 6) {
            this.distance = 0;
            this.pace = 0;
        } else {
            this.pace = ByteUtilsKt.toInt$default(bArr, 2, 0, 2, null);
            this.distance = ByteUtilsKt.toInt(bArr, 2, 2);
        }
    }

    public final int getDistance() {
        return this.distance;
    }

    public final int getPace() {
        return this.pace;
    }

    @NotNull
    public String toString() {
        return "LapPace(distance='" + this.distance + "')";
    }
}
