package defpackage;

import android.content.Context;
import android.graphics.Point;

/* JADX INFO: loaded from: classes3.dex */
public class pgl {
    public static void a(Context context, rkr rkrVar, Point point) {
        xoa.b(rkrVar, context, point);
        if (b(rkrVar.g)) {
            return;
        }
        j7n.a(rkrVar, point);
    }

    public static boolean b(int i) {
        return (i & 8192) != 0;
    }

    public static boolean c(int i) {
        return (i & 4096) != 0;
    }
}
