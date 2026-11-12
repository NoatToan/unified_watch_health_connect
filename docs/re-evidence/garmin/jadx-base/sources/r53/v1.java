package r53;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "Lr53/j;", "", "", "it", "", "<anonymous>", "(Lr53/j;Lkotlin/Array;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", f = "Zip.kt", l = {29, 29}, m = "invokeSuspend")
public final class v1 extends v13.i implements e23.q<j<Object>, Object[], t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f150910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ j f150911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f150912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.q<Object, Object, t13.d<Object>, Object> f150913d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public v1(e23.q<Object, Object, ? super t13.d<Object>, ? extends Object> qVar, t13.d<? super v1> dVar) {
        super(3, dVar);
        this.f150913d = qVar;
    }

    @Override // e23.q
    public final Object invoke(j<Object> jVar, Object[] objArr, t13.d<? super Unit> dVar) {
        v1 v1Var = new v1(this.f150913d, dVar);
        v1Var.f150911b = jVar;
        v1Var.f150912c = objArr;
        return v1Var.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        if (r1.emit(r6, r5) == r0) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        j jVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f150910a;
        if (i14 != 0) {
            if (i14 == 1) {
                jVar = this.f150911b;
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
        jVar = this.f150911b;
        Object[] objArr = this.f150912c;
        Object obj2 = objArr[0];
        Object obj3 = objArr[1];
        this.f150911b = jVar;
        this.f150910a = 1;
        obj = this.f150913d.invoke(obj2, obj3, this);
        if (obj != aVar) {
        }
        return aVar;
        this.f150911b = null;
        this.f150910a = 2;
    }
}
