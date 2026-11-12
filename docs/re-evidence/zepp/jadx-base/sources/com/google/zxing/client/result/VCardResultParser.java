package com.google.zxing.client.result;

import com.facebook.share.internal.ShareConstants;
import com.google.zxing.Result;
import com.huami.android.zxing.Intents;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import io.netty.util.internal.StringUtil;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes4.dex */
public final class VCardResultParser extends ResultParser {
    private static final Pattern f = Pattern.compile("BEGIN:VCARD", 2);
    private static final Pattern g = Pattern.compile("\\d{4}-?\\d{2}-?\\d{2}");
    private static final Pattern h = Pattern.compile("\r\n[ \t]");
    private static final Pattern i = Pattern.compile("\\\\[nN]");
    private static final Pattern j = Pattern.compile("\\\\([,;\\\\])");
    private static final Pattern k = Pattern.compile(SearchCriteria.EQ);
    private static final Pattern l = Pattern.compile(";");
    private static final Pattern m = Pattern.compile("(?<!\\\\);+");
    private static final Pattern n = Pattern.compile(",");
    private static final Pattern o = Pattern.compile("[;,]");

    private static String g(CharSequence charSequence, String str) {
        char cCharAt;
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i2 = 0;
        while (i2 < length) {
            char cCharAt2 = charSequence.charAt(i2);
            if (cCharAt2 != '\n' && cCharAt2 != '\r') {
                if (cCharAt2 != '=') {
                    m(byteArrayOutputStream, str, sb);
                    sb.append(cCharAt2);
                } else if (i2 < length - 2 && (cCharAt = charSequence.charAt(i2 + 1)) != '\r' && cCharAt != '\n') {
                    i2 += 2;
                    char cCharAt3 = charSequence.charAt(i2);
                    int hexDigit = ResultParser.parseHexDigit(cCharAt);
                    int hexDigit2 = ResultParser.parseHexDigit(cCharAt3);
                    if (hexDigit >= 0 && hexDigit2 >= 0) {
                        byteArrayOutputStream.write((hexDigit << 4) + hexDigit2);
                    }
                }
            }
            i2++;
        }
        m(byteArrayOutputStream, str, sb);
        return sb.toString();
    }

    private static void h(Iterable<List<String>> iterable) {
        int iIndexOf;
        if (iterable != null) {
            for (List<String> list : iterable) {
                String str = list.get(0);
                String[] strArr = new String[5];
                int i2 = 0;
                int i3 = 0;
                while (i2 < 4 && (iIndexOf = str.indexOf(59, i3)) >= 0) {
                    strArr[i2] = str.substring(i3, iIndexOf);
                    i2++;
                    i3 = iIndexOf + 1;
                }
                strArr[i2] = str.substring(i3);
                StringBuilder sb = new StringBuilder(100);
                l(strArr, 3, sb);
                l(strArr, 1, sb);
                l(strArr, 2, sb);
                l(strArr, 0, sb);
                l(strArr, 4, sb);
                list.set(0, sb.toString().trim());
            }
        }
    }

    private static boolean i(CharSequence charSequence) {
        return charSequence == null || g.matcher(charSequence).matches();
    }

    public static List<String> j(CharSequence charSequence, String str, boolean z, boolean z2) {
        List<List<String>> listK = k(charSequence, str, z, z2);
        if (listK == null || listK.isEmpty()) {
            return null;
        }
        return listK.get(0);
    }

    public static List<List<String>> k(CharSequence charSequence, String str, boolean z, boolean z2) {
        ArrayList arrayList;
        boolean z3;
        String str2;
        String str3;
        int iIndexOf;
        String strReplaceAll;
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        ArrayList arrayList2 = null;
        while (i3 < length) {
            int i4 = 2;
            Matcher matcher = Pattern.compile("(?:^|\n)" + ((Object) charSequence) + "(?:;([^:]*))?:", 2).matcher(str);
            if (i3 > 0) {
                i3--;
            }
            if (!matcher.find(i3)) {
                break;
            }
            int iEnd = matcher.end(i2);
            String strGroup = matcher.group(1);
            if (strGroup != null) {
                String[] strArrSplit = l.split(strGroup);
                int length2 = strArrSplit.length;
                int i5 = 0;
                arrayList = null;
                z3 = false;
                str2 = null;
                str3 = null;
                while (i5 < length2) {
                    String str4 = strArrSplit[i5];
                    if (arrayList == null) {
                        arrayList = new ArrayList(1);
                    }
                    arrayList.add(str4);
                    String[] strArrSplit2 = k.split(str4, i4);
                    if (strArrSplit2.length > 1) {
                        String str5 = strArrSplit2[0];
                        String str6 = strArrSplit2[1];
                        if ("ENCODING".equalsIgnoreCase(str5) && "QUOTED-PRINTABLE".equalsIgnoreCase(str6)) {
                            z3 = true;
                        } else if ("CHARSET".equalsIgnoreCase(str5)) {
                            str2 = str6;
                        } else if ("VALUE".equalsIgnoreCase(str5)) {
                            str3 = str6;
                        }
                    }
                    i5++;
                    i4 = 2;
                }
            } else {
                arrayList = null;
                z3 = false;
                str2 = null;
                str3 = null;
            }
            int i6 = iEnd;
            while (true) {
                iIndexOf = str.indexOf(10, i6);
                if (iIndexOf < 0) {
                    break;
                }
                if (iIndexOf < str.length() - 1) {
                    int i7 = iIndexOf + 1;
                    if (str.charAt(i7) == ' ' || str.charAt(i7) == '\t') {
                        i6 = iIndexOf + 2;
                    }
                }
                if (!z3 || ((iIndexOf <= 0 || str.charAt(iIndexOf - 1) != '=') && (iIndexOf < 2 || str.charAt(iIndexOf - 2) != '='))) {
                    break;
                }
                i6 = iIndexOf + 1;
            }
            if (iIndexOf < 0) {
                i3 = length;
            } else {
                if (iIndexOf > iEnd) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                    }
                    if (iIndexOf > 0 && str.charAt(iIndexOf - 1) == '\r') {
                        iIndexOf--;
                    }
                    String strSubstring = str.substring(iEnd, iIndexOf);
                    if (z) {
                        strSubstring = strSubstring.trim();
                    }
                    if (z3) {
                        strReplaceAll = g(strSubstring, str2);
                        if (z2) {
                            strReplaceAll = m.matcher(strReplaceAll).replaceAll("\n").trim();
                        }
                    } else {
                        if (z2) {
                            strSubstring = m.matcher(strSubstring).replaceAll("\n").trim();
                        }
                        strReplaceAll = j.matcher(i.matcher(h.matcher(strSubstring).replaceAll("")).replaceAll("\n")).replaceAll("$1");
                    }
                    if ("uri".equals(str3)) {
                        try {
                            strReplaceAll = URI.create(strReplaceAll).getSchemeSpecificPart();
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                    if (arrayList == null) {
                        ArrayList arrayList3 = new ArrayList(1);
                        arrayList3.add(strReplaceAll);
                        arrayList2.add(arrayList3);
                    } else {
                        arrayList.add(0, strReplaceAll);
                        arrayList2.add(arrayList);
                    }
                }
                i3 = iIndexOf + 1;
            }
            i2 = 0;
        }
        return arrayList2;
    }

    private static void l(String[] strArr, int i2, StringBuilder sb) {
        if (strArr[i2] == null || strArr[i2].isEmpty()) {
            return;
        }
        if (sb.length() > 0) {
            sb.append(StringUtil.SPACE);
        }
        sb.append(strArr[i2]);
    }

    private static void m(ByteArrayOutputStream byteArrayOutputStream, String str, StringBuilder sb) {
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

    private static String n(List<String> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    private static String[] o(Collection<List<String>> collection) {
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<List<String>> it2 = collection.iterator();
        while (it2.hasNext()) {
            String str = it2.next().get(0);
            if (str != null && !str.isEmpty()) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    private static String[] p(Collection<List<String>> collection) {
        String strSubstring;
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (List<String> list : collection) {
            String str = list.get(0);
            if (str != null && !str.isEmpty()) {
                int i2 = 1;
                while (true) {
                    if (i2 >= list.size()) {
                        strSubstring = null;
                        break;
                    }
                    strSubstring = list.get(i2);
                    int iIndexOf = strSubstring.indexOf(61);
                    if (iIndexOf < 0) {
                        break;
                    }
                    if (Intents.WifiConnect.TYPE.equalsIgnoreCase(strSubstring.substring(0, iIndexOf))) {
                        strSubstring = strSubstring.substring(iIndexOf + 1);
                        break;
                    }
                    i2++;
                }
                arrayList.add(strSubstring);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @Override // com.google.zxing.client.result.ResultParser
    public AddressBookParsedResult parse(Result result) {
        String massagedText = ResultParser.getMassagedText(result);
        Matcher matcher = f.matcher(massagedText);
        if (!matcher.find() || matcher.start() != 0) {
            return null;
        }
        List<List<String>> listK = k("FN", massagedText, true, false);
        if (listK == null) {
            listK = k("N", massagedText, true, false);
            h(listK);
        }
        List<String> listJ = j("NICKNAME", massagedText, true, false);
        String[] strArrSplit = listJ == null ? null : n.split(listJ.get(0));
        List<List<String>> listK2 = k("TEL", massagedText, true, false);
        List<List<String>> listK3 = k("EMAIL", massagedText, true, false);
        List<String> listJ2 = j("NOTE", massagedText, false, false);
        List<List<String>> listK4 = k("ADR", massagedText, true, true);
        List<String> listJ3 = j("ORG", massagedText, true, true);
        List<String> listJ4 = j("BDAY", massagedText, true, false);
        List<String> list = (listJ4 == null || i(listJ4.get(0))) ? listJ4 : null;
        List<String> listJ5 = j(ShareConstants.TITLE, massagedText, true, false);
        List<List<String>> listK5 = k(DTransferConstants.URL, massagedText, true, false);
        List<String> listJ6 = j("IMPP", massagedText, true, false);
        List<String> listJ7 = j("GEO", massagedText, true, false);
        String[] strArrSplit2 = listJ7 == null ? null : o.split(listJ7.get(0));
        return new AddressBookParsedResult(o(listK), strArrSplit, null, o(listK2), p(listK2), o(listK3), p(listK3), n(listJ6), n(listJ2), o(listK4), p(listK4), n(listJ3), n(list), n(listJ5), o(listK5), (strArrSplit2 == null || strArrSplit2.length == 2) ? strArrSplit2 : null);
    }
}
