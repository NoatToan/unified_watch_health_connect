package i21;

import c22.g2;
import c22.x0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import f72.da;
import java.util.List;
import lc.u0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.reports.viewmodel.NutritionReportsViewModel$showWhatsNewModalIfNeeded$1", f = "NutritionReportsViewModel.kt", l = {972, 976}, m = "invokeSuspend", v = 2)
public final class t extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x01.e f87362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f87363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f87364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f87365d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(d dVar, t13.d<? super t> dVar2) {
        super(2, dVar2);
        this.f87365d = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        t tVar = new t(this.f87365d, dVar);
        tVar.f87364c = obj;
        return tVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((t) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        if (r1 == r2) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objA;
        x01.e eVar;
        Object objM0;
        Object value;
        Object value2;
        Object value3;
        c cVar;
        boolean z14;
        List listK;
        w wVar;
        b0 b0Var = (b0) this.f87364c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f87363b;
        d dVar = this.f87365d;
        if (i14 == 0) {
            o13.r.b(obj);
            x01.i iVar = dVar.f87278j;
            this.f87364c = b0Var;
            this.f87363b = 1;
            objA = iVar.a(true, this);
            if (objA != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
            objA = obj;
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            x01.e eVar2 = this.f87362a;
            o13.r.b(obj);
            eVar = eVar2;
            objM0 = obj;
        }
        v2 v2Var = (v2) objM0;
        if (v2Var instanceof v2.b) {
            if (((Boolean) ((v2.b) v2Var).f47386a).booleanValue()) {
                p2 p2Var = dVar.f87285q;
                do {
                    value2 = p2Var.getValue();
                } while (!p2Var.b(value2, c.a((c) value2, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, 4128767)));
            } else {
                p2 p2Var2 = dVar.f87285q;
                do {
                    value3 = p2Var2.getValue();
                    cVar = (c) value3;
                    z14 = eVar.f188255d == x01.f.ACTIVE;
                    x0.f23314a.getClass();
                    g2 g2VarB = g2.b(x0.f23513le);
                    g2 g2VarB2 = g2.b(x0.f23581pf);
                    s62.a.f157643a.getClass();
                    t62.c cVar2 = t62.c.f162799a;
                    listK = p13.x.k(new w(g2VarB, g2VarB2, da.a(cVar2)), new w(g2.b(x0.f23597qe), g2.b(x0.uf), da.a(cVar2)), new w(g2.b(x0.Kd), g2.b(x0.f23531mf), da.a(cVar2)));
                    wVar = new w(g2.b(x0.f23397ee), g2.b(x0.Hf), da.a(cVar2));
                    s01.f fVar = dVar.f87279k;
                    if (!fVar.e() || !fVar.c()) {
                        wVar = null;
                    }
                } while (!p2Var2.b(value3, c.a(cVar, null, null, null, null, null, null, null, null, null, null, false, false, new x(z14, i53.a.e(h0.C0(listK, p13.x.l(wVar)))), false, false, false, null, null, 4128767)));
            }
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            a2 a2Var = a2.NUTRITION;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "NutritionReportsViewModel", "showWhatsNewModalIfNeeded: error retrieving nutrition v2 whats new data");
            p2 p2Var3 = dVar.f87285q;
            do {
                value = p2Var3.getValue();
            } while (!p2Var3.b(value, c.a((c) value, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, 4128767)));
        }
        return Unit.INSTANCE;
        eVar = (x01.e) objA;
        if (!eVar.f188256e || !dVar.f87279k.e()) {
            return Unit.INSTANCE;
        }
        m01.g gVar = dVar.f87269a;
        this.f87364c = b0Var;
        this.f87362a = eVar;
        this.f87363b = 2;
        objM0 = gVar.m0(this);
    }
}
