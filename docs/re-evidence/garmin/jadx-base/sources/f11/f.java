package f11;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import b63.o;
import c22.x0;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import o13.p;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import p13.y;
import r53.b2;
import r53.k2;
import r53.m2;
import r53.p2;
import r53.q2;
import r53.s;
import r53.v;
import v01.g2;
import v01.i1;
import v01.j1;
import y22.x;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lf11/f;", "Landroidx/lifecycle/u1;", "", "foodId", "Lv01/j1;", "getRecipeUseCase", "Lv01/j;", "createRecipeUseCase", "Lv01/g2;", "updateRecipeUseCase", "Le01/a;", "nutritionPreferences", "<init>", "(Ljava/lang/String;Lv01/j1;Lv01/j;Lv01/g2;Le01/a;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f67916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j1 f67917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v01.j f67918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g2 f67919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e01.a f67920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p2 f67921f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b2 f67922g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p<String, String> f67923h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public x f67924i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f67925j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d11.f f67926k;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Ld11/i;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.create.viewmodel.CreateEditRecipeViewModel$uiState$1", f = "CreateEditRecipeViewModel.kt", l = {50}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<r53.j<? super d11.i>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f67927a;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return f.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super d11.i> jVar, t13.d<? super Unit> dVar) {
            return ((a) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f67927a;
            if (i14 == 0) {
                r.b(obj);
                this.f67927a = 1;
                if (f.x4(f.this, this) == aVar) {
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

    public f(String str, j1 j1Var, v01.j jVar, g2 g2Var, e01.a aVar) {
        c22.g2 g2VarB;
        c22.g2 g2VarB2;
        j1Var.getClass();
        jVar.getClass();
        g2Var.getClass();
        aVar.getClass();
        this.f67916a = str;
        this.f67917b = j1Var;
        this.f67918c = jVar;
        this.f67919d = g2Var;
        this.f67920e = aVar;
        a11.r rVarN = aVar.n();
        if (str == null) {
            x0.f23314a.getClass();
            g2VarB = c22.g2.b(x0.Jd);
        } else {
            x0.f23314a.getClass();
            g2VarB = c22.g2.b(x0.Vd);
        }
        p2 p2VarA = q2.a(new d11.i(g2VarB, null, null, null, rVarN, null, null, false, false, false, false, null, 4078, null));
        this.f67921f = p2VarA;
        v vVar = new v(new a(null), s.d(p2VarA));
        w9.a aVarA = v1.a(this);
        k2.f150703a.getClass();
        m2 m2Var = k2.a.f150706c;
        a11.r rVarN2 = aVar.n();
        if (str == null) {
            x0.f23314a.getClass();
            g2VarB2 = c22.g2.b(x0.Jd);
        } else {
            x0.f23314a.getClass();
            g2VarB2 = c22.g2.b(x0.Vd);
        }
        this.f67922g = s.K(vVar, aVarA, m2Var, new d11.i(g2VarB2, null, null, null, rVarN2, null, null, false, true, false, false, null, 3822, null));
        this.f67925j = j0.f134944a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object x4(f fVar, v13.c cVar) throws Throwable {
        d dVar;
        Object value;
        Object value2;
        d11.i iVar;
        Object value3;
        p2 p2Var = fVar.f67921f;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i14 = dVar.f67909c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f67909c = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new d(fVar, cVar);
            }
        } else {
            dVar = new d(fVar, cVar);
        }
        Object objE0 = dVar.f67907a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar.f67909c;
        p005kotlin.jvm.internal.j jVar = null;
        if (i15 == 0) {
            r.b(objE0);
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, d11.i.a((d11.i) value, null, null, null, null, null, null, false, true, false, false, null, 3839)));
            j1 j1Var = fVar.f67917b;
            String str = fVar.f67916a;
            dVar.f67909c = 1;
            objE0 = ge1.b.e0(j1Var.f174444d, new i1(j1Var, str, g22.l.d(o.INSTANCE), null), dVar);
            if (objE0 == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objE0);
        }
        v2 v2Var = (v2) objE0;
        if (v2Var instanceof v2.b) {
            q01.i iVar2 = (q01.i) ((v2.b) v2Var).f47386a;
            q01.h hVar = iVar2.f142032a;
            fVar.f67923h = new p<>(hVar.f142030i, hVar.f142029h);
            fVar.f67924i = hVar.f142028g;
            List<b11.v> list = hVar.f142031j;
            ArrayList arrayList = new ArrayList(y.r(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new d11.f((b11.v) it.next(), false, 2, jVar));
            }
            fVar.f67925j = arrayList;
            do {
                value3 = p2Var.getValue();
            } while (!p2Var.b(value3, d11.i.a((d11.i) value3, new d11.g(hVar.f142022a, hVar.f142023b, hVar.f142024c, hVar.f142025d, hVar.f142027f), i53.a.j(iVar2.f142033b), i53.a.j(arrayList), null, null, hVar.f142028g, false, false, false, false, iVar2.f142034c, 1713)));
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            do {
                value2 = p2Var.getValue();
                iVar = (d11.i) value2;
            } while (!p2Var.b(value2, d11.i.a(iVar, null, null, null, null, d11.e.a(iVar.f57084f, false, false, false, false, false, false, true, 63), null, false, false, false, false, null, 3807)));
        }
        return Unit.INSTANCE;
    }

    public final void y4() {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f67921f;
            value = p2Var.getValue();
        } while (!p2Var.b(value, d11.i.a((d11.i) value, null, null, null, null, null, null, false, false, false, false, null, 2559)));
    }

    public /* synthetic */ f(String str, j1 j1Var, v01.j jVar, g2 g2Var, e01.a aVar, int i14, p005kotlin.jvm.internal.j jVar2) {
        this((i14 & 1) != 0 ? null : str, j1Var, jVar, g2Var, aVar);
    }
}
