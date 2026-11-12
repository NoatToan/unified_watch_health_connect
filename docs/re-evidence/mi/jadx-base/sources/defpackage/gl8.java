package defpackage;

import android.content.Context;
import com.xiaomi.fitness.common.utils.AppUtil;

/* JADX INFO: loaded from: classes9.dex */
public class gl8 {
    public static String a(Context context, int i) {
        if (context == null) {
            context = AppUtil.getApp();
        }
        int iA = ub4.a(i);
        if (iA == 1) {
            return context.getString(c0j.X7);
        }
        if (iA == 2) {
            return context.getString(c0j.b8);
        }
        if (iA == 3) {
            return context.getString(c0j.Z7);
        }
        if (iA != 4) {
            return iA != 5 ? "" : context.getString(c0j.Y7);
        }
        return context.getString(c0j.a8);
    }
}
