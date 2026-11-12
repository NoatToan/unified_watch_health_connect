package n70;

import java.util.List;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lj70/k$f;", "data", "", "Lo70/t;", "secondaryStats", "Lo70/u;", "<anonymous>", "(Lj70/k$f;Ljava/util/List;)Lo70/u;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetDashboardItemsUseCase$invoke$1$elements$1$16", f = "GetDashboardItemsUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class r0 extends v13.i implements e23.q<j70.k.f, List<? extends o70.t>, t13.d<? super o70.u>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ j70.k.f f124519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ List f124520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c0 f124521c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements e23.a<r53.i<? extends j70.k.c>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c0 f124522a;

        public a(c0 c0Var) {
            this.f124522a = c0Var;
        }

        @Override // e23.a
        public final r53.i<? extends j70.k.c> invoke() {
            return this.f124522a.f124078p;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(c0 c0Var, t13.d<? super r0> dVar) {
        super(3, dVar);
        this.f124521c = c0Var;
    }

    @Override // e23.q
    public final Object invoke(j70.k.f fVar, List<? extends o70.t> list, t13.d<? super o70.u> dVar) {
        r0 r0Var = new r0(this.f124521c, dVar);
        r0Var.f124519a = fVar;
        r0Var.f124520b = list;
        return r0Var.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        yz1.u uVar;
        yz1.d dVar;
        j70.k.f fVar = this.f124519a;
        List list = this.f124520b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
        String str = "GetDashboardItemsUseCase secondaryStats " + (fVar != null ? fVar.f97565a : null) + StringUtils.SPACE + list;
        com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
        com.garmin.android.apps.connectmobile.i2.a.a(a2Var, str);
        c0 c0Var = this.f124521c;
        List listA = c0Var.f124068f.a(list, (r53.o2) c0Var.f124082t.getValue(), (r53.o2) c0Var.f124087y.getValue(), new a(c0Var));
        if (fVar == null || (dVar = fVar.f97565a) == null || (uVar = dVar.f200298a) == null) {
            uVar = yz1.u.LOADING;
        }
        return new o70.u(listA, uVar == yz1.u.LOADING);
    }
}
