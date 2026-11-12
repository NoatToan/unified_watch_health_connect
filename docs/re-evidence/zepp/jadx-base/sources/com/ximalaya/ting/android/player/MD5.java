package com.ximalaya.ting.android.player;

import android.text.TextUtils;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.math.BigInteger;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes22.dex */
public class MD5 {
    public static String getFileNameMd5(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int iIndexOf = str.indexOf("?");
        int iIndexOf2 = str.indexOf(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE, 7);
        if (iIndexOf == -1) {
            iIndexOf = str.length();
        }
        return md5(str.substring(iIndexOf2, iIndexOf));
    }

    public static String md5(byte[] bArr) {
        String string = "";
        if (bArr != null) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(bArr);
                string = new BigInteger(1, messageDigest.digest()).toString(16);
                while (string.length() < 32) {
                    string = "0" + string;
                }
            } catch (Exception e) {
                Logger.log("md5加密出错" + e.getMessage());
            }
        }
        return string;
    }

    public static String md5(String str) {
        if (str != null) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(str.getBytes());
                str = new BigInteger(1, messageDigest.digest()).toString(16);
                while (str.length() < 32) {
                    str = "0" + str;
                }
            } catch (Exception e) {
                Logger.log("md5加密出错" + e.getMessage());
            }
        }
        return str;
    }
}
