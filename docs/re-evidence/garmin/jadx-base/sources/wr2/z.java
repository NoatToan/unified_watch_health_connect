package wr2;

import android.content.Context;
import com.garmin.garminpay.database.GarminPayCoreDatabase;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.util.WalletItemsUtilKt$isDeviceWalletSetUp$2", f = "WalletItemsUtil.kt", l = {}, m = "invokeSuspend", v = 2)
public final class z extends v13.i implements e23.p<b0, t13.d<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f186895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f186896b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(Context context, long j8, t13.d<? super z> dVar) {
        super(2, dVar);
        this.f186895a = context;
        this.f186896b = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new z(this.f186895a, this.f186896b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Boolean> dVar) {
        return ((z) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        GarminPayCoreDatabase.b bVar = GarminPayCoreDatabase.f52316a;
        Context applicationContext = this.f186895a.getApplicationContext();
        applicationContext.getClass();
        bVar.getClass();
        return Boolean.valueOf(!GarminPayCoreDatabase.b.a(applicationContext).e().b(this.f186896b).isEmpty());
    }
}
