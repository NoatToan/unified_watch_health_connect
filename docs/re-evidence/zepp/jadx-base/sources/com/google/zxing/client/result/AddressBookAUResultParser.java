package com.google.zxing.client.result;

import com.google.zxing.Result;
import java.util.ArrayList;
import kotlinx.serialization.json.internal.JsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public final class AddressBookAUResultParser extends ResultParser {
    private static String[] g(String str, int i, String str2, boolean z) {
        ArrayList arrayList = null;
        for (int i2 = 1; i2 <= i; i2++) {
            String strD = ResultParser.d(str + i2 + JsonLexerKt.COLON, str2, '\r', z);
            if (strD == null) {
                break;
            }
            if (arrayList == null) {
                arrayList = new ArrayList(i);
            }
            arrayList.add(strD);
        }
        if (arrayList == null) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @Override // com.google.zxing.client.result.ResultParser
    public AddressBookParsedResult parse(Result result) {
        String massagedText = ResultParser.getMassagedText(result);
        if (!massagedText.contains("MEMORY") || !massagedText.contains("\r\n")) {
            return null;
        }
        String strD = ResultParser.d("NAME1:", massagedText, '\r', true);
        String strD2 = ResultParser.d("NAME2:", massagedText, '\r', true);
        String[] strArrG = g("TEL", 3, massagedText, true);
        String[] strArrG2 = g("MAIL", 3, massagedText, true);
        String strD3 = ResultParser.d("MEMORY:", massagedText, '\r', false);
        String strD4 = ResultParser.d("ADD:", massagedText, '\r', true);
        return new AddressBookParsedResult(ResultParser.maybeWrap(strD), null, strD2, strArrG, null, strArrG2, null, null, strD3, strD4 != null ? new String[]{strD4} : null, null, null, null, null, null, null);
    }
}
