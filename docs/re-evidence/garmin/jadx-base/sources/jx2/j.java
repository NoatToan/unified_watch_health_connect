package jx2;

import android.content.Context;
import android.os.Handler;
import com.garmin.samd.repository.gc.SaveGCUserPrefWorker;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.concurrent.TimeUnit;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import ue.x;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 9, 0})
@v13.e(c = "com.garmin.samd.manager.SaMDAccountManager$setDeviceHealthFeatureEnabled$1", f = "SaMDAccountManager.kt", l = {}, m = "invokeSuspend")
public final class j extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f101553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kx2.a f101554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f101555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx2.a f101556d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f101557e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Context f101558f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(b bVar, kx2.a aVar, boolean z14, gx2.a aVar2, String str, Context context, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f101553a = bVar;
        this.f101554b = aVar;
        this.f101555c = z14;
        this.f101556d = aVar2;
        this.f101557e = str;
        this.f101558f = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j(this.f101553a, this.f101554b, this.f101555c, this.f101556d, this.f101557e, this.f101558f, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        this.f101553a.getClass();
        qx2.a aVar2 = qx2.a.f148445a;
        kx2.a aVar3 = this.f101554b;
        boolean z14 = this.f101555c;
        aVar2.h(aVar3, z14);
        SaveGCUserPrefWorker.a aVar4 = SaveGCUserPrefWorker.f52671e;
        String strF = this.f101556d.f();
        String str = aVar3.f107121a;
        str.getClass();
        aVar4.getClass();
        strF.getClass();
        String str2 = this.f101557e;
        str2.getClass();
        x.a aVar5 = new x.a((Class<? extends androidx.work.d>) SaveGCUserPrefWorker.class);
        ue.f.a aVar6 = new ue.f.a();
        aVar6.b(ue.v.CONNECTED);
        aVar5.f170098c.f26950j = aVar6.a();
        x.a aVarD = aVar5.d(ue.a.EXPONENTIAL, 5L, TimeUnit.MINUTES);
        o13.p[] pVarArr = {new o13.p(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, strF), new o13.p("2", str), new o13.p("3", Boolean.valueOf(z14)), new o13.p("4", str2)};
        androidx.work.c.a aVar7 = new androidx.work.c.a();
        int i14 = 0;
        for (int i15 = 0; i15 < 4; i15++) {
            o13.p pVar = pVarArr[i15];
            aVar7.b(pVar.f128595b, (String) pVar.f128594a);
        }
        x xVarA = aVarD.f(aVar7.a()).a();
        Context context = this.f101558f;
        new Handler(context.getMainLooper()).postAtFrontOfQueue(new i(context, xVarA, i14));
        return Unit.INSTANCE;
    }
}
