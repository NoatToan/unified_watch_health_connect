package z10;

import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lz10/b0;", "Landroidx/lifecycle/u1;", "<init>", "()V", "gcm-consent_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b0 extends androidx.lifecycle.u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<? extends c0> f200891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r53.p2 f200892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r53.p2 f200893c;

    public b0() {
        p13.j0 j0Var = p13.j0.f134944a;
        c0 c0Var = c0.LOADING;
        this.f200891a = p13.w.c(c0Var);
        this.f200892b = r53.q2.a(c0Var);
        this.f200893c = r53.q2.a(new i2(false, false, 0, null, 15, null));
    }

    public final void x4() {
        r53.p2 p2Var;
        Object value;
        List<? extends c0> list;
        Iterator<? extends c0> it = this.f200891a.iterator();
        int i14 = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            p2Var = this.f200892b;
            if (!zHasNext) {
                i14 = -1;
                break;
            } else if (it.next() == p2Var.getValue()) {
                break;
            } else {
                i14++;
            }
        }
        int i15 = i14 + 1;
        do {
            value = p2Var.getValue();
            list = this.f200891a;
        } while (!p2Var.b(value, (i15 < 0 || i15 >= list.size()) ? c0.END_FLOW : list.get(i15)));
    }

    public final void y4() {
        r53.p2 p2Var;
        Object value;
        do {
            p2Var = this.f200892b;
            value = p2Var.getValue();
        } while (!p2Var.b(value, c0.PRODUCT_IMPROVEMENT));
    }
}
