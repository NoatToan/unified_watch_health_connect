package qh1;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.devices.indexscale2.bodycomposition.IndexScale2AdjustBodyCompositionViewModel$getLatestBodyComposition$1", f = "IndexScale2AdjustBodyCompositionViewModel.kt", l = {90, 91}, m = "invokeSuspend", v = 2)
public final class r extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f144775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f144776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f144777c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(p pVar, long j8, t13.d<? super r> dVar) {
        super(2, dVar);
        this.f144776b = pVar;
        this.f144777c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new r(this.f144776b, this.f144777c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((r) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        if (qh1.p.x4(r2, (com.garmin.android.apps.connectmobile.v2) r7, r6) == r0) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f144775a;
        p pVar = this.f144776b;
        if (i14 == 0) {
            o13.r.b(obj);
            m mVar = pVar.f144766a;
            this.f144775a = 1;
            obj = mVar.d(this.f144777c, this);
            if (obj != aVar) {
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
        this.f144775a = 2;
    }
}
