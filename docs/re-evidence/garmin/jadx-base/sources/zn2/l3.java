package zn2;

import com.garmin.feature.garminpay.providers.gpay.snowball.CurrencyValue;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.NewUserDataManager$updateCachedTransitCardBalance$2", f = "NewUserDataManager.kt", l = {1715}, m = "invokeSuspend", v = 2)
public final class l3 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z53.b f205649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g1 f205650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f205651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public as2.b f205652d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f205653e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g1 f205654f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f205655g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ as2.b<CurrencyValue> f205656h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(g1 g1Var, String str, as2.b<CurrencyValue> bVar, t13.d<? super l3> dVar) {
        super(2, dVar);
        this.f205654f = g1Var;
        this.f205655g = str;
        this.f205656h = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l3(this.f205654f, this.f205655g, this.f205656h, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l3) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        z53.b bVar;
        String str;
        g1 g1Var;
        as2.b<CurrencyValue> bVar2;
        fs2.a aVar;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f205653e;
        if (i14 == 0) {
            o13.r.b(obj);
            g1 g1Var2 = this.f205654f;
            bVar = g1Var2.f205538m;
            this.f205649a = bVar;
            this.f205650b = g1Var2;
            str = this.f205655g;
            this.f205651c = str;
            as2.b<CurrencyValue> bVar3 = this.f205656h;
            this.f205652d = bVar3;
            this.f205653e = 1;
            if (bVar.c(this) == aVar2) {
                return aVar2;
            }
            g1Var = g1Var2;
            bVar2 = bVar3;
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bVar2 = this.f205652d;
            str = this.f205651c;
            g1Var = this.f205650b;
            bVar = this.f205649a;
            o13.r.b(obj);
        }
        try {
            co2.a aVar3 = g1Var.f205526a;
            aVar3.getClass();
            str.getClass();
            bVar2.getClass();
            es2.a aVar4 = aVar3.f28192a;
            List<fs2.a> listK = aVar4.k(str);
            if (listK != null && (aVar = (fs2.a) p13.h0.K0(listK)) != null) {
                as2.g gVarC = as2.g.c(aq2.k.a(aVar), bVar2);
                aq2.j.f12491a.getClass();
                String json = aq2.j.d().toJson(gVarC);
                json.getClass();
                aVar.f73435j = json;
                aVar4.d(aVar);
            }
            Unit unit = Unit.INSTANCE;
            return Unit.INSTANCE;
        } finally {
            bVar.e(null);
        }
    }
}
