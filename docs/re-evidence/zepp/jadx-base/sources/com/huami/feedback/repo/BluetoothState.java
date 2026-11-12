package com.huami.feedback.repo;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.xiaomi.hm.health.Constant;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/huami/feedback/repo/BluetoothState;", "", "", "state", LogUtil.I, "<init>", "(Ljava/lang/String;II)V", "Companion", "UnKnow", Constant.OFF, "TURNING_ON", Constant.ON, "TURNING_OFF", "feedback-impl_release"}, k = 1, mv = {1, 5, 1})
public enum BluetoothState {
    UnKnow(10),
    OFF(10),
    TURNING_ON(11),
    ON(12),
    TURNING_OFF(13);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int state;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/huami/feedback/repo/BluetoothState$Companion;", "", "", "state", "Lcom/huami/feedback/repo/BluetoothState;", "fromState", "<init>", "()V", "feedback-impl_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:13:0x001d  */
        /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
        @NotNull
        public final BluetoothState fromState(int state) {
            for (BluetoothState bluetoothState : BluetoothState.values()) {
                if (bluetoothState.state == state) {
                    if (bluetoothState == null) {
                        return BluetoothState.UnKnow;
                    }
                    return bluetoothState;
                }
            }
            bluetoothState = null;
            if (bluetoothState == null) {
                return BluetoothState.UnKnow;
            }
            return bluetoothState;
        }
    }

    BluetoothState(int i) {
        this.state = i;
    }
}
