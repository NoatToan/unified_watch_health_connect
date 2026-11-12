package defpackage;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;

/* JADX INFO: loaded from: classes5.dex */
public abstract class p00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zo2 f29858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mxa f29859b;

    public p00(zo2 zo2Var) {
        this.f29858a = zo2Var;
        this.f29859b = new mxa(zo2Var);
    }

    public static p00 a(zo2 zo2Var) {
        if (zo2Var.g(1)) {
            return new p2(zo2Var);
        }
        if (!zo2Var.g(2)) {
            return new pd1(zo2Var);
        }
        int iG = mxa.g(zo2Var, 1, 4);
        if (iG == 4) {
            return new h1(zo2Var);
        }
        if (iG == 5) {
            return new o1(zo2Var);
        }
        int iG2 = mxa.g(zo2Var, 1, 5);
        if (iG2 == 12) {
            return new r1(zo2Var);
        }
        if (iG2 == 13) {
            return new u1(zo2Var);
        }
        switch (mxa.g(zo2Var, 1, 7)) {
            case 56:
                return new k2(zo2Var, "310", b4s.APPLY_CHANNEL_TOKEN2_QUICK_BIND_CARD);
            case 57:
                return new k2(zo2Var, "320", b4s.APPLY_CHANNEL_TOKEN2_QUICK_BIND_CARD);
            case 58:
                return new k2(zo2Var, "310", "13");
            case 59:
                return new k2(zo2Var, "320", "13");
            case 60:
                return new k2(zo2Var, "310", "15");
            case 61:
                return new k2(zo2Var, "320", "15");
            case 62:
                return new k2(zo2Var, "310", "17");
            case 63:
                return new k2(zo2Var, "320", "17");
            default:
                throw new IllegalStateException("unknown decoder: ".concat(String.valueOf(zo2Var)));
        }
    }

    public final mxa b() {
        return this.f29859b;
    }

    public final zo2 c() {
        return this.f29858a;
    }

    public abstract String d() throws NotFoundException, FormatException;
}
