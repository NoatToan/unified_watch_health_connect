package e30;

import com.garmin.android.apps.connectmobile.courses.model.CourseSegmentDTO;
import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lcom/garmin/android/apps/connectmobile/courses/model/CourseSegmentDTO;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.details.GetCourseSegmentsUseCase$invoke$1", f = "GetCourseSegmentsUseCase.kt", l = {18, 23}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.p<r53.j<? super v2<? extends List<? extends CourseSegmentDTO>>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f62713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f62714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f62715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f62716d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(String str, r rVar, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f62715c = str;
        this.f62716d = rVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        q qVar = new q(this.f62715c, this.f62716d, dVar);
        qVar.f62714b = obj;
        return qVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super v2<? extends List<? extends CourseSegmentDTO>>> jVar, t13.d<? super Unit> dVar) {
        return ((q) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        if (r13 == r1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        if (r0.emit(r13, r12) == r1) goto L19;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        v2 aVar;
        r53.j jVar = (r53.j) this.f62714b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f62713a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        String str = this.f62715c;
        if (str != null) {
            d60.b bVar = this.f62716d.f62717a;
            this.f62714b = jVar;
            this.f62713a = 1;
            obj = bVar.C(new d60.k(bVar, str, null), this);
        } else {
            aVar = new v2.a(new Exception("Invalid course id."), null, null, 6, null);
            this.f62714b = null;
            this.f62713a = 2;
        }
        return aVar2;
        aVar = (v2) obj;
        this.f62714b = null;
        this.f62713a = 2;
    }
}
