package wn1;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.smartscale.InviteSocialRepository$removeSecondaryUserFromDevice$2", f = "InviteSocialRepository.kt", l = {44}, m = "invokeSuspend", v = 2)
public final class z extends v13.i implements e23.l<t13.d<? super c83.a0<Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f186343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f186344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f186345c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(long j8, long j14, t13.d<? super z> dVar) {
        super(1, dVar);
        this.f186344b = j8;
        this.f186345c = j14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new z(this.f186344b, this.f186345c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<Unit>> dVar) {
        return ((z) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f186343a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        s sVarA = t.a.a(t.f186332a);
        this.f186343a = 1;
        Object objA = sVarA.a(this.f186344b, this.f186345c, this);
        return objA == aVar ? aVar : objA;
    }
}
