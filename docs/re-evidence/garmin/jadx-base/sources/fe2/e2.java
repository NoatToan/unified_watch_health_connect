package fe2;

import java.util.ArrayList;
import java.util.Iterator;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import wd2.i2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lfe2/e2;", "", "Lwd2/g0;", "rulesDelegate", "Lde2/g0;", "deviceManager", "<init>", "(Lwd2/g0;Lde2/g0;)V", "a", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f70727d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wd2.g0 f70728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final de2.g0 f70729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Logger f70730c;

    static {
        new a(null);
    }

    public e2(wd2.g0 g0Var, de2.g0 g0Var2) {
        g0Var.getClass();
        g0Var2.getClass();
        this.f70728a = g0Var;
        this.f70729b = g0Var2;
        this.f70730c = i2.a("StartRequestProcessor");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007b, code lost:
    
        if (r16.f70729b.d(r1, r5, r3) == r4) goto L53;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [T, fe2.p1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(wd2.e0 e0Var, ArrayList arrayList, v13.c cVar) {
        f2 f2Var;
        boolean z14;
        if (cVar instanceof f2) {
            f2Var = (f2) cVar;
            int i14 = f2Var.f70745c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                f2Var.f70745c = i14 - Integer.MIN_VALUE;
            } else {
                f2Var = new f2(this, cVar);
            }
        } else {
            f2Var = new f2(this, cVar);
        }
        Object obj = f2Var.f70743a;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = f2Var.f70745c;
        int i16 = 1;
        if (i15 == 0) {
            o13.r.b(obj);
            Logger logger = this.f70730c;
            logger.debug("Processing start request with input: " + e0Var);
            wd2.g0 g0Var = this.f70728a;
            if (g0Var.d()) {
                p005kotlin.jvm.internal.r0 r0Var = new p005kotlin.jvm.internal.r0();
                p005kotlin.jvm.internal.p0 p0Var = new p005kotlin.jvm.internal.p0();
                p005kotlin.jvm.internal.p0 p0Var2 = new p005kotlin.jvm.internal.p0();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ?? r14 = (p1) it.next();
                    int i17 = i16;
                    if (r14.getDeviceUnitId() == e0Var.f184433a) {
                        r0Var.f105810a = r14;
                    }
                    if (r14.l()) {
                        p0Var2.f105807a += i17;
                    } else {
                        p0Var.f105807a += i17;
                    }
                    i16 = i17;
                }
                int i18 = i16;
                boolean z15 = e0Var.f184436d;
                T t7 = r0Var.f105810a;
                if (z15) {
                    p1 p1Var = (p1) t7;
                    int i19 = p0Var2.f105807a;
                    long j8 = e0Var.f184433a;
                    if (p1Var == null) {
                        wr.g.w("New start request for device ", j8, logger);
                        if (i19 < g0Var.a(false)) {
                            logger.debug("Session limit not yet reached, start request is valid");
                            z14 = i18;
                        } else {
                            logger.debug("Session limit reached! Start request is NOT valid");
                        }
                        return Boolean.valueOf(z14);
                    }
                    wr.g.w("Another (repeated) start request for device ", j8, logger);
                    z14 = 0;
                    return Boolean.valueOf(z14);
                }
                int i24 = p0Var.f105807a;
                f2Var.f70745c = 2;
                Object objB = b(e0Var, (p1) t7, i24, f2Var);
                if (objB != obj2) {
                    return objB;
                }
            } else {
                logger.warn("Feature is not enabled, start request invalid");
                if (!e0Var.f184436d && p005kotlin.jvm.internal.s.g(e0Var.f184434b, com.garmin.android.library.livetrack.i.b.f50229a)) {
                    long j14 = e0Var.f184433a;
                    ae2.a.b bVar = new ae2.a.b();
                    f2Var.f70745c = 1;
                }
            }
            return obj2;
        }
        if (i15 != 1) {
            if (i15 == 2) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        return Boolean.FALSE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0072, code lost:
    
        if (r11.d(r8, r10, r0) == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0099, code lost:
    
        if (r11.d(r8, r10, r0) == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ba, code lost:
    
        if (r11.d(r8, r10, r0) == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bc, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(wd2.e0 e0Var, p1 p1Var, int i14, v13.c cVar) {
        g2 g2Var;
        if (cVar instanceof g2) {
            g2Var = (g2) cVar;
            int i15 = g2Var.f70760c;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                g2Var.f70760c = i15 - Integer.MIN_VALUE;
            } else {
                g2Var = new g2(this, cVar);
            }
        } else {
            g2Var = new g2(this, cVar);
        }
        Object obj = g2Var.f70758a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = g2Var.f70760c;
        boolean z14 = false;
        if (i16 == 0) {
            o13.r.b(obj);
            de2.g0 g0Var = this.f70729b;
            Logger logger = this.f70730c;
            if (p1Var == null) {
                wr.g.w("New start request for device ", e0Var.f184433a, logger);
                if (i14 < this.f70728a.a(true)) {
                    logger.debug("Session limit not yet reached, start request is valid");
                    z14 = true;
                } else {
                    logger.debug("Session limit reached! Start request is NOT valid");
                    if (p005kotlin.jvm.internal.s.g(e0Var.f184434b, com.garmin.android.library.livetrack.i.b.f50229a)) {
                        long j8 = e0Var.f184433a;
                        ae2.a.C0041a c0041a = new ae2.a.C0041a();
                        g2Var.f70760c = 1;
                    }
                }
            } else if (p1Var.isCreated()) {
                wr.g.w("Session is already created for device ", e0Var.f184433a, logger);
                if (p005kotlin.jvm.internal.s.g(e0Var.f184434b, com.garmin.android.library.livetrack.i.b.f50229a)) {
                    long j14 = e0Var.f184433a;
                    ae2.a.C0041a c0041a2 = new ae2.a.C0041a();
                    g2Var.f70760c = 2;
                }
            } else {
                wr.g.w("Session creation in progress for device ", e0Var.f184433a, logger);
                if (p005kotlin.jvm.internal.s.g(e0Var.f184434b, com.garmin.android.library.livetrack.i.b.f50229a)) {
                    long j15 = e0Var.f184433a;
                    ae2.a.d dVar = new ae2.a.d();
                    g2Var.f70760c = 3;
                }
            }
        } else {
            if (i16 != 1 && i16 != 2 && i16 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Boolean.valueOf(z14);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lfe2/e2$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
