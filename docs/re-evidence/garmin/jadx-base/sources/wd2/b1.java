package wd2;

import com.garmin.android.library.livetrack.LivetrackService;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.livetrack.LivetrackService$updateLivetrackSession$1$1", f = "LivetrackService.kt", l = {419, 420}, m = "invokeSuspend", v = 2)
public final class b1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f184394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fe2.p1 f184395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f184396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ LivetrackService f184397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f184398e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ge2.e f184399f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(fe2.p1 p1Var, boolean z14, LivetrackService livetrackService, long j8, ge2.e eVar, t13.d<? super b1> dVar) {
        super(2, dVar);
        this.f184395b = p1Var;
        this.f184396c = z14;
        this.f184397d = livetrackService;
        this.f184398e = j8;
        this.f184399f = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b1(this.f184395b, this.f184396c, this.f184397d, this.f184398e, this.f184399f, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        if (r5.s(r4.f184398e, r4.f184399f, r4) == r0) goto L19;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f184394a;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f184394a = 1;
            obj = this.f184395b.d(this.f184396c, this);
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
        if (((xd2.g1) obj) instanceof xd2.g1.b) {
            de2.a aVar2 = this.f184397d.f50165e;
            if (aVar2 == null) {
                p005kotlin.jvm.internal.s.m("deviceManager");
                throw null;
            }
            this.f184394a = 2;
        }
        return Unit.INSTANCE;
    }
}
