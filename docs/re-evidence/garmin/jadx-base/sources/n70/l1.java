package n70;

import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ln70/l1;", "Ln70/k1;", "Ll70/c;", "dashboardRepository", "<init>", "(Ll70/c;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l1 implements k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l70.c f124372a;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements r53.i<List<? extends o70.f>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f124373a;

        /* JADX INFO: renamed from: n70.l1$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C2366a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f124374a;

            /* JADX INFO: renamed from: n70.l1$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetDashboardSectionVisibilityUseCaseImpl$invoke$$inlined$map$1$2", f = "GetDashboardSectionVisibilityUseCaseImpl.kt", l = {50}, m = "emit", v = 2)
            public static final class C2367a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f124375a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f124376b;

                public C2367a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f124375a = obj;
                    this.f124376b |= Integer.MIN_VALUE;
                    return C2366a.this.emit(null, this);
                }
            }

            public C2366a(r53.j jVar) {
                this.f124374a = jVar;
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
                C2367a c2367a;
                ?? arrayList;
                if (dVar instanceof C2367a) {
                    c2367a = (C2367a) dVar;
                    int i14 = c2367a.f124376b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c2367a.f124376b = i14 - Integer.MIN_VALUE;
                    } else {
                        c2367a = new C2367a(dVar);
                    }
                } else {
                    c2367a = new C2367a(dVar);
                }
                Object obj2 = c2367a.f124375a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c2367a.f124376b;
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
                    c2367a.f124376b = 1;
                    if (this.f124374a.emit(arrayList, c2367a) == aVar) {
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

        public a(r53.i iVar) {
            this.f124373a = iVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super List<? extends o70.f>> jVar, t13.d dVar) {
            Object objCollect = this.f124373a.collect(new C2366a(jVar), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements r53.i<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f124378a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o70.f f124379b;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f124380a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o70.f f124381b;

            /* JADX INFO: renamed from: n70.l1$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetDashboardSectionVisibilityUseCaseImpl$invoke$$inlined$map$2$2", f = "GetDashboardSectionVisibilityUseCaseImpl.kt", l = {50}, m = "emit", v = 2)
            public static final class C2368a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f124382a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f124383b;

                public C2368a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f124382a = obj;
                    this.f124383b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar, o70.f fVar) {
                this.f124380a = jVar;
                this.f124381b = fVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C2368a c2368a;
                if (dVar instanceof C2368a) {
                    c2368a = (C2368a) dVar;
                    int i14 = c2368a.f124383b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c2368a.f124383b = i14 - Integer.MIN_VALUE;
                    } else {
                        c2368a = new C2368a(dVar);
                    }
                } else {
                    c2368a = new C2368a(dVar);
                }
                Object obj2 = c2368a.f124382a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c2368a.f124383b;
                if (i15 == 0) {
                    o13.r.b(obj2);
                    Boolean boolValueOf = Boolean.valueOf(((List) obj).contains(this.f124381b));
                    c2368a.f124383b = 1;
                    if (this.f124380a.emit(boolValueOf, c2368a) == aVar) {
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

        public b(r53.i iVar, o70.f fVar) {
            this.f124378a = iVar;
            this.f124379b = fVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super Boolean> jVar, t13.d dVar) {
            Object objCollect = this.f124378a.collect(new a(jVar, this.f124379b), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    public l1(l70.c cVar) {
        cVar.getClass();
        this.f124372a = cVar;
    }

    @Override // n70.k1
    public final r53.i<Boolean> a(o70.f fVar) {
        fVar.getClass();
        return r53.s.s(new b(new a(this.f124372a.p()), fVar));
    }
}
