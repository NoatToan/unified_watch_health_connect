package com.xiaomi.push;

/* JADX INFO: loaded from: classes22.dex */
public class v implements x {
    private final String a;
    private final String b;

    public v(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Name may not be null");
        }
        this.a = str;
        this.b = str2;
    }

    @Override // com.xiaomi.push.x
    public String a() {
        return this.a;
    }

    @Override // com.xiaomi.push.x
    public String b() {
        return this.b;
    }
}
