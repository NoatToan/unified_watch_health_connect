package defpackage;

import com.miui.tsmclient.service.DKFRequestService;

/* JADX INFO: loaded from: classes4.dex */
public final class dql implements i2q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cql f15816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final okh f15817b = new okh(32);
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public dql(cql cqlVar) {
        this.f15816a = cqlVar;
    }

    @Override // defpackage.i2q
    public void a(okh okhVar, int i) {
        int iE;
        boolean z = (i & 1) != 0;
        if (z) {
            iE = okhVar.e() + okhVar.D();
        } else {
            iE = -1;
        }
        if (this.f) {
            if (!z) {
                return;
            }
            this.f = false;
            okhVar.P(iE);
            this.d = 0;
        }
        while (okhVar.a() > 0) {
            int i2 = this.d;
            if (i2 < 3) {
                if (i2 == 0) {
                    int iD = okhVar.D();
                    okhVar.P(okhVar.e() - 1);
                    if (iD == 255) {
                        this.f = true;
                        return;
                    }
                }
                int iMin = Math.min(okhVar.a(), 3 - this.d);
                okhVar.j(this.f15817b.d(), this.d, iMin);
                int i3 = this.d + iMin;
                this.d = i3;
                if (i3 == 3) {
                    this.f15817b.P(0);
                    this.f15817b.O(3);
                    this.f15817b.Q(1);
                    int iD2 = this.f15817b.D();
                    int iD3 = this.f15817b.D();
                    this.e = (iD2 & 128) != 0;
                    this.c = (((iD2 & 15) << 8) | iD3) + 3;
                    int iB = this.f15817b.b();
                    int i4 = this.c;
                    if (iB < i4) {
                        this.f15817b.c(Math.min(DKFRequestService.t0, Math.max(i4, this.f15817b.b() * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(okhVar.a(), this.c - this.d);
                okhVar.j(this.f15817b.d(), this.d, iMin2);
                int i5 = this.d + iMin2;
                this.d = i5;
                int i6 = this.c;
                if (i5 != i6) {
                    continue;
                } else {
                    if (!this.e) {
                        this.f15817b.O(i6);
                    } else {
                        if (wlq.u(this.f15817b.d(), 0, this.c, -1) != 0) {
                            this.f = true;
                            return;
                        }
                        this.f15817b.O(this.c - 4);
                    }
                    this.f15817b.P(0);
                    this.f15816a.a(this.f15817b);
                    this.d = 0;
                }
            }
        }
    }

    @Override // defpackage.i2q
    public void b(rfp rfpVar, kl8 kl8Var, i2q.d dVar) {
        this.f15816a.b(rfpVar, kl8Var, dVar);
        this.f = true;
    }

    @Override // defpackage.i2q
    public void c() {
        this.f = true;
    }
}
