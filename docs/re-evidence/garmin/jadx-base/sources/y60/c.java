package y60;

import c83.a0;
import e23.l;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lj61/i;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.cyclingability.data.repository.CyclingAbilityRepositoryImpl$getLatestCyclingAbility$2", f = "CyclingAbilityRepositoryImpl.kt", l = {17}, m = "invokeSuspend", v = 2)
public final class c extends i implements l<t13.d<? super a0<j61.i>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f194598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f194599b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, t13.d<? super c> dVar2) {
        super(1, dVar2);
        this.f194599b = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new c(this.f194599b, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<j61.i>> dVar) {
        return ((c) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f194598a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        x60.a aVar2 = this.f194599b.f194600a;
        this.f194598a = 1;
        Object objB = aVar2.b(this);
        return objB == aVar ? aVar : objB;
    }
}
