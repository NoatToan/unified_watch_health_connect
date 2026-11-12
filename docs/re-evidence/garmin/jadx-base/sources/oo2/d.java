package oo2;

import com.google.common.util.concurrent.ListenableFuture;
import e23.p;
import fo2.l0;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.s;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lwl2/b;", "", "<anonymous>", "(Lwl2/b;)Z"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.sync.SnowballSyncStrategy$onActivatedOrUpdated$2", f = "SnowballSyncStrategy.kt", l = {57}, m = "invokeSuspend", v = 2)
public final class d extends i implements p<wl2.b, t13.d<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f133149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f133150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f133151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f133152d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l0 f133153e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, String str, l0 l0Var, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f133151c = aVar;
        this.f133152d = str;
        this.f133153e = l0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        d dVar2 = new d(this.f133151c, this.f133152d, this.f133153e, dVar);
        dVar2.f133150b = obj;
        return dVar2;
    }

    @Override // e23.p
    public final Object invoke(wl2.b bVar, t13.d<? super Boolean> dVar) {
        return ((d) create(bVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        wl2.b bVar = (wl2.b) this.f133150b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f133149a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        String str = this.f133152d;
        a aVar2 = this.f133151c;
        com.garmin.device.nfc.h[] hVarArr = (com.garmin.device.nfc.h[]) s.t(a.a(aVar2, str), a.b(aVar2, this.f133153e));
        int i15 = wl2.b.f186020p;
        ListenableFuture<Boolean> listenableFutureN = bVar.n(hVarArr, 0L);
        this.f133150b = null;
        this.f133149a = 1;
        Object objB = t53.c.b(listenableFutureN, this);
        return objB == aVar ? aVar : objB;
    }
}
