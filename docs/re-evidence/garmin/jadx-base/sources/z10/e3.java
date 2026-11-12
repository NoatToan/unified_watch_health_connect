package z10;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/t0;", "Lq92/v;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.consent.ThirdPartyAccountConsentViewModel$revokeConsent$1", f = "ThirdPartyAccountConsentViewModel.kt", l = {31, 31}, m = "invokeSuspend", v = 2)
public final class e3 extends v13.i implements e23.p<androidx.lifecycle.t0<q92.v>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.lifecycle.t0 f200974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f200975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f200976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q92.x f200977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s92.g f200978e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(q92.x xVar, s92.g gVar, t13.d<? super e3> dVar) {
        super(2, dVar);
        this.f200977d = xVar;
        this.f200978e = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e3 e3Var = new e3(this.f200977d, this.f200978e, dVar);
        e3Var.f200976c = obj;
        return e3Var;
    }

    @Override // e23.p
    public final Object invoke(androidx.lifecycle.t0<q92.v> t0Var, t13.d<? super Unit> dVar) {
        return ((e3) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r0.emit(r7, r6) == r1) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        androidx.lifecycle.t0 t0Var = (androidx.lifecycle.t0) this.f200976c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f200975b;
        if (i14 != 0) {
            if (i14 == 1) {
                t0Var = this.f200974a;
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        p92.o oVar = p92.o.f136619a;
        this.f200976c = null;
        this.f200974a = t0Var;
        this.f200975b = 1;
        obj = oVar.u(this.f200977d, this.f200978e, this);
        if (obj != aVar) {
        }
        return aVar;
        this.f200976c = null;
        this.f200974a = null;
        this.f200975b = 2;
    }
}
