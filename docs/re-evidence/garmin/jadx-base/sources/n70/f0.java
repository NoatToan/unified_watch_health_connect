package n70;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f0 implements r53.i<List<? extends String>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r53.i f124195a;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.j f124196a;

        /* JADX INFO: renamed from: n70.f0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetDashboardItemsUseCase$getDashboardLastSevenDaysStats$$inlined$map$1$2", f = "GetDashboardItemsUseCase.kt", l = {50}, m = "emit", v = 2)
        public static final class C2348a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f124197a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f124198b;

            public C2348a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f124197a = obj;
                this.f124198b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(r53.j jVar) {
            this.f124196a = jVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v3, types: [r53.j] */
        /* JADX WARN: Type inference failed for: r6v2, types: [p13.j0] */
        /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
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
            C2348a c2348a;
            ?? arrayList;
            if (dVar instanceof C2348a) {
                c2348a = (C2348a) dVar;
                int i14 = c2348a.f124198b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c2348a.f124198b = i14 - Integer.MIN_VALUE;
                } else {
                    c2348a = new C2348a(dVar);
                }
            } else {
                c2348a = new C2348a(dVar);
            }
            Object obj2 = c2348a.f124197a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c2348a.f124198b;
            if (i15 == 0) {
                o13.r.b(obj2);
                List<j70.b> listC = ((j70.f) obj).c();
                if (listC != null) {
                    arrayList = new ArrayList(p13.y.r(listC, 10));
                    Iterator<T> it = listC.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((j70.b) it.next()).getCardType());
                    }
                } else {
                    arrayList = p13.j0.f134944a;
                }
                c2348a.f124198b = 1;
                if (this.f124196a.emit(arrayList, c2348a) == aVar) {
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

    public f0(r53.i iVar) {
        this.f124195a = iVar;
    }

    @Override // r53.i
    public final Object collect(r53.j<? super List<? extends String>> jVar, t13.d dVar) {
        Object objCollect = this.f124195a.collect(new a(jVar), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
