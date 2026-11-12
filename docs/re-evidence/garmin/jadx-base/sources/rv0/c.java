package rv0;

import c83.a0;
import java.util.List;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lpv0/d;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.logging.data.repository.LifestyleLoggingRepositoryImpl$addCustomBehaviours$2", f = "LifestyleLoggingRepositoryImpl.kt", l = {60}, m = "invokeSuspend", v = 2)
public final class c extends v13.i implements e23.l<t13.d<? super a0<List<? extends pv0.d>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f154630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f154631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<pv0.d> f154632c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, List<pv0.d> list, t13.d<? super c> dVar) {
        super(1, dVar);
        this.f154631b = bVar;
        this.f154632c = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new c(this.f154631b, this.f154632c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<List<? extends pv0.d>>> dVar) {
        return ((c) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f154630a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        i0<a0<List<pv0.d>>> i0VarL = this.f154631b.f154625a.l(this.f154632c);
        this.f154630a = 1;
        Object objAwait = i0VarL.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
