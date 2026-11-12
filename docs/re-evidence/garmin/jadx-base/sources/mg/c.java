package mg;

import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public class c {
    public static rg.b a(Context context, String str) {
        b bVar;
        if (context == null) {
            return null;
        }
        if (rg.b.f152501a == null) {
            synchronized (b.class) {
                try {
                    if (b.f118359c == null) {
                        b.f118359c = new b(context, str);
                    }
                    bVar = b.f118359c;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            rg.b.f152502b = bVar;
            rg.b.f152501a = new rg.b();
        }
        return rg.b.f152501a;
    }
}
