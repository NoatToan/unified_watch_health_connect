package defpackage;

import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;

/* JADX INFO: loaded from: classes5.dex */
public final class hfi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Mode f20013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ErrorCorrectionLevel f20014b;
    public bpq c;
    public int d = -1;
    public k73 e;

    public static boolean b(int i) {
        return i >= 0 && i < 8;
    }

    public k73 a() {
        return this.e;
    }

    public void c(ErrorCorrectionLevel errorCorrectionLevel) {
        this.f20014b = errorCorrectionLevel;
    }

    public void d(int i) {
        this.d = i;
    }

    public void e(k73 k73Var) {
        this.e = k73Var;
    }

    public void f(Mode mode) {
        this.f20013a = mode;
    }

    public void g(bpq bpqVar) {
        this.c = bpqVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(200);
        sb.append("<<\n");
        sb.append(" mode: ");
        sb.append(this.f20013a);
        sb.append("\n ecLevel: ");
        sb.append(this.f20014b);
        sb.append("\n version: ");
        sb.append(this.c);
        sb.append("\n maskPattern: ");
        sb.append(this.d);
        if (this.e == null) {
            sb.append("\n matrix: null\n");
        } else {
            sb.append("\n matrix:\n");
            sb.append(this.e);
        }
        sb.append(">>\n");
        return sb.toString();
    }
}
