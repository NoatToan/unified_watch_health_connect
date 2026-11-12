package zr;

import c2.q;
import c2.q2;
import c2.s2;
import c2.t;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.PrivacyType;
import com.google.android.gms.wallet.WalletConstants;
import e23.p;
import gl1.y;
import h5.e0;
import i3.e9;
import i3.i7;
import i3.mc;
import i3.mh;
import i3.ve;
import java.util.ArrayList;
import java.util.Iterator;
import l72.c1;
import nr.z;
import o13.r;
import o4.d0;
import o4.m1;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import s5.x0;
import v62.e4;
import w52.k0;
import zo1.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class h {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.overview.components.group.EvaluationGroupItemsKt$AddSelfEvaluationCard$1$1$1", f = "EvaluationGroupItems.kt", l = {327}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f206723a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f206724b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(mc mcVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f206724b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f206724b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f206723a;
            if (i14 == 0) {
                r.b(obj);
                this.f206723a = 1;
                if (this.f206724b.b(this) == aVar) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.overview.components.group.EvaluationGroupItemsKt$AddSelfEvaluationCard$3$1$1", f = "EvaluationGroupItems.kt", l = {336}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f206725a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f206726b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(mc mcVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f206726b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f206726b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f206725a;
            if (i14 == 0) {
                r.b(obj);
                this.f206725a = 1;
                if (this.f206726b.d(this) == aVar) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.overview.components.group.EvaluationGroupItemsKt$AddSelfEvaluationCard$5$1$1", f = "EvaluationGroupItems.kt", l = {350}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f206727a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f206728b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f206729c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f206730d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(mc mcVar, p1<Boolean> p1Var, p1<Boolean> p1Var2, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f206728b = mcVar;
            this.f206729c = p1Var;
            this.f206730d = p1Var2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f206728b, this.f206729c, this.f206730d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f206727a;
            if (i14 == 0) {
                r.b(obj);
                Boolean bool = Boolean.FALSE;
                this.f206729c.setValue(bool);
                this.f206730d.setValue(bool);
                this.f206727a = 1;
                if (this.f206728b.d(this) == aVar) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.overview.components.group.EvaluationGroupItemsKt$SelfEvaluationCard$2$1$1", f = "EvaluationGroupItems.kt", l = {389}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f206731a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f206732b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(mc mcVar, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f206732b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f206732b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f206731a;
            if (i14 == 0) {
                r.b(obj);
                this.f206731a = 1;
                if (this.f206732b.b(this) == aVar) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.overview.components.group.EvaluationGroupItemsKt$SelfEvaluationCard$4$1$1", f = "EvaluationGroupItems.kt", l = {399}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f206733a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f206734b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(mc mcVar, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f206734b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new e(this.f206734b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f206733a;
            if (i14 == 0) {
                r.b(obj);
                this.f206733a = 1;
                if (this.f206734b.d(this) == aVar) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.overview.components.group.EvaluationGroupItemsKt$SelfEvaluationCard$6$1$1", f = "EvaluationGroupItems.kt", l = {WalletConstants.ERROR_CODE_UNKNOWN}, m = "invokeSuspend", v = 2)
    public static final class f extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f206735a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f206736b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f206737c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f206738d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(mc mcVar, p1<Boolean> p1Var, p1<Boolean> p1Var2, t13.d<? super f> dVar) {
            super(2, dVar);
            this.f206736b = mcVar;
            this.f206737c = p1Var;
            this.f206738d = p1Var2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new f(this.f206736b, this.f206737c, this.f206738d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f206735a;
            if (i14 == 0) {
                r.b(obj);
                Boolean bool = Boolean.FALSE;
                this.f206737c.setValue(bool);
                this.f206738d.setValue(bool);
                this.f206735a = 1;
                if (this.f206736b.d(this) == aVar) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(h4.r rVar, nr.e.b bVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-252521871);
        int i15 = (o0VarE.B(rVar) ? 4 : 2) | i14 | (o0VarE.B(bVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ2);
            }
            p1 p1Var2 = (p1) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new sk0.l(p1Var, p1Var2, 11);
                o0VarE.K(objQ3);
            }
            mc mcVarF = e9.f(true, (e23.l) objQ3, o0VarE, 54, 0);
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ4);
            }
            b0 b0Var = (b0) objQ4;
            z zVar = bVar.f127009a;
            boolean zR = o0VarE.r(b0Var) | o0VarE.B(mcVarF);
            Object objQ5 = o0VarE.q();
            if (zR || objQ5 == c2565a) {
                objQ5 = new nw0.n(b0Var, mcVarF, 22);
                o0VarE.K(objQ5);
            }
            h(rVar, zVar, (e23.a) objQ5, o0VarE, i15 & 14, 0);
            PrivacyType privacyType = bVar.f127010b;
            Object objQ6 = o0VarE.q();
            if (objQ6 == c2565a) {
                objQ6 = new xq1.c(p1Var, 21);
                o0VarE.K(objQ6);
            }
            e23.l lVar = (e23.l) objQ6;
            boolean zR2 = o0VarE.r(b0Var) | o0VarE.B(mcVarF);
            Object objQ7 = o0VarE.q();
            if (zR2 || objQ7 == c2565a) {
                objQ7 = new nw0.n(b0Var, mcVarF, 23);
                o0VarE.K(objQ7);
            }
            e23.a aVar = (e23.a) objQ7;
            boolean z14 = (i15 & 112) == 32;
            Object objQ8 = o0VarE.q();
            if (z14 || objQ8 == c2565a) {
                objQ8 = new yr.d(bVar, 29);
                o0VarE.K(objQ8);
            }
            o0VarE = o0VarE;
            m.a(privacyType, null, null, mcVarF, lVar, aVar, (p) objQ8, o0VarE, 25008);
            if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                o0VarE.C(1904789610);
                c1 c1Var = c1.f110940a;
                String strQ = y.Q(o0VarE, R.string.title_exit_without_saving);
                String strQ2 = y.Q(o0VarE, R.string.lbl_exit);
                String strQ3 = y.Q(o0VarE, R.string.lbl_cancel);
                boolean zR3 = o0VarE.r(b0Var) | o0VarE.B(mcVarF);
                Object objQ9 = o0VarE.q();
                if (zR3 || objQ9 == c2565a) {
                    objQ9 = new zr.c(b0Var, mcVarF, p1Var, p1Var2, 1);
                    o0VarE.K(objQ9);
                }
                e23.a<Unit> aVar2 = (e23.a) objQ9;
                Object objQ10 = o0VarE.q();
                if (objQ10 == c2565a) {
                    objQ10 = new zk1.d(p1Var2, 14);
                    o0VarE.K(objQ10);
                }
                c1Var.a(false, strQ, null, null, null, strQ2, false, false, aVar2, strQ3, (e23.a) objQ10, o0VarE, 0, 6, 221);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                o0VarE.C(1905294321);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new zi1.a(rVar, bVar, i14, 7);
        }
    }

    public static final void b(int i14, p3.m mVar, int i15) {
        o0 o0VarE = mVar.E(-1884138409);
        int i16 = (o0VarE.k(i14) ? 4 : 2) | i15;
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            h4.r rVarC = c2.l.C(aVar, j92.b.f97899b.f97920e, 0.0f, 0.0f, 0.0f, 14);
            bVar.getClass();
            q.a(u1.n.e(l4.k.b(x2.q(rVarC, j92.b.f97901d.f97904c), k2.i.f102406a), n5.a.a(o0VarE, i14), m1.f128891a), o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ba2.e(i14, i15, 20);
        }
    }

    public static final void c(ArrayList arrayList, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1719212613);
        int i15 = (o0VarE.r(arrayList) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                nr.e eVar = (nr.e) it.next();
                h4.r.a aVar = h4.r.S;
                d92.b.f58623a.getClass();
                j92.b bVar = d92.b.f58625c;
                bVar.getClass();
                j92.e eVar2 = j92.b.f97899b;
                h4.r rVarA = c2.l.A(aVar, eVar2.f97920e, 0.0f, 2);
                bVar.getClass();
                h4.r rVarC = c2.l.C(rVarA, 0.0f, eVar2.f97918c, 0.0f, 0.0f, 13);
                if (eVar instanceof nr.e.b) {
                    o0VarE.C(-1967188768);
                    a(rVarC, (nr.e.b) eVar, o0VarE, 0);
                    o0VarE.g0(false);
                } else if (eVar instanceof nr.e.g) {
                    o0VarE.C(-1967038077);
                    k(rVarC, (nr.e.g) eVar, o0VarE, 0);
                    o0VarE.g0(false);
                } else if (eVar instanceof nr.e.a) {
                    o0VarE.C(-1966894175);
                    nr.e.a aVar2 = (nr.e.a) eVar;
                    h(rVarC, aVar2.f127007a, aVar2.f127008b, o0VarE, 0, 0);
                    o0VarE.g0(false);
                } else if (eVar instanceof nr.e.f) {
                    o0VarE.C(-1966721536);
                    h(rVarC, ((nr.e.f) eVar).f127022a, null, o0VarE, 0, 4);
                    o0VarE.g0(false);
                } else if (eVar instanceof nr.e.h) {
                    o0VarE.C(-1966569636);
                    nr.e.h hVar = (nr.e.h) eVar;
                    i(rVarC, hVar.f127030a, hVar.f127031b, o0VarE, 0);
                    o0VarE.g0(false);
                } else if (eVar instanceof nr.e.C2445e) {
                    o0VarE.C(-1966383140);
                    nr.e.C2445e c2445e = (nr.e.C2445e) eVar;
                    i(rVarC, c2445e.f127020a, c2445e.f127021b, o0VarE, 0);
                    o0VarE.g0(false);
                } else if (eVar instanceof nr.e.d) {
                    o0VarE.C(-1966200829);
                    e(rVarC, (nr.e.d) eVar, o0VarE, 0);
                    o0VarE.g0(false);
                } else {
                    if (!(eVar instanceof nr.e.c)) {
                        throw kg.f.h(o0VarE, 213635362, false);
                    }
                    o0VarE.C(-1966050882);
                    nr.e.c cVar = (nr.e.c) eVar;
                    o0 o0Var = o0VarE;
                    j(rVarC, cVar.f127012a, cVar.f127013b, cVar.f127014c, o0Var, 0);
                    o0VarE = o0Var;
                    o0VarE.g0(false);
                }
            }
            x1 x1Var2 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new bp0.b(arrayList, i14, 10);
        }
    }

    public static final void d(h4.r rVar, z zVar, p3.m mVar, int i14) {
        long jB;
        h4.r rVar2 = rVar;
        o0 o0VarE = mVar.E(-1527792548);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = (o0VarE.B(rVar2) ? 4 : 2) | i14 | (o0VarE.B(zVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            c2.j.f22691a.getClass();
            c2.j.f fVar = c2.j.f22699i;
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarA = c2.l.A(aVar, 0.0f, eVar.f97920e, 1);
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(fVar, h4.d.a.f81536n, o0VarE, 6);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarA, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            d0 d0VarA = null;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            h5.g.a.f fVar2 = h5.g.a.f81807d;
            b4.c(fVar2, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            s2 s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81534l, o0VarE, 48);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(aVar, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            }
            b4.c(fVar2, rVarC2, o0VarE);
            u2 u2Var = u2.f22900a;
            String str = zVar.f127595a;
            j92.f fVar3 = d92.b.f58624b;
            fVar3.getClass();
            x0 x0VarE = d92.c.e(d92.c.b(j92.f.f97932i, o0VarE));
            bVar.getClass();
            float f14 = eVar.f97920e;
            bVar.getClass();
            mh.c(str, c2.l.C(aVar, f14, 0.0f, eVar.f97918c, 0.0f, 10), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarE, o0VarE, 0, 0, 131068);
            s62.a.f157643a.getClass();
            u4.d dVarA = e4.a(t62.b.f162798a);
            bVar.getClass();
            h4.r rVarQ = x2.q(aVar, j92.b.f97901d.f97903b);
            Integer num = zVar.f127599e;
            if (num == null) {
                o0VarE.C(-1280445530);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1280445529);
                long jA = n5.a.a(o0VarE, num.intValue());
                o0VarE.g0(false);
                d0VarA = d0.a(jA);
            }
            d0 d0Var = d0VarA;
            if (d0Var == null) {
                o0VarE.C(1621264713);
                jB = d92.b.a(o0VarE).f().b();
                o0VarE.g0(false);
            } else {
                o0VarE.C(1621262667);
                o0VarE.g0(false);
                jB = d0Var.f128833a;
            }
            i7.b(dVarA, null, rVarQ, jB, o0VarE, 48, 0);
            o0VarE.g0(true);
            String str2 = zVar.f127596b;
            if (str2 == null) {
                str2 = "";
            }
            fVar3.getClass();
            x0 x0VarF = d92.c.f(j92.f.f97933j, o0VarE);
            bVar.getClass();
            rVar2 = rVar;
            mh.c(str2, c2.l.C(rVar2, 0.0f, 0.0f, eVar.f97920e, 0.0f, 11), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 131068);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new zi1.a(rVar2, zVar, i14, 8);
        }
    }

    public static final void e(h4.r rVar, nr.e.d dVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(1294485806);
        int i15 = (o0VarE.B(rVar) ? 4 : 2) | i14 | (o0VarE.B(dVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            h4.r rVarF = x2.f(rVar, 1.0f);
            long jB = am.j.B(d92.b.f58623a, o0VarE);
            d92.b.f58625c.getClass();
            ve.a(rVarF, k2.i.a(j92.b.f97900c.f97911c), jB, 0L, 0.0f, 0.0f, null, z3.f.c(164242441, new g(dVar, 0), o0VarE), o0VarE, 12582912, 120);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new zi1.a(rVar, dVar, i14, 9);
        }
    }

    public static final void f(t tVar, z zVar, Integer num, p3.m mVar, int i14) {
        int i15;
        Unit unit;
        long jB;
        o0 o0VarE = mVar.E(-745885288);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(tVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(zVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(num) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            h4.d.f81522a.getClass();
            h4.g.b bVar = h4.d.a.f81534l;
            h4.r.a aVar = h4.r.S;
            h4.r rVarC = tVar.c(aVar, h4.d.a.f81529g);
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            h4.r rVarC2 = c2.l.C(rVarC, 0.0f, 0.0f, j92.b.f97899b.f97920e, 0.0f, 11);
            c2.j.f22691a.getClass();
            s2 s2VarA = q2.a(c2.j.f22692b, bVar, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC3 = h4.k.c(rVarC2, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            d0 d0VarA = null;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            b4.c(h5.g.a.f81807d, rVarC3, o0VarE);
            u2 u2Var = u2.f22900a;
            String str = zVar.f127597c;
            if (str == null) {
                str = "";
            }
            d92.b.f58624b.getClass();
            mh.c(str, null, com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97931h, o0VarE, 0, 0, 131066);
            o0VarE = o0VarE;
            if (num == null) {
                o0VarE.C(-1872187533);
                o0VarE.g0(false);
                unit = null;
            } else {
                o0VarE.C(-1872187532);
                b(num.intValue(), o0VarE, 0);
                o0VarE.g0(false);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                o0VarE.C(-1872115364);
                u4.d dVar = zVar.f127598d;
                if (dVar == null) {
                    o0VarE.C(-1872115365);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-1872115364);
                    bVar2.getClass();
                    h4.r rVarQ = x2.q(aVar, j92.b.f97901d.f97905d);
                    Integer num2 = zVar.f127599e;
                    if (num2 == null) {
                        o0VarE.C(-842734149);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(-842734148);
                        long jA = n5.a.a(o0VarE, num2.intValue());
                        o0VarE.g0(false);
                        d0VarA = d0.a(jA);
                    }
                    d0 d0Var = d0VarA;
                    if (d0Var == null) {
                        o0VarE.C(-1551204204);
                        jB = d92.b.a(o0VarE).f().b();
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(-1551206250);
                        o0VarE.g0(false);
                        jB = d0Var.f128833a;
                    }
                    i7.b(dVar, null, rVarQ, jB, o0VarE, 48, 0);
                    o0VarE.g0(false);
                    Unit unit2 = Unit.INSTANCE;
                }
                o0VarE.g0(false);
            } else {
                o0VarE.C(216701428);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k0(tVar, zVar, num, i14);
        }
    }

    public static final void g(h4.r rVar, z zVar, Integer num, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-2084063354);
        int i15 = i14 | (o0VarE.B(zVar) ? 32 : 16) | (o0VarE.B(num) ? 256 : 128) | 3072;
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            l72.l.d(zVar.f127595a, zVar.f127596b, z3.f.c(-390401158, new zr.e(zVar, num, 1), o0VarE), rVar, null, false, null, o0VarE, 1576320, 48);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f0(rVar, zVar, num, i14, 3);
        }
    }

    public static final void h(h4.r rVar, z zVar, e23.a<Unit> aVar, p3.m mVar, int i14, int i15) {
        int i16;
        int i17;
        e23.a<Unit> aVar2;
        o0 o0VarE = mVar.E(-1710569972);
        if ((i14 & 6) == 0) {
            i16 = i14 | (o0VarE.B(rVar) ? 4 : 2);
        } else {
            i16 = i14;
        }
        int i18 = i16 | (o0VarE.B(zVar) ? 32 : 16);
        int i19 = i15 & 4;
        if (i19 != 0) {
            i17 = i18 | 384;
        } else {
            i17 = i18 | (o0VarE.r(aVar) ? 256 : 128);
        }
        if (o0VarE.n(i17 & 1, (i17 & 147) != 146)) {
            e23.a<Unit> aVar3 = i19 != 0 ? null : aVar;
            x1 x1Var = n.f135158a;
            l72.l.d(zVar.f127595a, zVar.f127596b, z3.f.c(-1790506752, new xn.t(zVar, 24), o0VarE), rVar, null, false, aVar3, o0VarE, ((i17 << 9) & 7168) | 384 | ((i17 << 12) & 3670016), 48);
            aVar2 = aVar3;
        } else {
            o0VarE.e();
            aVar2 = aVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new zr.f(rVar, zVar, aVar2, i14, i15, 0);
        }
    }

    public static final void i(h4.r rVar, z zVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(1825500348);
        int i15 = (o0VarE.B(rVar) ? 4 : 2) | i14 | (o0VarE.B(zVar) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            l72.l.c(z3.f.c(-756453878, new zr.d(rVar, zVar, 0), o0VarE), null, rVar, null, false, aVar, o0VarE, ((i15 << 6) & 896) | 6 | ((i15 << 9) & 458752), 26);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f0(rVar, zVar, aVar, i14, 2);
        }
    }

    public static final void j(h4.r rVar, z zVar, Integer num, e23.a<Unit> aVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-824003300);
        int i15 = (o0VarE.B(rVar) ? 4 : 2) | i14 | (o0VarE.B(zVar) ? 32 : 16) | (o0VarE.B(num) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            int i16 = i15 << 6;
            l72.l.c(z3.f.c(926237326, new zr.d(rVar, zVar, 1), o0VarE), z3.f.c(-1896451377, new zr.e(zVar, num, 0), o0VarE), rVar, null, false, aVar, o0VarE, (i16 & 896) | 54 | (i16 & 458752), 24);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new xr.n(rVar, zVar, num, aVar, i14, 20);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void k(h4.r rVar, nr.e.g gVar, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(55767163);
        int i16 = (o0VarE.B(rVar) ? 4 : 2) | i14 | (o0VarE.B(gVar) ? 32 : 16);
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ2);
            }
            p1 p1Var2 = (p1) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new sk0.l(p1Var, p1Var2, 12);
                o0VarE.K(objQ3);
            }
            mc mcVarF = e9.f(true, (e23.l) objQ3, o0VarE, 54, 0);
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ4);
            }
            b0 b0Var = (b0) objQ4;
            z3.e eVarC = z3.f.c(-721039927, new xn.t(gVar, 26), o0VarE);
            boolean zR = o0VarE.r(b0Var) | o0VarE.B(mcVarF);
            Object objQ5 = o0VarE.q();
            if (zR || objQ5 == c2565a) {
                objQ5 = new nw0.n(b0Var, mcVarF, 24);
                o0VarE.K(objQ5);
            }
            l72.l.c(eVarC, null, rVar, null, false, (e23.a) objQ5, o0VarE, ((i16 << 6) & 896) | 6, 26);
            PrivacyType privacyType = gVar.f127026c;
            Integer num = gVar.f127027d;
            Integer num2 = gVar.f127028e;
            Object objQ6 = o0VarE.q();
            if (objQ6 == c2565a) {
                objQ6 = new xq1.c(p1Var, 22);
                o0VarE.K(objQ6);
            }
            e23.l lVar = (e23.l) objQ6;
            boolean zR2 = o0VarE.r(b0Var) | o0VarE.B(mcVarF);
            Object objQ7 = o0VarE.q();
            if (zR2 || objQ7 == c2565a) {
                objQ7 = new nw0.n(b0Var, mcVarF, 25);
                o0VarE.K(objQ7);
            }
            e23.a aVar = (e23.a) objQ7;
            boolean z14 = (i16 & 112) == 32;
            Object objQ8 = o0VarE.q();
            if (z14 || objQ8 == c2565a) {
                objQ8 = new g(gVar, 1);
                o0VarE.K(objQ8);
            }
            i15 = 6;
            m.a(privacyType, num, num2, mcVarF, lVar, aVar, (p) objQ8, o0VarE, 24576);
            if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                o0VarE.C(-791352775);
                c1 c1Var = c1.f110940a;
                String strQ = y.Q(o0VarE, R.string.title_exit_without_saving);
                String strQ2 = y.Q(o0VarE, R.string.lbl_exit);
                String strQ3 = y.Q(o0VarE, R.string.lbl_cancel);
                boolean zR3 = o0VarE.r(b0Var) | o0VarE.B(mcVarF);
                Object objQ9 = o0VarE.q();
                if (zR3 || objQ9 == c2565a) {
                    objQ9 = new zr.c(b0Var, mcVarF, p1Var, p1Var2, 0);
                    o0VarE.K(objQ9);
                }
                e23.a<Unit> aVar2 = (e23.a) objQ9;
                Object objQ10 = o0VarE.q();
                if (objQ10 == c2565a) {
                    objQ10 = new zk1.d(p1Var2, 13);
                    o0VarE.K(objQ10);
                }
                c1Var.a(false, strQ, null, null, null, strQ2, false, false, aVar2, strQ3, (e23.a) objQ10, o0VarE, 0, 6, 221);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-790841337);
                o0VarE.g0(false);
            }
        } else {
            i15 = 6;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new zi1.a(rVar, gVar, i14, i15);
        }
    }
}
