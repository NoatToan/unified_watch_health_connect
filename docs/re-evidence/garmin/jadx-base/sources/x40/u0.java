package x40;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "waypointsNames", "", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.custom.CreateCustomCourseViewModel$navigateToEditWaypoints$2", f = "CreateCustomCourseViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class u0 extends v13.i implements e23.p<List<? extends String>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f188794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f188795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<com.garmin.android.library.mapsdkadapter.f> f188796c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(l0 l0Var, List<com.garmin.android.library.mapsdkadapter.f> list, t13.d<? super u0> dVar) {
        super(2, dVar);
        this.f188795b = l0Var;
        this.f188796c = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        u0 u0Var = new u0(this.f188795b, this.f188796c, dVar);
        u0Var.f188794a = obj;
        return u0Var;
    }

    @Override // e23.p
    public final Object invoke(List<? extends String> list, t13.d<? super Unit> dVar) {
        return ((u0) create(list, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.f188794a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        this.f188795b.D4(new a50.e.l0(this.f188796c, list));
        return Unit.INSTANCE;
    }
}
