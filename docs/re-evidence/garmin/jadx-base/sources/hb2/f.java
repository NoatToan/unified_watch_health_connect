package hb2;

import android.content.Context;

/* JADX INFO: loaded from: classes8.dex */
public class f {
    public static int a(int i14, Context context) {
        if (context != null) {
            return (int) (i14 * context.getResources().getDisplayMetrics().density);
        }
        return -1;
    }
}
