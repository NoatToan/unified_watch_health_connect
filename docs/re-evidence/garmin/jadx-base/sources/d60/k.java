package d60;

import com.garmin.android.apps.connectmobile.courses.model.CourseSegmentDTO;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lcom/garmin/android/apps/connectmobile/courses/model/CourseSegmentDTO;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.repo.CoursesRepo$getCourseLines$2", f = "CoursesRepo.kt", l = {242}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends CourseSegmentDTO>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f57873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f57874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f57875c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(b bVar, String str, t13.d<? super k> dVar) {
        super(1, dVar);
        this.f57874b = bVar;
        this.f57875c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new k(this.f57874b, this.f57875c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<List<? extends CourseSegmentDTO>>> dVar) {
        return ((k) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f57873a;
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
        o53.i0<c83.a0<List<CourseSegmentDTO>>> i0VarK = this.f57874b.b().k(this.f57875c);
        this.f57873a = 1;
        Object objAwait = i0VarK.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
