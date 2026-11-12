package com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.model;

import com.xiaomi.hm.health.bt.profile.gdsp.gps.LapInfo;
import com.xiaomi.hm.health.bt.utils.BytesDecoder;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/LapNode;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/BaseNode;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/LapInfo;", "b", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/LapInfo;", "getLapInfo", "()Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/LapInfo;", "lapInfo", "", "timeDiff", "<init>", "(JLcom/xiaomi/hm/health/bt/profile/gdsp/gps/LapInfo;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class LapNode extends BaseNode {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final LapInfo lapInfo;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/LapNode$Companion;", "", "", "byteArray", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/LapNode;", "parse", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final LapNode parse(@NotNull byte[] byteArray) {
            BytesDecoder bytesDecoder = new BytesDecoder(byteArray);
            long uInt16$default = BytesDecoder.readUInt16$default(bytesDecoder, 0, 1, null);
            int uInt16$default2 = BytesDecoder.readUInt16$default(bytesDecoder, 0, 1, null);
            int uInt8$default = BytesDecoder.readUInt8$default(bytesDecoder, 0, 1, null);
            int uInt8$default2 = BytesDecoder.readUInt8$default(bytesDecoder, 0, 1, null);
            int uInt16$default3 = BytesDecoder.readUInt16$default(bytesDecoder, 0, 1, null);
            int uInt16$default4 = BytesDecoder.readUInt16$default(bytesDecoder, 0, 1, null);
            int uInt16$default5 = BytesDecoder.readUInt16$default(bytesDecoder, 0, 1, null);
            BytesDecoder.readUInt32$default(bytesDecoder, 0L, 1, null);
            long uInt32$default = BytesDecoder.readUInt32$default(bytesDecoder, 0L, 1, null);
            int uInt16$default6 = BytesDecoder.readUInt16$default(bytesDecoder, 0, 1, null);
            int uInt16$default7 = BytesDecoder.readUInt16$default(bytesDecoder, 0, 1, null);
            int uInt16$default8 = BytesDecoder.readUInt16$default(bytesDecoder, 0, 1, null);
            int uInt16$default9 = BytesDecoder.readUInt16$default(bytesDecoder, 0, 1, null);
            int uInt16$default10 = BytesDecoder.readUInt16$default(bytesDecoder, 0, 1, null);
            int uInt16$default11 = BytesDecoder.readUInt16$default(bytesDecoder, 0, 1, null);
            int uInt16$default12 = BytesDecoder.readUInt16$default(bytesDecoder, 0, 1, null);
            int uInt16$default13 = BytesDecoder.readUInt16$default(bytesDecoder, 0, 1, null);
            int uInt16$default14 = BytesDecoder.readUInt16$default(bytesDecoder, 0, 1, null);
            int uInt16$default15 = BytesDecoder.readUInt16$default(bytesDecoder, 0, 1, null);
            int uInt16$default16 = BytesDecoder.readUInt16$default(bytesDecoder, 0, 1, null);
            int uInt16$default17 = BytesDecoder.readUInt16$default(bytesDecoder, 0, 1, null);
            int uInt8$default3 = BytesDecoder.readUInt8$default(bytesDecoder, 0, 1, null);
            int uInt16$default18 = BytesDecoder.readUInt16$default(bytesDecoder, 0, 1, null);
            float fIntBitsToFloat = Float.intBitsToFloat(BytesDecoder.readInt32$default(bytesDecoder, 0, 1, null));
            int uInt8 = bytesDecoder.readUInt8(-1);
            LapInfo lapInfo = new LapInfo(uInt8$default);
            lapInfo.setIndex(uInt16$default2);
            lapInfo.setAvgHr(uInt8$default2);
            lapInfo.setMaxPace(uInt16$default10 / 1000.0f);
            lapInfo.setLapCalorie(uInt16$default4);
            lapInfo.setLapDistance(uInt16$default5);
            lapInfo.setTimeUsage(uInt32$default / ((long) 1000));
            lapInfo.setLapSwolf(uInt16$default7);
            lapInfo.setAscend(uInt16$default11);
            lapInfo.setStairFloor(uInt16$default18);
            lapInfo.setFloorPerMinute(fIntBitsToFloat);
            lapInfo.setCount(uInt16$default17);
            lapInfo.setWeight(uInt16$default16);
            lapInfo.setUnit(uInt8$default3);
            lapInfo.setAvgPace(uInt16$default3 / 1000.0f);
            lapInfo.setStrokes(uInt16$default6 > 0 ? uInt16$default6 : uInt16$default14);
            lapInfo.setStrokeSpeed(uInt16$default8);
            lapInfo.setSkipCount(uInt16$default12);
            lapInfo.setSwimStyle(uInt16$default9);
            lapInfo.setTrainType(uInt8);
            lapInfo.setCadence(uInt16$default13 > 0 ? uInt16$default13 : uInt16$default15);
            return new LapNode(uInt16$default, lapInfo);
        }
    }

    public LapNode(long j, @NotNull LapInfo lapInfo) {
        super(j);
        this.lapInfo = lapInfo;
    }

    @NotNull
    public final LapInfo getLapInfo() {
        return this.lapInfo;
    }
}
