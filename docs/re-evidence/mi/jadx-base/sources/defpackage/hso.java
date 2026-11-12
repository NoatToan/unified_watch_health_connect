package defpackage;

import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;

/* JADX INFO: loaded from: classes5.dex */
public class hso {
    public static final hso[] i;
    public static hso[] j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20413b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    static {
        hso[] hsoVarArr = {new hso(false, 3, 5, 8, 8, 1), new hso(false, 5, 7, 10, 10, 1), new hso(true, 5, 7, 16, 6, 1), new hso(false, 8, 10, 12, 12, 1), new hso(true, 10, 11, 14, 6, 2), new hso(false, 12, 12, 14, 14, 1), new hso(true, 16, 14, 24, 10, 1), new hso(false, 18, 14, 16, 16, 1), new hso(false, 22, 18, 18, 18, 1), new hso(true, 22, 18, 16, 10, 2), new hso(false, 30, 20, 20, 20, 1), new hso(true, 32, 24, 16, 14, 2), new hso(false, 36, 24, 22, 22, 1), new hso(false, 44, 28, 24, 24, 1), new hso(true, 49, 28, 22, 14, 2), new hso(false, 62, 36, 14, 14, 4), new hso(false, 86, 42, 16, 16, 4), new hso(false, 114, 48, 18, 18, 4), new hso(false, 144, 56, 20, 20, 4), new hso(false, 174, 68, 22, 22, 4), new hso(false, 204, 84, 24, 24, 4, 102, 42), new hso(false, 280, 112, 14, 14, 16, 140, 56), new hso(false, 368, 144, 16, 16, 16, 92, 36), new hso(false, 456, 192, 18, 18, 16, 114, 48), new hso(false, 576, SportReportBaseParser.ReportType.avgFreq, 20, 20, 16, 144, 56), new hso(false, 696, 272, 22, 22, 16, 174, 68), new hso(false, 816, 336, 24, 24, 16, 136, 56), new hso(false, 1050, 408, 18, 18, 36, 175, 68), new hso(false, 1304, 496, 20, 20, 36, 163, 62), new im5()};
        i = hsoVarArr;
        j = hsoVarArr;
    }

    public hso(boolean z, int i2, int i3, int i4, int i5, int i6) {
        this(z, i2, i3, i4, i5, i6, i2, i3);
    }

    public static hso l(int i2, SymbolShapeHint symbolShapeHint, dx6 dx6Var, dx6 dx6Var2, boolean z) {
        for (hso hsoVar : j) {
            if (!(symbolShapeHint == SymbolShapeHint.FORCE_SQUARE && hsoVar.f20412a) && ((symbolShapeHint != SymbolShapeHint.FORCE_RECTANGLE || hsoVar.f20412a) && ((dx6Var == null || (hsoVar.j() >= dx6Var.b() && hsoVar.i() >= dx6Var.a())) && ((dx6Var2 == null || (hsoVar.j() <= dx6Var2.b() && hsoVar.i() <= dx6Var2.a())) && i2 <= hsoVar.f20413b)))) {
                return hsoVar;
            }
        }
        if (z) {
            throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: ".concat(String.valueOf(i2)));
        }
        return null;
    }

    public final int a() {
        return this.f20413b;
    }

    public int b(int i2) {
        return this.g;
    }

    public final int c() {
        return this.c;
    }

    public final int d(int i2) {
        return this.h;
    }

    public final int e() {
        int i2 = this.f;
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2 && i2 != 4) {
                if (i2 == 16) {
                    return 4;
                }
                if (i2 == 36) {
                    return 6;
                }
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
        }
        return i3;
    }

    public int f() {
        return this.f20413b / this.g;
    }

    public final int g() {
        return k() * this.e;
    }

    public final int h() {
        return e() * this.d;
    }

    public final int i() {
        return g() + (k() << 1);
    }

    public final int j() {
        return h() + (e() << 1);
    }

    public final int k() {
        int i2 = this.f;
        if (i2 == 1 || i2 == 2) {
            return 1;
        }
        if (i2 == 4) {
            return 2;
        }
        if (i2 == 16) {
            return 4;
        }
        if (i2 == 36) {
            return 6;
        }
        throw new IllegalStateException("Cannot handle this number of data regions");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f20412a ? "Rectangular Symbol:" : "Square Symbol:");
        sb.append(" data region ");
        sb.append(this.d);
        sb.append('x');
        sb.append(this.e);
        sb.append(", symbol size ");
        sb.append(j());
        sb.append('x');
        sb.append(i());
        sb.append(", symbol data size ");
        sb.append(h());
        sb.append('x');
        sb.append(g());
        sb.append(", codewords ");
        sb.append(this.f20413b);
        sb.append('+');
        sb.append(this.c);
        return sb.toString();
    }

    public hso(boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f20412a = z;
        this.f20413b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
    }
}
