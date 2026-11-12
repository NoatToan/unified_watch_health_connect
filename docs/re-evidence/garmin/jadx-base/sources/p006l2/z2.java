package p006l2;

import android.view.KeyEvent;
import e23.l;
import k62.k;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.m0;
import p005kotlin.jvm.internal.q;
import p005kotlin.jvm.internal.s;
import p13.w;
import s5.w0;
import x5.l0;
import z2.s2;
import z2.y1;
import z4.b;
import z4.c;
import z4.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final /* synthetic */ class z2 extends q implements l<b, Boolean> {
    public z2(Object obj) {
        super(1, obj, x2.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0043  */
    @Override // e23.l
    public final Boolean invoke(b bVar) {
        Integer numA;
        s1 s1VarA;
        KeyEvent keyEvent = bVar.f202306a;
        x2 x2Var = (x2) this.receiver;
        s2 s2Var = x2Var.f108881f;
        boolean z14 = x2Var.f108879d;
        boolean z15 = true;
        x5.b bVar2 = (gl.b.H(keyEvent) && (numA = x2Var.f108884i.a(keyEvent)) != null) ? new x5.b(new StringBuilder().appendCodePoint(numA.intValue()).toString(), 1) : null;
        if (bVar2 == null) {
            int iB = d.b(keyEvent);
            c.f202307b.getClass();
            if (iB != c.f202309d || (s1VarA = x2Var.f108885j.a(keyEvent)) == null || (s1VarA.f108782a && !z14)) {
                z15 = false;
            } else {
                m0 m0Var = new m0();
                m0Var.f105804a = true;
                k kVar = new k(s1VarA, 15, x2Var, m0Var);
                l0 l0Var = x2Var.f108878c;
                y1 y1Var = new y1(l0Var, x2Var.f108882g, x2Var.f108876a.d(), s2Var);
                kVar.invoke(y1Var);
                if (!w0.d(y1Var.f201548f, l0Var.f188879b) || !s.g(y1Var.f201549g, l0Var.f188878a)) {
                    x2Var.f108886k.invoke(l0.b(y1Var.f201846h, y1Var.f201549g, y1Var.f201548f, 4));
                }
                s3 s3Var = x2Var.f108883h;
                if (s3Var != null) {
                    s3Var.f108789f = true;
                }
                z15 = m0Var.f105804a;
            }
        } else if (z14) {
            x2Var.a(w.c(bVar2));
            s2Var.f201787a = null;
        } else {
            z15 = false;
        }
        return Boolean.valueOf(z15);
    }
}
