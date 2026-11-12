package mg2;

import p005kotlin.Metadata;
import p3.c2;
import p3.p0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lmg2/g;", "", "<init>", "()V", "a", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z53.b f118386a = z53.c.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c2 f118387b = p0.n(null);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lmg2/g$a;", "Lmg2/f;", "Lug2/f;", "visuals", "Lo53/j;", "Lmg2/i;", "continuation", "<init>", "(Lug2/f;Lo53/j;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ug2.f f118388a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o53.j<i> f118389b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(ug2.f fVar, o53.j<? super i> jVar) {
            fVar.getClass();
            jVar.getClass();
            this.f118388a = fVar;
            this.f118389b = jVar;
        }

        @Override // mg2.f
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ug2.f getF118388a() {
            return this.f118388a;
        }

        @Override // mg2.f
        public final void dismiss() {
            o53.j<i> jVar = this.f118389b;
            if (jVar.isActive()) {
                int i14 = o13.q.f128596b;
                jVar.resumeWith(i.Dismissed);
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f118388a.equals(aVar.f118388a) && this.f118389b.equals(aVar.f118389b);
        }

        public final int hashCode() {
            return this.f118389b.hashCode() + (this.f118388a.hashCode() * 31);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(ug2.f fVar, v13.c cVar) {
        h hVar;
        z53.a aVar;
        int i14;
        ug2.f fVar2;
        Throwable th3;
        z53.a aVar2;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i15 = hVar.f118395f;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                hVar.f118395f = i15 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar);
            }
        } else {
            hVar = new h(this, cVar);
        }
        Object obj = hVar.f118393d;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i16 = hVar.f118395f;
        c2 c2Var = this.f118387b;
        try {
            try {
                if (i16 == 0) {
                    o13.r.b(obj);
                    hVar.f118390a = fVar;
                    aVar = this.f118386a;
                    hVar.f118391b = aVar;
                    i14 = 0;
                    hVar.f118392c = 0;
                    hVar.f118395f = 1;
                    if (aVar.c(hVar) != aVar3) {
                    }
                    fVar2 = fVar;
                    return aVar3;
                }
                if (i16 != 1) {
                    if (i16 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aVar2 = hVar.f118391b;
                    try {
                        o13.r.b(obj);
                        c2Var.setValue(null);
                        aVar2.e(null);
                        return obj;
                    } catch (Throwable th4) {
                        th3 = th4;
                        c2Var.setValue(null);
                        throw th3;
                    }
                }
                int i17 = hVar.f118392c;
                z53.a aVar4 = hVar.f118391b;
                ug2.f fVar3 = hVar.f118390a;
                o13.r.b(obj);
                aVar = aVar4;
                i14 = i17;
                fVar2 = fVar3;
                fVar2 = fVar;
                hVar.f118390a = fVar2;
                hVar.f118391b = aVar;
                hVar.f118392c = i14;
                hVar.f118395f = 2;
                o53.k kVar = new o53.k(u13.f.b(hVar), 1);
                kVar.q();
                c2Var.setValue(new a(fVar2, kVar));
                Object objP = kVar.p();
                if (objP != aVar3) {
                    z53.a aVar5 = aVar;
                    obj = objP;
                    aVar2 = aVar5;
                    c2Var.setValue(null);
                    aVar2.e(null);
                    return obj;
                }
                fVar2 = fVar;
                return aVar3;
            } catch (Throwable th5) {
                th3 = th5;
                c2Var.setValue(null);
                throw th3;
            }
        } catch (Throwable th6) {
            fVar.e(null);
            throw th6;
        }
    }
}
