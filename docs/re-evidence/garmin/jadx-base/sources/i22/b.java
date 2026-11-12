package i22;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import rd2.j;
import v13.i;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\t\u0018\u00010\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lsd2/f;", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Lo53/b0;)Lsd2/f;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.util.location.ConnectedGPSService$queryDeviceDisplayNames$2$deviceDatabaseRecord$1", f = "ConnectedGPSService.kt", l = {}, m = "invokeSuspend", v = 2)
public final class b extends i implements p<b0, t13.d<? super sd2.f>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rd2.f f87385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f87386b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(rd2.f fVar, long j8, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f87385a = fVar;
        this.f87386b = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b(this.f87385a, this.f87386b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super sd2.f> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        this.f87385a.f152045a.getClass();
        return j.i(this.f87386b, null);
    }
}
