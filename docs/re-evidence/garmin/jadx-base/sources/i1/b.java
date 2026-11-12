package i1;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.e1;
import androidx.camera.core.impl.f1;
import androidx.camera.core.impl.i2;
import androidx.camera.core.impl.j;
import androidx.camera.core.impl.k0;
import androidx.camera.video.internal.compat.quirk.ExtraSupportedQualityQuirk;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import g1.f0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import k7.h;
import z0.p0;

/* JADX INFO: loaded from: classes.dex */
public class b implements e1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e1 f86978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f86979d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    public b(e1 e1Var, i2 i2Var, k0 k0Var, f0.a aVar) {
        this.f86978c = e1Var;
        ArrayList arrayListC = i2Var.c(ExtraSupportedQualityQuirk.class);
        if (arrayListC.isEmpty()) {
            return;
        }
        ?? map = 0;
        map = 0;
        map = 0;
        h.f(arrayListC.size() == 1, null);
        ((ExtraSupportedQualityQuirk) arrayListC.get(0)).getClass();
        if (!"motorola".equalsIgnoreCase(Build.BRAND) || !"moto c".equalsIgnoreCase(Build.MODEL)) {
            map = Collections.EMPTY_MAP;
        } else if (IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(k0Var.q()) && !e1Var.b(4)) {
            f1 f1VarA = e1Var.a(1);
            f1.c cVar = (f1VarA == null || f1VarA.d().isEmpty()) ? null : f1VarA.d().get(0);
            if (cVar != null) {
                f0 f0VarFind = aVar.find(cVar.h());
                Range<Integer> rangeC = f0VarFind != null ? f0VarFind.c() : p0.f200704a;
                Size size = q0.c.f141974d;
                j jVarE = f1.b.e(f1VarA.c(), f1VarA.a(), f1VarA.b(), Collections.singletonList(h1.c.a(cVar, size, rangeC)));
                map = new HashMap();
                map.put(4, jVarE);
                Size sizeJ = cVar.j();
                if (size.getHeight() * size.getWidth() > sizeJ.getHeight() * sizeJ.getWidth()) {
                    map.put(1, jVarE);
                }
            }
        }
        if (map != 0) {
            this.f86979d = new HashMap((Map) map);
        }
    }

    @Override // androidx.camera.core.impl.e1
    public final f1 a(int i14) {
        return c(i14);
    }

    @Override // androidx.camera.core.impl.e1
    public final boolean b(int i14) {
        return c(i14) != null;
    }

    public final f1 c(int i14) {
        HashMap map = this.f86979d;
        return (map == null || !map.containsKey(Integer.valueOf(i14))) ? this.f86978c.a(i14) : (f1) map.get(Integer.valueOf(i14));
    }
}
