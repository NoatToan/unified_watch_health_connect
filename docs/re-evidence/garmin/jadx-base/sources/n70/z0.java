package n70;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lj70/k$f;", "data", "", "Lo70/i;", "essentialsStats", "Lo70/h;", "<anonymous>", "(Lj70/k$f;Ljava/util/List;)Lo70/h;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetDashboardItemsUseCase$invoke$1$elements$1$9", f = "GetDashboardItemsUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class z0 extends v13.i implements e23.q<j70.k.f, List<? extends o70.i>, t13.d<? super o70.h>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ j70.k.f f124795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ List f124796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c0 f124797c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements e23.a<r53.i<? extends j70.k.c>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c0 f124798a;

        public a(c0 c0Var) {
            this.f124798a = c0Var;
        }

        @Override // e23.a
        public final r53.i<? extends j70.k.c> invoke() {
            return this.f124798a.f124078p;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(c0 c0Var, t13.d<? super z0> dVar) {
        super(3, dVar);
        this.f124797c = c0Var;
    }

    @Override // e23.q
    public final Object invoke(j70.k.f fVar, List<? extends o70.i> list, t13.d<? super o70.h> dVar) {
        z0 z0Var = new z0(this.f124797c, dVar);
        z0Var.f124795a = fVar;
        z0Var.f124796b = list;
        return z0Var.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.util.ArrayList] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        ?? arrayList;
        yz1.u uVar;
        yz1.d dVar;
        r53.u1 u1Var;
        Object d2Var;
        j70.k.f fVar = this.f124795a;
        List<o70.i> list = this.f124796b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
        String str = "GetDashboardItemsUseCase essentialsStats " + (fVar != null ? fVar.f97565a : null) + StringUtils.SPACE + list;
        com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
        com.garmin.android.apps.connectmobile.i2.a.a(a2Var, str);
        c0 c0Var = this.f124797c;
        u1 u1Var2 = c0Var.f124071i;
        r53.o2 o2Var = (r53.o2) c0Var.f124082t.getValue();
        r53.o2 o2Var2 = (r53.o2) c0Var.f124087y.getValue();
        a aVar2 = new a(c0Var);
        o2Var.getClass();
        o2Var2.getClass();
        if (list != null) {
            arrayList = new ArrayList();
            for (o70.i iVar : list) {
                switch (u1.b.f124613a[iVar.ordinal()]) {
                    case 1:
                        u1Var = new r53.u1(o2Var, o2Var2, new w1(null));
                        d2Var = u1Var;
                        break;
                    case 2:
                        d2Var = new d2(o2Var);
                        break;
                    case 3:
                        u1Var = new r53.u1(o2Var, o2Var2, new z1(null));
                        d2Var = u1Var;
                        break;
                    case 4:
                        d2Var = r53.s.l(o2Var, o2Var2, aVar2.f124798a.f124078p, new a2(u1Var2, null));
                        break;
                    case 5:
                        d2Var = new e2(o2Var);
                        break;
                    case 6:
                        d2Var = new f2(o2Var);
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                        com.garmin.android.apps.connectmobile.i2.a.b(com.garmin.android.apps.connectmobile.a2.DASHBOARD, "GetEssentialsItemsUseCase", "Quick Stat Type " + iVar + " data not handled!");
                        d2Var = null;
                        break;
                }
                r70.s sVarB = m70.f.b(d2Var, iVar.a());
                if (sVarB != null) {
                    arrayList.add(sVarB);
                }
            }
        } else {
            arrayList = p13.j0.f134944a;
        }
        if (fVar == null || (dVar = fVar.f97565a) == null || (uVar = dVar.f200298a) == null) {
            uVar = yz1.u.LOADING;
        }
        return new o70.h(arrayList, uVar == yz1.u.LOADING);
    }
}
