package com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.model;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bt.utils.BytesDecoder;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B/\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0010\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0019\u0010\u0013\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/GolfRtNode;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/BaseNode;", "", "b", LogUtil.I, "getAngle", "()I", "angle", "", "c", "F", "getBeat", "()F", "beat", GoogleApiAvailabilityLight.a, "getUpTime", "upTime", "e", "getDownTime", "downTime", "", "timeDiff", "<init>", "(JIFFF)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class GolfRtNode extends BaseNode {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int angle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float beat;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final float upTime;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final float downTime;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/GolfRtNode$Companion;", "", "", "byteArray", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/GolfRtNode;", "parse", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final GolfRtNode parse(@NotNull byte[] byteArray) {
            BytesDecoder bytesDecoder = new BytesDecoder(byteArray);
            return new GolfRtNode(BytesDecoder.readUInt16$default(bytesDecoder, 0, 1, null), BytesDecoder.readSInt16$default(bytesDecoder, 0, 1, null), Float.intBitsToFloat(BytesDecoder.readInt32$default(bytesDecoder, 0, 1, null)), Float.intBitsToFloat(BytesDecoder.readInt32$default(bytesDecoder, 0, 1, null)), Float.intBitsToFloat(BytesDecoder.readInt32$default(bytesDecoder, 0, 1, null)));
        }
    }

    public GolfRtNode(long j, int i, float f, float f2, float f3) {
        super(j);
        this.angle = i;
        this.beat = f;
        this.upTime = f2;
        this.downTime = f3;
    }

    public final int getAngle() {
        return this.angle;
    }

    public final float getBeat() {
        return this.beat;
    }

    public final float getDownTime() {
        return this.downTime;
    }

    public final float getUpTime() {
        return this.upTime;
    }
}
