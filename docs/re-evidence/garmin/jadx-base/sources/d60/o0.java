package d60;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/courses/model/e;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.repo.CoursesRepo$updateCourseDetail$2", f = "CoursesRepo.kt", l = {183}, m = "invokeSuspend", v = 2)
public final class o0 extends v13.i implements e23.l<t13.d<? super c83.a0<com.garmin.android.apps.connectmobile.courses.model.e>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f57915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f57916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f57917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.courses.model.e f57918d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(b bVar, String str, com.garmin.android.apps.connectmobile.courses.model.e eVar, t13.d<? super o0> dVar) {
        super(1, dVar);
        this.f57916b = bVar;
        this.f57917c = str;
        this.f57918d = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new o0(this.f57916b, this.f57917c, this.f57918d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<com.garmin.android.apps.connectmobile.courses.model.e>> dVar) {
        return ((o0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f57915a;
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
        o53.i0<c83.a0<com.garmin.android.apps.connectmobile.courses.model.e>> i0VarD = this.f57916b.b().D(this.f57917c, this.f57918d);
        this.f57915a = 1;
        Object objAwait = i0VarD.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
