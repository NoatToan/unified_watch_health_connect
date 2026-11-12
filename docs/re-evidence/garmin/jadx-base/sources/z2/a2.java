package z2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$contextMenuAreaModifier$2", f = "TextFieldSelectionManager.kt", l = {241, 243}, m = "invokeSuspend", v = 1)
public final class a2 extends v13.i implements e23.l<t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f201519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h2 f201520b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(h2 h2Var, t13.d<? super a2> dVar) {
        super(1, dVar);
        this.f201520b = h2Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new a2(this.f201520b, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super Unit> dVar) {
        return ((a2) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        if (r8.a(r1, r5, r7) == r0) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f201519a;
        h2 h2Var = this.f201520b;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f201519a = 1;
            if (h2Var.C(this) != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        h2Var.C = true;
        return Unit.INSTANCE;
        o13.p pVarA = h2.a(h2Var);
        if (pVarA != null) {
            String str = (String) pVarA.f128594a;
            long j8 = ((s5.w0) pVarA.f128595b).f157317a;
            q qVar = h2Var.f201613j;
            if (qVar != null) {
                this.f201519a = 2;
            }
        }
        h2Var.C = true;
        return Unit.INSTANCE;
    }
}
