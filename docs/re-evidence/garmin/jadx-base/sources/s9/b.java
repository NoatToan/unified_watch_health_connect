package s9;

import androidx.lifecycle.b0;
import androidx.lifecycle.h1;
import e23.p;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.k2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lp3/k2;", "", "<anonymous>", "(Lp3/k2;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1", f = "FlowExt.kt", l = {177}, m = "invokeSuspend", v = 1)
public final class b extends v13.i implements p<k2<Object>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f157992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f157993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0 f157994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b0.b f157995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t13.g f157996e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r53.i<Object> f157997f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1", f = "FlowExt.kt", l = {179, 181}, m = "invokeSuspend", v = 1)
    public static final class a extends v13.i implements p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f157998a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ t13.g f157999b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r53.i<Object> f158000c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ k2<Object> f158001d;

        /* JADX INFO: renamed from: s9.b$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class C2984a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ k2<T> f158002a;

            public C2984a(k2<T> k2Var) {
                this.f158002a = k2Var;
            }

            @Override // r53.j
            public final Object emit(T t7, t13.d<? super Unit> dVar) {
                this.f158002a.setValue(t7);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: s9.b$a$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
        @v13.e(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$2", f = "FlowExt.kt", l = {182}, m = "invokeSuspend", v = 1)
        public static final class C2985b extends v13.i implements p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f158003a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r53.i<Object> f158004b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ k2<Object> f158005c;

            /* JADX INFO: renamed from: s9.b$a$b$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class C2986a<T> implements r53.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ k2<T> f158006a;

                public C2986a(k2<T> k2Var) {
                    this.f158006a = k2Var;
                }

                @Override // r53.j
                public final Object emit(T t7, t13.d<? super Unit> dVar) {
                    this.f158006a.setValue(t7);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2985b(r53.i<Object> iVar, k2<Object> k2Var, t13.d<? super C2985b> dVar) {
                super(2, dVar);
                this.f158004b = iVar;
                this.f158005c = k2Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C2985b(this.f158004b, this.f158005c, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C2985b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f158003a;
                if (i14 == 0) {
                    r.b(obj);
                    C2986a c2986a = new C2986a(this.f158005c);
                    this.f158003a = 1;
                    if (this.f158004b.collect(c2986a, this) == aVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t13.g gVar, r53.i<Object> iVar, k2<Object> k2Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f157999b = gVar;
            this.f158000c = iVar;
            this.f158001d = k2Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f157999b, this.f158000c, this.f158001d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
        
            if (r5.collect(r7, r6) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
        
            if (ge1.b.e0(r1, r7, r6) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
        
            return r0;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f157998a;
            if (i14 == 0) {
                r.b(obj);
                t13.h hVar = t13.h.f161748a;
                t13.g gVar = this.f157999b;
                boolean zG = s.g(gVar, hVar);
                k2<Object> k2Var = this.f158001d;
                r53.i<Object> iVar = this.f158000c;
                if (zG) {
                    C2984a c2984a = new C2984a(k2Var);
                    this.f157998a = 1;
                } else {
                    C2985b c2985b = new C2985b(iVar, k2Var, null);
                    this.f157998a = 2;
                }
            } else {
                if (i14 != 1 && i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(b0 b0Var, b0.b bVar, t13.g gVar, r53.i<Object> iVar, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f157994c = b0Var;
        this.f157995d = bVar;
        this.f157996e = gVar;
        this.f157997f = iVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        b bVar = new b(this.f157994c, this.f157995d, this.f157996e, this.f157997f, dVar);
        bVar.f157993b = obj;
        return bVar;
    }

    @Override // e23.p
    public final Object invoke(k2<Object> k2Var, t13.d<? super Unit> dVar) {
        return ((b) create(k2Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f157992a;
        if (i14 == 0) {
            r.b(obj);
            k2 k2Var = (k2) this.f157993b;
            a aVar2 = new a(this.f157996e, this.f157997f, k2Var, null);
            this.f157992a = 1;
            if (h1.a(this.f157994c, this.f157995d, aVar2, this) == aVar) {
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
