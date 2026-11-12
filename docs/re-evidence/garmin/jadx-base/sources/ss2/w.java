package ss2;

import android.text.TextUtils;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes7.dex */
public interface w {

    public static final class a {
        public static void a(String str, w wVar) {
            byte[] bArrD;
            str.getClass();
            Logger logger = ss2.a.f160776a;
            if (TextUtils.isEmpty(str)) {
                bArrD = null;
            } else {
                try {
                    bArrD = n.d(new int[]{Integer.parseInt(str)});
                    if (bArrD.length < 16) {
                        byte[] bArr = new byte[16];
                        System.arraycopy(bArrD, 0, bArr, 0, bArrD.length);
                        bArrD = bArr;
                    }
                } catch (NumberFormatException unused) {
                    bArrD = null;
                }
            }
            bArrD.getClass();
            wVar.a(bArrD);
        }
    }

    void a(byte[] bArr);

    void b(String str);
}
