package com.google.zxing.datamatrix.encoder;

import androidx.core.view.InputDeviceCompat;

/* JADX INFO: loaded from: classes4.dex */
final class b implements f {
    private static char c(char c, int i) {
        int i2 = c + ((i * 149) % 255) + 1;
        return i2 <= 255 ? (char) i2 : (char) (i2 + InputDeviceCompat.SOURCE_ANY);
    }

    @Override // com.google.zxing.datamatrix.encoder.f
    public int a() {
        return 5;
    }

    @Override // com.google.zxing.datamatrix.encoder.f
    public void b(g gVar) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) 0);
        while (gVar.j()) {
            sb.append(gVar.d());
            gVar.f++;
            if (HighLevelEncoder.l(gVar.e(), gVar.f, a()) != a()) {
                gVar.p(0);
                break;
            }
        }
        int length = sb.length() - 1;
        int iA = gVar.a() + length + 1;
        gVar.r(iA);
        boolean z = gVar.h().getDataCapacity() - iA > 0;
        if (gVar.j() || z) {
            if (length <= 249) {
                sb.setCharAt(0, (char) length);
            } else {
                if (length > 1555) {
                    throw new IllegalStateException("Message length not in valid ranges: ".concat(String.valueOf(length)));
                }
                sb.setCharAt(0, (char) ((length / 250) + 249));
                sb.insert(1, (char) (length % 250));
            }
        }
        int length2 = sb.length();
        for (int i = 0; i < length2; i++) {
            gVar.s(c(sb.charAt(i), gVar.a() + 1));
        }
    }
}
