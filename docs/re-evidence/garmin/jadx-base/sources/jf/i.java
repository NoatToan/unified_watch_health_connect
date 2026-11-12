package jf;

import android.content.Context;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
public interface i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f98653a;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements i {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f98654b = new a();

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // jf.i
        public final Object a(hf.j jVar, wf.f fVar, v13.c cVar) {
            h hVar;
            t4.d dVarA;
            if (cVar instanceof h) {
                hVar = (h) cVar;
                int i14 = hVar.f98652d;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    hVar.f98652d = i14 - Integer.MIN_VALUE;
                } else {
                    hVar = new h(this, cVar);
                }
            } else {
                hVar = new h(this, cVar);
            }
            Object objA = hVar.f98650b;
            Object obj = u13.a.COROUTINE_SUSPENDED;
            int i15 = hVar.f98652d;
            if (i15 == 0) {
                o13.r.b(objA);
                hVar.f98649a = fVar;
                hVar.f98652d = 1;
                objA = jVar.a(fVar, hVar);
                if (objA == obj) {
                    return obj;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fVar = hVar.f98649a;
                o13.r.b(objA);
            }
            wf.i iVar = (wf.i) objA;
            if (iVar instanceof wf.p) {
                wf.p pVar = (wf.p) iVar;
                hf.h hVar2 = pVar.f185006a;
                Context context = fVar.f184902a;
                q4.f.f142555o0.getClass();
                return new d.c.C1894d(n.a(hVar2, context, q4.f.a.f142558c), pVar);
            }
            if (!(iVar instanceof wf.e)) {
                u0.r();
                return null;
            }
            wf.e eVar = (wf.e) iVar;
            hf.h hVar3 = eVar.f184899a;
            if (hVar3 != null) {
                Context context2 = fVar.f184902a;
                q4.f.f142555o0.getClass();
                dVarA = n.a(hVar3, context2, q4.f.a.f142558c);
            } else {
                dVarA = null;
            }
            return new d.c.b(dVarA, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001¨\u0006\u0007"}, d2 = {"Ljf/i$b;", "", "<init>", "()V", "Ljf/i;", "Default", "Ljf/i;", "coil-compose-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f98655a = 0;

        static {
            new b();
        }

        private b() {
        }
    }

    static {
        int i14 = b.f98655a;
        f98653a = a.f98654b;
    }

    Object a(hf.j jVar, wf.f fVar, v13.c cVar);
}
