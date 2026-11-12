package x82;

import e23.l;
import e23.p;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n"}, d2 = {"<anonymous>", "V"}, k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.ui.patterns.reports.page.state.fetch.ReportsPageDataFetcherFactory$Companion$ofCatching$1$1", f = "ReportsPageDataFetcherFactory.kt", l = {20}, m = "invokeSuspend", v = 2)
public final class g extends i implements l<t13.d<Object>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f189575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p<Object, t13.d<Object>, Object> f189576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f189577c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(p<Object, ? super t13.d<Object>, ? extends Object> pVar, Object obj, t13.d<? super g> dVar) {
        super(1, dVar);
        this.f189576b = pVar;
        this.f189577c = obj;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new g(this.f189576b, this.f189577c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<Object> dVar) {
        return ((g) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f189575a;
        if (i14 == 0) {
            r.b(obj);
            this.f189575a = 1;
            Object objInvoke = this.f189576b.invoke(this.f189577c, this);
            return objInvoke == aVar ? aVar : objInvoke;
        }
        if (i14 == 1) {
            r.b(obj);
            return obj;
        }
        vb.h.z("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
