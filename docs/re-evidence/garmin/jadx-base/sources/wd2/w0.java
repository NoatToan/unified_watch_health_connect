package wd2;

import android.util.LongSparseArray;
import com.garmin.android.library.livetrack.LivetrackService;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.livetrack.LivetrackService$stopJob$1", f = "LivetrackService.kt", l = {604}, m = "invokeSuspend", v = 2)
public final class w0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f184652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LivetrackService f184653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f184654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.library.livetrack.i f184655d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(LivetrackService livetrackService, long j8, com.garmin.android.library.livetrack.i iVar, t13.d<? super w0> dVar) {
        super(2, dVar);
        this.f184653b = livetrackService;
        this.f184654c = j8;
        this.f184655d = iVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new w0(this.f184653b, this.f184654c, this.f184655d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((w0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f184652a;
        long j8 = this.f184654c;
        LivetrackService livetrackService = this.f184653b;
        if (i14 == 0) {
            o13.r.b(obj);
            LongSparseArray<fe2.p1> longSparseArray = livetrackService.f50167g;
            LongSparseArray<fe2.p1> longSparseArray2 = livetrackService.f50167g;
            if (longSparseArray.indexOfKey(j8) >= 0) {
                fe2.p1 p1Var = longSparseArray2.get(j8);
                longSparseArray2.remove(j8);
                this.f184652a = 1;
                obj = p1Var.g(this.f184655d, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            livetrackService.f50162b.debug("Livetrack Sessions " + livetrackService.f50167g);
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        com.garmin.android.library.livetrack.d dVar = (com.garmin.android.library.livetrack.d) obj;
        livetrackService.f50162b.debug("Livetrack stopped for " + j8 + " with " + dVar);
        livetrackService.f50163c.m(dVar);
        l lVar = livetrackService.f50164d;
        if (lVar == null) {
            p005kotlin.jvm.internal.s.m("applicationDelegate");
            throw null;
        }
        livetrackService.m(lVar.getF104144a().e());
        livetrackService.f50162b.debug("Livetrack Sessions " + livetrackService.f50167g);
        return Unit.INSTANCE;
    }
}
