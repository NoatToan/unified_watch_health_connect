package com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.model;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import com.xiaomi.hm.health.bt.utils.BytesDecoder;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u0000 $2\u00020\u0001:\u0001$BY\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0019\u0010\u0010\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u0019\u0010\u0013\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u0019\u0010\u0016\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006R\u0019\u0010\u0019\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R\u0019\u0010\u001c\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0004\u001a\u0004\b\u001b\u0010\u0006R\u0019\u0010\u001f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001e\u0010\u0006¨\u0006%"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/StrengthGroupNode;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/BaseNode;", "", "b", LogUtil.I, "getIndex", "()I", "index", "c", "getAvgHr", "avgHr", GoogleApiAvailabilityLight.a, "getCal", "cal", "e", "getTimeUsage", "timeUsage", "f", "getType", "type", "g", "getWeight", "weight", "h", "getTimes", "times", "i", "getUnit", "unit", z.j, "getLapType", "lapType", "", "timeDiff", "<init>", "(JIIIIIIIII)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class StrengthGroupNode extends BaseNode {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int index;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int avgHr;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int cal;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int timeUsage;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int type;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int weight;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int times;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final int unit;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final int lapType;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/StrengthGroupNode$Companion;", "", "", "byteArray", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/StrengthGroupNode;", "parse", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final StrengthGroupNode parse(@NotNull byte[] byteArray) {
            BytesDecoder bytesDecoder = new BytesDecoder(byteArray);
            long uInt16$default = BytesDecoder.readUInt16$default(bytesDecoder, 0, 1, null);
            int uInt16$default2 = BytesDecoder.readUInt16$default(bytesDecoder, 0, 1, null);
            int uInt8$default = BytesDecoder.readUInt8$default(bytesDecoder, 0, 1, null);
            int uInt16$default3 = BytesDecoder.readUInt16$default(bytesDecoder, 0, 1, null);
            int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(BytesDecoder.readUInt32$default(bytesDecoder, 0L, 1, null));
            int uInt16$default4 = BytesDecoder.readUInt16$default(bytesDecoder, 0, 1, null);
            int uInt16$default5 = BytesDecoder.readUInt16$default(bytesDecoder, 0, 1, null);
            int uInt16$default6 = BytesDecoder.readUInt16$default(bytesDecoder, 0, 1, null);
            int uInt8$default2 = BytesDecoder.readUInt8$default(bytesDecoder, 0, 1, null);
            BytesDecoder.readUInt8$default(bytesDecoder, 0, 1, null);
            BytesDecoder.readUInt16$default(bytesDecoder, 0, 1, null);
            BytesDecoder.readUInt8$default(bytesDecoder, 0, 1, null);
            return new StrengthGroupNode(uInt16$default, uInt16$default2, uInt8$default, uInt16$default3, seconds, uInt16$default4, uInt16$default5, uInt16$default6, uInt8$default2, uInt16$default4);
        }
    }

    public /* synthetic */ StrengthGroupNode(long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i, i2, i3, i4, i5, i6, i7, i8, (i10 & 512) != 0 ? 0 : i9);
    }

    public final int getAvgHr() {
        return this.avgHr;
    }

    public final int getCal() {
        return this.cal;
    }

    public final int getIndex() {
        return this.index;
    }

    public final int getLapType() {
        return this.lapType;
    }

    public final int getTimeUsage() {
        return this.timeUsage;
    }

    public final int getTimes() {
        return this.times;
    }

    public final int getType() {
        return this.type;
    }

    public final int getUnit() {
        return this.unit;
    }

    public final int getWeight() {
        return this.weight;
    }

    public StrengthGroupNode(long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        super(j);
        this.index = i;
        this.avgHr = i2;
        this.cal = i3;
        this.timeUsage = i4;
        this.type = i5;
        this.weight = i6;
        this.times = i7;
        this.unit = i8;
        this.lapType = i9;
    }
}
