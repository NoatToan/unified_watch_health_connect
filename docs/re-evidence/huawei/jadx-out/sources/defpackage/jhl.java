package defpackage;

import android.content.Context;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes10.dex */
public class jhl {
    public static int c(Context context, float f) {
        return (int) TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }
}
