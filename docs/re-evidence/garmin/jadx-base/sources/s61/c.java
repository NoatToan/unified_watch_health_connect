package s61;

import c83.a0;
import e23.l;
import java.util.List;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lx61/e;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.performance.repo.PerformanceRepo$getDailyHeatAltitudeAcclimation$2", f = "PerformanceRepo.kt", l = {21}, m = "invokeSuspend", v = 2)
public final class c extends i implements l<t13.d<? super a0<List<? extends x61.e>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f157627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f157628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f157629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f157630d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, String str, String str2, t13.d<? super c> dVar) {
        super(1, dVar);
        this.f157628b = aVar;
        this.f157629c = str;
        this.f157630d = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new c(this.f157628b, this.f157629c, this.f157630d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<List<? extends x61.e>>> dVar) {
        return ((c) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f157627a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<List<x61.e>>> i0VarC = this.f157628b.f157623a.c(this.f157629c, this.f157630d);
        this.f157627a = 1;
        Object objAwait = i0VarC.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
