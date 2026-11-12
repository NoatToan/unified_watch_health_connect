package defpackage;

import android.content.Context;
import com.alipay.sdk.m.q0.d;
import java.util.zip.Adler32;

/* JADX INFO: loaded from: classes4.dex */
public class nq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static nr f43443b;
    public static final Object e = new Object();

    public static nr d(Context context) {
        synchronized (nq.class) {
            nr nrVar = f43443b;
            if (nrVar != null) {
                return nrVar;
            }
            if (context == null) {
                return null;
            }
            nr nrVarA = a(context);
            f43443b = nrVarA;
            return nrVarA;
        }
    }

    public static long e(nr nrVar) {
        if (nrVar == null) {
            return 0L;
        }
        String strD = nrVar.d();
        String strE = nrVar.e();
        long jA = nrVar.a();
        String str = String.format("%s%s%s%s%s", strD, strE, Long.valueOf(jA), nrVar.c(), nrVar.b());
        if (nf.b(str)) {
            return 0L;
        }
        Adler32 adler32 = new Adler32();
        adler32.reset();
        adler32.update(str.getBytes());
        return adler32.getValue();
    }

    public static nr a(Context context) {
        if (context == null) {
            return null;
        }
        synchronized (e) {
            String strE = d.d(context).e();
            if (nf.b(strE)) {
                return null;
            }
            if (strE.endsWith("\n")) {
                strE = strE.substring(0, strE.length() - 1);
            }
            nr nrVar = new nr();
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strA = nb.a(context);
            String strC = nb.c(context);
            nrVar.e(strA);
            nrVar.c(strA);
            nrVar.b(jCurrentTimeMillis);
            nrVar.d(strC);
            nrVar.a(strE);
            nrVar.c(e(nrVar));
            return nrVar;
        }
    }
}
