package d60;

import com.garmin.android.apps.connectmobile.courses.model.CourseSegmentDTO;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lcom/garmin/android/apps/connectmobile/courses/model/CourseSegmentDTO;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.repo.CoursesRepo$saveRouteSegments$2", f = "CoursesRepo.kt", l = {236}, m = "invokeSuspend", v = 2)
public final class g0 extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends CourseSegmentDTO>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f57849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List<CourseSegmentDTO> f57850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f57851c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(List<CourseSegmentDTO> list, b bVar, t13.d<? super g0> dVar) {
        super(1, dVar);
        this.f57850b = list;
        this.f57851c = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new g0(this.f57850b, this.f57851c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<List<? extends CourseSegmentDTO>>> dVar) {
        return ((g0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f57849a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        String json = iu1.n.a().toJson(this.f57850b);
        b.a aVar2 = b.f57806c;
        a aVarB = this.f57851c.b();
        json.getClass();
        o53.i0<c83.a0<List<CourseSegmentDTO>>> i0VarV = aVarB.v(json);
        this.f57849a = 1;
        Object objAwait = i0VarV.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
