package defpackage;

import com.xiaomi.onetrack.util.z;

/* JADX INFO: loaded from: classes3.dex */
public class l7t {
    public static boolean a(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static int[] b(String str) {
        if (a(str)) {
            return null;
        }
        if (Character.isLetter(str.codePointAt(0))) {
            str = str.substring(1);
        }
        String[] strArrSplit = str.split(z.f14007a);
        if (strArrSplit != null && strArrSplit.length >= 3) {
            try {
                int length = strArrSplit.length;
                return new int[]{Integer.parseInt(strArrSplit[length - 1]), Integer.parseInt(strArrSplit[length - 2]), Integer.parseInt(strArrSplit[length - 3])};
            } catch (Exception e) {
                t5t.d("HardwareInfo", "getHardwareData exception:" + e.getMessage());
            }
        }
        return null;
    }

    public static boolean c(String str) {
        int[] iArrB = b(str);
        return iArrB != null && iArrB.length > 2 && (iArrB[1] & 240) == 128;
    }
}
