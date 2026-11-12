package ja0;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import bs2.nv;
import bs2.sw;
import ca0.i0;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import com.garmin.proto.generated.GDISimpleSetup;
import i90.o;
import j90.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import lc.u0;
import o13.p;
import o13.q;
import o13.r;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.j0;
import p13.y;
import r53.b2;
import r53.i;
import r53.j;
import r53.k2;
import r53.p2;
import r53.q2;
import r53.s;
import v13.e;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lja0/a;", "Landroidx/lifecycle/u1;", "", "deviceId", "Li90/o;", "sportProfileSetupUseCase", "Li90/a;", "delegate", "<init>", "(JLi90/o;Li90/a;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f98050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f98051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i90.a f98052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f98053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<Integer> f98054e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p2 f98055f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b2 f98056g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p2 f98057h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b2 f98058i;

    /* JADX INFO: renamed from: ja0.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1873a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f98059a;

        static {
            int[] iArr = new int[GDISimpleSetup.FeatureType.values().length];
            try {
                iArr[GDISimpleSetup.FeatureType.ACTIVITY_PROFILE_MIGRATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GDISimpleSetup.FeatureType.SENSOR_PRE_PAIR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GDISimpleSetup.FeatureType.POPULAR_PROFILES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f98059a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements i<List<? extends qv.b>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f98060a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a f98061b;

        /* JADX INFO: renamed from: ja0.a$b$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C1874a<T> implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ j f98062a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f98063b;

            /* JADX INFO: renamed from: ja0.a$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.customization.cycling.ActivityProfilesAndSensorsViewModel$special$$inlined$map$1$2", f = "ActivityProfilesAndSensorsViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C1875a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f98064a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f98065b;

                public C1875a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f98064a = obj;
                    this.f98065b |= Integer.MIN_VALUE;
                    return C1874a.this.emit(null, this);
                }
            }

            public C1874a(j jVar, a aVar) {
                this.f98062a = jVar;
                this.f98063b = aVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C1875a c1875a;
                int i14;
                Object obj2;
                List<qv.c> listF;
                Object value;
                la0.a aVar;
                Long l14;
                if (dVar instanceof C1875a) {
                    c1875a = (C1875a) dVar;
                    int i15 = c1875a.f98065b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        c1875a.f98065b = i15 - Integer.MIN_VALUE;
                    } else {
                        c1875a = new C1875a(dVar);
                    }
                } else {
                    c1875a = new C1875a(dVar);
                }
                Object obj3 = c1875a.f98064a;
                u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
                int i16 = c1875a.f98065b;
                int i17 = 1;
                if (i16 == 0) {
                    r.b(obj3);
                    qv.a aVar3 = (qv.a) obj;
                    if (aVar3 == null || (listF = aVar3.f()) == null) {
                        i14 = 1;
                        obj2 = j0.f134944a;
                    } else {
                        a aVar4 = this.f98063b;
                        b2 b2Var = aVar4.f98058i;
                        List listN0 = h0.N0(listF, new ja0.b());
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (T t7 : listN0) {
                            Long lValueOf = Long.valueOf(((qv.c) t7).getDeviceId());
                            Object arrayList = linkedHashMap.get(lValueOf);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                linkedHashMap.put(lValueOf, arrayList);
                            }
                            ((List) arrayList).add(t7);
                        }
                        if (((la0.a) b2Var.f150540a.getValue()).f111610c == 0 && linkedHashMap.size() == 1) {
                            p2 p2Var = aVar4.f98057h;
                            do {
                                value = p2Var.getValue();
                                aVar = (la0.a) value;
                                l14 = (Long) h0.c0(linkedHashMap.keySet());
                            } while (!p2Var.b(value, la0.a.a(aVar, false, false, l14 != null ? l14.longValue() : 0L, null, null, 27)));
                        }
                        ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
                        Iterator it = linkedHashMap.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            long jLongValue = ((Number) entry.getKey()).longValue();
                            qv.c cVar = (qv.c) h0.d0((List) entry.getValue());
                            String deviceName = cVar != null ? cVar.getDeviceName() : null;
                            qv.c cVar2 = (qv.c) h0.d0((List) entry.getValue());
                            String deviceImageUrl = cVar2 != null ? cVar2.getDeviceImageUrl() : null;
                            Iterable iterable = (Iterable) entry.getValue();
                            ArrayList arrayList3 = new ArrayList(y.r(iterable, 10));
                            Iterator<T> it3 = iterable.iterator();
                            while (it3.hasNext()) {
                                arrayList3.add(((qv.c) it3.next()).getProfileName());
                            }
                            Iterator it4 = it;
                            boolean z14 = ((Number) entry.getKey()).longValue() == ((la0.a) b2Var.f150540a.getValue()).f111610c;
                            boolean z15 = linkedHashMap.size() > 1;
                            qv.c cVar3 = (qv.c) h0.d0((List) entry.getValue());
                            String string = cVar3 != null ? new DateTime(cVar3.getBackupCreationTimestamp()).toString("MMM d, yyyy") : null;
                            if (string == null) {
                                string = "";
                            }
                            arrayList2.add(new qv.b(jLongValue, deviceName, deviceImageUrl, arrayList3, z14, z15, string));
                            it = it4;
                            i17 = 1;
                        }
                        i14 = i17;
                        obj2 = arrayList2;
                    }
                    c1875a.f98065b = i14;
                    if (this.f98062a.emit(obj2, c1875a) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i16 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj3);
                }
                return Unit.INSTANCE;
            }
        }

        public b(i iVar, a aVar) {
            this.f98060a = iVar;
            this.f98061b = aVar;
        }

        @Override // r53.i
        public final Object collect(j<? super List<? extends qv.b>> jVar, t13.d dVar) {
            Object objCollect = this.f98060a.collect(new C1874a(jVar, this.f98061b), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    public a(long j8, o oVar, i90.a aVar) {
        oVar.getClass();
        aVar.getClass();
        this.f98050a = j8;
        this.f98051b = oVar;
        this.f98052c = aVar;
        this.f98053d = new ArrayList();
        j0 j0Var = j0.f134944a;
        this.f98054e = j0Var;
        p2 p2VarA = q2.a(null);
        this.f98055f = p2VarA;
        this.f98056g = s.K(new b(p2VarA, this), v1.a(this), k2.a.a(k2.f150703a, 2), j0Var);
        p2 p2VarA2 = q2.a(new la0.a(false, false, 0L, (List) null, (List) null, 31, (p005kotlin.jvm.internal.j) null));
        this.f98057h = p2VarA2;
        this.f98058i = s.d(p2VarA2);
    }

    public static boolean C4(List list) {
        if (list.isEmpty() || list.size() <= 3) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((n) it.next()).f97841b != sw.GENERIC.f20563a) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (r2.f97841b == bs2.sw.GENERIC.f20563a) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final i0 A4() {
        List<qv.c> listF;
        qv.a aVar = (qv.a) this.f98055f.getValue();
        b2 b2Var = this.f98058i;
        if (!((la0.a) b2Var.f150540a.getValue()).f111612e.isEmpty()) {
            List<n> list = ((la0.a) b2Var.f150540a.getValue()).f111612e;
            if (!list.isEmpty()) {
                if (list.size() == 1) {
                    n nVar = list.get(0);
                    if (nVar.f97843d) {
                        if (nVar.f97840a == nv.CYCLING.f20362a) {
                        }
                    }
                }
                if (!this.f98053d.contains(GDISimpleSetup.FeatureType.ACTIVITY_PROFILE_MIGRATION) || aVar == null || !aVar.getHasSportFileBackups() || (listF = aVar.f()) == null || listF.isEmpty()) {
                    return C4(((la0.a) b2Var.f150540a.getValue()).f111612e) ? i0.j.INSTANCE : B4();
                }
                return i0.d.INSTANCE;
            }
        }
        return new i0.n((la0.a) b2Var.f150540a.getValue());
    }

    public final i0 B4() {
        boolean zContains = this.f98053d.contains(GDISimpleSetup.FeatureType.POPULAR_PROFILES);
        b2 b2Var = this.f98058i;
        return (!zContains || ((la0.a) b2Var.f150540a.getValue()).f111609b) ? new i0.n((la0.a) b2Var.f150540a.getValue()) : i0.l.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b7, code lost:
    
        if (r0 == r3) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x4(v13.c cVar) {
        c cVar2;
        Object bVar;
        p2 p2Var;
        Object value;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i14 = cVar2.f98069c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f98069c = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object objY4 = cVar2.f98067a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar2.f98069c;
        int i16 = 1;
        la0.a aVar = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        try {
            if (i15 != 0) {
                if (i15 == 1) {
                    r.b(objY4);
                } else {
                    if (i15 != 2) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(objY4);
                }
                return (i0) objY4;
            }
            r.b(objY4);
            int i17 = q.f128596b;
            o oVar = this.f98051b;
            cVar2.f98069c = 1;
            objY4 = oVar.b(cVar2);
            if (objY4 == obj) {
            }
            return obj;
            bVar = (p) objY4;
            int i18 = q.f128596b;
        } catch (Throwable th3) {
            int i19 = q.f128596b;
            bVar = new q.b(th3);
        }
        if (q.b(bVar) != null) {
            return new i0.n((la0.a) (objArr2 == true ? 1 : 0), i16, (p005kotlin.jvm.internal.j) (objArr == true ? 1 : 0));
        }
        p pVar = (p) bVar;
        List list = (List) pVar.f128594a;
        boolean zBooleanValue = ((Boolean) pVar.f128595b).booleanValue();
        do {
            p2Var = this.f98057h;
            value = p2Var.getValue();
        } while (!p2Var.b(value, la0.a.a((la0.a) value, false, false, 0L, null, list, 15)));
        int iOrdinal = SupportedCapability.FIND_MY_WATCH.ordinal();
        long j8 = this.f98050a;
        if (km2.a.i(j8, null, iOrdinal)) {
            this.f98052c.a(j8);
        }
        if (zBooleanValue) {
            return new i0.n(aVar, 1, (p005kotlin.jvm.internal.j) (objArr3 == true ? 1 : 0));
        }
        if (!km2.a.i(j8, null, SupportedCapability.SIMPLE_SETUP_FEATURE_LIST.ordinal())) {
            return A4();
        }
        cVar2.f98069c = 2;
        objY4 = y4(cVar2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c6, code lost:
    
        if (r10 == r1) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object y4(v13.c cVar) {
        d dVar;
        Object bVar;
        p2 p2Var;
        Object value;
        qv.a aVar;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i14 = dVar.f98072c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f98072c = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object objE = dVar.f98070a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar.f98072c;
        ArrayList arrayList = this.f98053d;
        try {
            if (i15 == 0) {
                r.b(objE);
                int i16 = q.f128596b;
                o oVar = this.f98051b;
                dVar.f98072c = 1;
                objE = oVar.a(dVar);
                if (objE == aVar2) {
                }
                return aVar2;
            }
            if (i15 == 1) {
                r.b(objE);
            } else {
                if (i15 != 2) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(objE);
            }
            v2 v2Var = (v2) objE;
            if (!(v2Var instanceof v2.b)) {
                if (v2Var instanceof v2.a) {
                    return A4();
                }
                u0.r();
                return null;
            }
            do {
                p2Var = this.f98055f;
                value = p2Var.getValue();
                aVar = (qv.a) ((v2.b) v2Var).f47386a;
            } while (!p2Var.b(value, aVar));
            return (arrayList.contains(GDISimpleSetup.FeatureType.SENSOR_PRE_PAIR) && aVar.getHasSensorsBackups()) ? i0.u.INSTANCE : A4();
            bVar = (List) objE;
            int i17 = q.f128596b;
        } catch (Throwable th3) {
            int i18 = q.f128596b;
            bVar = new q.b(th3);
        }
        if (q.b(bVar) != null) {
            return A4();
        }
        arrayList.clear();
        for (GDISimpleSetup.Feature feature : (List) bVar) {
            GDISimpleSetup.FeatureType featureType = feature.getFeatureType();
            int i19 = featureType == null ? -1 : C1873a.f98059a[featureType.ordinal()];
            if (i19 == 1) {
                arrayList.add(GDISimpleSetup.FeatureType.ACTIVITY_PROFILE_MIGRATION);
                List<Integer> compatibilityIdList = feature.getCompatibilityIdList();
                compatibilityIdList.getClass();
                this.f98054e = compatibilityIdList;
            } else if (i19 == 2) {
                arrayList.add(GDISimpleSetup.FeatureType.SENSOR_PRE_PAIR);
            } else if (i19 == 3) {
                arrayList.add(GDISimpleSetup.FeatureType.POPULAR_PROFILES);
            }
        }
        if (!arrayList.contains(GDISimpleSetup.FeatureType.ACTIVITY_PROFILE_MIGRATION) && !arrayList.contains(GDISimpleSetup.FeatureType.SENSOR_PRE_PAIR)) {
            return A4();
        }
        List<Integer> list = this.f98054e;
        dVar.f98072c = 2;
        objE = this.f98052c.e(list, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final i0 z4(i0 i0Var, la0.b bVar) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        la0.a aVar;
        i0Var.getClass();
        bVar.getClass();
        boolean z14 = i0Var instanceof i0.d;
        int i14 = 1;
        p2 p2Var = this.f98057h;
        b2 b2Var = this.f98058i;
        if (z14) {
            if (bVar != la0.b.SKIP) {
                do {
                    value3 = p2Var.getValue();
                } while (!p2Var.b(value3, la0.a.a((la0.a) value3, true, false, 0L, null, null, 30)));
                return i0.e.INSTANCE;
            }
            do {
                value4 = p2Var.getValue();
                aVar = (la0.a) value4;
            } while (!p2Var.b(value4, la0.a.a(aVar, false, false, ((List) this.f98056g.f150540a.getValue()).size() > 1 ? 0L : aVar.f111610c, null, null, 26)));
            return C4(((la0.a) b2Var.f150540a.getValue()).f111612e) ? i0.j.INSTANCE : B4();
        }
        if (i0Var instanceof i0.j) {
            return B4();
        }
        if (i0Var instanceof i0.e) {
            return new i0.n((la0.a) b2Var.f150540a.getValue());
        }
        if (!(i0Var instanceof i0.u)) {
            if (i0Var instanceof i0.v) {
                return A4();
            }
            return i0Var instanceof i0.l ? new i0.n((la0.a) b2Var.f150540a.getValue()) : new i0.n((la0.a) null, i14, (p005kotlin.jvm.internal.j) (0 == true ? 1 : 0));
        }
        if (bVar == la0.b.SKIP) {
            do {
                value2 = p2Var.getValue();
            } while (!p2Var.b(value2, la0.a.a((la0.a) value2, false, false, 0L, null, null, 29)));
            return A4();
        }
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, la0.a.a((la0.a) value, false, true, 0L, null, null, 29)));
        return i0.v.INSTANCE;
    }
}
