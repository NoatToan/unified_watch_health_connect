package z2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ln4/c;", "clickLocation", "", "<anonymous>", "(Ln4/c;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$contextMenuAreaModifier$1", f = "TextFieldSelectionManager.kt", l = {228, 230}, m = "invokeSuspend", v = 1)
public final class z1 extends v13.i implements e23.p<n4.c, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f201866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ long f201867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h2 f201868c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(h2 h2Var, t13.d<? super z1> dVar) {
        super(2, dVar);
        this.f201868c = h2Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        z1 z1Var = new z1(this.f201868c, dVar);
        z1Var.f201867b = ((n4.c) obj).f123544a;
        return z1Var;
    }

    @Override // e23.p
    public final Object invoke(n4.c cVar, t13.d<? super Unit> dVar) {
        return ((z1) create(n4.c.a(cVar.f123544a), dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        if (r10.b(r1, r7, r9) == r0) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j8;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f201866a;
        h2 h2Var = this.f201868c;
        if (i14 == 0) {
            o13.r.b(obj);
            j8 = this.f201867b;
            this.f201867b = j8;
            this.f201866a = 1;
            if (h2Var.C(this) != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            j8 = this.f201867b;
            o13.r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        o13.p pVarA = h2.a(h2Var);
        if (pVarA != null) {
            String str = (String) pVarA.f128594a;
            long j14 = ((s5.w0) pVarA.f128595b).f157317a;
            q qVar = h2Var.f201613j;
            if (qVar != null) {
                n4.c.a(j8);
                this.f201866a = 2;
            }
        }
        return Unit.INSTANCE;
    }
}
