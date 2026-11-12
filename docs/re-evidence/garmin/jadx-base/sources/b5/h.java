package b5;

import h5.c2;
import h5.d2;
import h5.e2;
import h5.u1;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B%\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lb5/h;", "Lh4/r$c;", "Lh5/e2;", "Lh5/u1;", "Lh5/h;", "Lb5/w;", "icon", "", "overrideDescendants", "Lh5/r;", "dpTouchBoundsExpansion", "<init>", "(Lb5/w;ZLh5/r;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class h extends h4.r.c implements e2, u1, h5.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h5.r f15810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w f15811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15812c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15813d;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb5/h;", "it", "Lh5/d2;", "invoke", "(Lb5/h;)Lh5/d2;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class a extends p005kotlin.jvm.internal.w implements e23.l<h, d2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p005kotlin.jvm.internal.m0 f15814a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p005kotlin.jvm.internal.m0 m0Var) {
            super(1);
            this.f15814a = m0Var;
        }

        @Override // e23.l
        public final d2 invoke(h hVar) {
            if (!hVar.f15813d) {
                return d2.ContinueTraversal;
            }
            this.f15814a.f105804a = false;
            return d2.CancelTraversal;
        }
    }

    public /* synthetic */ h(w wVar, boolean z14, h5.r rVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(wVar, (i14 & 2) != 0 ? false : z14, (i14 & 4) != 0 ? null : rVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void U1() {
        w wVar;
        p005kotlin.jvm.internal.r0 r0Var = new p005kotlin.jvm.internal.r0();
        gl1.d.i0(this, new j(r0Var));
        h hVar = (h) r0Var.f105810a;
        if (hVar == null || (wVar = hVar.f15811b) == null) {
            wVar = this.f15811b;
        }
        V1(wVar);
    }

    @Override // h5.u1
    public final long V0() {
        h5.r rVar = this.f15810a;
        if (rVar == null) {
            c2.f81742b.getClass();
            return c2.f81743c;
        }
        g6.c cVar = h5.k.g(this).A;
        c2.a aVar = c2.f81742b;
        int iF0 = cVar.f0(rVar.f81950a);
        int iF1 = cVar.f0(rVar.f81951b);
        int iF2 = cVar.f0(rVar.f81952c);
        int iF3 = cVar.f0(rVar.f81953d);
        boolean z14 = rVar.f81954e;
        aVar.getClass();
        return c2.a.b(iF0, iF1, iF2, iF3, z14);
    }

    public abstract void V1(w wVar);

    public final void W1() {
        p005kotlin.jvm.internal.m0 m0Var = new p005kotlin.jvm.internal.m0();
        m0Var.f105804a = true;
        if (!this.f15812c) {
            gl1.d.k0(this, new a(m0Var));
        }
        if (m0Var.f105804a) {
            U1();
        }
    }

    public abstract boolean X1(int i14);

    /* JADX WARN: Multi-variable type inference failed */
    public final void Y1() {
        if (this.f15813d) {
            this.f15813d = false;
            if (getIsAttached()) {
                p005kotlin.jvm.internal.r0 r0Var = new p005kotlin.jvm.internal.r0();
                gl1.d.i0(this, new g(r0Var));
                h hVar = (h) r0Var.f105810a;
                if (hVar != null) {
                    hVar.U1();
                } else {
                    V1(null);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002b  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void Z1(boolean z14) {
        h hVar;
        if (this.f15812c != z14) {
            this.f15812c = z14;
            boolean z15 = this.f15813d;
            if (z14) {
                if (z15) {
                    U1();
                }
            } else if (z15 && z15) {
                if (z14) {
                    hVar = this;
                } else {
                    p005kotlin.jvm.internal.r0 r0Var = new p005kotlin.jvm.internal.r0();
                    gl1.d.k0(this, new i(r0Var));
                    hVar = (h) r0Var.f105810a;
                    if (hVar == null) {
                        hVar = this;
                    }
                }
                hVar.U1();
            }
        }
    }

    @Override // h5.u1
    public final void a1() {
        Y1();
    }

    @Override // h4.r.c
    public final void onDetach() {
        Y1();
        super.onDetach();
    }

    @Override // h5.u1
    public final void u1(q qVar, s sVar, long j8) {
        if (sVar == s.Main) {
            List<a0> list = qVar.f15870a;
            int size = list.size();
            for (int i14 = 0; i14 < size; i14++) {
                if (X1(list.get(i14).f15756i)) {
                    int i15 = qVar.f15875f;
                    t.f15887b.getClass();
                    if (i15 == t.f15891f) {
                        this.f15813d = true;
                        W1();
                        return;
                    } else {
                        if (qVar.f15875f == t.f15892g) {
                            Y1();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    public h(w wVar, boolean z14, h5.r rVar) {
        this.f15810a = rVar;
        this.f15811b = wVar;
        this.f15812c = z14;
    }
}
