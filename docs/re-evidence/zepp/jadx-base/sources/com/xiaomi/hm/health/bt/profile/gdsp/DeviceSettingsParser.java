package com.xiaomi.hm.health.bt.profile.gdsp;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.proto.ComoSettingUpload;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0007\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\u0004B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001R\u0016\u0010\u0006\u001a\u00020\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/DeviceSettingsParser;", "", "get", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "a", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "", "b", "[B", "data", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;[B)V", "c", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class DeviceSettingsParser {

    @Deprecated
    @NotNull
    public static final String TAG = "DeviceSettingsParser";

    @Deprecated
    public static final int VERSION_1 = 1;

    @NotNull
    private static final a c = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HMDeviceSource source;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final byte[] data;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HMDeviceSource.values().length];
            iArr[HMDeviceSource.MILI_COMO.ordinal()] = 1;
            iArr[HMDeviceSource.MILI_COMO_W.ordinal()] = 2;
            iArr[HMDeviceSource.MILI_COMO_L.ordinal()] = 3;
            iArr[HMDeviceSource.MILI_COMO_WL.ordinal()] = 4;
            iArr[HMDeviceSource.MILI_NESS.ordinal()] = 5;
            iArr[HMDeviceSource.MILI_NESS_W.ordinal()] = 6;
            iArr[HMDeviceSource.MILI_DAX.ordinal()] = 7;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"com/xiaomi/hm/health/bt/profile/gdsp/DeviceSettingsParser$a", "", "", "TAG", "Ljava/lang/String;", "", "VERSION_1", LogUtil.I, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public DeviceSettingsParser(@NotNull HMDeviceSource hMDeviceSource, @NotNull byte[] bArr) {
        this.source = hMDeviceSource;
        this.data = bArr;
    }

    @Nullable
    public final Object get() {
        byte[] bArr = this.data;
        if (!(bArr.length > 1)) {
            bArr = null;
        }
        Integer numValueOf = bArr == null ? null : Integer.valueOf(bArr[0]);
        if (numValueOf == null) {
            return null;
        }
        int iIntValue = numValueOf.intValue();
        Debug.fi(TAG, Intrinsics.stringPlus("Parse device settings version: ", Integer.valueOf(iIntValue)));
        if (iIntValue != 1) {
            return null;
        }
        switch (WhenMappings.$EnumSwitchMapping$0[this.source.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                try {
                    byte[] bArr2 = this.data;
                    return ComoSettingUpload.ComoNessSettingMessage.parseFrom(ArraysKt___ArraysJvmKt.copyOfRange(bArr2, 1, bArr2.length));
                } catch (Exception e) {
                    Debug.fi(TAG, Intrinsics.stringPlus("Parse device settings error: ", e.getMessage()));
                    return null;
                }
            default:
                return null;
        }
    }
}
