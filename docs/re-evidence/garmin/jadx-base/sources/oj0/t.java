package oj0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.gcplus.data.GCPlusRepository$postOptimisticGrant$2", f = "GCPlusRepository.kt", l = {305}, m = "invokeSuspend", v = 2)
public final class t extends v13.i implements e23.l<t13.d<? super c83.a0<Object>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f132351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f132352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f132353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y f132354d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(f fVar, String str, y yVar, t13.d<? super t> dVar) {
        super(1, dVar);
        this.f132352b = fVar;
        this.f132353c = str;
        this.f132354d = yVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new t(this.f132352b, this.f132353c, this.f132354d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<Object>> dVar) {
        return ((t) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f132351a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        x xVar = this.f132352b.f132282c;
        this.f132351a = 1;
        Object objA = xVar.a(this.f132353c, this.f132354d, this);
        return objA == aVar ? aVar : objA;
    }
}
