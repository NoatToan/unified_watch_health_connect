package com.google.zxing.client.result;

import com.google.zxing.Result;

/* JADX INFO: loaded from: classes4.dex */
public final class BookmarkDoCoMoResultParser extends a {
    @Override // com.google.zxing.client.result.ResultParser
    public URIParsedResult parse(Result result) {
        String text = result.getText();
        if (!text.startsWith("MEBKM:")) {
            return null;
        }
        String strH = a.h("TITLE:", text, true);
        String[] strArrG = a.g("URL:", text, true);
        if (strArrG == null) {
            return null;
        }
        String str = strArrG[0];
        if (URIResultParser.g(str)) {
            return new URIParsedResult(str, strH);
        }
        return null;
    }
}
