package com.xiaomi.hm.health.bt.device;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/ScanErrorCode;", "", "", "code", LogUtil.I, "getCode", "()I", "<init>", "(Ljava/lang/String;II)V", "Companion", "CONNECTED_KNOWN", "CONNECTED_UNKNOWN", "NOT_CONNECTED_KNOWN", "NOT_CONNECTED_UNKNOWN", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public enum ScanErrorCode {
    CONNECTED_KNOWN(0),
    CONNECTED_UNKNOWN(1),
    NOT_CONNECTED_KNOWN(2),
    NOT_CONNECTED_UNKNOWN(3);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int code;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007¨\u0006\t"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/ScanErrorCode$Companion;", "", "", "unknown", Status.PRE_CONNECT_STATE_CONNECTED, "Lcom/xiaomi/hm/health/bt/device/ScanErrorCode;", "from", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final ScanErrorCode from(boolean unknown, boolean connected) {
            if (unknown && connected) {
                return ScanErrorCode.CONNECTED_UNKNOWN;
            }
            if (!unknown || connected) {
                return (unknown || !connected) ? ScanErrorCode.NOT_CONNECTED_KNOWN : ScanErrorCode.CONNECTED_KNOWN;
            }
            return ScanErrorCode.NOT_CONNECTED_UNKNOWN;
        }
    }

    ScanErrorCode(int i) {
        this.code = i;
    }

    @JvmStatic
    @NotNull
    public static final ScanErrorCode from(boolean z, boolean z2) {
        return INSTANCE.from(z, z2);
    }

    public final int getCode() {
        return this.code;
    }
}
