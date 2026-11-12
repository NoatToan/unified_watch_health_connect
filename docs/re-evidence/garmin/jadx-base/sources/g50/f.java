package g50;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import java.util.Iterator;
import java.util.List;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "result", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/v2;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.list.CoursesViewModel$deleteCourse$1", f = "CoursesViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements p<v2<? extends Unit>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f75892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f75893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.courses.model.d f75894c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, com.garmin.android.apps.connectmobile.courses.model.d dVar, t13.d<? super f> dVar2) {
        super(2, dVar2);
        this.f75893b = gVar;
        this.f75894c = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        f fVar = new f(this.f75893b, this.f75894c, dVar);
        fVar.f75892a = obj;
        return fVar;
    }

    @Override // e23.p
    public final Object invoke(v2<? extends Unit> v2Var, t13.d<? super Unit> dVar) {
        return ((f) create(v2Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        i50.h hVarA;
        v2 v2Var = (v2) this.f75892a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        if (v2Var instanceof v2.a) {
            g gVar = this.f75893b;
            p2 p2Var = gVar.f75903i;
            do {
                value = p2Var.getValue();
                i50.h hVar = (i50.h) value;
                List<com.garmin.android.apps.connectmobile.courses.model.d> list = hVar.f91768g;
                int i14 = hVar.f91774m;
                com.garmin.android.apps.connectmobile.courses.model.d dVar = this.f75894c;
                if (list != null && list.isEmpty()) {
                    hVarA = i50.h.a(hVar, null, false, false, false, h0.D0(hVar.f91768g, dVar), null, null, false, null, i14 + 1, false, 12223);
                    break;
                }
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        hVarA = i50.h.a(hVar, null, false, false, false, h0.D0(hVar.f91768g, dVar), null, null, false, null, i14 + 1, false, 12223);
                        break;
                    }
                    if (s.g(((com.garmin.android.apps.connectmobile.courses.model.d) it.next()).courseId, dVar.courseId)) {
                        hVarA = i50.h.a(hVar, null, false, false, false, null, null, null, false, null, i14 + 1, false, 12287);
                        break;
                    }
                }
            } while (!p2Var.b(value, hVarA));
            gVar.y4(i50.c.l.a(R.string.msg_course_delete_fail));
        }
        return Unit.INSTANCE;
    }
}
