package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class ubo implements kl8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f35604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kl8 f35605b;

    public class a implements arl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ arl f35606a;

        public a(arl arlVar) {
            this.f35606a = arlVar;
        }

        @Override // defpackage.arl
        public arl.a d(long j) {
            arl.a aVarD = this.f35606a.d(j);
            crl crlVar = aVarD.f3390a;
            crl crlVar2 = new crl(crlVar.f14648a, crlVar.f14649b + ubo.this.f35604a);
            crl crlVar3 = aVarD.f3391b;
            return new arl.a(crlVar2, new crl(crlVar3.f14648a, crlVar3.f14649b + ubo.this.f35604a));
        }

        @Override // defpackage.arl
        public boolean e() {
            return this.f35606a.e();
        }

        @Override // defpackage.arl
        public long i() {
            return this.f35606a.i();
        }
    }

    public ubo(long j, kl8 kl8Var) {
        this.f35604a = j;
        this.f35605b = kl8Var;
    }

    @Override // defpackage.kl8
    public snp d(int i, int i2) {
        return this.f35605b.d(i, i2);
    }

    @Override // defpackage.kl8
    public void k(arl arlVar) {
        this.f35605b.k(new a(arlVar));
    }

    @Override // defpackage.kl8
    public void m() {
        this.f35605b.m();
    }
}
