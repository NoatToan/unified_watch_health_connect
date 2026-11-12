package com.google.zxing.client.result;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.Result;
import com.tencent.connect.common.Constants;
import com.xiaomi.hm.health.bt.model.HMDeviceState;
import com.xiaomi.hm.health.bt.model.HMDisplaySetting;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class ExpandedProductResultParser extends ResultParser {
    private static String g(int i, String str) {
        if (str.charAt(i) != '(') {
            return null;
        }
        String strSubstring = str.substring(i + 1);
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < strSubstring.length(); i2++) {
            char cCharAt = strSubstring.charAt(i2);
            if (cCharAt == ')') {
                return sb.toString();
            }
            if (cCharAt < '0' || cCharAt > '9') {
                return null;
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    private static String h(int i, String str) {
        StringBuilder sb = new StringBuilder();
        String strSubstring = str.substring(i);
        for (int i2 = 0; i2 < strSubstring.length(); i2++) {
            char cCharAt = strSubstring.charAt(i2);
            if (cCharAt != '(') {
                sb.append(cCharAt);
            } else {
                if (g(i2, strSubstring) != null) {
                    break;
                }
                sb.append('(');
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:13:0x004f  */
    @Override // com.google.zxing.client.result.ResultParser
    public ExpandedProductParsedResult parse(Result result) {
        ExpandedProductParsedResult expandedProductParsedResult = null;
        if (result.getBarcodeFormat() != BarcodeFormat.RSS_EXPANDED) {
            return null;
        }
        String massagedText = ResultParser.getMassagedText(result);
        HashMap map = new HashMap();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String strSubstring = null;
        String str10 = null;
        String strSubstring2 = null;
        String strSubstring3 = null;
        int length = 0;
        while (length < massagedText.length()) {
            String strG = g(length, massagedText);
            if (strG == null) {
                return expandedProductParsedResult;
            }
            byte b = 2;
            int length2 = length + strG.length() + 2;
            String strH = h(length2, massagedText);
            length = length2 + strH.length();
            switch (strG.hashCode()) {
                case 1536:
                    if (!strG.equals("00")) {
                        b = -1;
                    } else {
                        b = 0;
                    }
                    break;
                case HMDeviceState.DEVICE_STATE_UPGRADE_RES /* 1537 */:
                    if (!strG.equals("01")) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                    break;
                case 1567:
                    if (!strG.equals("10")) {
                        b = -1;
                    }
                    break;
                case 1568:
                    if (!strG.equals("11")) {
                        b = -1;
                    } else {
                        b = 3;
                    }
                    break;
                case 1570:
                    if (!strG.equals("13")) {
                        b = -1;
                    } else {
                        b = 4;
                    }
                    break;
                case 1572:
                    if (!strG.equals(Constants.VIA_REPORT_TYPE_WPA_STATE)) {
                        b = -1;
                    } else {
                        b = 5;
                    }
                    break;
                case 1574:
                    if (!strG.equals(Constants.VIA_REPORT_TYPE_START_GROUP)) {
                        b = -1;
                    } else {
                        b = 6;
                    }
                    break;
                case 1567966:
                    if (!strG.equals("3100")) {
                        b = -1;
                    } else {
                        b = 7;
                    }
                    break;
                case 1567967:
                    if (!strG.equals("3101")) {
                        b = -1;
                    } else {
                        b = 8;
                    }
                    break;
                case 1567968:
                    if (!strG.equals("3102")) {
                        b = -1;
                    } else {
                        b = 9;
                    }
                    break;
                case 1567969:
                    if (!strG.equals("3103")) {
                        b = -1;
                    } else {
                        b = 10;
                    }
                    break;
                case 1567970:
                    if (!strG.equals("3104")) {
                        b = -1;
                    } else {
                        b = 11;
                    }
                    break;
                case 1567971:
                    if (!strG.equals("3105")) {
                        b = -1;
                    } else {
                        b = 12;
                    }
                    break;
                case 1567972:
                    if (!strG.equals("3106")) {
                        b = -1;
                    } else {
                        b = 13;
                    }
                    break;
                case 1567973:
                    if (!strG.equals("3107")) {
                        b = -1;
                    } else {
                        b = 14;
                    }
                    break;
                case 1567974:
                    if (!strG.equals("3108")) {
                        b = -1;
                    } else {
                        b = 15;
                    }
                    break;
                case 1567975:
                    if (!strG.equals("3109")) {
                        b = -1;
                    } else {
                        b = 16;
                    }
                    break;
                case 1568927:
                    if (!strG.equals("3200")) {
                        b = -1;
                    } else {
                        b = 17;
                    }
                    break;
                case 1568928:
                    if (!strG.equals("3201")) {
                        b = -1;
                    } else {
                        b = 18;
                    }
                    break;
                case 1568929:
                    if (!strG.equals("3202")) {
                        b = -1;
                    } else {
                        b = 19;
                    }
                    break;
                case 1568930:
                    if (!strG.equals("3203")) {
                        b = -1;
                    } else {
                        b = 20;
                    }
                    break;
                case 1568931:
                    if (!strG.equals("3204")) {
                        b = -1;
                    } else {
                        b = 21;
                    }
                    break;
                case 1568932:
                    if (!strG.equals("3205")) {
                        b = -1;
                    } else {
                        b = 22;
                    }
                    break;
                case 1568933:
                    if (!strG.equals("3206")) {
                        b = -1;
                    } else {
                        b = 23;
                    }
                    break;
                case 1568934:
                    if (!strG.equals("3207")) {
                        b = -1;
                    } else {
                        b = 24;
                    }
                    break;
                case 1568935:
                    if (!strG.equals("3208")) {
                        b = -1;
                    } else {
                        b = 25;
                    }
                    break;
                case 1568936:
                    if (!strG.equals("3209")) {
                        b = -1;
                    } else {
                        b = 26;
                    }
                    break;
                case 1575716:
                    if (!strG.equals("3920")) {
                        b = -1;
                    } else {
                        b = 27;
                    }
                    break;
                case 1575717:
                    if (!strG.equals("3921")) {
                        b = -1;
                    } else {
                        b = 28;
                    }
                    break;
                case 1575718:
                    if (!strG.equals("3922")) {
                        b = -1;
                    } else {
                        b = 29;
                    }
                    break;
                case 1575719:
                    if (!strG.equals("3923")) {
                        b = -1;
                    } else {
                        b = 30;
                    }
                    break;
                case 1575747:
                    if (!strG.equals("3930")) {
                        b = -1;
                    } else {
                        b = 31;
                    }
                    break;
                case 1575748:
                    if (!strG.equals("3931")) {
                        b = -1;
                    } else {
                        b = 32;
                    }
                    break;
                case 1575749:
                    if (!strG.equals("3932")) {
                        b = -1;
                    } else {
                        b = 33;
                    }
                    break;
                case 1575750:
                    if (!strG.equals("3933")) {
                        b = -1;
                    } else {
                        b = HMDisplaySetting.TYPE_HAWK_SWK;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                    str2 = strH;
                    expandedProductParsedResult = null;
                    break;
                case 1:
                    str = strH;
                    expandedProductParsedResult = null;
                    break;
                case 2:
                    str3 = strH;
                    expandedProductParsedResult = null;
                    break;
                case 3:
                    str4 = strH;
                    expandedProductParsedResult = null;
                    break;
                case 4:
                    str5 = strH;
                    expandedProductParsedResult = null;
                    break;
                case 5:
                    str6 = strH;
                    expandedProductParsedResult = null;
                    break;
                case 6:
                    str7 = strH;
                    expandedProductParsedResult = null;
                    break;
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                    strSubstring = strG.substring(3);
                    str9 = ExpandedProductParsedResult.KILOGRAM;
                    str8 = strH;
                    expandedProductParsedResult = null;
                    break;
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    strSubstring = strG.substring(3);
                    str9 = ExpandedProductParsedResult.POUND;
                    str8 = strH;
                    expandedProductParsedResult = null;
                    break;
                case 27:
                case 28:
                case 29:
                case 30:
                    strSubstring2 = strG.substring(3);
                    str10 = strH;
                    expandedProductParsedResult = null;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    if (strH.length() < 4) {
                        return null;
                    }
                    String strSubstring4 = strH.substring(3);
                    strSubstring3 = strH.substring(0, 3);
                    str10 = strSubstring4;
                    expandedProductParsedResult = null;
                    strSubstring2 = strG.substring(3);
                    break;
                default:
                    map.put(strG, strH);
                    expandedProductParsedResult = null;
                    break;
            }
        }
        return new ExpandedProductParsedResult(massagedText, str, str2, str3, str4, str5, str6, str7, str8, str9, strSubstring, str10, strSubstring2, strSubstring3, map);
    }
}
