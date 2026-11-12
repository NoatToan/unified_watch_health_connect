package np;

import a42.e0;
import am.x0;
import android.content.Context;
import android.widget.Toast;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b63.o;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import gl1.y;
import h2.j0;
import l72.i3;
import lc.u0;
import n82.j;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p1;
import p3.x1;
import p3.x3;
import r53.p2;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.reports.presentation.BaseReportsScreenKt$BaseReportsScreen$1$1", f = "BaseReportsScreen.kt", l = {77}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f126822a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x3<i> f126823b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ n82.f f126824c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ c f126825d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x3<i> x3Var, n82.f fVar, c cVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f126823b = x3Var;
            this.f126824c = fVar;
            this.f126825d = cVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f126823b, this.f126824c, this.f126825d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object obj2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f126822a;
            if (i14 == 0) {
                r.b(obj);
                i f182175a = this.f126823b.getF182175a();
                if (f182175a != null) {
                    o oVar = f182175a.f126832b;
                    this.f126822a = 1;
                    n82.f fVar = this.f126824c;
                    n82.b bVar = fVar.f124961b;
                    o82.g gVarA = bVar.a();
                    gVarA.getClass();
                    n82.g gVar = fVar.f124962c;
                    if (gVar != null) {
                        gVar.f124966a.put(gVarA, oVar);
                    }
                    int iA = bVar.f124952e.a(oVar);
                    j0 j0Var = fVar.f124960a.f117196a;
                    if (iA < 0) {
                        iA = 0;
                    }
                    Object objW = j0.w(j0Var, iA, this);
                    if (objW != obj2) {
                        objW = Unit.INSTANCE;
                    }
                    if (objW != obj2) {
                        objW = Unit.INSTANCE;
                    }
                    if (objW == obj2) {
                        return obj2;
                    }
                }
                this.f126825d.f126784b.setValue(null);
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            Unit unit = Unit.INSTANCE;
            this.f126825d.f126784b.setValue(null);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.reports.presentation.BaseReportsScreenKt$BaseReportsScreen$2$1", f = "BaseReportsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f126826a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f126827b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x3<qp.d> f126828c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, c cVar, x3<qp.d> x3Var, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f126826a = context;
            this.f126827b = cVar;
            this.f126828c = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f126826a, this.f126827b, this.f126828c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            x3<qp.d> x3Var = this.f126828c;
            if (x3Var.getF182175a().f146009c) {
                Object[] objArr = {x3Var.getF182175a().f146010d};
                Context context = this.f126826a;
                Toast.makeText(context, context.getString(R.string.activity_delete_activity_successfully, objArr), 0).show();
                p2 p2Var = this.f126827b.f126788f;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, qp.d.a((qp.d) value, false, false, "", null, null, null, null, null, 499)));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(c cVar, sp.a aVar, op.a aVar2, e23.a<Unit> aVar3, m mVar, int i14) {
        o0 o0Var;
        x0 x0Var;
        String strT;
        i53.f fVarA;
        cVar.getClass();
        aVar3.getClass();
        o0 o0VarE = mVar.E(-1206301858);
        int i15 = i14 | (o0VarE.r(cVar) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.B(aVar2) ? 256 : 128) | (o0VarE.r(aVar3) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            p1 p1VarC = s9.c.c(cVar.f126789g, o0VarE);
            mp.a aVar4 = ((qp.d) p1VarC.getF182175a()).f146012f;
            if (aVar4 != null) {
                mp.b bVar = aVar4.f119946a;
                if (bVar instanceof mp.g) {
                    x0Var = ((mp.g) bVar).f119973b;
                } else {
                    if (!(bVar instanceof mp.f)) {
                        u0.r();
                        return;
                    }
                    x0Var = ((mp.f) bVar).f119972b;
                }
            } else {
                x0Var = null;
            }
            if (x0Var == null) {
                o0VarE.C(-946830841);
                o0VarE.g0(false);
                strT = null;
            } else {
                o0VarE.C(-946830840);
                strT = gl1.d.T(x0Var.f4360c, o0VarE, 0);
                o0VarE.g0(false);
            }
            p1 p1VarC2 = s9.c.c(cVar.f126785c, o0VarE);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = aVar.f160495a;
                o0VarE.K(objQ);
            }
            n82.f.a aVar5 = (n82.f.a) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = aVar.f160496b;
                o0VarE.K(objQ2);
            }
            i53.f fVar = (i53.f) objQ2;
            n82.f fVarA2 = j.a(aVar5, null, o0VarE, 2);
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new sp.c(context);
                o0VarE.K(objQ3);
            }
            sp.c cVar2 = (sp.c) objQ3;
            mp.a aVar6 = ((qp.d) p1VarC.getF182175a()).f146012f;
            if ((aVar6 != null ? aVar6.f119946a.f119948a : null) == x0.E2) {
                o0VarE.C(-946226433);
                fVarA = i53.a.a(new i3("MENU_ITEM_HELP", y.Q(o0VarE, R.string.lbl_help), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                o0VarE.g0(false);
            } else {
                o0VarE.C(-946122800);
                o0VarE.g0(false);
                fVarA = null;
            }
            i iVar = (i) p1VarC2.getF182175a();
            boolean zB = o0VarE.B(p1VarC2) | o0VarE.B(fVarA2) | o0VarE.r(cVar);
            Object objQ4 = o0VarE.q();
            if (zB || objQ4 == c2565a) {
                objQ4 = new a(p1VarC2, fVarA2, cVar, null);
                o0VarE.K(objQ4);
            }
            l0.e((p) objQ4, iVar, o0VarE);
            Boolean boolValueOf = Boolean.valueOf(((qp.d) p1VarC.getF182175a()).f146009c);
            boolean zB2 = o0VarE.B(p1VarC) | o0VarE.r(context) | o0VarE.r(cVar);
            Object objQ5 = o0VarE.q();
            if (zB2 || objQ5 == c2565a) {
                objQ5 = new b(context, cVar, p1VarC, null);
                o0VarE.K(objQ5);
            }
            l0.e((p) objQ5, boolValueOf, o0VarE);
            z3.e eVarC = z3.f.c(-1531834264, new e0(p1VarC, strT, aVar3, fVarA, context, aVar2, fVarA2, cVar, aVar4, fVar, cVar2), o0VarE);
            o0Var = o0VarE;
            z02.b.a(false, null, null, null, false, eVarC, o0Var, 196608, 31);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new na0.a(cVar, aVar, aVar2, aVar3, i14, 5);
        }
    }
}
