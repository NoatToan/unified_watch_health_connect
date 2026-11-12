package z0;

import android.util.Size;
import androidx.camera.core.impl.d1;
import androidx.camera.core.impl.e1;
import androidx.camera.core.impl.i2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class c0 implements f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e1 f200602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f200603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f200604d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f200605e = new HashMap();

    public c0(int i14, androidx.camera.core.impl.k0 k0Var, int i15, g1.f0.a aVar) {
        g1.f0.a aVar2;
        k7.h.b(i14 == 0 || i14 == 1, "Not a supported video capabilities source: " + i14);
        int i16 = i15 == 2 ? 2 : 1;
        this.f200603c = i16;
        e1 e1VarF = k0Var.f();
        if (i16 != 2) {
            e1VarF = new ArrayList(new m(e1VarF, i16).f200672a.keySet()).isEmpty() ? new i1.a(k0Var, Arrays.asList(u.f200710c, u.f200709b, u.f200708a), aVar) : e1VarF;
            i2 i2Var = e1.a.f61851a;
            e1 bVar = new i1.b(e1VarF, i2Var, k0Var, aVar);
            if (i14 == 1) {
                i iVar = u.f200708a;
                aVar2 = aVar;
                bVar = new b1.h(bVar, new ArrayList(u.f200716i), Collections.singleton(b0.b0.f13854d), k0Var.getSupportedResolutions(34), aVar2);
            } else {
                aVar2 = aVar;
            }
            e1 cVar = new i1.c(bVar, i2Var);
            for (b0.b0 b0Var : k0Var.a()) {
                Integer numValueOf = Integer.valueOf(b0Var.f13860a);
                int i17 = b0Var.f13861b;
                if (numValueOf.equals(3) && i17 == 10) {
                    cVar = new b1.b(cVar, aVar2);
                    break;
                }
            }
            e1VarF = new i1.d(cVar, k0Var, i2Var);
        } else if (!k0Var.e()) {
            e1VarF = e1.f5538a;
        }
        this.f200602b = e1VarF;
        for (b0.b0 b0Var2 : k0Var.a()) {
            m mVar = new m(new b1.e(this.f200602b, b0Var2), this.f200603c);
            if (!new ArrayList(mVar.f200672a.keySet()).isEmpty()) {
                this.f200604d.put(b0Var2, mVar);
            }
        }
        k0Var.x();
    }

    @Override // z0.f0
    public final Set<b0.b0> a() {
        return this.f200604d.keySet();
    }

    @Override // z0.f0
    public final b1.i b(Size size, b0.b0 b0Var) {
        u value;
        m mVarE = e(b0Var);
        if (mVarE == null) {
            return null;
        }
        TreeMap<Size, u> treeMap = mVarE.f200673b;
        Size size2 = q0.c.f141971a;
        Map.Entry<Size, u> entryCeilingEntry = treeMap.ceilingEntry(size);
        if (entryCeilingEntry != null) {
            value = entryCeilingEntry.getValue();
        } else {
            Map.Entry<Size, u> entryFloorEntry = treeMap.floorEntry(size);
            value = entryFloorEntry != null ? entryFloorEntry.getValue() : null;
        }
        u uVar = value;
        if (uVar == null) {
            uVar = u.f200714g;
        }
        Objects.toString(uVar);
        Objects.toString(size);
        if (uVar != u.f200714g) {
            b1.i iVarA = mVarE.a(uVar);
            if (iVarA != null) {
                return iVarA;
            }
            vb.h.q("Camera advertised available quality but did not produce EncoderProfiles for advertised quality.");
        }
        return null;
    }

    @Override // z0.f0
    public final b1.i c(u uVar, b0.b0 b0Var) {
        m mVarE = e(b0Var);
        if (mVarE == null) {
            return null;
        }
        return mVarE.a(uVar);
    }

    @Override // z0.f0
    public final ArrayList d(b0.b0 b0Var) {
        m mVarE = e(b0Var);
        return mVarE == null ? new ArrayList() : new ArrayList(mVarE.f200672a.keySet());
    }

    public final m e(b0.b0 b0Var) {
        Object next;
        boolean zContains;
        boolean zB = b0Var.b();
        HashMap map = this.f200604d;
        if (zB) {
            return (m) map.get(b0Var);
        }
        HashMap map2 = this.f200605e;
        if (map2.containsKey(b0Var)) {
            return (m) map2.get(b0Var);
        }
        Set setKeySet = map.keySet();
        d1 d1Var = d1.f5530a;
        setKeySet.getClass();
        if (b0Var.b()) {
            zContains = setKeySet.contains(b0Var);
        } else {
            Iterator it = setKeySet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                b0.b0 b0Var2 = (b0.b0) next;
                d1.f5530a.getClass();
                k7.h.f(b0Var2.b(), "Fully specified range is not actually fully specified.");
                int i14 = b0Var.f13861b;
                if (i14 == 0 || i14 == b0Var2.f13861b) {
                    k7.h.f(b0Var2.b(), "Fully specified range is not actually fully specified.");
                    int i15 = b0Var.f13860a;
                    if (i15 != 0) {
                        int i16 = b0Var2.f13860a;
                        if ((i15 == 2 && i16 != 1) || i15 == i16) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            zContains = next != null;
        }
        m mVar = zContains ? new m(new b1.e(this.f200602b, b0Var), this.f200603c) : null;
        map2.put(b0Var, mVar);
        return mVar;
    }
}
