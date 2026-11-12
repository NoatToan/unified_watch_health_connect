package kk0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.gear.data.repository.GearRepositoryImpl$editCollection$2", f = "GearRepositoryImpl.kt", l = {211}, m = "invokeSuspend", v = 2)
public final class n extends v13.i implements e23.l<t13.d<? super c83.a0<Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f105077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jk0.j f105078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h0 f105079c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(jk0.j jVar, h0 h0Var, t13.d<? super n> dVar) {
        super(1, dVar);
        this.f105078b = jVar;
        this.f105079c = h0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new n(this.f105078b, this.f105079c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<Unit>> dVar) {
        return ((n) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f105077a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        jk0.j jVar = this.f105078b;
        String str = jVar.f99264c;
        if (str == null) {
            vb.h.s("Required value was null.");
            return null;
        }
        a aVar2 = this.f105079c.f105050a;
        this.f105077a = 1;
        Object objL = aVar2.l(str, jVar, this);
        return objL == aVar ? aVar : objL;
    }
}
