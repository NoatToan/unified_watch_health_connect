package a5;

import g6.s;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La5/b;", "", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f1205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g f1206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public w f1207c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b0 f1208d;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo53/b0;", "invoke", "()Lo53/b0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class a extends w implements e23.a<b0> {
        public a() {
            super(0);
        }

        @Override // e23.a
        public final b0 invoke() {
            return b.this.f1208d;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        if (r14 == r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008a, code lost:
    
        if (r14 == r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008c, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j8, long j14, v13.c cVar) {
        c cVar2;
        long j15;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i14 = cVar2.f1212c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f1212c = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        c cVar3 = cVar2;
        Object objMo1onPostFlingRZ2iAVY = cVar3.f1210a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar3.f1212c;
        if (i15 == 0) {
            r.b(objMo1onPostFlingRZ2iAVY);
            g gVar = this.f1205a;
            g gVar2 = null;
            j15 = 0;
            if (((gVar == null || !gVar.getIsAttached()) ? null : (g) gl1.d.u(gVar)) == null) {
                g gVar3 = this.f1206b;
                if (gVar3 != null) {
                    cVar3.f1212c = 1;
                    objMo1onPostFlingRZ2iAVY = gVar3.mo1onPostFlingRZ2iAVY(j8, j14, cVar3);
                } else {
                    s.f76026b.getClass();
                }
            } else {
                g gVar4 = this.f1205a;
                if (gVar4 != null && gVar4.getIsAttached()) {
                    gVar2 = (g) gl1.d.u(gVar4);
                }
                if (gVar2 != null) {
                    cVar3.f1212c = 2;
                    objMo1onPostFlingRZ2iAVY = gVar2.mo1onPostFlingRZ2iAVY(j8, j14, cVar3);
                } else {
                    s.f76026b.getClass();
                    j15 = 0;
                }
            }
        } else if (i15 == 1) {
            r.b(objMo1onPostFlingRZ2iAVY);
            j15 = ((s) objMo1onPostFlingRZ2iAVY).f76027a;
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objMo1onPostFlingRZ2iAVY);
            j15 = ((s) objMo1onPostFlingRZ2iAVY).f76027a;
        }
        return s.a(j15);
    }

    public final long b(int i14, long j8, long j14) {
        g gVar = this.f1205a;
        g gVar2 = null;
        if (gVar != null && gVar.getIsAttached()) {
            gVar2 = (g) gl1.d.u(gVar);
        }
        g gVar3 = gVar2;
        if (gVar3 != null) {
            return gVar3.mo2onPostScrollDzOQY0M(j8, j14, i14);
        }
        n4.c.f123541b.getClass();
        return 0L;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(long j8, v13.c cVar) {
        d dVar;
        long j14;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i14 = dVar.f1215c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f1215c = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object objMo3onPreFlingQWom1Mo = dVar.f1213a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar.f1215c;
        if (i15 == 0) {
            r.b(objMo3onPreFlingQWom1Mo);
            g gVar = this.f1205a;
            g gVar2 = null;
            if (gVar != null && gVar.getIsAttached()) {
                gVar2 = (g) gl1.d.u(gVar);
            }
            if (gVar2 != null) {
                dVar.f1215c = 1;
                objMo3onPreFlingQWom1Mo = gVar2.mo3onPreFlingQWom1Mo(j8, dVar);
                if (objMo3onPreFlingQWom1Mo == aVar) {
                    return aVar;
                }
            } else {
                s.f76026b.getClass();
                j14 = 0;
            }
            return s.a(j14);
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(objMo3onPreFlingQWom1Mo);
        j14 = ((s) objMo3onPreFlingQWom1Mo).f76027a;
        return s.a(j14);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [e23.a, kotlin.jvm.internal.w] */
    public final b0 d() {
        b0 b0Var = (b0) this.f1207c.invoke();
        if (b0Var != null) {
            return b0Var;
        }
        vb.h.z("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }
}
