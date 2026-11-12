package zx;

import c83.a0;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lxx/f;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.calendar.data.repository.CalendarRepository$updateCalendarUserPref$2", f = "CalendarRepository.kt", l = {43}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements e23.l<t13.d<? super a0<xx.f>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f207333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f207334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f207335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xx.f f207336d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(f fVar, String str, xx.f fVar2, t13.d<? super l> dVar) {
        super(1, dVar);
        this.f207334b = fVar;
        this.f207335c = str;
        this.f207336d = fVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new l(this.f207334b, this.f207335c, this.f207336d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<xx.f>> dVar) {
        return ((l) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f207333a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<xx.f>> i0VarE = this.f207334b.f207317a.e(this.f207335c, this.f207336d);
        this.f207333a = 1;
        Object objAwait = i0VarE.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
