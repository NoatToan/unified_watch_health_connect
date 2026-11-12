package jd;

import java.util.concurrent.locks.ReentrantLock;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ljd/q;", "", "", "capacity", "Lkotlin/Function0;", "Lud/a;", "connectionFactory", "preparedStatementCacheSize", "<init>", "(ILe23/a;I)V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f98278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.a<ud.a> f98279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f98280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ReentrantLock f98281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f98282e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f98283f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f[] f98284g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z53.g f98285h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p13.k<f> f98286i;

    /* JADX WARN: Multi-variable type inference failed */
    public q(int i14, e23.a<? extends ud.a> aVar, int i15) {
        aVar.getClass();
        this.f98278a = i14;
        this.f98279b = aVar;
        this.f98280c = i15;
        this.f98281d = new ReentrantLock();
        this.f98284g = new f[i14];
        this.f98285h = z53.h.a(i14);
        this.f98286i = new p13.k<>(i14);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object a(v13.c cVar) {
        n nVar;
        p13.k<f> kVar = this.f98286i;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i14 = nVar.f98267c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                nVar.f98267c = i14 - Integer.MIN_VALUE;
            } else {
                nVar = new n(this, cVar);
            }
        } else {
            nVar = new n(this, cVar);
        }
        Object obj = nVar.f98265a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = nVar.f98267c;
        z53.g gVar = this.f98285h;
        if (i15 == 0) {
            o13.r.b(obj);
            nVar.f98267c = 1;
            if (gVar.b(nVar) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        try {
            ReentrantLock reentrantLock = this.f98281d;
            reentrantLock.lock();
            try {
                if (this.f98283f) {
                    oe2.f.a0(21, "Connection pool is closed");
                    throw null;
                }
                if (kVar.isEmpty() && this.f98282e < this.f98278a) {
                    f fVar = new f(this.f98279b.invoke(), null, this.f98280c, 2, null);
                    f[] fVarArr = this.f98284g;
                    int i16 = this.f98282e;
                    this.f98282e = i16 + 1;
                    fVarArr[i16] = fVar;
                    kVar.addLast(fVar);
                }
                f fVarRemoveLast = kVar.removeLast();
                reentrantLock.unlock();
                return fVarRemoveLast;
            } catch (Throwable th3) {
                reentrantLock.unlock();
                throw th3;
            }
        } catch (Throwable th4) {
            gVar.release();
            throw th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0056 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x006e A[Catch: all -> 0x0072, TryCatch #0 {all -> 0x0072, blocks: (B:29:0x006a, B:31:0x006e, B:35:0x0076, B:39:0x007d), top: B:44:0x006a }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0074  */
    /* JADX WARN: Code duplicated, block: B:35:0x0076 A[Catch: all -> 0x0072, TryCatch #0 {all -> 0x0072, blocks: (B:29:0x006a, B:31:0x006e, B:35:0x0076, B:39:0x007d), top: B:44:0x006a }] */
    /* JADX WARN: Code duplicated, block: B:37:0x007a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x007d A[Catch: all -> 0x0072, TRY_LEAVE, TryCatch #0 {all -> 0x0072, blocks: (B:29:0x006a, B:31:0x006e, B:35:0x0076, B:39:0x007d), top: B:44:0x006a }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0057 -> B:24:0x0059). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(long r9, b50.o r11, v13.c r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof jd.o
            if (r0 == 0) goto L13
            r0 = r12
            jd.o r0 = (jd.o) r0
            int r1 = r0.f98273f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f98273f = r1
            goto L18
        L13:
            jd.o r0 = new jd.o
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.f98271d
            u13.a r1 = u13.a.COROUTINE_SUSPENDED
            int r2 = r0.f98273f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L37
            if (r2 != r3) goto L30
            long r9 = r0.f98268a
            kotlin.jvm.internal.r0 r11 = r0.f98270c
            e23.a r2 = r0.f98269b
            o13.r.b(r12)     // Catch: java.lang.Throwable -> L2e
            goto L59
        L2e:
            r12 = move-exception
            goto L65
        L30:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r9)
            r9 = 0
            return r9
        L37:
            o13.r.b(r12)
        L3a:
            kotlin.jvm.internal.r0 r12 = new kotlin.jvm.internal.r0
            r12.<init>()
            jd.p r2 = new jd.p     // Catch: java.lang.Throwable -> L63
            r2.<init>(r12, r8, r4)     // Catch: java.lang.Throwable -> L63
            r0.f98269b = r11     // Catch: java.lang.Throwable -> L63
            r0.f98270c = r12     // Catch: java.lang.Throwable -> L63
            r0.f98268a = r9     // Catch: java.lang.Throwable -> L63
            r0.f98273f = r3     // Catch: java.lang.Throwable -> L63
            long r5 = o53.m0.e(r9)     // Catch: java.lang.Throwable -> L63
            java.lang.Object r2 = o53.j2.b(r5, r2, r0)     // Catch: java.lang.Throwable -> L63
            if (r2 != r1) goto L57
            return r1
        L57:
            r2 = r11
            r11 = r12
        L59:
            r12 = r11
            r11 = r2
            r2 = r0
            r0 = r4
            goto L6a
        L5e:
            r7 = r2
            r2 = r11
            r11 = r12
            r12 = r7
            goto L65
        L63:
            r2 = move-exception
            goto L5e
        L65:
            r7 = r12
            r12 = r11
            r11 = r2
            r2 = r0
            r0 = r7
        L6a:
            boolean r5 = r0 instanceof kotlinx.coroutines.TimeoutCancellationException     // Catch: java.lang.Throwable -> L72
            if (r5 == 0) goto L74
            r11.invoke()     // Catch: java.lang.Throwable -> L72
            goto L7b
        L72:
            r9 = move-exception
            goto L7e
        L74:
            if (r0 != 0) goto L7d
            T r12 = r12.f105810a     // Catch: java.lang.Throwable -> L72
            if (r12 == 0) goto L7b
            return r12
        L7b:
            r0 = r2
            goto L3a
        L7d:
            throw r0     // Catch: java.lang.Throwable -> L72
        L7e:
            T r10 = r12.f105810a
            jd.f r10 = (jd.f) r10
            if (r10 == 0) goto L87
            r8.e(r10)
        L87:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: jd.q.b(long, b50.o, v13.c):java.lang.Object");
    }

    public final void c() {
        ReentrantLock reentrantLock = this.f98281d;
        reentrantLock.lock();
        try {
            this.f98283f = true;
            for (f fVar : this.f98284g) {
                if (fVar != null) {
                    fVar.close();
                }
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void d(StringBuilder sb3) {
        p13.k<f> kVar = this.f98286i;
        ReentrantLock reentrantLock = this.f98281d;
        reentrantLock.lock();
        try {
            q13.b bVarB = p13.w.b();
            int i14 = kVar.f134948c;
            for (int i15 = 0; i15 < i14; i15++) {
                bVarB.add(kVar.get(i15));
            }
            q13.b bVarA = p13.w.a(bVarB);
            sb3.append('\t' + toString() + " (");
            sb3.append("capacity=" + this.f98278a + ", ");
            StringBuilder sb4 = new StringBuilder();
            sb4.append("permits=");
            z53.g gVar = this.f98285h;
            gVar.getClass();
            sb4.append(Math.max(z53.e.f202563g.get(gVar), 0));
            sb4.append(", ");
            sb3.append(sb4.toString());
            sb3.append("queue=(size=" + bVarA.getF142104b() + ")[" + h0.k0(bVarA, null, null, null, null, 63) + ']');
            sb3.append(")");
            sb3.append('\n');
            f[] fVarArr = this.f98284g;
            int length = fVarArr.length;
            int i16 = 0;
            for (int i17 = 0; i17 < length; i17++) {
                f fVar = fVarArr[i17];
                i16++;
                StringBuilder sb5 = new StringBuilder();
                sb5.append("\t\t[");
                sb5.append(i16);
                sb5.append("] - ");
                sb5.append(fVar != null ? fVar.f98215a.toString() : null);
                sb3.append(sb5.toString());
                sb3.append('\n');
                if (fVar != null) {
                    fVar.f(sb3);
                }
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void e(f fVar) {
        fVar.getClass();
        ReentrantLock reentrantLock = this.f98281d;
        reentrantLock.lock();
        try {
            this.f98286i.addLast(fVar);
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            this.f98285h.release();
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }
}
