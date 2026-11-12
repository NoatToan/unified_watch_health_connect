package defpackage;

import android.content.Context;
import com.facebook.react.devsupport.RedBoxHandler;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class o06 {
    public static n06 a(Context context, kdj kdjVar, String str, boolean z, RedBoxHandler redBoxHandler, k06 k06Var, int i, Map<String, nok> map) {
        if (!z) {
            return new by6();
        }
        try {
            return (n06) Class.forName("com.facebook.react.devsupport.DevSupportManagerImpl").getConstructor(Context.class, kdj.class, String.class, Boolean.TYPE, RedBoxHandler.class, k06.class, Integer.TYPE, Map.class).newInstance(context, kdjVar, str, Boolean.TRUE, redBoxHandler, k06Var, Integer.valueOf(i), map);
        } catch (Exception e) {
            throw new RuntimeException("Requested enabled DevSupportManager, but DevSupportManagerImpl class was not found or could not be created", e);
        }
    }
}
