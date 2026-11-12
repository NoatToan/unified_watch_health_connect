package rk0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.details.GearDetailsViewModel$setStatus$1$2", f = "GearDetailsViewModel.kt", l = {174}, m = "invokeSuspend", v = 2)
public final class m0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f153226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f153227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h0 f153228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jk0.p f153229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jk0.x f153230e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(h0 h0Var, jk0.p pVar, jk0.x xVar, t13.d<? super m0> dVar) {
        super(2, dVar);
        this.f153228c = h0Var;
        this.f153229d = pVar;
        this.f153230e = xVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        m0 m0Var = new m0(this.f153228c, this.f153229d, this.f153230e, dVar);
        m0Var.f153227b = obj;
        return m0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((m0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object objG;
        Object value;
        boolean z14;
        h0 h0Var;
        jk0.x xVarB;
        Object value2;
        g0 g0Var;
        o53.b0 b0Var = (o53.b0) this.f153227b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f153226a;
        jk0.p pVar = this.f153229d;
        h0 h0Var2 = this.f153228c;
        if (i14 == 0) {
            o13.r.b(obj);
            kk0.b bVar = h0Var2.f153147b;
            String str = h0Var2.f153146a.f153101a;
            this.f153227b = b0Var;
            this.f153226a = 1;
            objG = bVar.g(str, pVar, this);
            if (objG == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            objG = obj;
        }
        v2 v2Var = (v2) objG;
        if (v2Var instanceof v2.b) {
            boolean z15 = pVar == jk0.p.Retired;
            List<jk0.k> list = this.f153230e.f99373y;
            boolean z16 = list != null && (list.isEmpty() ^ true);
            int i15 = h0.f153145i;
            h0Var2.getClass();
            int i16 = h0.b.f153154a[pVar.ordinal()];
            jk0.x xVar = this.f153230e;
            if (i16 == 1) {
                z14 = true;
                h0Var = h0Var2;
                xVarB = jk0.x.b(xVar, null, null, null, null, pVar, null, null, null, null, null, null, null, null, null, null, 8386543);
            } else {
                if (i16 != 2) {
                    lc.u0.r();
                    return null;
                }
                z14 = true;
                h0Var = h0Var2;
                xVarB = jk0.x.b(xVar, null, null, null, null, pVar, null, null, null, null, g22.l.d(b63.o.INSTANCE), null, null, null, null, p13.j0.f134944a, 4192239);
            }
            jk0.x xVar2 = xVarB;
            f0.INSTANCE.getClass();
            f0 f0VarA = f0.Companion.a(xVar2);
            p2 p2Var = h0Var.f153149d;
            do {
                value2 = p2Var.getValue();
                g0Var = (g0) value2;
            } while (!p2Var.b(value2, g0.a(g0Var, f0VarA, xVar2, null, null, o0.b(g0Var.f153132e, null, null, null, Boolean.valueOf(xVar2.f99355e == jk0.p.Retired ? z14 : false), (g0Var.f153132e.f153245h || (z15 && z16)) ? z14 : false, 367), null, (z15 && z16) ? z14 : false, false, 164)));
        } else {
            if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            a2 a2Var = a2.GEAR;
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error saving gear status. ");
            i2.f36769a.getClass();
            i2.a.p(a2Var, "GearDetailsViewModel", strD);
            p2 p2Var2 = h0Var2.f153149d;
            do {
                value = p2Var2.getValue();
            } while (!p2Var2.b(value, g0.a((g0) value, null, null, null, u0.Failed, null, null, false, false, 247)));
        }
        return Unit.INSTANCE;
    }
}
