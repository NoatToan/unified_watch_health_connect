package ok2;

import android.content.Context;
import com.garmin.device.filetransfer.core.background.AutoSyncWorker;
import com.garmin.device.filetransfer.core.background.BackgroundTransferWorker;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.device.filetransfer.core.TransferHelper$initialize$1$3", f = "TransferHelper.kt", l = {}, m = "invokeSuspend")
public final class b0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0 f132597a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(a0 a0Var, t13.d<? super b0> dVar) {
        super(2, dVar);
        this.f132597a = a0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b0(this.f132597a, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        a0 a0Var = this.f132597a;
        a0.a aVar2 = a0.f132585h;
        BackgroundTransferWorker.f50764q.getClass();
        long j8 = BackgroundTransferWorker.f50765r;
        synchronized (a0Var.f132592c) {
            a0Var.g().getClass();
            Context context = a0Var.getConfiguration().f132622b;
            if (context != null) {
                AutoSyncWorker.a.a(AutoSyncWorker.f50762t, context, j8);
                Unit unit = Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }
}
