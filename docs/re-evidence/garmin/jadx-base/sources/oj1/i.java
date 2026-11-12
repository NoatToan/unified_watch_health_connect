package oj1;

import c83.a0;
import e23.l;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import z70.j0;
import z70.u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lz70/u;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.repo.UserPreferenceRepo$setUserPreference$2", f = "UserPreferenceRepo.kt", l = {17}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements l<t13.d<? super a0<u>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f132389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f132390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f132391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u f132392d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar, String str, u uVar, t13.d<? super i> dVar) {
        super(1, dVar);
        this.f132390b = gVar;
        this.f132391c = str;
        this.f132392d = uVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new i(this.f132390b, this.f132391c, this.f132392d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<u>> dVar) {
        return ((i) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f132389a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        j0 j0Var = this.f132390b.f132385a;
        this.f132389a = 1;
        Object objB = j0Var.b(this.f132391c, this.f132392d, this);
        return objB == aVar ? aVar : objB;
    }
}
