package defpackage;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.eclipse.californium.elements.EndpointContext;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public class zxt {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final zzk f54750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Logger f54751c;

    static {
        Logger loggerA = aaex.a((Class<?>) zxt.class);
        f54751c = loggerA;
        f54750b = new zzk(loggerA.getName(), 3L, TimeUnit.SECONDS.toNanos(10L));
    }

    public static boolean b(String str, zxv<zxs<?>> zxvVar, EndpointContext endpointContext, EndpointContext endpointContext2) {
        Logger logger = f54751c;
        boolean zIsWarnEnabled = logger.isWarnEnabled();
        boolean zIsTraceEnabled = logger.isTraceEnabled();
        Iterator<T> it = zxvVar.iterator();
        while (true) {
            boolean z = true;
            while (it.hasNext()) {
                zxs zxsVar = (zxs) it.next();
                Object obj = endpointContext.get(zxsVar);
                Object obj2 = endpointContext2.get(zxsVar);
                boolean z2 = obj == obj2 || (obj != null && obj.equals(obj2));
                if (!z2 && !zIsWarnEnabled) {
                    return false;
                }
                if (!z2) {
                    f54750b.e("{}, {}: \"{}\" != \"{}\"", str, zxsVar, obj, obj2);
                } else if (zIsTraceEnabled) {
                    f54751c.trace("{}, {}: \"{}\" == \"{}\"", str, zxsVar, obj, obj2);
                }
                if (!z || !z2) {
                    z = false;
                }
            }
            return z;
        }
    }

    public static EndpointContext c(EndpointContext endpointContext, EndpointContext endpointContext2) {
        String string = endpointContext.getString(zxu.n);
        return (string == null || !string.equals("none")) ? endpointContext2 : zya.d(endpointContext2, zxu.f54752a);
    }
}
