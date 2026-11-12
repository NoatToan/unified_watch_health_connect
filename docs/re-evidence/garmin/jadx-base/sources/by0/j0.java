package by0;

import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import i3.e5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lps/m;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.datastore.MultiDayActivityDataSource$polylines$result$1", f = "MultiDayActivityDataSource.kt", l = {219, 238}, m = "invokeSuspend", v = 2)
public final class j0 extends v13.i implements e23.p<o53.b0, t13.d<? super List<? extends ps.m>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f21890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ by0.a f21891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f21892d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lps/m;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.datastore.MultiDayActivityDataSource$polylines$result$1$batchTasks$1$1", f = "MultiDayActivityDataSource.kt", l = {225}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super List<? extends ps.m>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f21893a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f21894b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ by0.a f21895c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f21896d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f21897e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f21898f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(by0.a aVar, String str, int i14, int i15, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f21895c = aVar;
            this.f21896d = str;
            this.f21897e = i14;
            this.f21898f = i15;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f21895c, this.f21896d, this.f21897e, this.f21898f, dVar);
            aVar.f21894b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super List<? extends ps.m>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            o53.b0 b0Var = (o53.b0) this.f21894b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f21893a;
            if (i14 == 0) {
                o13.r.b(obj);
                int i15 = by0.a.f21686d;
                ey0.g0 g0VarP = this.f21895c.p();
                int i16 = this.f21897e * this.f21898f;
                this.f21894b = b0Var;
                this.f21893a = 1;
                g0VarP.getClass();
                obj = com.garmin.android.apps.connectmobile.f0.J(g0VarP, new ey0.q(g0VarP, this.f21896d, i16, 100, null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.MULTI_DAY_ACTIVITY;
                T t7 = ((v2.b) v2Var).f47386a;
                String strF = e5.f(t7, "GetEpicPolylines - Result Success - polylines:");
                i2.f36769a.getClass();
                i2.a.a(a2Var, strF);
                return (List) t7;
            }
            if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.MULTI_DAY_ACTIVITY;
            String strF2 = b71.i.f("GetEpicPolylines - Result Error:", v2Var);
            i2.f36769a.getClass();
            i2.a.e(a2Var2, strF2);
            return p13.j0.f134944a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(by0.a aVar, String str, t13.d<? super j0> dVar) {
        super(2, dVar);
        this.f21891c = aVar;
        this.f21892d = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        j0 j0Var = new j0(this.f21891c, this.f21892d, dVar);
        j0Var.f21890b = obj;
        return j0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super List<? extends ps.m>> dVar) {
        return ((j0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a6, code lost:
    
        if (r13 == r1) goto L37;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i14;
        o53.b0 b0Var = (o53.b0) this.f21890b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = this.f21889a;
        if (i15 == 0) {
            o13.r.b(obj);
            this.f21890b = b0Var;
            this.f21889a = 1;
            obj = this.f21891c.d(this.f21892d, this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i15 == 1) {
            o13.r.b(obj);
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return p13.y.s((Iterable) obj);
        List list = (List) obj;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            i14 = 0;
            while (it.hasNext()) {
                if (((cy0.n) it.next()).getHasPositionDetails() && (i14 = i14 + 1) < 0) {
                    p13.x.p();
                    throw null;
                }
            }
        } else {
            i14 = 0;
        }
        if (i14 == 0) {
            return p13.j0.f134944a;
        }
        int i16 = (i14 + 99) / 100;
        j23.l lVarO = j23.t.o(0, i16);
        ArrayList arrayList = new ArrayList(p13.y.r(lVarO, 10));
        Iterator<Integer> it3 = lVarO.iterator();
        while (((j23.k) it3).f96801c) {
            arrayList.add(ge1.b.j(b0Var, null, null, new a(this.f21891c, this.f21892d, ((p13.p0) it3).nextInt(), i16, null), 3));
        }
        this.f21890b = null;
        this.f21889a = 2;
        obj = g8.i.o(arrayList, this);
    }
}
