package g22;

import android.content.BroadcastReceiver;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.util.extensions.BroadcastReceiverExtensionsKt$goAsync$1", f = "BroadcastReceiverExtensions.kt", l = {19}, m = "invokeSuspend", v = 2)
public final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f75545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f75546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.p<b0, t13.d<? super Unit>, Object> f75547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BroadcastReceiver.PendingResult f75548d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(e23.p<? super b0, ? super t13.d<? super Unit>, ? extends Object> pVar, BroadcastReceiver.PendingResult pendingResult, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f75547c = pVar;
        this.f75548d = pendingResult;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        b bVar = new b(this.f75547c, this.f75548d, dVar);
        bVar.f75546b = obj;
        return bVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        b0 b0Var = (b0) this.f75546b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f75545a;
        BroadcastReceiver.PendingResult pendingResult = this.f75548d;
        try {
            if (i14 == 0) {
                r.b(obj);
                e23.p<b0, t13.d<? super Unit>, Object> pVar = this.f75547c;
                this.f75546b = null;
                this.f75545a = 1;
                if (pVar.invoke(b0Var, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            pendingResult.finish();
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            pendingResult.finish();
            throw th3;
        }
    }
}
