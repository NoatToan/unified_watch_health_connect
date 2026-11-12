package com.google.zxing.datamatrix.encoder;

/* JADX INFO: loaded from: classes4.dex */
final class e implements f {
    private static void c(char c, StringBuilder sb) {
        if (c >= ' ' && c <= '?') {
            sb.append(c);
        } else if (c < '@' || c > '^') {
            HighLevelEncoder.c(c);
        } else {
            sb.append((char) (c - '@'));
        }
    }

    private static String d(CharSequence charSequence, int i) {
        int length = charSequence.length() - i;
        if (length == 0) {
            throw new IllegalStateException("StringBuilder must not be empty");
        }
        int iCharAt = (charSequence.charAt(i) << 18) + ((length >= 2 ? charSequence.charAt(i + 1) : (char) 0) << '\f') + ((length >= 3 ? charSequence.charAt(i + 2) : (char) 0) << 6) + (length >= 4 ? charSequence.charAt(i + 3) : (char) 0);
        char c = (char) ((iCharAt >> 16) & 255);
        char c2 = (char) ((iCharAt >> 8) & 255);
        char c3 = (char) (iCharAt & 255);
        StringBuilder sb = new StringBuilder(3);
        sb.append(c);
        if (length >= 2) {
            sb.append(c2);
        }
        if (length >= 3) {
            sb.append(c3);
        }
        return sb.toString();
    }

    private static void e(g gVar, CharSequence charSequence) {
        try {
            int length = charSequence.length();
            if (length == 0) {
                gVar.p(0);
                return;
            }
            boolean z = true;
            if (length == 1) {
                gVar.q();
                int dataCapacity = gVar.h().getDataCapacity() - gVar.a();
                int iG = gVar.g();
                if (iG > dataCapacity) {
                    gVar.r(gVar.a() + 1);
                    dataCapacity = gVar.h().getDataCapacity() - gVar.a();
                }
                if (iG <= dataCapacity && dataCapacity <= 2) {
                    gVar.p(0);
                    return;
                }
            }
            if (length > 4) {
                throw new IllegalStateException("Count must not exceed 4");
            }
            int i = length - 1;
            String strD = d(charSequence, 0);
            if (!(!gVar.j()) || i > 2) {
                z = false;
            }
            if (i <= 2) {
                gVar.r(gVar.a() + i);
                if (gVar.h().getDataCapacity() - gVar.a() >= 3) {
                    gVar.r(gVar.a() + strD.length());
                    z = false;
                }
            }
            if (z) {
                gVar.l();
                gVar.f -= i;
            } else {
                gVar.t(strD);
            }
            gVar.p(0);
        } catch (Throwable th) {
            gVar.p(0);
            throw th;
        }
    }

    @Override // com.google.zxing.datamatrix.encoder.f
    public int a() {
        return 4;
    }

    @Override // com.google.zxing.datamatrix.encoder.f
    public void b(g gVar) {
        StringBuilder sb = new StringBuilder();
        while (gVar.j()) {
            c(gVar.d(), sb);
            gVar.f++;
            if (sb.length() >= 4) {
                gVar.t(d(sb, 0));
                sb.delete(0, 4);
                if (HighLevelEncoder.l(gVar.e(), gVar.f, a()) != a()) {
                    gVar.p(0);
                    break;
                }
            }
        }
        sb.append((char) 31);
        e(gVar, sb);
    }
}
