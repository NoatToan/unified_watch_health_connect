package com.huami.bluetooth.profile.ecf.data;

import com.amazon.identity.auth.device.authorization.RegionUtil;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.thanosfisherman.wifiutils.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/data/HrBroadcastType;", "", "", "value", LogUtil.I, "getValue", "()I", "code", "<init>", "(Ljava/lang/String;II)V", "Companion", "CLOSE", a.a, RegionUtil.REGION_STRING_AUTO, "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public enum HrBroadcastType {
    CLOSE(0),
    OPEN(1),
    AUTO(2);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int value;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/data/HrBroadcastType$Companion;", "", "", "code", "Lcom/huami/bluetooth/profile/ecf/data/HrBroadcastType;", "parseHrBroadcastType", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final HrBroadcastType parseHrBroadcastType(int code) {
            for (HrBroadcastType hrBroadcastType : HrBroadcastType.values()) {
                if (hrBroadcastType.getValue() == code) {
                    return hrBroadcastType;
                }
            }
            return null;
        }
    }

    HrBroadcastType(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}
