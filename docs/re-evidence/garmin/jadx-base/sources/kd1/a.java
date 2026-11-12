package kd1;

import lc.u0;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements r53.i<c<Object>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r53.i f104489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f104490b;

    /* JADX INFO: renamed from: kd1.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C1996a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.j f104491a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.l f104492b;

        /* JADX INFO: renamed from: kd1.a$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.reminders.domain.GetCustomRemindersUseCase$invoke$$inlined$map$1$2", f = "GetCustomRemindersUseCase.kt", l = {50}, m = "emit", v = 2)
        public static final class C1997a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f104493a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f104494b;

            public C1997a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f104493a = obj;
                this.f104494b |= Integer.MIN_VALUE;
                return C1996a.this.emit(null, this);
            }
        }

        public C1996a(r53.j jVar, e23.l lVar) {
            this.f104491a = jVar;
            this.f104492b = lVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
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
            C1997a c1997a;
            if (dVar instanceof C1997a) {
                c1997a = (C1997a) dVar;
                int i14 = c1997a.f104494b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c1997a.f104494b = i14 - Integer.MIN_VALUE;
                } else {
                    c1997a = new C1997a(dVar);
                }
            } else {
                c1997a = new C1997a(dVar);
            }
            Object obj2 = c1997a.f104493a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c1997a.f104494b;
            if (i15 == 0) {
                r.b(obj2);
                c cVar = (c) obj;
                Object c1998c = c.b.f104498a;
                if (!s.g(cVar, c1998c)) {
                    c1998c = c.a.f104497a;
                    if (!s.g(cVar, c1998c)) {
                        if (!(cVar instanceof c.C1998c)) {
                            u0.r();
                            return null;
                        }
                        pd1.c cVar2 = (pd1.c) ((c.C1998c) cVar).f104499a;
                        c1998c = new c.C1998c(cVar2 != null ? this.f104492b.invoke(cVar2) : null);
                    }
                }
                c1997a.f104494b = 1;
                if (this.f104491a.emit(c1998c, c1997a) == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj2);
            }
            return Unit.INSTANCE;
        }
    }

    public a(r53.i iVar, e23.l lVar) {
        this.f104489a = iVar;
        this.f104490b = lVar;
    }

    @Override // r53.i
    public final Object collect(r53.j<? super c<Object>> jVar, t13.d dVar) {
        Object objCollect = this.f104489a.collect(new C1996a(jVar, this.f104490b), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
