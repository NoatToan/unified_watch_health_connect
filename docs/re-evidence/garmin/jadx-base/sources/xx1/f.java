package xx1;

import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.firebase.messaging.Constants;
import e23.l;
import e23.p;
import e23.r;
import j02.d0;
import j02.h0;
import j02.j;
import java.util.List;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class f {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements r<j, Boolean, m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ dy1.g f192565a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ dy1.h f192566b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f192567c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p1<String> f192568d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ l<String, Unit> f192569e;

        /* JADX WARN: Multi-variable type inference failed */
        public a(dy1.g gVar, dy1.h hVar, p1<Boolean> p1Var, p1<String> p1Var2, l<? super String, Unit> lVar) {
            this.f192565a = gVar;
            this.f192566b = hVar;
            this.f192567c = p1Var;
            this.f192568d = p1Var2;
            this.f192569e = lVar;
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0060  */
        @Override // e23.r
        public final Unit invoke(j jVar, Boolean bool, m mVar, Integer num) {
            j jVar2 = jVar;
            bool.getClass();
            m mVar2 = mVar;
            int iIntValue = num.intValue();
            jVar2.getClass();
            if ((iIntValue & 6) == 0) {
                iIntValue |= mVar2.B(jVar2) ? 4 : 2;
            }
            if (mVar2.n(iIntValue & 1, (iIntValue & 131) != 130)) {
                x1 x1Var = n.f135158a;
                boolean z14 = this.f192565a.f61555b.size() > 1;
                p1<Boolean> p1Var = this.f192567c;
                boolean zB = mVar2.B(p1Var);
                p1<String> p1Var2 = this.f192568d;
                boolean zB2 = zB | mVar2.B(p1Var2);
                Object objQ = mVar2.q();
                if (zB2) {
                    objQ = new xx1.e(p1Var, p1Var2);
                    mVar2.K(objQ);
                } else {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new xx1.e(p1Var, p1Var2);
                        mVar2.K(objQ);
                    }
                }
                qx1.h.a(jVar2, this.f192566b, (l) objQ, this.f192569e, z14, mVar2, iIntValue & 14);
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo53/b0;", "Le2/n;", Constants.MessagePayloadKeys.FROM, "to", "", "<anonymous>", "(Lo53/b0;Le2/n;Le2/n;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.presentation.composables.screen.wizard.customplans.EditPrimaryLiftScreenKt$EditPrimaryLiftScreen$2$1$reorderableLazyColumnState$1$1", f = "EditPrimaryLiftScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements r<b0, e2.n, e2.n, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ e2.n f192570a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ e2.n f192571b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p<Integer, Integer, Unit> f192572c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(p<? super Integer, ? super Integer, Unit> pVar, t13.d<? super b> dVar) {
            super(4, dVar);
            this.f192572c = pVar;
        }

        @Override // e23.r
        public final Object invoke(b0 b0Var, e2.n nVar, e2.n nVar2, t13.d<? super Unit> dVar) {
            b bVar = new b(this.f192572c, dVar);
            bVar.f192570a = nVar;
            bVar.f192571b = nVar2;
            return bVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            e2.n nVar = this.f192570a;
            e2.n nVar2 = this.f192571b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            this.f192572c.invoke(new Integer(nVar.getF62559a()), new Integer(nVar2.getF62559a()));
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f192573a = new c();

        @Override // e23.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f192574a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f192575b;

        public d(l lVar, List list) {
            this.f192574a = lVar;
            this.f192575b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f192574a.invoke(this.f192575b.get(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f192576a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f192577b;

        public e(l lVar, List list) {
            this.f192576a = lVar;
            this.f192577b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f192576a.invoke(this.f192577b.get(num.intValue()));
        }
    }

    /* JADX INFO: renamed from: xx1.f$f, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C3595f implements r<e2.d, Integer, m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f192578a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h0 f192579b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ dy1.g f192580c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p1 f192581d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ p1 f192582e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ l f192583f;

        public C3595f(List list, h0 h0Var, dy1.g gVar, p1 p1Var, p1 p1Var2, l lVar) {
            this.f192578a = list;
            this.f192579b = h0Var;
            this.f192580c = gVar;
            this.f192581d = p1Var;
            this.f192582e = p1Var2;
            this.f192583f = lVar;
        }

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
                dy1.h hVar = (dy1.h) this.f192578a.get(iIntValue);
                mVar2.C(202771298);
                d0.a(dVar2, this.f192579b, hVar.f61556a, null, false, null, z3.f.c(1266351934, new a(this.f192580c, hVar, this.f192581d, this.f192582e, this.f192583f), mVar2), mVar2, (i14 & 14) | 1572864, 28);
                mVar2.f();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    public static final void a(dy1.g gVar, p<? super Integer, ? super Integer, Unit> pVar, l<? super String, Unit> lVar, l<? super String, Unit> lVar2, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, m mVar, int i14) {
        o0 o0Var;
        gVar.getClass();
        pVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        aVar.getClass();
        o0 o0VarP = fb1.c.p(aVar2, aVar3, mVar, 926601);
        int i15 = i14 | (o0VarP.B(gVar) ? 4 : 2) | (o0VarP.r(pVar) ? 32 : 16) | (o0VarP.r(lVar) ? 256 : 128) | (o0VarP.r(lVar2) ? 2048 : 1024) | (o0VarP.r(aVar) ? 16384 : 8192) | (o0VarP.r(aVar2) ? 131072 : 65536) | (o0VarP.r(aVar3) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        int i16 = 1;
        if (o0VarP.n(i15 & 1, (599187 & i15) != 599186)) {
            x1 x1Var = n.f135158a;
            Object[] objArr = new Object[0];
            Object objQ = o0VarP.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new xh0.d(2);
                o0VarP.K(objQ);
            }
            p1 p1Var = (p1) d4.a.e(objArr, (e23.a) objQ, o0VarP, 48);
            Object[] objArr2 = new Object[0];
            Object objQ2 = o0VarP.q();
            if (objQ2 == c2565a) {
                objQ2 = new xh0.d(3);
                o0VarP.K(objQ2);
            }
            o0Var = o0VarP;
            z02.d.a(false, z3.f.c(1965612388, new xk1.e(gVar, i16, aVar3, aVar2), o0VarP), null, null, null, z3.f.c(998823136, new xx1.c(gVar, (p1) d4.a.e(objArr2, (e23.a) objQ2, o0VarP, 48), lVar, p1Var, pVar, lVar2, aVar), o0VarP), o0Var, 196656, 29);
        } else {
            o0Var = o0VarP;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new xx1.c(gVar, pVar, lVar, lVar2, aVar, aVar2, aVar3, i14);
        }
    }
}
