package p3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "Lp3/k2;", "", "<anonymous>", "(Lp3/k2;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1", f = "SnapshotFlow.kt", l = {72, 73}, m = "invokeSuspend", v = 1)
public final class v3 extends v13.i implements e23.p<k2<Object>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f135353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f135354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t13.g f135355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r53.i<Object> f135356d;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k2<Object> f135357a;

        public a(k2<Object> k2Var) {
            this.f135357a = k2Var;
        }

        @Override // r53.j
        public final Object emit(T t7, t13.d<? super Unit> dVar) {
            this.f135357a.setValue(t7);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1$2", f = "SnapshotFlow.kt", l = {73}, m = "invokeSuspend", v = 1)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f135358a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ r53.i<Object> f135359b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k2<Object> f135360c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ k2<Object> f135361a;

            public a(k2<Object> k2Var) {
                this.f135361a = k2Var;
            }

            @Override // r53.j
            public final Object emit(T t7, t13.d<? super Unit> dVar) {
                this.f135361a.setValue(t7);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(r53.i<Object> iVar, k2<Object> k2Var, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f135359b = iVar;
            this.f135360c = k2Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f135359b, this.f135360c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f135358a;
            if (i14 == 0) {
                o13.r.b(obj);
                a aVar2 = new a(this.f135360c);
                this.f135358a = 1;
                if (this.f135359b.collect(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(t13.g gVar, r53.i<Object> iVar, t13.d<? super v3> dVar) {
        super(2, dVar);
        this.f135355c = gVar;
        this.f135356d = iVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        v3 v3Var = new v3(this.f135355c, this.f135356d, dVar);
        v3Var.f135354b = obj;
        return v3Var;
    }

    @Override // e23.p
    public final Object invoke(k2<Object> k2Var, t13.d<? super Unit> dVar) {
        return ((v3) create(k2Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r5.collect(r1, r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
    
        if (ge1.b.e0(r4, r1, r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
    
        return r0;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f135353a;
        if (i14 == 0) {
            o13.r.b(obj);
            k2 k2Var = (k2) this.f135354b;
            t13.h hVar = t13.h.f161748a;
            t13.g gVar = this.f135355c;
            boolean zG = p005kotlin.jvm.internal.s.g(gVar, hVar);
            r53.i<Object> iVar = this.f135356d;
            if (zG) {
                a aVar2 = new a(k2Var);
                this.f135353a = 1;
            } else {
                b bVar = new b(iVar, k2Var, null);
                this.f135353a = 2;
            }
        } else {
            if (i14 != 1 && i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
