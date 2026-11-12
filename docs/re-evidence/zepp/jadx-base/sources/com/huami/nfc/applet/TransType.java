package com.huami.nfc.applet;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.wallet.ui.utils.AnalyticConst;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/huami/nfc/applet/TransType;", "", "", "value", LogUtil.I, "getValue", "()I", "<init>", "(Ljava/lang/String;II)V", "Companion", AnalyticConst.BusDetailOuValue.BUS_DETAIL_OUT_CHARGE, "Consume", "Refund", "IssueCard", "nfc-applet_release"}, k = 1, mv = {1, 5, 1})
public enum TransType {
    Charge(2),
    Consume(6),
    Refund(-1),
    IssueCard(-2);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int value;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\t"}, d2 = {"Lcom/huami/nfc/applet/TransType$Companion;", "", "", "value", "Lcom/huami/nfc/applet/TransType;", "a", "from", "<init>", "()V", "nfc-applet_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final TransType a(int value) {
            if (value != 1 && value != 2) {
                if (value != 5 && value != 6 && value != 9 && value != 10) {
                    if (value != 17 && value != 18) {
                        if (value != 32) {
                            for (TransType transType : TransType.values()) {
                                if (transType.getValue() == value) {
                                    return transType;
                                }
                            }
                            return null;
                        }
                    }
                }
                return TransType.Consume;
            }
            return TransType.Charge;
        }

        @JvmStatic
        @NotNull
        public final TransType from(int value) {
            TransType transTypeA = a(value);
            if (transTypeA != null) {
                return transTypeA;
            }
            throw new IllegalArgumentException(Intrinsics.stringPlus("No TransType with value: ", Integer.valueOf(value)).toString());
        }
    }

    TransType(int i) {
        this.value = i;
    }

    @JvmStatic
    @NotNull
    public static final TransType from(int i) {
        return INSTANCE.from(i);
    }

    public final int getValue() {
        return this.value;
    }
}
