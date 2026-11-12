package ok0;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import c80.u;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import jk0.x;
import lc.u0;
import o53.b0;
import o53.c2;
import o53.j0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.t0;
import p13.y;
import r53.o2;
import r53.p2;
import r53.q2;
import yc.l2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u000e\u000f\u0010B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lok0/t;", "Landroidx/lifecycle/u1;", "Lok0/n;", "Lkk0/b;", "gearRepository", "", "activityId", "Lb63/o;", "onOrBeforeLocalDate", "", "Luk0/a;", "initialSelectedGears", "<init>", "(Lkk0/b;JLb63/o;Ljava/util/List;)V", "a", "c", "b", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t extends u1 implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kk0.b f132546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f132547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b63.o f132548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<uk0.a> f132549d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p2 f132550e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p2 f132551f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i53.e<String> f132552g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ReentrantLock f132553h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c2 f132554i;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lok0/t$b;", "", "", "uuid", "name", "Li53/e;", "gearIds", "", "hasPartiallyAvailableGear", "<init>", "(Ljava/lang/String;Ljava/lang/String;Li53/e;Z)V", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f132555a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f132556b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final i53.e<String> f132557c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f132558d;

        public b(String str, String str2, i53.e<String> eVar, boolean z14) {
            str.getClass();
            str2.getClass();
            eVar.getClass();
            this.f132555a = str;
            this.f132556b = str2;
            this.f132557c = eVar;
            this.f132558d = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f132555a.equals(bVar.f132555a) && this.f132556b.equals(bVar.f132556b) && this.f132557c.equals(bVar.f132557c) && this.f132558d == bVar.f132558d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f132558d) + ((this.f132557c.hashCode() + wr.g.j(this.f132555a.hashCode() * 31, 31, this.f132556b)) * 31);
        }

        public final String toString() {
            StringBuilder sbI = p6.b.i("ManageActivityGearCollection(uuid=", this.f132555a, ", name=", this.f132556b, ", gearIds=");
            sbI.append(this.f132557c);
            sbI.append(", hasPartiallyAvailableGear=");
            sbI.append(this.f132558d);
            sbI.append(")");
            return sbI.toString();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.activity.ManageActivityGearViewModel$loadAll$1$2", f = "ManageActivityGearViewModel.kt", l = {151, SyslogConstants.LOG_LOCAL3}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public j0 f132568a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public v2 f132569b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f132570c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f132571d;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Ljk0/l;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.activity.ManageActivityGearViewModel$loadAll$1$2$collectionsDeferred$1", f = "ManageActivityGearViewModel.kt", l = {148}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<b0, t13.d<? super v2<? extends List<? extends jk0.l>>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f132573a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f132574b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(t tVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f132574b = tVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f132574b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super v2<? extends List<? extends jk0.l>>> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f132573a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        o13.r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                t tVar = this.f132574b;
                kk0.b bVar = tVar.f132546a;
                b63.o oVar = tVar.f132548c;
                this.f132573a = 1;
                Object objT = bVar.T(oVar, this);
                return objT == aVar ? aVar : objT;
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Ljk0/r;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.activity.ManageActivityGearViewModel$loadAll$1$2$gearDeferred$1", f = "ManageActivityGearViewModel.kt", l = {145}, m = "invokeSuspend", v = 2)
        public static final class b extends v13.i implements e23.p<b0, t13.d<? super v2<? extends List<? extends jk0.r>>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f132575a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f132576b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(t tVar, t13.d<? super b> dVar) {
                super(2, dVar);
                this.f132576b = tVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new b(this.f132576b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super v2<? extends List<? extends jk0.r>>> dVar) {
                return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f132575a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        o13.r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                t tVar = this.f132576b;
                kk0.b bVar = tVar.f132546a;
                b63.o oVar = tVar.f132548c;
                this.f132575a = 1;
                Object objV = bVar.v(oVar, this);
                return objV == aVar ? aVar : objV;
            }
        }

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            d dVar2 = t.this.new d(dVar);
            dVar2.f132571d = obj;
            return dVar2;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:95:0x0249  */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x005f, code lost:
        
            if (r1 == r2) goto L16;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            j0 j0VarJ;
            Object objC;
            v2 v2Var;
            Object objAwait;
            i53.d<u, i53.c<uk0.a>> dVarG;
            Set setG1;
            b bVar;
            Object value;
            c cVar;
            List list;
            b0 b0Var = (b0) this.f132571d;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f132570c;
            t tVar = t.this;
            i53.c<b> cVarE = null;
            if (i14 == 0) {
                o13.r.b(obj);
                j0 j0VarJ2 = ge1.b.j(b0Var, null, null, new b(tVar, null), 3);
                j0VarJ = ge1.b.j(b0Var, null, null, new a(tVar, null), 3);
                this.f132571d = b0Var;
                this.f132568a = j0VarJ;
                this.f132570c = 1;
                objC = j0VarJ2.C(this);
                if (objC != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                j0 j0Var = this.f132568a;
                o13.r.b(obj);
                j0VarJ = j0Var;
                objC = obj;
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                v2 v2Var2 = this.f132569b;
                o13.r.b(obj);
                v2Var = v2Var2;
                objAwait = obj;
            }
            v2 v2Var3 = (v2) objAwait;
            if (v2Var instanceof v2.a) {
                a2 a2Var = a2.GEAR;
                String strN = fb1.c.n("Error loading activity gear: ", ((v2.a) v2Var).f47385c);
                i2.f36769a.getClass();
                i2.a.p(a2Var, "ManageActivityGearViewModel", strN);
                dVarG = null;
            } else {
                if (!(v2Var instanceof v2.b)) {
                    u0.r();
                    return null;
                }
                Iterable<jk0.r> iterable = (Iterable) ((v2.b) v2Var).f47386a;
                ArrayList arrayList = new ArrayList(y.r(iterable, 10));
                for (jk0.r rVar : iterable) {
                    rVar.getClass();
                    String str = rVar.f99313a;
                    u uVar = rVar.f99315c;
                    String str2 = rVar.f99317e;
                    String str3 = rVar.f99318f;
                    if (str3 == null) {
                        str3 = "";
                    }
                    arrayList.add(new uk0.a(str, uVar, str2, str3, rVar.f99319g));
                }
                ArrayList arrayListC0 = h0.C0(arrayList, tVar.f132549d);
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayListC0) {
                    if (hashSet.add(((uk0.a) obj2).f171795a)) {
                        arrayList2.add(obj2);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj3 : arrayList2) {
                    u uVar2 = ((uk0.a) obj3).f171796b;
                    Object arrayList3 = linkedHashMap.get(uVar2);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        linkedHashMap.put(uVar2, arrayList3);
                    }
                    ((List) arrayList3).add(obj3);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(t0.a(linkedHashMap.size()));
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    linkedHashMap2.put(entry.getKey(), i53.a.e((Iterable) entry.getValue()));
                }
                dVarG = i53.a.g(linkedHashMap2);
            }
            v2.b bVar2 = v2Var instanceof v2.b ? (v2.b) v2Var : null;
            if (bVar2 == null || (list = (List) bVar2.f47386a) == null) {
                setG1 = null;
            } else {
                ArrayList arrayList4 = new ArrayList(y.r(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList4.add(((jk0.r) it.next()).f99313a);
                }
                setG1 = h0.g1(arrayList4);
            }
            if (v2Var3 instanceof v2.a) {
                a2 a2Var2 = a2.GEAR;
                String strN2 = fb1.c.n("Error loading activity gear collections: ", ((v2.a) v2Var3).f47385c);
                i2.f36769a.getClass();
                i2.a.p(a2Var2, "ManageActivityGearViewModel", strN2);
            } else {
                if (!(v2Var3 instanceof v2.b)) {
                    u0.r();
                    return null;
                }
                if (setG1 != null) {
                    Iterable<jk0.l> iterable2 = (Iterable) ((v2.b) v2Var3).f47386a;
                    ArrayList arrayList5 = new ArrayList();
                    for (jk0.l lVar : iterable2) {
                        String str4 = lVar.f99282c;
                        if (str4 != null) {
                            List list2 = lVar.f99286g;
                            if (list2 == null) {
                                list2 = p13.j0.f134944a;
                            }
                            ArrayList arrayList6 = new ArrayList();
                            for (Object obj4 : list2) {
                                if (setG1.contains(((jk0.s) obj4).f99322a)) {
                                    arrayList6.add(obj4);
                                }
                            }
                            ArrayList arrayList7 = new ArrayList(y.r(arrayList6, 10));
                            Iterator it3 = arrayList6.iterator();
                            while (it3.hasNext()) {
                                arrayList7.add(og2.k.L((jk0.s) it3.next()));
                            }
                            HashSet hashSet2 = new HashSet();
                            ArrayList arrayList8 = new ArrayList();
                            for (Object obj5 : arrayList7) {
                                if (hashSet2.add(((uk0.a) obj5).f171795a)) {
                                    arrayList8.add(obj5);
                                }
                            }
                            i53.c cVarE2 = i53.a.e(arrayList8);
                            if (cVarE2.isEmpty()) {
                                bVar = null;
                            } else {
                                String str5 = lVar.f99280a;
                                ArrayList arrayList9 = new ArrayList(y.r(cVarE2, 10));
                                Iterator<E> it4 = cVarE2.iterator();
                                while (it4.hasNext()) {
                                    arrayList9.add(((uk0.a) it4.next()).f171795a);
                                }
                                bVar = new b(str4, str5, i53.a.h(arrayList9), cVarE2.size() < list2.size());
                            }
                        } else {
                            bVar = null;
                        }
                        if (bVar != null) {
                            arrayList5.add(bVar);
                        }
                    }
                    cVarE = i53.a.e(arrayList5);
                } else {
                    cVarE = null;
                }
            }
            boolean z14 = dVarG != null;
            boolean z15 = cVarE != null;
            boolean z16 = (z14 && z15) ? false : true;
            p2 p2Var = tVar.f132550e;
            do {
                value = p2Var.getValue();
                cVar = (c) value;
            } while (!p2Var.b(value, c.a(cVar, false, false, z14 && z15, z16, false, dVarG == null ? cVar.f132564f : dVarG, cVarE == null ? cVar.f132565g : cVarE, null, null, 402)));
            return Unit.INSTANCE;
            v2Var = (v2) objC;
            this.f132571d = b0Var;
            this.f132568a = null;
            this.f132569b = v2Var;
            this.f132570c = 2;
            objAwait = j0VarJ.await(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.activity.ManageActivityGearViewModel$saveSelection$1$2", f = "ManageActivityGearViewModel.kt", l = {110, 112, 125}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f132577a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f132578b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i53.e<String> f132579c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ t f132580d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(i53.e<String> eVar, t tVar, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f132579c = eVar;
            this.f132580d = tVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            e eVar = new e(this.f132579c, this.f132580d, dVar);
            eVar.f132578b = obj;
            return eVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
        
            if (r13 == r1) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
        
            if (r13 == r1) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00a8, code lost:
        
            if (o53.m0.c(r7, r12) == r1) goto L32;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            v2 v2Var;
            Object value;
            Object value2;
            b0 b0Var = (b0) this.f132578b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f132577a;
            t tVar = this.f132580d;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    v2Var = (v2) obj;
                } else if (i14 == 2) {
                    o13.r.b(obj);
                    v2Var = (v2) obj;
                } else {
                    if (i14 != 3) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                p2 p2Var = tVar.f132550e;
                do {
                    value2 = p2Var.getValue();
                } while (!p2Var.b(value2, c.a((c) value2, false, false, false, false, false, null, null, this.f132579c, null, 383)));
                return Unit.INSTANCE;
            }
            o13.r.b(obj);
            i53.e<String> eVar = this.f132579c;
            if (eVar.isEmpty()) {
                kk0.b bVar = tVar.f132546a;
                long j8 = tVar.f132547b;
                this.f132578b = b0Var;
                this.f132577a = 1;
                obj = bVar.B(j8, this);
            } else {
                kk0.b bVar2 = tVar.f132546a;
                long j14 = tVar.f132547b;
                List listB1 = h0.b1(eVar);
                this.f132578b = b0Var;
                this.f132577a = 2;
                obj = bVar2.m(j14, listB1, this);
            }
            return aVar;
            if (v2Var instanceof v2.a) {
                a2 a2Var = a2.GEAR;
                String strN = fb1.c.n("Error saving activity gear selection: ", ((v2.a) v2Var).f47385c);
                i2.f36769a.getClass();
                i2.a.p(a2Var, "ManageActivityGearViewModel", strN);
                p2 p2Var2 = tVar.f132550e;
                do {
                    value = p2Var2.getValue();
                } while (!p2Var2.b(value, c.a((c) value, false, false, false, false, true, null, null, null, null, 493)));
            } else {
                if (!(v2Var instanceof v2.b)) {
                    u0.r();
                    return null;
                }
                e53.c.a aVar2 = e53.c.f63094b;
                long jE = e53.e.e(1, e53.f.SECONDS);
                this.f132578b = null;
                this.f132577a = 3;
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public t(kk0.b bVar, long j8, b63.o oVar, List<uk0.a> list) {
        bVar.getClass();
        oVar.getClass();
        list.getClass();
        this.f132546a = bVar;
        this.f132547b = j8;
        this.f132548c = oVar;
        this.f132549d = list;
        p2 p2VarA = q2.a(new c(false, false, false, false, false, null, null, null, null, 511, null));
        this.f132550e = p2VarA;
        this.f132551f = p2VarA;
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((uk0.a) it.next()).f171795a);
        }
        this.f132552g = i53.a.h(arrayList);
        this.f132553h = new ReentrantLock();
        d();
    }

    @Override // ok0.n
    public final void a4(i53.e<String> eVar) {
        Object value;
        eVar.getClass();
        ReentrantLock reentrantLock = this.f132553h;
        reentrantLock.lock();
        try {
            c2 c2Var = this.f132554i;
            if (c2Var == null || !c2Var.isActive()) {
                p2 p2Var = this.f132550e;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, c.a((c) value, false, true, false, false, false, null, null, null, null, 509)));
                this.f132554i = ge1.b.T(v1.a(this), null, null, new e(eVar, this, null), 3);
                Unit unit = Unit.INSTANCE;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // ok0.n
    public final void d() {
        Object value;
        ReentrantLock reentrantLock = this.f132553h;
        reentrantLock.lock();
        try {
            c2 c2Var = this.f132554i;
            if (c2Var == null || !c2Var.isActive()) {
                p2 p2Var = this.f132550e;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, c.a((c) value, true, false, false, false, false, null, null, null, null, 510)));
                this.f132554i = ge1.b.T(v1.a(this), null, null, new d(null), 3);
                Unit unit = Unit.INSTANCE;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // ok0.n
    public final o2<c> getUiState() {
        return this.f132551f;
    }

    @Override // ok0.n
    public final void j() {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f132550e;
            value = p2Var.getValue();
        } while (!p2Var.b(value, c.a((c) value, false, false, false, false, false, null, null, null, null, 255)));
    }

    @Override // ok0.n
    public final i53.e<String> q() {
        return this.f132552g;
    }

    @Override // ok0.n
    public final void u1() {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f132550e;
            value = p2Var.getValue();
        } while (!p2Var.b(value, c.a((c) value, false, false, false, false, false, null, null, null, null, 495)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lok0/t$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\u001a\b\u0002\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\b\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lok0/t$c;", "", "", "isFetching", "isSaving", "hasFetchedSuccessfully", "showFetchingError", "showSavingError", "Li53/d;", "Lc80/u;", "Li53/c;", "Luk0/a;", "groupedGearList", "Lok0/t$b;", "gearCollections", "Li53/e;", "", "savedIdsResult", "Ljk0/x;", "newlyCreatedGear", "<init>", "(ZZZZZLi53/d;Li53/c;Li53/e;Ljk0/x;)V", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f132559a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f132560b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f132561c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f132562d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f132563e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final i53.d<u, i53.c<uk0.a>> f132564f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final i53.c<b> f132565g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final i53.e<String> f132566h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final x f132567i;

        public c(boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, i53.d dVar, i53.c cVar, i53.e eVar, x xVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, (i14 & 4) != 0 ? false : z16, (i14 & 8) != 0 ? false : z17, (i14 & 16) != 0 ? false : z18, (i14 & 32) != 0 ? i53.a.c() : dVar, (i14 & 64) != 0 ? j53.l.b() : cVar, (i14 & 128) != 0 ? null : eVar, (i14 & 256) != 0 ? null : xVar);
        }

        public static c a(c cVar, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, i53.d dVar, i53.c cVar2, i53.e eVar, x xVar, int i14) {
            if ((i14 & 1) != 0) {
                z14 = cVar.f132559a;
            }
            boolean z19 = z14;
            if ((i14 & 2) != 0) {
                z15 = cVar.f132560b;
            }
            boolean z24 = z15;
            if ((i14 & 4) != 0) {
                z16 = cVar.f132561c;
            }
            boolean z25 = z16;
            if ((i14 & 8) != 0) {
                z17 = cVar.f132562d;
            }
            boolean z26 = z17;
            if ((i14 & 16) != 0) {
                z18 = cVar.f132563e;
            }
            boolean z27 = z18;
            i53.d dVar2 = (i14 & 32) != 0 ? cVar.f132564f : dVar;
            i53.c cVar3 = (i14 & 64) != 0 ? cVar.f132565g : cVar2;
            i53.e eVar2 = (i14 & 128) != 0 ? cVar.f132566h : eVar;
            x xVar2 = (i14 & 256) != 0 ? cVar.f132567i : xVar;
            cVar.getClass();
            dVar2.getClass();
            cVar3.getClass();
            return new c(z19, z24, z25, z26, z27, dVar2, cVar3, eVar2, xVar2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f132559a == cVar.f132559a && this.f132560b == cVar.f132560b && this.f132561c == cVar.f132561c && this.f132562d == cVar.f132562d && this.f132563e == cVar.f132563e && p005kotlin.jvm.internal.s.g(this.f132564f, cVar.f132564f) && p005kotlin.jvm.internal.s.g(this.f132565g, cVar.f132565g) && p005kotlin.jvm.internal.s.g(this.f132566h, cVar.f132566h) && p005kotlin.jvm.internal.s.g(this.f132567i, cVar.f132567i);
        }

        public final int hashCode() {
            int iA = l2.a(this.f132565g, l2.b(this.f132564f, q6.f.g(q6.f.g(q6.f.g(q6.f.g(Boolean.hashCode(this.f132559a) * 31, 31, this.f132560b), 31, this.f132561c), 31, this.f132562d), 31, this.f132563e), 31), 31);
            i53.e<String> eVar = this.f132566h;
            int iHashCode = (iA + (eVar == null ? 0 : eVar.hashCode())) * 31;
            x xVar = this.f132567i;
            return iHashCode + (xVar != null ? xVar.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("UiState(isFetching=", ", isSaving=", ", hasFetchedSuccessfully=", this.f132559a, this.f132560b);
            kg.f.q(", showFetchingError=", ", showSavingError=", sbM, this.f132561c, this.f132562d);
            sbM.append(this.f132563e);
            sbM.append(", groupedGearList=");
            sbM.append(this.f132564f);
            sbM.append(", gearCollections=");
            sbM.append(this.f132565g);
            sbM.append(", savedIdsResult=");
            sbM.append(this.f132566h);
            sbM.append(", newlyCreatedGear=");
            sbM.append(this.f132567i);
            sbM.append(")");
            return sbM.toString();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, i53.d<u, ? extends i53.c<uk0.a>> dVar, i53.c<b> cVar, i53.e<String> eVar, x xVar) {
            dVar.getClass();
            cVar.getClass();
            this.f132559a = z14;
            this.f132560b = z15;
            this.f132561c = z16;
            this.f132562d = z17;
            this.f132563e = z18;
            this.f132564f = dVar;
            this.f132565g = cVar;
            this.f132566h = eVar;
            this.f132567i = xVar;
        }

        public c() {
            this(false, false, false, false, false, null, null, null, null, 511, null);
        }
    }
}
