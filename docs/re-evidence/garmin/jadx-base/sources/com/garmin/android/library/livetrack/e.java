package com.garmin.android.library.livetrack;

import android.util.LongSparseArray;
import e23.p;
import fe2.p1;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.livetrack.LivetrackService$cancelAutoStart$1", f = "LivetrackService.kt", l = {}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LivetrackService f50210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f50211b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(LivetrackService livetrackService, long j8, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f50210a = livetrackService;
        this.f50211b = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f50210a, this.f50211b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        LivetrackService livetrackService = this.f50210a;
        LongSparseArray<p1> longSparseArray = livetrackService.f50167g;
        LongSparseArray<p1> longSparseArray2 = livetrackService.f50167g;
        long j8 = this.f50211b;
        if (longSparseArray.get(j8).getF70802n()) {
            livetrackService.j(j8, i.a.f50228a);
        } else {
            longSparseArray2.get(j8).b();
            longSparseArray2.remove(j8);
            livetrackService.f50162b.debug("ltSessions " + longSparseArray2);
            livetrackService.f50163c.m(new d.a(j8, c.i.f50194a));
        }
        return Unit.INSTANCE;
    }
}
