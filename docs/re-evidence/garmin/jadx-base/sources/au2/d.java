package au2;

import com.google.gson.Gson;
import e23.p;
import java.io.File;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.e;
import v13.i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.garmin.net.omtanalytics.impl.localcache.LocalCache$enqueueEvent$1", f = "LocalCache.kt", l = {}, m = "invokeSuspend")
public final class d extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yt2.e f13062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f13063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a.d f13064c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(yt2.e eVar, a aVar, a.d dVar, t13.d<? super d> dVar2) {
        super(2, dVar2);
        this.f13062a = eVar;
        this.f13063b = aVar;
        this.f13064c = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f13062a, this.f13063b, this.f13064c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, o13.l] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        a.d dVar;
        a aVar = this.f13063b;
        yt2.e eVar = this.f13062a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        try {
            zt2.a.f207007d.getClass();
            zt2.a aVarA = zt2.a.C3859a.a(eVar);
            String json = ((Gson) aVar.f13052d.getValue()).toJson(aVarA);
            String str = eVar.f199666a;
            json.getClass();
            File fileA = a.a(aVar, str, json);
            if (fileA != null && (dVar = this.f13064c) != null) {
                dVar.a(new a.C0184a(fileA, aVarA));
            }
        } catch (Exception e4) {
            a.f13046e.getClass();
            a.c.c().error("enqueueEvent", (Throwable) e4);
        }
        return Unit.INSTANCE;
    }
}
