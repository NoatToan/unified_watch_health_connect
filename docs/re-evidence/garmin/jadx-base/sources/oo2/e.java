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
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.sync.SnowballSyncStrategy$onActivatedOrUpdated$3", f = "SnowballSyncStrategy.kt", l = {62}, m = "invokeSuspend", v = 2)
public final class e extends i implements p<wl2.b, t13.d<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f133154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f133155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f133156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f133157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l0 f133158e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a aVar, String str, l0 l0Var, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f133156c = aVar;
        this.f133157d = str;
        this.f133158e = l0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e eVar = new e(this.f133156c, this.f133157d, this.f133158e, dVar);
        eVar.f133155b = obj;
        return eVar;
    }

    @Override // e23.p
    public final Object invoke(wl2.b bVar, t13.d<? super Boolean> dVar) {
        return ((e) create(bVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        wl2.b bVar = (wl2.b) this.f133155b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f133154a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        String str = this.f133157d;
        a aVar2 = this.f133156c;
        com.garmin.device.nfc.h[] hVarArr = (com.garmin.device.nfc.h[]) s.t(a.a(aVar2, str), a.b(aVar2, this.f133158e));
        int i15 = wl2.b.f186020p;
        ListenableFuture<Boolean> listenableFutureJ = bVar.j(hVarArr, 0L);
        this.f133155b = null;
        this.f133154a = 1;
        Object objB = t53.c.b(listenableFutureJ, this);
        return objB == aVar ? aVar : objB;
    }
}
