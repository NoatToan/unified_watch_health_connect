package o5;

import e23.p;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lo5/g;", "", "", "viewportSize", "Lkotlin/Function2;", "", "Lt13/d;", "scrollBy", "<init>", "(ILe23/p;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f129153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p<Float, t13.d<? super Float>, Object> f129154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f129155c;

    /* JADX WARN: Multi-variable type inference failed */
    public g(int i14, p<? super Float, ? super t13.d<? super Float>, ? extends Object> pVar) {
        this.f129153a = i14;
        this.f129154b = pVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(float f14, v13.c cVar) {
        f fVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i14 = fVar.f129152c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f129152c = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object objInvoke = fVar.f129150a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar.f129152c;
        if (i15 == 0) {
            r.b(objInvoke);
            Float f15 = new Float(f14);
            fVar.f129152c = 1;
            objInvoke = this.f129154b.invoke(f15, fVar);
            if (objInvoke == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objInvoke);
        }
        this.f129155c += ((Number) objInvoke).floatValue();
        return Unit.INSTANCE;
    }
}
