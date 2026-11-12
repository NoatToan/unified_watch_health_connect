package n70;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lj70/k$f;", "commonStats", "", "Lo70/f;", "sections", "Lo13/p;", "", "Lo70/y;", "<anonymous>", "(Lj70/k$f;Ljava/util/Set;)Lo13/p;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetDashboardItemsUseCase$invoke$1$elements$1$5", f = "GetDashboardItemsUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class v0 extends v13.i implements e23.q<j70.k.f, Set<? extends o70.f>, t13.d<? super o13.p<? extends List<? extends o70.y>, ? extends j70.k.f>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ j70.k.f f124675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Set f124676b;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f124677a;

        static {
            int[] iArr = new int[o70.y.values().length];
            try {
                iArr[o70.y.SLEEP_COACH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f124677a = iArr;
        }
    }

    public v0(t13.d<? super v0> dVar) {
        super(3, dVar);
    }

    @Override // e23.q
    public final Object invoke(j70.k.f fVar, Set<? extends o70.f> set, t13.d<? super o13.p<? extends List<? extends o70.y>, ? extends j70.k.f>> dVar) {
        v0 v0Var = new v0(dVar);
        v0Var.f124675a = fVar;
        v0Var.f124676b = set;
        return v0Var.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        j70.k.f fVar = this.f124675a;
        Set set = this.f124676b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        w13.c cVar = o70.y.f130120f;
        ArrayList arrayListK = n23.j.k(cVar);
        p13.c.b bVar = new p13.c.b();
        while (bVar.hasNext()) {
            Object next = bVar.next();
            if (a.f124677a[((o70.y) next).ordinal()] == 1 ? set.contains(o70.f.SLEEP_COACH) : true) {
                arrayListK.add(next);
            }
        }
        return new o13.p(arrayListK, fVar);
    }
}
