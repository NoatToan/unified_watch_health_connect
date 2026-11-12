package com.garmin.android.apps.connectmobile.dashboard.data.datasource;

import com.garmin.android.apps.connectmobile.f3;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\rB'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/m0;", "Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/l0;", "Lcom/garmin/android/apps/connectmobile/f0;", "Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/k0;", "dashboardApi", "Lcom/garmin/android/apps/connectmobile/s0;", "cacheDatabaseDelegate", "Lf12/l;", "userSettings", "Lcom/garmin/android/apps/connectmobile/b1;", "featureItemAvailability", "<init>", "(Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/k0;Lcom/garmin/android/apps/connectmobile/s0;Lf12/l;Lcom/garmin/android/apps/connectmobile/b1;)V", "a", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m0 implements l0, com.garmin.android.apps.connectmobile.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f33270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.s0 f33271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f12.l f33272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.b1 f33273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final jw.c f33274e;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements r53.i<j70.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f33275a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m0 f33276b;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f33277a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m0 f33278b;

            /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.dashboard.data.datasource.m0$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.data.datasource.DashboardConfigDataSourceImpl$getDashboardConfig$$inlined$map$1$2", f = "DashboardConfigDataSourceImpl.kt", l = {60, 50}, m = "emit", v = 2)
            public static final class C0546a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f33279a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f33280b;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public r53.j f33282d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public int f33283e;

                public C0546a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f33279a = obj;
                    this.f33280b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar, m0 m0Var) {
                this.f33277a = jVar;
                this.f33278b = m0Var;
            }

            /* JADX WARN: Code duplicated, block: B:29:0x007d  */
            /* JADX WARN: Code duplicated, block: B:32:0x008f  */
            /* JADX WARN: Code duplicated, block: B:34:0x0095  */
            /* JADX WARN: Code duplicated, block: B:35:0x009a  */
            /* JADX WARN: Code duplicated, block: B:38:0x00a1  */
            /* JADX WARN: Code duplicated, block: B:39:0x00a6  */
            /* JADX WARN: Code duplicated, block: B:42:0x00ad  */
            /* JADX WARN: Code duplicated, block: B:43:0x00b2  */
            /* JADX WARN: Code duplicated, block: B:46:0x00b9  */
            /* JADX WARN: Code duplicated, block: B:47:0x00be  */
            /* JADX WARN: Code duplicated, block: B:49:0x00c5  */
            /* JADX WARN: Code duplicated, block: B:52:0x00cc  */
            /* JADX WARN: Code duplicated, block: B:53:0x00d2  */
            /* JADX WARN: Code duplicated, block: B:56:0x00d9  */
            /* JADX WARN: Code duplicated, block: B:57:0x00df  */
            /* JADX WARN: Code duplicated, block: B:8:0x0014  */
            /* JADX WARN: Code restructure failed: missing block: B:59:0x00f0, code lost:
            
                if (r6.emit(r14, r15) == r1) goto L60;
             */
            @Override // r53.j
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, t13.d dVar) {
                C0546a c0546a;
                int i14;
                r53.j jVar;
                j70.f fVarA;
                int i15;
                r53.j jVar2;
                boolean zW0;
                j70.c dailyStatsConfig;
                j70.c cVarA;
                List<j70.b> listF;
                ArrayList arrayListG;
                List<j70.b> listC;
                ArrayList arrayListG2;
                List<j70.b> listD;
                ArrayList arrayListG3;
                List<j70.b> listG;
                ArrayList arrayListG4;
                List<j70.b> listE;
                ArrayList arrayListG5;
                List<j70.b> listF2;
                ArrayList arrayListG6;
                if (dVar instanceof C0546a) {
                    c0546a = (C0546a) dVar;
                    int i16 = c0546a.f33280b;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        c0546a.f33280b = i16 - Integer.MIN_VALUE;
                    } else {
                        c0546a = new C0546a(dVar);
                    }
                } else {
                    c0546a = new C0546a(dVar);
                }
                C0546a c0546a2 = c0546a;
                Object objY = c0546a2.f33279a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i17 = c0546a2.f33280b;
                m0 m0Var = this.f33278b;
                if (i17 != 0) {
                    if (i17 == 1) {
                        i15 = c0546a2.f33283e;
                        jVar2 = c0546a2.f33282d;
                        o13.r.b(objY);
                    } else {
                        if (i17 != 2) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        o13.r.b(objY);
                    }
                    return Unit.INSTANCE;
                }
                o13.r.b(objY);
                String str = (String) obj;
                i14 = 0;
                jVar = this.f33277a;
                if (str != null) {
                    try {
                        fVarA = (j70.f) GsonUtil.f47253b.fromJson(str, (Class) j70.f.class);
                    } catch (Exception e4) {
                        com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
                        com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                        com.garmin.android.apps.connectmobile.i2.a.g(a2Var, "DashboardConfigDataSource", e4);
                        fVarA = m0.a(m0Var);
                    }
                    if (fVarA == null) {
                        fVarA = m0.a(m0Var);
                    }
                    j70.f fVar = fVarA;
                    zW0 = m0Var.f33273d.w0();
                    dailyStatsConfig = fVar.getDailyStatsConfig();
                    if (dailyStatsConfig != null) {
                        listD = dailyStatsConfig.d();
                        if (listD != null) {
                            arrayListG3 = j70.g.g(listD, zW0);
                        } else {
                            arrayListG3 = null;
                        }
                        listG = dailyStatsConfig.g();
                        if (listG != null) {
                            arrayListG4 = j70.g.g(listG, zW0);
                        } else {
                            arrayListG4 = null;
                        }
                        listE = dailyStatsConfig.e();
                        if (listE != null) {
                            arrayListG5 = j70.g.g(listE, zW0);
                        } else {
                            arrayListG5 = null;
                        }
                        listF2 = dailyStatsConfig.f();
                        if (listF2 != null) {
                            arrayListG6 = j70.g.g(listF2, zW0);
                        } else {
                            arrayListG6 = null;
                        }
                        cVarA = j70.c.a(dailyStatsConfig, arrayListG3, arrayListG4, arrayListG5, arrayListG6);
                    } else {
                        cVarA = null;
                    }
                    listF = fVar.f();
                    if (listF != null) {
                        arrayListG = j70.g.g(listF, zW0);
                    } else {
                        arrayListG = null;
                    }
                    listC = fVar.c();
                    if (listC != null) {
                        arrayListG2 = j70.g.g(listC, zW0);
                    } else {
                        arrayListG2 = null;
                    }
                    j70.f fVarA2 = j70.f.a(fVar, cVarA, null, arrayListG, arrayListG2, 5);
                    c0546a2.f33282d = null;
                    c0546a2.f33283e = i14;
                    c0546a2.f33280b = 2;
                } else {
                    c0546a2.f33282d = jVar;
                    c0546a2.f33283e = 0;
                    c0546a2.f33280b = 1;
                    objY = m0Var.y(c0546a2);
                    if (objY != aVar) {
                        i15 = 0;
                        jVar2 = jVar;
                    }
                }
                return aVar;
                jVar = jVar2;
                i14 = i15;
                fVarA = (j70.f) objY;
                if (fVarA == null) {
                    fVarA = m0.a(m0Var);
                }
                j70.f fVar2 = fVarA;
                zW0 = m0Var.f33273d.w0();
                dailyStatsConfig = fVar2.getDailyStatsConfig();
                if (dailyStatsConfig != null) {
                    listD = dailyStatsConfig.d();
                    if (listD != null) {
                        arrayListG3 = j70.g.g(listD, zW0);
                    } else {
                        arrayListG3 = null;
                    }
                    listG = dailyStatsConfig.g();
                    if (listG != null) {
                        arrayListG4 = j70.g.g(listG, zW0);
                    } else {
                        arrayListG4 = null;
                    }
                    listE = dailyStatsConfig.e();
                    if (listE != null) {
                        arrayListG5 = j70.g.g(listE, zW0);
                    } else {
                        arrayListG5 = null;
                    }
                    listF2 = dailyStatsConfig.f();
                    if (listF2 != null) {
                        arrayListG6 = j70.g.g(listF2, zW0);
                    } else {
                        arrayListG6 = null;
                    }
                    cVarA = j70.c.a(dailyStatsConfig, arrayListG3, arrayListG4, arrayListG5, arrayListG6);
                } else {
                    cVarA = null;
                }
                listF = fVar2.f();
                if (listF != null) {
                    arrayListG = j70.g.g(listF, zW0);
                } else {
                    arrayListG = null;
                }
                listC = fVar2.c();
                if (listC != null) {
                    arrayListG2 = j70.g.g(listC, zW0);
                } else {
                    arrayListG2 = null;
                }
                j70.f fVarA3 = j70.f.a(fVar2, cVarA, null, arrayListG, arrayListG2, 5);
                c0546a2.f33282d = null;
                c0546a2.f33283e = i14;
                c0546a2.f33280b = 2;
            }
        }

        public b(r53.i iVar, m0 m0Var) {
            this.f33275a = iVar;
            this.f33276b = m0Var;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super j70.f> jVar, t13.d dVar) {
            Object objCollect = this.f33275a.collect(new a(jVar, this.f33276b), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.data.datasource.DashboardConfigDataSourceImpl", f = "DashboardConfigDataSourceImpl.kt", l = {165, 173}, m = "hideSection", v = 2)
    public static final class c extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f33284a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f33286c;

        public c(t13.d<? super c> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f33284a = obj;
            this.f33286c |= Integer.MIN_VALUE;
            return m0.this.e(null, this);
        }
    }

    static {
        new a(null);
    }

    public m0(k0 k0Var, com.garmin.android.apps.connectmobile.s0 s0Var, f12.l lVar, com.garmin.android.apps.connectmobile.b1 b1Var) {
        k0Var.getClass();
        s0Var.getClass();
        lVar.getClass();
        b1Var.getClass();
        this.f33270a = k0Var;
        this.f33271b = s0Var;
        this.f33272c = lVar;
        this.f33273d = b1Var;
        jw.c0 c0VarA = s0Var.a(Long.MAX_VALUE, Long.MAX_VALUE);
        c0VarA.e("https://connectapi.garmin.com/userfocus-service/dashboard");
        this.f33274e = c0VarA;
    }

    public static final j70.f a(m0 m0Var) {
        m0Var.getClass();
        j70.f fVar = new j70.f(null, null, null, null, null);
        com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
        com.garmin.android.apps.connectmobile.i2.a.b(com.garmin.android.apps.connectmobile.a2.DASHBOARD, "DashboardConfigDataSource", "defaultDashboardConfig() " + fVar);
        return fVar;
    }

    public static ArrayList c(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!p005kotlin.jvm.internal.s.g(((j70.b) obj).getCardType(), o70.t.X.f130082a)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final j70.f b() {
        String strA = this.f33274e.a();
        if (strA != null) {
            try {
                return (j70.f) GsonUtil.f47253b.fromJson(strA, j70.f.class);
            } catch (Exception e4) {
                com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                com.garmin.android.apps.connectmobile.i2.a.g(a2Var, "DashboardConfigDataSource", e4);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0131, code lost:
    
        if (y(r0) == r1) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.garmin.android.apps.connectmobile.dashboard.data.datasource.m0] */
    /* JADX WARN: Type inference failed for: r13v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.lang.Iterable] */
    @Override // com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(o70.f fVar, t13.d<? super Unit> dVar) {
        c cVar;
        ?? arrayList;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i14 = cVar.f33286c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar.f33286c = i14 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object objS = cVar.f33284a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar.f33286c;
        if (i15 != 0) {
            if (i15 == 1) {
                o13.r.b(objS);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objS);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(objS);
        j70.f fVarB = b();
        if (fVarB != null) {
            o70.f.f129966c.getClass();
            List listA = o70.f.a.a();
            ArrayList arrayList2 = new ArrayList(p13.y.r(listA, 10));
            Iterator it = listA.iterator();
            while (it.hasNext()) {
                arrayList2.add(((o70.f) it.next()).f129989a);
            }
            List<j70.v> listD = fVarB.d();
            if (listD == null || listD.isEmpty()) {
                arrayList = new ArrayList(p13.y.r(arrayList2, 10));
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    arrayList.add(new j70.v((String) it3.next()));
                }
            } else {
                arrayList = fVarB.d();
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList) {
                if (!p005kotlin.jvm.internal.s.g(((j70.v) obj).getSectionType(), fVar.f129989a)) {
                    arrayList3.add(obj);
                }
            }
            String strA = GsonUtil.a(j70.f.a(fVarB, null, arrayList3, null, null, 27));
            this.f33274e.d(Unit.INSTANCE, strA);
            ArrayList arrayList4 = new ArrayList();
            for (j70.v vVar : arrayList) {
                o70.f.a aVar2 = o70.f.f129966c;
                String sectionType = vVar.getSectionType();
                aVar2.getClass();
                o70.f fVarC = o70.f.a.c(sectionType);
                if (fVarC != null) {
                    arrayList4.add(fVarC);
                }
            }
            ArrayList arrayList5 = new ArrayList();
            for (Object obj2 : arrayList4) {
                if (((o70.f) obj2) != fVar) {
                    arrayList5.add(obj2);
                }
            }
            cVar.f33286c = 1;
            objS = s(null, arrayList5, null, null, null, cVar);
            if (objS != aVar) {
            }
            return aVar;
        }
        return Unit.INSTANCE;
        if (((v2) objS) instanceof v2.a) {
            cVar.f33286c = 2;
        }
        return Unit.INSTANCE;
    }

    @Override // com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0
    public final Unit f() {
        this.f33271b.b("https://connectapi.garmin.com/userfocus-service/dashboard");
        return Unit.INSTANCE;
    }

    @Override // com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0
    public final r53.i<j70.f> p() {
        b bVar = new b(this.f33274e.b(), this);
        x53.c cVar = o53.s0.f129406a;
        return r53.s.A(bVar, x53.b.f189152a);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0
    public final Object s(List list, List list2, List list3, List list4, List list5, v13.c cVar) {
        q0 q0Var;
        if (cVar instanceof q0) {
            q0Var = (q0) cVar;
            int i14 = q0Var.f33327d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                q0Var.f33327d = i14 - Integer.MIN_VALUE;
            } else {
                q0Var = new q0(this, cVar);
            }
        } else {
            q0Var = new q0(this, cVar);
        }
        q0 q0Var2 = q0Var;
        Object objJ = q0Var2.f33325b;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = q0Var2.f33327d;
        if (i15 == 0) {
            o13.r.b(objJ);
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
            StringBuilder sbK = f3.k("updateDashboardConfig() primaryStats: ", " sections: ", " secondaryStatsFavorites: ", list, list2);
            sbK.append(list3);
            sbK.append(" secondaryStatOthers: ");
            sbK.append(list4);
            String string = sbK.toString();
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "DashboardConfigDataSource", string);
            r0 r0Var = new r0(list2, list, list3, list4, list5, this, null);
            q0Var2.f33327d = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(this, r0Var, q0Var2);
            if (objJ != obj) {
            }
            return obj;
        }
        if (i15 != 1) {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v2.b bVar = q0Var2.f33324a;
            o13.r.b(objJ);
            return bVar;
        }
        o13.r.b(objJ);
        v2 v2Var = (v2) objJ;
        com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
        String strF = b71.i.f("updateDashboardConfig() ", v2Var);
        com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
        com.garmin.android.apps.connectmobile.i2.a.b(a2Var2, "DashboardConfigDataSource", strF);
        if (v2Var instanceof v2.b) {
            q0Var2.f33324a = (v2.b) v2Var;
            q0Var2.f33327d = 2;
            if (y(q0Var2) == obj) {
                return obj;
            }
        }
        return v2Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0126, code lost:
    
        if (y(r0) == r1) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.garmin.android.apps.connectmobile.dashboard.data.datasource.m0] */
    /* JADX WARN: Type inference failed for: r13v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.lang.Iterable, java.util.Collection] */
    @Override // com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(o70.f fVar, v13.c cVar) {
        p0 p0Var;
        ?? arrayList;
        if (cVar instanceof p0) {
            p0Var = (p0) cVar;
            int i14 = p0Var.f33312c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                p0Var.f33312c = i14 - Integer.MIN_VALUE;
            } else {
                p0Var = new p0(this, cVar);
            }
        } else {
            p0Var = new p0(this, cVar);
        }
        Object objS = p0Var.f33310a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = p0Var.f33312c;
        if (i15 != 0) {
            if (i15 == 1) {
                o13.r.b(objS);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objS);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(objS);
        j70.f fVarB = b();
        if (fVarB != null) {
            o70.f.f129966c.getClass();
            List listA = o70.f.a.a();
            ArrayList arrayList2 = new ArrayList(p13.y.r(listA, 10));
            Iterator it = listA.iterator();
            while (it.hasNext()) {
                arrayList2.add(((o70.f) it.next()).f129989a);
            }
            List<j70.v> listD = fVarB.d();
            if (listD == null || listD.isEmpty()) {
                arrayList = new ArrayList(p13.y.r(arrayList2, 10));
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    arrayList.add(new j70.v((String) it3.next()));
                }
            } else {
                arrayList = fVarB.d();
            }
            if (arrayList == 0 || !arrayList.isEmpty()) {
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    if (p005kotlin.jvm.internal.s.g(((j70.v) it4.next()).getSectionType(), fVar.f129989a)) {
                        return Unit.INSTANCE;
                    }
                }
            }
            String strA = GsonUtil.a(j70.f.a(fVarB, null, p13.h0.D0(arrayList, new j70.v(fVar.f129989a)), null, null, 27));
            this.f33274e.d(Unit.INSTANCE, strA);
            ArrayList arrayList3 = new ArrayList();
            for (j70.v vVar : arrayList) {
                o70.f.a aVar2 = o70.f.f129966c;
                String sectionType = vVar.getSectionType();
                aVar2.getClass();
                o70.f fVarC = o70.f.a.c(sectionType);
                if (fVarC != null) {
                    arrayList3.add(fVarC);
                }
            }
            ArrayList arrayListD0 = p13.h0.D0(arrayList3, fVar);
            p0Var.f33312c = 1;
            objS = s(null, arrayListD0, null, null, null, p0Var);
            if (objS != aVar) {
            }
            return aVar;
        }
        return Unit.INSTANCE;
        if (((v2) objS) instanceof v2.a) {
            p0Var.f33312c = 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0
    public final Object y(v13.c cVar) {
        n0 n0Var;
        j70.c cVarA;
        if (cVar instanceof n0) {
            n0Var = (n0) cVar;
            int i14 = n0Var.f33301c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                n0Var.f33301c = i14 - Integer.MIN_VALUE;
            } else {
                n0Var = new n0(this, cVar);
            }
        } else {
            n0Var = new n0(this, cVar);
        }
        Object objJ = n0Var.f33299a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = n0Var.f33301c;
        if (i15 == 0) {
            o13.r.b(objJ);
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "DashboardConfigDataSource", "fetchDashboardConfig()");
            String strH4 = this.f33272c.h4();
            if (strH4 == null || strH4.equals(j70.r.f97629l.f97636a)) {
                com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "DashboardConfigDataSource", "fetchDashboardConfig() userFocus " + strH4);
                return null;
            }
            o0 o0Var = new o0(this, null);
            n0Var.f33301c = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(this, o0Var, n0Var);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (!(v2Var instanceof v2.b)) {
            if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.f(a2Var2, "DashboardConfigDataSource", "fetchDashboardConfig() from server ERROR");
            return null;
        }
        com.garmin.android.apps.connectmobile.a2 a2Var3 = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
        String strF = b71.i.f("fetchDashboardConfig() from server SUCCESS ", v2Var);
        com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
        com.garmin.android.apps.connectmobile.i2.a.b(a2Var3, "DashboardConfigDataSource", strF);
        j70.f fVarA = (j70.f) ((v2.b) v2Var).f47386a;
        if (this.f33273d.L()) {
            j70.c dailyStatsConfig = fVarA.getDailyStatsConfig();
            if (dailyStatsConfig != null) {
                List<j70.b> listD = dailyStatsConfig.d();
                ArrayList arrayListC = listD != null ? c(listD) : null;
                List<j70.b> listG = dailyStatsConfig.g();
                ArrayList arrayListC2 = listG != null ? c(listG) : null;
                List<j70.b> listE = dailyStatsConfig.e();
                ArrayList arrayListC3 = listE != null ? c(listE) : null;
                List<j70.b> listF = dailyStatsConfig.f();
                cVarA = j70.c.a(dailyStatsConfig, arrayListC, arrayListC2, arrayListC3, listF != null ? c(listF) : null);
            } else {
                cVarA = null;
            }
            List<j70.b> listF2 = fVarA.f();
            ArrayList arrayListC4 = listF2 != null ? c(listF2) : null;
            List<j70.b> listC = fVarA.c();
            fVarA = j70.f.a(fVarA, cVarA, null, arrayListC4, listC != null ? c(listC) : null, 5);
        }
        this.f33274e.d(Unit.INSTANCE, GsonUtil.a(fVarA));
        return fVarA;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/m0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "DASHBOARD_CONFIG_URL", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
