package defpackage;

import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes5.dex */
public final class y98 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SymbolShapeHint f39953b;
    public dx6 c;
    public dx6 d;
    public final StringBuilder e;
    public int f;
    public int g;
    public hso h;
    public int i;

    public y98(String str) {
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
        this.f39952a = sb.toString();
        this.f39953b = SymbolShapeHint.FORCE_NONE;
        this.e = new StringBuilder(str.length());
        this.g = -1;
    }

    public int a() {
        return this.e.length();
    }

    public StringBuilder b() {
        return this.e;
    }

    public char c() {
        return this.f39952a.charAt(this.f);
    }

    public String d() {
        return this.f39952a;
    }

    public int e() {
        return this.g;
    }

    public int f() {
        return h() - this.f;
    }

    public hso g() {
        return this.h;
    }

    public final int h() {
        return this.f39952a.length() - this.i;
    }

    public boolean i() {
        return this.f < h();
    }

    public void j() {
        this.g = -1;
    }

    public void k() {
        this.h = null;
    }

    public void l(dx6 dx6Var, dx6 dx6Var2) {
        this.c = dx6Var;
        this.d = dx6Var2;
    }

    public void m(int i) {
        this.i = i;
    }

    public void n(SymbolShapeHint symbolShapeHint) {
        this.f39953b = symbolShapeHint;
    }

    public void o(int i) {
        this.g = i;
    }

    public void p() {
        q(a());
    }

    public void q(int i) {
        hso hsoVar = this.h;
        if (hsoVar == null || i > hsoVar.a()) {
            this.h = hso.l(i, this.f39953b, this.c, this.d, true);
        }
    }

    public void r(char c) {
        this.e.append(c);
    }

    public void s(String str) {
        this.e.append(str);
    }
}
