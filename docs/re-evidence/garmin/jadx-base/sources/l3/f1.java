package l3;

import java.util.LinkedHashMap;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ll3/f1;", "La2/i;", "underlyingInteractionSource", "Ln4/c;", "delta", "<init>", "(La2/i;JLkotlin/jvm/internal/j;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f1 implements a2.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f109235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f109236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f109237c;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements r53.i<a2.h> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f109238a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f1 f109239b;

        /* JADX INFO: renamed from: l3.f1$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lt13/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        public static final class C2088a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f109240a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f1 f109241b;

            /* JADX INFO: renamed from: l3.f1$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            @v13.e(c = "androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1$2", f = "MappedInteractionSource.kt", l = {219}, m = "emit")
            public static final class C2089a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f109242a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f109243b;

                public C2089a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f109242a = obj;
                    this.f109243b |= Integer.MIN_VALUE;
                    return C2088a.this.emit(null, this);
                }
            }

            public C2088a(r53.j jVar, f1 f1Var) {
                this.f109240a = jVar;
                this.f109241b = f1Var;
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
                C2089a c2089a;
                a2.l.c cVar;
                a2.l.a aVar;
                Object cVar2;
                if (dVar instanceof C2089a) {
                    c2089a = (C2089a) dVar;
                    int i14 = c2089a.f109243b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c2089a.f109243b = i14 - Integer.MIN_VALUE;
                    } else {
                        c2089a = new C2089a(dVar);
                    }
                } else {
                    c2089a = new C2089a(dVar);
                }
                Object obj2 = c2089a.f109242a;
                u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
                int i15 = c2089a.f109243b;
                if (i15 == 0) {
                    o13.r.b(obj2);
                    a2.h hVar = (a2.h) obj;
                    boolean z14 = hVar instanceof a2.l.b;
                    f1 f1Var = this.f109241b;
                    if (z14) {
                        f1Var.getClass();
                        a2.l.b bVar = new a2.l.b(n4.c.i(((a2.l.b) hVar).f497a, f1Var.f109235a), null);
                        f1Var.f109236b.put(hVar, bVar);
                        cVar2 = bVar;
                    } else if (hVar instanceof a2.l.a) {
                        aVar = (a2.l.a) hVar;
                        a2.l.b bVar2 = (a2.l.b) f1Var.f109236b.remove(aVar.f496a);
                        if (bVar2 != null) {
                            cVar2 = aVar;
                            cVar2 = new a2.l.a(bVar2);
                        }
                    } else if (hVar instanceof a2.l.c) {
                        cVar = (a2.l.c) hVar;
                        a2.l.b bVar3 = (a2.l.b) f1Var.f109236b.remove(cVar.f498a);
                        if (bVar3 != null) {
                            cVar2 = hVar;
                            cVar2 = cVar;
                            cVar2 = new a2.l.c(bVar3);
                        }
                    }
                    cVar2 = hVar;
                    cVar2 = cVar;
                    cVar2 = hVar;
                    cVar2 = aVar;
                    c2089a.f109243b = 1;
                    if (this.f109240a.emit(cVar2, c2089a) == aVar2) {
                        return aVar2;
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

        public a(r53.i iVar, f1 f1Var) {
            this.f109238a = iVar;
            this.f109239b = f1Var;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super a2.h> jVar, t13.d dVar) {
            Object objCollect = this.f109238a.collect(new C2088a(jVar, this.f109239b), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    private f1(a2.i iVar, long j8) {
        this.f109235a = j8;
        this.f109236b = new LinkedHashMap();
        this.f109237c = new a(iVar.c(), this);
    }

    @Override // a2.i
    public final r53.i<a2.h> c() {
        return this.f109237c;
    }

    public /* synthetic */ f1(a2.i iVar, long j8, p005kotlin.jvm.internal.j jVar) {
        this(iVar, j8);
    }
}
