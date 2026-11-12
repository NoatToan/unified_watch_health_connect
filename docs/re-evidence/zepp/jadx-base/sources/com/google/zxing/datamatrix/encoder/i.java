package com.google.zxing.datamatrix.encoder;

/* JADX INFO: loaded from: classes4.dex */
final class i extends c {
    @Override // com.google.zxing.datamatrix.encoder.c, com.google.zxing.datamatrix.encoder.f
    public int a() {
        return 3;
    }

    @Override // com.google.zxing.datamatrix.encoder.c, com.google.zxing.datamatrix.encoder.f
    public void b(g gVar) {
        StringBuilder sb = new StringBuilder();
        while (gVar.j()) {
            char cD = gVar.d();
            gVar.f++;
            d(cD, sb);
            if (sb.length() % 3 == 0) {
                c.g(gVar, sb);
                if (HighLevelEncoder.l(gVar.e(), gVar.f, a()) != a()) {
                    gVar.p(0);
                    break;
                }
            }
        }
        f(gVar, sb);
    }

    @Override // com.google.zxing.datamatrix.encoder.c
    public int d(char c, StringBuilder sb) {
        if (c == '\r') {
            sb.append((char) 0);
        } else if (c == ' ') {
            sb.append((char) 3);
        } else if (c == '*') {
            sb.append((char) 1);
        } else if (c == '>') {
            sb.append((char) 2);
        } else if (c >= '0' && c <= '9') {
            sb.append((char) ((c - '0') + 4));
        } else if (c < 'A' || c > 'Z') {
            HighLevelEncoder.c(c);
        } else {
            sb.append((char) ((c - 'A') + 14));
        }
        return 1;
    }

    @Override // com.google.zxing.datamatrix.encoder.c
    public void f(g gVar, StringBuilder sb) {
        gVar.q();
        int dataCapacity = gVar.h().getDataCapacity() - gVar.a();
        gVar.f -= sb.length();
        if (gVar.g() > 1 || dataCapacity > 1 || gVar.g() != dataCapacity) {
            gVar.s((char) 254);
        }
        if (gVar.f() < 0) {
            gVar.p(0);
        }
    }
}
