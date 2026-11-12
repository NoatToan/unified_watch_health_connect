package ta;

import androidx.media3.common.d0;
import com.google.android.exoplayer2.C;
import sa.h;

/* JADX INFO: loaded from: classes.dex */
public final class c extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.media3.common.b f163218c;

    public c(d0 d0Var, androidx.media3.common.b bVar) {
        super(d0Var);
        fa.a.d(d0Var.h() == 1);
        fa.a.d(d0Var.o() == 1);
        this.f163218c = bVar;
    }

    @Override // sa.h, androidx.media3.common.d0
    public final d0.b f(int i14, d0.b bVar, boolean z14) {
        this.f158114b.f(i14, bVar, z14);
        long j8 = bVar.f8190d;
        if (j8 == C.TIME_UNSET) {
            j8 = this.f163218c.f8158d;
        }
        bVar.i(bVar.f8187a, bVar.f8188b, bVar.f8189c, j8, bVar.f8191e, this.f163218c, bVar.f8192f);
        return bVar;
    }
}
