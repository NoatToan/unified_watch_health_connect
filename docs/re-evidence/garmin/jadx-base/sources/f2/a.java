package f2;

import g2.r1;
import g2.z0;
import java.util.List;
import p005kotlin.Metadata;
import p008y1.b2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lf2/a;", "Lf2/h0;", "", "initialNestedPrefetchItemCount", "<init>", "(I)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f68142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f68143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q3.c<z0.b> f68144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f68145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f68146e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f68147f;

    public a(int i14) {
        this.f68142a = i14;
        this.f68143b = -1;
        this.f68144c = new q3.c<>(new z0.b[16], 0);
        this.f68146e = -1;
    }

    public static int c(y yVar, boolean z14) {
        return z14 ? ((m) p13.h0.m0(yVar.e())).getF62559a() + 1 : ((m) p13.h0.b0(yVar.e())).getF62559a() - 1;
    }

    public static int e(y yVar, boolean z14) {
        if (z14) {
            m mVar = (m) p13.h0.m0(yVar.e());
            return (yVar.getF68341r() == b2.Vertical ? mVar.getF68170w() : mVar.getF68171x()) + 1;
        }
        m mVar2 = (m) p13.h0.b0(yVar.e());
        return (yVar.getF68341r() == b2.Vertical ? mVar2.getF68170w() : mVar2.getF68171x()) - 1;
    }

    @Override // f2.h0
    public final void a(r1 r1Var, int i14) {
        int f75319a = r1Var.getF75319a() == -1 ? this.f68142a : r1Var.getF75319a();
        for (int i15 = 0; i15 < f75319a; i15++) {
            r1Var.a(i14 + i15);
        }
    }

    @Override // f2.h0
    public final void b(p0.c cVar, z zVar) {
        int i14 = zVar.f68339p;
        List<a0> list = zVar.f68336m;
        int i15 = this.f68143b;
        boolean z14 = this.f68145d;
        q3.c<z0.b> cVar2 = this.f68144c;
        if (i15 != -1 && !list.isEmpty() && i15 != e(zVar, z14)) {
            this.f68143b = -1;
            z0.b[] bVarArr = cVar2.f142356a;
            int i16 = cVar2.f142358c;
            for (int i17 = 0; i17 < i16; i17++) {
                bVarArr[i17].cancel();
            }
            cVar2.g();
        }
        int i18 = this.f68146e;
        if (i18 != -1 && this.f68147f != 0.0f && i18 != i14 && !list.isEmpty()) {
            int iE = e(zVar, this.f68147f < 0.0f);
            int iC = c(zVar, this.f68147f < 0.0f);
            if (iC >= 0 && iC < i14 && iE != this.f68143b && iE >= 0) {
                this.f68143b = iE;
                cVar2.g();
                cVar2.c(cVar2.f142358c, cVar.b(iE));
            }
        }
        this.f68146e = i14;
    }

    @Override // f2.h0
    public final void d(p0.c cVar, float f14, y yVar) {
        if (!yVar.e().isEmpty()) {
            int i14 = 0;
            boolean z14 = f14 < 0.0f;
            int iE = e(yVar, z14);
            int iC = c(yVar, z14);
            if (iC >= 0 && iC < yVar.getF68339p()) {
                int i15 = this.f68143b;
                q3.c<z0.b> cVar2 = this.f68144c;
                if (iE != i15 && iE >= 0) {
                    if (this.f68145d != z14) {
                        z0.b[] bVarArr = cVar2.f142356a;
                        int i16 = cVar2.f142358c;
                        for (int i17 = 0; i17 < i16; i17++) {
                            bVarArr[i17].cancel();
                        }
                    }
                    this.f68145d = z14;
                    this.f68143b = iE;
                    cVar2.g();
                    cVar2.c(cVar2.f142358c, cVar.b(iE));
                }
                if (z14) {
                    m mVar = (m) p13.h0.m0(yVar.e());
                    if (((z1.e.a(mVar, yVar.getF68341r()) + z1.e.b(mVar, yVar.getF68341r())) + yVar.getF68343t()) - yVar.getF68338o() < (-f14)) {
                        z0.b[] bVarArr2 = cVar2.f142356a;
                        int i18 = cVar2.f142358c;
                        while (i14 < i18) {
                            bVarArr2[i14].d();
                            i14++;
                        }
                    }
                } else if (yVar.getF68337n() - z1.e.a((m) p13.h0.b0(yVar.e()), yVar.getF68341r()) < f14) {
                    z0.b[] bVarArr3 = cVar2.f142356a;
                    int i19 = cVar2.f142358c;
                    while (i14 < i19) {
                        bVarArr3[i14].d();
                        i14++;
                    }
                }
            }
        }
        this.f68147f = f14;
    }

    public a() {
        this(0, 1, null);
    }

    public /* synthetic */ a(int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? 2 : i14);
    }
}
