package vo2;

import com.garmin.feature.garminpay.providers.gpay.sync.NewDeviceSyncQueue;
import com.google.android.gms.identity.intents.AddressConstants;
import java.util.List;
import o53.b0;
import o53.c0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.sync.NewDeviceSyncQueue$tryReleasingExplicitLock$2", f = "NewDeviceSyncQueue.kt", l = {AddressConstants.ErrorCodes.ERROR_CODE_NO_APPLICABLE_ADDRESSES}, m = "invokeSuspend", v = 2)
public final class r extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f179202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f179203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NewDeviceSyncQueue f179204c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(NewDeviceSyncQueue newDeviceSyncQueue, t13.d<? super r> dVar) {
        super(2, dVar);
        this.f179204c = newDeviceSyncQueue;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        r rVar = new r(this.f179204c, dVar);
        rVar.f179203b = obj;
        return rVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((r) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        b0 b0Var = (b0) this.f179203b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f179202a;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f179203b = b0Var;
            this.f179202a = 1;
            List<y> list = NewDeviceSyncQueue.f51325l;
            NewDeviceSyncQueue newDeviceSyncQueue = this.f179204c;
            newDeviceSyncQueue.getClass();
            o53.k kVar = new o53.k(u13.f.b(this), 1);
            kVar.q();
            newDeviceSyncQueue.f51331e.debug("unReserveNFC");
            ul2.c andSet = newDeviceSyncQueue.f51334h.getAndSet(null);
            if (andSet == null) {
                int i15 = o13.q.f128596b;
                kVar.resumeWith(Unit.INSTANCE);
            } else {
                andSet.f(tl2.c.b.SUCCESS, new s(kVar, newDeviceSyncQueue));
            }
            Object objP = kVar.p();
            if (objP != aVar) {
                objP = Unit.INSTANCE;
            }
            if (objP == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        c0.c(b0Var, null);
        return Unit.INSTANCE;
    }
}
