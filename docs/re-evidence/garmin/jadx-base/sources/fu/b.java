package fu;

import c83.a0;
import e23.l;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.api.ATPTypesDomainRepo$getATPTypes$2", f = "ATPTypesDomainAPI.kt", l = {20}, m = "invokeSuspend", v = 2)
public final class b extends i implements l<t13.d<? super a0<String>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f73481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f73482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f73483c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, String str, t13.d<? super b> dVar) {
        super(1, dVar);
        this.f73482b = cVar;
        this.f73483c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new b(this.f73482b, this.f73483c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<String>> dVar) {
        return ((b) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f73481a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        a aVar2 = this.f73482b.f73484a;
        this.f73481a = 1;
        Object objA = aVar2.a(this.f73483c, this);
        return objA == aVar ? aVar : objA;
    }
}
