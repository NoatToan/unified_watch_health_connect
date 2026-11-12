package defpackage;

import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.upstream.b;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public abstract class m62 implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f25796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<fxp> f25797b = new ArrayList<>(1);
    public int c;
    public b d;

    public m62(boolean z) {
        this.f25796a = z;
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public final void f(fxp fxpVar) {
        rk1.e(fxpVar);
        if (this.f25797b.contains(fxpVar)) {
            return;
        }
        this.f25797b.add(fxpVar);
        this.c++;
    }

    public final void r(int i) {
        b bVar = (b) wlq.j(this.d);
        for (int i2 = 0; i2 < this.c; i2++) {
            this.f25797b.get(i2).c(this, bVar, this.f25796a, i);
        }
    }

    public final void s() {
        b bVar = (b) wlq.j(this.d);
        for (int i = 0; i < this.c; i++) {
            this.f25797b.get(i).a(this, bVar, this.f25796a);
        }
        this.d = null;
    }

    public final void t(b bVar) {
        for (int i = 0; i < this.c; i++) {
            this.f25797b.get(i).i(this, bVar, this.f25796a);
        }
    }

    public final void u(b bVar) {
        this.d = bVar;
        for (int i = 0; i < this.c; i++) {
            this.f25797b.get(i).d(this, bVar, this.f25796a);
        }
    }
}
