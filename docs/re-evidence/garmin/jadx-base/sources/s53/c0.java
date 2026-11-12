package s53;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ls53/c0;", "T", "Lr53/j;", "downstream", "Lt13/g;", "emitContext", "<init>", "(Lr53/j;Lt13/g;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c0<T> implements r53.j<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t13.g f157468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f157469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f157470c;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n"}, d2 = {"<anonymous>", "", "T", "it"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @v13.e(c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", f = "ChannelFlow.kt", l = {208}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.p<T, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f157471a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f157472b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r53.j<T> f157473c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(r53.j<? super T> jVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f157473c = jVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f157473c, dVar);
            aVar.f157472b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(Object obj, t13.d<? super Unit> dVar) {
            return ((a) create(obj, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type t13.d to s53.c0$a for r3v1 'this'  t13.d
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // v13.a
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                u13.a r0 = u13.a.COROUTINE_SUSPENDED
                int r1 = r3.f157471a
                r2 = 1
                if (r1 == 0) goto L14
                if (r1 != r2) goto Ld
                o13.r.b(r4)
                goto L24
            Ld:
                java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                vb.h.z(r4)
                r4 = 0
                return r4
            L14:
                o13.r.b(r4)
                java.lang.Object r4 = r3.f157472b
                r3.f157471a = r2
                r53.j<T> r1 = r3.f157473c
                java.lang.Object r4 = r1.emit(r4, r3)
                if (r4 != r0) goto L24
                return r0
            L24:
                kotlin.Unit r4 = p005kotlin.Unit.INSTANCE
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: s53.c0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public c0(r53.j<? super T> jVar, t13.g gVar) {
        this.f157468a = gVar;
        this.f157469b = u53.z.b(gVar);
        this.f157470c = new a(jVar, null);
    }

    @Override // r53.j
    public final Object emit(T t7, t13.d<? super Unit> dVar) {
        Object objA = b.a(this.f157468a, t7, this.f157469b, this.f157470c, dVar);
        return objA == u13.a.COROUTINE_SUSPENDED ? objA : Unit.INSTANCE;
    }
}
