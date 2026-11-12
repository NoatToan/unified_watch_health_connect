package zn2;

import com.garmin.feature.garminpay.providers.gpay.snowball.CurrencyValue;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001j\u0004\u0018\u0001`\u0004*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo53/b0;", "Las2/g;", "Lfo2/l0;", "Lcom/garmin/feature/garminpay/providers/gpay/snowball/CurrencyValue;", "Lcom/garmin/feature/garminpay/providers/gpay/TransitCard;", "<anonymous>", "(Lo53/b0;)Las2/g;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.NewUserDataManager$getCachedTransitCard$2", f = "NewUserDataManager.kt", l = {1715}, m = "invokeSuspend", v = 2)
public final class f2 extends v13.i implements e23.p<o53.b0, t13.d<? super as2.g<fo2.l0, CurrencyValue>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z53.b f205512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g1 f205513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f205514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f205515d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g1 f205516e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f205517f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(g1 g1Var, String str, t13.d<? super f2> dVar) {
        super(2, dVar);
        this.f205516e = g1Var;
        this.f205517f = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f2(this.f205516e, this.f205517f, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super as2.g<fo2.l0, CurrencyValue>> dVar) {
        return ((f2) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        g1 g1Var;
        z53.b bVar;
        String str;
        fs2.a aVar;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f205515d;
        if (i14 == 0) {
            o13.r.b(obj);
            g1Var = this.f205516e;
            z53.b bVar2 = g1Var.f205538m;
            this.f205512a = bVar2;
            this.f205513b = g1Var;
            String str2 = this.f205517f;
            this.f205514c = str2;
            this.f205515d = 1;
            if (bVar2.c(this) == aVar2) {
                return aVar2;
            }
            bVar = bVar2;
            str = str2;
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = this.f205514c;
            g1Var = this.f205513b;
            bVar = this.f205512a;
            o13.r.b(obj);
        }
        try {
            co2.a aVar3 = g1Var.f205526a;
            aVar3.getClass();
            str.getClass();
            List<fs2.a> listK = aVar3.f28192a.k(str);
            return (listK == null || (aVar = (fs2.a) p13.h0.K0(listK)) == null) ? null : aq2.k.a(aVar);
        } finally {
            bVar.e(null);
        }
    }
}
