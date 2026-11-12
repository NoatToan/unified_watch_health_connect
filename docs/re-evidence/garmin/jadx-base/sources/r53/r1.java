package r53;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r1 implements i<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i[] f150840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.r f150841b;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lr53/j;", "", "it", "", "<anonymous>", "(Lr53/j;Lkotlin/Array;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2", f = "Zip.kt", l = {259, 258}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.q<j<Object>, Object[], t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f150842a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ j f150843b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object[] f150844c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.r f150845d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t13.d dVar, e23.r rVar) {
            super(3, dVar);
            this.f150845d = rVar;
        }

        @Override // e23.q
        public final Object invoke(j<Object> jVar, Object[] objArr, t13.d<? super Unit> dVar) {
            a aVar = new a(dVar, this.f150845d);
            aVar.f150843b = jVar;
            aVar.f150844c = objArr;
            return aVar.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
        
            if (r1.emit(r7, r6) == r0) goto L15;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            j jVar;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f150842a;
            if (i14 != 0) {
                if (i14 == 1) {
                    jVar = this.f150843b;
                    o13.r.b(obj);
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
            o13.r.b(obj);
            jVar = this.f150843b;
            Object[] objArr = this.f150844c;
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            Object obj4 = objArr[2];
            this.f150843b = jVar;
            this.f150842a = 1;
            obj = this.f150845d.invoke(obj2, obj3, obj4, this);
            if (obj != aVar) {
            }
            return aVar;
            this.f150843b = null;
            this.f150842a = 2;
        }
    }

    public r1(i[] iVarArr, e23.r rVar) {
        this.f150840a = iVarArr;
        this.f150841b = rVar;
    }

    @Override // r53.i
    public final Object collect(j<? super Object> jVar, t13.d dVar) {
        Object objA = s53.m.a(this.f150840a, x1.f150941a, new a(null, this.f150841b), jVar, dVar);
        return objA == u13.a.COROUTINE_SUSPENDED ? objA : Unit.INSTANCE;
    }
}
