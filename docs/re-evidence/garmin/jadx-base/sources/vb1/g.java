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
public final class g {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.presentation.components.MediumPromoCardKt$MediumPromoCard$1$1", f = "MediumPromoCard.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f176886a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f176887b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r53.i<q0> f176888c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ l0.d f176889d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f176890e;

        /* JADX INFO: renamed from: vb1.g$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.presentation.components.MediumPromoCardKt$MediumPromoCard$1$1$1", f = "MediumPromoCard.kt", l = {64}, m = "invokeSuspend", v = 2)
        public static final class C3305a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f176891a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r53.i<q0> f176892b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ l0.d f176893c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ p1<Boolean> f176894d;

            /* JADX INFO: renamed from: vb1.g$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C3306a<T> implements j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ l0.d f176895a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ p1<Boolean> f176896b;

                public C3306a(l0.d dVar, p1<Boolean> p1Var) {
                    this.f176895a = dVar;
                    this.f176896b = p1Var;
                }

                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) {
                    q0 q0Var = (q0) obj;
                    if ((q0Var instanceof q0.a) && ((q0.a) q0Var).f25550a == this.f176895a.f25409a) {
                        this.f176896b.setValue(Boolean.FALSE);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C3305a(r53.i<? extends q0> iVar, l0.d dVar, p1<Boolean> p1Var, t13.d<? super C3305a> dVar2) {
                super(2, dVar2);
                this.f176892b = iVar;
                this.f176893c = dVar;
                this.f176894d = p1Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C3305a(this.f176892b, this.f176893c, this.f176894d, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C3305a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f176891a;
                if (i14 == 0) {
                    r.b(obj);
                    C3306a c3306a = new C3306a(this.f176893c, this.f176894d);
                    this.f176891a = 1;
                    if (this.f176892b.collect(c3306a, this) == aVar) {
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
        public a(e23.a<Unit> aVar, r53.i<? extends q0> iVar, l0.d dVar, p1<Boolean> p1Var, t13.d<? super a> dVar2) {
            super(2, dVar2);
            this.f176887b = aVar;
            this.f176888c = iVar;
            this.f176889d = dVar;
            this.f176890e = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f176887b, this.f176888c, this.f176889d, this.f176890e, dVar);
            aVar.f176886a = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            b0 b0Var = (b0) this.f176886a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            this.f176887b.invoke();
            ge1.b.T(b0Var, null, null, new C3305a(this.f176888c, this.f176889d, this.f176890e, null), 3);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(h4.r rVar, l0.d dVar, r53.i<? extends q0> iVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, l<? super Context, Unit> lVar, m mVar, int i14) {
        int i15;
        p1 p1Var;
        rVar.getClass();
        String str = dVar.f25423e;
        o0 o0VarE = mVar.E(427004554);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.B(rVar) ? 4 : 2);
        } else {
            i15 = i14;
        }
        int i16 = (o0VarE.r(lVar) ? 131072 : 65536) | i15 | (o0VarE.B(dVar) ? 32 : 16) | (o0VarE.r(iVar) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024) | (o0VarE.r(aVar2) ? 16384 : 8192);
        if (o0VarE.n(i16 & 1, (74899 & i16) != 74898)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            String str2 = dVar.f25426h;
            String str3 = dVar.f25424f;
            String str4 = dVar.f25425g;
            boolean zD = g22.n.d(str);
            if (!zD) {
                str = dVar.f25422d;
            }
            String str5 = str;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.TRUE);
                o0VarE.K(objQ);
            }
            p1 p1Var2 = (p1) objQ;
            Unit unit = Unit.INSTANCE;
            boolean zR = ((i16 & 112) == 32) | ((i16 & 7168) == 2048) | o0VarE.r(iVar);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                p1Var = p1Var2;
                a aVar3 = new a(aVar, iVar, dVar, p1Var, null);
                o0VarE.K(aVar3);
                objQ2 = aVar3;
            } else {
                p1Var = p1Var2;
            }
            p3.l0.e((p) objQ2, unit, o0VarE);
            boolean z14 = (57344 & i16) == 16384;
            Object objQ3 = o0VarE.q();
            if (z14 || objQ3 == c2565a) {
                objQ3 = new j0(aVar2, p1Var, 18);
                o0VarE.K(objQ3);
            }
            c0.e(((Boolean) p1Var.getF182175a()).booleanValue(), null, null, u0.j(null, null, 15), null, z3.f.c(-1390995278, new gw0.b(rVar, str5, str3, str4, str2, (e23.a) objQ3, lVar, context, zD), o0VarE), o0VarE, 199680, 22);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q32.b(rVar, dVar, iVar, aVar, aVar2, lVar, i14, 18);
        }
    }
}
