package ok;

import java.util.concurrent.Exchanger;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes7.dex */
public class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f132414a;

    public c(d dVar) {
        this.f132414a = dVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        r0 = ok.d.f132415o;
        r6.f132414a.f132424i.f132431a.g();
        r0 = qk.b.f145071a;
        r0 = r6.f132414a.f132424i;
        r0.f132431a.d(r0.f132432b);
        r6.f132414a.f132424i.f132431a.g();
        r0 = r6.f132414a.f132426k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0080, code lost:
    
        monitor-enter(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0081, code lost:
    
        java.lang.Thread.interrupted();
        r1 = r6.f132414a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0088, code lost:
    
        if (r1.f132427l == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008a, code lost:
    
        r1.f132427l = false;
        r1.f132424i = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0090, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0092, code lost:
    
        r1.f132424i.f132431a.getClass();
        r6.f132414a.f132424i = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009d, code lost:
    
        r1 = r6.f132414a;
        r4 = r1.f132424i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a1, code lost:
    
        if (r4 != null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a3, code lost:
    
        monitor-exit(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a6, code lost:
    
        r4.f132431a.o(r1.f132416a, r1.f132429n);
        r1 = r6.f132414a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b3, code lost:
    
        if (r1.f132422g == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bd, code lost:
    
        if (r1.f132424i.f132431a.k(Integer.MAX_VALUE) == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bf, code lost:
    
        r6.f132414a.f132424i = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c3, code lost:
    
        monitor-exit(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c6, code lost:
    
        monitor-exit(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c9, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ca, code lost:
    
        r0 = r6.f132414a;
        r0.f132424i.f132431a.g();
        ok.d.a(r0);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        d.c cVar;
        while (true) {
            d dVar = this.f132414a;
            if (dVar.f132422g) {
                break;
            }
            try {
                e eVar = dVar.f132420e;
                Exchanger<d.c> exchanger = dVar.f132425j;
                if (eVar == null) {
                    cVar = exchanger.exchange(null);
                } else {
                    try {
                        cVar = exchanger.exchange(null, 100L, TimeUnit.MILLISECONDS);
                    } catch (TimeoutException unused) {
                        d dVar2 = this.f132414a;
                        cVar = new d.c(dVar2, dVar2.f132420e, null);
                    }
                }
                if (cVar != null) {
                    synchronized (this.f132414a.f132426k) {
                        try {
                            d dVar3 = this.f132414a;
                            dVar3.f132424i = cVar;
                            cVar.f132431a.o(dVar3.f132416a, dVar3.f132429n);
                            d dVar4 = this.f132414a;
                            if (dVar4.f132422g && dVar4.f132424i.f132431a.k(Integer.MAX_VALUE)) {
                                this.f132414a.f132424i = null;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    break;
                }
            } catch (InterruptedException unused2) {
                d dVar5 = this.f132414a;
                if (!dVar5.f132422g) {
                    d.a(dVar5);
                }
            }
        }
        synchronized (this.f132414a.f132426k) {
            try {
                d.c cVar2 = this.f132414a.f132424i;
                if (cVar2 != null) {
                    cVar2.f132431a.k(Integer.MAX_VALUE);
                }
                this.f132414a.f132424i = null;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
