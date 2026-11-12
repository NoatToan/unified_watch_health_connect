package ch1;

import android.content.Context;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Ljava/lang/String;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.devices.fields.IndexS2LocationSettingField$resolveLocationName$2", f = "IndexS2LocationSettingField.kt", l = {}, m = "invokeSuspend", v = 2)
public final class z1 extends v13.i implements e23.p<o53.b0, t13.d<? super String>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x1 f27507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Double f27508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Double f27509c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(x1 x1Var, Double d14, Double d15, t13.d<? super z1> dVar) {
        super(2, dVar);
        this.f27507a = x1Var;
        this.f27508b = d14;
        this.f27509c = d15;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new z1(this.f27507a, this.f27508b, this.f27509c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super String> dVar) {
        return ((z1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        zb0.d0 d0Var = (zb0.d0) KoinJavaComponent.get$default(zb0.d0.class, null, null, 6, null);
        int i14 = x1.f27494g;
        Context context = this.f27507a.f70343a;
        context.getClass();
        return d0Var.Q(context, this.f27508b.doubleValue(), this.f27509c.doubleValue());
    }
}
