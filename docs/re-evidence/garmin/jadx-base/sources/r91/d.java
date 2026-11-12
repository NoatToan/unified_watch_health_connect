package r91;

import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import lc.u0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;
import r53.z1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.personalrecords.domain.usecase.BestEffortsUseCase$getBestEffortsState$1", f = "BestEffortsUseCase.kt", l = {46}, m = "invokeSuspend", v = 2)
public final class d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f151375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f151376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q91.d f151377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.repcounting.model.f f151378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f151379e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, q91.d dVar, com.garmin.android.apps.connectmobile.repcounting.model.f fVar, e23.a<Unit> aVar, t13.d<? super d> dVar2) {
        super(2, dVar2);
        this.f151376b = cVar;
        this.f151377c = dVar;
        this.f151378d = fVar;
        this.f151379e = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f151376b, this.f151377c, this.f151378d, this.f151379e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        aa1.a value;
        k kVar;
        b2 b2Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f151375a;
        c cVar = this.f151376b;
        if (i14 == 0) {
            r.b(obj);
            z1<aa1.a> z1Var = cVar.f151373d;
            while (!z1Var.b(z1Var.getValue(), new aa1.a(true, false, this.f151377c, null, null, null, null, null, null, null, null, null, 4090, null))) {
            }
            k kVar2 = cVar.f151370a;
            this.f151375a = 1;
            objA = kVar2.a(this.f151377c, this.f151378d, this.f151379e, this);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            objA = obj;
        }
        v2 v2Var = (v2) objA;
        if (v2Var instanceof v2.b) {
            z1<aa1.a> z1Var2 = cVar.f151373d;
            do {
                value = z1Var2.getValue();
                kVar = cVar.f151370a;
                b2Var = kVar.f151437k;
            } while (!z1Var2.b(value, new aa1.a(false, false, this.f151377c, ((aa1.e) kVar.f151437k.f150540a.getValue()).f2263e, ((aa1.e) b2Var.f150540a.getValue()).f2264f, ((aa1.e) b2Var.f150540a.getValue()).f2265g, ((aa1.e) b2Var.f150540a.getValue()).f2266h, ((aa1.e) b2Var.f150540a.getValue()).f2267i, ((aa1.e) b2Var.f150540a.getValue()).f2268j, null, ((aa1.e) b2Var.f150540a.getValue()).f2269k, null, 2562, null)));
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            z1<aa1.a> z1Var3 = cVar.f151373d;
            do {
            } while (!z1Var3.b(z1Var3.getValue(), new aa1.a(false, true, this.f151377c, null, null, null, null, null, null, null, ((aa1.e) cVar.f151370a.f151437k.f150540a.getValue()).f2269k, null, 3064, null)));
        }
        return Unit.INSTANCE;
    }
}
