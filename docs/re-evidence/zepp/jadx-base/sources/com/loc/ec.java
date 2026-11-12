package com.loc;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public final class ec extends q {
    public Map<String, String> a = null;
    public Map<String, String> b = null;
    public String f = "";
    public byte[] g = null;
    private String h = null;

    public final void a(String str) {
        this.f = str;
    }

    public final void a(Map<String, String> map) {
        this.a = map;
    }

    public final void a(byte[] bArr) {
        this.g = bArr;
    }

    @Override // com.loc.au
    public final Map<String, String> b() {
        return this.a;
    }

    public final void b(String str) {
        this.h = str;
    }

    public final void b(Map<String, String> map) {
        this.b = map;
    }

    @Override // com.loc.au
    public final Map<String, String> b_() {
        return this.b;
    }

    @Override // com.loc.au
    public final String c() {
        return this.f;
    }

    @Override // com.loc.q, com.loc.au
    public final String d() {
        return !TextUtils.isEmpty(this.h) ? this.h : super.d();
    }

    @Override // com.loc.au
    public final byte[] e() {
        return this.g;
    }
}
