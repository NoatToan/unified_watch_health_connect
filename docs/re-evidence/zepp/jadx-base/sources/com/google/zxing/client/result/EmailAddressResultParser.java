package com.google.zxing.client.result;

import androidx.core.net.MailTo;
import com.google.zxing.Result;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class EmailAddressResultParser extends ResultParser {
    private static final Pattern f = Pattern.compile(",");

    @Override // com.google.zxing.client.result.ResultParser
    public EmailAddressParsedResult parse(Result result) {
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        String str;
        String str2;
        String str3;
        String massagedText = ResultParser.getMassagedText(result);
        if (!massagedText.startsWith(MailTo.MAILTO_SCHEME) && !massagedText.startsWith("MAILTO:")) {
            if (EmailDoCoMoResultParser.i(massagedText)) {
                return new EmailAddressParsedResult(massagedText);
            }
            return null;
        }
        String strSubstring = massagedText.substring(7);
        int iIndexOf = strSubstring.indexOf(63);
        if (iIndexOf >= 0) {
            strSubstring = strSubstring.substring(0, iIndexOf);
        }
        try {
            String strF = ResultParser.f(strSubstring);
            String[] strArrSplit = !strF.isEmpty() ? f.split(strF) : null;
            Map<String, String> mapE = ResultParser.e(massagedText);
            if (mapE != null) {
                if (strArrSplit == null && (str3 = mapE.get("to")) != null) {
                    strArrSplit = f.split(str3);
                }
                String str4 = mapE.get("cc");
                String[] strArrSplit2 = str4 != null ? f.split(str4) : null;
                String str5 = mapE.get("bcc");
                String[] strArrSplit3 = str5 != null ? f.split(str5) : null;
                String str6 = mapE.get("subject");
                str2 = mapE.get("body");
                strArr = strArrSplit;
                strArr3 = strArrSplit3;
                strArr2 = strArrSplit2;
                str = str6;
            } else {
                strArr = strArrSplit;
                strArr2 = null;
                strArr3 = null;
                str = null;
                str2 = null;
            }
            return new EmailAddressParsedResult(strArr, strArr2, strArr3, str, str2);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
