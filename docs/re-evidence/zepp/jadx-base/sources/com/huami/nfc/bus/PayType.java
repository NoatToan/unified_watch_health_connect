package com.huami.nfc.bus;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.wallet.ui.utils.AnalyticConst;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/huami/nfc/bus/PayType;", "", "", "value", LogUtil.I, "getValue", "()I", "<init>", "(Ljava/lang/String;II)V", "Companion", "OpenOrCharge", "OpenCard", AnalyticConst.BusDetailOuValue.BUS_DETAIL_OUT_CHARGE, "OpenAndCharge", "MoveOut", "MoveIn", "nfc-bus_release"}, k = 1, mv = {1, 5, 1})
public enum PayType {
    OpenOrCharge(0),
    OpenCard(1),
    Charge(2),
    OpenAndCharge(3),
    MoveOut(4),
    MoveIn(5);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int value;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/huami/nfc/bus/PayType$Companion;", "", "", "value", "Lcom/huami/nfc/bus/PayType;", "from", "<init>", "()V", "nfc-bus_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:13:0x001d A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:14:0x001e  */
        @JvmStatic
        @NotNull
        public final PayType from(int value) {
            for (PayType payType : PayType.values()) {
                if (payType.getValue() == value) {
                    if (payType != null) {
                        return payType;
                    }
                    throw new IllegalArgumentException(Intrinsics.stringPlus("No PayType with value: ", Integer.valueOf(value)).toString());
                }
            }
            payType = null;
            if (payType != null) {
                return payType;
            }
            throw new IllegalArgumentException(Intrinsics.stringPlus("No PayType with value: ", Integer.valueOf(value)).toString());
        }
    }

    PayType(int i) {
        this.value = i;
    }

    @JvmStatic
    @NotNull
    public static final PayType from(int i) {
        return INSTANCE.from(i);
    }

    public final int getValue() {
        return this.value;
    }
}
