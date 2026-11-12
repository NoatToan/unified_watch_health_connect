package a80;

import a11.n;
import e23.p;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import q53.t;
import v13.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.data.datasource.SubscriptionSharedPreferences$getShouldUseContentfulTestEnvironment$1", f = "SubscriptionSharedPreferences.kt", l = {90}, m = "invokeSuspend", v = 2)
public final class h extends i implements p<t<? super Boolean>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f1941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f1942c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(c cVar, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f1942c = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        h hVar = new h(this.f1942c, dVar);
        hVar.f1941b = obj;
        return hVar;
    }

    @Override // e23.p
    public final Object invoke(t<? super Boolean> tVar, t13.d<? super Unit> dVar) {
        return ((h) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        t tVar = (t) this.f1941b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f1940a;
        if (i14 == 0) {
            r.b(obj);
            c cVar = this.f1942c;
            tVar.i(Boolean.valueOf(cVar.d()));
            d dVar = new d(cVar, tVar, 3);
            cVar.f1927a.u3(dVar);
            n nVar = new n(10, cVar, dVar);
            this.f1941b = null;
            this.f1940a = 1;
            if (q53.r.a(tVar, nVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
