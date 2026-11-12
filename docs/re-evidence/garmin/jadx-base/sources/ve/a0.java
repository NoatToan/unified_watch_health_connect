package ve;

import android.content.Context;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "hasUnfinishedWork", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2", f = "UnfinishedWorkListener.kt", l = {}, m = "invokeSuspend")
public final class a0 extends v13.i implements e23.p<Boolean, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f177538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f177539b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(Context context, t13.d<? super a0> dVar) {
        super(2, dVar);
        this.f177539b = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        a0 a0Var = new a0(this.f177539b, dVar);
        a0Var.f177538a = ((Boolean) obj).booleanValue();
        return a0Var;
    }

    @Override // e23.p
    public final Object invoke(Boolean bool, t13.d<? super Unit> dVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((a0) create(bool2, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        df.o.a(this.f177539b, RescheduleReceiver.class, this.f177538a);
        return Unit.INSTANCE;
    }
}
