package com.amap.api.mapcore.util;

import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class iw {
    public static WeakReference<iu> a;

    public static void a(final String str, final Context context) {
        hn.d().submit(new Runnable() { // from class: com.amap.api.mapcore.util.iw.1
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (iw.class) {
                    try {
                        String strA = gr.a(gu.a(str));
                        iu iuVarA = jb.a(iw.a);
                        jb.a(context, iuVarA, hl.j, 50, 102400, "10");
                        if (iuVarA.e == null) {
                            iuVarA.e = new id(new ig(new Cif()));
                        }
                        iv.a(strA, gu.a(" \"timestamp\":\"" + gu.a(System.currentTimeMillis(), "yyyyMMdd HH:mm:ss") + "\",\"details\":" + str), iuVarA);
                    } catch (Throwable th) {
                        hn.c(th, "mam", "ap");
                    }
                }
            }
        });
    }
}
