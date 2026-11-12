package f1;

import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.f1;
import androidx.camera.core.impl.x2;
import b0.b0;
import g1.d0;
import g1.e0;
import j20.x;
import k7.i;
import z0.p0;

/* JADX INFO: loaded from: classes.dex */
public class f implements i<d0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f67795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x2 f67796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p0 f67797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Size f67798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f1.c f67799e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b0 f67800f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Range<Integer> f67801g;

    public f(String str, x2 x2Var, p0 p0Var, Size size, f1.c cVar, b0 b0Var, Range<Integer> range) {
        this.f67795a = str;
        this.f67796b = x2Var;
        this.f67797c = p0Var;
        this.f67798d = size;
        this.f67799e = cVar;
        this.f67800f = b0Var;
        this.f67801g = range;
    }

    @Override // k7.i
    public final d0 get() {
        Range<Integer> range = this.f67801g;
        p0 p0Var = this.f67797c;
        b bVarB = d.b(p0Var, range);
        Range<Integer> rangeC = p0Var.c();
        f1.c cVar = this.f67799e;
        int iB = cVar.b();
        int i14 = this.f67800f.f13861b;
        int iA = cVar.a();
        int i15 = bVarB.f67786b;
        int iE = cVar.e();
        Size size = this.f67798d;
        int iD = d.d(iB, i14, iA, i15, iE, size.getWidth(), cVar.k(), size.getHeight(), cVar.g(), rangeC);
        int i16 = cVar.i();
        String str = this.f67795a;
        e0 e0VarA = d.a(i16, str);
        g1.d.b bVarD = d0.d();
        if (str == null) {
            x.l("Null mimeType");
            return null;
        }
        bVarD.f74686a = str;
        x2 x2Var = this.f67796b;
        if (x2Var == null) {
            x.l("Null inputTimebase");
            return null;
        }
        bVarD.f74688c = x2Var;
        bVarD.f74689d = size;
        bVarD.f74695j = Integer.valueOf(iD);
        bVarD.f74692g = Integer.valueOf(bVarB.f67785a);
        bVarD.f74693h = Integer.valueOf(bVarB.f67786b);
        bVarD.f74687b = Integer.valueOf(i16);
        bVarD.b(e0VarA);
        return bVarD.a();
    }
}
