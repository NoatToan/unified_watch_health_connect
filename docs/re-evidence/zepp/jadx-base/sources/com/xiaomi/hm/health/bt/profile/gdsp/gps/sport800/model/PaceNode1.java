package com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.model;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B'\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/PaceNode1;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/BaseNode;", "", "b", LogUtil.I, "getFreq", "()I", "freq", "c", "getStride", "stride", GoogleApiAvailabilityLight.a, "getPace", "pace", "", "timeDiff", "<init>", "(JIII)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class PaceNode1 extends BaseNode {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int freq;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int stride;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int pace;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/PaceNode1$Companion;", "", "", "byteArray", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/PaceNode1;", "parse", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final PaceNode1 parse(@NotNull byte[] byteArray) {
            return new PaceNode1(GattUtils.bytesToLong(byteArray, 0, 2), GattUtils.bytesToInt(byteArray, 2, 2), GattUtils.bytesToInt(byteArray, 4, 2), GattUtils.bytesToInt(byteArray, 6, 2));
        }
    }

    public PaceNode1(long j, int i, int i2, int i3) {
        super(j);
        this.freq = i;
        this.stride = i2;
        this.pace = i3;
    }

    public final int getFreq() {
        return this.freq;
    }

    public final int getPace() {
        return this.pace;
    }

    public final int getStride() {
        return this.stride;
    }
}
