package com.google.zxing.datamatrix.encoder;

import com.google.zxing.Dimension;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes4.dex */
final class g {
    private final String a;
    private SymbolShapeHint b;
    private Dimension c;
    private Dimension d;
    private final StringBuilder e;
    public int f;
    private int g;
    private SymbolInfo h;
    private int i;

    public g(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i = 0; i < length; i++) {
            char c = (char) (bytes[i] & 255);
            if (c == '?' && str.charAt(i) != '?') {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
            sb.append(c);
        }
        this.a = sb.toString();
        this.b = SymbolShapeHint.FORCE_NONE;
        this.e = new StringBuilder(str.length());
        this.g = -1;
    }

    private int i() {
        return this.a.length() - this.i;
    }

    public int a() {
        return this.e.length();
    }

    public StringBuilder b() {
        return this.e;
    }

    public char c() {
        return this.a.charAt(this.f);
    }

    public char d() {
        return this.a.charAt(this.f);
    }

    public String e() {
        return this.a;
    }

    public int f() {
        return this.g;
    }

    public int g() {
        return i() - this.f;
    }

    public SymbolInfo h() {
        return this.h;
    }

    public boolean j() {
        return this.f < i();
    }

    public void k() {
        this.g = -1;
    }

    public void l() {
        this.h = null;
    }

    public void m(Dimension dimension, Dimension dimension2) {
        this.c = dimension;
        this.d = dimension2;
    }

    public void n(int i) {
        this.i = i;
    }

    public void o(SymbolShapeHint symbolShapeHint) {
        this.b = symbolShapeHint;
    }

    public void p(int i) {
        this.g = i;
    }

    public void q() {
        r(a());
    }

    public void r(int i) {
        SymbolInfo symbolInfo = this.h;
        if (symbolInfo == null || i > symbolInfo.getDataCapacity()) {
            this.h = SymbolInfo.lookup(i, this.b, this.c, this.d, true);
        }
    }

    public void s(char c) {
        this.e.append(c);
    }

    public void t(String str) {
        this.e.append(str);
    }
}
