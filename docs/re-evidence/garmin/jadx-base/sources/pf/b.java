package pf;

import android.graphics.Bitmap;
import dg.t;
import dg.u;
import hf.g;
import hf.y;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.h0;
import w63.l;
import wf.m;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lpf/b;", "Lpf/c;", "Lhf/y;", "<init>", "()V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements c<y> {
    @Override // pf.c
    public final String a(y yVar, m mVar) {
        String strV;
        y yVar2 = yVar;
        t.a aVar = t.f59501a;
        String str = yVar2.f83620c;
        if ((str == null || str.equals("file")) && yVar2.f83622e != null) {
            Bitmap.Config[] configArr = u.f59504a;
            if ((!s.g(yVar2.f83620c, "file") || !s.g(h0.d0(gg.b.C(yVar2)), "android_asset")) && ((Boolean) g.b(mVar, wf.g.f184983c)).booleanValue() && (strV = gg.b.v(yVar2)) != null) {
                l lVar = mVar.f185001f;
                w63.y.f183408b.getClass();
                Long l14 = lVar.n(w63.y.a.a(strV)).f183384f;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(yVar2);
                sb3.append('-');
                sb3.append(l14);
                return sb3.toString();
            }
        }
        return null;
    }
}
