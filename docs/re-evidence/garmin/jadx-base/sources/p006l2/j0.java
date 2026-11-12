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
import z2.h2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "androidx.compose.foundation.text.CommonContextMenuAreaKt$CommonContextMenuArea$2$1$1", f = "CommonContextMenuArea.kt", l = {62}, m = "invokeSuspend", v = 1)
public final class j0 extends i implements p<b0, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p1 f108580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f108581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1<j2> f108582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h2 f108583d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(p1<j2> p1Var, h2 h2Var, d<? super j0> dVar) {
        super(2, dVar);
        this.f108582c = p1Var;
        this.f108583d = h2Var;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new j0(this.f108582c, this.f108583d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((j0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        p1 p1Var;
        a aVar = a.COROUTINE_SUSPENDED;
        int i14 = this.f108581b;
        if (i14 == 0) {
            r.b(obj);
            p1<j2> p1Var2 = this.f108582c;
            this.f108580a = p1Var2;
            this.f108581b = 1;
            Object objE = r0.e(this.f108583d, this);
            if (objE == aVar) {
                return aVar;
            }
            p1Var = p1Var2;
            obj = objE;
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p1Var = this.f108580a;
            r.b(obj);
        }
        p1Var.setValue(obj);
        return Unit.INSTANCE;
    }
}
