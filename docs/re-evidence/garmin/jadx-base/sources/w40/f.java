package w40;

import com.garmin.android.apps.connectmobile.v2;
import e23.l;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "Lj61/e;", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.coursedemands.CourseDemandsViewModel$getCourseDemands$1", f = "CourseDemandsViewModel.kt", l = {11}, m = "invokeSuspend", v = 2)
public final class f extends i implements l<t13.d<? super v2<? extends j61.e>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f181943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f181944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f181945c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, String str, t13.d<? super f> dVar) {
        super(1, dVar);
        this.f181944b = gVar;
        this.f181945c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new f(this.f181944b, this.f181945c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super v2<? extends j61.e>> dVar) {
        return ((f) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f181943a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        d60.b bVar = (d60.b) this.f181944b.f181946a.getValue();
        this.f181943a = 1;
        Object objA = bVar.a(this.f181945c, this);
        return objA == aVar ? aVar : objA;
    }
}
