package x40;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/garmin/android/apps/connectmobile/pacepro/data/dto/a;", "updatedPacebands", "", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.custom.CreateCustomCourseViewModel$editCourseRelatedPacebands$3", f = "CreateCustomCourseViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class d0 extends v13.i implements e23.p<List<? extends com.garmin.android.apps.connectmobile.pacepro.data.dto.a>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f188670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f188671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f188672c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(l0 l0Var, e23.a<Unit> aVar, t13.d<? super d0> dVar) {
        super(2, dVar);
        this.f188671b = l0Var;
        this.f188672c = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        d0 d0Var = new d0(this.f188671b, this.f188672c, dVar);
        d0Var.f188670a = obj;
        return d0Var;
    }

    @Override // e23.p
    public final Object invoke(List<? extends com.garmin.android.apps.connectmobile.pacepro.data.dto.a> list, t13.d<? super Unit> dVar) {
        return ((d0) create(list, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.f188670a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        int size = list.size();
        l0 l0Var = this.f188671b;
        if (size != l0Var.f188715b.size()) {
            l0Var.D4(a50.e.m0.f1357a);
        } else {
            this.f188672c.invoke();
        }
        return Unit.INSTANCE;
    }
}
