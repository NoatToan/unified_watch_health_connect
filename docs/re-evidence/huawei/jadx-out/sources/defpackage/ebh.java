package defpackage;

import android.content.Context;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.util.Base64;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ebh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f32669a = {44, 46, 47, 96, 33, 64};

    public static boolean d(Context context) {
        return a(context);
    }

    public static int[][] e(int[] iArr) {
        int[] iArr2;
        String strEncodeToString = Base64.encodeToString(ecj.e(iArr), 2);
        dyg.e(false, "ProbeReguestUtil", "Base64.encodeToString ", strEncodeToString);
        int length = strEncodeToString.length();
        char[] charArray = strEncodeToString.toCharArray();
        int i = length % 30;
        int i2 = i == 0 ? 0 : 30 - i;
        int i3 = length / 30;
        if (i2 != 0) {
            i3++;
        }
        char cCharAt = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=".charAt(iArr[0] & 63);
        dyg.e(false, "ProbeReguestUtil", "charCrc ", Character.valueOf(cCharAt));
        if (i3 > 6) {
            return null;
        }
        if (i2 > 0) {
            int i4 = i2 + length;
            iArr2 = new int[i4];
            for (int i5 = 0; i5 < length; i5++) {
                iArr2[i5] = charArray[i5];
            }
            int i6 = length + 1;
            Arrays.fill(iArr2, length, i6, 32);
            Arrays.fill(iArr2, i6, i4, 35);
        } else {
            iArr2 = new int[length];
            for (int i7 = 0; i7 < length; i7++) {
                iArr2[i7] = charArray[i7];
            }
        }
        int[][] iArr3 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i3, 30);
        for (int i8 = 0; i8 < i3; i8++) {
            int[] iArr4 = iArr3[i8];
            iArr4[0] = f32669a[i8];
            iArr4[1] = cCharAt;
            for (int i9 = 2; i9 < 30; i9++) {
                int i10 = ((i8 * 30) + i9) - 2;
                if (i10 < iArr2.length) {
                    iArr3[i8][i9] = iArr2[i10];
                }
            }
        }
        return iArr3;
    }

    public static WifiConfiguration a(String str) {
        WifiConfiguration wifiConfiguration = new WifiConfiguration();
        wifiConfiguration.allowedAuthAlgorithms.clear();
        wifiConfiguration.allowedGroupCiphers.clear();
        wifiConfiguration.allowedKeyManagement.clear();
        wifiConfiguration.allowedPairwiseCiphers.clear();
        wifiConfiguration.allowedProtocols.clear();
        wifiConfiguration.SSID = "\"" + str + "\"";
        wifiConfiguration.hiddenSSID = true;
        wifiConfiguration.allowedKeyManagement.set(0);
        wifiConfiguration.status = 2;
        return wifiConfiguration;
    }

    public static boolean a(Context context) {
        List<WifiConfiguration> configuredNetworks;
        boolean z;
        if (context == null) {
            dyg.c(false, "ProbeReguestUtil", "restoreWifiConfig context is null");
            return false;
        }
        WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
        try {
            configuredNetworks = wifiManager.getConfiguredNetworks();
        } catch (Exception unused) {
            dyg.c(false, "ProbeReguestUtil", "restoreWifiConfig getConfiguredNetworks Exception");
            configuredNetworks = null;
        }
        if (configuredNetworks == null) {
            dyg.a(false, "ProbeReguestUtil", "restoreWifiConfig configs is null!");
            return false;
        }
        boolean z2 = true;
        for (WifiConfiguration wifiConfiguration : configuredNetworks) {
            if (wifiConfiguration.SSID == null) {
                dyg.d(false, "ProbeReguestUtil", "restoreWifiConfig ssid is null!");
            } else {
                String strE = ecs.e(wifiConfiguration.SSID);
                if (strE != null && strE.length() != 0) {
                    int[] iArr = f32669a;
                    int length = iArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            z = false;
                            break;
                        }
                        if (strE.charAt(0) == ((char) iArr[i])) {
                            z = true;
                            break;
                        }
                        i++;
                    }
                    boolean z3 = wifiConfiguration.hiddenSSID && strE.length() == 30;
                    if (z && z3) {
                        dyg.e(false, "ProbeReguestUtil", "restoreWifiConfig ", wifiConfiguration);
                        int i2 = wifiConfiguration.networkId;
                        boolean zRemoveNetwork = wifiManager.removeNetwork(i2);
                        dyg.a(false, "ProbeReguestUtil", "networkId ", Integer.valueOf(i2), " remove  ", Boolean.valueOf(zRemoveNetwork), " disable ", Boolean.valueOf(zRemoveNetwork), "saveConfig ", Boolean.valueOf(wifiManager.saveConfiguration()));
                        if (z2 && !zRemoveNetwork) {
                            z2 = false;
                        }
                    }
                }
            }
        }
        return z2;
    }
}
