package kd0;

import java.util.LinkedHashMap;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.LiveActivitySessionTypeProviderImpl$setValueEstimationSessionInfoPreference$2", f = "LiveActivitySessionTypeProviderImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class f4 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g4 f104065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f104066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jg2.d f104067c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(g4 g4Var, long j8, jg2.d dVar, t13.d<? super f4> dVar2) {
        super(2, dVar2);
        this.f104065a = g4Var;
        this.f104066b = j8;
        this.f104067c = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f4(this.f104065a, this.f104066b, this.f104067c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f4) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        g4 g4Var = this.f104065a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(g4Var.f104089c.f());
        long j8 = this.f104066b;
        linkedHashMap.remove(new Long(j8));
        jg2.d dVar = this.f104067c;
        if (dVar != null) {
            linkedHashMap.put(new Long(j8), dVar);
        }
        g4Var.f104089c.e(linkedHashMap);
        return Unit.INSTANCE;
    }
}
