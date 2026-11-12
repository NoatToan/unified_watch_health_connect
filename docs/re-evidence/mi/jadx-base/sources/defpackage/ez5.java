package defpackage;

import android.content.res.Resources;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes6.dex */
public class ez5 {
    public static int a(int i) {
        return (int) TypedValue.applyDimension(1, i, Resources.getSystem().getDisplayMetrics());
    }

    public static int b(float f) {
        return (int) TypedValue.applyDimension(0, f, Resources.getSystem().getDisplayMetrics());
    }
}
