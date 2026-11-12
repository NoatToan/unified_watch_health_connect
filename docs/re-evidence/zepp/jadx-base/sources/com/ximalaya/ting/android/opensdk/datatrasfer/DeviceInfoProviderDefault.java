package com.ximalaya.ting.android.opensdk.datatrasfer;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.ximalaya.ting.android.opensdk.util.NetworkType;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes22.dex */
public abstract class DeviceInfoProviderDefault implements IDeviceInfoProvider {
    private static final String MAC_FORMAT = "%02X:";
    public static final String RESULT_UNDEFINED = "undefined";
    private static final String WLAN0 = "wlan0";
    private static String mCachedMacAddress;
    private static String mImei;
    private static String mSerialDeviceId;
    private Context mContext;

    public DeviceInfoProviderDefault(Context context) {
        this.mContext = context.getApplicationContext();
    }

    @Nullable
    public static String getIMEI(Context context) {
        try {
            return getIMEIAndNotDefual(context, false);
        } catch (Exception unused) {
            return "";
        }
    }

    public static String getIMEIAndNotDefault(Context context, TelephonyManager telephonyManager, boolean z) throws Exception {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            return "";
        }
        String str = mImei;
        if (str != null && !TextUtils.equals(RESULT_UNDEFINED, str) && !z) {
            return mImei;
        }
        try {
            if (ContextCompat.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") != 0) {
                return "";
            }
            if (i >= 26) {
                mImei = telephonyManager.getImei();
            }
            return mImei;
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("未获取到imei");
        }
    }

    public static String getIMEIAndNotDefual(Context context, boolean z) throws Exception {
        return context == null ? "" : getIMEIAndNotDefault(context, (TelephonyManager) getSystemService(context, "phone"), z);
    }

    public static String getLocalMacAddress(Context context) {
        if (!TextUtils.isEmpty(mCachedMacAddress)) {
            return mCachedMacAddress;
        }
        if (Build.VERSION.SDK_INT < 23) {
            mCachedMacAddress = getLocalMacAddressOnLessM(context);
        } else if (NetworkType.isConnectToWifi(context)) {
            mCachedMacAddress = getLocalMacAddressOnM();
        }
        return mCachedMacAddress;
    }

    private static String getLocalMacAddressOnLessM(Context context) {
        WifiManager wifiManager;
        if (context == null || (wifiManager = (WifiManager) getSystemService(context, "wifi")) == null) {
            return "";
        }
        WifiInfo connectionInfo = null;
        try {
            connectionInfo = wifiManager.getConnectionInfo();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connectionInfo == null ? "" : connectionInfo.getMacAddress();
    }

    private static String getLocalMacAddressOnM() {
        Enumeration<NetworkInterface> networkInterfaces;
        try {
            networkInterfaces = NetworkInterface.getNetworkInterfaces();
        } catch (SocketException e) {
            e.printStackTrace();
            networkInterfaces = null;
        }
        if (networkInterfaces == null) {
            return "";
        }
        byte[] hardwareAddress = null;
        while (networkInterfaces.hasMoreElements()) {
            NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
            if (networkInterfaceNextElement != null) {
                try {
                    hardwareAddress = networkInterfaceNextElement.getHardwareAddress();
                } catch (SocketException e2) {
                    e2.printStackTrace();
                }
                if (hardwareAddress != null && hardwareAddress.length != 0) {
                    StringBuilder sb = new StringBuilder();
                    for (byte b : hardwareAddress) {
                        sb.append(String.format(MAC_FORMAT, Byte.valueOf(b)));
                    }
                    if (sb.length() > 0) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                    String string = sb.toString();
                    if (TextUtils.equals(WLAN0, networkInterfaceNextElement.getName())) {
                        return string;
                    }
                }
            }
        }
        return null;
    }

    public static String getSerialDeviceId(Context context) throws Exception {
        if (!TextUtils.isEmpty(mSerialDeviceId)) {
            return mSerialDeviceId;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            try {
                if (ContextCompat.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") != 0) {
                    return "";
                }
                mSerialDeviceId = Build.getSerial();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (i > 9) {
            mSerialDeviceId = Build.SERIAL;
        }
        String str = mSerialDeviceId;
        if (str == null || str.equalsIgnoreCase("unknown")) {
            String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
            mSerialDeviceId = string;
            if (string == null || string.equalsIgnoreCase("android_id") || mSerialDeviceId.equalsIgnoreCase("9774d56d682e549c")) {
                throw new Exception("FATAL!!!! - This device doesn't have a UNIQUE Serial Number");
            }
        }
        return mSerialDeviceId;
    }

    public static <T> T getSystemService(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return null;
        }
        return (T) context.getSystemService(str);
    }

    @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDeviceInfoProvider
    public String imei() {
        return getIMEI(this.mContext);
    }

    @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDeviceInfoProvider
    public String macAddress() {
        return getLocalMacAddress(this.mContext);
    }

    @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDeviceInfoProvider
    @Nullable
    public String serial() {
        try {
            return getSerialDeviceId(this.mContext);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
