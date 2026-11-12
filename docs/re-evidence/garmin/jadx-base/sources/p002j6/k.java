package p002j6;

import e23.p;
import f5.t1;
import h5.h;
import h5.i1;
import h5.j1;
import h5.m;
import m4.g0;
import m4.j0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;
import p005kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lj6/k;", "Lh5/m;", "Lh5/i1;", "Lh5/h;", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k extends m implements i1, h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j0 f97242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public t1.a f97243d;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a extends q implements p<g0, g0, Unit> {
        public a(Object obj) {
            super(2, obj, k.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0);
        }

        @Override // e23.p
        public final Unit invoke(g0 g0Var, g0 g0Var2) {
            boolean zA;
            g0 g0Var3 = g0Var;
            g0 g0Var4 = g0Var2;
            k kVar = (k) this.receiver;
            if (kVar.getIsAttached() && (zA = g0Var4.a()) != g0Var3.a()) {
                if (zA) {
                    r0 r0Var = new r0();
                    j1.a(kVar, new l(r0Var, kVar));
                    t1 t1Var = (t1) r0Var.f105810a;
                    kVar.f97243d = t1Var != null ? t1Var.a() : null;
                } else {
                    t1.a aVar = kVar.f97243d;
                    if (aVar != null) {
                        aVar.release();
                    }
                    kVar.f97243d = null;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public k() {
        j0 j0Var = new j0(0, true, new a(this), null, 9, null);
        U1(j0Var);
        this.f97242c = j0Var;
    }

    @Override // h5.i1
    public final void x1() {
        r0 r0Var = new r0();
        j1.a(this, new l(r0Var, this));
        t1 t1Var = (t1) r0Var.f105810a;
        if (this.f97242c.a0().a()) {
            t1.a aVar = this.f97243d;
            if (aVar != null) {
                aVar.release();
            }
            this.f97243d = t1Var != null ? t1Var.a() : null;
        }
    }
}
