package zz2;

import a03.r0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "com.skydoves.flexible.bottomsheet.material3.FlexibleBottomSheetKt$FlexibleBottomSheet$settleToDismiss$1$1", f = "FlexibleBottomSheet.kt", l = {123}, m = "invokeSuspend")
public final class b0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f207649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a03.p f207650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f207651c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(a03.p pVar, float f14, t13.d<? super b0> dVar) {
        super(2, dVar);
        this.f207650b = pVar;
        this.f207651c = f14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b0(this.f207650b, this.f207651c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objA;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f207649a;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f207649a = 1;
            r0<a03.y> r0Var = this.f207650b.f158i;
            s1.k kVarD = r0Var.f170a;
            T f182175a = r0Var.f177h.getF182175a();
            float f14 = r0Var.f();
            float f15 = this.f207651c;
            Object objB = r0Var.b(f14, f15, f182175a);
            if (r0Var.f171b.invoke((T) objB).booleanValue()) {
                if (p005kotlin.jvm.internal.s.g(f182175a, objB)) {
                    kVarD = s1.l.d(0, 0, null, 7);
                }
                objA = r0Var.a(objB, f15, kVarD, this);
                if (objA != obj2) {
                    objA = Unit.INSTANCE;
                }
            } else {
                objA = r0Var.a(f182175a, f15, kVarD, this);
                if (objA != obj2) {
                    objA = Unit.INSTANCE;
                }
            }
            if (objA != obj2) {
                objA = Unit.INSTANCE;
            }
            if (objA == obj2) {
                return obj2;
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
