package com.huawei.hwdevice.phoneprocess.mgr.exercise.utils.seuqneceutils;

import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.mvg;
import defpackage.mvj;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class DetailsFieldParser implements SequenceDetailFieldProcessor {
    private static final int BASE_10 = 10;
    private static final int FIELD_TYPE_INDEX = 2;
    private static final int HEX = 16;
    private static final int INDEX_0 = 0;
    private static final int INDEX_10 = 10;
    private static final int INDEX_12 = 12;
    private static final int INDEX_14 = 14;
    private static final int INDEX_16 = 16;
    private static final int INDEX_2 = 2;
    private static final int INDEX_4 = 4;
    private static final int INDEX_6 = 6;
    private static final int INDEX_8 = 8;
    private static final int LONG_MAX_VALUE_IN_BASE_10 = 18;
    private static final int LONG_MAX_VALU_IN_MAX_RADIX = 12;
    private static final int ONE_BYTE_LENGTH = 2;
    private static final String SEMICOLON = ";";
    private static final String TAG = "DetailsFieldParser";
    private static final String TAG_RELEASE = "BTSYNC_DetailsFieldParser";
    private String markPoint = "";
    private List<String> mFieldNameList = new ArrayList(10);
    private List<Integer> mFieldSizeList = new ArrayList(10);
    private List<String> mFieldTypeList = new ArrayList(10);

    public boolean isOldParseFunc(mvg mvgVar) {
        if (mvgVar == null) {
            return false;
        }
        return !TextUtils.isEmpty(SequenceDetailFieldConfig.getConfig(String.valueOf(mvgVar.d()), String.valueOf(mvgVar.c())));
    }

    @Override // com.huawei.hwdevice.phoneprocess.mgr.exercise.utils.seuqneceutils.SequenceDetailFieldProcessor
    public String detailParse(mvg mvgVar) {
        initFieldConfig(String.valueOf(mvgVar.d()), String.valueOf(mvgVar.c()));
        List<mvj> listB = mvgVar.b();
        Iterator<Integer> it = this.mFieldSizeList.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += it.next().intValue() * 2;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<mvj> it2 = listB.iterator();
        while (it2.hasNext()) {
            String strD = it2.next().d();
            LogUtil.a(TAG, "detailData is ", strD);
            dealDetail(iIntValue, sb, strD);
        }
        LogUtil.a(TAG, "last result is ", sb.toString());
        return sb.toString();
    }

    private void dealDetail(int i, StringBuilder sb, String str) {
        int length = str.length();
        if (length % i != 0) {
            ReleaseLogUtil.e(TAG_RELEASE, "detailDataLength not divisor");
            return;
        }
        int i2 = length / i;
        int size = this.mFieldNameList.size();
        ReleaseLogUtil.d(TAG_RELEASE, "detailDataLength: ", Integer.valueOf(length), ", structNum: ", Integer.valueOf(i), ", structureLength: ", Integer.valueOf(i2), ", filedNum: ", Integer.valueOf(size));
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            sb.append(this.markPoint);
            int i5 = 0;
            while (i5 < size) {
                String str2 = this.mFieldNameList.get(i5);
                int iIntValue = this.mFieldSizeList.get(i5).intValue() * 2;
                String str3 = this.mFieldTypeList.get(i5);
                int i6 = i3 + iIntValue;
                String strSubstring = str.substring(i3, i6);
                String strHexStrToValue = hexStrToValue(endiannessProcess(strSubstring, str3), str3);
                LogUtil.a(TAG, "fieldName :", str2, ", filedType: ", str3, ", fieldSize: ", Integer.valueOf(iIntValue), ", fieldValue: ", strSubstring, ", value: ", strHexStrToValue);
                sb.append(str2);
                sb.append("=");
                sb.append(strHexStrToValue);
                sb.append(";");
                i5++;
                i3 = i6;
            }
            LogUtil.a(TAG, "next start: ", Integer.valueOf(i3));
            sb.append(System.lineSeparator());
        }
    }

    private String endiannessProcess(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.e(TAG_RELEASE, "endiannessProcess warn, data empty");
            return str;
        }
        if (SequenceDetailFieldConfig.UINT16.equals(str2)) {
            str = twoByteEndianness(str);
        } else if (SequenceDetailFieldConfig.UINT32.equals(str2) || "float".equals(str2)) {
            str = fourByteEndianness(str);
        } else if (SequenceDetailFieldConfig.UINT64.equals(str2) || SequenceDetailFieldConfig.DOUBLE.equals(str2)) {
            str = eightByteEndianness(str);
        } else {
            LogUtil.a(TAG, "endiannessProcess not need");
        }
        LogUtil.a(TAG, "endiannessProcess result: ", str);
        return str;
    }

    private void initFieldConfig(String str, String str2) {
        ReleaseLogUtil.d(TAG_RELEASE, "initFieldConfig version: ", str2, ", dicId: ", str);
        String config = SequenceDetailFieldConfig.getConfig(str, str2);
        if (config.startsWith("tp=")) {
            String[] strArrSplit = config.split("\\|");
            this.markPoint = strArrSplit[0] + ";";
            config = strArrSplit[1];
        }
        for (String str3 : config.split(";")) {
            String[] strArrSplit2 = str3.split(":");
            this.mFieldNameList.add(strArrSplit2[0]);
            this.mFieldSizeList.add(Integer.valueOf(Integer.parseInt(strArrSplit2[1])));
            this.mFieldTypeList.add(strArrSplit2[2]);
        }
        LogUtil.a(TAG, "initFieldConfig done");
    }

    private String twoByteEndianness(String str) {
        return str.substring(2, 4) + str.substring(0, 2);
    }

    private String fourByteEndianness(String str) {
        return str.substring(6, 8) + str.substring(4, 6) + str.substring(2, 4) + str.substring(0, 2);
    }

    private String eightByteEndianness(String str) {
        return str.substring(14, 16) + str.substring(12, 14) + str.substring(10, 12) + str.substring(8, 10) + str.substring(6, 8) + str.substring(4, 6) + str.substring(2, 4) + str.substring(0, 2);
    }

    private String hexStrToValue(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (SequenceDetailFieldConfig.UINT8.equals(str2) || SequenceDetailFieldConfig.UINT16.equals(str2)) {
            str = String.valueOf(Integer.parseInt(str, 16));
        } else if (SequenceDetailFieldConfig.UINT32.equals(str2)) {
            str = String.valueOf(Long.parseLong(str, 16));
        } else if (SequenceDetailFieldConfig.DOUBLE.equals(str2)) {
            str = String.valueOf(hexStrToDouble(str));
        } else if (SequenceDetailFieldConfig.UINT64.equals(str2)) {
            str = hexStrToUnsignedLongStr(str);
        } else if ("float".equals(str2)) {
            str = String.valueOf(hexStrToFloat(str));
        }
        LogUtil.a(TAG, "hexStrToValue is: ", str);
        return str;
    }

    private double hexStrToDouble(String str) {
        return Double.longBitsToDouble(new BigInteger(str, 16).longValue());
    }

    private float hexStrToFloat(String str) {
        return Float.intBitsToFloat(new BigInteger(str, 16).intValue());
    }

    private String hexStrToUnsignedLongStr(String str) {
        return TextUtils.isEmpty(str) ? str : String.valueOf(Long.parseUnsignedLong(str, 16));
    }

    private long parseUnsignedLong(String str, int i) {
        int length = str.length();
        if (length <= 12 || (i == 10 && length <= 18)) {
            return Long.parseLong(str, i);
        }
        int i2 = length - 1;
        return (Long.parseLong(str.substring(0, i2), i) * ((long) i)) + ((long) Character.digit(str.charAt(i2), i));
    }
}
