package com.xiaomi.fitness.device.manager.export.scan.beacon;

import com.xiaomi.fitness.common.utils.StringUtil;
import com.xiaomi.fitness.statistics.StatConstants;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000eJ\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000eJ\u001e\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0011\u0010\u000f\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u001b\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b \u0010\u0011R\u0011\u0010!\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001e¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/device/manager/export/scan/beacon/PacketReader;", "", "item", "Lcom/xiaomi/fitness/device/manager/export/scan/beacon/BeaconItem;", "<init>", "(Lcom/xiaomi/fitness/device/manager/export/scan/beacon/BeaconItem;)V", "mBytes", "", "mByteBuffer", "Ljava/nio/ByteBuffer;", "kotlin.jvm.PlatformType", "Ljava/nio/ByteBuffer;", "position", "", "", "short", "getShort", "()I", "byte", "getByte", "getBit", "", "n", "index", "getInt", StatConstants.PARAM_START, StatConstants.PARAM_END, "mac", "", "getMac", "()Ljava/lang/String;", "lastShort", "getLastShort", "shortString", "getShortString", "device-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PacketReader {
    private final ByteBuffer mByteBuffer;

    @NotNull
    private final byte[] mBytes;

    public PacketReader(@NotNull BeaconItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        byte[] bytes = item.getBytes();
        this.mBytes = bytes;
        this.mByteBuffer = ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN);
    }

    public final boolean getBit(int n, int index) {
        return (n & (1 << index)) != 0;
    }

    public final int getByte() {
        return this.mByteBuffer.get() & 255;
    }

    public final int getInt(int n, int start, int end) {
        return (n >> start) & ((1 << ((end - start) + 1)) - 1);
    }

    public final int getLastShort() {
        position(this.mBytes.length - 2);
        return getShort();
    }

    @NotNull
    public final String getMac() {
        String[] strArr = new String[6];
        int i = 5;
        while (true) {
            int i2 = i - 1;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("%02x", Arrays.copyOf(new Object[]{Integer.valueOf(getByte())}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            String upperCase = str.toUpperCase();
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            strArr[i] = upperCase;
            if (i2 < 0) {
                String strJoin = StringUtil.INSTANCE.join(strArr, ":");
                Intrinsics.checkNotNull(strJoin);
                return strJoin;
            }
            i = i2;
        }
    }

    public final int getShort() {
        return this.mByteBuffer.getShort() & UShort.MAX_VALUE;
    }

    @NotNull
    public final String getShortString() {
        String[] strArr = new String[2];
        int i = 1;
        while (true) {
            int i2 = i - 1;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("%02x", Arrays.copyOf(new Object[]{Integer.valueOf(getByte())}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            String upperCase = str.toUpperCase();
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            strArr[i] = upperCase;
            if (i2 < 0) {
                String strJoin = StringUtil.INSTANCE.join(strArr, "");
                Intrinsics.checkNotNull(strJoin);
                return strJoin;
            }
            i = i2;
        }
    }

    public final void position(int position) {
        this.mByteBuffer.position(position);
    }
}
