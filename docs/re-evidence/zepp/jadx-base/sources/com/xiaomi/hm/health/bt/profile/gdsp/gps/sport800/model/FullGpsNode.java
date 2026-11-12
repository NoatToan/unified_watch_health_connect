package com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.model;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.mifit.sportlib.gpx.data.GPXBasePoint;
import com.xiaomi.hm.health.bt.utils.BytesDecoder;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B'\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/FullGpsNode;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/BaseNode;", "", "b", LogUtil.I, "getLng", "()I", "lng", "c", "getLat", GPXBasePoint.XML.ATTR_LAT, GoogleApiAvailabilityLight.a, "getType", "type", "", "timeDiff", "<init>", "(JIII)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class FullGpsNode extends BaseNode {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int lng;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int lat;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int type;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/FullGpsNode$Companion;", "", "", "byteArray", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/BaseNode;", "parse", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BaseNode parse(@NotNull byte[] byteArray) {
            BytesDecoder bytesDecoder = new BytesDecoder(byteArray);
            long uInt16$default = BytesDecoder.readUInt16$default(bytesDecoder, 0, 1, null);
            BytesDecoder.readUInt32$default(bytesDecoder, 0L, 1, null);
            int int32$default = BytesDecoder.readInt32$default(bytesDecoder, 0, 1, null);
            int int32$default2 = BytesDecoder.readInt32$default(bytesDecoder, 0, 1, null);
            BytesDecoder.readUInt16$default(bytesDecoder, 0, 1, null);
            BytesDecoder.readUInt16$default(bytesDecoder, 0, 1, null);
            return new FullGpsNode(uInt16$default, int32$default, int32$default2, BytesDecoder.readUInt16$default(bytesDecoder, 0, 1, null));
        }
    }

    public FullGpsNode(long j, int i, int i2, int i3) {
        super(j);
        this.lng = i;
        this.lat = i2;
        this.type = i3;
    }

    public final int getLat() {
        return this.lat;
    }

    public final int getLng() {
        return this.lng;
    }

    public final int getType() {
        return this.type;
    }
}
