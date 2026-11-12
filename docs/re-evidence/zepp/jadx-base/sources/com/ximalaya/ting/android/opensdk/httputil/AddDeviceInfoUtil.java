package com.ximalaya.ting.android.opensdk.httputil;

import android.annotation.SuppressLint;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.huami.watch.ota.UpdateUtils;
import com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest;
import com.ximalaya.ting.android.opensdk.datatrasfer.IDeviceInfoProvider;
import com.ximalaya.ting.android.opensdk.httputil.util.CrypterUtil;
import com.ximalaya.ting.android.opensdk.util.Utils;
import java.net.URLEncoder;
import okhttp3.Request;

/* JADX INFO: loaded from: classes22.dex */
public class AddDeviceInfoUtil {
    private static final String HEADER_DEVICE_INFO = "Device-Info";

    @SuppressLint({"HardwareIds"})
    public static Request setDeviceInfo(Request request) {
        String strImei;
        String string;
        String strMacAddress;
        IDeviceInfoProvider deviceInfoProvider = CommonRequest.getInstanse().getDeviceInfoProvider();
        if (deviceInfoProvider != null && request != null) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(Build.VERSION.RELEASE);
                sb.append(UpdateUtils.CMD_FILTER);
                String strOaid = deviceInfoProvider.oaid();
                if (!TextUtils.isEmpty(strOaid) && !"0".equals(strOaid) && !"00000000-0000-0000-0000-000000000000".equals(strOaid)) {
                    sb.append(strOaid);
                }
                sb.append(UpdateUtils.CMD_FILTER);
                String strSerial = null;
                try {
                    strImei = deviceInfoProvider.imei();
                } catch (Exception e) {
                    e.printStackTrace();
                    strImei = null;
                }
                if (!TextUtils.isEmpty(strImei)) {
                    sb.append(strImei);
                }
                sb.append(UpdateUtils.CMD_FILTER);
                try {
                    string = Settings.Secure.getString(Utils.getContext().getContentResolver(), "android_id");
                } catch (Exception e2) {
                    e2.printStackTrace();
                    string = null;
                }
                if (!TextUtils.isEmpty(string)) {
                    sb.append(string);
                }
                sb.append(UpdateUtils.CMD_FILTER);
                try {
                    strMacAddress = deviceInfoProvider.macAddress();
                } catch (Exception e3) {
                    e3.printStackTrace();
                    strMacAddress = null;
                }
                if (!TextUtils.isEmpty(strMacAddress)) {
                    sb.append(strMacAddress);
                }
                sb.append(UpdateUtils.CMD_FILTER);
                try {
                    strSerial = deviceInfoProvider.serial();
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
                if (!TextUtils.isEmpty(strSerial)) {
                    sb.append(strSerial);
                }
                return request.newBuilder().addHeader(HEADER_DEVICE_INFO, URLEncoder.encode(CrypterUtil.encryptStr(sb.toString(), CommonRequest.getInstanse().getAppKey()))).build();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        return request;
    }
}
