package com.xiaomi.ai.android.utils;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.xiaomi.ai.android.capability.AuthCapability;
import com.xiaomi.ai.log.Logger;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes18.dex */
public final class DeviceUtils {
    private static final Set<String> a = new HashSet<String>() { // from class: com.xiaomi.ai.android.utils.DeviceUtils.1
        {
            add("ad921d60486366258809553a3db49a4a");
        }
    };

    private DeviceUtils() {
    }

    private static String a() {
        String strSubstring = "";
        try {
            LineNumberReader lineNumberReader = new LineNumberReader(new InputStreamReader(Runtime.getRuntime().exec("cat /sys/class/net/wlan0/address ").getInputStream()));
            String line = "";
            while (line != null) {
                line = lineNumberReader.readLine();
                if (line != null) {
                    strSubstring = line.trim();
                    break;
                }
            }
        } catch (Exception e) {
            Logger.b("DeviceUtils", "getNetworkMacAddress: wlan0 " + e.getMessage());
        }
        if (TextUtils.isEmpty(strSubstring)) {
            try {
                strSubstring = b("/sys/class/net/eth0/address").toUpperCase().substring(0, 17);
            } catch (Exception e2) {
                Logger.b("DeviceUtils", "getNetworkMacAddress: eth0 " + e2.getMessage());
            }
        }
        if (TextUtils.isEmpty(strSubstring) || c(strSubstring)) {
            return null;
        }
        return strSubstring;
    }

    private static String a(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            int i = Build.VERSION.SDK_INT;
            if (i < 23) {
                return telephonyManager.getDeviceId();
            }
            if (telephonyManager.getPhoneCount() == 0) {
                return null;
            }
            return i >= 26 ? telephonyManager.getImei(0) : telephonyManager.getDeviceId(0);
        } catch (Exception e) {
            Logger.b("DeviceUtils", "getTelephonyDeviceId: " + e.getMessage());
            return null;
        }
    }

    private static String a(String str) {
        String str2;
        if (TextUtils.isEmpty(str) || str.equals("unknown")) {
            return null;
        }
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder(bArrDigest.length * 2);
            for (byte b : bArrDigest) {
                int i = b & 255;
                if (i < 16) {
                    sb.append("0");
                }
                sb.append(Integer.toHexString(i));
            }
            return sb.toString();
        } catch (UnsupportedEncodingException unused) {
            str2 = "UnsupportedEncodingException";
            Logger.d("DeviceUtils", str2);
            return null;
        } catch (NoSuchAlgorithmException unused2) {
            str2 = "NoSuchAlgorithmException";
            Logger.d("DeviceUtils", str2);
            return null;
        }
    }

    private static String b() {
        String address;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            try {
                address = defaultAdapter.getAddress();
            } catch (Exception e) {
                Logger.b("DeviceUtils", "getBluetoothMacAddress" + e.getMessage());
                address = "";
            }
        } else {
            address = "";
        }
        if (c(address)) {
            return null;
        }
        return address;
    }

    private static String b(String str) {
        FileReader fileReader = new FileReader(str);
        StringBuilder sb = new StringBuilder();
        char[] cArr = new char[4096];
        while (true) {
            int i = fileReader.read(cArr);
            if (i < 0) {
                fileReader.close();
                return sb.toString();
            }
            sb.append(cArr, 0, i);
        }
    }

    private static boolean c(String str) {
        return "02:00:00:00:00:00".equals(str) || com.alipay.sdk.m.u.c.b.equals(str) || "ff:ff:ff:ff:ff:ff".equals(str) || "FF:FF:FF:FF:FF:FF".equals(str);
    }

    public static String getDefaultState(String str) {
        return getDefaultState(str, null);
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

    /* JADX WARN: Code duplicated, block: B:28:0x0087 A[Catch: all -> 0x0098, PHI: r1 r2
      0x0087: PHI (r1v2 boolean) = (r1v1 boolean), (r1v1 boolean), (r1v1 boolean), (r1v0 boolean) binds: [B:10:0x0027, B:27:0x007b, B:26:0x0079, B:8:0x0018] A[DONT_GENERATE, DONT_INLINE]
      0x0087: PHI (r2v15 java.lang.String) = (r2v3 java.lang.String), (r2v10 java.lang.String), (r2v7 java.lang.String), (r2v1 java.lang.String) binds: [B:10:0x0027, B:27:0x007b, B:26:0x0079, B:8:0x0018] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0004, B:7:0x0012, B:28:0x0087, B:31:0x008f, B:9:0x001a, B:11:0x0029, B:13:0x0037, B:14:0x003f, B:16:0x0045, B:19:0x004b, B:22:0x0055, B:23:0x006f, B:25:0x0075, B:27:0x007b), top: B:37:0x0004, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x008d A[ADDED_TO_REGION] */
    public static synchronized String getDeviceId(Context context) {
        String strA;
        boolean z = true;
        strA = e.a(context, "aivs_did.xml", "device_id");
        if (TextUtils.isEmpty(strA) || a.contains(strA)) {
            z = false;
            strA = a(a(context));
            if (TextUtils.isEmpty(strA)) {
                strA = a(a());
                if (TextUtils.isEmpty(strA)) {
                    strA = a(b());
                }
                if (TextUtils.isEmpty(strA) && Build.VERSION.SDK_INT >= 26) {
                    try {
                        strA = a(Build.getSerial());
                    } catch (Exception e) {
                        Logger.b("DeviceUtils", "getSerial: " + e.getMessage());
                    }
                }
                if (TextUtils.isEmpty(strA) || c(strA)) {
                    strA = a(UUID.randomUUID().toString());
                }
                if (!TextUtils.isEmpty(strA) && !z) {
                    e.a(context, "aivs_did.xml", "device_id", strA);
                }
            } else if (!TextUtils.isEmpty(strA)) {
                e.a(context, "aivs_did.xml", "device_id", strA);
            }
        } else if (!TextUtils.isEmpty(strA)) {
            e.a(context, "aivs_did.xml", "device_id", strA);
        }
        throw th;
        return strA;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a2 A[Catch: all -> 0x00b3, PHI: r1 r2
      0x00a2: PHI (r1v3 boolean) = (r1v2 boolean), (r1v2 boolean), (r1v2 boolean), (r1v1 boolean) binds: [B:12:0x0033, B:32:0x0096, B:31:0x0094, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE]
      0x00a2: PHI (r2v16 java.lang.String) = (r2v3 java.lang.String), (r2v8 java.lang.String), (r2v7 java.lang.String), (r2v2 java.lang.String) binds: [B:12:0x0033, B:32:0x0096, B:31:0x0094, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0019, B:33:0x00a2, B:36:0x00aa, B:10:0x0024, B:11:0x002f, B:13:0x0035, B:15:0x0043, B:16:0x004b, B:18:0x0051, B:19:0x0059, B:21:0x005f, B:24:0x0065, B:27:0x006f, B:28:0x0089, B:30:0x0090, B:32:0x0096), top: B:44:0x0003, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a8 A[ADDED_TO_REGION] */
    public static synchronized String getDeviceId(Context context, AuthCapability authCapability) {
        String strA;
        Logger.a("DeviceUtils", "getDeviceId");
        boolean z = true;
        strA = e.a(context, "aivs_did.xml", "device_id");
        if (TextUtils.isEmpty(strA) || a.contains(strA)) {
            z = false;
            if (authCapability != null) {
                Logger.b("DeviceUtils", "getDeviceId: from oaid");
                strA = authCapability.getOaid();
            }
            if (TextUtils.isEmpty(strA)) {
                String strA2 = a(a(context));
                if (TextUtils.isEmpty(strA2)) {
                    strA2 = a(a());
                }
                if (TextUtils.isEmpty(strA2)) {
                    strA2 = a(b());
                }
                if (TextUtils.isEmpty(strA2) && Build.VERSION.SDK_INT >= 26) {
                    try {
                        strA2 = a(Build.getSerial());
                    } catch (Exception e) {
                        Logger.b("DeviceUtils", "getSerial: " + e.getMessage());
                    }
                }
                strA = strA2;
                if (TextUtils.isEmpty(strA) || c(strA)) {
                    strA = a(UUID.randomUUID().toString());
                }
                if (!TextUtils.isEmpty(strA) && !z) {
                    e.a(context, "aivs_did.xml", "device_id", strA);
                }
            } else if (!TextUtils.isEmpty(strA)) {
                e.a(context, "aivs_did.xml", "device_id", strA);
            }
        } else if (!TextUtils.isEmpty(strA)) {
            e.a(context, "aivs_did.xml", "device_id", strA);
        }
        throw th;
        return strA;
    }
}
