package com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.model;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bt.utils.BytesDecoder;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B/\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0019\u0010\u0010\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/GolfGroupNode;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/BaseNode;", "", "b", LogUtil.I, "getIndex", "()I", "index", "c", "getCount", "count", GoogleApiAvailabilityLight.a, "getTimeUsage", "timeUsage", "e", "getAvgHr", "avgHr", "", "timeDiff", "<init>", "(JIIII)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class GolfGroupNode extends BaseNode {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int index;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int count;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int timeUsage;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int avgHr;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/GolfGroupNode$Companion;", "", "", "byteArray", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/GolfGroupNode;", "parse", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final GolfGroupNode parse(@NotNull byte[] byteArray) {
            BytesDecoder bytesDecoder = new BytesDecoder(byteArray);
            long uInt16$default = BytesDecoder.readUInt16$default(bytesDecoder, 0, 1, null);
            int uInt16$default2 = BytesDecoder.readUInt16$default(bytesDecoder, 0, 1, null);
            int uInt16$default3 = BytesDecoder.readUInt16$default(bytesDecoder, 0, 1, null);
            int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(BytesDecoder.readUInt32$default(bytesDecoder, 0L, 1, null));
            int uInt8$default = BytesDecoder.readUInt8$default(bytesDecoder, 0, 1, null);
            BytesDecoder.readInt32$default(bytesDecoder, 0, 1, null);
            return new GolfGroupNode(uInt16$default, uInt16$default2, uInt16$default3, seconds, uInt8$default);
        }
    }

    public GolfGroupNode(long j, int i, int i2, int i3, int i4) {
        super(j);
        this.index = i;
        this.count = i2;
        this.timeUsage = i3;
        this.avgHr = i4;
    }

    public final int getAvgHr() {
        return this.avgHr;
    }

    public final int getCount() {
        return this.count;
    }

    public final int getIndex() {
        return this.index;
    }

    public final int getTimeUsage() {
        return this.timeUsage;
    }
}
