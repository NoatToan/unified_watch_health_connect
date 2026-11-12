package com.google.zxing.client.result;

import com.google.zxing.Result;

/* JADX INFO: loaded from: classes4.dex */
public final class WifiResultParser extends ResultParser {
    @Override // com.google.zxing.client.result.ResultParser
    public WifiParsedResult parse(Result result) {
        String strSubstring;
        String strD;
        String massagedText = ResultParser.getMassagedText(result);
        if (!massagedText.startsWith("WIFI:") || (strD = ResultParser.d("S:", (strSubstring = massagedText.substring(5)), ';', false)) == null || strD.isEmpty()) {
            return null;
        }
        String strD2 = ResultParser.d("P:", strSubstring, ';', false);
        String strD3 = ResultParser.d("T:", strSubstring, ';', false);
        if (strD3 == null) {
            strD3 = "nopass";
        }
        return new WifiParsedResult(strD3, strD, strD2, Boolean.parseBoolean(ResultParser.d("H:", strSubstring, ';', false)), ResultParser.d("I:", strSubstring, ';', false), ResultParser.d("A:", strSubstring, ';', false), ResultParser.d("E:", strSubstring, ';', false), ResultParser.d("H:", strSubstring, ';', false));
    }
}
