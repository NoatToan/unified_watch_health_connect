package com.google.zxing.client.result;

/* JADX INFO: loaded from: classes4.dex */
public final class ProductParsedResult extends ParsedResult {
    private final String b;
    private final String c;

    public ProductParsedResult(String str) {
        this(str, str);
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        return this.b;
    }

    public String getNormalizedProductID() {
        return this.c;
    }

    public String getProductID() {
        return this.b;
    }

    public ProductParsedResult(String str, String str2) {
        super(ParsedResultType.PRODUCT);
        this.b = str;
        this.c = str2;
    }
}
