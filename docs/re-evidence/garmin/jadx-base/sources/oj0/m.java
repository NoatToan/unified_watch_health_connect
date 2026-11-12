package oj0;

import o4.v0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lo4/v0;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.gcplus.data.GCPlusRepository$fetchGCPlusImage$result$1", f = "GCPlusRepository.kt", l = {292}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.l<t13.d<? super c83.a0<v0>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f132323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f132324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f132325c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(f fVar, String str, t13.d<? super m> dVar) {
        super(1, dVar);
        this.f132324b = fVar;
        this.f132325c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new m(this.f132324b, this.f132325c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<v0>> dVar) {
        return ((m) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f132323a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        a aVar2 = this.f132324b.f132281b;
        this.f132323a = 1;
        Object objA = aVar2.a(this.f132325c, this);
        return objA == aVar ? aVar : objA;
    }
}
