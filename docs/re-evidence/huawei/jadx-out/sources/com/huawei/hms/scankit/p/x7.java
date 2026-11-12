package com.huawei.hms.scankit.p;

import com.huawei.hms.ml.scan.HmsScan;
import com.huawei.hms.mlsdk.asr.MLAsrConstants;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.operation.utils.Constants;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes34.dex */
public final class x7 extends t6 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f16422b = Pattern.compile("\r?\n[ \t]");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f16423c = Pattern.compile("=");
    private static final Pattern d = Pattern.compile(";");
    private static final Pattern e = Pattern.compile("(?<!\\\\);+");
    static final String[] f = new String[0];

    protected static int a(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        if (c2 >= 'a' && c2 <= 'f') {
            return c2 - 'W';
        }
        if (c2 < 'A' || c2 > 'F') {
            return -1;
        }
        return c2 - '7';
    }

    static List b(CharSequence charSequence, String str, boolean z, boolean z2) {
        boolean z3;
        String str2;
        ArrayList arrayList;
        int length = str.length();
        Pattern patternCompile = Pattern.compile("(?:^|\n)" + ((Object) charSequence) + "(?:;([^:\n(?![ |\t])]*))?:");
        int i = 0;
        ArrayList arrayList2 = null;
        while (i < length) {
            Matcher matcher = patternCompile.matcher(str);
            if (i > 0) {
                i--;
            }
            if (!matcher.find(i)) {
                break;
            }
            int iEnd = matcher.end(0);
            String strGroup = matcher.group(1);
            if (strGroup != null) {
                z3 = false;
                ArrayList arrayList3 = null;
                String str3 = null;
                for (String str4 : d.split(strGroup)) {
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList(1);
                    }
                    arrayList3.add(str4);
                    String[] strArrSplit = f16423c.split(str4, 2);
                    if (strArrSplit.length > 1) {
                        if (MLAsrConstants.WAVE_PAINE_ENCODING.equalsIgnoreCase(strArrSplit[0]) && "QUOTED-PRINTABLE".equalsIgnoreCase(strArrSplit[1])) {
                            z3 = true;
                        } else if ("CHARSET".equalsIgnoreCase(strArrSplit[0])) {
                            str3 = strArrSplit[1];
                        }
                    }
                }
                arrayList = arrayList3;
                str2 = str3;
            } else {
                z3 = false;
                str2 = null;
                arrayList = null;
            }
            int iA = a(iEnd, str, z3);
            if (iA < 0) {
                iA = length;
            } else if (iA > iEnd) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                }
                if (iA >= 1) {
                    int i2 = iA - 1;
                    if (str.charAt(i2) == '\r') {
                        iA = i2;
                    }
                }
                a(str.substring(iEnd, iA), z, z3, str2, z2, arrayList, arrayList2);
            }
            i = iA + 1;
        }
        return arrayList2;
    }

    @Override // com.huawei.hms.scankit.p.t6
    public HmsScan b(s6 s6Var) {
        String strA = t6.a(s6Var);
        if (!strA.startsWith("BEGIN:VCARD")) {
            return null;
        }
        String str = strA + "\n";
        String strA2 = a("N", str, true, false);
        if (strA2 == null || strA2.isEmpty() || strA2.split(";").length == 0) {
            return null;
        }
        String strA3 = a("FN", str, true, false);
        if (strA3 == null || strA3.isEmpty()) {
            strA3 = c(strA2);
        }
        String str2 = strA3;
        List listB = b("TEL", str, true, false);
        List listB2 = b(CommonConstant.RETKEY.EMAIL, str, true, false);
        List listB3 = b("ADR", str, true, true);
        return new HmsScan(s6Var.k(), t6.a(s6Var.c()), str2, HmsScan.CONTACT_DETAIL_FORM, s6Var.i(), t6.a(s6Var.j()), null, new z6(new HmsScan.ContactDetail(a(strA2, str2), a("TITLE", str, true, false), a("ORG", str, true, true), c(b(listB), a(listB)), b(b(listB2), a(listB2)), a(b(listB3), a(listB3)), a(b("URL", str, true, false)), null)));
    }

    private static String a(CharSequence charSequence, String str) {
        char cCharAt;
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        while (i < length) {
            char cCharAt2 = charSequence.charAt(i);
            if (cCharAt2 != '\n' && cCharAt2 != '\r') {
                if (cCharAt2 != '=') {
                    a(byteArrayOutputStream, str, sb);
                    sb.append(cCharAt2);
                } else if (i < length - 2 && (cCharAt = charSequence.charAt(i + 1)) != '\r' && cCharAt != '\n') {
                    i += 2;
                    char cCharAt3 = charSequence.charAt(i);
                    int iA = a(cCharAt);
                    int iA2 = a(cCharAt3);
                    if (iA >= 0 && iA2 >= 0) {
                        byteArrayOutputStream.write((iA << 4) + iA2);
                    }
                }
            }
            i++;
        }
        a(byteArrayOutputStream, str, sb);
        return sb.toString();
    }

    static int a(int i, String str, boolean z) {
        int iIndexOf;
        while (true) {
            iIndexOf = str.indexOf(10, i);
            if (iIndexOf < 0) {
                break;
            }
            if (iIndexOf < str.length() - 1) {
                int i2 = iIndexOf + 1;
                if (str.charAt(i2) == ' ' || str.charAt(i2) == '\t') {
                    i = iIndexOf + 2;
                }
            }
            if (!z || (!a(iIndexOf, 1, str) && !a(iIndexOf, 2, str))) {
                break;
            }
            i = iIndexOf + 1;
        }
        return iIndexOf;
    }

    private static String c(String str) {
        int iIndexOf;
        if (str == null || str.isEmpty()) {
            return null;
        }
        String[] strArr = new String[5];
        int i = 0;
        int i2 = 0;
        while (i < 4 && (iIndexOf = str.indexOf(59, i2)) >= 0) {
            strArr[i] = str.substring(i2, iIndexOf);
            i++;
            i2 = iIndexOf + 1;
        }
        strArr[i] = str.substring(i2);
        StringBuilder sb = new StringBuilder(100);
        a(strArr, 3, sb);
        a(strArr, 1, sb);
        a(strArr, 2, sb);
        a(strArr, 0, sb);
        a(strArr, 4, sb);
        return sb.toString().trim();
    }

    private static String[] b(Collection collection) {
        String strSubstring;
        if (collection != null && !collection.isEmpty()) {
            ArrayList arrayList = new ArrayList(collection.size());
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                List list = (List) it.next();
                String str = (String) list.get(0);
                if (str != null && !str.isEmpty()) {
                    int i = 1;
                    while (true) {
                        if (i >= list.size()) {
                            strSubstring = null;
                            break;
                        }
                        strSubstring = (String) list.get(i);
                        int iIndexOf = strSubstring.indexOf(61);
                        if (iIndexOf < 0) {
                            break;
                        }
                        if ("TYPE".equals(strSubstring.substring(0, iIndexOf))) {
                            strSubstring = strSubstring.substring(iIndexOf + 1);
                            break;
                        }
                        i++;
                    }
                    arrayList.add(strSubstring);
                }
            }
            return (String[]) arrayList.toArray(f);
        }
        return new String[0];
    }

    private static String a(CharSequence charSequence, String str, boolean z, boolean z2) {
        List<List> listB = b(charSequence, str, z, z2);
        String str2 = "";
        if (listB != null && !listB.isEmpty()) {
            for (List list : listB) {
                if (list.get(0) != null && !((String) list.get(0)).isEmpty()) {
                    str2 = (String) list.get(0);
                }
            }
        }
        return str2;
    }

    private static HmsScan.TelPhoneNumber[] c(String[] strArr, String[] strArr2) {
        if (strArr.length != strArr2.length) {
            return new HmsScan.TelPhoneNumber[0];
        }
        HmsScan.TelPhoneNumber[] telPhoneNumberArr = new HmsScan.TelPhoneNumber[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            int i2 = HmsScan.TelPhoneNumber.OTHER_USE_TYPE;
            HmsScan.TelPhoneNumber telPhoneNumber = new HmsScan.TelPhoneNumber(i2, strArr2[i]);
            String str = strArr[i];
            if (str != null) {
                if (str.equals("WORK")) {
                    telPhoneNumber.useType = HmsScan.TelPhoneNumber.OFFICE_USE_TYPE;
                } else if (strArr[i].equals(Constants.HOME)) {
                    telPhoneNumber.useType = HmsScan.TelPhoneNumber.RESIDENTIAL_USE_TYPE;
                } else if (strArr[i].equals("CELL")) {
                    telPhoneNumber.useType = HmsScan.TelPhoneNumber.CELLPHONE_NUMBER_USE_TYPE;
                } else if (strArr[i].equals("FAX")) {
                    telPhoneNumber.useType = HmsScan.TelPhoneNumber.FAX_USE_TYPE;
                } else {
                    telPhoneNumber.useType = i2;
                }
            }
            telPhoneNumberArr[i] = telPhoneNumber;
        }
        return telPhoneNumberArr;
    }

    private static HmsScan.EmailContent[] b(String[] strArr, String[] strArr2) {
        if (strArr.length != strArr2.length) {
            return new HmsScan.EmailContent[0];
        }
        HmsScan.EmailContent[] emailContentArr = new HmsScan.EmailContent[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            HmsScan.EmailContent emailContent = new HmsScan.EmailContent(strArr2[i], "", "", HmsScan.EmailContent.OTHER_USE_TYPE);
            String str = strArr[i];
            if (str != null) {
                if (str.equals("WORK")) {
                    emailContent.addressType = HmsScan.EmailContent.OFFICE_USE_TYPE;
                } else if (strArr[i].equals(Constants.HOME)) {
                    emailContent.addressType = HmsScan.TelPhoneNumber.RESIDENTIAL_USE_TYPE;
                }
            }
            emailContentArr[i] = emailContent;
        }
        return emailContentArr;
    }

    private static boolean a(int i, int i2, String str) {
        return i >= i2 && str.charAt(i - i2) == '=';
    }

    static void a(String str, boolean z, boolean z2, String str2, boolean z3, List list, List list2) {
        String strReplaceAll;
        if (z) {
            str = str.trim();
        }
        if (z2) {
            strReplaceAll = a((CharSequence) str, str2);
            if (z3) {
                strReplaceAll = e.matcher(strReplaceAll).replaceAll(" ").trim();
            }
        } else {
            if (z3) {
                str = e.matcher(str).replaceAll(" ").trim();
            }
            strReplaceAll = f16422b.matcher(str).replaceAll("");
        }
        if (list == null) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(strReplaceAll);
            list2.add(arrayList);
        } else {
            list.add(0, strReplaceAll);
            list2.add(list);
        }
    }

    private static void a(String[] strArr, int i, StringBuilder sb) {
        String str = strArr[i];
        if (str == null || str.isEmpty()) {
            return;
        }
        if (sb.length() > 0) {
            sb.append(' ');
        }
        sb.append(strArr[i]);
    }

    private static void a(ByteArrayOutputStream byteArrayOutputStream, String str, StringBuilder sb) {
        String str2;
        if (byteArrayOutputStream.size() > 0) {
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (str == null) {
                str2 = new String(byteArray, StandardCharsets.UTF_8);
            } else {
                try {
                    str2 = new String(byteArray, str);
                } catch (UnsupportedEncodingException unused) {
                    str2 = new String(byteArray, StandardCharsets.UTF_8);
                }
            }
            byteArrayOutputStream.reset();
            sb.append(str2);
        }
    }

    private static String[] a(Collection collection) {
        if (collection != null && !collection.isEmpty()) {
            ArrayList arrayList = new ArrayList(collection.size());
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                String str = (String) ((List) it.next()).get(0);
                if (str != null && !str.isEmpty()) {
                    arrayList.add(str);
                }
            }
            return (String[]) arrayList.toArray(f);
        }
        return new String[0];
    }

    private static HmsScan.AddressInfo[] a(String[] strArr, String[] strArr2) {
        if (strArr.length != strArr2.length) {
            return new HmsScan.AddressInfo[0];
        }
        HmsScan.AddressInfo[] addressInfoArr = new HmsScan.AddressInfo[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            HmsScan.AddressInfo addressInfo = new HmsScan.AddressInfo(new String[]{strArr2[i]}, HmsScan.AddressInfo.OTHER_USE_TYPE);
            String str = strArr[i];
            if (str != null) {
                if (str.equals("WORK")) {
                    addressInfo.addressType = HmsScan.AddressInfo.OFFICE_TYPE;
                } else if (strArr[i].equals(Constants.HOME)) {
                    addressInfo.addressType = HmsScan.AddressInfo.RESIDENTIAL_USE_TYPE;
                }
            }
            addressInfoArr[i] = addressInfo;
        }
        return addressInfoArr;
    }

    private static HmsScan.PeopleName a(String str, String str2) {
        HmsScan.PeopleName peopleName = new HmsScan.PeopleName("", "", "", "", "", "", "");
        if (str != null) {
            String[] strArrSplit = str.split(";");
            if (strArrSplit.length > 0) {
                peopleName.familyName = strArrSplit[0];
            }
            if (strArrSplit.length > 1) {
                peopleName.givenName = strArrSplit[1];
            }
            if (strArrSplit.length > 2) {
                peopleName.middleName = strArrSplit[2];
            }
            if (strArrSplit.length > 3) {
                peopleName.namePrefix = strArrSplit[3];
            }
            if (strArrSplit.length > 4) {
                peopleName.nameSuffix = strArrSplit[4];
            }
        }
        if (str2 != null) {
            peopleName.fullName = str2;
        }
        return peopleName;
    }
}
