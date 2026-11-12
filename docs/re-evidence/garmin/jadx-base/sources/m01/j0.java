package m01;

import com.google.android.gms.wallet.WalletConstants;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lj01/c;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.data.repository.NutritionRepositoryImpl$getRecipeDetails$2", f = "NutritionRepositoryImpl.kt", l = {WalletConstants.ERROR_CODE_BUYER_ACCOUNT_ERROR}, m = "invokeSuspend", v = 2)
public final class j0 extends v13.i implements e23.l<t13.d<? super c83.a0<j01.c>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f115612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f115613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f115614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f115615d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(h hVar, String str, boolean z14, t13.d<? super j0> dVar) {
        super(1, dVar);
        this.f115613b = hVar;
        this.f115614c = str;
        this.f115615d = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new j0(this.f115613b, this.f115614c, this.f115615d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<j01.c>> dVar) {
        return ((j0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f115612a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        c01.b bVar = this.f115613b.f115594a;
        this.f115612a = 1;
        Object objI = bVar.i(this.f115614c, this.f115615d, this);
        return objI == aVar ? aVar : objI;
    }
}
