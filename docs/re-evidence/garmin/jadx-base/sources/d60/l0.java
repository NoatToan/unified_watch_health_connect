package d60;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.repo.CoursesRepo$sendPaceBandToDevice$2", f = "CoursesRepo.kt", l = {219}, m = "invokeSuspend", v = 2)
public final class l0 extends v13.i implements e23.l<t13.d<? super c83.a0<Object>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f57883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f57884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f57885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f57886d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(b bVar, long j8, long j14, t13.d<? super l0> dVar) {
        super(1, dVar);
        this.f57884b = bVar;
        this.f57885c = j8;
        this.f57886d = j14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new l0(this.f57884b, this.f57885c, this.f57886d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<Object>> dVar) {
        return ((l0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f57883a;
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
        o53.i0<c83.a0<Object>> i0VarE = this.f57884b.b().e(this.f57885c, this.f57886d);
        this.f57883a = 1;
        Object objAwait = i0VarE.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
