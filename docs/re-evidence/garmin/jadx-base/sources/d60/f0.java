package d60;

import okhttp3.MultipartBody;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/courses/model/e;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.repo.CoursesRepo$importCourse$2", f = "CoursesRepo.kt", l = {229}, m = "invokeSuspend", v = 2)
public final class f0 extends v13.i implements e23.l<t13.d<? super c83.a0<com.garmin.android.apps.connectmobile.courses.model.e>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f57843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f57844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MultipartBody.Part f57845c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(b bVar, MultipartBody.Part part, t13.d<? super f0> dVar) {
        super(1, dVar);
        this.f57844b = bVar;
        this.f57845c = part;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new f0(this.f57844b, this.f57845c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<com.garmin.android.apps.connectmobile.courses.model.e>> dVar) {
        return ((f0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f57843a;
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
        o53.i0<c83.a0<com.garmin.android.apps.connectmobile.courses.model.e>> i0VarG = this.f57844b.b().G(this.f57845c);
        this.f57843a = 1;
        Object objAwait = i0VarG.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
