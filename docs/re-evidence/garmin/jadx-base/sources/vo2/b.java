package vo2;

import com.google.common.util.concurrent.ListenableFuture;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lwl2/b;", "", "<anonymous>", "(Lwl2/b;)Z"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.sync.DefaultSyncStrategy$onDeleted$wasSuccessful$1", f = "DefaultSyncStrategy.kt", l = {46}, m = "invokeSuspend", v = 2)
public final class b extends v13.i implements e23.p<wl2.b, t13.d<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f179114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f179115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ byte[] f179116c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(byte[] bArr, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f179116c = bArr;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        b bVar = new b(this.f179116c, dVar);
        bVar.f179115b = obj;
        return bVar;
    }

    @Override // e23.p
    public final Object invoke(wl2.b bVar, t13.d<? super Boolean> dVar) {
        return ((b) create(bVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        wl2.b bVar = (wl2.b) this.f179115b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f179114a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        int i15 = wl2.b.f186020p;
        ListenableFuture listenableFutureK = bVar.k(0L, this.f179116c);
        this.f179115b = null;
        this.f179114a = 1;
        Object objB = t53.c.b(listenableFutureK, this);
        return objB == aVar ? aVar : objB;
    }
}
