package vb1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c80.l0;
import c80.q0;
import e23.l;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p40.j0;
import r1.c0;
import r1.u0;
import r53.j;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: vb1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.presentation.components.CrossSellPromoCardKt$CrossSellPromoCard$1$1", f = "CrossSellPromoCard.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class C3300a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f176843a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f176844b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r53.i<q0> f176845c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ l0.b f176846d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f176847e;

        /* JADX INFO: renamed from: vb1.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.presentation.components.CrossSellPromoCardKt$CrossSellPromoCard$1$1$1", f = "CrossSellPromoCard.kt", l = {41}, m = "invokeSuspend", v = 2)
        public static final class C3301a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f176848a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r53.i<q0> f176849b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ l0.b f176850c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ p1<Boolean> f176851d;

            /* JADX INFO: renamed from: vb1.a$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C3302a<T> implements j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ l0.b f176852a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ p1<Boolean> f176853b;

                public C3302a(l0.b bVar, p1<Boolean> p1Var) {
                    this.f176852a = bVar;
                    this.f176853b = p1Var;
                }

                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) {
                    q0 q0Var = (q0) obj;
                    if ((q0Var instanceof q0.a) && ((q0.a) q0Var).f25550a == this.f176852a.f25409a) {
                        this.f176853b.setValue(Boolean.FALSE);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C3301a(r53.i<? extends q0> iVar, l0.b bVar, p1<Boolean> p1Var, t13.d<? super C3301a> dVar) {
                super(2, dVar);
                this.f176849b = iVar;
                this.f176850c = bVar;
                this.f176851d = p1Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C3301a(this.f176849b, this.f176850c, this.f176851d, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C3301a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f176848a;
                if (i14 == 0) {
                    r.b(obj);
                    C3302a c3302a = new C3302a(this.f176850c, this.f176851d);
                    this.f176848a = 1;
                    if (this.f176849b.collect(c3302a, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C3300a(e23.a<Unit> aVar, r53.i<? extends q0> iVar, l0.b bVar, p1<Boolean> p1Var, t13.d<? super C3300a> dVar) {
            super(2, dVar);
            this.f176844b = aVar;
            this.f176845c = iVar;
            this.f176846d = bVar;
            this.f176847e = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            C3300a c3300a = new C3300a(this.f176844b, this.f176845c, this.f176846d, this.f176847e, dVar);
            c3300a.f176843a = obj;
            return c3300a;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C3300a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            b0 b0Var = (b0) this.f176843a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            this.f176844b.invoke();
            ge1.b.T(b0Var, null, null, new C3301a(this.f176845c, this.f176846d, this.f176847e, null), 3);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(h4.r rVar, l0.b bVar, r53.i<? extends q0> iVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, l<? super Context, Unit> lVar, m mVar, int i14) {
        int i15;
        p1 p1Var;
        m.a.C2565a c2565a;
        rVar.getClass();
        o0 o0VarE = mVar.E(-1698462892);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.B(rVar) ? 4 : 2);
        } else {
            i15 = i14;
        }
        int i16 = i15 | (o0VarE.B(bVar) ? 32 : 16) | (o0VarE.r(iVar) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024) | (o0VarE.r(aVar2) ? 16384 : 8192) | (o0VarE.r(lVar) ? 131072 : 65536);
        if (o0VarE.n(i16 & 1, (74899 & i16) != 74898)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a2 = m.a.f135155b;
            if (objQ == c2565a2) {
                objQ = p0.n(Boolean.TRUE);
                o0VarE.K(objQ);
            }
            p1 p1Var2 = (p1) objQ;
            Unit unit = Unit.INSTANCE;
            boolean zR = ((i16 & 112) == 32) | ((i16 & 7168) == 2048) | o0VarE.r(iVar);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a2) {
                p1Var = p1Var2;
                c2565a = c2565a2;
                C3300a c3300a = new C3300a(aVar, iVar, bVar, p1Var, null);
                o0VarE.K(c3300a);
                objQ2 = c3300a;
            } else {
                c2565a = c2565a2;
                p1Var = p1Var2;
            }
            p3.l0.e((p) objQ2, unit, o0VarE);
            boolean z14 = (57344 & i16) == 16384;
            Object objQ3 = o0VarE.q();
            if (z14 || objQ3 == c2565a) {
                objQ3 = new j0(aVar2, p1Var, 16);
                o0VarE.K(objQ3);
            }
            c0.e(((Boolean) p1Var.getF182175a()).booleanValue(), null, null, u0.j(null, null, 15), null, z3.f.c(124237180, new ku1.l(bVar, rVar, lVar, context, (e23.a) objQ3, 22), o0VarE), o0VarE, 199680, 22);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q32.b(rVar, bVar, iVar, aVar, aVar2, lVar, i14, 16);
        }
    }
}
