package z2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.foundation.text.selection.SelectionManager$suggestSelectionForLongPressOrDoubleClick$2", f = "SelectionManager.kt", l = {448}, m = "invokeSuspend", v = 1)
public final class l1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f201674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o1 f201675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p005kotlin.jvm.internal.r0<CharSequence> f201676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p005kotlin.jvm.internal.r0<s5.w0> f201677d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p005kotlin.jvm.internal.q0 f201678e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(o1 o1Var, p005kotlin.jvm.internal.r0<CharSequence> r0Var, p005kotlin.jvm.internal.r0<s5.w0> r0Var2, p005kotlin.jvm.internal.q0 q0Var, t13.d<? super l1> dVar) {
        super(2, dVar);
        this.f201675b = o1Var;
        this.f201676c = r0Var;
        this.f201677d = r0Var2;
        this.f201678e = q0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l1(this.f201675b, this.f201676c, this.f201677d, this.f201678e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003a  */
    /* JADX WARN: Code duplicated, block: B:18:0x0044  */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:26:0x0065  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        s5.w0 w0Var;
        long j8;
        p005kotlin.jvm.internal.q0 q0Var;
        y yVarB;
        s5.q0 q0VarK;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f201674a;
        p005kotlin.jvm.internal.r0<s5.w0> r0Var = this.f201677d;
        p005kotlin.jvm.internal.r0<CharSequence> r0Var2 = this.f201676c;
        o1 o1Var = this.f201675b;
        if (i14 == 0) {
            o13.r.b(obj);
            q qVar = o1Var.f201733x;
            if (qVar != null) {
                CharSequence charSequence = r0Var2.f105810a;
                long j14 = r0Var.f105810a.f157317a;
                this.f201674a = 1;
                obj = qVar.c(charSequence, j14, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                w0Var = null;
            }
            if (w0Var != null) {
                j8 = w0Var.f157317a;
                if (!s5.w0.c(j8, r0Var.f105810a)) {
                    p1.m0<y> m0Var = o1Var.f201710a.f201768c;
                    q0Var = this.f201678e;
                    yVarB = m0Var.b(q0Var.f105808a);
                    if (yVarB != null && yVarB.getText() == r0Var2.f105810a) {
                        q0VarK = yVarB.k();
                        if (q0VarK == null) {
                            return Unit.INSTANCE;
                        }
                        int i15 = (int) (j8 >> 32);
                        int i16 = (int) (j8 & 4294967295L);
                        b0 b0Var = new b0(new b0.a(w3.x.n(q0VarK, i15), i15, q0Var.f105808a), new b0.a(w3.x.n(q0VarK, i16), i16, q0Var.f105808a), false, 4, null);
                        r1 r1Var = o1Var.f201710a;
                        long j15 = q0Var.f105808a;
                        p1.m0 m0Var2 = p1.w.f134861a;
                        p1.m0 m0Var3 = new p1.m0(0, 1, null);
                        m0Var3.h(j15, b0Var);
                        r1Var.f201776k.setValue(m0Var3);
                        o1Var.f201713d.invoke(b0Var);
                        o1Var.f201730u = null;
                    }
                }
            }
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        w0Var = (s5.w0) obj;
        if (w0Var != null) {
            j8 = w0Var.f157317a;
            if (!s5.w0.c(j8, r0Var.f105810a)) {
                p1.m0<y> m0Var4 = o1Var.f201710a.f201768c;
                q0Var = this.f201678e;
                yVarB = m0Var4.b(q0Var.f105808a);
                if (yVarB != null) {
                    q0VarK = yVarB.k();
                    if (q0VarK == null) {
                        return Unit.INSTANCE;
                    }
                    int i17 = (int) (j8 >> 32);
                    int i18 = (int) (j8 & 4294967295L);
                    b0 b0Var2 = new b0(new b0.a(w3.x.n(q0VarK, i17), i17, q0Var.f105808a), new b0.a(w3.x.n(q0VarK, i18), i18, q0Var.f105808a), false, 4, null);
                    r1 r1Var2 = o1Var.f201710a;
                    long j16 = q0Var.f105808a;
                    p1.m0 m0Var5 = p1.w.f134861a;
                    p1.m0 m0Var6 = new p1.m0(0, 1, null);
                    m0Var6.h(j16, b0Var2);
                    r1Var2.f201776k.setValue(m0Var6);
                    o1Var.f201713d.invoke(b0Var2);
                    o1Var.f201730u = null;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
