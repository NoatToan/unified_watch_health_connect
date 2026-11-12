package com.google.zxing.client.result;

import com.google.zxing.Result;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class EmailDoCoMoResultParser extends a {
    private static final Pattern f = Pattern.compile("[a-zA-Z0-9@.!#$%&'*+\\-/=?^_`{|}~]+");

    public static boolean i(String str) {
        return str != null && f.matcher(str).matches() && str.indexOf(64) >= 0;
    }

    @Override // com.google.zxing.client.result.ResultParser
    public EmailAddressParsedResult parse(Result result) {
        String[] strArrG;
        String massagedText = ResultParser.getMassagedText(result);
        if (!massagedText.startsWith("MATMSG:") || (strArrG = a.g("TO:", massagedText, true)) == null) {
            return null;
        }
        for (String str : strArrG) {
            if (!i(str)) {
                return null;
            }
        }
        return new EmailAddressParsedResult(strArrG, null, null, a.h("SUB:", massagedText, false), a.h("BODY:", massagedText, false));
    }
}
