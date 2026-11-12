package com.xiaomi.hm.health.device.capturedevice;

import android.net.UrlQuerySanitizer;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.internal.ProgressionUtilKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\u001a\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000\u001a\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0000H\u0002\u001a\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\u0002\"\u0016\u0010\t\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\b\"\u0016\u0010\n\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b\"\u0016\u0010\f\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\b\"\u0016\u0010\u000e\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\b\"\u0016\u0010\u0010\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\b¨\u0006\u0011"}, d2 = {"", "rawResult", "Lcom/xiaomi/hm/health/device/capturedevice/DeviceQRInfo;", "getDeviceQRInfo", "rawMacString", "", "a", "b", "Ljava/lang/String;", "PREFIX", "KEY_MAC", "c", "KEY_MAC_XIAOMI", GoogleApiAvailabilityLight.a, "KEY_PNP_NUM", "e", "KEY_PNP_VER", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class CaptureQRResultKt {

    @NotNull
    private static final String a = "https://api.amazfit.com/app.json";

    @NotNull
    private static final String b = "macAddress";

    @NotNull
    private static final String c = "mac";

    @NotNull
    private static final String d = "pnpNumber";

    @NotNull
    private static final String e = "pnpVersion";

    private static final boolean a(String str) {
        if (str == null || str.length() != 12) {
            return false;
        }
        String upperCase = str.toUpperCase();
        int i = 0;
        while (true) {
            int i2 = i + 1;
            char cCharAt = upperCase.charAt(i);
            if (!('0' <= cCharAt && cCharAt <= '9')) {
                if (!('A' <= cCharAt && cCharAt <= 'F')) {
                    return false;
                }
            }
            if (i2 > 11) {
                return true;
            }
            i = i2;
        }
    }

    private static final String b(String str) {
        int i = 0;
        int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(0, 10, 2);
        String str2 = "";
        if (progressionLastElement >= 0) {
            while (true) {
                int i2 = i + 2;
                str2 = str2 + ((Object) str.subSequence(i, i2));
                if (i != 10) {
                    str2 = str2 + ":";
                }
                if (i == progressionLastElement) {
                    break;
                }
                i = i2;
            }
        }
        return str2;
    }

    @Nullable
    public static final DeviceQRInfo getDeviceQRInfo(@Nullable String str) {
        if (str == null) {
            return null;
        }
        UrlQuerySanitizer urlQuerySanitizer = new UrlQuerySanitizer(str);
        try {
            String value = urlQuerySanitizer.getValue("macAddress");
            if (!a(value)) {
                value = urlQuerySanitizer.getValue("mac");
            }
            if (!a(value)) {
                return null;
            }
            String strB = b(value);
            int i = Integer.parseInt(urlQuerySanitizer.getValue(d));
            int i2 = Integer.parseInt(urlQuerySanitizer.getValue(e));
            if (strB != null) {
                return new DeviceQRInfo(strB.toUpperCase(), i, i2);
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } catch (Exception unused) {
            return null;
        }
    }
}
