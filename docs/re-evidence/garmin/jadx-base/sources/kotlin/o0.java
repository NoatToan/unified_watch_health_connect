package kotlin;

import android.view.View;
import h4.t;
import h4.u;
import java.util.concurrent.atomic.AtomicReference;
import o13.r;
import o53.b0;
import o53.c0;
import t13.g;
import u13.a;
import v13.c;
import vb.h;
import x5.m0;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Li5/o0;", "Li5/h3;", "Lo53/b0;", "Landroid/view/View;", "view", "Lx5/m0;", "textInputService", "coroutineScope", "<init>", "(Landroid/view/View;Lx5/m0;Lo53/b0;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o0 implements h3, b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f91361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m0 f91362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f91363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference<t<j2>> f91364d = new AtomicReference<>(null);

    public o0(View view2, m0 m0Var, b0 b0Var) {
        this.f91361a = view2;
        this.f91362b = m0Var;
        this.f91363c = b0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlin.g3
    public final a a(b3 b3Var, c cVar) {
        k0 k0Var;
        if (cVar instanceof k0) {
            k0Var = (k0) cVar;
            int i14 = k0Var.f91240c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                k0Var.f91240c = i14 - Integer.MIN_VALUE;
            } else {
                k0Var = new k0(this, cVar);
            }
        } else {
            k0Var = new k0(this, cVar);
        }
        Object obj = k0Var.f91238a;
        a aVar = a.COROUTINE_SUSPENDED;
        int i15 = k0Var.f91240c;
        if (i15 == 0) {
            r.b(obj);
            m0 m0Var = new m0(b3Var, this);
            n0 n0Var = new n0(this, null);
            k0Var.f91240c = 1;
            if (c0.e(new u(m0Var, this.f91364d, n0Var, null), k0Var) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        o2.c.f();
        return null;
    }

    @Override // o53.b0
    /* JADX INFO: renamed from: getCoroutineContext */
    public final g getF183565a() {
        return this.f91363c.getF183565a();
    }

    @Override // kotlin.g3
    /* JADX INFO: renamed from: getView, reason: from getter */
    public final View getF91361a() {
        return this.f91361a;
    }
}
