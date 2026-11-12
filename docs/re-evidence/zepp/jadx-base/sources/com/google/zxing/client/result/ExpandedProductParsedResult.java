package com.google.zxing.client.result;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class ExpandedProductParsedResult extends ParsedResult {
    public static final String KILOGRAM = "KG";
    public static final String POUND = "LB";
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final String k;
    private final String l;
    private final String m;
    private final String n;
    private final String o;
    private final Map<String, String> p;

    public ExpandedProductParsedResult(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Map<String, String> map) {
        super(ParsedResultType.PRODUCT);
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
        this.k = str10;
        this.l = str11;
        this.m = str12;
        this.n = str13;
        this.o = str14;
        this.p = map;
    }

    private static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    private static int b(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ExpandedProductParsedResult)) {
            return false;
        }
        ExpandedProductParsedResult expandedProductParsedResult = (ExpandedProductParsedResult) obj;
        return a(this.c, expandedProductParsedResult.c) && a(this.d, expandedProductParsedResult.d) && a(this.e, expandedProductParsedResult.e) && a(this.f, expandedProductParsedResult.f) && a(this.h, expandedProductParsedResult.h) && a(this.i, expandedProductParsedResult.i) && a(this.j, expandedProductParsedResult.j) && a(this.k, expandedProductParsedResult.k) && a(this.l, expandedProductParsedResult.l) && a(this.m, expandedProductParsedResult.m) && a(this.n, expandedProductParsedResult.n) && a(this.o, expandedProductParsedResult.o) && a(this.p, expandedProductParsedResult.p);
    }

    public String getBestBeforeDate() {
        return this.h;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        return String.valueOf(this.b);
    }

    public String getExpirationDate() {
        return this.i;
    }

    public String getLotNumber() {
        return this.e;
    }

    public String getPackagingDate() {
        return this.g;
    }

    public String getPrice() {
        return this.m;
    }

    public String getPriceCurrency() {
        return this.o;
    }

    public String getPriceIncrement() {
        return this.n;
    }

    public String getProductID() {
        return this.c;
    }

    public String getProductionDate() {
        return this.f;
    }

    public String getRawText() {
        return this.b;
    }

    public String getSscc() {
        return this.d;
    }

    public Map<String, String> getUncommonAIs() {
        return this.p;
    }

    public String getWeight() {
        return this.j;
    }

    public String getWeightIncrement() {
        return this.l;
    }

    public String getWeightType() {
        return this.k;
    }

    public int hashCode() {
        return ((((((((((((b(this.c) ^ 0) ^ b(this.d)) ^ b(this.e)) ^ b(this.f)) ^ b(this.h)) ^ b(this.i)) ^ b(this.j)) ^ b(this.k)) ^ b(this.l)) ^ b(this.m)) ^ b(this.n)) ^ b(this.o)) ^ b(this.p);
    }
}
