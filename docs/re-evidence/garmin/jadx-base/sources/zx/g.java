package zx;

import c83.a0;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Ldy/a;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.calendar.data.repository.CalendarRepository$getEventAsOwner$2", f = "CalendarRepository.kt", l = {31}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements e23.l<t13.d<? super a0<dy.a>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f207318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f207319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f207320c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f fVar, long j8, t13.d<? super g> dVar) {
        super(1, dVar);
        this.f207319b = fVar;
        this.f207320c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new g(this.f207319b, this.f207320c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<dy.a>> dVar) {
        return ((g) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f207318a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<dy.a>> i0VarA = this.f207319b.f207317a.a(this.f207320c);
        this.f207318a = 1;
        Object objAwait = i0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
