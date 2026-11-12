package n70;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a6 implements r53.i<List<? extends r70.s>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r53.i f124025a;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.j f124026a;

        /* JADX INFO: renamed from: n70.a6$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetTemporaryItemsUseCase$invoke$$inlined$mapNotNull$1$2", f = "GetTemporaryItemsUseCase.kt", l = {78}, m = "emit", v = 2)
        public static final class C2334a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f124027a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f124028b;

            public C2334a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f124027a = obj;
                this.f124028b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(r53.j jVar) {
            this.f124026a = jVar;
        }

        /* JADX WARN: Code duplicated, block: B:50:0x00c4  */
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
            C2334a c2334a;
            Collection collectionB1;
            j70.d dVar2;
            yz1.d dVar3;
            yz1.d dVar4;
            if (dVar instanceof C2334a) {
                c2334a = (C2334a) dVar;
                int i14 = c2334a.f124028b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c2334a.f124028b = i14 - Integer.MIN_VALUE;
                } else {
                    c2334a = new C2334a(dVar);
                }
            } else {
                c2334a = new C2334a(dVar);
            }
            Object obj2 = c2334a.f124027a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c2334a.f124028b;
            if (i15 == 0) {
                o13.r.b(obj2);
                o13.p pVar = (o13.p) obj;
                List list = (List) pVar.f128594a;
                j70.k.f fVar = (j70.k.f) pVar.f128595b;
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        if ((fVar != null ? fVar.K : null) != null) {
                            collectionB1 = p13.h0.b1(arrayList);
                        } else {
                            if ((fVar != null ? fVar.f97585u : null) == null) {
                                collectionB1 = new ArrayList();
                            } else {
                                collectionB1 = p13.h0.b1(arrayList);
                            }
                        }
                        if (collectionB1 == null) {
                            break;
                        }
                        c2334a.f124028b = 1;
                        if (this.f124026a.emit(collectionB1, c2334a) != aVar) {
                            break;
                        }
                        return aVar;
                    }
                    o70.y yVar = (o70.y) it.next();
                    int i16 = z5.a.f124824a[yVar.ordinal()];
                    if (i16 == 1) {
                        if (fVar == null || (dVar3 = fVar.f97565a) == null) {
                            dVar3 = new yz1.d(yz1.u.LOADING, null, false, 6, null);
                        }
                        dVar2 = new j70.d(dVar3, fVar != null ? fVar.K : null);
                    } else {
                        if (i16 != 2) {
                            lc.u0.r();
                            return null;
                        }
                        if (fVar == null || (dVar4 = fVar.f97565a) == null) {
                            dVar4 = new yz1.d(yz1.u.LOADING, null, false, 6, null);
                        }
                        dVar2 = new j70.d(dVar4, fVar != null ? fVar.f97585u : null);
                    }
                    r70.s sVarB = m70.f.b(dVar2, yVar.a());
                    if (sVarB != null) {
                        arrayList.add(sVarB);
                    }
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

    public a6(r53.i iVar) {
        this.f124025a = iVar;
    }

    @Override // r53.i
    public final Object collect(r53.j<? super List<? extends r70.s>> jVar, t13.d dVar) {
        Object objCollect = this.f124025a.collect(new a(jVar), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
