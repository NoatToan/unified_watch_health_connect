package i3;

import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Li3/nb;", "", "Lu1/d2;", "scrollState", "Lo53/b0;", "coroutineScope", "Ls1/f0;", "", "animationSpec", "<init>", "(Lu1/d2;Lo53/b0;Ls1/f0;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class nb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u1.d2 f89072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o53.b0 f89073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s1.f0<Float> f89074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f89075d;

    public nb(u1.d2 d2Var, o53.b0 b0Var, s1.f0<Float> f0Var) {
        this.f89072a = d2Var;
        this.f89073b = b0Var;
        this.f89074c = f0Var;
    }

    public final void a(g6.c cVar, int i14, ArrayList arrayList, int i15) {
        Integer num = this.f89075d;
        if (num != null && num.intValue() == i15) {
            return;
        }
        this.f89075d = Integer.valueOf(i15);
        wf wfVar = (wf) p13.h0.e0(i15, arrayList);
        if (wfVar != null) {
            wf wfVar2 = (wf) p13.h0.m0(arrayList);
            float f14 = wfVar2.f90134a + wfVar2.f90135b;
            g6.f.a aVar = g6.f.f75994b;
            int iF0 = cVar.f0(f14) + i14;
            u1.d2 d2Var = this.f89072a;
            int intValue = iF0 - d2Var.f167437e.getIntValue();
            int iF1 = cVar.f0(wfVar.f90134a) - ((intValue / 2) - (cVar.f0(wfVar.f90135b) / 2));
            int i16 = iF0 - intValue;
            if (i16 < 0) {
                i16 = 0;
            }
            int iE = j23.t.e(iF1, 0, i16);
            if (d2Var.f167433a.getIntValue() != iE) {
                ge1.b.T(this.f89073b, null, null, new mb(this, iE, null), 3);
            }
        }
    }
}
