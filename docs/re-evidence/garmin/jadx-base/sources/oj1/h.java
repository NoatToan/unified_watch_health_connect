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
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.repo.UserPreferenceRepo$getUserPreference$2", f = "UserPreferenceRepo.kt", l = {13}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements l<t13.d<? super a0<u>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f132386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f132387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f132388c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g gVar, String str, t13.d<? super h> dVar) {
        super(1, dVar);
        this.f132387b = gVar;
        this.f132388c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new h(this.f132387b, this.f132388c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<u>> dVar) {
        return ((h) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f132386a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        j0 j0Var = this.f132387b.f132385a;
        this.f132386a = 1;
        Object objA = j0Var.a(this.f132388c, this);
        return objA == aVar ? aVar : objA;
    }
}
