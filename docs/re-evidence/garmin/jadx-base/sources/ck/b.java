package ck;

/* JADX INFO: loaded from: classes7.dex */
public abstract class b extends ak.a {
    @Override // ak.a
    public final byte[] b() {
        return f();
    }

    @Override // ak.a
    public final int d() {
        k kVarG = g();
        kVarG.getClass();
        switch (k.a.f27807b[kVarG.ordinal()]) {
            case 1:
                return 65;
            case 2:
                return 66;
            case 3:
                return 81;
            case 4:
                return 67;
            case 5:
                return 68;
            case 6:
                return 69;
            case 7:
                return 70;
            case 8:
                return 71;
            case 9:
            case 10:
                return 89;
            case 11:
            case 12:
                return 90;
            case 13:
                return 96;
            case 14:
                return 99;
            case 15:
                return 101;
            case 16:
                return 102;
            case 17:
                return 104;
            case 18:
                return 109;
            case 19:
                return 110;
            case 20:
                return 112;
            case 21:
                return 113;
            case 22:
                return 116;
            case 23:
                return 117;
            case 24:
                return 118;
            case 25:
                return 119;
            case 26:
                return 120;
            case 27:
                return 121;
            case 28:
                return 122;
            case 29:
                return 123;
            case 30:
                return 124;
            case 31:
                return 125;
            case 32:
                return 126;
            case 33:
                return 127;
            case 34:
            case 35:
                return 131;
            case 36:
                return 199;
            case 37:
                return 74;
            case 38:
                return 75;
            case 39:
                return 76;
            case 40:
                return 91;
            case 41:
                return 77;
            case 42:
                return 197;
            case 43:
                return 78;
            case 44:
                return 79;
            case 45:
                return 80;
            case 46:
                return 114;
            case 47:
                return 83;
            case 48:
                return 72;
            case 49:
                return 93;
            case 50:
                return 94;
            case 51:
                return 95;
            case 52:
                vb.h.s("No message ID for OTHER message type");
                return 0;
            default:
                return 0;
        }
    }

    public abstract byte[] f();

    public abstract k g();

    public final String h() {
        return g() + "(" + ak.k.a(d()) + ") ";
    }

    @Override // ak.a
    public String toString() {
        return h().concat(ak.k.b(b()));
    }
}
