package kk0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.gear.data.repository.GearRepositoryImpl$editGear$2", f = "GearRepositoryImpl.kt", l = {201}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.l<t13.d<? super c83.a0<Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f105087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jk0.x f105088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h0 f105089c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(jk0.x xVar, h0 h0Var, t13.d<? super o> dVar) {
        super(1, dVar);
        this.f105088b = xVar;
        this.f105089c = h0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new o(this.f105088b, this.f105089c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<Unit>> dVar) {
        return ((o) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f105087a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        jk0.x xVar = this.f105088b;
        String str = xVar.f99356f;
        if (str == null) {
            vb.h.s("Required value was null.");
            return null;
        }
        a aVar2 = this.f105089c.f105050a;
        this.f105087a = 1;
        Object objE = aVar2.E(str, xVar, this);
        return objE == aVar ? aVar : objE;
    }
}
