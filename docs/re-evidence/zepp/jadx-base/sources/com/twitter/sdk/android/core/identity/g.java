package com.twitter.sdk.android.core.identity;

/* JADX INFO: loaded from: classes18.dex */
class g extends Exception {
    private static final long serialVersionUID = -7397331487240298819L;
    private final int a;
    private final String b;

    public g(int i, String str, String str2) {
        super(str);
        this.a = i;
        this.b = str2;
    }

    public String a() {
        return getMessage();
    }

    public int b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }
}
