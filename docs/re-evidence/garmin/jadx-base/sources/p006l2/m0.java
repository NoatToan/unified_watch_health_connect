package p006l2;

import e23.p;
import n4.c;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import u13.a;
import v13.e;
import v13.i;
import v2.h2;
import vb.h;
import w2.n;
import z2.q;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ln4/c;", "clickLocation", "", "<anonymous>", "(Ln4/c;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "androidx.compose.foundation.text.CommonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1", f = "CommonContextMenuArea.kt", l = {82, 83}, m = "invokeSuspend", v = 1)
public final class m0 extends i implements p<c, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f108649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ long f108650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f108651c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(n nVar, d<? super m0> dVar) {
        super(2, dVar);
        this.f108651c = nVar;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        m0 m0Var = new m0(this.f108651c, dVar);
        m0Var.f108650b = ((c) obj).f123544a;
        return m0Var;
    }

    @Override // e23.p
    public final Object invoke(c cVar, d<? super Unit> dVar) {
        return ((m0) create(c.a(cVar.f123544a), dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
    
        if (r10.b(r3, r7, r9) == r0) goto L17;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j8;
        a aVar = a.COROUTINE_SUSPENDED;
        int i14 = this.f108649a;
        n nVar = this.f108651c;
        if (i14 == 0) {
            r.b(obj);
            j8 = this.f108650b;
            this.f108650b = j8;
            this.f108649a = 1;
            if (nVar.F() != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            j8 = this.f108650b;
            r.b(obj);
        } else {
            if (i14 != 2) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
        q qVar = nVar.f181372h;
        h2 h2Var = nVar.f181365a;
        if (qVar != null) {
            CharSequence charSequence = h2Var.d().f167839c;
            long j14 = h2Var.d().f167840d;
            c.a(j8);
            this.f108649a = 2;
        }
        return Unit.INSTANCE;
    }
}
