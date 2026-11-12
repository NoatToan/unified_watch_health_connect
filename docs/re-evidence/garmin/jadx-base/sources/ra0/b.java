package ra0;

import e23.l;
import e23.p;
import java.util.List;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p3.n1;
import t13.d;
import v13.e;
import v13.i;
import zb0.s0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.customization.other.LanguageSelectionScreenKt$LanguageSelectionScreen$1$1", f = "LanguageSelectionScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class b extends i implements p<b0, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List<s0> f151463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l<s0, Unit> f151464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n1 f151465c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(List<? extends s0> list, l<? super s0, Unit> lVar, n1 n1Var, d<? super b> dVar) {
        super(2, dVar);
        this.f151463a = list;
        this.f151464b = lVar;
        this.f151465c = n1Var;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new b(this.f151463a, this.f151464b, this.f151465c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        s0 s0Var = (s0) h0.e0(this.f151465c.getIntValue(), this.f151463a);
        if (s0Var != null) {
            this.f151464b.invoke(s0Var);
        }
        return Unit.INSTANCE;
    }
}
