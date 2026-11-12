package com.huami.bluetooth.profile.channel.module;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/EapType;", "", "", "value", LogUtil.I, "getValue", "()I", "<init>", "(Ljava/lang/String;II)V", "Companion", "INVALID", "PEAP", "TLS", "PWD", "SIM", "AKA", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public enum EapType {
    INVALID(0),
    PEAP(1),
    TLS(2),
    PWD(3),
    SIM(4),
    AKA(5);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int value;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/EapType$Companion;", "", "", "value", "Lcom/huami/bluetooth/profile/channel/module/EapType;", "fromValue", "(Ljava/lang/Integer;)Lcom/huami/bluetooth/profile/channel/module/EapType;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ EapType fromValue$default(Companion companion, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                num = null;
            }
            return companion.fromValue(num);
        }

        @Nullable
        public final EapType fromValue(@Nullable Integer value) {
            EapType eapType;
            if (value == null) {
                return null;
            }
            int iIntValue = value.intValue();
            EapType[] eapTypeArrValues = EapType.values();
            int length = eapTypeArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    eapType = null;
                    break;
                }
                eapType = eapTypeArrValues[i];
                if (eapType.getValue() == iIntValue) {
                    break;
                }
                i++;
            }
            if (eapType == null) {
                eapType = EapType.INVALID;
            }
            if (eapType == null) {
                return null;
            }
            return eapType;
        }
    }

    EapType(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}
