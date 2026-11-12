package po;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.map.ActivityMapTimingGateBottomSheetKt$SheetContent$1$1$1$3$1$1$1$1", f = "ActivityMapTimingGateBottomSheet.kt", l = {341, 342}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f138967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a03.p f138968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e2.i0 f138969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f138970d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(a03.p pVar, e2.i0 i0Var, int i14, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f138968b = pVar;
        this.f138969c = i0Var;
        this.f138970d = i14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new q(this.f138968b, this.f138969c, this.f138970d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        if (e2.i0.f(r4.f138969c, r4.f138970d, r4) == r0) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f138967a;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f138967a = 1;
            if (this.f138968b.e(this) != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        this.f138967a = 2;
    }
}
