package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ef extends pe implements gd, d7d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f16576b = false;
    public boolean c;
    public gd d;

    public ef(boolean z, int i, gd gdVar) {
        this.c = true;
        this.d = null;
        if (gdVar instanceof dd) {
            this.c = true;
        } else {
            this.c = z;
        }
        this.f16575a = i;
        if (this.c) {
            this.d = gdVar;
        } else {
            boolean z2 = gdVar.toASN1Primitive() instanceof we;
            this.d = gdVar;
        }
    }

    @Override // defpackage.pe
    public boolean g(pe peVar) {
        if (!(peVar instanceof ef)) {
            return false;
        }
        ef efVar = (ef) peVar;
        if (this.f16575a != efVar.f16575a || this.f16576b != efVar.f16576b || this.c != efVar.c) {
            return false;
        }
        gd gdVar = this.d;
        if (gdVar == null) {
            return efVar.d == null;
        }
        return gdVar.toASN1Primitive().equals(efVar.d.toASN1Primitive());
    }

    @Override // defpackage.d7d
    public pe getLoadedObject() {
        return toASN1Primitive();
    }

    @Override // defpackage.pe, defpackage.be
    public int hashCode() {
        int i = this.f16575a;
        gd gdVar = this.d;
        return gdVar != null ? i ^ gdVar.hashCode() : i;
    }

    @Override // defpackage.pe
    public pe l() {
        return new hh5(this.c, this.f16575a, this.d);
    }

    @Override // defpackage.pe
    public pe m() {
        return new oi5(this.c, this.f16575a, this.d);
    }

    public pe o() {
        gd gdVar = this.d;
        if (gdVar != null) {
            return gdVar.toASN1Primitive();
        }
        return null;
    }

    public int q() {
        return this.f16575a;
    }

    public boolean r() {
        return this.c;
    }

    public String toString() {
        return "[" + this.f16575a + "]" + this.d;
    }
}
