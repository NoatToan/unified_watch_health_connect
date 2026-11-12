package b1;

import android.util.Size;
import androidx.camera.core.impl.e1;
import androidx.camera.core.impl.f1;
import androidx.camera.core.impl.j;
import b0.b0;
import com.google.firebase.messaging.l;
import g1.f0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import z0.m;
import z0.u;

/* JADX INFO: loaded from: classes.dex */
public class h implements e1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e1 f14198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f14199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f14200e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashSet f14201f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f0.a f14202g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f14203h = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashMap f14204i = new HashMap();

    public h(e1 e1Var, Collection<u> collection, Collection<b0> collection2, Collection<Size> collection3, f0.a aVar) {
        for (b0 b0Var : collection2) {
            if (!b0Var.b()) {
                l.j(b0Var, "Contains non-fully specified DynamicRange: ");
                throw null;
            }
        }
        this.f14198c = e1Var;
        this.f14199d = new HashSet(collection);
        this.f14201f = new HashSet(collection2);
        this.f14200e = new HashSet(collection3);
        this.f14202g = aVar;
    }

    @Override // androidx.camera.core.impl.e1
    public final f1 a(int i14) {
        return c(i14);
    }

    @Override // androidx.camera.core.impl.e1
    public final boolean b(int i14) {
        return c(i14) != null;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01da  */
    /* JADX WARN: Code duplicated, block: B:103:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:114:0x01ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x009b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x0179 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:? A[LOOP:5: B:39:0x00c5->B:127:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x008c  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:50:0x0107  */
    /* JADX WARN: Code duplicated, block: B:51:0x010c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0112  */
    /* JADX WARN: Code duplicated, block: B:54:0x0117  */
    /* JADX WARN: Code duplicated, block: B:58:0x011e  */
    /* JADX WARN: Code duplicated, block: B:61:0x012a  */
    /* JADX WARN: Code duplicated, block: B:66:0x0137  */
    /* JADX WARN: Code duplicated, block: B:69:0x013f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0181  */
    /* JADX WARN: Code duplicated, block: B:80:0x0186  */
    /* JADX WARN: Code duplicated, block: B:82:0x018c  */
    /* JADX WARN: Code duplicated, block: B:83:0x0191  */
    /* JADX WARN: Code duplicated, block: B:85:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:90:0x01b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:92:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:94:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:95:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:97:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:98:0x01d1  */
    public final f1 c(int i14) {
        u.b bVar;
        f1 f1VarA;
        Iterator<Size> it;
        f1 f1Var;
        j jVarE;
        int iC;
        int iA;
        List<f1.a> listB;
        ArrayList arrayList;
        Size next;
        TreeMap treeMap;
        ArrayList arrayList2;
        Map.Entry entryCeilingEntry;
        Map.Entry entryFloorEntry;
        Object value;
        HashMap map;
        i iVar;
        m mVar;
        TreeMap<Size, u> treeMap2;
        Map.Entry<Size, u> entryCeilingEntry2;
        Map.Entry<Size, u> entryFloorEntry2;
        Object value2;
        u uVar;
        i iVarA;
        f1.c cVarF;
        f0 f0VarFind;
        Iterator<f1.c> it3;
        Integer numValueOf = Integer.valueOf(i14);
        HashMap map2 = this.f14203h;
        if (map2.containsKey(numValueOf)) {
            return (f1) map2.get(Integer.valueOf(i14));
        }
        e1 e1Var = this.f14198c;
        f1 f1VarA2 = e1Var.a(i14);
        HashSet hashSet = this.f14199d;
        Iterator it4 = hashSet.iterator();
        do {
            if (!it4.hasNext()) {
                bVar = null;
                break;
            }
            bVar = (u.b) ((u) it4.next());
        } while (bVar.d() != i14);
        if (bVar != null) {
            HashSet<b0> hashSet2 = this.f14201f;
            if (f1VarA2 == null) {
                k7.h.a(hashSet.contains(bVar));
                f1VarA = e1Var.a(bVar.d());
                it = bVar.c().iterator();
                while (true) {
                    if (it.hasNext()) {
                        f1Var = null;
                        jVarE = null;
                        break;
                    }
                    next = it.next();
                    if (!this.f14200e.contains(next)) {
                        treeMap = new TreeMap(new j0.e());
                        arrayList2 = new ArrayList();
                        for (b0 b0Var : hashSet2) {
                            if (f1VarA == null) {
                                it3 = f1VarA.d().iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        if (h1.b.a(it3.next(), b0Var)) {
                                        }
                                    }
                                }
                            }
                            map = this.f14204i;
                            if (map.containsKey(b0Var)) {
                                mVar = (m) map.get(b0Var);
                                Objects.requireNonNull(mVar);
                                iVar = null;
                            } else {
                                iVar = null;
                                m mVar2 = new m(new e(e1Var, b0Var), 1);
                                map.put(b0Var, mVar2);
                                mVar = mVar2;
                            }
                            treeMap2 = mVar.f200673b;
                            Size size = q0.c.f141971a;
                            entryCeilingEntry2 = treeMap2.ceilingEntry(next);
                            if (entryCeilingEntry2 != null) {
                                value2 = entryCeilingEntry2.getValue();
                            } else {
                                entryFloorEntry2 = treeMap2.floorEntry(next);
                                if (entryFloorEntry2 != null) {
                                    value2 = entryFloorEntry2.getValue();
                                } else {
                                    value2 = iVar;
                                }
                            }
                            uVar = (u) value2;
                            if (uVar == null) {
                                uVar = u.f200714g;
                            }
                            Objects.toString(uVar);
                            Objects.toString(next);
                            if (uVar != u.f200714g) {
                                iVarA = mVar.a(uVar);
                                if (iVarA == null) {
                                    vb.h.q("Camera advertised available quality but did not produce EncoderProfiles for advertised quality.");
                                    return iVar;
                                }
                            } else {
                                iVarA = iVar;
                            }
                            if (iVarA != null) {
                                cVarF = iVarA.f();
                                f0VarFind = this.f14202g.find(cVarF.h());
                                if (f0VarFind != null && f0VarFind.b(next.getWidth(), next.getHeight())) {
                                    treeMap.put(cVarF.j(), iVarA);
                                    arrayList2.add(h1.c.a(cVarF, next, f0VarFind.c()));
                                }
                            }
                        }
                        f1Var = null;
                        if (!arrayList2.isEmpty()) {
                            Size size2 = q0.c.f141971a;
                            entryCeilingEntry = treeMap.ceilingEntry(next);
                            if (entryCeilingEntry != null) {
                                value = entryCeilingEntry.getValue();
                            } else {
                                entryFloorEntry = treeMap.floorEntry(next);
                                if (entryFloorEntry != null) {
                                    value = entryFloorEntry.getValue();
                                } else {
                                    value = null;
                                }
                            }
                            f1 f1Var2 = (f1) value;
                            Objects.requireNonNull(f1Var2);
                            jVarE = f1.b.e(f1Var2.c(), f1Var2.a(), f1Var2.b(), arrayList2);
                            break;
                        }
                    }
                }
                if (f1VarA2 == null || jVarE != null) {
                    if (f1VarA2 != null) {
                        iC = f1VarA2.c();
                    } else {
                        iC = jVarE.f5576a;
                    }
                    if (f1VarA2 != null) {
                        iA = f1VarA2.a();
                    } else {
                        iA = jVarE.f5577b;
                    }
                    if (f1VarA2 != null) {
                        listB = f1VarA2.b();
                    } else {
                        listB = jVarE.f5578c;
                    }
                    arrayList = new ArrayList();
                    if (f1VarA2 != null) {
                        arrayList.addAll(f1VarA2.d());
                    }
                    if (jVarE != null) {
                        arrayList.addAll(jVarE.f5579d);
                    }
                    f1VarA2 = f1.b.e(iC, iA, listB, arrayList);
                } else {
                    f1VarA2 = f1Var;
                }
            } else {
                Iterator it5 = hashSet2.iterator();
                loop1: while (true) {
                    if (it5.hasNext()) {
                        b0 b0Var2 = (b0) it5.next();
                        Iterator<f1.c> it6 = f1VarA2.d().iterator();
                        do {
                            if (!it6.hasNext()) {
                                break loop1;
                            }
                        } while (!h1.b.a(it6.next(), b0Var2));
                    }
                }
                k7.h.a(hashSet.contains(bVar));
                f1VarA = e1Var.a(bVar.d());
                it = bVar.c().iterator();
                while (true) {
                    if (it.hasNext()) {
                        f1Var = null;
                        jVarE = null;
                        break;
                    }
                    next = it.next();
                    if (!this.f14200e.contains(next)) {
                        treeMap = new TreeMap(new j0.e());
                        arrayList2 = new ArrayList();
                        while (r12.hasNext()) {
                            if (f1VarA == null) {
                                it3 = f1VarA.d().iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        if (h1.b.a(it3.next(), b0Var)) {
                                        }
                                    }
                                }
                            }
                            map = this.f14204i;
                            if (map.containsKey(b0Var)) {
                                mVar = (m) map.get(b0Var);
                                Objects.requireNonNull(mVar);
                                iVar = null;
                            } else {
                                iVar = null;
                                m mVar3 = new m(new e(e1Var, b0Var), 1);
                                map.put(b0Var, mVar3);
                                mVar = mVar3;
                            }
                            treeMap2 = mVar.f200673b;
                            Size size3 = q0.c.f141971a;
                            entryCeilingEntry2 = treeMap2.ceilingEntry(next);
                            if (entryCeilingEntry2 != null) {
                                value2 = entryCeilingEntry2.getValue();
                            } else {
                                entryFloorEntry2 = treeMap2.floorEntry(next);
                                if (entryFloorEntry2 != null) {
                                    value2 = entryFloorEntry2.getValue();
                                } else {
                                    value2 = iVar;
                                }
                            }
                            uVar = (u) value2;
                            if (uVar == null) {
                                uVar = u.f200714g;
                            }
                            Objects.toString(uVar);
                            Objects.toString(next);
                            if (uVar != u.f200714g) {
                                iVarA = mVar.a(uVar);
                                if (iVarA == null) {
                                    vb.h.q("Camera advertised available quality but did not produce EncoderProfiles for advertised quality.");
                                    return iVar;
                                }
                            } else {
                                iVarA = iVar;
                            }
                            if (iVarA != null) {
                                cVarF = iVarA.f();
                                f0VarFind = this.f14202g.find(cVarF.h());
                                if (f0VarFind != null) {
                                    treeMap.put(cVarF.j(), iVarA);
                                    arrayList2.add(h1.c.a(cVarF, next, f0VarFind.c()));
                                }
                            }
                        }
                        f1Var = null;
                        if (!arrayList2.isEmpty()) {
                            Size size4 = q0.c.f141971a;
                            entryCeilingEntry = treeMap.ceilingEntry(next);
                            if (entryCeilingEntry != null) {
                                value = entryCeilingEntry.getValue();
                            } else {
                                entryFloorEntry = treeMap.floorEntry(next);
                                if (entryFloorEntry != null) {
                                    value = entryFloorEntry.getValue();
                                } else {
                                    value = null;
                                }
                            }
                            f1 f1Var3 = (f1) value;
                            Objects.requireNonNull(f1Var3);
                            jVarE = f1.b.e(f1Var3.c(), f1Var3.a(), f1Var3.b(), arrayList2);
                            break;
                        }
                    }
                }
                if (f1VarA2 == null) {
                    if (f1VarA2 != null) {
                        iC = f1VarA2.c();
                    } else {
                        iC = jVarE.f5576a;
                    }
                    if (f1VarA2 != null) {
                        iA = f1VarA2.a();
                    } else {
                        iA = jVarE.f5577b;
                    }
                    if (f1VarA2 != null) {
                        listB = f1VarA2.b();
                    } else {
                        listB = jVarE.f5578c;
                    }
                    arrayList = new ArrayList();
                    if (f1VarA2 != null) {
                        arrayList.addAll(f1VarA2.d());
                    }
                    if (jVarE != null) {
                        arrayList.addAll(jVarE.f5579d);
                    }
                    f1VarA2 = f1.b.e(iC, iA, listB, arrayList);
                } else {
                    if (f1VarA2 != null) {
                        iC = f1VarA2.c();
                    } else {
                        iC = jVarE.f5576a;
                    }
                    if (f1VarA2 != null) {
                        iA = f1VarA2.a();
                    } else {
                        iA = jVarE.f5577b;
                    }
                    if (f1VarA2 != null) {
                        listB = f1VarA2.b();
                    } else {
                        listB = jVarE.f5578c;
                    }
                    arrayList = new ArrayList();
                    if (f1VarA2 != null) {
                        arrayList.addAll(f1VarA2.d());
                    }
                    if (jVarE != null) {
                        arrayList.addAll(jVarE.f5579d);
                    }
                    f1VarA2 = f1.b.e(iC, iA, listB, arrayList);
                }
            }
        }
        map2.put(Integer.valueOf(i14), f1VarA2);
        return f1VarA2;
    }
}
