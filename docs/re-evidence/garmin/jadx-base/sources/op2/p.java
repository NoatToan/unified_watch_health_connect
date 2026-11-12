package op2;

import android.content.Context;
import com.garmin.garminpay.database.GarminPayCoreDatabase;
import java.util.List;
import o13.r;
import o53.b0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lfs2/a;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.common.NewFitPayWebPresenterViewModel$getWalletItems$2", f = "NewFitPayWebPresenterViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class p extends v13.i implements e23.p<b0, t13.d<? super List<? extends fs2.a>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f133253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Long f133254b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(String str, Long l14, t13.d<? super p> dVar) {
        super(2, dVar);
        this.f133253a = str;
        this.f133254b = l14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new p(this.f133253a, this.f133254b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super List<? extends fs2.a>> dVar) {
        return ((p) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        GarminPayCoreDatabase.b bVar = GarminPayCoreDatabase.f52316a;
        Context contextC = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c();
        bVar.getClass();
        return GarminPayCoreDatabase.b.a(contextC).e().j(this.f133254b.longValue(), this.f133253a);
    }
}
