package ho;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import gg1.o0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import o53.m0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import r53.b2;
import r53.k2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0015BW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lho/a0;", "Landroidx/lifecycle/u1;", "", "searchQuery", "", "isWheelChairMode", "", "Ljo/c;", "currentFilterData", "Ljo/d;", "availableFilters", "Lco/i;", "processFilterDataUseCase", "Lco/a;", "allowShowResultsUseCase", "Lbv/d;", "userPrefs", "Lao/d;", "repository", "<init>", "(Ljava/lang/String;ZLjava/util/List;Ljava/util/List;Lco/i;Lco/a;Lbv/d;Lao/d;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a0 extends u1 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f84568l = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f84569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<jo.c> f84570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<jo.d> f84571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final co.i f84572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final co.a f84573e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final bv.d f84574f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ao.d f84575g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f84576h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i53.f f84577i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p2 f84578j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b2 f84579k;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lho/y;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.history.presentation.filtering.FilterViewModel$uiState$1", f = "FilterViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<r53.j<? super y>, t13.d<? super Unit>, Object> {
        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return a0.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super y> jVar, t13.d<? super Unit> dVar) {
            return ((b) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            a0 a0Var = a0.this;
            r53.i iVarS = r53.s.s(new b0(a0Var.f84578j));
            e53.c.a aVar2 = e53.c.f63094b;
            r53.s.C(r53.s.D(r53.s.q(iVarS, m0.e(e53.e.f(300L, e53.f.MILLISECONDS))), new c0(a0Var, null)), v1.a(a0Var));
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0050  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0, types: [java.lang.Object, java.util.List<? extends jo.d>, java.util.List<jo.d>] */
    public a0(String str, boolean z14, List<? extends jo.c> list, List<? extends jo.d> list2, co.i iVar, co.a aVar, bv.d dVar, ao.d dVar2) {
        i53.f fVarX4;
        List list3;
        List list4 = list;
        list2.getClass();
        iVar.getClass();
        aVar.getClass();
        dVar.getClass();
        dVar2.getClass();
        this.f84569a = z14;
        this.f84570b = list4;
        this.f84571c = list2;
        this.f84572d = iVar;
        this.f84573e = aVar;
        this.f84574f = dVar;
        this.f84575g = dVar2;
        this.f84576h = dVar.g() == o0.METRIC;
        if (list4 != null) {
            if (list4.isEmpty()) {
                list3 = list4;
                list3 = null;
            }
            fVarX4 = (list3 == null || (fVarX4 = i53.a.j(list3)) == null) ? x4() : fVarX4;
        }
        i53.f fVar = fVarX4;
        this.f84577i = fVar;
        p2 p2VarA = q2.a(new y(fVar, false, false, null, null, false, str == null ? "" : str, 62, null));
        this.f84578j = p2VarA;
        this.f84579k = r53.s.K(new r53.v(new b(null), p2VarA), v1.a(this), k2.a.a(k2.f150703a, 2), new y(fVar, false, false, null, null, false, str == null ? "" : str, 62, null));
    }

    public final i53.f x4() {
        Object c1916a;
        Object c1917c;
        jo.c.f99697b.getClass();
        List<jo.d> list = this.f84571c;
        list.getClass();
        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            int i14 = jo.c.b.a.f99726a[((jo.d) it.next()).ordinal()];
            boolean z14 = this.f84576h;
            switch (i14) {
                case 1:
                    c1916a = new jo.c.a.C1916a(null, this.f84569a, 1, null);
                    continue;
                    arrayList.add(c1916a);
                    break;
                case 2:
                    c1916a = new jo.c.a.b(null, null, 3, null);
                    continue;
                    arrayList.add(c1916a);
                    break;
                case 3:
                    c1917c = new jo.c.a.C1917c(null, null, z14, null, null, 27, null);
                    break;
                case 4:
                    c1916a = new jo.c.a.e(null, null, null, null, 15, null);
                    continue;
                    arrayList.add(c1916a);
                    break;
                case 5:
                    c1917c = new jo.c.a.f(null, null, z14, null, null, 27, null);
                    break;
                case 6:
                    c1916a = new jo.c.a.d(null, 1, null);
                    continue;
                    arrayList.add(c1916a);
                    break;
                case 7:
                    c1916a = new jo.c.AbstractC1918c.a(null, 1, null);
                    continue;
                    arrayList.add(c1916a);
                    break;
                case 8:
                    c1916a = new jo.c.AbstractC1918c.b(null, 1, null);
                    continue;
                    arrayList.add(c1916a);
                    break;
                default:
                    u0.r();
                    return null;
            }
            c1916a = c1917c;
            arrayList.add(c1916a);
        }
        return i53.a.j(arrayList);
    }

    public final y y4(y yVar, jo.c cVar, int i14) {
        ArrayList arrayListD1 = h0.d1(yVar.f84690a);
        arrayListD1.set(i14, cVar);
        i53.f fVarJ = i53.a.j(arrayListD1);
        boolean z14 = false;
        if (fVarJ == null || !fVarJ.isEmpty()) {
            Iterator<E> it = fVarJ.iterator();
            while (it.hasNext()) {
                if (((jo.c) it.next()).getF99728d()) {
                    z14 = true;
                    break;
                }
            }
        }
        boolean z15 = z14;
        this.f84573e.getClass();
        return y.a(yVar, fVarJ, z15, co.a.a(fVarJ), null, null, false, null, 120);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lho/a0$a;", "", "<init>", "()V", "", "DEBOUNCE_TIME_MS", "J", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
