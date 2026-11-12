package gu1;

import c83.a0;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.atp.network.ATPRepo$getContentFullDataAsync$2", f = "ATPRepo.kt", l = {79}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements e23.l<t13.d<? super a0<String>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f79073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fu1.k f79074b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(fu1.k kVar, t13.d<? super g> dVar) {
        super(1, dVar);
        this.f79074b = kVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new g(this.f79074b, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<String>> dVar) {
        return ((g) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f79073a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        b.a aVar2 = b.f79047b;
        a aVar3 = (a) ez0.b.a(ez0.b.f67468a, ez0.c.STATIC_ATP_GATEWAY, a.class, new c83.h.a[0], null, null, null, 120);
        aVar2.getClass();
        aVar3.getClass();
        i0<a0<String>> i0VarJ = aVar3.j(this.f79074b);
        this.f79073a = 1;
        Object objAwait = i0VarJ.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
