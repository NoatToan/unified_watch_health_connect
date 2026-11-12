package kv0;

import android.content.Context;
import androidx.lifecycle.s0;
import androidx.lifecycle.u1;
import androidx.lifecycle.v;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.g3;
import e23.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kd0.c6;
import kd0.t2;
import lc.u0;
import o13.r;
import o53.b0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.j0;
import p13.y;
import q53.t;
import r53.b2;
import r53.k2;
import r53.p2;
import r53.q2;
import su0.u;
import wd2.e0;
import wd2.g2;
import wd2.m1;
import wd2.n1;
import wd2.z1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lkv0/j;", "Landroidx/lifecycle/u1;", "Luu0/a;", "appDelegate", "Lsu0/u;", "shareDataSource", "Lru0/c;", "liveTrackPreferences", "<init>", "(Luu0/a;Lsu0/u;Lru0/c;)V", "a", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends u1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f106663m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uu0.a f106664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f106665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ru0.c f106666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p2 f106667d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m1 f106668e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b2 f106669f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p2 f106670g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p2 f106671h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final iz1.g f106672i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p2 f106673j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b2 f106674k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b2 f106675l;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00030\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\n¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/g3;", "Lge2/e;", "settings", "", "Lou0/c;", "ltDevices", "", "Lwd2/z1;", "sessions", "", "showTooltip", "Lev0/b;", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/g3;Lcom/garmin/android/apps/connectmobile/g3;Ljava/util/Set;Z)Lcom/garmin/android/apps/connectmobile/g3;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.status.LiveTrackStatusViewModel$liveTrackDevicesUiModel$1", f = "LiveTrackStatusViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements s<g3<? extends ge2.e>, g3<? extends List<? extends ou0.c>>, Set<? extends z1>, Boolean, t13.d<? super g3<? extends List<? extends ev0.b>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ g3 f106676a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ g3 f106677b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Set f106678c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ boolean f106679d;

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f106681a;

            static {
                int[] iArr = new int[fw.p.values().length];
                try {
                    iArr[fw.p.LOADING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[fw.p.ERROR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[fw.p.SUCCESS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f106681a = iArr;
            }
        }

        public b(t13.d<? super b> dVar) {
            super(5, dVar);
        }

        @Override // e23.s
        public final Object invoke(g3<? extends ge2.e> g3Var, g3<? extends List<? extends ou0.c>> g3Var2, Set<? extends z1> set, Boolean bool, t13.d<? super g3<? extends List<? extends ev0.b>>> dVar) {
            boolean zBooleanValue = bool.booleanValue();
            b bVar = j.this.new b(dVar);
            bVar.f106676a = g3Var;
            bVar.f106677b = g3Var2;
            bVar.f106678c = set;
            bVar.f106679d = zBooleanValue;
            return bVar.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:110:0x0179 A[EDGE_INSN: B:110:0x0179->B:85:0x0179 BREAK  A[LOOP:3: B:78:0x0156->B:83:0x016e], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:111:0x0173 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:52:0x00f8  */
        /* JADX WARN: Code duplicated, block: B:56:0x0102  */
        /* JADX WARN: Code duplicated, block: B:57:0x0107  */
        /* JADX WARN: Code duplicated, block: B:58:0x0109  */
        /* JADX WARN: Code duplicated, block: B:63:0x0122  */
        /* JADX WARN: Code duplicated, block: B:68:0x012e  */
        /* JADX WARN: Code duplicated, block: B:69:0x0131  */
        /* JADX WARN: Code duplicated, block: B:70:0x0133  */
        /* JADX WARN: Code duplicated, block: B:77:0x014f  */
        /* JADX WARN: Code duplicated, block: B:80:0x015c  */
        /* JADX WARN: Code duplicated, block: B:83:0x016e A[LOOP:3: B:78:0x0156->B:83:0x016e, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:87:0x0182  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            List listB1;
            Iterator it;
            Boolean bool;
            Boolean bool2;
            Boolean bool3;
            boolean zG;
            Boolean bool4;
            boolean zG2;
            Boolean boolValueOf;
            Map<Long, ge2.a> map;
            Boolean boolValueOf2;
            Map<Long, ge2.a> map2;
            ge2.a aVar;
            ge2.e eVar;
            Boolean bool5;
            boolean z14;
            z1 z1Var;
            Iterator it3;
            Boolean bool6;
            Object next;
            Map<Long, ge2.a> map3;
            Map<Long, ge2.a> map4;
            ou0.c cVar;
            Object next2;
            g3 g3Var = this.f106676a;
            g3 g3Var2 = this.f106677b;
            Set set = this.f106678c;
            boolean z15 = this.f106679d;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            g3Var2.getClass();
            g3Var.getClass();
            fw.p pVar = g3Var2.f35300a;
            if (pVar == fw.p.SUCCESS) {
                pVar = g3Var.f35300a;
            }
            int i14 = a.f106681a[pVar.ordinal()];
            if (i14 == 1) {
                return g3.a.c(g3.f35298f);
            }
            if (i14 == 2) {
                return g3.a.a(g3.f35298f, null, null, null, null, 15);
            }
            if (i14 != 3) {
                u0.r();
                return null;
            }
            g3.a aVar3 = g3.f35298f;
            List list = (List) g3Var2.f35301b;
            ge2.e eVar2 = (ge2.e) g3Var.f35301b;
            uu0.a aVar4 = j.this.f106664a;
            if (set != null) {
                Iterator it4 = set.iterator();
                while (it4.hasNext()) {
                    long j8 = ((z1) it4.next()).f184693a;
                    if (list != null) {
                        Iterator it5 = list.iterator();
                        do {
                            if (!it5.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it5.next();
                        } while (j8 != ((ou0.c) next2).f133964a);
                        cVar = (ou0.c) next2;
                    } else {
                        cVar = null;
                    }
                    if (cVar == null) {
                        wd2.m.h(j8, com.garmin.android.library.livetrack.i.a.f50228a);
                        wd2.m.f(aVar4.f().f(), Long.valueOf(j8));
                    }
                }
            }
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                Iterator it6 = list.iterator();
                while (it6.hasNext()) {
                    ou0.c cVar2 = (ou0.c) it6.next();
                    uu0.a aVar5 = aVar4;
                    ArrayList arrayList2 = arrayList;
                    long j14 = cVar2.f133964a;
                    String str = cVar2.f133967d;
                    String str2 = cVar2.f133966c;
                    if (str2 == null) {
                        str2 = "";
                    }
                    Boolean bool7 = cVar2.f133968e;
                    Boolean bool8 = Boolean.TRUE;
                    boolean zG3 = p005kotlin.jvm.internal.s.g(bool7, bool8);
                    boolean zE = aVar5.j().e(j14);
                    boolean z16 = cVar2.f133971h;
                    if (eVar2 == null || (map4 = eVar2.f77022a) == null) {
                        it = it6;
                    } else {
                        it = it6;
                        ge2.a aVar6 = map4.get(Long.valueOf(j14));
                        if (aVar6 != null) {
                            bool = aVar6.f77009c;
                        }
                        if (eVar2 != null || (map3 = eVar2.f77022a) == null) {
                            bool2 = bool;
                        } else {
                            bool2 = bool;
                            ge2.a aVar7 = map3.get(Long.valueOf(j14));
                            if (aVar7 != null) {
                                bool3 = aVar7.f77010d;
                            }
                            zG = false;
                            if (cVar2.f133969f) {
                                if (eVar2 != null || (map = eVar2.f77022a) == null) {
                                    bool4 = bool3;
                                } else {
                                    bool4 = bool3;
                                    ge2.a aVar8 = map.get(Long.valueOf(j14));
                                    if (aVar8 != null) {
                                        zG2 = p005kotlin.jvm.internal.s.g(aVar8.f77007a, bool8);
                                    }
                                    boolValueOf = Boolean.valueOf(zG2);
                                }
                                zG2 = false;
                                boolValueOf = Boolean.valueOf(zG2);
                            } else {
                                bool4 = bool3;
                                boolValueOf = null;
                            }
                            if (cVar2.f133970g) {
                                if (eVar2 != null && (map2 = eVar2.f77022a) != null && (aVar = map2.get(Long.valueOf(j14))) != null) {
                                    zG = p005kotlin.jvm.internal.s.g(aVar.f77008b, bool8);
                                }
                                boolValueOf2 = Boolean.valueOf(zG);
                            } else {
                                boolValueOf2 = null;
                            }
                            if (set != null) {
                                it3 = set.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        bool6 = boolValueOf;
                                        eVar = eVar2;
                                        next = null;
                                        break;
                                    }
                                    next = it3.next();
                                    bool6 = boolValueOf;
                                    eVar = eVar2;
                                    if (((z1) next).f184693a == j14) {
                                        break;
                                    }
                                    boolValueOf = bool6;
                                    eVar2 = eVar;
                                }
                                z1Var = (z1) next;
                                z14 = zG3;
                                bool5 = bool6;
                            } else {
                                eVar = eVar2;
                                bool5 = boolValueOf;
                                z14 = zG3;
                                z1Var = null;
                            }
                            boolean z17 = z15;
                            arrayList2.add(new ev0.b(j14, str2, str, z14, zE, boolValueOf2, bool5, bool2, bool4, Boolean.valueOf(z16), z1Var, z17));
                            it6 = it;
                            aVar4 = aVar5;
                            arrayList = arrayList2;
                            z15 = z17;
                            eVar2 = eVar;
                        }
                        bool3 = null;
                        zG = false;
                        if (cVar2.f133969f) {
                            bool4 = bool3;
                            boolValueOf = null;
                        } else {
                            if (eVar2 != null) {
                                bool4 = bool3;
                                zG2 = false;
                            } else {
                                bool4 = bool3;
                                zG2 = false;
                            }
                            boolValueOf = Boolean.valueOf(zG2);
                        }
                        if (cVar2.f133970g) {
                            boolValueOf2 = null;
                        } else {
                            if (eVar2 != null) {
                                zG = p005kotlin.jvm.internal.s.g(aVar.f77008b, bool8);
                            }
                            boolValueOf2 = Boolean.valueOf(zG);
                        }
                        if (set != null) {
                            it3 = set.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    bool6 = boolValueOf;
                                    eVar = eVar2;
                                    next = null;
                                    break;
                                }
                                next = it3.next();
                                bool6 = boolValueOf;
                                eVar = eVar2;
                                if (((z1) next).f184693a == j14) {
                                    break;
                                    break;
                                }
                                boolValueOf = bool6;
                                eVar2 = eVar;
                            }
                            z1Var = (z1) next;
                            z14 = zG3;
                            bool5 = bool6;
                        } else {
                            eVar = eVar2;
                            bool5 = boolValueOf;
                            z14 = zG3;
                            z1Var = null;
                        }
                        boolean z18 = z15;
                        arrayList2.add(new ev0.b(j14, str2, str, z14, zE, boolValueOf2, bool5, bool2, bool4, Boolean.valueOf(z16), z1Var, z18));
                        it6 = it;
                        aVar4 = aVar5;
                        arrayList = arrayList2;
                        z15 = z18;
                        eVar2 = eVar;
                    }
                    bool = null;
                    if (eVar2 != null) {
                        bool2 = bool;
                        bool3 = null;
                    } else {
                        bool2 = bool;
                        bool3 = null;
                    }
                    zG = false;
                    if (cVar2.f133969f) {
                        bool4 = bool3;
                        boolValueOf = null;
                    } else {
                        if (eVar2 != null) {
                            bool4 = bool3;
                            zG2 = false;
                        } else {
                            bool4 = bool3;
                            zG2 = false;
                        }
                        boolValueOf = Boolean.valueOf(zG2);
                    }
                    if (cVar2.f133970g) {
                        boolValueOf2 = null;
                    } else {
                        if (eVar2 != null) {
                            zG = p005kotlin.jvm.internal.s.g(aVar.f77008b, bool8);
                        }
                        boolValueOf2 = Boolean.valueOf(zG);
                    }
                    if (set != null) {
                        it3 = set.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                bool6 = boolValueOf;
                                eVar = eVar2;
                                next = null;
                                break;
                            }
                            next = it3.next();
                            bool6 = boolValueOf;
                            eVar = eVar2;
                            if (((z1) next).f184693a == j14) {
                                break;
                                break;
                            }
                            boolValueOf = bool6;
                            eVar2 = eVar;
                        }
                        z1Var = (z1) next;
                        z14 = zG3;
                        bool5 = bool6;
                    } else {
                        eVar = eVar2;
                        bool5 = boolValueOf;
                        z14 = zG3;
                        z1Var = null;
                    }
                    boolean z19 = z15;
                    arrayList2.add(new ev0.b(j14, str2, str, z14, zE, boolValueOf2, bool5, bool2, bool4, Boolean.valueOf(z16), z1Var, z19));
                    it6 = it;
                    aVar4 = aVar5;
                    arrayList = arrayList2;
                    z15 = z19;
                    eVar2 = eVar;
                }
                listB1 = h0.b1(arrayList);
            } else {
                listB1 = null;
            }
            List listN0 = listB1 != null ? h0.N0(listB1, new androidx.browser.trusted.c(18)) : null;
            aVar3.getClass();
            return g3.a.d(listN0);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lq53/t;", "Lcom/garmin/android/apps/connectmobile/g3;", "Lge2/e;", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.status.LiveTrackStatusViewModel$settings$1", f = "LiveTrackStatusViewModel.kt", l = {74}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<t<? super g3<? extends ge2.e>>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f106682a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f106683b;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.status.LiveTrackStatusViewModel$settings$1$1$1$1", f = "LiveTrackStatusViewModel.kt", l = {68}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f106685a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s0<ge2.e> f106686b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ t<g3<ge2.e>> f106687c;

            /* JADX INFO: renamed from: kv0.j$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C2059a<T> implements r53.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ t<g3<ge2.e>> f106688a;

                /* JADX WARN: Multi-variable type inference failed */
                public C2059a(t<? super g3<ge2.e>> tVar) {
                    this.f106688a = tVar;
                }

                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) {
                    g3<ge2.e> g3VarA;
                    ge2.e eVar = (ge2.e) obj;
                    if (eVar != null) {
                        g3.f35298f.getClass();
                        g3VarA = g3.a.d(eVar);
                    } else {
                        g3VarA = g3.a.a(g3.f35298f, null, null, null, null, 15);
                    }
                    this.f106688a.i(g3VarA);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(s0<ge2.e> s0Var, t<? super g3<ge2.e>> tVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f106686b = s0Var;
                this.f106687c = tVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f106686b, this.f106687c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f106685a;
                if (i14 == 0) {
                    r.b(obj);
                    r53.i iVarA = v.a(this.f106686b);
                    C2059a c2059a = new C2059a(this.f106687c);
                    this.f106685a = 1;
                    if (iVarA.collect(c2059a, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                return Unit.INSTANCE;
            }
        }

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            c cVar = j.this.new c(dVar);
            cVar.f106683b = obj;
            return cVar;
        }

        @Override // e23.p
        public final Object invoke(t<? super g3<? extends ge2.e>> tVar, t13.d<? super Unit> dVar) {
            return ((c) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            t tVar = (t) this.f106683b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f106682a;
            if (i14 == 0) {
                r.b(obj);
                ff2.d dVar = new ff2.d(tVar, 1);
                j jVar = j.this;
                m1 m1Var = jVar.f106668e;
                if (m1Var != null) {
                    dVar.invoke(m1Var);
                } else {
                    wd2.m.c(jVar.f106664a, new jt1.d(16, jVar, dVar));
                }
                this.f106683b = null;
                this.f106682a = 1;
                if (q53.r.a(tVar, new q53.q(0), this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public j(uu0.a aVar, u uVar, ru0.c cVar) {
        aVar.getClass();
        uVar.getClass();
        cVar.getClass();
        this.f106664a = aVar;
        this.f106665b = uVar;
        this.f106666c = cVar;
        g3.a aVar2 = g3.f35298f;
        ArrayList arrayListH = aVar.j().h();
        aVar2.getClass();
        p2 p2VarA = q2.a(g3.a.d(arrayListH));
        this.f106667d = p2VarA;
        r53.b bVarF = r53.s.f(new c(null));
        w9.a aVarA = v1.a(this);
        k2.f150703a.getClass();
        b2 b2VarK = r53.s.K(bVarF, aVarA, k2.a.f150705b, g3.a.b(null));
        this.f106669f = b2VarK;
        p2 p2VarA2 = q2.a(wd2.m.a());
        this.f106670g = p2VarA2;
        p2 p2VarA3 = q2.a(Boolean.valueOf(cVar.a()));
        this.f106671h = p2VarA3;
        iz1.g gVar = new iz1.g(this, 6);
        this.f106672i = gVar;
        p2 p2VarA4 = q2.a(null);
        this.f106673j = p2VarA4;
        this.f106674k = r53.s.d(p2VarA4);
        this.f106675l = r53.s.K(r53.s.m(b2VarK, p2VarA, p2VarA2, p2VarA3, new b(null)), v1.a(this), k2.a.f150706c, g3.a.b(null));
        ge1.b.T(v1.a(this), null, null, new l(this, null), 3);
        t2 t2VarJ = aVar.j();
        Context contextF = aVar.f().f();
        kk1.h hVar = new kk1.h(this, 7);
        t2VarJ.getClass();
        t2VarJ.f104374c = hVar;
        if (!t2VarJ.f104373b) {
            da2.d.c(contextF).f58886a.b(t2VarJ.f104375d);
            t2VarJ.f104373b = true;
        }
        wd2.m.b().g(gVar);
        List list = (List) ((g3) p2VarA.getValue()).f35301b;
        if (list != null) {
            t2 t2VarJ2 = aVar.j();
            ArrayList arrayList = new ArrayList(y.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(((ou0.c) it.next()).f133964a));
            }
            t2VarJ2.getClass();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                ((b31.f) KoinJavaComponent.get$default(b31.f.class, null, null, 6, null)).a(((Number) it3.next()).longValue(), e31.a.ENTERED_LIVE_TRACK);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0084  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a9 A[DONT_INVERT, PHI: r2
      0x00a9: PHI (r2v6 ou0.f) = (r2v5 ou0.f), (r2v7 ou0.f) binds: [B:34:0x0093, B:39:0x00a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c7 A[DONT_INVERT, PHI: r2
      0x00c7: PHI (r2v8 ou0.f) = (r2v6 ou0.f), (r2v9 ou0.f) binds: [B:45:0x00b1, B:50:0x00c4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009d, code lost:
    
        if (r12 == r1) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00bb, code lost:
    
        if (r12 == r1) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d9, code lost:
    
        if (r12 == r1) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object x4(j jVar, v13.c cVar) {
        k kVar;
        ou0.f fVar;
        ou0.b bVar;
        ou0.b bVar2;
        jVar.getClass();
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i14 = kVar.f106692d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                kVar.f106692d = i14 - Integer.MIN_VALUE;
            } else {
                kVar = new k(jVar, cVar);
            }
        } else {
            kVar = new k(jVar, cVar);
        }
        Object objZ4 = kVar.f106690b;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = kVar.f106692d;
        boolean z14 = false;
        if (i15 == 0) {
            r.b(objZ4);
            ge2.e eVar = (ge2.e) ((g3) jVar.f106669f.f150540a.getValue()).f35301b;
            ou0.f fVarA = eVar != null ? ou0.a.a(eVar) : null;
            c6 c6VarD = jVar.f106664a.d();
            kVar.f106689a = fVarA;
            kVar.f106692d = 1;
            Object objA = c6VarD.a(true, kVar);
            if (objA != obj) {
                fVar = fVarA;
                objZ4 = objA;
            }
            return obj;
        }
        if (i15 == 1) {
            fVar = kVar.f106689a;
            r.b(objZ4);
        } else {
            if (i15 == 2) {
                fVar = kVar.f106689a;
                r.b(objZ4);
                if (!((Boolean) objZ4).booleanValue()) {
                    if (fVar != null) {
                        bVar = fVar.f133984b;
                    } else {
                        bVar = null;
                    }
                    if (bVar instanceof ou0.b.a) {
                        kVar.f106689a = fVar;
                        kVar.f106692d = 3;
                        objZ4 = jVar.y4(kVar);
                    } else {
                        if (fVar != null) {
                            bVar2 = fVar.f133984b;
                        } else {
                            bVar2 = null;
                        }
                        if (bVar2 instanceof ou0.b.C2540b) {
                            kVar.f106689a = null;
                            kVar.f106692d = 4;
                            objZ4 = jVar.A4(kVar);
                        }
                    }
                    return obj;
                }
                z14 = true;
                return Boolean.valueOf(z14);
            }
            if (i15 == 3) {
                fVar = kVar.f106689a;
                r.b(objZ4);
                if (((Boolean) objZ4).booleanValue()) {
                    z14 = true;
                } else {
                    if (fVar != null) {
                        bVar2 = fVar.f133984b;
                    } else {
                        bVar2 = null;
                    }
                    if (bVar2 instanceof ou0.b.C2540b) {
                        kVar.f106689a = null;
                        kVar.f106692d = 4;
                        objZ4 = jVar.A4(kVar);
                    }
                }
                return Boolean.valueOf(z14);
            }
            if (i15 != 4) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objZ4);
        }
        if (((Boolean) objZ4).booleanValue()) {
            z14 = true;
        }
        return Boolean.valueOf(z14);
        if (!(((g2) objZ4) instanceof g2.b)) {
            if (fVar != null ? p005kotlin.jvm.internal.s.g(fVar.f133983a, Boolean.TRUE) : false) {
                kVar.f106689a = fVar;
                kVar.f106692d = 2;
                objZ4 = jVar.z4(kVar);
            } else {
                if (fVar != null) {
                    bVar = fVar.f133984b;
                } else {
                    bVar = null;
                }
                if (bVar instanceof ou0.b.a) {
                    kVar.f106689a = fVar;
                    kVar.f106692d = 3;
                    objZ4 = jVar.y4(kVar);
                } else {
                    if (fVar != null) {
                        bVar2 = fVar.f133984b;
                    } else {
                        bVar2 = null;
                    }
                    if (bVar2 instanceof ou0.b.C2540b) {
                        kVar.f106689a = null;
                        kVar.f106692d = 4;
                        objZ4 = jVar.A4(kVar);
                    }
                }
            }
            return obj;
        }
        z14 = true;
        return Boolean.valueOf(z14);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object A4(v13.c cVar) {
        o oVar;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i14 = oVar.f106704c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                oVar.f106704c = i14 - Integer.MIN_VALUE;
            } else {
                oVar = new o(this, cVar);
            }
        } else {
            oVar = new o(this, cVar);
        }
        Object objC = oVar.f106702a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = oVar.f106704c;
        if (i15 == 0) {
            r.b(objC);
            su0.h hVar = su0.h.f160962a;
            oVar.f106704c = 1;
            objC = hVar.c(oVar);
            if (objC == obj) {
                return obj;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objC);
        }
        List list = (List) objC;
        return Boolean.valueOf((list != null ? list.size() : 0) > 0);
    }

    public final void B4(ev0.b bVar) {
        bVar.getClass();
        long j8 = bVar.f66140a;
        com.garmin.android.library.livetrack.i.a aVar = com.garmin.android.library.livetrack.i.a.f50228a;
        uu0.a aVar2 = this.f106664a;
        aVar2.f().getClass();
        f12.l.f68084a.getClass();
        wd2.q.f184563f.c().f(new e0(j8, aVar, f12.l.a.a().getUserName(), aVar2.j().e(bVar.f66140a), null, new n1.b(), null, null, null, 464, null), aVar2);
    }

    public final void C4(i iVar) {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f106673j;
            value = p2Var.getValue();
        } while (!p2Var.b(value, iVar));
    }

    @Override // androidx.lifecycle.u1
    public final void onCleared() {
        super.onCleared();
        su0.t.f161004a.getClass();
        j0 j0Var = j0.f134944a;
        su0.t.f161008e = new pu0.e(j0Var, j0Var, false, false);
        su0.h.f160962a.getClass();
        su0.h.f160964c = null;
        m1 m1Var = this.f106668e;
        uu0.a aVar = this.f106664a;
        if (m1Var != null) {
            m1Var.d(aVar.f().f());
        }
        this.f106668e = null;
        t2 t2VarJ = aVar.j();
        Context contextF = aVar.f().f();
        t2VarJ.getClass();
        if (t2VarJ.f104373b) {
            da2.d.c(contextF).f58886a.i(t2VarJ.f104375d);
            t2VarJ.f104373b = false;
        }
        t2VarJ.f104374c = null;
        wd2.m.b().k(this.f106672i);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y4(v13.c cVar) {
        m mVar;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i14 = mVar.f106698c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                mVar.f106698c = i14 - Integer.MIN_VALUE;
            } else {
                mVar = new m(this, cVar);
            }
        } else {
            mVar = new m(this, cVar);
        }
        Object objB = mVar.f106696a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = mVar.f106698c;
        if (i15 == 0) {
            r.b(objB);
            su0.h hVar = su0.h.f160962a;
            mVar.f106698c = 1;
            objB = hVar.b(mVar);
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objB);
        }
        List list = (List) objB;
        return Boolean.valueOf((list != null ? list.size() : 0) > 0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object z4(v13.c cVar) {
        n nVar;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i14 = nVar.f106701c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                nVar.f106701c = i14 - Integer.MIN_VALUE;
            } else {
                nVar = new n(this, cVar);
            }
        } else {
            nVar = new n(this, cVar);
        }
        Object objF = nVar.f106699a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = nVar.f106701c;
        if (i15 == 0) {
            r.b(objF);
            su0.t tVar = su0.t.f161004a;
            nVar.f106701c = 1;
            objF = tVar.f(false, nVar);
            if (objF == obj) {
                return obj;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objF);
        }
        List list = (List) objF;
        return Boolean.valueOf((list != null ? list.size() : 0) > 0);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkv0/j$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
