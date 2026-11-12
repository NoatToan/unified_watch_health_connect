package com.huami.bluetooth.profile.channel.model;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\b\u0016\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB1\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\u0006\u0010\u0019\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001c\u001a\u00020\t¢\u0006\u0004\b\u001d\u0010\u001eJ\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0006\u0010\u0005\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0019\u0010\u000e\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0011\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u0019\u0010\u0014\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\rR\u0019\u0010\u0019\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u001c\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u001b\u0010\r¨\u0006 "}, d2 = {"Lcom/huami/bluetooth/profile/channel/model/ChannelDataPacket;", "", "", "isValid", "isFirstPacket", "isEndPacket", "isNeedReply", "", "toRawData", "", "a", LogUtil.I, "getFlag", "()I", "flag", "b", "getSessionId", "sessionId", "c", "getIndex", "index", GoogleApiAvailabilityLight.a, "[B", "getData", "()[B", "data", "e", "getAppId", "appId", "<init>", "(III[BI)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public class ChannelDataPacket {
    public static final int DATA_PACKET_TYPE = 3;
    public static final int FLAG_BEGIN = 1;
    public static final int FLAG_ENCRYPTION = 8;
    public static final int FLAG_END = 2;
    public static final int FLAG_MIDDLE = 0;
    public static final int FLAG_REQUIRE_REPLY = 4;
    private static final int f = 4;
    private static final int h = 10;
    private static final int i = 1;
    private static final int j = 1;
    private static final int k = 1;
    private static final int l = 4;
    private static final int m = 2;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int flag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int sessionId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int index;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final byte[] data;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int appId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final ChannelDataPacket g = new ChannelDataPacket(-1, -1, -1, new byte[0], 0, 16, null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0019\u0010\b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\f8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\f8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\f8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000eR\u0016\u0010\u0014\u001a\u00020\f8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000eR\u0016\u0010\u0015\u001a\u00020\f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000eR\u0016\u0010\u0016\u001a\u00020\f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u000eR\u0016\u0010\u0017\u001a\u00020\f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u000eR\u0016\u0010\u0018\u001a\u00020\f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u000eR\u0016\u0010\u0019\u001a\u00020\f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u000eR\u0016\u0010\u001a\u001a\u00020\f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/huami/bluetooth/profile/channel/model/ChannelDataPacket$Companion;", "", "", "byteArray", "Lcom/huami/bluetooth/profile/channel/model/ChannelDataPacket;", "a", "b", "parseFromRawData", "ERROR_INSTANCE", "Lcom/huami/bluetooth/profile/channel/model/ChannelDataPacket;", "getERROR_INSTANCE", "()Lcom/huami/bluetooth/profile/channel/model/ChannelDataPacket;", "", "DATA_PACKET_TYPE", LogUtil.I, "FLAG_BEGIN", "FLAG_ENCRYPTION", "FLAG_END", "FLAG_LEN", "FLAG_MIDDLE", "FLAG_REQUIRE_REPLY", "INDEX_LEN", "MIN_PACKET_HEADER_SIZE", "MIN_PACKET_SIZE", "MODULE_LEN", "SESSION_ID_LEN", "TOTAL_SIZE_LEN", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final ChannelDataPacket a(byte[] byteArray) {
            Unit unit = Unit.INSTANCE;
            return new FirstPacket(GattUtils.bytesToInt(byteArray, 1, 1), GattUtils.bytesToInt(byteArray, 2, 1), GattUtils.bytesToInt(byteArray, 3, 1), GattUtils.bytesToInt(byteArray, 4), GattUtils.bytesToInt(byteArray, 8, 2), CollectionsKt___CollectionsKt.toByteArray(ArraysKt___ArraysKt.slice(byteArray, new IntRange(10, byteArray.length - 1))), 0, 64, null);
        }

        private final ChannelDataPacket b(byte[] byteArray) {
            Unit unit = Unit.INSTANCE;
            return new ChannelDataPacket(GattUtils.bytesToInt(byteArray, 1, 1), GattUtils.bytesToInt(byteArray, 2, 1), GattUtils.bytesToInt(byteArray, 3, 1), CollectionsKt___CollectionsKt.toByteArray(ArraysKt___ArraysKt.slice(byteArray, new IntRange(4, byteArray.length - 1))), 0, 16, null);
        }

        @NotNull
        public final ChannelDataPacket getERROR_INSTANCE() {
            return ChannelDataPacket.g;
        }

        @NotNull
        public final ChannelDataPacket parseFromRawData(@NotNull byte[] byteArray) {
            Object objM3845constructorimpl;
            if (byteArray.length < 4) {
                return getERROR_INSTANCE();
            }
            byte b = byteArray[1];
            try {
                Result.Companion companion = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl((1 & b) > 0 ? a(byteArray) : b(byteArray));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            ChannelDataPacket error_instance = getERROR_INSTANCE();
            if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
                objM3845constructorimpl = error_instance;
            }
            return (ChannelDataPacket) objM3845constructorimpl;
        }
    }

    public ChannelDataPacket(int i2, int i3, int i4, @NotNull byte[] bArr, int i5) {
        this.flag = i2;
        this.sessionId = i3;
        this.index = i4;
        this.data = bArr;
        this.appId = i5;
    }

    public final int getAppId() {
        return this.appId;
    }

    @NotNull
    public final byte[] getData() {
        return this.data;
    }

    public final int getFlag() {
        return this.flag;
    }

    public final int getIndex() {
        return this.index;
    }

    public final int getSessionId() {
        return this.sessionId;
    }

    public final boolean isEndPacket() {
        return (this.flag & 2) > 0;
    }

    public boolean isFirstPacket() {
        return false;
    }

    public final boolean isNeedReply() {
        return (this.flag & 4) > 0;
    }

    public final boolean isValid() {
        return !Intrinsics.areEqual(this, g);
    }

    @NotNull
    public byte[] toRawData() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(3);
        byteArrayOutputStream.write(this.flag);
        int i2 = this.appId;
        if (i2 >= 0) {
            byteArrayOutputStream.write(i2);
        }
        byteArrayOutputStream.write(this.sessionId);
        byteArrayOutputStream.write(this.index);
        byteArrayOutputStream.write(this.data);
        return byteArrayOutputStream.toByteArray();
    }

    public /* synthetic */ ChannelDataPacket(int i2, int i3, int i4, byte[] bArr, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3, i4, bArr, (i6 & 16) != 0 ? -1 : i5);
    }
}
