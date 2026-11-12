package r53;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class b0<T> implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p005kotlin.jvm.internal.p0 f150533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f150534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j<T> f150535c;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @v13.e(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1", f = "Limit.kt", l = {22}, m = "emit")
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f150536a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b0<T> f150537b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f150538c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(b0<? super T> b0Var, t13.d<? super a> dVar) {
            super(dVar);
            this.f150537b = b0Var;
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f150536a = obj;
            this.f150538c |= Integer.MIN_VALUE;
            return this.f150537b.emit(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b0(p005kotlin.jvm.internal.p0 p0Var, int i14, j<? super T> jVar) {
        this.f150533a = p0Var;
        this.f150534b = i14;
        this.f150535c = jVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // r53.j
    public final Object emit(T t7, t13.d<? super Unit> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f150538c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f150538c = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, dVar);
            }
        } else {
            aVar = new a(this, dVar);
        }
        Object obj = aVar.f150536a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f150538c;
        if (i15 == 0) {
            o13.r.b(obj);
            p005kotlin.jvm.internal.p0 p0Var = this.f150533a;
            int i16 = p0Var.f105807a;
            if (i16 < this.f150534b) {
                p0Var.f105807a = i16 + 1;
                return Unit.INSTANCE;
            }
            aVar.f150538c = 1;
            if (this.f150535c.emit(t7, aVar) == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
