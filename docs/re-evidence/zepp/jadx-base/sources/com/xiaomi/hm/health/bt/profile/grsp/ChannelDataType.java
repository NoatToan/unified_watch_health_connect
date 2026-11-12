package com.xiaomi.hm.health.bt.profile.grsp;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/grsp/ChannelDataType;", "", "", "value", "B", "getValue$bluetooth_release", "()B", "", "byteLen", LogUtil.I, "getByteLen", "()I", "<init>", "(Ljava/lang/String;IBI)V", "Companion", "UINT_8", "INT_8", "UINT_16", "INT_16", "UINT_32", "INT_32", "UINT_64", "INT_64", "FLOAT_32", "FLOAT_64", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public enum ChannelDataType {
    UINT_8((byte) 0, 1),
    INT_8((byte) 1, 1),
    UINT_16((byte) 2, 2),
    INT_16((byte) 3, 2),
    UINT_32((byte) 4, 4),
    INT_32((byte) 5, 4),
    UINT_64((byte) 6, 8),
    INT_64((byte) 7, 8),
    FLOAT_32((byte) 8, 4),
    FLOAT_64((byte) 9, 8);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int byteLen;
    private final byte value;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/grsp/ChannelDataType$Companion;", "", "", "value", "Lcom/xiaomi/hm/health/bt/profile/grsp/ChannelDataType;", "fromValue", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        public final ChannelDataType fromValue(byte value) {
            ChannelDataType[] channelDataTypeArrValues = ChannelDataType.values();
            int length = channelDataTypeArrValues.length;
            int i = 0;
            while (i < length) {
                ChannelDataType channelDataType = channelDataTypeArrValues[i];
                i++;
                if (channelDataType.getValue() == value) {
                    return channelDataType;
                }
            }
            return null;
        }
    }

    ChannelDataType(byte b, int i) {
        this.value = b;
        this.byteLen = i;
    }

    @JvmStatic
    @Nullable
    public static final ChannelDataType fromValue(byte b) {
        return INSTANCE.fromValue(b);
    }

    public final int getByteLen() {
        return this.byteLen;
    }

    /* JADX INFO: renamed from: getValue$bluetooth_release, reason: from getter */
    public final byte getValue() {
        return this.value;
    }
}
