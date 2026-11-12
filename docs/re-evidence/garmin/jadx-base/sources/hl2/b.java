package hl2;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
import o13.r;
import ok2.a0;
import ok2.d;
import ok2.v;
import v13.c;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
public final class b {
    public static final dl2.b a(v vVar) {
        d configuration = vVar.getConfiguration();
        dl2.b bVar = configuration instanceof dl2.b ? (dl2.b) configuration : null;
        if (bVar != null) {
            return bVar;
        }
        h.s("Associated config must be ConnectTransferConfiguration or subclass");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        if (r4 < android.os.SystemClock.elapsedRealtime()) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(dl2.b bVar, boolean z14, c cVar) {
        a aVar;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i14 = aVar.f84476c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f84476c = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(cVar);
            }
        } else {
            aVar = new a(cVar);
        }
        Object obj = aVar.f84475b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f84476c;
        try {
            if (i15 == 0) {
                r.b(obj);
                long j8 = bVar.f60323p.get();
                if (!z14 && j8 > 0) {
                    if (!bVar.d()) {
                        long j14 = j8 + 60000;
                        a0.f132585h.getClass();
                        a0.f132587j.getClass();
                    }
                    return Boolean.FALSE;
                }
                aVar.f84474a = bVar;
                aVar.f84476c = 1;
                if (bVar.r(aVar) == aVar2) {
                    return aVar2;
                }
            } else {
                if (i15 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                bVar = aVar.f84474a;
                r.b(obj);
            }
            AtomicLong atomicLong = bVar.f60323p;
            a0.f132585h.getClass();
            a0.f132587j.getClass();
            atomicLong.set(SystemClock.elapsedRealtime());
            return Boolean.TRUE;
        } catch (Throwable unused) {
        }
    }

    public static Object c(dl2.b bVar, c cVar, int i14) {
        boolean z14 = (i14 & 1) == 0;
        cz2.a.f56879a.getClass();
        cz2.a.C1219a c1219a = cz2.a.C1219a.f56880a;
        return b(bVar, z14, cVar);
    }
}
