package defpackage;

import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: loaded from: classes4.dex */
public class yi4 {
    public static <T> T a(Context context, Class<? extends T> cls) {
        Context baseContext;
        Object obj = context;
        while (!cls.isInstance(obj)) {
            if (!(obj instanceof ContextWrapper) || obj == (baseContext = obj.getBaseContext())) {
                return null;
            }
            obj = (T) baseContext;
        }
        return (T) obj;
    }
}
