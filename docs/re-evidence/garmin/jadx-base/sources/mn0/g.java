package mn0;

import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import o13.q;
import o13.r;
import o53.b0;
import o53.i0;
import o53.j0;
import okhttp3.HttpUrl;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.c1;
import p13.h0;
import p13.k0;
import p13.t0;
import p13.y;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lin0/a;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.healthstatus.domain.GetHealthStatusDailyMetricValuesUseCase$invoke$2", f = "GetHealthStatusDailyMetricValuesUseCase.kt", l = {65, 66, 67}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements e23.p<b0, t13.d<? super v2<? extends List<? extends in0.a>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i0 f119707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j0 f119708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v2 f119709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public in0.h.b f119710d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f119711e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f119712f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f119713g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f119714h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f119715i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f119716j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ List<in0.a> f119717k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b63.o f119718l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b63.o f119719m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ in0.m f119720n;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lin0/h$b;", "<anonymous>", "(Lo53/b0;)Lin0/h$b;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.healthstatus.domain.GetHealthStatusDailyMetricValuesUseCase$invoke$2$extraDataDeferred$1", f = "GetHealthStatusDailyMetricValuesUseCase.kt", l = {60}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super in0.h.b>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f119721a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f119722b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d f119723c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ in0.m f119724d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ b63.o f119725e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d dVar, in0.m mVar, b63.o oVar, t13.d<? super a> dVar2) {
            super(2, dVar2);
            this.f119723c = dVar;
            this.f119724d = mVar;
            this.f119725e = oVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f119723c, this.f119724d, this.f119725e, dVar);
            aVar.f119722b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super in0.h.b> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object bVar;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f119721a;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    d dVar = this.f119723c;
                    in0.m mVar = this.f119724d;
                    b63.o oVar = this.f119725e;
                    int i15 = q.f128596b;
                    this.f119722b = null;
                    this.f119721a = 1;
                    obj = dVar.a(mVar, oVar, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                bVar = (in0.h.b) obj;
                int i16 = q.f128596b;
            } catch (Throwable th3) {
                int i17 = q.f128596b;
                bVar = new q.b(th3);
            }
            if (bVar instanceof q.b) {
                return null;
            }
            return bVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lin0/d;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.healthstatus.domain.GetHealthStatusDailyMetricValuesUseCase$invoke$2$healthStatusSummariesDeferred$1", f = "GetHealthStatusDailyMetricValuesUseCase.kt", l = {55}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super v2<? extends List<? extends in0.d>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f119726a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f119727b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b63.o f119728c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ b63.o f119729d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d dVar, b63.o oVar, b63.o oVar2, t13.d<? super b> dVar2) {
            super(2, dVar2);
            this.f119727b = dVar;
            this.f119728c = oVar;
            this.f119729d = oVar2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f119727b, this.f119728c, this.f119729d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends List<? extends in0.d>>> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f119726a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            kn0.a aVar2 = this.f119727b.f119699c;
            this.f119726a = 1;
            Object objB = aVar2.b(this.f119728c, this.f119729d, this);
            return objB == aVar ? aVar : objB;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lmm1/b;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.healthstatus.domain.GetHealthStatusDailyMetricValuesUseCase$invoke$2$sleepSummaryDeferred$1", f = "GetHealthStatusDailyMetricValuesUseCase.kt", l = {46}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<b0, t13.d<? super v2<? extends mm1.b>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f119730a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f119731b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b63.o f119732c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ b63.o f119733d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(d dVar, b63.o oVar, b63.o oVar2, t13.d<? super c> dVar2) {
            super(2, dVar2);
            this.f119731b = dVar;
            this.f119732c = oVar;
            this.f119733d = oVar2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f119731b, this.f119732c, this.f119733d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends mm1.b>> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f119730a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            nm1.a aVar2 = this.f119731b.f119697a;
            DateTime dateTimeK = vb.h.k(this.f119732c);
            DateTime dateTimeK2 = vb.h.k(this.f119733d);
            this.f119730a = 1;
            Object objG = aVar2.g(dateTimeK, dateTimeK2, this);
            return objG == aVar ? aVar : objG;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(boolean z14, boolean z15, boolean z16, d dVar, List<in0.a> list, b63.o oVar, b63.o oVar2, in0.m mVar, t13.d<? super g> dVar2) {
        super(2, dVar2);
        this.f119713g = z14;
        this.f119714h = z15;
        this.f119715i = z16;
        this.f119716j = dVar;
        this.f119717k = list;
        this.f119718l = oVar;
        this.f119719m = oVar2;
        this.f119720n = mVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        g gVar = new g(this.f119713g, this.f119714h, this.f119715i, this.f119716j, this.f119717k, this.f119718l, this.f119719m, this.f119720n, dVar);
        gVar.f119712f = obj;
        return gVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super v2<? extends List<? extends in0.a>>> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:126:0x0261  */
    /* JADX WARN: Code duplicated, block: B:128:0x0264  */
    /* JADX WARN: Code duplicated, block: B:131:0x0270 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:132:0x0272  */
    /* JADX WARN: Code duplicated, block: B:133:0x0276  */
    /* JADX WARN: Code duplicated, block: B:136:0x0281 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:137:0x0283  */
    /* JADX WARN: Code duplicated, block: B:138:0x0287  */
    /* JADX WARN: Code duplicated, block: B:142:0x028d  */
    /* JADX WARN: Code duplicated, block: B:144:0x0290 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:145:0x0292  */
    /* JADX WARN: Code duplicated, block: B:146:0x0297  */
    /* JADX WARN: Code duplicated, block: B:149:0x02af  */
    /* JADX WARN: Code duplicated, block: B:153:0x02bf A[LOOP:3: B:151:0x02b9->B:153:0x02bf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:157:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:161:0x02e7 A[LOOP:4: B:159:0x02e1->B:161:0x02e7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:165:0x031d  */
    /* JADX WARN: Code duplicated, block: B:167:0x0330  */
    /* JADX WARN: Code duplicated, block: B:169:0x0334  */
    /* JADX WARN: Code duplicated, block: B:172:0x0345  */
    /* JADX WARN: Code duplicated, block: B:174:0x0349  */
    /* JADX WARN: Code duplicated, block: B:178:0x035d  */
    /* JADX WARN: Code duplicated, block: B:179:0x0360 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:180:0x0362  */
    /* JADX WARN: Code duplicated, block: B:181:0x0365  */
    /* JADX WARN: Code duplicated, block: B:183:0x0369  */
    /* JADX WARN: Code duplicated, block: B:184:0x036c  */
    /* JADX WARN: Code duplicated, block: B:186:0x036f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0093  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:47:0x00db  */
    /* JADX WARN: Code duplicated, block: B:49:0x00df  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:94:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:97:0x01df  */
    /* JADX WARN: Code duplicated, block: B:98:0x01e2  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0084, code lost:
    
        if (r3 == r2) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a1, code lost:
    
        if (r3 == r2) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v13, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v13, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        i0 i0VarJ;
        j0 j0VarJ;
        j0 j0Var;
        v2 v2Var;
        Object objC;
        v2 v2Var2;
        in0.h.b bVarA;
        Object objAwait;
        v2 v2Var3;
        Object objAwait2;
        v2 v2Var4;
        v2.b bVar;
        ?? arrayList;
        v2.b bVar2;
        ?? arrayList2;
        Collection collection;
        boolean zIsEmpty;
        List<in0.a> list;
        Collection collection2;
        int iA;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        ArrayList arrayList3;
        int i14;
        HttpUrl httpUrl;
        in0.a aVar;
        i53.d<in0.m, Double> dVarG;
        in0.a aVar2;
        i53.d<in0.m, j23.g<Double>> dVarG2;
        List<in0.d> list2;
        in0.a aVar3;
        in0.m mVar;
        in0.h.a aVar4;
        mm1.b bVar3;
        List<mm1.c> listB;
        in0.a aVar5;
        Map linkedHashMap3;
        b0 b0Var = (b0) this.f119712f;
        u13.a aVar6 = u13.a.COROUTINE_SUSPENDED;
        int i15 = this.f119711e;
        b63.o oVar = this.f119718l;
        d dVar = this.f119716j;
        if (i15 == 0) {
            r.b(obj);
            boolean z14 = this.f119713g;
            b63.o oVar2 = this.f119719m;
            j0 j0VarJ2 = z14 ? ge1.b.j(b0Var, null, null, new c(dVar, oVar, oVar2, null), 3) : null;
            i0VarJ = this.f119714h ? ge1.b.j(b0Var, null, null, new b(dVar, oVar, oVar2, null), 3) : null;
            j0VarJ = this.f119715i ? ge1.b.j(b0Var, null, null, new a(dVar, this.f119720n, oVar2, null), 3) : null;
            if (j0VarJ2 != null) {
                this.f119712f = null;
                this.f119707a = i0VarJ;
                this.f119708b = j0VarJ;
                this.f119711e = 1;
                objC = j0VarJ2.C(this);
            } else {
                j0Var = j0VarJ;
                v2Var = null;
                if (j0Var != null) {
                    v2Var2 = v2Var;
                    bVarA = null;
                    if (i0VarJ != null) {
                        this.f119712f = null;
                        this.f119707a = null;
                        this.f119708b = null;
                        this.f119709c = v2Var2;
                        this.f119710d = bVarA;
                        this.f119711e = 3;
                        objAwait2 = i0VarJ.await(this);
                        if (objAwait2 != aVar6) {
                            v2Var4 = v2Var2;
                            v2Var3 = (v2) objAwait2;
                            v2Var2 = v2Var4;
                        }
                    } else {
                        v2Var3 = null;
                    }
                    if (v2Var2 instanceof v2.a) {
                        return new v2.a(((v2.a) v2Var2).f47383a, null, null, 6, null);
                    }
                    if (v2Var3 instanceof v2.a) {
                        return new v2.a(((v2.a) v2Var3).f47383a, null, null, 6, null);
                    }
                    if (v2Var2 instanceof v2.b) {
                        bVar = (v2.b) v2Var2;
                    } else {
                        bVar = null;
                    }
                    if (bVar != null) {
                        arrayList = 0;
                    } else {
                        arrayList = 0;
                    }
                    if (arrayList == 0) {
                        arrayList = p13.j0.f134944a;
                    }
                    if (v2Var3 instanceof v2.b) {
                        bVar2 = (v2.b) v2Var3;
                    } else {
                        bVar2 = null;
                    }
                    if (bVar2 != null) {
                        arrayList2 = 0;
                    } else {
                        arrayList2 = 0;
                    }
                    if (arrayList2 == 0) {
                        arrayList2 = p13.j0.f134944a;
                    }
                    collection = (Collection) arrayList;
                    zIsEmpty = collection.isEmpty();
                    list = this.f119717k;
                    if (zIsEmpty) {
                        if (list == null) {
                            collection = p13.j0.f134944a;
                        } else {
                            collection = list;
                        }
                    }
                    List list3 = (List) collection;
                    collection2 = (Collection) arrayList2;
                    if (collection2.isEmpty()) {
                        if (list == null) {
                            collection2 = p13.j0.f134944a;
                        } else {
                            collection2 = list;
                        }
                    }
                    List list4 = (List) collection2;
                    if (bVarA == null) {
                        bVarA = null;
                    }
                    if (bVarA == null) {
                        if (list != null) {
                            bVarA = in0.b.a(oVar, list);
                        } else {
                            bVarA = null;
                        }
                    }
                    dVar.getClass();
                    list3.getClass();
                    list4.getClass();
                    iA = t0.a(y.r(list3, 10));
                    if (iA < 16) {
                        iA = 16;
                    }
                    linkedHashMap = new LinkedHashMap(iA);
                    for (Object obj2 : list3) {
                        linkedHashMap.put(((in0.a) obj2).f94416a, obj2);
                    }
                    int iA2 = t0.a(y.r(list4, 10));
                    linkedHashMap2 = new LinkedHashMap(iA2 >= 16 ? iA2 : 16);
                    for (Object obj3 : list4) {
                        linkedHashMap2.put(((in0.a) obj3).f94416a, obj3);
                    }
                    LinkedHashSet linkedHashSetH = c1.h(linkedHashMap.keySet(), linkedHashMap2.keySet());
                    TreeSet<b63.o> treeSet = new TreeSet();
                    h0.W0(linkedHashSetH, treeSet);
                    arrayList3 = new ArrayList(y.r(treeSet, 10));
                    for (b63.o oVar3 : treeSet) {
                        oVar3.getClass();
                        aVar = (in0.a) linkedHashMap.get(oVar3);
                        if (aVar != null) {
                            k0 k0Var = k0.f134949a;
                            k0Var.getClass();
                            dVarG = i53.a.g(k0Var);
                        } else {
                            k0 k0Var2 = k0.f134949a;
                            k0Var2.getClass();
                            dVarG = i53.a.g(k0Var2);
                        }
                        aVar2 = (in0.a) linkedHashMap2.get(oVar3);
                        if (aVar2 != null) {
                            k0 k0Var3 = k0.f134949a;
                            k0Var3.getClass();
                            dVarG2 = i53.a.g(k0Var3);
                        } else {
                            k0 k0Var4 = k0.f134949a;
                            k0Var4.getClass();
                            dVarG2 = i53.a.g(k0Var4);
                        }
                        arrayList3.add(new in0.a(oVar3, dVarG, dVarG2, bVarA));
                    }
                    if (bVar != null) {
                        i14 = bVar.f47387b;
                    } else if (bVar2 != null) {
                        i14 = bVar2.f47387b;
                    } else {
                        i14 = 200;
                    }
                    if (bVar != null) {
                        httpUrl = bVar.f47388c;
                    } else {
                        httpUrl = null;
                    }
                    return new v2.b(arrayList3, i14, httpUrl, bVar != null ? bVar.f47389d : null);
                }
                this.f119712f = null;
                this.f119707a = i0VarJ;
                this.f119708b = null;
                this.f119709c = v2Var;
                this.f119711e = 2;
                objAwait = j0Var.await(this);
            }
            return aVar6;
        }
        if (i15 == 1) {
            j0VarJ = this.f119708b;
            i0 i0Var = this.f119707a;
            r.b(obj);
            i0VarJ = i0Var;
            objC = obj;
        } else {
            if (i15 == 2) {
                v2Var = this.f119709c;
                i0 i0Var2 = this.f119707a;
                r.b(obj);
                i0VarJ = i0Var2;
                objAwait = obj;
                in0.h.b bVar4 = (in0.h.b) objAwait;
                v2Var2 = v2Var;
                bVarA = bVar4;
                if (i0VarJ != null) {
                    this.f119712f = null;
                    this.f119707a = null;
                    this.f119708b = null;
                    this.f119709c = v2Var2;
                    this.f119710d = bVarA;
                    this.f119711e = 3;
                    objAwait2 = i0VarJ.await(this);
                    if (objAwait2 != aVar6) {
                        v2Var4 = v2Var2;
                    }
                    return aVar6;
                }
                v2Var3 = null;
                if (v2Var2 instanceof v2.a) {
                    return new v2.a(((v2.a) v2Var2).f47383a, null, null, 6, null);
                }
                if (v2Var3 instanceof v2.a) {
                    return new v2.a(((v2.a) v2Var3).f47383a, null, null, 6, null);
                }
                if (v2Var2 instanceof v2.b) {
                    bVar = (v2.b) v2Var2;
                } else {
                    bVar = null;
                }
                if (bVar != null || (bVar3 = (mm1.b) bVar.f47386a) == null || (listB = bVar3.b()) == null) {
                    arrayList = 0;
                } else {
                    dVar.getClass();
                    arrayList = new ArrayList();
                    for (mm1.c cVar : listB) {
                        LocalDate localDateA = mm1.d.a(cVar);
                        if (localDateA != null) {
                            b63.o oVarT = g22.k.t(localDateA);
                            mm1.c.a values = cVar.getValues();
                            if (values != null) {
                                linkedHashMap3 = new LinkedHashMap();
                                Double avgHeartRate = values.getAvgHeartRate();
                                if (avgHeartRate != null) {
                                }
                                Double avgOvernightHrv = values.getAvgOvernightHrv();
                                if (avgOvernightHrv != null) {
                                }
                                Double skinTempC = values.getSkinTempC();
                                if (skinTempC != null) {
                                }
                                Double skinTempF = values.getSkinTempF();
                                if (skinTempF != null) {
                                }
                                Double respiration = values.getRespiration();
                                if (respiration != null) {
                                }
                                Double spO2 = values.getSpO2();
                                if (spO2 != null) {
                                    linkedHashMap3.put(in0.m.PULSE_OX, Double.valueOf(spO2.doubleValue()));
                                }
                            } else {
                                linkedHashMap3 = null;
                            }
                            if (linkedHashMap3 == null) {
                                linkedHashMap3 = k0.f134949a;
                                linkedHashMap3.getClass();
                            }
                            aVar5 = new in0.a(oVarT, i53.a.g(linkedHashMap3), null, null, 12, null);
                        } else {
                            aVar5 = null;
                        }
                        if (aVar5 != null) {
                            arrayList.add(aVar5);
                        }
                    }
                }
                if (arrayList == 0) {
                    arrayList = p13.j0.f134944a;
                }
                if (v2Var3 instanceof v2.b) {
                    bVar2 = (v2.b) v2Var3;
                } else {
                    bVar2 = null;
                }
                if (bVar2 != null || (list2 = (List) bVar2.f47386a) == null) {
                    arrayList2 = 0;
                } else {
                    dVar.getClass();
                    arrayList2 = new ArrayList();
                    for (in0.d dVar2 : list2) {
                        dVar2.getClass();
                        String str = dVar2.f94427a;
                        LocalDate localDateW = str != null ? g22.k.w(str, "yyyy-MM-dd") : null;
                        if (localDateW != null) {
                            b63.o oVarT2 = g22.k.t(localDateW);
                            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                            List<in0.i> list5 = dVar2.f94431e;
                            if (list5 != null) {
                                Iterator it = list5.iterator();
                                while (it.hasNext()) {
                                    in0.h hVarE = on0.a.e((in0.i) it.next());
                                    if (hVarE != null && (mVar = hVarE.f94446a) != null && (aVar4 = hVarE.f94447b) != null) {
                                        linkedHashMap4.put(mVar, aVar4.f94451b.f94453a);
                                    }
                                }
                            }
                            Unit unit = Unit.INSTANCE;
                            aVar3 = new in0.a(oVarT2, null, i53.a.g(linkedHashMap4), null, 10, null);
                        } else {
                            aVar3 = null;
                        }
                        if (aVar3 != null) {
                            arrayList2.add(aVar3);
                        }
                    }
                }
                if (arrayList2 == 0) {
                    arrayList2 = p13.j0.f134944a;
                }
                collection = (Collection) arrayList;
                zIsEmpty = collection.isEmpty();
                list = this.f119717k;
                if (zIsEmpty) {
                    if (list == null) {
                        collection = p13.j0.f134944a;
                    } else {
                        collection = list;
                    }
                }
                List list6 = (List) collection;
                collection2 = (Collection) arrayList2;
                if (collection2.isEmpty()) {
                    if (list == null) {
                        collection2 = p13.j0.f134944a;
                    } else {
                        collection2 = list;
                    }
                }
                List list7 = (List) collection2;
                if (bVarA == null) {
                    bVarA = null;
                }
                if (bVarA == null) {
                    if (list != null) {
                        bVarA = in0.b.a(oVar, list);
                    } else {
                        bVarA = null;
                    }
                }
                dVar.getClass();
                list6.getClass();
                list7.getClass();
                iA = t0.a(y.r(list6, 10));
                if (iA < 16) {
                    iA = 16;
                }
                linkedHashMap = new LinkedHashMap(iA);
                while (r5.hasNext()) {
                    linkedHashMap.put(((in0.a) obj2).f94416a, obj2);
                }
                int iA3 = t0.a(y.r(list7, 10));
                linkedHashMap2 = new LinkedHashMap(iA3 >= 16 ? iA3 : 16);
                while (r6.hasNext()) {
                    linkedHashMap2.put(((in0.a) obj3).f94416a, obj3);
                }
                LinkedHashSet linkedHashSetH2 = c1.h(linkedHashMap.keySet(), linkedHashMap2.keySet());
                TreeSet<b63.o> treeSet2 = new TreeSet();
                h0.W0(linkedHashSetH2, treeSet2);
                arrayList3 = new ArrayList(y.r(treeSet2, 10));
                while (r2.hasNext()) {
                    oVar3.getClass();
                    aVar = (in0.a) linkedHashMap.get(oVar3);
                    if (aVar != null || (dVarG = aVar.f94417b) == null) {
                        k0 k0Var5 = k0.f134949a;
                        k0Var5.getClass();
                        dVarG = i53.a.g(k0Var5);
                    }
                    aVar2 = (in0.a) linkedHashMap2.get(oVar3);
                    if (aVar2 != null || (dVarG2 = aVar2.f94418c) == null) {
                        k0 k0Var6 = k0.f134949a;
                        k0Var6.getClass();
                        dVarG2 = i53.a.g(k0Var6);
                    }
                    arrayList3.add(new in0.a(oVar3, dVarG, dVarG2, bVarA));
                }
                if (bVar != null) {
                    i14 = bVar.f47387b;
                } else if (bVar2 != null) {
                    i14 = bVar2.f47387b;
                } else {
                    i14 = 200;
                }
                if (bVar != null) {
                    httpUrl = bVar.f47388c;
                } else {
                    httpUrl = null;
                }
                return new v2.b(arrayList3, i14, httpUrl, bVar != null ? bVar.f47389d : null);
            }
            if (i15 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bVarA = this.f119710d;
            v2Var4 = this.f119709c;
            r.b(obj);
            objAwait2 = obj;
        }
        v2Var3 = (v2) objAwait2;
        v2Var2 = v2Var4;
        if (v2Var2 instanceof v2.a) {
            return new v2.a(((v2.a) v2Var2).f47383a, null, null, 6, null);
        }
        if (v2Var3 instanceof v2.a) {
            return new v2.a(((v2.a) v2Var3).f47383a, null, null, 6, null);
        }
        if (v2Var2 instanceof v2.b) {
            bVar = (v2.b) v2Var2;
        } else {
            bVar = null;
        }
        if (bVar != null) {
            arrayList = 0;
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = p13.j0.f134944a;
        }
        if (v2Var3 instanceof v2.b) {
            bVar2 = (v2.b) v2Var3;
        } else {
            bVar2 = null;
        }
        if (bVar2 != null) {
            arrayList2 = 0;
        } else {
            arrayList2 = 0;
        }
        if (arrayList2 == 0) {
            arrayList2 = p13.j0.f134944a;
        }
        collection = (Collection) arrayList;
        zIsEmpty = collection.isEmpty();
        list = this.f119717k;
        if (zIsEmpty) {
            if (list == null) {
                collection = p13.j0.f134944a;
            } else {
                collection = list;
            }
        }
        List list8 = (List) collection;
        collection2 = (Collection) arrayList2;
        if (collection2.isEmpty()) {
            if (list == null) {
                collection2 = p13.j0.f134944a;
            } else {
                collection2 = list;
            }
        }
        List list9 = (List) collection2;
        if (bVarA == null) {
            bVarA = null;
        }
        if (bVarA == null) {
            if (list != null) {
                bVarA = in0.b.a(oVar, list);
            } else {
                bVarA = null;
            }
        }
        dVar.getClass();
        list8.getClass();
        list9.getClass();
        iA = t0.a(y.r(list8, 10));
        if (iA < 16) {
            iA = 16;
        }
        linkedHashMap = new LinkedHashMap(iA);
        while (r5.hasNext()) {
            linkedHashMap.put(((in0.a) obj2).f94416a, obj2);
        }
        int iA4 = t0.a(y.r(list9, 10));
        linkedHashMap2 = new LinkedHashMap(iA4 >= 16 ? iA4 : 16);
        while (r6.hasNext()) {
            linkedHashMap2.put(((in0.a) obj3).f94416a, obj3);
        }
        LinkedHashSet linkedHashSetH3 = c1.h(linkedHashMap.keySet(), linkedHashMap2.keySet());
        TreeSet<b63.o> treeSet3 = new TreeSet();
        h0.W0(linkedHashSetH3, treeSet3);
        arrayList3 = new ArrayList(y.r(treeSet3, 10));
        while (r2.hasNext()) {
            oVar3.getClass();
            aVar = (in0.a) linkedHashMap.get(oVar3);
            if (aVar != null) {
                k0 k0Var7 = k0.f134949a;
                k0Var7.getClass();
                dVarG = i53.a.g(k0Var7);
            } else {
                k0 k0Var8 = k0.f134949a;
                k0Var8.getClass();
                dVarG = i53.a.g(k0Var8);
            }
            aVar2 = (in0.a) linkedHashMap2.get(oVar3);
            if (aVar2 != null) {
                k0 k0Var9 = k0.f134949a;
                k0Var9.getClass();
                dVarG2 = i53.a.g(k0Var9);
            } else {
                k0 k0Var10 = k0.f134949a;
                k0Var10.getClass();
                dVarG2 = i53.a.g(k0Var10);
            }
            arrayList3.add(new in0.a(oVar3, dVarG, dVarG2, bVarA));
        }
        if (bVar != null) {
            i14 = bVar.f47387b;
        } else if (bVar2 != null) {
            i14 = bVar2.f47387b;
        } else {
            i14 = 200;
        }
        if (bVar != null) {
            httpUrl = bVar.f47388c;
        } else {
            httpUrl = null;
        }
        return new v2.b(arrayList3, i14, httpUrl, bVar != null ? bVar.f47389d : null);
        v2 v2Var5 = (v2) objC;
        j0Var = j0VarJ;
        v2Var = v2Var5;
        if (j0Var != null) {
            v2Var2 = v2Var;
            bVarA = null;
            if (i0VarJ != null) {
                this.f119712f = null;
                this.f119707a = null;
                this.f119708b = null;
                this.f119709c = v2Var2;
                this.f119710d = bVarA;
                this.f119711e = 3;
                objAwait2 = i0VarJ.await(this);
                if (objAwait2 != aVar6) {
                    v2Var4 = v2Var2;
                    v2Var3 = (v2) objAwait2;
                    v2Var2 = v2Var4;
                }
            } else {
                v2Var3 = null;
            }
            if (v2Var2 instanceof v2.a) {
                return new v2.a(((v2.a) v2Var2).f47383a, null, null, 6, null);
            }
            if (v2Var3 instanceof v2.a) {
                return new v2.a(((v2.a) v2Var3).f47383a, null, null, 6, null);
            }
            if (v2Var2 instanceof v2.b) {
                bVar = (v2.b) v2Var2;
            } else {
                bVar = null;
            }
            if (bVar != null) {
                arrayList = 0;
            } else {
                arrayList = 0;
            }
            if (arrayList == 0) {
                arrayList = p13.j0.f134944a;
            }
            if (v2Var3 instanceof v2.b) {
                bVar2 = (v2.b) v2Var3;
            } else {
                bVar2 = null;
            }
            if (bVar2 != null) {
                arrayList2 = 0;
            } else {
                arrayList2 = 0;
            }
            if (arrayList2 == 0) {
                arrayList2 = p13.j0.f134944a;
            }
            collection = (Collection) arrayList;
            zIsEmpty = collection.isEmpty();
            list = this.f119717k;
            if (zIsEmpty) {
                if (list == null) {
                    collection = p13.j0.f134944a;
                } else {
                    collection = list;
                }
            }
            List list10 = (List) collection;
            collection2 = (Collection) arrayList2;
            if (collection2.isEmpty()) {
                if (list == null) {
                    collection2 = p13.j0.f134944a;
                } else {
                    collection2 = list;
                }
            }
            List list11 = (List) collection2;
            if (bVarA == null) {
                bVarA = null;
            }
            if (bVarA == null) {
                if (list != null) {
                    bVarA = in0.b.a(oVar, list);
                } else {
                    bVarA = null;
                }
            }
            dVar.getClass();
            list10.getClass();
            list11.getClass();
            iA = t0.a(y.r(list10, 10));
            if (iA < 16) {
                iA = 16;
            }
            linkedHashMap = new LinkedHashMap(iA);
            while (r5.hasNext()) {
                linkedHashMap.put(((in0.a) obj2).f94416a, obj2);
            }
            int iA5 = t0.a(y.r(list11, 10));
            linkedHashMap2 = new LinkedHashMap(iA5 >= 16 ? iA5 : 16);
            while (r6.hasNext()) {
                linkedHashMap2.put(((in0.a) obj3).f94416a, obj3);
            }
            LinkedHashSet linkedHashSetH4 = c1.h(linkedHashMap.keySet(), linkedHashMap2.keySet());
            TreeSet<b63.o> treeSet4 = new TreeSet();
            h0.W0(linkedHashSetH4, treeSet4);
            arrayList3 = new ArrayList(y.r(treeSet4, 10));
            while (r2.hasNext()) {
                oVar3.getClass();
                aVar = (in0.a) linkedHashMap.get(oVar3);
                if (aVar != null) {
                    k0 k0Var11 = k0.f134949a;
                    k0Var11.getClass();
                    dVarG = i53.a.g(k0Var11);
                } else {
                    k0 k0Var12 = k0.f134949a;
                    k0Var12.getClass();
                    dVarG = i53.a.g(k0Var12);
                }
                aVar2 = (in0.a) linkedHashMap2.get(oVar3);
                if (aVar2 != null) {
                    k0 k0Var13 = k0.f134949a;
                    k0Var13.getClass();
                    dVarG2 = i53.a.g(k0Var13);
                } else {
                    k0 k0Var14 = k0.f134949a;
                    k0Var14.getClass();
                    dVarG2 = i53.a.g(k0Var14);
                }
                arrayList3.add(new in0.a(oVar3, dVarG, dVarG2, bVarA));
            }
            if (bVar != null) {
                i14 = bVar.f47387b;
            } else if (bVar2 != null) {
                i14 = bVar2.f47387b;
            } else {
                i14 = 200;
            }
            if (bVar != null) {
                httpUrl = bVar.f47388c;
            } else {
                httpUrl = null;
            }
            return new v2.b(arrayList3, i14, httpUrl, bVar != null ? bVar.f47389d : null);
        }
        this.f119712f = null;
        this.f119707a = i0VarJ;
        this.f119708b = null;
        this.f119709c = v2Var;
        this.f119711e = 2;
        objAwait = j0Var.await(this);
        return aVar6;
    }
}
