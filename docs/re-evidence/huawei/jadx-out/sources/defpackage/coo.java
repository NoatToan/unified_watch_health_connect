package defpackage;

import android.text.TextUtils;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class coo {
    public static cmd b(cmg cmgVar, List<cmb> list) {
        if (cmgVar == null || list == null) {
            return null;
        }
        cmd cmdVar = new cmd();
        cmdVar.c(cmgVar.i());
        cmdVar.d(cmgVar.c());
        cmdVar.e(list);
        cmdVar.a(cmgVar.e());
        cmdVar.e(cmgVar.h());
        return cmdVar;
    }

    public static int e(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        return cnm.d().c(str);
    }
}
