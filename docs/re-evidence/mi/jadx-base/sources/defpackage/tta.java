package defpackage;

import java.util.UUID;

/* JADX INFO: loaded from: classes11.dex */
public class tta implements aqc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ekb f35015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ekb f35016b;

    public static final class a implements ht2<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ht2<Void> f35017a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte f35018b = 0;
        public byte c = 0;

        public a(ht2<Void> ht2Var) {
            this.f35017a = ht2Var;
        }

        @Override // defpackage.ht2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResponse(Void r2) {
            byte b2 = (byte) (this.f35018b + 1);
            this.f35018b = b2;
            if (b2 == 2) {
                this.f35017a.onResponse(null);
            }
        }

        @Override // defpackage.ht2
        public void onFailed(int i) {
            if (this.c == 0) {
                this.f35017a.onFailed(i);
            }
            this.c = (byte) (this.c + 1);
        }
    }

    public tta(jpc jpcVar, boolean z, UUID uuid, UUID uuid2, UUID uuid3, zpc zpcVar) {
        this.f35015a = new ekb(jpcVar, z, uuid, uuid2, null);
        this.f35016b = new ekb(jpcVar, z, uuid, uuid3, zpcVar);
    }

    @Override // defpackage.aqc
    public void b(byte b2, byte[] bArr, it3 it3Var) {
        this.f35015a.b(b2, bArr, it3Var);
    }

    public void c() {
        this.f35015a.h0();
        this.f35016b.h0();
    }

    public void d(ht2<Void> ht2Var) {
        this.f35015a.i0(ht2Var);
        this.f35016b.i0(ht2Var);
    }

    public ekb e() {
        return this.f35016b;
    }

    public boolean f() {
        return this.f35015a.k0() && this.f35016b.k0();
    }

    public void g() {
        this.f35015a.l0();
        this.f35016b.l0();
    }

    public void h() {
        this.f35015a.T();
        this.f35016b.T();
    }

    public void i(int i, boolean z, boolean z2) {
        this.f35015a.Z(i, z, z2);
        this.f35016b.Z(i, z, z2);
    }

    public void j() {
        this.f35015a.m0();
        this.f35016b.m0();
    }
}
