package o63;

import java.util.List;
import m63.j0;
import p005kotlin.Metadata;
import p13.u0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lo63/v;", "Lo63/t;", "Ln63/b;", "json", "Ln63/x;", "value", "<init>", "(Ln63/b;Ln63/x;)V", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v extends t {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final n63.x f129891l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List<String> f129892m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f129893n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f129894o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(n63.b bVar, n63.x xVar) {
        super(bVar, xVar, null, null, 12, null);
        bVar.getClass();
        xVar.getClass();
        this.f129891l = xVar;
        List<String> listB1 = p13.h0.b1(xVar.f123948a.keySet());
        this.f129892m = listB1;
        this.f129893n = listB1.size() * 2;
        this.f129894o = -1;
    }

    @Override // o63.t, m63.b1
    public final String U(k63.e eVar, int i14) {
        eVar.getClass();
        return this.f129892m.get(i14 / 2);
    }

    @Override // o63.t, o63.b
    public final n63.i W(String str) {
        str.getClass();
        if (this.f129894o % 2 != 0) {
            return (n63.i) u0.c(str, this.f129891l);
        }
        j0 j0Var = n63.j.f123935a;
        return new n63.q(str, true, null, 4, null);
    }

    @Override // o63.t, o63.b
    /* JADX INFO: renamed from: Y */
    public final n63.i getF129884h() {
        return this.f129891l;
    }

    @Override // o63.t, o63.b, m63.z1, l63.c
    public final void b(k63.e eVar) {
        eVar.getClass();
    }

    @Override // o63.t
    /* JADX INFO: renamed from: b0, reason: from getter */
    public final n63.x getF129830e() {
        return this.f129891l;
    }

    @Override // o63.t, l63.c
    public final int e(k63.e eVar) {
        eVar.getClass();
        int i14 = this.f129894o;
        if (i14 >= this.f129893n - 1) {
            return -1;
        }
        int i15 = i14 + 1;
        this.f129894o = i15;
        return i15;
    }
}
