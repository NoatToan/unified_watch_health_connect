package z2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$maybeSuggestSelection$1", f = "TextFieldSelectionManager.kt", l = {567}, m = "invokeSuspend", v = 1)
public final class g2 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f201590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f201591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f201592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f201593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s5.w0 f201594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h2 f201595f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x5.c0 f201596g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(q qVar, String str, long j8, s5.w0 w0Var, h2 h2Var, x5.c0 c0Var, t13.d<? super g2> dVar) {
        super(2, dVar);
        this.f201591b = qVar;
        this.f201592c = str;
        this.f201593d = j8;
        this.f201594e = w0Var;
        this.f201595f = h2Var;
        this.f201596g = c0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g2(this.f201591b, this.f201592c, this.f201593d, this.f201594e, this.f201595f, this.f201596g, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g2) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f201590a;
        String str = this.f201592c;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f201590a = 1;
            obj = this.f201591b.c(str, this.f201593d, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        s5.w0 w0Var = (s5.w0) obj;
        if (w0Var == null) {
            return Unit.INSTANCE;
        }
        long j8 = w0Var.f157317a;
        x5.c0 c0Var = this.f201596g;
        long jL = og.a.l(c0Var.a((int) (j8 >> 32)), c0Var.a((int) (j8 & 4294967295L)));
        if (!s5.w0.c(jL, this.f201594e)) {
            h2 h2Var = this.f201595f;
            if (p005kotlin.jvm.internal.s.g(h2Var.u().f188878a.f157138b, str) && c0Var == h2Var.f201605b) {
                h2Var.f201606c.invoke(h2.k(h2Var.u().f188878a, jL));
                h2Var.f201627x = s5.w0.a(jL);
            }
        }
        return Unit.INSTANCE;
    }
}
