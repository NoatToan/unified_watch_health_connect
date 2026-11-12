package oe0;

import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.domaindogs.presentation.EditDogViewModel$loadExcludePhysioFlag$2", f = "EditDogViewModel.kt", l = {102}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f131399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f131400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f131401c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(s sVar, long j8, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f131400b = sVar;
        this.f131401c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new q(this.f131400b, this.f131401c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, o13.l] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object objE0;
        Object value2;
        Object value3;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f131399a;
        s sVar = this.f131400b;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                ne0.r rVar = (ne0.r) sVar.f131406b.getValue();
                long j8 = this.f131401c;
                this.f131399a = 1;
                rVar.getClass();
                x53.c cVar = s0.f129406a;
                objE0 = ge1.b.e0(x53.b.f189152a, new ne0.q(rVar, j8, null), this);
                if (objE0 == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                objE0 = obj;
            }
            boolean zBooleanValue = ((Boolean) objE0).booleanValue();
            p2 p2Var = sVar.f131410f;
            do {
                value2 = p2Var.getValue();
            } while (!p2Var.b(value2, o.a((o) value2, false, false, false, false, false, 239)));
            p2 p2Var2 = sVar.f131412h;
            do {
                value3 = p2Var2.getValue();
            } while (!p2Var2.b(value3, pe0.j.a((pe0.j) value3, null, null, null, null, null, 0.0d, null, null, !zBooleanValue, null, null, 1791)));
        } catch (Exception unused) {
            p2 p2Var3 = sVar.f131410f;
            do {
                value = p2Var3.getValue();
            } while (!p2Var3.b(value, o.a((o) value, false, false, false, false, false, 239)));
        }
        return Unit.INSTANCE;
    }
}
