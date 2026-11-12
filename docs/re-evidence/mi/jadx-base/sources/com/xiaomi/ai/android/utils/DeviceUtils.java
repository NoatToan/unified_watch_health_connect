package com.xiaomi.ai.android.utils;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.xiaomi.accountsdk.hasheddeviceidlib.HardwareInfo;
import com.xiaomi.ai.android.capability.AuthCapability;
import com.xiaomi.smarthome.library.crypto.rc4coder.Coder;
import defpackage.wpe;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public final class DeviceUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set<String> f10983a;

    static {
        HashSet hashSet = new HashSet();
        f10983a = hashSet;
        hashSet.add("ad921d60486366258809553a3db49a4a");
    }

    private DeviceUtils() {
    }

    private static String a(String str) {
        String str2;
        if (TextUtils.isEmpty(str) || str.equals("unknown")) {
            return null;
        }
        try {
            byte[] bArrDigest = MessageDigest.getInstance(Coder.KEY_MD5).digest(str.getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder(bArrDigest.length * 2);
            for (byte b2 : bArrDigest) {
                int i = b2 & 255;
                if (i < 16) {
                    sb.append("0");
                }
                sb.append(Integer.toHexString(i));
            }
            return sb.toString();
        } catch (UnsupportedEncodingException unused) {
            str2 = "UnsupportedEncodingException";
            wpe.e("DeviceUtils", str2);
            return null;
        } catch (NoSuchAlgorithmException unused2) {
            str2 = "NoSuchAlgorithmException";
            wpe.e("DeviceUtils", str2);
            return null;
        }
    }

    private static boolean b(String str) {
        return HardwareInfo.FAKE_MAC_ADDRESS.equals(str) || "00:00:00:00:00:00".equals(str) || "ff:ff:ff:ff:ff:ff".equals(str) || "FF:FF:FF:FF:FF:FF".equals(str);
    }

    public static String getDefaultState(String str) {
        return getDefaultState(str, null);
    }

    public static synchronized String getDeviceId(Context context) {
        return getDeviceId(context, null);
    }

    public static String getDefaultState(String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str2)) {
            str3 = "d=" + str;
        } else {
            str3 = "d=" + str + "&md=" + str2;
        }
        return b.a("SHA1", str3.getBytes()).replace(":", "");
    }

    public static synchronized String getDeviceId(Context context, AuthCapability authCapability) {
        String strA;
        boolean z;
        try {
            wpe.b("DeviceUtils", "getDeviceId");
            strA = d.a(context, "aivs_did.xml", "device_id");
            if (TextUtils.isEmpty(strA) || f10983a.contains(strA)) {
                if (authCapability != null) {
                    wpe.h("DeviceUtils", "getDeviceId: from oaid");
                    strA = authCapability.getOaid();
                }
                if (TextUtils.isEmpty(strA)) {
                    try {
                        strA = a(Build.getSerial());
                        wpe.b("DeviceUtils", "get did from build serial");
                    } catch (Exception e) {
                        wpe.h("DeviceUtils", "getSerial: " + e.getMessage());
                    }
                }
                if (TextUtils.isEmpty(strA) || b(strA)) {
                    strA = a(UUID.randomUUID().toString());
                    wpe.b("DeviceUtils", "get did from random uuid");
                }
                z = false;
            } else {
                z = true;
            }
            if (!TextUtils.isEmpty(strA) && !z) {
                d.a(context, "aivs_did.xml", "device_id", strA);
            }
        } catch (Throwable th) {
            throw th;
        }
        return strA;
    }
}
