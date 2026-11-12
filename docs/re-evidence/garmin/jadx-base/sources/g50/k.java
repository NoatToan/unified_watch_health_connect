package g50;

import e23.p;
import java.util.Iterator;
import java.util.List;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052 \u0010\u0004\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0001\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo13/p;", "", "Lcom/garmin/android/apps/connectmobile/courses/model/d;", "Lfg0/k;", "response", "", "<anonymous>", "(Lo13/p;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.list.CoursesViewModel$reloadAndSendCourse$2", f = "CoursesViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements p<o13.p<? extends List<? extends com.garmin.android.apps.connectmobile.courses.model.d>, ? extends List<? extends fg0.k>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f75924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f75925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f75926c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(g gVar, String str, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f75925b = gVar;
        this.f75926c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        k kVar = new k(this.f75925b, this.f75926c, dVar);
        kVar.f75924a = obj;
        return kVar;
    }

    @Override // e23.p
    public final Object invoke(o13.p<? extends List<? extends com.garmin.android.apps.connectmobile.courses.model.d>, ? extends List<? extends fg0.k>> pVar, t13.d<? super Unit> dVar) {
        return ((k) create(pVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object next;
        o13.p pVar = (o13.p) this.f75924a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        List list = pVar != null ? (List) pVar.f128594a : null;
        g gVar = this.f75925b;
        if (list != null) {
            g.x4(gVar, list);
            p2 p2Var = gVar.f75903i;
            while (true) {
                Object value2 = p2Var.getValue();
                p2 p2Var2 = p2Var;
                i50.h hVar = (i50.h) value2;
                o13.p pVar2 = pVar;
                if (p2Var2.b(value2, i50.h.a(hVar, null, false, false, false, list, (List) pVar.f128595b, null, false, null, hVar.f91774m + 1, false, 12095))) {
                    break;
                }
                p2Var = p2Var2;
                pVar = pVar2;
            }
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!s.g(((com.garmin.android.apps.connectmobile.courses.model.d) next).courseId, this.f75926c));
            com.garmin.android.apps.connectmobile.courses.model.d dVar = (com.garmin.android.apps.connectmobile.courses.model.d) next;
            if (dVar != null) {
                gVar.y4(new i50.c.a(dVar));
            }
        } else {
            p2 p2Var3 = gVar.f75903i;
            do {
                value = p2Var3.getValue();
            } while (!p2Var3.b(value, i50.h.a((i50.h) value, null, false, false, true, null, null, null, false, null, 0, false, 16351)));
        }
        return Unit.INSTANCE;
    }
}
