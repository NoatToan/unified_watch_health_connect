package lo2;

import android.app.Activity;
import com.alipay.sdk.app.PayTask;
import com.google.gson.Gson;
import e23.p;
import java.util.Map;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Llo2/c;", "<anonymous>", "(Lo53/b0;)Llo2/c;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.alipay.AliPayManager$navigateToAliPay$2", f = "AliPayManager.kt", l = {}, m = "invokeSuspend", v = 2)
public final class a extends i implements p<b0, t13.d<? super c>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f114043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f114044b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Activity activity, String str, t13.d<? super a> dVar) {
        super(2, dVar);
        this.f114043a = activity;
        this.f114044b = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new a(this.f114043a, this.f114044b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super c> dVar) {
        return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        Map<String, String> mapPayV2 = new PayTask(this.f114043a).payV2(this.f114044b, true);
        c.a aVar2 = c.f114046d;
        mapPayV2.getClass();
        aVar2.getClass();
        return new c(mapPayV2.get("resultStatus"), (d) new Gson().fromJson(mapPayV2.get("result"), d.class), mapPayV2.get("memo"));
    }
}
