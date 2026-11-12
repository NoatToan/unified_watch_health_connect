package com.huawei.hms.scankit.p;

import android.text.TextUtils;
import com.huawei.hms.ml.scan.HmsScan;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes34.dex */
public final class c extends t6 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f16012b = Pattern.compile("(?:MECARD:)([\\s\\S]+)", 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String[] f16013c = new String[0];

    private static HmsScan.TelPhoneNumber[] c(String[] strArr) {
        if (strArr != null && strArr.length != 0) {
            HmsScan.TelPhoneNumber[] telPhoneNumberArr = new HmsScan.TelPhoneNumber[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                telPhoneNumberArr[i] = new HmsScan.TelPhoneNumber(HmsScan.TelPhoneNumber.OTHER_USE_TYPE, strArr[i]);
            }
            return telPhoneNumberArr;
        }
        return new HmsScan.TelPhoneNumber[0];
    }

    private static String a(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (str2.startsWith(str)) {
                return t6.b(str2.substring(str.length()));
            }
        }
        return "";
    }

    private static String[] b(String[] strArr, String str) {
        ArrayList arrayList = new ArrayList(5);
        for (String str2 : strArr) {
            if (str2.startsWith(str)) {
                arrayList.add(t6.b(str2.substring(str.length())));
            }
        }
        return (String[]) arrayList.toArray(f16013c);
    }

    @Override // com.huawei.hms.scankit.p.t6
    public HmsScan b(s6 s6Var) {
        String strA = t6.a(s6Var);
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        Matcher matcher = f16012b.matcher(strA);
        if (!matcher.matches()) {
            return null;
        }
        String[] strArrSplit = matcher.group(1).split("(?<=(?<!\\\\)(?:\\\\\\\\){0,100});");
        String strA2 = a(strArrSplit, "N:");
        if (strA2.length() == 0) {
            return null;
        }
        String[] strArrB = b(strArrSplit, "TEL:");
        String[] strArrB2 = b(strArrSplit, "EMAIL:");
        String[] strArrB3 = b(strArrSplit, "ADR:");
        String[] strArrB4 = b(strArrSplit, "URL:");
        String strA3 = a(strArrSplit, "SOUND:");
        HmsScan.ContactDetail contactDetail = new HmsScan.ContactDetail(a(strA2, strA3), "", a(strArrSplit, "ORG:"), c(strArrB), b(strArrB2), a(strArrB3), strArrB4, a(strArrSplit, "NOTE:"));
        return new HmsScan(s6Var.k(), t6.a(s6Var.c()), contactDetail.peopleName.fullName, HmsScan.CONTACT_DETAIL_FORM, s6Var.i(), t6.a(s6Var.j()), null, new z6(contactDetail));
    }

    private static HmsScan.AddressInfo[] a(String[] strArr) {
        if (strArr != null && strArr.length != 0) {
            HmsScan.AddressInfo[] addressInfoArr = new HmsScan.AddressInfo[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                addressInfoArr[i] = new HmsScan.AddressInfo(new String[]{strArr[i]}, HmsScan.AddressInfo.OTHER_USE_TYPE);
            }
            return addressInfoArr;
        }
        return new HmsScan.AddressInfo[0];
    }

    private static HmsScan.PeopleName a(String str, String str2) {
        HmsScan.PeopleName peopleName = new HmsScan.PeopleName("", "", "", "", "", "", "");
        peopleName.spelling = str2;
        int iIndexOf = str.indexOf(",");
        if (iIndexOf < 0) {
            peopleName.fullName = str;
            String[] strArrSplit = str.split(" ");
            if (strArrSplit.length > 0) {
                peopleName.givenName = strArrSplit[0];
            }
            if (strArrSplit.length > 1) {
                peopleName.familyName = strArrSplit[1];
            }
            return peopleName;
        }
        peopleName.familyName = str.substring(0, iIndexOf);
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(",", i);
        if (iIndexOf2 < 0) {
            peopleName.givenName = str.substring(i);
        } else {
            peopleName.givenName = str.substring(i, iIndexOf2);
        }
        peopleName.fullName = peopleName.givenName + " " + peopleName.familyName;
        return peopleName;
    }

    private static HmsScan.EmailContent[] b(String[] strArr) {
        if (strArr != null && strArr.length != 0) {
            HmsScan.EmailContent[] emailContentArr = new HmsScan.EmailContent[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                emailContentArr[i] = new HmsScan.EmailContent(strArr[i], "", "", HmsScan.EmailContent.OTHER_USE_TYPE);
            }
            return emailContentArr;
        }
        return new HmsScan.EmailContent[0];
    }
}
