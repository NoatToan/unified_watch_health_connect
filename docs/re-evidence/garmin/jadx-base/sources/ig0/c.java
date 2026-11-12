package ig0;

import c83.a0;
import e23.l;
import fg0.k;
import fg0.p;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lfg0/k;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.events.network.eventsearch.eventsearch.EventSearchRepo$eventConversion$2", f = "EventSearchRepo.kt", l = {80}, m = "invokeSuspend", v = 2)
public final class c extends i implements l<t13.d<? super a0<k>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f93239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f93240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f93241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f93242d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, String str, p pVar, t13.d<? super c> dVar) {
        super(1, dVar);
        this.f93240b = bVar;
        this.f93241c = str;
        this.f93242d = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new c(this.f93240b, this.f93241c, this.f93242d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<k>> dVar) {
        return ((c) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f93239a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<k>> i0VarF = this.f93240b.f93238a.f(this.f93241c, this.f93242d);
        this.f93239a = 1;
        Object objAwait = i0VarF.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
