package zn2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.NewUserDataManager$updateOrCreateCachedTransitCard$2", f = "NewUserDataManager.kt", l = {1715}, m = "invokeSuspend", v = 2)
public final class m3 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z53.b f205671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g1 f205672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public fo2.l0 f205673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f205674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f205675e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g1 f205676f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f205677g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ fo2.l0 f205678h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(g1 g1Var, long j8, fo2.l0 l0Var, t13.d<? super m3> dVar) {
        super(2, dVar);
        this.f205676f = g1Var;
        this.f205677g = j8;
        this.f205678h = l0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new m3(this.f205676f, this.f205677g, this.f205678h, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((m3) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        g1 g1Var;
        z53.b bVar;
        fo2.l0 l0Var;
        long j8;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f205675e;
        if (i14 == 0) {
            o13.r.b(obj);
            g1Var = this.f205676f;
            bVar = g1Var.f205538m;
            this.f205671a = bVar;
            this.f205672b = g1Var;
            fo2.l0 l0Var2 = this.f205678h;
            this.f205673c = l0Var2;
            long j14 = this.f205677g;
            this.f205674d = j14;
            this.f205675e = 1;
            if (bVar.c(this) == aVar) {
                return aVar;
            }
            l0Var = l0Var2;
            j8 = j14;
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j8 = this.f205674d;
            l0Var = this.f205673c;
            g1Var = this.f205672b;
            bVar = this.f205671a;
            o13.r.b(obj);
        }
        try {
            g1Var.f205526a.a(j8, l0Var);
            Unit unit = Unit.INSTANCE;
            return Unit.INSTANCE;
        } finally {
            bVar.e(null);
        }
    }
}
