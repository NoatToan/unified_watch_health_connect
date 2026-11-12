package rk0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.details.GearDetailsViewModel$removeFromCollection$1$2", f = "GearDetailsViewModel.kt", l = {391}, m = "invokeSuspend", v = 2)
public final class k0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f153205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f153206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h0 f153207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f153208d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(h0 h0Var, String str, t13.d<? super k0> dVar) {
        super(2, dVar);
        this.f153207c = h0Var;
        this.f153208d = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        k0 k0Var = new k0(this.f153207c, this.f153208d, dVar);
        k0Var.f153206b = obj;
        return k0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object objN;
        l lVar;
        f0 f0VarA;
        l next;
        Object value;
        o53.b0 b0Var = (o53.b0) this.f153206b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f153205a;
        String str = this.f153208d;
        h0 h0Var = this.f153207c;
        if (i14 == 0) {
            o13.r.b(obj);
            kk0.b bVar = h0Var.f153147b;
            String str2 = h0Var.f153146a.f153101a;
            this.f153206b = b0Var;
            this.f153205a = 1;
            objN = bVar.n(str, str2, this);
            if (objN == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            objN = obj;
        }
        v2 v2Var = (v2) objN;
        if (v2Var instanceof v2.a) {
            a2 a2Var = a2.GEAR;
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error removing gear from collection. ");
            i2.f36769a.getClass();
            i2.a.p(a2Var, "GearDetailsViewModel", strD);
            p2 p2Var = h0Var.f153149d;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, g0.a((g0) value, null, null, null, u0.Failed, null, null, false, false, 247)));
        } else {
            if (!(v2Var instanceof v2.b)) {
                lc.u0.r();
                return null;
            }
            p2 p2Var2 = h0Var.f153149d;
            p2 p2Var3 = h0Var.f153149d;
            jk0.x xVar = ((g0) p2Var2.getValue()).f153129b;
            i53.c<l> cVar = ((g0) p2Var3.getValue()).f153128a.f153121w;
            jk0.x xVarB = null;
            ArrayList arrayList = null;
            if (cVar != null) {
                Iterator<l> it = cVar.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!p005kotlin.jvm.internal.s.g(next.f153210b, str));
                lVar = next;
            } else {
                lVar = null;
            }
            if (xVar != null) {
                List<jk0.k> list = xVar.f99373y;
                if (list != null) {
                    arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (!p005kotlin.jvm.internal.s.g(((jk0.k) obj2).f99274c, str)) {
                            arrayList.add(obj2);
                        }
                    }
                }
                xVarB = jk0.x.b(xVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, arrayList, 4194303);
            }
            if (xVarB != null) {
                f0.INSTANCE.getClass();
                f0VarA = f0.Companion.a(xVarB);
            } else {
                f0VarA = ((g0) p2Var3.getValue()).f153128a;
            }
            f0 f0Var = f0VarA;
            while (true) {
                Object value2 = p2Var3.getValue();
                g0 g0Var = (g0) value2;
                l lVar2 = lVar;
                if (p2Var3.b(value2, g0.a(g0Var, f0Var, xVarB == null ? g0Var.f153129b : xVarB, null, null, o0.b(g0Var.f153132e, null, null, null, null, true, 351), lVar2, false, false, 196))) {
                    break;
                }
                lVar = lVar2;
            }
        }
        return Unit.INSTANCE;
    }
}
