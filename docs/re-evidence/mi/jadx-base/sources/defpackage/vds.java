package defpackage;

import android.util.Base64;

/* JADX INFO: loaded from: classes11.dex */
public class vds extends z5s.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f36783a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rds f36784b;

    public vds(rds rdsVar) {
        this.f36784b = rdsVar;
    }

    @Override // z5s.b
    public void b() {
        try {
            cqs cqsVarN = cqs.n(Base64.decode(nks.f(odt.b(), "https://resolver.msg.xiaomi.net/psc/?t=a", null), 10));
            if (cqsVarN != null) {
                this.f36784b.f32454b = cqsVarN;
                this.f36783a = true;
                this.f36784b.p();
            }
        } catch (Exception e) {
            x9s.o("fetch config failure: " + e.getMessage());
        }
    }

    @Override // z5s.b
    public void c() {
        rds.a[] aVarArr;
        this.f36784b.c = null;
        if (this.f36783a) {
            synchronized (this.f36784b) {
                aVarArr = (rds.a[]) this.f36784b.f32453a.toArray(new rds.a[this.f36784b.f32453a.size()]);
            }
            for (rds.a aVar : aVarArr) {
                aVar.b(this.f36784b.f32454b);
            }
        }
    }
}
