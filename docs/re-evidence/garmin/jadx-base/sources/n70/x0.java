package n70;

import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lj70/k$e;", "challenges", "", "enabledSectionsCount", "Lj70/d;", "Lj70/e;", "<anonymous>", "(Lj70/k$e;I)Lj70/d;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetDashboardItemsUseCase$invoke$1$elements$1$7", f = "GetDashboardItemsUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class x0 extends v13.i implements e23.q<j70.k.e, Integer, t13.d<? super j70.d<j70.e>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ j70.k.e f124732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ int f124733b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements e23.a<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List<String> f124734a;

        public a(List<String> list) {
            this.f124734a = list;
        }

        @Override // e23.a
        public final Boolean invoke() {
            boolean z14 = true;
            List<String> list = this.f124734a;
            if (list == null || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((String) it.next()) == null) {
                        z14 = false;
                        break;
                    }
                }
            }
            return Boolean.valueOf(z14);
        }
    }

    public x0(t13.d<? super x0> dVar) {
        super(3, dVar);
    }

    @Override // e23.q
    public final Object invoke(j70.k.e eVar, Integer num, t13.d<? super j70.d<j70.e>> dVar) {
        int iIntValue = num.intValue();
        x0 x0Var = new x0(dVar);
        x0Var.f124732a = eVar;
        x0Var.f124733b = iIntValue;
        return x0Var.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        j70.k.e eVar = this.f124732a;
        int i14 = this.f124733b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        List listK = p13.x.k(eVar != null ? eVar.f97561b : null, eVar != null ? eVar.f97562c : null, eVar != null ? eVar.f97563d : null, eVar != null ? eVar.f97564e : null);
        return new j70.d(yz1.e.a(eVar != null ? eVar.f97560a : null, new a(listK)), new j70.e(i14, listK));
    }
}
