package s53;

import ch.qos.logback.core.CoreConstants;
import o53.d0;
import o53.l1;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BA\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ls53/g;", "T", "Ls53/f;", "Lr53/i;", "flow", "", "concurrency", "Lt13/g;", CoreConstants.CONTEXT_SCOPE_VALUE, "capacity", "Lq53/a;", "onBufferOverflow", "<init>", "(Lr53/i;ILt13/g;ILq53/a;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g<T> extends f<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r53.i<r53.i<T>> f157484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f157485e;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l1 f157486a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ z53.d f157487b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ q53.t<T> f157488c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ z<T> f157489d;

        /* JADX INFO: renamed from: s53.g$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
        @v13.e(c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1", f = "Merge.kt", l = {65}, m = "invokeSuspend")
        public static final class C2969a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f157490a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r53.i<T> f157491b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ z<T> f157492c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ z53.d f157493d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C2969a(r53.i<? extends T> iVar, z<T> zVar, z53.d dVar, t13.d<? super C2969a> dVar2) {
                super(2, dVar2);
                this.f157491b = iVar;
                this.f157492c = zVar;
                this.f157493d = dVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C2969a(this.f157491b, this.f157492c, this.f157493d, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C2969a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f157490a;
                z53.d dVar = this.f157493d;
                try {
                    if (i14 == 0) {
                        o13.r.b(obj);
                        r53.i<T> iVar = this.f157491b;
                        z<T> zVar = this.f157492c;
                        this.f157490a = 1;
                        if (iVar.collect(zVar, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i14 != 1) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        o13.r.b(obj);
                    }
                    dVar.release();
                    return Unit.INSTANCE;
                } catch (Throwable th3) {
                    dVar.release();
                    throw th3;
                }
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @v13.e(c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2", f = "Merge.kt", l = {62}, m = "emit")
        public static final class b extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public a f157494a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public r53.i f157495b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f157496c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ a<T> f157497d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f157498e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(a<? super T> aVar, t13.d<? super b> dVar) {
                super(dVar);
                this.f157497d = aVar;
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f157496c = obj;
                this.f157498e |= Integer.MIN_VALUE;
                return this.f157497d.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(l1 l1Var, z53.d dVar, q53.t<? super T> tVar, z<T> zVar) {
            this.f157486a = l1Var;
            this.f157487b = dVar;
            this.f157488c = tVar;
            this.f157489d = zVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // r53.j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(r53.i<? extends T> iVar, t13.d<? super Unit> dVar) {
            b bVar;
            a<T> aVar;
            if (dVar instanceof b) {
                bVar = (b) dVar;
                int i14 = bVar.f157498e;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    bVar.f157498e = i14 - Integer.MIN_VALUE;
                } else {
                    bVar = new b(this, dVar);
                }
            } else {
                bVar = new b(this, dVar);
            }
            Object obj = bVar.f157496c;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i15 = bVar.f157498e;
            if (i15 == 0) {
                o13.r.b(obj);
                l1 l1Var = this.f157486a;
                if (l1Var != null && !l1Var.isActive()) {
                    throw l1Var.Q();
                }
                bVar.f157494a = this;
                bVar.f157495b = iVar;
                bVar.f157498e = 1;
                if (this.f157487b.b(bVar) == aVar2) {
                    return aVar2;
                }
                aVar = this;
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                iVar = bVar.f157495b;
                aVar = bVar.f157494a;
                o13.r.b(obj);
            }
            ge1.b.T(aVar.f157488c, null, null, new C2969a(iVar, aVar.f157489d, aVar.f157487b, null), 3);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ g(r53.i iVar, int i14, t13.g gVar, int i15, q53.a aVar, int i16, p005kotlin.jvm.internal.j jVar) {
        this(iVar, i14, (i16 & 4) != 0 ? t13.h.f161748a : gVar, (i16 & 8) != 0 ? -2 : i15, (i16 & 16) != 0 ? q53.a.SUSPEND : aVar);
    }

    @Override // s53.f
    public final String g() {
        return "concurrency=" + this.f157485e;
    }

    @Override // s53.f
    public final Object h(q53.t<? super T> tVar, t13.d<? super Unit> dVar) {
        Object objCollect = this.f157484d.collect(new a((l1) dVar.getF157466b().get(l1.f129368i0), z53.h.a(this.f157485e), tVar, new z(tVar)), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }

    @Override // s53.f
    public final f<T> i(t13.g gVar, int i14, q53.a aVar) {
        return new g(this.f157484d, this.f157485e, gVar, i14, aVar);
    }

    @Override // s53.f
    public final q53.v<T> k(o53.b0 b0Var) {
        e23.p eVar = new e(this, null);
        q53.a aVar = q53.a.SUSPEND;
        d0 d0Var = d0.DEFAULT;
        q53.s sVar = new q53.s(o53.y.b(b0Var, this.f157481a), q53.l.a(this.f157482b, 4, aVar));
        sVar.v0(d0Var, sVar, eVar);
        return sVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(r53.i<? extends r53.i<? extends T>> iVar, int i14, t13.g gVar, int i15, q53.a aVar) {
        super(gVar, i15, aVar);
        this.f157484d = iVar;
        this.f157485e = i14;
    }
}
