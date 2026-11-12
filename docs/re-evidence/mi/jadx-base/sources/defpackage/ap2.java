package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class ap2 {
    public static zo2 a(List<aj8> list) {
        int size = list.size() << 1;
        int i = size - 1;
        if (list.get(list.size() - 1).d() == null) {
            i = size - 2;
        }
        zo2 zo2Var = new zo2(i * 12);
        int i2 = 0;
        int iB = list.get(0).d().b();
        for (int i3 = 11; i3 >= 0; i3--) {
            if (((1 << i3) & iB) != 0) {
                zo2Var.r(i2);
            }
            i2++;
        }
        for (int i4 = 1; i4 < list.size(); i4++) {
            aj8 aj8Var = list.get(i4);
            int iB2 = aj8Var.c().b();
            for (int i5 = 11; i5 >= 0; i5--) {
                if (((1 << i5) & iB2) != 0) {
                    zo2Var.r(i2);
                }
                i2++;
            }
            if (aj8Var.d() != null) {
                int iB3 = aj8Var.d().b();
                for (int i6 = 11; i6 >= 0; i6--) {
                    if (((1 << i6) & iB3) != 0) {
                        zo2Var.r(i2);
                    }
                    i2++;
                }
            }
        }
        return zo2Var;
    }
}
