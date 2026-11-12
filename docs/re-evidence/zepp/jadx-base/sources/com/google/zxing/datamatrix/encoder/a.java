package com.google.zxing.datamatrix.encoder;

/* JADX INFO: loaded from: classes4.dex */
final class a implements f {
    private static char c(char c, char c2) {
        if (HighLevelEncoder.d(c) && HighLevelEncoder.d(c2)) {
            return (char) (((c - '0') * 10) + (c2 - '0') + 130);
        }
        throw new IllegalArgumentException("not digits: " + c + c2);
    }

    @Override // com.google.zxing.datamatrix.encoder.f
    public int a() {
        return 0;
    }

    @Override // com.google.zxing.datamatrix.encoder.f
    public void b(g gVar) {
        if (HighLevelEncoder.determineConsecutiveDigitCount(gVar.e(), gVar.f) >= 2) {
            gVar.s(c(gVar.e().charAt(gVar.f), gVar.e().charAt(gVar.f + 1)));
            gVar.f += 2;
            return;
        }
        char cD = gVar.d();
        int iL = HighLevelEncoder.l(gVar.e(), gVar.f, a());
        if (iL == a()) {
            if (!HighLevelEncoder.e(cD)) {
                gVar.s((char) (cD + 1));
                gVar.f++;
                return;
            } else {
                gVar.s(HighLevelEncoder.d);
                gVar.s((char) ((cD - 128) + 1));
                gVar.f++;
                return;
            }
        }
        if (iL == 1) {
            gVar.s(HighLevelEncoder.b);
            gVar.p(1);
            return;
        }
        if (iL == 2) {
            gVar.s(HighLevelEncoder.h);
            gVar.p(2);
            return;
        }
        if (iL == 3) {
            gVar.s(HighLevelEncoder.g);
            gVar.p(3);
        } else if (iL == 4) {
            gVar.s(HighLevelEncoder.i);
            gVar.p(4);
        } else {
            if (iL != 5) {
                throw new IllegalStateException("Illegal mode: ".concat(String.valueOf(iL)));
            }
            gVar.s(HighLevelEncoder.c);
            gVar.p(5);
        }
    }
}
