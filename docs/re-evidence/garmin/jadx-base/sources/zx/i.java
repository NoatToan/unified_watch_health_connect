package zx;

import c83.a0;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lxx/f;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.calendar.data.repository.CalendarRepository$getOneTimeMessagePref$2", f = "CalendarRepository.kt", l = {49}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements e23.l<t13.d<? super a0<xx.f>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f207324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f207325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f207326c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(f fVar, String str, t13.d<? super i> dVar) {
        super(1, dVar);
        this.f207325b = fVar;
        this.f207326c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new i(this.f207325b, this.f207326c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<xx.f>> dVar) {
        return ((i) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f207324a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<xx.f>> i0VarF = this.f207325b.f207317a.f(this.f207326c);
        this.f207324a = 1;
        Object objAwait = i0VarF.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
