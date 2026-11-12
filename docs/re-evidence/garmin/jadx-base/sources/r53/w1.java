package r53;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "Lr53/j;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2", f = "Zip.kt", l = {269}, m = "invokeSuspend")
public final class w1 extends v13.i implements e23.p<j<Object>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f150926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f150927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i[] f150928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.r f150929d;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lr53/j;", "", "it", "", "<anonymous>", "(Lr53/j;Lkotlin/Array;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2$1", f = "Zip.kt", l = {270}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.q<j<Object>, Object[], t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f150930a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ j f150931b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object[] f150932c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.r f150933d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t13.d dVar, e23.r rVar) {
            super(3, dVar);
            this.f150933d = rVar;
        }

        @Override // e23.q
        public final Object invoke(j<Object> jVar, Object[] objArr, t13.d<? super Unit> dVar) {
            a aVar = new a(dVar, this.f150933d);
            aVar.f150931b = jVar;
            aVar.f150932c = objArr;
            return aVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f150930a;
            if (i14 == 0) {
                o13.r.b(obj);
                j jVar = this.f150931b;
                Object[] objArr = this.f150932c;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                this.f150930a = 1;
                if (this.f150933d.invoke(jVar, obj2, obj3, this) == aVar) {
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
    public w1(i[] iVarArr, t13.d dVar, e23.r rVar) {
        super(2, dVar);
        this.f150928c = iVarArr;
        this.f150929d = rVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        w1 w1Var = new w1(this.f150928c, dVar, this.f150929d);
        w1Var.f150927b = obj;
        return w1Var;
    }

    @Override // e23.p
    public final Object invoke(j<Object> jVar, t13.d<? super Unit> dVar) {
        return ((w1) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f150926a;
        if (i14 == 0) {
            o13.r.b(obj);
            j jVar = (j) this.f150927b;
            x1 x1Var = x1.f150941a;
            a aVar2 = new a(null, this.f150929d);
            this.f150926a = 1;
            if (s53.m.a(this.f150928c, x1Var, aVar2, jVar, this) == aVar) {
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
