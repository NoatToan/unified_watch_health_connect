package hd1;

import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n"}, d2 = {"Lhd1/q;", "T", "Lo53/b0;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.realtimedata.CachedRealTimeDataImpl$read$2", f = "CachedRealTimeDataImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class b extends v13.i implements e23.p<o53.b0, t13.d<Object>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Boolean f83368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f83369b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Boolean bool, Object obj, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f83368a = bool;
        this.f83369b = obj;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [hd1.q, java.lang.Object] */
    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b(this.f83368a, this.f83369b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<Object> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [hd1.q, java.lang.Object] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        boolean zG = p005kotlin.jvm.internal.s.g(this.f83368a, Boolean.TRUE);
        ?? r14 = this.f83369b;
        if (!zG || g22.k.k(new DateTime(r14.f83396a))) {
            return r14;
        }
        return null;
    }
}
