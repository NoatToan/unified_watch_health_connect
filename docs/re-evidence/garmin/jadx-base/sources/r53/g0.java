package r53;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class g0<T> implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p005kotlin.jvm.internal.p0 f150624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f150625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j<T> f150626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f150627d;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @v13.e(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1", f = "Limit.kt", l = {59, 61}, m = "emit")
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f150628a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g0<T> f150629b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f150630c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(g0<? super T> g0Var, t13.d<? super a> dVar) {
            super(dVar);
            this.f150629b = g0Var;
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f150628a = obj;
            this.f150630c |= Integer.MIN_VALUE;
            return this.f150629b.emit(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g0(p005kotlin.jvm.internal.p0 p0Var, int i14, j<? super T> jVar, Object obj) {
        this.f150624a = p0Var;
        this.f150625b = i14;
        this.f150626c = jVar;
        this.f150627d = obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        if (r5.emit(r7, r0) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
    
        if (r53.s.a(r5, r7, r6.f150627d, r0) == r1) goto L25;
     */
    @Override // r53.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(T t7, t13.d<? super Unit> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f150630c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f150630c = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, dVar);
            }
        } else {
            aVar = new a(this, dVar);
        }
        Object obj = aVar.f150628a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f150630c;
        if (i15 != 0) {
            if (i15 == 1) {
                o13.r.b(obj);
                return Unit.INSTANCE;
            }
            if (i15 == 2) {
                o13.r.b(obj);
                return Unit.INSTANCE;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        p005kotlin.jvm.internal.p0 p0Var = this.f150624a;
        int i16 = p0Var.f105807a + 1;
        p0Var.f105807a = i16;
        int i17 = this.f150625b;
        j<T> jVar = this.f150626c;
        if (i16 < i17) {
            aVar.f150630c = 1;
        } else {
            aVar.f150630c = 2;
        }
        return aVar2;
    }
}
