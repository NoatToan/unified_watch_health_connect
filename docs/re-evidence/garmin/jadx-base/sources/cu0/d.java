package cu0;

import com.garmin.android.apps.connectmobile.liveeventsharing.LiveEventService;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.liveeventsharing.LiveEventService$sendSubscriptionRequestToDevice$1", f = "LiveEventService.kt", l = {123, 125}, m = "invokeSuspend", v = 2)
public final class d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f55567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LiveEventService f55568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Long f55569c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(LiveEventService liveEventService, Long l14, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f55568b = liveEventService;
        this.f55569c = l14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f55568b, this.f55569c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        if (com.garmin.android.apps.connectmobile.gfdi.protobuf.EventSharingSubscriptionHandler.sendSubscription(r4, r1, r10, r9) == r0) goto L19;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f55567a;
        Long l14 = this.f55569c;
        LiveEventService liveEventService = this.f55568b;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
        r.b(obj);
        ju0.e eVarA = LiveEventService.a(liveEventService);
        long jLongValue = l14.longValue();
        this.f55567a = 1;
        ju0.e.a aVar2 = ju0.e.f100881g;
        obj = eVarA.a(jLongValue, this, false);
        if (obj != aVar) {
        }
        return aVar;
        gu0.b bVar = (gu0.b) obj;
        if (bVar != null ? s.g(bVar.f79037b, Boolean.TRUE) : false) {
            long jLongValue2 = l14.longValue();
            this.f55567a = 2;
        }
        return Unit.INSTANCE;
    }
}
