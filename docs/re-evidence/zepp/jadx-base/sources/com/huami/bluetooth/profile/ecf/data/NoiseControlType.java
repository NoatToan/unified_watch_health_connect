package com.huami.bluetooth.profile.ecf.data;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0004\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\t\u001a\u00020\u00068@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/data/NoiseControlType;", "", "", "getValue", "value", LogUtil.I, "", "getByte$bluetooth_release", "()B", "byte", "code", "<init>", "(Ljava/lang/String;II)V", "Companion", "NOISE_REDUCTION", "PENETRATE", "CLOSE", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public enum NoiseControlType {
    NOISE_REDUCTION(1),
    PENETRATE(2),
    CLOSE(3);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private int value;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/data/NoiseControlType$Companion;", "", "", "rawData", "Lcom/huami/bluetooth/profile/ecf/data/NoiseControlType;", "parseMode", "(Ljava/lang/Integer;)Lcom/huami/bluetooth/profile/ecf/data/NoiseControlType;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final NoiseControlType parseMode(@Nullable Integer rawData) {
            for (NoiseControlType noiseControlType : NoiseControlType.values()) {
                int i = noiseControlType.value;
                if (rawData != null && i == rawData.intValue()) {
                    return noiseControlType;
                }
            }
            return null;
        }
    }

    NoiseControlType(int i) {
        this.value = i;
    }

    public final byte getByte$bluetooth_release() {
        return (byte) this.value;
    }

    public final int getValue() {
        return this.value;
    }
}
