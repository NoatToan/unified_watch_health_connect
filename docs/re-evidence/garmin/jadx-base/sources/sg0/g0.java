package sg0;

import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.familyaccounts.presentation.managefamily.ManageChildViewModel$checkIncompleteConsents$1", f = "ManageChildViewModel.kt", l = {150}, m = "invokeSuspend", v = 2)
public final class g0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f159092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f159093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f159094c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(f0 f0Var, long j8, t13.d<? super g0> dVar) {
        super(2, dVar);
        this.f159093b = f0Var;
        this.f159094c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g0(this.f159093b, this.f159094c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objE;
        Object value2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f159092a;
        f0 f0Var = this.f159093b;
        if (i14 == 0) {
            o13.r.b(obj);
            p2 p2Var = f0Var.f159087f;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, u.b((u) f0Var.f159087f.getValue(), null, null, null, null, true, null, false, false, false, null, null, 8159)));
            ve0.b bVar = (ve0.b) KoinJavaComponent.get$default(ve0.b.class, null, null, 6, null);
            this.f159092a = 1;
            objE = bVar.e(this.f159094c, this);
            if (objE == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            objE = obj;
        }
        boolean zBooleanValue = ((Boolean) objE).booleanValue();
        p2 p2Var2 = f0Var.f159087f;
        do {
            value2 = p2Var2.getValue();
        } while (!p2Var2.b(value2, u.b((u) f0Var.f159087f.getValue(), null, null, null, null, false, null, zBooleanValue, false, false, null, null, 7903)));
        return Unit.INSTANCE;
    }
}
