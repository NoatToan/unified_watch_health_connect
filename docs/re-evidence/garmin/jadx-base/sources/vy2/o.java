package vy2;

import java.util.LinkedHashMap;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.uisynthesizer.synthesize.execution.RefreshTriggerExecutionInterceptor$intercept$1$1$1", f = "RefreshTriggerExecutionInterceptor.kt", l = {}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f180858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f180859b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(i iVar, String str, t13.d<? super o> dVar) {
        super(2, dVar);
        this.f180858a = iVar;
        this.f180859b = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new o(this.f180858a, this.f180859b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((o) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        h hVar = (h) this.f180858a.a(h.f180846c);
        hVar.getClass();
        String str = this.f180859b;
        str.getClass();
        LinkedHashMap linkedHashMap = hVar.f180847b;
        Object aVar2 = linkedHashMap.get(str);
        if (aVar2 == null) {
            aVar2 = new m13.a();
            linkedHashMap.put(str, aVar2);
        }
        Unit unit = Unit.INSTANCE;
        ((m13.a) aVar2).c(unit);
        return unit;
    }
}
