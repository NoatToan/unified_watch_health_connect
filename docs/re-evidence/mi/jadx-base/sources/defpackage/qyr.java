package defpackage;

import android.content.Context;
import android.content.res.Resources;

/* JADX INFO: loaded from: classes2.dex */
public final class qyr {
    public static int a(Context context, float f) {
        if (context == null) {
            return 0;
        }
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static boolean b() {
        return (Resources.getSystem().getConfiguration().screenLayout & 15) == 3;
    }
}
