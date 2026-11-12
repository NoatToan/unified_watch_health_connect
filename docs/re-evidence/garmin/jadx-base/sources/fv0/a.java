package fv0;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.u1;
import b12.k;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import e23.l;
import e23.p;
import gl1.y;
import java.util.List;
import l72.p2;
import o13.r;
import o53.b0;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p13.j0;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p1;
import p3.x1;
import p3.x3;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: fv0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.sessiondetails.ConnectionsReadOnlyScreenKt$ConnectionsReadOnlyScreen$1$1", f = "ConnectionsReadOnlyScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class C1488a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f73616a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x3<g3<ou0.e>> f73617b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1488a(Context context, x3<g3<ou0.e>> x3Var, t13.d<? super C1488a> dVar) {
            super(2, dVar);
            this.f73616a = context;
            this.f73617b = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new C1488a(this.f73616a, this.f73617b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C1488a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            if (this.f73617b.getF182175a().f35300a == fw.p.ERROR) {
                Toast.makeText(this.f73616a, R.string.txt_error_occurred, 0).show();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements p<m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ pu0.a f73618a;

        public b(pu0.a aVar) {
            this.f73618a = aVar;
        }

        @Override // e23.p
        public final Unit invoke(m mVar, Integer num) {
            m mVar2 = mVar;
            int iIntValue = num.intValue();
            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                x1 x1Var = n.f135158a;
                b12.b bVar = new b12.b(this.f73618a.f141181c, null, null, null, null, 30, null);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                k.b(null, null, j92.b.f97901d.f97906e, bVar, mVar2, b12.b.f14385f << 9, 19);
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f73619a = new c();

        @Override // e23.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f73620a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f73621b;

        public d(l lVar, List list) {
            this.f73620a = lVar;
            this.f73621b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f73620a.invoke(this.f73621b.get(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.r<e2.d, Integer, m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f73622a;

        public e(List list) {
            this.f73622a = list;
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
                pu0.a aVar = (pu0.a) this.f73622a.get(iIntValue);
                mVar2.C(418466517);
                p2.f111205a.g(aVar.f141180b, null, null, z3.f.c(1350613584, new b(aVar), mVar2), null, false, false, null, mVar2, 3072, 502);
                mVar2.f();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00a3  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(e23.a<Unit> aVar, m mVar, int i14) {
        aVar.getClass();
        o0 o0VarE = mVar.E(892368635);
        int i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objA = o0VarE.A(c.n.f22332a);
            objA.getClass();
            b.g gVar = (b.g) objA;
            o0VarE.L(-1614864554);
            u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(g.class), gVar.getF189591b(), null, CreationExtrasExtKt.defaultExtras(gVar), null, KoinApplicationKt.currentKoinScope(o0VarE, 0), null);
            o0VarE.g0(false);
            p1 p1VarC = s9.c.c(((g) u1VarResolveViewModel).f73645e, o0VarE);
            ou0.e eVar = (ou0.e) ((g3) p1VarC.getF182175a()).f35301b;
            List<pu0.a> list = eVar != null ? eVar.f133982e : null;
            if (list == null) {
                list = j0.f134944a;
            }
            fw.p pVar = ((g3) p1VarC.getF182175a()).f35300a;
            boolean zB = o0VarE.B(p1VarC) | o0VarE.r(context);
            Object objQ = o0VarE.q();
            if (zB) {
                objQ = new C1488a(context, p1VarC, null);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new C1488a(context, p1VarC, null);
                    o0VarE.K(objQ);
                }
            }
            l0.e((p) objQ, pVar, o0VarE);
            gl1.d.b(y.Q(o0VarE, R.string.lbl_grouptrack), aVar, ((g3) p1VarC.getF182175a()).f35300a == fw.p.LOADING, null, null, null, z3.f.c(1184881289, new a31.a(list, 6), o0VarE), o0VarE, ((i15 << 3) & 112) | 1572864, 56);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cq0.p(aVar, i14, 22);
        }
    }
}
