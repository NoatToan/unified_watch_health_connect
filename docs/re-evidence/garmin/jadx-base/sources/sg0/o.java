package sg0;

import android.content.Context;
import com.garmin.android.apps.connectmobile.g1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x3;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.familyaccounts.presentation.managefamily.ChildAccountScreenKt$ChildAccountScreen$1$1", f = "ChildAccountScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f159131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x3<u> f159132b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context, x3<u> x3Var, t13.d<? super o> dVar) {
        super(2, dVar);
        this.f159131a = context;
        this.f159132b = x3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new o(this.f159131a, this.f159132b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((o) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        if (this.f159132b.getF182175a().f159162g != null) {
            Context context = this.f159131a;
            g1.a(context, hb2.i.a(context) ? null : new fw.h());
        }
        return Unit.INSTANCE;
    }
}
