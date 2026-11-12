package defpackage;

import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.Format;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class n63 implements i9c {
    public static final r4i d = new r4i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @VisibleForTesting
    public final il8 f27585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Format f27586b;
    public final rfp c;

    public n63(il8 il8Var, Format format, rfp rfpVar) {
        this.f27585a = il8Var;
        this.f27586b = format;
        this.c = rfpVar;
    }

    @Override // defpackage.i9c
    public boolean a(jl8 jl8Var) throws IOException {
        return this.f27585a.f(jl8Var, d) == 0;
    }

    @Override // defpackage.i9c
    public void b(kl8 kl8Var) {
        this.f27585a.b(kl8Var);
    }

    @Override // defpackage.i9c
    public void c() {
        this.f27585a.a(0L, 0L);
    }

    @Override // defpackage.i9c
    public boolean d() {
        il8 il8Var = this.f27585a;
        return (il8Var instanceof h2q) || (il8Var instanceof zna);
    }

    @Override // defpackage.i9c
    public boolean e() {
        il8 il8Var = this.f27585a;
        return (il8Var instanceof tu0) || (il8Var instanceof c20) || (il8Var instanceof g20) || (il8Var instanceof c9g);
    }

    @Override // defpackage.i9c
    public i9c f() {
        il8 c9gVar;
        rk1.g(!d());
        il8 il8Var = this.f27585a;
        if (il8Var instanceof scr) {
            c9gVar = new scr(this.f27586b.c, this.c);
        } else if (il8Var instanceof tu0) {
            c9gVar = new tu0();
        } else if (il8Var instanceof c20) {
            c9gVar = new c20();
        } else if (il8Var instanceof g20) {
            c9gVar = new g20();
        } else {
            if (!(il8Var instanceof c9g)) {
                String simpleName = this.f27585a.getClass().getSimpleName();
                throw new IllegalStateException(simpleName.length() != 0 ? "Unexpected extractor type for recreation: ".concat(simpleName) : new String("Unexpected extractor type for recreation: "));
            }
            c9gVar = new c9g();
        }
        return new n63(c9gVar, this.f27586b, this.c);
    }
}
