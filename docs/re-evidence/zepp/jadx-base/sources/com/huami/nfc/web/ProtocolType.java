package com.huami.nfc.web;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/huami/nfc/web/ProtocolType;", "", "", "type", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "XiaomiUnionpaySecret", "XiaomiAccessDoor", "SnowballAccessDoor", "SnowballBusCard", "SnowballShiftBusCard", "XiaoMiMasterCard", "XiaoMiMasterCardPolicy", "Unionpay", "web_release"}, k = 1, mv = {1, 5, 1})
public enum ProtocolType {
    XiaomiUnionpaySecret("xiaomi_secret"),
    XiaomiAccessDoor("xiaomi_accesscard"),
    SnowballAccessDoor("snowball_accesscard"),
    SnowballBusCard("snowball_nfc_buscard"),
    SnowballShiftBusCard("snowball_shift_buscard"),
    XiaoMiMasterCard("xiaomi_mastercard"),
    XiaoMiMasterCardPolicy("xiaomi_mastercard_privacy_policy"),
    Unionpay("xiaomi_unionpay");


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String type;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/huami/nfc/web/ProtocolType$Companion;", "", "", "type", "Lcom/huami/nfc/web/ProtocolType;", "from", "<init>", "()V", "web_release"}, k = 1, mv = {1, 5, 1})
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
        public final ProtocolType from(@NotNull String type) {
            for (ProtocolType protocolType : ProtocolType.values()) {
                if (Intrinsics.areEqual(protocolType.getType(), type)) {
                    if (protocolType != null) {
                        return protocolType;
                    }
                    throw new IllegalArgumentException(Intrinsics.stringPlus("No ProtocolType with type: ", type).toString());
                }
            }
            protocolType = null;
            if (protocolType != null) {
                return protocolType;
            }
            throw new IllegalArgumentException(Intrinsics.stringPlus("No ProtocolType with type: ", type).toString());
        }
    }

    ProtocolType(String str) {
        this.type = str;
    }

    @JvmStatic
    @NotNull
    public static final ProtocolType from(@NotNull String str) {
        return INSTANCE.from(str);
    }

    @NotNull
    public final String getType() {
        return this.type;
    }
}
