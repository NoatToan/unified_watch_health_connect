package kd0;

import java.util.UUID;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkd0/g4;", "Lfg2/y;", "Lfg2/z;", "subscriptionProvider", "Lfg2/c;", "deviceProvider", "Lau0/x;", "preferences", "<init>", "(Lfg2/z;Lfg2/c;Lau0/x;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g4 implements fg2.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fg2.z f104087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fg2.c f104088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final au0.x f104089c;

    public g4(fg2.z zVar, fg2.c cVar, au0.x xVar) {
        zVar.getClass();
        cVar.getClass();
        xVar.getClass();
        this.f104087a = zVar;
        this.f104088b = cVar;
        this.f104089c = xVar;
    }

    @Override // fg2.y
    public final Object a(long j8, jg2.d dVar, v13.c cVar) throws Throwable {
        x53.c cVar2 = o53.s0.f129406a;
        Object objE0 = ge1.b.e0(x53.b.f189152a, new f4(this, j8, dVar, null), cVar);
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        if (objE0 != aVar) {
            objE0 = Unit.INSTANCE;
        }
        return objE0 == aVar ? objE0 : Unit.INSTANCE;
    }

    @Override // fg2.y
    public final Object b(long j8, v13.c cVar) {
        x53.c cVar2 = o53.s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new e4(this, j8, null), cVar);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0089 A[PHI: r9 r11
      0x0089: PHI (r9v2 long) = (r9v1 long), (r9v6 long) binds: [B:24:0x006d, B:29:0x0084] A[DONT_GENERATE, DONT_INLINE]
      0x0089: PHI (r11v2 java.util.UUID) = (r11v1 java.util.UUID), (r11v4 java.util.UUID) binds: [B:24:0x006d, B:29:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x008d  */
    /* JADX WARN: Code duplicated, block: B:36:0x009c  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
    
        if (r12 == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bc, code lost:
    
        if (r12 == r1) goto L46;
     */
    @Override // fg2.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(long j8, UUID uuid, v13.c cVar) throws Throwable {
        c4 c4Var;
        int i14;
        UUID uuid2;
        long j14;
        int i15;
        jg2.d dVar;
        UUID uuid3;
        jg2.c cVar2;
        if (cVar instanceof c4) {
            c4Var = (c4) cVar;
            int i16 = c4Var.f104022f;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                c4Var.f104022f = i16 - Integer.MIN_VALUE;
            } else {
                c4Var = new c4(this, cVar);
            }
        } else {
            c4Var = new c4(this, cVar);
        }
        Object objE0 = c4Var.f104020d;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i17 = c4Var.f104022f;
        if (i17 == 0) {
            o13.r.b(objE0);
            x53.c cVar3 = o53.s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            d4 d4Var = new d4(j8, null);
            c4Var.f104018b = uuid;
            c4Var.f104017a = j8;
            c4Var.f104022f = 1;
            objE0 = ge1.b.e0(bVar, d4Var, c4Var);
            if (objE0 != obj) {
            }
            return obj;
        }
        if (i17 == 1) {
            j8 = c4Var.f104017a;
            uuid = c4Var.f104018b;
            o13.r.b(objE0);
        } else {
            if (i17 == 2) {
                j8 = c4Var.f104017a;
                uuid = c4Var.f104018b;
                o13.r.b(objE0);
                i14 = ((Boolean) objE0).booleanValue() ? 1 : 0;
                uuid2 = uuid;
                j14 = j8;
                if (i14 != 0) {
                    return jg2.a.b.f98731a;
                }
                c4Var.f104018b = uuid2;
                c4Var.f104017a = j14;
                c4Var.f104019c = i14;
                c4Var.f104022f = 3;
                objE0 = b(j14, c4Var);
                if (objE0 != obj) {
                    i15 = i14;
                    dVar = (jg2.d) objE0;
                    if (dVar != null) {
                        uuid3 = dVar.f98736a;
                    } else {
                        uuid3 = null;
                    }
                    if (p005kotlin.jvm.internal.s.g(uuid3, uuid2)) {
                        cVar2 = jg2.c.VALUE_ESTIMATION;
                    } else {
                        c4Var.f104018b = null;
                        c4Var.f104017a = j14;
                        c4Var.f104019c = i15;
                        c4Var.f104022f = 4;
                        objE0 = this.f104087a.a(c4Var);
                    }
                    return new jg2.a.C1897a(cVar2);
                }
                return obj;
            }
            if (i17 == 3) {
                i15 = c4Var.f104019c;
                j14 = c4Var.f104017a;
                uuid2 = c4Var.f104018b;
                o13.r.b(objE0);
                dVar = (jg2.d) objE0;
                if (dVar != null) {
                    uuid3 = dVar.f98736a;
                } else {
                    uuid3 = null;
                }
                if (p005kotlin.jvm.internal.s.g(uuid3, uuid2)) {
                    cVar2 = jg2.c.VALUE_ESTIMATION;
                } else {
                    c4Var.f104018b = null;
                    c4Var.f104017a = j14;
                    c4Var.f104019c = i15;
                    c4Var.f104022f = 4;
                    objE0 = this.f104087a.a(c4Var);
                }
                return new jg2.a.C1897a(cVar2);
            }
            if (i17 != 4) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objE0);
        }
        cVar2 = ((Boolean) objE0).booleanValue() ? jg2.c.FULL : jg2.c.LIMITED;
        return new jg2.a.C1897a(cVar2);
        if (((sd2.f) objE0) != null) {
            c4Var.f104018b = uuid;
            c4Var.f104017a = j8;
            c4Var.f104022f = 2;
            objE0 = this.f104088b.d(j8, c4Var);
        } else {
            uuid2 = uuid;
            j14 = j8;
            if (i14 != 0) {
                return jg2.a.b.f98731a;
            }
            c4Var.f104018b = uuid2;
            c4Var.f104017a = j14;
            c4Var.f104019c = i14;
            c4Var.f104022f = 3;
            objE0 = b(j14, c4Var);
            if (objE0 != obj) {
                i15 = i14;
                dVar = (jg2.d) objE0;
                if (dVar != null) {
                    uuid3 = dVar.f98736a;
                } else {
                    uuid3 = null;
                }
                if (p005kotlin.jvm.internal.s.g(uuid3, uuid2)) {
                    cVar2 = jg2.c.VALUE_ESTIMATION;
                } else {
                    c4Var.f104018b = null;
                    c4Var.f104017a = j14;
                    c4Var.f104019c = i15;
                    c4Var.f104022f = 4;
                    objE0 = this.f104087a.a(c4Var);
                }
                return new jg2.a.C1897a(cVar2);
            }
        }
        return obj;
    }
}
