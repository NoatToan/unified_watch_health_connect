package by0;

import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.gms.wallet.WalletConstants;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Loz1/b;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.datastore.MultiDayActivityDataSource$getTrainingReadinessData$result$1", f = "MultiDayActivityDataSource.kt", l = {WalletConstants.ERROR_CODE_MERCHANT_ACCOUNT_ERROR}, m = "invokeSuspend", v = 2)
public final class g0 extends v13.i implements e23.p<o53.b0, t13.d<? super List<? extends oz1.b>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f21815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b63.o f21816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b63.o f21817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a f21818e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(b63.o oVar, b63.o oVar2, a aVar, t13.d<? super g0> dVar) {
        super(2, dVar);
        this.f21816c = oVar;
        this.f21817d = oVar2;
        this.f21818e = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        g0 g0Var = new g0(this.f21816c, this.f21817d, this.f21818e, dVar);
        g0Var.f21815b = obj;
        return g0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super List<? extends oz1.b>> dVar) {
        return ((g0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        b63.o oVar;
        o53.b0 b0Var = (o53.b0) this.f21815b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f21814a;
        if (i14 == 0) {
            o13.r.b(obj);
            b63.o oVar2 = this.f21816c;
            if (oVar2 != null && (oVar = this.f21817d) != null) {
                int i15 = a.f21686d;
                ey0.g0 g0VarP = this.f21818e.p();
                fz0.c cVarA = fz0.d.a(oVar2);
                fz0.c cVarA2 = fz0.d.a(oVar);
                this.f21815b = b0Var;
                this.f21814a = 1;
                g0VarP.getClass();
                obj = com.garmin.android.apps.connectmobile.f0.J(g0VarP, new ey0.a0(g0VarP, cVarA, cVarA2, null), this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return null;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.MULTI_DAY_ACTIVITY;
            String strF = b71.i.f("GetTrainingReadinessDataUseCase - Result Success:", v2Var);
            i2.f36769a.getClass();
            i2.a.a(a2Var, strF);
            return (List) ((v2.b) v2Var).f47386a;
        }
        if (!(v2Var instanceof v2.a)) {
            lc.u0.r();
            return null;
        }
        com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.MULTI_DAY_ACTIVITY;
        String strF2 = b71.i.f("GetTrainingReadinessDataUseCase - Result Error:", v2Var);
        i2.f36769a.getClass();
        i2.a.e(a2Var2, strF2);
        return null;
    }
}
