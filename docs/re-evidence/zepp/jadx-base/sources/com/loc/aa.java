package com.loc;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public final class aa extends q {
    private byte[] a;
    private String b;

    public aa(byte[] bArr, String str) {
        this.b = "1";
        this.a = (byte[]) bArr.clone();
        this.b = str;
    }

    @Override // com.loc.au
    public final Map<String, String> b() {
        HashMap map = new HashMap();
        map.put("Content-Type", "application/zip");
        map.put("Content-Length", String.valueOf(this.a.length));
        return map;
    }

    @Override // com.loc.au
    public final Map<String, String> b_() {
        return null;
    }

    @Override // com.loc.au
    public final String c() {
        String strC = u.c(v.c);
        byte[] bArrA = u.a(v.b);
        byte[] bArr = new byte[bArrA.length + 50];
        System.arraycopy(this.a, 0, bArr, 0, 50);
        System.arraycopy(bArrA, 0, bArr, 50, bArrA.length);
        return String.format(strC, "1", this.b, "1", "open", r.a(bArr));
    }

    @Override // com.loc.au
    public final byte[] e() {
        return this.a;
    }
}
