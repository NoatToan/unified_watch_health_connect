package defpackage;

import android.os.Process;
import com.huawei.operation.utils.Constants;

/* JADX INFO: loaded from: classes20.dex */
public class xnc {
    public static void d(String str, String str2) {
        if (xnb.c(2)) {
            xmz.b().b(new xna("I", str + Constants.LEFT_BRACKET_ONLY + Process.myTid() + Constants.RIGHT_BRACKET_ONLY, str2));
        }
    }

    public static void c(String str, String str2) {
        xnb.d(str, str2);
    }
}
