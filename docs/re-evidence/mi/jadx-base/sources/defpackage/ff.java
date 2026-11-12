package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ff extends re implements hd, e7d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f17721b = false;
    public boolean c;
    public hd d;

    public ff(boolean z, int i, hd hdVar) {
        this.c = true;
        this.d = null;
        if (hdVar instanceof ed) {
            this.c = true;
        } else {
            this.c = z;
        }
        this.f17720a = i;
        if (!this.c) {
            boolean z2 = hdVar.toASN1Primitive() instanceof xe;
        }
        this.d = hdVar;
    }

    public static ff o(Object obj) {
        if (obj == null || (obj instanceof ff)) {
            return (ff) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
        }
        try {
            return o(re.j((byte[]) obj));
        } catch (IOException e) {
            throw new IllegalArgumentException("failed to construct tagged object from byte[]: " + e.getMessage());
        }
    }

    @Override // defpackage.re
    public boolean g(re reVar) {
        if (!(reVar instanceof ff)) {
            return false;
        }
        ff ffVar = (ff) reVar;
        if (this.f17720a != ffVar.f17720a || this.f17721b != ffVar.f17721b || this.c != ffVar.c) {
            return false;
        }
        hd hdVar = this.d;
        if (hdVar == null) {
            return ffVar.d == null;
        }
        return hdVar.toASN1Primitive().equals(ffVar.d.toASN1Primitive());
    }

    @Override // defpackage.e7d
    public re getLoadedObject() {
        return toASN1Primitive();
    }

    @Override // defpackage.re, defpackage.de
    public int hashCode() {
        int i = this.f17720a;
        hd hdVar = this.d;
        return hdVar != null ? i ^ hdVar.hashCode() : i;
    }

    @Override // defpackage.re
    public re l() {
        return new ih5(this.c, this.f17720a, this.d);
    }

    @Override // defpackage.re
    public re m() {
        return new pi5(this.c, this.f17720a, this.d);
    }

    public re q() {
        hd hdVar = this.d;
        if (hdVar != null) {
            return hdVar.toASN1Primitive();
        }
        return null;
    }

    public int r() {
        return this.f17720a;
    }

    public boolean t() {
        return this.c;
    }

    public String toString() {
        return "[" + this.f17720a + "]" + this.d;
    }
}
