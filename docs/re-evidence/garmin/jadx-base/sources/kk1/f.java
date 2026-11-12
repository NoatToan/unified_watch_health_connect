package kk1;

import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import hk1.a0;
import hk1.s;
import lc.u0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.thirdparty.presentation.details.ThirdPartyAppDetailsViewModel$initializeData$1", f = "ThirdPartyAppDetailsViewModel.kt", l = {53}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f105145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f105146b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f105146b = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f(this.f105146b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object objC;
        Object value;
        j jVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f105145a;
        g gVar = this.f105146b;
        if (i14 == 0) {
            r.b(obj);
            ek1.i iVar = gVar.f105149c;
            a0 a0Var = gVar.f105153g;
            iz1.f fVar = new iz1.f(gVar, 25);
            this.f105145a = 1;
            int i15 = ek1.i.f64449c;
            objC = iVar.c(a0Var, false, fVar, this);
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            objC = obj;
        }
        v2 v2Var = (v2) objC;
        if (v2Var instanceof v2.b) {
            gVar.f105152f = ((s) ((v2.b) v2Var).f47386a).f84191c;
        }
        p2 p2Var = gVar.f105154h;
        do {
            value = p2Var.getValue();
            v2Var.getClass();
            if (v2Var instanceof v2.b) {
                s sVar = (s) ((v2.b) v2Var).f47386a;
                boolean isAuthProhibited = sVar.f84189a.getIsAuthProhibited();
                i53.g gVarK = i53.a.k(sVar.f84190b);
                s92.g gVar2 = sVar.f84191c;
                jVar = new j(false, false, isAuthProhibited, gVarK, gVar2 != null ? new hk1.c(gVar2.getRevokeHeadline(), gl1.d.y(gVar2.q(), true), gl1.d.y(gVar2.q(), false), gVar2.getRevokeConsentButton(), null, 16, null) : null, false, 34, null);
            } else {
                if (!(v2Var instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                jVar = new j(false, true, false, null, null, false, 60, null);
            }
        } while (!p2Var.b(value, jVar));
        return Unit.INSTANCE;
    }
}
