package defpackage;

import java.util.UUID;

/* JADX INFO: loaded from: classes11.dex */
public class ekb extends ft3 {
    public final jpc A;
    public final boolean B;
    public final UUID C;
    public final UUID D;
    public final zpc E;
    public ht2<byte[]> F;

    public class a implements ht2<byte[]> {
        public a() {
        }

        @Override // defpackage.ht2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResponse(byte[] bArr) {
            ekb.this.N(bArr);
        }

        @Override // defpackage.ht2
        public void onFailed(int i) {
        }
    }

    public class b implements ht2<Void> {
        public b() {
        }

        @Override // defpackage.ht2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResponse(Void r1) {
        }

        @Override // defpackage.ht2
        public void onFailed(int i) {
        }
    }

    public class c implements ht2<Void> {
        public c() {
        }

        @Override // defpackage.ht2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResponse(Void r1) {
        }

        @Override // defpackage.ht2
        public void onFailed(int i) {
        }
    }

    public class d implements ht2<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ it3 f16732a;

        public d(it3 it3Var) {
            this.f16732a = it3Var;
        }

        @Override // defpackage.ht2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResponse(Void r2) {
            it3 it3Var = this.f16732a;
            if (it3Var != null) {
                it3Var.onCallback(0);
            }
        }

        @Override // defpackage.ht2
        public void onFailed(int i) {
            it3 it3Var = this.f16732a;
            if (it3Var != null) {
                it3Var.onCallback(-7);
            }
        }
    }

    public ekb(jpc jpcVar, boolean z, UUID uuid, UUID uuid2, zpc zpcVar) {
        this.A = jpcVar;
        this.C = uuid;
        this.D = uuid2;
        this.B = z;
        this.E = zpcVar;
    }

    @Override // defpackage.ypc
    public void a(byte[] bArr, it3 it3Var) {
        this.A.g(this.C, this.D, bArr, new d(it3Var));
    }

    @Override // defpackage.zpc
    public void c(byte b2, byte[] bArr) {
        zpc zpcVar = this.E;
        if (zpcVar != null) {
            zpcVar.c(b2, bArr);
        }
    }

    @Override // defpackage.ft3
    public boolean g0() {
        return this.B;
    }

    public void h0() {
        this.A.k(this.C, this.D, new c());
    }

    public void i0(ht2<Void> ht2Var) {
        if (ht2Var == null) {
            ht2Var = new b();
        }
        this.A.p(this.C, this.D, ht2Var);
    }

    public UUID j0() {
        return this.D;
    }

    public boolean k0() {
        return this.A.f(this.C, this.D);
    }

    public void l0() {
        if (this.F != null) {
            return;
        }
        a aVar = new a();
        this.F = aVar;
        this.A.l(this.C, this.D, aVar);
    }

    public void m0() {
        ht2<byte[]> ht2Var = this.F;
        if (ht2Var != null) {
            this.A.d(this.C, this.D, ht2Var);
            this.F = null;
        }
    }
}
