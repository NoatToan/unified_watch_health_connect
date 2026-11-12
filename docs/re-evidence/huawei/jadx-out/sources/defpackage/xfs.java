package defpackage;

import android.content.Context;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* JADX INFO: loaded from: classes20.dex */
public class xfs {
    public static Context c(Context context, int i, int i2) {
        return context.getTheme().resolveAttribute(i, new TypedValue(), false) ? context : new ContextThemeWrapper(context, i2);
    }
}
