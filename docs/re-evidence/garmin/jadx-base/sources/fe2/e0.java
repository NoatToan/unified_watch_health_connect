package fe2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import wd2.i2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0010B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lfe2/e0;", "", "Lo53/b0;", "", "deviceUnitId", "Lae2/e0;", "publisher", "Lxd2/a1;", "repository", "Lwd2/l;", "appDelegate", "Lkotlin/Function0;", "", "uploadTaskListener", "<init>", "(JLae2/e0;Lxd2/a1;Lwd2/l;Le23/a;)V", "a", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e0 implements o53.b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f70712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ae2.e0 f70713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xd2.a1 f70714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wd2.l f70715d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e23.a<Unit> f70716e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o53.m1 f70717f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public o53.c2 f70718g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Logger f70719h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinkedList f70720i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f70721j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f70722k;

    static {
        new a(null);
    }

    public e0(long j8, ae2.e0 e0Var, xd2.a1 a1Var, wd2.l lVar, e23.a<Unit> aVar) {
        e0Var.getClass();
        a1Var.getClass();
        lVar.getClass();
        this.f70712a = j8;
        this.f70713b = e0Var;
        this.f70714c = a1Var;
        this.f70715d = lVar;
        this.f70716e = aVar;
        this.f70717f = g8.i.c();
        this.f70719h = i2.a("DefaultPeriodicUploadTask");
        this.f70721j = new AtomicBoolean(false);
        this.f70722k = 15;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x012e, code lost:
    
        if (r14.d(r2, r6) == r0) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(e0 e0Var, v13.c cVar) {
        i0 i0Var;
        p005kotlin.jvm.internal.p0 p0Var;
        int i14;
        e0Var.getClass();
        if (cVar instanceof i0) {
            i0Var = (i0) cVar;
            int i15 = i0Var.f70779e;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                i0Var.f70779e = i15 - Integer.MIN_VALUE;
            } else {
                i0Var = new i0(e0Var, cVar);
            }
        } else {
            i0Var = new i0(e0Var, cVar);
        }
        i0 i0Var2 = i0Var;
        Object objX = i0Var2.f70777c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = i0Var2.f70779e;
        if (i16 != 0) {
            if (i16 == 1) {
                i14 = i0Var2.f70776b;
                p0Var = i0Var2.f70775a;
                o13.r.b(objX);
            } else {
                if (i16 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objX);
            }
            wd2.m.h(e0Var.f70712a, com.garmin.android.library.livetrack.i.a.f50228a);
            e0Var.f70721j.compareAndSet(true, false);
            e0Var.f70719h.debug("Clear uploading flag");
            return Unit.INSTANCE;
        }
        o13.r.b(objX);
        boolean zCompareAndSet = e0Var.f70721j.compareAndSet(false, true);
        Logger logger = e0Var.f70719h;
        if (zCompareAndSet) {
            logger.debug("Attempt start upload, set uploading flag");
            ArrayList arrayList = new ArrayList();
            p005kotlin.jvm.internal.p0 p0Var2 = new p005kotlin.jvm.internal.p0();
            e0Var.f70714c.getClass();
            p005kotlin.jvm.internal.p0 p0Var3 = new p005kotlin.jvm.internal.p0();
            LinkedList linkedList = e0Var.f70720i;
            if (linkedList == null) {
                p005kotlin.jvm.internal.s.m("buffer");
                throw null;
            }
            synchronized (linkedList) {
                try {
                    LinkedList linkedList2 = e0Var.f70720i;
                    if (linkedList2 == null) {
                        p005kotlin.jvm.internal.s.m("buffer");
                        throw null;
                    }
                    int size = linkedList2.size();
                    p0Var2.f105807a = size;
                    p0Var3.f105807a = Math.abs(Math.min(size, 100));
                    for (int i17 = 0; i17 < p0Var3.f105807a; i17++) {
                        LinkedList linkedList3 = e0Var.f70720i;
                        if (linkedList3 == null) {
                            p005kotlin.jvm.internal.s.m("buffer");
                            throw null;
                        }
                        arrayList.add(linkedList3.get(i17));
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            e0Var.f70719h.debug("Buffer size = " + p0Var2.f105807a + ", upload limit = 100");
            if (!arrayList.isEmpty()) {
                com.airbnb.lottie.animation.keyframe.a.r("Uploading ", p0Var3.f105807a, " points", e0Var.f70719h);
                xd2.a1 a1Var = e0Var.f70714c;
                ae2.e0 e0Var2 = e0Var.f70713b;
                long j8 = e0Var.f70712a;
                i0Var2.f70775a = p0Var3;
                i0Var2.f70776b = 100;
                i0Var2.f70779e = 1;
                objX = a1Var.x(e0Var2, j8, arrayList, i0Var2);
                if (objX != aVar) {
                    p0Var = p0Var3;
                    i14 = 100;
                }
                return aVar;
            }
            e0Var.f70721j.compareAndSet(true, false);
            e0Var.f70719h.debug("Clear uploading flag");
        } else {
            logger.warn("Upload already in progress, waiting for the next window");
        }
        return Unit.INSTANCE;
        xd2.g1 g1Var = (xd2.g1) objX;
        if (g1Var instanceof xd2.g1.b) {
            com.airbnb.lottie.animation.keyframe.a.r("Upload successful, removing ", p0Var.f105807a, " points from the head of the buffer", e0Var.f70719h);
            LinkedList linkedList4 = e0Var.f70720i;
            if (linkedList4 == null) {
                p005kotlin.jvm.internal.s.m("buffer");
                throw null;
            }
            synchronized (linkedList4) {
                try {
                    int i18 = p0Var.f105807a;
                    for (int i19 = 0; i19 < i18; i19++) {
                        LinkedList linkedList5 = e0Var.f70720i;
                        if (linkedList5 == null) {
                            p005kotlin.jvm.internal.s.m("buffer");
                            throw null;
                        }
                        linkedList5.remove(0);
                    }
                    Unit unit2 = Unit.INSTANCE;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        } else if (g1Var instanceof xd2.g1.a.e) {
            xd2.a1 a1Var2 = e0Var.f70714c;
            long j14 = e0Var.f70712a;
            i0Var2.f70775a = null;
            i0Var2.f70776b = i14;
            i0Var2.f70779e = 2;
        } else if (g1Var instanceof xd2.g1.a.b) {
            wd2.m.g(e0Var.f70715d.f().f(), null);
        } else {
            e0Var.f70719h.error("Upload failed: " + g1Var + ", waiting for the next window to retry");
        }
        e0Var.f70721j.compareAndSet(true, false);
        e0Var.f70719h.debug("Clear uploading flag");
        return Unit.INSTANCE;
    }

    @Override // o53.b0
    /* JADX INFO: renamed from: getCoroutineContext */
    public final t13.g getF183565a() {
        x53.c cVar = o53.s0.f129406a;
        return u53.o.f168762a.plus(this.f70717f);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lfe2/e0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ e0(long j8, ae2.e0 e0Var, xd2.a1 a1Var, wd2.l lVar, e23.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(j8, e0Var, a1Var, lVar, (i14 & 16) != 0 ? null : aVar);
    }
}
