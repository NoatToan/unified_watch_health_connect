package com.google.zxing.datamatrix.encoder;

import kotlinx.serialization.json.internal.JsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
class c implements f {
    private int c(g gVar, StringBuilder sb, StringBuilder sb2, int i) {
        int length = sb.length();
        sb.delete(length - i, length);
        gVar.f--;
        int iD = d(gVar.d(), sb2);
        gVar.l();
        return iD;
    }

    private static String e(CharSequence charSequence, int i) {
        int iCharAt = (charSequence.charAt(i) * 1600) + (charSequence.charAt(i + 1) * '(') + charSequence.charAt(i + 2) + 1;
        return new String(new char[]{(char) (iCharAt / 256), (char) (iCharAt % 256)});
    }

    public static void g(g gVar, StringBuilder sb) {
        gVar.t(e(sb, 0));
        sb.delete(0, 3);
    }

    @Override // com.google.zxing.datamatrix.encoder.f
    public int a() {
        return 1;
    }

    @Override // com.google.zxing.datamatrix.encoder.f
    public void b(g gVar) {
        StringBuilder sb = new StringBuilder();
        while (gVar.j()) {
            char cD = gVar.d();
            gVar.f++;
            int iD = d(cD, sb);
            int iA = gVar.a() + ((sb.length() / 3) << 1);
            gVar.r(iA);
            int dataCapacity = gVar.h().getDataCapacity() - iA;
            if (!gVar.j()) {
                StringBuilder sb2 = new StringBuilder();
                if (sb.length() % 3 == 2 && (dataCapacity < 2 || dataCapacity > 2)) {
                    iD = c(gVar, sb, sb2, iD);
                }
                while (sb.length() % 3 == 1 && ((iD <= 3 && dataCapacity != 1) || iD > 3)) {
                    iD = c(gVar, sb, sb2, iD);
                }
                break;
            }
            if (sb.length() % 3 == 0 && HighLevelEncoder.l(gVar.e(), gVar.f, a()) != a()) {
                gVar.p(0);
                break;
            }
        }
        f(gVar, sb);
    }

    public int d(char c, StringBuilder sb) {
        if (c == ' ') {
            sb.append((char) 3);
            return 1;
        }
        if (c >= '0' && c <= '9') {
            sb.append((char) ((c - '0') + 4));
            return 1;
        }
        if (c >= 'A' && c <= 'Z') {
            sb.append((char) ((c - 'A') + 14));
            return 1;
        }
        if (c < ' ') {
            sb.append((char) 0);
            sb.append(c);
            return 2;
        }
        if (c >= '!' && c <= '/') {
            sb.append((char) 1);
            sb.append((char) (c - '!'));
            return 2;
        }
        if (c >= ':' && c <= '@') {
            sb.append((char) 1);
            sb.append((char) ((c - JsonLexerKt.COLON) + 15));
            return 2;
        }
        if (c >= '[' && c <= '_') {
            sb.append((char) 1);
            sb.append((char) ((c - JsonLexerKt.BEGIN_LIST) + 22));
            return 2;
        }
        if (c < '`' || c > 127) {
            sb.append("\u0001\u001e");
            return d((char) (c - 128), sb) + 2;
        }
        sb.append((char) 2);
        sb.append((char) (c - '`'));
        return 2;
    }

    public void f(g gVar, StringBuilder sb) {
        int length = (sb.length() / 3) << 1;
        int length2 = sb.length() % 3;
        int iA = gVar.a() + length;
        gVar.r(iA);
        int dataCapacity = gVar.h().getDataCapacity() - iA;
        if (length2 == 2) {
            sb.append((char) 0);
            while (sb.length() >= 3) {
                g(gVar, sb);
            }
            if (gVar.j()) {
                gVar.s((char) 254);
            }
        } else if (dataCapacity == 1 && length2 == 1) {
            while (sb.length() >= 3) {
                g(gVar, sb);
            }
            if (gVar.j()) {
                gVar.s((char) 254);
            }
            gVar.f--;
        } else {
            if (length2 != 0) {
                throw new IllegalStateException("Unexpected case. Please report!");
            }
            while (sb.length() >= 3) {
                g(gVar, sb);
            }
            if (dataCapacity > 0 || gVar.j()) {
                gVar.s((char) 254);
            }
        }
        gVar.p(0);
    }
}
