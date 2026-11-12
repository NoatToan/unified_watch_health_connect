package nh;

import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public class a {
    public static sg.a a() {
        long jA;
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            sg.c cVar = new sg.c(lh.b.b().a());
            Context context = lh.b.b().f112390a;
            synchronized (wg.a.c.class) {
                jA = wg.a.d.a(context, "alipay_cashier_ap_seq_v");
            }
            return sg.a.a("NP", jCurrentTimeMillis, cVar, (short) jA, new sg.f());
        } catch (Exception unused) {
            try {
                return sg.a.a("EX", 0L, new sg.c(""), (short) 0, new sg.f());
            } catch (Exception unused2) {
                return null;
            }
        }
    }
}
