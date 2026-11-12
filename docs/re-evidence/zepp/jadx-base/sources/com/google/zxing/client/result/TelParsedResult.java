package com.google.zxing.client.result;

/* JADX INFO: loaded from: classes4.dex */
public final class TelParsedResult extends ParsedResult {
    private final String b;
    private final String c;
    private final String d;

    public TelParsedResult(String str, String str2, String str3) {
        super(ParsedResultType.TEL);
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        StringBuilder sb = new StringBuilder(20);
        ParsedResult.maybeAppend(this.b, sb);
        ParsedResult.maybeAppend(this.d, sb);
        return sb.toString();
    }

    public String getNumber() {
        return this.b;
    }

    public String getTelURI() {
        return this.c;
    }

    public String getTitle() {
        return this.d;
    }
}
