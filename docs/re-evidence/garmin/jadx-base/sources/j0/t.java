package j0;

import androidx.camera.core.impl.n2;
import i3.e5;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class t {
    private t() {
    }

    public static boolean a(n2 n2Var, int... iArr) {
        if (n2Var == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        int length = iArr.length;
        int iD = 0;
        while (iD < length) {
            iD = e5.d(iArr[iD], iD, arrayList, 1);
        }
        return Collections.EMPTY_SET.containsAll(arrayList);
    }
}
