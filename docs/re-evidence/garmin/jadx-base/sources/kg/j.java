package kg;

import android.content.Context;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes7.dex */
public class j implements ig.a {
    @Override // ig.a
    public final String a(Context context) {
        if (context == null) {
            return null;
        }
        if (!((vg.a.f178062b == null || vg.a.f178061a == null) ? false : true)) {
            return null;
        }
        Method method = vg.a.f178063c;
        Object obj = vg.a.f178061a;
        if (obj != null && method != null) {
            try {
                Object objInvoke = method.invoke(obj, context);
                if (objInvoke != null) {
                    return (String) objInvoke;
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
