package on;

import c83.a0;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.health.data.HealthRepositoryImpl$deleteActivity$result$1", f = "HealthRepositoryImpl.kt", l = {90}, m = "invokeSuspend", v = 2)
public final class c extends v13.i implements e23.l<t13.d<? super a0<Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f133001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f133002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f133003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f133004d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, String str, String str2, t13.d<? super c> dVar) {
        super(1, dVar);
        this.f133002b = aVar;
        this.f133003c = str;
        this.f133004d = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new c(this.f133002b, this.f133003c, this.f133004d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<Unit>> dVar) {
        return ((c) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f133001a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<Unit>> i0VarD = this.f133002b.f132995a.d(this.f133003c, this.f133004d);
        this.f133001a = 1;
        Object objAwait = i0VarD.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
