package com.huawei.hms.findnetwork.comm.util;

import android.text.TextUtils;
import com.huawei.secure.android.common.anonymization.Anonymizer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes10.dex */
public class MaskUtil {
    private static final int DEVICEID_LEN = 64;
    private static final int EXTRACT_FIRST_SIX_BYTE_STRING_LENGTH = 8;
    private static final int EXTRACT_MAC_STRING_LENGTH = 12;
    private static final int FID_LENGTH = 22;
    private static final int FIRST_SIX_BYTE_STRING_LENGTH = 12;
    private static final int HALF_MASK = 2;
    private static final int MAC_STRING_LENGTH = 17;
    private static final int MASK_LENGTH = 12;
    static final int MASK_LIMITS = 30;
    static final int MASK_PER = 3;
    private static final String STARTWITH_FID_REGEX = "\\b[A-Za-z0-9]{4}-[A-Za-z0-9]{3}-\\d{6}-[A-Za-z0-9]{6}.*";
    private static final String STARTWITH_MAC_REGEX = "^[A-F0-9]{2}(:[A-F0-9]{2}){5}.*";
    private static final int UID_MASK_LENGTH = 10;
    private static final int WITH_SEPARATOR_MAC_LEN = 17;

    public static String stringToMask(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length() / 3;
        if (length <= 30) {
            return Anonymizer.maskCommonString(str, length, length);
        }
        return maskCommon(str.substring(0, 30)) + "***" + maskCommon(str.substring(str.length() - 30));
    }

    public static String maskWithFixedLength(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        if (length < i) {
            return "***";
        }
        int i2 = i / 2;
        return (str.substring(0, i2) + "***") + str.substring(length - i2);
    }

    public static String maskUid(String str) {
        return TextUtils.isEmpty(str) ? "" : maskWithFixedLength(str, 10);
    }

    public static String maskStartWithSnOrMac(String str) {
        int i;
        StringBuilder sb;
        String strMaskMac;
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (!Pattern.matches(STARTWITH_FID_REGEX, str)) {
            if (Pattern.matches(STARTWITH_MAC_REGEX, str)) {
                i = 17;
                if (str.length() <= 17) {
                    return maskMac(str);
                }
                sb = new StringBuilder();
                strMaskMac = maskMac(str.substring(0, 17));
            } else {
                i = 64;
                if (str.length() == 64) {
                    return maskSn(str);
                }
                if (str.length() <= 64) {
                    return maskCommon(str);
                }
                sb = new StringBuilder();
            }
            sb.append(strMaskMac);
            sb.append(str.substring(i));
            return sb.toString();
        }
        i = 22;
        if (str.length() <= 22) {
            return maskSn(str);
        }
        sb = new StringBuilder();
        strMaskMac = maskSn(str.substring(0, i));
        sb.append(strMaskMac);
        sb.append(str.substring(i));
        return sb.toString();
    }

    public static String maskSn(String str) {
        return maskWithFixedLength(str, 12);
    }

    public static String maskPublicKey(String str) {
        return maskWithFixedLength(str, 12);
    }

    public static String maskMac(String str) {
        StringBuilder sb;
        String str2;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int length = str.length();
        if (length == 17) {
            sb = new StringBuilder();
            sb.append(str.substring(0, 12));
            str2 = "**:**";
        } else {
            if (length != 12) {
                return maskCommon(str);
            }
            sb = new StringBuilder();
            sb.append(str.substring(0, 8));
            str2 = "****";
        }
        sb.append(str2);
        return sb.toString();
    }

    public static String maskCommon(String str) {
        return stringToMask(str);
    }

    public static List<String> getMaskSnList(List<String> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(maskStartWithSnOrMac(it.next()));
        }
        return arrayList;
    }
}
