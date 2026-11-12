package com.google.zxing.client.result;

import com.google.zxing.Result;
import io.netty.util.internal.StringUtil;

/* JADX INFO: loaded from: classes4.dex */
public final class AddressBookDoCoMoResultParser extends a {
    private static String i(String str) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf < 0) {
            return str;
        }
        return str.substring(iIndexOf + 1) + StringUtil.SPACE + str.substring(0, iIndexOf);
    }

    @Override // com.google.zxing.client.result.ResultParser
    public AddressBookParsedResult parse(Result result) {
        String[] strArrG;
        String massagedText = ResultParser.getMassagedText(result);
        if (!massagedText.startsWith("MECARD:") || (strArrG = a.g("N:", massagedText, true)) == null) {
            return null;
        }
        String strI = i(strArrG[0]);
        String strH = a.h("SOUND:", massagedText, true);
        String[] strArrG2 = a.g("TEL:", massagedText, true);
        String[] strArrG3 = a.g("EMAIL:", massagedText, true);
        String strH2 = a.h("NOTE:", massagedText, false);
        String[] strArrG4 = a.g("ADR:", massagedText, true);
        String strH3 = a.h("BDAY:", massagedText, true);
        return new AddressBookParsedResult(ResultParser.maybeWrap(strI), null, strH, strArrG2, null, strArrG3, null, null, strH2, strArrG4, null, a.h("ORG:", massagedText, true), !ResultParser.isStringOfDigits(strH3, 8) ? null : strH3, null, a.g("URL:", massagedText, true), null);
    }
}
