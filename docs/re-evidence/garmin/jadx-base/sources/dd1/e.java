package dd1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b.u;
import e23.l;
import n82.j;
import o82.g;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class a extends q implements e23.a<Unit> {
        public a(Object obj) {
            super(0, obj, u.class, "onBackPressed", "onBackPressed()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            ((u) this.receiver).d();
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f59203a;

        static {
            int[] iArr = new int[g.values().length];
            try {
                iArr[g.f130849b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f59203a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(u82.d<o82.a, fd1.d> dVar, u82.d<o82.a, fd1.e> dVar2, u82.d<o82.a, fd1.e> dVar3, i53.c<? extends ad1.b> cVar, l<? super Integer, Unit> lVar, e23.a<Unit> aVar, m mVar, int i14) {
        dVar.getClass();
        dVar2.getClass();
        dVar3.getClass();
        cVar.getClass();
        lVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(-379345781);
        int i15 = i14 | (o0VarE.B(dVar) ? 4 : 2) | (o0VarE.B(dVar2) ? 32 : 16) | (o0VarE.B(dVar3) ? 256 : 128) | (o0VarE.B(cVar) ? 2048 : 1024) | (o0VarE.r(lVar) ? 16384 : 8192) | (o0VarE.r(aVar) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            u uVar = (u) o0VarE.A(g02.d.f74342a);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = i53.a.a(g.f130849b, g.f130853f, g.f130858k, g.f130859l);
                o0VarE.K(objQ);
            }
            i53.f fVar = (i53.f) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new n82.f.a((g) fVar.get(0), null, null, 6, null);
                o0VarE.K(objQ2);
            }
            n82.f fVarA = j.a((n82.f.a) objQ2, null, o0VarE, 2);
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new ed1.a(context);
                o0VarE.K(objQ3);
            }
            z02.d.a(false, z3.f.c(2089285862, new c(uVar, aVar, 0), o0VarE), null, null, null, z3.f.c(-1696083358, new d(fVar, fVarA, (ed1.a) objQ3, dVar, dVar2, dVar3, cVar, lVar, 0), o0VarE), o0VarE, 196656, 29);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.c((Object) dVar, (Object) dVar2, (Object) dVar3, (Object) cVar, (l) lVar, (e23.a) aVar, i14, 15);
        }
    }
}
