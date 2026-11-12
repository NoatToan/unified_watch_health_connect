package cr;

import com.garmin.android.apps.connectmobile.activities.ui.ElectronicShiftingDataActivity;
import java.util.Comparator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p3.p1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.ui.ElectronicShiftingDataActivity$ElectronicShiftingDataScreen$1$2$1$4$1", f = "ElectronicShiftingDataActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List<to.m> f55280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1<List<to.m>> f55281b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(Integer.valueOf(((to.m) t14).f165817a), Integer.valueOf(((to.m) t7).f165817a));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Comparator f55282a;

        public b(Comparator comparator) {
            this.f55282a = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            int iCompare = this.f55282a.compare(t7, t14);
            return iCompare != 0 ? iCompare : r13.a.b(Integer.valueOf(((to.m) t7).f165818b), Integer.valueOf(((to.m) t14).f165818b));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(List<to.m> list, p1<List<to.m>> p1Var, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f55280a = list;
        this.f55281b = p1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f55280a, this.f55281b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        List<to.m> listN0 = h0.N0(this.f55280a, new b(new a()));
        ElectronicShiftingDataActivity.a aVar2 = ElectronicShiftingDataActivity.f29955b;
        this.f55281b.setValue(listN0);
        return Unit.INSTANCE;
    }
}
