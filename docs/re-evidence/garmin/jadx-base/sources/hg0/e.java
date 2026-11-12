package hg0;

import c83.a0;
import e23.l;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import ps.r;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lps/r;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.events.network.eventsearch.activity.ActivityRepo$getActivitySummary$2", f = "ActivityRepo.kt", l = {65}, m = "invokeSuspend", v = 2)
public final class e extends i implements l<t13.d<? super a0<r>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f83667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f83668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f83669c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(b bVar, long j8, t13.d<? super e> dVar) {
        super(1, dVar);
        this.f83668b = bVar;
        this.f83669c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new e(this.f83668b, this.f83669c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<r>> dVar) {
        return ((e) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f83667a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        i0<a0<r>> i0VarC = this.f83668b.f83653a.c(this.f83669c);
        this.f83667a = 1;
        Object objAwait = i0VarC.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
