package v72;

import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import c2.c3;
import c2.k3;
import c2.n3;
import c2.p3;
import c2.q3;
import e23.l;
import e23.p;
import i3.kb;
import java.util.List;
import lc.m0;
import lc.y;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;
import p005kotlin.jvm.internal.s0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;
import v13.i;
import vb.h;
import w72.g;
import x5.l0;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.ui.catalog.library.search.SearchScreenKt$SearchScreen$1$1", f = "SearchScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m4.b0 f176187a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m4.b0 b0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f176187a = b0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f176187a, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            m4.b0.a(this.f176187a);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class b extends q implements l<l0, Unit> {
        public b(Object obj) {
            super(1, obj, v72.b.class, "onSearchTextChange", "onSearchTextChange(Landroidx/compose/ui/text/input/TextFieldValue;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(l0 l0Var) {
            l0 l0Var2 = l0Var;
            l0Var2.getClass();
            v72.b bVar = (v72.b) this.receiver;
            bVar.getClass();
            bVar.f176175a.k(null, l0Var2);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: v72.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C3284c implements e23.a<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n72.i f176188a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f176189b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ m0 f176190c;

        public C3284c(n72.i iVar, Context context, m0 m0Var) {
            this.f176188a = iVar;
            this.f176189b = context;
            this.f176190c = m0Var;
        }

        @Override // e23.a
        public final Unit invoke() {
            n72.i iVar = this.f176188a;
            if (iVar instanceof n72.a) {
                l<Context, Intent> lVar = ((n72.a) iVar).f124847f;
                Context context = this.f176189b;
                context.startActivity(lVar.invoke(context));
            } else {
                y.l(this.f176190c, new g.e(iVar.getF124912a()));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f176191a = new d();

        @Override // e23.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f176192a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f176193b;

        public e(l lVar, List list) {
            this.f176192a = lVar;
            this.f176193b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f176192a.invoke(this.f176193b.get(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.r<e2.d, Integer, m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f176194a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f176195b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ m0 f176196c;

        public f(List list, Context context, m0 m0Var) {
            this.f176194a = list;
            this.f176195b = context;
            this.f176196c = m0Var;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0092  */
        @Override // e23.r
        public final Unit invoke(e2.d dVar, Integer num, m mVar, Integer num2) {
            int i14;
            e2.d dVar2 = dVar;
            int iIntValue = num.intValue();
            m mVar2 = mVar;
            int iIntValue2 = num2.intValue();
            if ((iIntValue2 & 6) == 0) {
                i14 = (mVar2.B(dVar2) ? 4 : 2) | iIntValue2;
            } else {
                i14 = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                i14 |= mVar2.k(iIntValue) ? 32 : 16;
            }
            if (mVar2.n(i14 & 1, (i14 & 147) != 146)) {
                x1 x1Var = n.f135158a;
                n72.i iVar = (n72.i) this.f176194a.get(iIntValue);
                mVar2.C(10994064);
                String f124913b = iVar.getF124913b();
                String f124914c = iVar.getF124914c();
                h4.r.a aVar = h4.r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarA = c2.l.A(aVar, j92.b.f97899b.f97920e, 0.0f, 2);
                boolean zR = mVar2.r(iVar);
                Context context = this.f176195b;
                boolean zR2 = zR | mVar2.r(context);
                m0 m0Var = this.f176196c;
                boolean zR3 = zR2 | mVar2.r(m0Var);
                Object objQ = mVar2.q();
                if (zR3) {
                    objQ = new C3284c(iVar, context, m0Var);
                    mVar2.K(objQ);
                } else {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new C3284c(iVar, context, m0Var);
                        mVar2.K(objQ);
                    }
                }
                l72.l.d(f124913b, f124914c, null, rVarA, null, false, (e23.a) objQ, mVar2, 0, 52);
                mVar2.f();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    public static final void a(m0 m0Var, e23.a<Unit> aVar, m mVar, int i14) {
        m0Var.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(-1530127459);
        int i15 = (o0VarE.r(m0Var) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            v9.a.f176280a.getClass();
            ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(o0VarE);
            if (viewModelStoreOwnerA == null) {
                h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            v72.b bVar = (v72.b) v9.b.a(s0.f105811a.b(v72.b.class), viewModelStoreOwnerA, null, null, viewModelStoreOwnerA instanceof androidx.lifecycle.y ? ((androidx.lifecycle.y) viewModelStoreOwnerA).getDefaultViewModelCreationExtras() : CreationExtras.b.f8056c, o0VarE);
            p1 p1VarC = s9.c.c(bVar.f176176b, o0VarE);
            p1 p1VarC2 = s9.c.c(bVar.f176181g, o0VarE);
            p1 p1VarC3 = s9.c.c(bVar.f176178d, o0VarE);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = kg.f.j(o0VarE);
            }
            m4.b0 b0Var = (m4.b0) objQ;
            Unit unit = Unit.INSTANCE;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new a(b0Var, null);
                o0VarE.K(objQ2);
            }
            p3.l0.e((p) objQ2, unit, o0VarE);
            z3.e eVarC = z3.f.c(-1435968423, new tb0.h(b0Var, 21, bVar, p1VarC), o0VarE);
            int i16 = k3.f22728a;
            c3 c3VarB = q3.b(o0VarE);
            p3.f22815b.getClass();
            kb.a(null, eVarC, null, null, null, 0, 0L, 0L, n3.d(c3VarB, p3.f22826m), z3.f.c(-69555538, new mw0.h(bVar, p1VarC2, m0Var, p1VarC3, 29), o0VarE), o0VarE, 805306416, 253);
            o0VarE = o0VarE;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n72.h(m0Var, aVar, i14, 2);
        }
    }
}
