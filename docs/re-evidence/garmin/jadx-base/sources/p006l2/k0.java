package p006l2;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;
import t13.d;
import u13.a;
import v13.e;
import v13.i;
import vb.h;
import w2.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "androidx.compose.foundation.text.CommonContextMenuAreaKt$CommonContextMenuArea$5$1$1", f = "CommonContextMenuArea.kt", l = {122}, m = "invokeSuspend", v = 1)
public final class k0 extends i implements p<b0, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p1 f108610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f108611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1<j2> f108612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n f108613d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(p1<j2> p1Var, n nVar, d<? super k0> dVar) {
        super(2, dVar);
        this.f108612c = p1Var;
        this.f108613d = nVar;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new k0(this.f108612c, this.f108613d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((k0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        p1 p1Var;
        a aVar = a.COROUTINE_SUSPENDED;
        int i14 = this.f108611b;
        if (i14 == 0) {
            r.b(obj);
            p1<j2> p1Var2 = this.f108612c;
            this.f108610a = p1Var2;
            this.f108611b = 1;
            Object objD = r0.d(this.f108613d, this);
            if (objD == aVar) {
                return aVar;
            }
            p1Var = p1Var2;
            obj = objD;
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p1Var = this.f108610a;
            r.b(obj);
        }
        p1Var.setValue(obj);
        return Unit.INSTANCE;
    }
}
