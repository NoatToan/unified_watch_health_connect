package defpackage;

import android.content.Intent;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public class xcd {
    public static int a(Intent intent) {
        if (intent == null) {
            return 0;
        }
        try {
            return ((Integer) ebk.o(Intent.class, intent, "getMiuiFlags", new Class[0], new Object[0])).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            StringBuilder sb = new StringBuilder();
            sb.append(" getMiuiFlags error: ");
            sb.append(e);
            return 0;
        }
    }

    public static boolean b(Intent intent) {
        return (a(intent) & 16) != 0;
    }
}
