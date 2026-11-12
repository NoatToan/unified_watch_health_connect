package com.huami.nfc.bus;

import com.unionpay.tsmservice.data.AppStatus;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/huami/nfc/bus/PayChannel;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "WeChatMifit", "WeChatAmazfit", "WeChatWatch", "AliPay", "AliPayTest", "MiPay", "WeChatMi", "AlipayMi", "nfc-bus_release"}, k = 1, mv = {1, 5, 1})
public enum PayChannel {
    WeChatMifit("06"),
    WeChatAmazfit("20"),
    WeChatWatch("03"),
    AliPay(AppStatus.VIEW),
    AliPayTest("TT"),
    MiPay("mipay"),
    WeChatMi("wechat_pay"),
    AlipayMi("alipay");


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String value;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/huami/nfc/bus/PayChannel$Companion;", "", "", "value", "Lcom/huami/nfc/bus/PayChannel;", "from", "<init>", "()V", "nfc-bus_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001b A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x001c  */
        @JvmStatic
        @NotNull
        public final PayChannel from(@NotNull String value) {
            for (PayChannel payChannel : PayChannel.values()) {
                if (Intrinsics.areEqual(payChannel.getValue(), value)) {
                    if (payChannel != null) {
                        return payChannel;
                    }
                    throw new IllegalArgumentException(Intrinsics.stringPlus("No PayChannel with value: ", value).toString());
                }
            }
            payChannel = null;
            if (payChannel != null) {
                return payChannel;
            }
            throw new IllegalArgumentException(Intrinsics.stringPlus("No PayChannel with value: ", value).toString());
        }
    }

    PayChannel(String str) {
        this.value = str;
    }

    @JvmStatic
    @NotNull
    public static final PayChannel from(@NotNull String str) {
        return INSTANCE.from(str);
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
