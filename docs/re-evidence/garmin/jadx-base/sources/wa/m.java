package wa;

import androidx.media3.common.h0;
import androidx.media3.exoplayer.v0;
import fa.z;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f183755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v0[] f183756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g[] f183757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h0 f183758d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f183759e;

    public m(v0[] v0VarArr, g[] gVarArr, h0 h0Var, Object obj) {
        fa.a.a(v0VarArr.length == gVarArr.length);
        this.f183756b = v0VarArr;
        this.f183757c = (g[]) gVarArr.clone();
        this.f183758d = h0Var;
        this.f183759e = obj;
        this.f183755a = v0VarArr.length;
    }

    public final boolean a(m mVar, int i14) {
        if (mVar == null) {
            return false;
        }
        v0 v0Var = this.f183756b[i14];
        v0 v0Var2 = mVar.f183756b[i14];
        int i15 = z.f70071a;
        return Objects.equals(v0Var, v0Var2) && Objects.equals(this.f183757c[i14], mVar.f183757c[i14]);
    }

    public final boolean b(int i14) {
        return this.f183756b[i14] != null;
    }

    @Deprecated
    public m(v0[] v0VarArr, g[] gVarArr, Object obj) {
        this(v0VarArr, gVarArr, h0.f8301b, obj);
    }
}
