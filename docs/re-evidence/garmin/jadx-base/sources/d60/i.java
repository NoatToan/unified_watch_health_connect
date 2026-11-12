package d60;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lj61/d;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.repo.CoursesRepo$getCourseDemandsData$courseDemandsDTO$courseDemandsResult$1", f = "CoursesRepo.kt", l = {546}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements e23.l<t13.d<? super c83.a0<j61.d>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f57861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f57862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f57863c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(b bVar, String str, t13.d<? super i> dVar) {
        super(1, dVar);
        this.f57862b = bVar;
        this.f57863c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new i(this.f57862b, this.f57863c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<j61.d>> dVar) {
        return ((i) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f57861a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        b.a aVar2 = b.f57806c;
        o53.i0<c83.a0<j61.d>> i0VarW = this.f57862b.b().w(this.f57863c);
        this.f57861a = 1;
        Object objAwait = i0VarW.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
