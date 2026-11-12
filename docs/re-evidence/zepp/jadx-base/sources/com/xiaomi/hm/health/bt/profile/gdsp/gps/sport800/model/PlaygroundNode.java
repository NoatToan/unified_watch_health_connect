package com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.model;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bt.utils.BytesDecoder;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB/\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\u0006\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0010\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0019\u0010\u0013\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fR\u0019\u0010\u0019\u001a\u00020\u00148\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/PlaygroundNode;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/BaseNode;", "", "b", "J", "getTime", "()J", "time", "", "c", "F", "getGpsDistance", "()F", "gpsDistance", GoogleApiAvailabilityLight.a, "getLoopDistance", "loopDistance", "e", "getToleranceDistance", "toleranceDistance", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/PlaygroundTemplatePara;", "f", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/PlaygroundTemplatePara;", "getPlaygroundTemplatePara", "()Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/PlaygroundTemplatePara;", "playgroundTemplatePara", "<init>", "(JFFFLcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/PlaygroundTemplatePara;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class PlaygroundNode extends BaseNode {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long time;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float gpsDistance;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final float loopDistance;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final float toleranceDistance;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final PlaygroundTemplatePara playgroundTemplatePara;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/PlaygroundNode$Companion;", "", "", "byteArray", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/PlaygroundNode;", "parse", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final PlaygroundNode parse(@NotNull byte[] byteArray) {
            BytesDecoder bytesDecoder = new BytesDecoder(byteArray);
            return new PlaygroundNode(BytesDecoder.readUInt16$default(bytesDecoder, 0, 1, null), BytesDecoder.readFloat$default(bytesDecoder, 0.0f, 1, null), BytesDecoder.readFloat$default(bytesDecoder, 0.0f, 1, null), BytesDecoder.readFloat$default(bytesDecoder, 0.0f, 1, null), new PlaygroundTemplatePara(BytesDecoder.readFloat$default(bytesDecoder, 0.0f, 1, null), BytesDecoder.readFloat$default(bytesDecoder, 0.0f, 1, null), new GPSPointCoorInt32(BytesDecoder.readInt32$default(bytesDecoder, 0, 1, null), BytesDecoder.readInt32$default(bytesDecoder, 0, 1, null)), CollectionsKt__CollectionsKt.listOf((Object[]) new GPSPointCoorInt32[]{new GPSPointCoorInt32(BytesDecoder.readInt32$default(bytesDecoder, 0, 1, null), BytesDecoder.readInt32$default(bytesDecoder, 0, 1, null)), new GPSPointCoorInt32(BytesDecoder.readInt32$default(bytesDecoder, 0, 1, null), BytesDecoder.readInt32$default(bytesDecoder, 0, 1, null)), new GPSPointCoorInt32(BytesDecoder.readInt32$default(bytesDecoder, 0, 1, null), BytesDecoder.readInt32$default(bytesDecoder, 0, 1, null)), new GPSPointCoorInt32(BytesDecoder.readInt32$default(bytesDecoder, 0, 1, null), BytesDecoder.readInt32$default(bytesDecoder, 0, 1, null))}), new GPSPointCoorInt32(BytesDecoder.readInt32$default(bytesDecoder, 0, 1, null), BytesDecoder.readInt32$default(bytesDecoder, 0, 1, null)), new GPSPointCoorInt32(BytesDecoder.readInt32$default(bytesDecoder, 0, 1, null), BytesDecoder.readInt32$default(bytesDecoder, 0, 1, null)), BytesDecoder.readSInt16$default(bytesDecoder, 0, 1, null), BytesDecoder.readFloat$default(bytesDecoder, 0.0f, 1, null)));
        }
    }

    public PlaygroundNode(long j, float f, float f2, float f3, @NotNull PlaygroundTemplatePara playgroundTemplatePara) {
        super(j);
        this.time = j;
        this.gpsDistance = f;
        this.loopDistance = f2;
        this.toleranceDistance = f3;
        this.playgroundTemplatePara = playgroundTemplatePara;
    }

    public final float getGpsDistance() {
        return this.gpsDistance;
    }

    public final float getLoopDistance() {
        return this.loopDistance;
    }

    @NotNull
    public final PlaygroundTemplatePara getPlaygroundTemplatePara() {
        return this.playgroundTemplatePara;
    }

    public final long getTime() {
        return this.time;
    }

    public final float getToleranceDistance() {
        return this.toleranceDistance;
    }
}
