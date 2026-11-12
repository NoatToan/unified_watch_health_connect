package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class c6c {
    public static List<Short> a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int length = bArr.length;
        if (length > 1440) {
            for (int i = 0; i < 1440; i++) {
                arrayList.add(Short.valueOf(q2h.c(bArr[i])));
            }
        } else {
            for (byte b2 : bArr) {
                arrayList.add(Short.valueOf(q2h.c(b2)));
            }
            int i2 = 1440 - length;
            for (int i3 = 0; i3 < i2; i3++) {
                arrayList.add((short) 0);
            }
        }
        return arrayList;
    }
}
