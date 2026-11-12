package vd0;

import c22.l3;
import java.util.Arrays;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dogs.presentation.EditDogPageKt$EditDogPageContent$6$1", f = "EditDogPage.kt", l = {}, m = "invokeSuspend", v = 2)
public final class l1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pe0.j f177322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f177323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3.p1<String> f177324c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(pe0.j jVar, boolean z14, p3.p1<String> p1Var, t13.d<? super l1> dVar) {
        super(2, dVar);
        this.f177322a = jVar;
        this.f177323b = z14;
        this.f177324c = p1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l1(this.f177322a, this.f177323b, this.f177324c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        String str;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        double d14 = this.f177322a.f137456f;
        if (d14 > 0.0d) {
            l3.f23124b.getClass();
            double dQ1 = l3.a.Q1((long) d14, this.f177323b);
            p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
            str = String.format("%.0f", Arrays.copyOf(new Object[]{new Double(dQ1)}, 1));
        } else {
            str = "";
        }
        this.f177324c.setValue(str);
        return Unit.INSTANCE;
    }
}
