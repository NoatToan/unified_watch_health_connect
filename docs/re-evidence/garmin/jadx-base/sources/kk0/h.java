package kk0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Ljk0/x;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.gear.data.repository.GearRepositoryImpl$createGear$2", f = "GearRepositoryImpl.kt", l = {114}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements e23.l<t13.d<? super c83.a0<jk0.x>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f105047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f105048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jk0.x f105049c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(h0 h0Var, jk0.x xVar, t13.d<? super h> dVar) {
        super(1, dVar);
        this.f105048b = h0Var;
        this.f105049c = xVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new h(this.f105048b, this.f105049c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<jk0.x>> dVar) {
        return ((h) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f105047a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        a aVar2 = this.f105048b.f105050a;
        this.f105047a = 1;
        Object objK = aVar2.k(this.f105049c, this);
        return objK == aVar ? aVar : objK;
    }
}
