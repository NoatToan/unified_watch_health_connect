package b1;

import android.util.Rational;
import androidx.camera.core.impl.e1;
import androidx.camera.core.impl.f1;
import androidx.camera.core.impl.j;
import androidx.camera.core.impl.k;
import b0.t0;
import com.google.android.exoplayer2.util.MimeTypes;
import g1.f0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class b implements e1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e1 f14188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f0.a f14189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f14190e = new HashMap();

    public b(e1 e1Var, f0.a aVar) {
        this.f14188c = e1Var;
        this.f14189d = aVar;
    }

    @Override // androidx.camera.core.impl.e1
    public final f1 a(int i14) {
        return c(i14);
    }

    @Override // androidx.camera.core.impl.e1
    public final boolean b(int i14) {
        return this.f14188c.b(i14) && c(i14) != null;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00ca  */
    public final f1 c(int i14) {
        f1.c next;
        int i15;
        k kVar;
        Integer numValueOf = Integer.valueOf(i14);
        HashMap map = this.f14190e;
        if (map.containsKey(numValueOf)) {
            return (f1) map.get(Integer.valueOf(i14));
        }
        e1 e1Var = this.f14188c;
        j jVarE = null;
        if (e1Var.b(i14)) {
            f1 f1VarA = e1Var.a(i14);
            if (f1VarA != null) {
                ArrayList arrayList = new ArrayList(f1VarA.d());
                Iterator<f1.c> it = f1VarA.d().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (next.f() != 0);
                if (next == null) {
                    kVar = null;
                } else {
                    int iD = next.d();
                    String strH = next.h();
                    int i16 = next.i();
                    if (1 != next.f()) {
                        iD = 5;
                        strH = MimeTypes.VIDEO_H265;
                        i16 = 2;
                    }
                    int i17 = iD;
                    String str = strH;
                    int i18 = i16;
                    int iB = next.b();
                    int iA = next.a();
                    if (10 == iA) {
                        i15 = iB;
                    } else {
                        int iDoubleValue = (int) (((double) iB) * new Rational(10, iA).doubleValue());
                        if (t0.a(3, "BackupHdrProfileEncoderProfilesProvider")) {
                            String.format("Base Bitrate(%dbps) * Bit Depth Ratio (%d / %d) = %d", Integer.valueOf(iB), 10, Integer.valueOf(iA), Integer.valueOf(iDoubleValue));
                        }
                        i15 = iDoubleValue;
                    }
                    kVar = new k(i17, str, i15, next.e(), next.k(), next.g(), i18, 10, next.c(), 1);
                }
                if (kVar == null) {
                    kVar = null;
                } else {
                    f0 f0VarFind = this.f14189d.find(kVar.f5581b);
                    if (f0VarFind == null || !f0VarFind.b(kVar.f5584e, kVar.f5585f)) {
                        kVar = null;
                    } else {
                        int i19 = kVar.f5582c;
                        int iIntValue = ((Integer) f0VarFind.c().clamp(Integer.valueOf(i19))).intValue();
                        if (iIntValue != i19) {
                            kVar = new k(kVar.f5580a, kVar.f5581b, iIntValue, kVar.f5583d, kVar.f5584e, kVar.f5585f, kVar.f5586g, kVar.f5587h, kVar.f5588i, kVar.f5589j);
                        }
                    }
                }
                if (kVar != null) {
                    arrayList.add(kVar);
                }
                if (!arrayList.isEmpty()) {
                    jVarE = f1.b.e(f1VarA.c(), f1VarA.a(), f1VarA.b(), arrayList);
                }
            }
            map.put(Integer.valueOf(i14), jVarE);
        }
        return jVarE;
    }
}
