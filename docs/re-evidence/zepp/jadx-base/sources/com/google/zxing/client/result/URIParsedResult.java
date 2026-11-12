package com.google.zxing.client.result;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class URIParsedResult extends ParsedResult {
    private static final Pattern d = Pattern.compile(":/*([^/@]+)@[^/]+");
    private final String b;
    private final String c;

    public URIParsedResult(String str, String str2) {
        super(ParsedResultType.URI);
        this.b = b(str);
        this.c = str2;
    }

    private static boolean a(String str, int i) {
        int i2 = i + 1;
        int iIndexOf = str.indexOf(47, i2);
        if (iIndexOf < 0) {
            iIndexOf = str.length();
        }
        return ResultParser.isSubstringOfDigits(str, i2, iIndexOf - i2);
    }

    private static String b(String str) {
        String strTrim = str.trim();
        int iIndexOf = strTrim.indexOf(58);
        return (iIndexOf < 0 || a(strTrim, iIndexOf)) ? "http://".concat(strTrim) : strTrim;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        StringBuilder sb = new StringBuilder(30);
        ParsedResult.maybeAppend(this.c, sb);
        ParsedResult.maybeAppend(this.b, sb);
        return sb.toString();
    }

    public String getTitle() {
        return this.c;
    }

    public String getURI() {
        return this.b;
    }

    public boolean isPossiblyMaliciousURI() {
        return d.matcher(this.b).find();
    }
}
