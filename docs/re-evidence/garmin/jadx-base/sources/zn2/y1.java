package zn2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.NewUserDataManager$deleteCachedTransitCard$2", f = "NewUserDataManager.kt", l = {1715}, m = "invokeSuspend", v = 2)
public final class y1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z53.b f205941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g1 f205942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f205943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f205944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g1 f205945e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f205946f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(g1 g1Var, String str, t13.d<? super y1> dVar) {
        super(2, dVar);
        this.f205945e = g1Var;
        this.f205946f = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new y1(this.f205945e, this.f205946f, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((y1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        g1 g1Var;
        z53.b bVar;
        String str;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f205944d;
        if (i14 == 0) {
            o13.r.b(obj);
            g1Var = this.f205945e;
            z53.b bVar2 = g1Var.f205538m;
            this.f205941a = bVar2;
            this.f205942b = g1Var;
            String str2 = this.f205946f;
            this.f205943c = str2;
            this.f205944d = 1;
            if (bVar2.c(this) == aVar) {
                return aVar;
            }
            bVar = bVar2;
            str = str2;
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = this.f205943c;
            g1Var = this.f205942b;
            bVar = this.f205941a;
            o13.r.b(obj);
        }
        try {
            co2.a aVar2 = g1Var.f205526a;
            aVar2.getClass();
            str.getClass();
            aVar2.f28192a.n(str);
            Unit unit = Unit.INSTANCE;
            return Unit.INSTANCE;
        } finally {
            bVar.e(null);
        }
    }
}
