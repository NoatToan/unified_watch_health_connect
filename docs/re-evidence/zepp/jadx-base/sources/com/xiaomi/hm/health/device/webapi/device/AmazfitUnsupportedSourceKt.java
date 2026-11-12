package com.xiaomi.hm.health.device.webapi.device;

import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\"\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"", "source", "", "isUnsupported", "", "a", "[I", "getUnsupportedSourceList", "()[I", "unsupportedSourceList", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class AmazfitUnsupportedSourceKt {

    @NotNull
    private static final int[] a = {HMDeviceSource.MILI_KONGMING.getValue(), HMDeviceSource.MILI_KONGMING_L.getValue(), HMDeviceSource.MILI_KONGMING_PRO.getValue(), HMDeviceSource.MILI_PANGU.getValue(), HMDeviceSource.MILI_PANGU_L.getValue(), HMDeviceSource.MILI_L66.getValue(), HMDeviceSource.MILI_L66_AP.getValue(), HMDeviceSource.MILI_L66_I.getValue(), HMDeviceSource.MILI_L66_IN.getValue(), HMDeviceSource.MILI_L66_NFC.getValue(), HMDeviceSource.MILI_L66_NFC_I.getValue(), HMDeviceSource.MILI_L66_WE.getValue()};

    @NotNull
    public static final int[] getUnsupportedSourceList() {
        return a;
    }

    public static final boolean isUnsupported(int i) {
        for (int i2 : a) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }
}
