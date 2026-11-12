package com.huami.bluetooth.profile.base;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.GeneralDeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.PnP;
import com.xiaomi.hm.health.bt.utils.ByteArrayKt;
import java.util.Arrays;
import java.util.BitSet;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\u000b\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0016\u0010\r\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0016\u0010\u000f\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\bR\u0016\u0010\u0011\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/huami/bluetooth/profile/base/ClassicNewDeviceInfoParser;", "", "", "data", "Lcom/xiaomi/hm/health/bt/profile/base/DeviceInfo;", "parse", "", "a", LogUtil.I, "SYSTEM_ID", "b", "PNP_ID", "c", "SERIAL_NUMBER", GoogleApiAvailabilityLight.a, "SOFTWARE_VERSION", "e", "HARDWARE_VERSION", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class ClassicNewDeviceInfoParser {

    @NotNull
    public static final ClassicNewDeviceInfoParser INSTANCE = new ClassicNewDeviceInfoParser();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final int SYSTEM_ID = 0;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final int PNP_ID = 1;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final int SERIAL_NUMBER = 2;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final int SOFTWARE_VERSION = 3;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final int HARDWARE_VERSION = 4;

    private ClassicNewDeviceInfoParser() {
    }

    @Nullable
    public final DeviceInfo parse(@NotNull byte[] data) {
        int length;
        GeneralDeviceInfo generalDeviceInfo = new GeneralDeviceInfo();
        generalDeviceInfo.version = data[0] & 255;
        BitSet bitSetValueOf = BitSet.valueOf(ArraysKt___ArraysJvmKt.copyOfRange(data, 1, 3));
        if (bitSetValueOf.get(0)) {
            length = 11;
            byte[] bArrCopyOfRange = ArraysKt___ArraysJvmKt.copyOfRange(data, 3, 11);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            generalDeviceInfo.deviceID = String.format("%02X%02X%02X%02X%02X%02X%02X%02X", Arrays.copyOf(new Object[]{Byte.valueOf(bArrCopyOfRange[0]), Byte.valueOf(bArrCopyOfRange[1]), Byte.valueOf(bArrCopyOfRange[2]), Byte.valueOf(bArrCopyOfRange[3]), Byte.valueOf(bArrCopyOfRange[4]), Byte.valueOf(bArrCopyOfRange[5]), Byte.valueOf(bArrCopyOfRange[6]), Byte.valueOf(bArrCopyOfRange[7])}, 8));
            generalDeviceInfo.bytesOfDeviceID = bArrCopyOfRange;
        } else {
            length = 3;
        }
        if (bitSetValueOf.get(1)) {
            int i = length + 7;
            byte[] bArrCopyOfRange2 = ArraysKt___ArraysJvmKt.copyOfRange(data, length, i);
            PnP pnP = new PnP();
            pnP.vendorSource = bArrCopyOfRange2[0] & 255;
            pnP.vendorId = ((bArrCopyOfRange2[2] & 255) << 8) | (bArrCopyOfRange2[1] & 255);
            pnP.productId = ((bArrCopyOfRange2[4] & 255) << 8) | (bArrCopyOfRange2[3] & 255);
            pnP.productVersion = (bArrCopyOfRange2[5] & 255) | ((bArrCopyOfRange2[6] & 255) << 8);
            generalDeviceInfo.pnp = pnP;
            length = i;
        }
        if (bitSetValueOf.get(2)) {
            Pair stringAndIndex$default = ByteArrayKt.toStringAndIndex$default(data, length, 0, 2, null);
            generalDeviceInfo.serialNumber = (String) stringAndIndex$default.getFirst();
            length += ((Number) stringAndIndex$default.getSecond()).intValue() < 0 ? data.length - length : ((Number) stringAndIndex$default.getSecond()).intValue() + 1;
        }
        if (bitSetValueOf.get(3)) {
            Pair stringAndIndex$default2 = ByteArrayKt.toStringAndIndex$default(data, length, 0, 2, null);
            generalDeviceInfo.firmwareRevision = (String) stringAndIndex$default2.getFirst();
            length += ((Number) stringAndIndex$default2.getSecond()).intValue() < 0 ? data.length - length : 1 + ((Number) stringAndIndex$default2.getSecond()).intValue();
        }
        if (bitSetValueOf.get(4)) {
            generalDeviceInfo.hardwareRevision = ByteArrayKt.toString$default(data, length, 0, 2, null);
        }
        return new DeviceInfo(generalDeviceInfo);
    }
}
