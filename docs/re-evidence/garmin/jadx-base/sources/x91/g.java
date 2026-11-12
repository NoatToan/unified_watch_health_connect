package x91;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.n1;
import p3.p1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.personalrecords.presentation.composables.screen.BestEffortsScreenKt$BestEffortsScreen$5$3$1", f = "BestEffortsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ aa1.a f189608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n1 f189609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f189610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1<i53.f<dn.a>> f189611d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(aa1.a aVar, n1 n1Var, p1<Boolean> p1Var, p1<i53.f<dn.a>> p1Var2, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f189608a = aVar;
        this.f189609b = n1Var;
        this.f189610c = p1Var;
        this.f189611d = p1Var2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g(this.f189608a, this.f189609b, this.f189610c, this.f189611d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        int intValue = this.f189609b.getIntValue();
        boolean z14 = false;
        p1<Boolean> p1Var = this.f189610c;
        aa1.a aVar2 = this.f189608a;
        if (intValue == 3) {
            if (!aVar2.f2218a && aVar2.f2228k.isEmpty()) {
                z14 = true;
            }
            p1Var.setValue(Boolean.valueOf(z14));
        } else {
            i53.f<dn.a> fVarJ = i53.a.j(aVar2.f2229l);
            p1<i53.f<dn.a>> p1Var2 = this.f189611d;
            p1Var2.setValue(fVarJ);
            if (!aVar2.f2218a && p1Var2.getF182175a().isEmpty()) {
                z14 = true;
            }
            p1Var.setValue(Boolean.valueOf(z14));
        }
        return Unit.INSTANCE;
    }
}
