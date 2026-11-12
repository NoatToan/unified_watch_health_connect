package pw1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import fg0.k;
import lc.u0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.itp.dashboard.ITPDashboardViewModel$deleteOrUnsubscribeEvent$1", f = "ITPDashboardViewModel.kt", l = {193}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f141718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f141719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f141720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f141721d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f141722e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k f141723f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f141724g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, boolean z14, boolean z15, k kVar, e23.a<Unit> aVar, t13.d<? super e> dVar2) {
        super(2, dVar2);
        this.f141720c = dVar;
        this.f141721d = z14;
        this.f141722e = z15;
        this.f141723f = kVar;
        this.f141724g = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e eVar = new e(this.f141720c, this.f141721d, this.f141722e, this.f141723f, this.f141724g, dVar);
        eVar.f141719b = obj;
        return eVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        b0 b0Var = (b0) this.f141719b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f141718a;
        d dVar = this.f141720c;
        if (i14 == 0) {
            r.b(obj);
            this.f141719b = b0Var;
            this.f141718a = 1;
            obj = d.X4(dVar, this.f141721d, this.f141722e, this.f141723f, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            this.f141724g.invoke();
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            v2.a aVar2 = (v2.a) v2Var;
            String str = aVar2.f47385c;
            i2.a aVar3 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar3.getClass();
            i2.a.f(a2Var, "ITPDashboardViewModel", str);
            int i15 = d.H0;
            dVar.a5().m(g3.a.a(g3.f35298f, aVar2.f47385c, aVar2.f47383a, null, null, 12));
        }
        return Unit.INSTANCE;
    }
}
