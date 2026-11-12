package com.google.zxing.client.result;

/* JADX INFO: loaded from: classes4.dex */
public final class ISBNParsedResult extends ParsedResult {
    private final String b;

    public ISBNParsedResult(String str) {
        super(ParsedResultType.ISBN);
        this.b = str;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        return this.b;
    }

    public String getISBN() {
        return this.b;
    }
}
