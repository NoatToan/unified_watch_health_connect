package n70;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Ln70/i7;", "Ln70/h7;", "Ll70/c;", "dashboardRepository", "<init>", "(Ll70/c;)V", "a", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i7 implements h7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l70.c f124291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r53.b2 f124292b;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements r53.i<List<? extends o70.f>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f124293a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f124294a;

            /* JADX INFO: renamed from: n70.i7$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.SetDashboardSectionVisibilityUseCaseImpl$special$$inlined$map$1$2", f = "SetDashboardSectionVisibilityUseCaseImpl.kt", l = {50}, m = "emit", v = 2)
            public static final class C2358a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f124295a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f124296b;

                public C2358a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f124295a = obj;
                    this.f124296b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar) {
                this.f124294a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r6v3, types: [r53.j] */
            /* JADX WARN: Type inference failed for: r7v2, types: [p13.j0] */
            /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r7v4, types: [java.util.ArrayList] */
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
                C2358a c2358a;
                ?? arrayList;
                if (dVar instanceof C2358a) {
                    c2358a = (C2358a) dVar;
                    int i14 = c2358a.f124296b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c2358a.f124296b = i14 - Integer.MIN_VALUE;
                    } else {
                        c2358a = new C2358a(dVar);
                    }
                } else {
                    c2358a = new C2358a(dVar);
                }
                Object obj2 = c2358a.f124295a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c2358a.f124296b;
                if (i15 == 0) {
                    o13.r.b(obj2);
                    List<j70.v> listD = ((j70.f) obj).d();
                    if (listD != null) {
                        arrayList = new ArrayList();
                        for (j70.v vVar : listD) {
                            o70.f.a aVar2 = o70.f.f129966c;
                            String sectionType = vVar.getSectionType();
                            aVar2.getClass();
                            o70.f fVarC = o70.f.a.c(sectionType);
                            if (fVarC != null) {
                                arrayList.add(fVarC);
                            }
                        }
                    } else {
                        arrayList = p13.j0.f134944a;
                    }
                    c2358a.f124296b = 1;
                    if (this.f124294a.emit(arrayList, c2358a) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i15 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public b(r53.i iVar) {
            this.f124293a = iVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super List<? extends o70.f>> jVar, t13.d dVar) {
            Object objCollect = this.f124293a.collect(new a(jVar), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public i7(l70.c cVar) {
        cVar.getClass();
        this.f124291a = cVar;
        o53.m1 m1VarC = g8.i.c();
        x53.c cVar2 = o53.s0.f129406a;
        u53.d dVarA = o53.c0.a(t13.g.a.C3052a.d(x53.b.f189152a, m1VarC));
        r53.i iVarS = r53.s.s(new b(cVar.p()));
        r53.k2.f150703a.getClass();
        this.f124292b = r53.s.K(iVarS, dVarA, r53.k2.a.f150705b, p13.j0.f134944a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008b  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:45:0x0131  */
    /* JADX WARN: Code duplicated, block: B:47:0x014d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0151  */
    /* JADX WARN: Code duplicated, block: B:51:0x016b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // n70.h7
    public final Object a(o70.f fVar, boolean z14, v13.c cVar) {
        j7 j7Var;
        o70.f fVar2;
        List list;
        o70.f fVar3;
        List list2;
        com.garmin.android.apps.connectmobile.v2 v2Var;
        com.garmin.android.apps.connectmobile.v2 v2Var2;
        if (cVar instanceof j7) {
            j7Var = (j7) cVar;
            int i14 = j7Var.f124343e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                j7Var.f124343e = i14 - Integer.MIN_VALUE;
            } else {
                j7Var = new j7(this, cVar);
            }
        } else {
            j7Var = new j7(this, cVar);
        }
        j7 j7Var2 = j7Var;
        Object objV0 = j7Var2.f124341c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = j7Var2.f124343e;
        if (i15 != 0) {
            if (i15 == 1) {
                list2 = j7Var2.f124340b;
                fVar3 = j7Var2.f124339a;
                o13.r.b(objV0);
                v2Var = (com.garmin.android.apps.connectmobile.v2) objV0;
                if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
                    com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.SUBSCRIPTIONS;
                    com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                    com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "SetDashboardSectionVisibilityUseCaseImpl", "invoke: updateDashboardConfig success");
                    com.garmin.android.apps.connectmobile.g3.a aVar2 = com.garmin.android.apps.connectmobile.g3.f35298f;
                    Boolean boolValueOf = Boolean.valueOf(list2.contains(fVar3));
                    aVar2.getClass();
                    return com.garmin.android.apps.connectmobile.g3.a.d(boolValueOf);
                }
                if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.a) {
                    lc.u0.r();
                    return null;
                }
                com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.SUBSCRIPTIONS;
                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                com.garmin.android.apps.connectmobile.i2.a.f(a2Var2, "SetDashboardSectionVisibilityUseCaseImpl", "updateDashboardConfig error");
                return com.garmin.android.apps.connectmobile.g3.a.a(com.garmin.android.apps.connectmobile.g3.f35298f, null, null, Boolean.FALSE, null, 11);
            }
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = j7Var2.f124340b;
            fVar2 = j7Var2.f124339a;
            o13.r.b(objV0);
            v2Var2 = (com.garmin.android.apps.connectmobile.v2) objV0;
            if (v2Var2 instanceof com.garmin.android.apps.connectmobile.v2.b) {
                com.garmin.android.apps.connectmobile.a2 a2Var3 = com.garmin.android.apps.connectmobile.a2.SUBSCRIPTIONS;
                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                com.garmin.android.apps.connectmobile.i2.a.b(a2Var3, "SetDashboardSectionVisibilityUseCaseImpl", "invoke: updateDashboardConfig success");
                com.garmin.android.apps.connectmobile.g3.a aVar3 = com.garmin.android.apps.connectmobile.g3.f35298f;
                Boolean boolValueOf2 = Boolean.valueOf(list.contains(fVar2));
                aVar3.getClass();
                return com.garmin.android.apps.connectmobile.g3.a.d(boolValueOf2);
            }
            if (v2Var2 instanceof com.garmin.android.apps.connectmobile.v2.a) {
                lc.u0.r();
                return null;
            }
            com.garmin.android.apps.connectmobile.a2 a2Var4 = com.garmin.android.apps.connectmobile.a2.SUBSCRIPTIONS;
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.f(a2Var4, "SetDashboardSectionVisibilityUseCaseImpl", "invoke: updateDashboardConfig error");
            return com.garmin.android.apps.connectmobile.g3.a.a(com.garmin.android.apps.connectmobile.g3.f35298f, null, null, Boolean.TRUE, null, 11);
        }
        o13.r.b(objV0);
        l70.c cVar2 = this.f124291a;
        r53.b2 b2Var = this.f124292b;
        if (z14) {
            if (((List) b2Var.f150540a.getValue()).contains(fVar)) {
                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                com.garmin.android.apps.connectmobile.i2.a.f(com.garmin.android.apps.connectmobile.a2.SUBSCRIPTIONS, "SetDashboardSectionVisibilityUseCaseImpl", "tried to add section " + fVar + " and it was already visible");
                return com.garmin.android.apps.connectmobile.g3.a.a(com.garmin.android.apps.connectmobile.g3.f35298f, null, null, Boolean.TRUE, null, 11);
            }
            Set setF1 = p13.h0.f1((Iterable) b2Var.f150540a.getValue());
            setF1.add(fVar);
            List listB1 = p13.h0.b1(setF1);
            j7Var2.f124339a = fVar;
            j7Var2.f124340b = listB1;
            j7Var2.f124343e = 1;
            objV0 = l70.c.V0(cVar2, null, listB1, null, null, null, j7Var2, 29);
            if (objV0 != aVar) {
                fVar3 = fVar;
                list2 = listB1;
                v2Var = (com.garmin.android.apps.connectmobile.v2) objV0;
                if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
                    com.garmin.android.apps.connectmobile.a2 a2Var5 = com.garmin.android.apps.connectmobile.a2.SUBSCRIPTIONS;
                    com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                    com.garmin.android.apps.connectmobile.i2.a.b(a2Var5, "SetDashboardSectionVisibilityUseCaseImpl", "invoke: updateDashboardConfig success");
                    com.garmin.android.apps.connectmobile.g3.a aVar4 = com.garmin.android.apps.connectmobile.g3.f35298f;
                    Boolean boolValueOf3 = Boolean.valueOf(list2.contains(fVar3));
                    aVar4.getClass();
                    return com.garmin.android.apps.connectmobile.g3.a.d(boolValueOf3);
                }
                if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.a) {
                    lc.u0.r();
                    return null;
                }
                com.garmin.android.apps.connectmobile.a2 a2Var6 = com.garmin.android.apps.connectmobile.a2.SUBSCRIPTIONS;
                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                com.garmin.android.apps.connectmobile.i2.a.f(a2Var6, "SetDashboardSectionVisibilityUseCaseImpl", "updateDashboardConfig error");
                return com.garmin.android.apps.connectmobile.g3.a.a(com.garmin.android.apps.connectmobile.g3.f35298f, null, null, Boolean.FALSE, null, 11);
            }
        } else {
            if (!((List) b2Var.f150540a.getValue()).contains(fVar)) {
                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                com.garmin.android.apps.connectmobile.i2.a.f(com.garmin.android.apps.connectmobile.a2.SUBSCRIPTIONS, "SetDashboardSectionVisibilityUseCaseImpl", "tried to remove section " + fVar + " and it was already hidden");
                return com.garmin.android.apps.connectmobile.g3.a.a(com.garmin.android.apps.connectmobile.g3.f35298f, null, null, Boolean.FALSE, null, 11);
            }
            Set setF2 = p13.h0.f1((Iterable) b2Var.f150540a.getValue());
            setF2.remove(fVar);
            List listB2 = p13.h0.b1(setF2);
            j7Var2.f124339a = fVar;
            j7Var2.f124340b = listB2;
            j7Var2.f124343e = 2;
            objV0 = l70.c.V0(cVar2, null, listB2, null, null, null, j7Var2, 29);
            if (objV0 != aVar) {
                fVar2 = fVar;
                list = listB2;
                v2Var2 = (com.garmin.android.apps.connectmobile.v2) objV0;
                if (v2Var2 instanceof com.garmin.android.apps.connectmobile.v2.b) {
                    com.garmin.android.apps.connectmobile.a2 a2Var7 = com.garmin.android.apps.connectmobile.a2.SUBSCRIPTIONS;
                    com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                    com.garmin.android.apps.connectmobile.i2.a.b(a2Var7, "SetDashboardSectionVisibilityUseCaseImpl", "invoke: updateDashboardConfig success");
                    com.garmin.android.apps.connectmobile.g3.a aVar5 = com.garmin.android.apps.connectmobile.g3.f35298f;
                    Boolean boolValueOf4 = Boolean.valueOf(list.contains(fVar2));
                    aVar5.getClass();
                    return com.garmin.android.apps.connectmobile.g3.a.d(boolValueOf4);
                }
                if (v2Var2 instanceof com.garmin.android.apps.connectmobile.v2.a) {
                    lc.u0.r();
                    return null;
                }
                com.garmin.android.apps.connectmobile.a2 a2Var8 = com.garmin.android.apps.connectmobile.a2.SUBSCRIPTIONS;
                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                com.garmin.android.apps.connectmobile.i2.a.f(a2Var8, "SetDashboardSectionVisibilityUseCaseImpl", "invoke: updateDashboardConfig error");
                return com.garmin.android.apps.connectmobile.g3.a.a(com.garmin.android.apps.connectmobile.g3.f35298f, null, null, Boolean.TRUE, null, 11);
            }
        }
        return aVar;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ln70/i7$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
