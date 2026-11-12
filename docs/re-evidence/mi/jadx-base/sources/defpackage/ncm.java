package defpackage;

import com.typesafe.config.ConfigException;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class ncm extends g00 implements Serializable {
    public static final ncm f = B0(ocm.r("empty config"));
    private static final long serialVersionUID = 2;
    public final Map<String, h00> c;
    public final boolean d;
    public final boolean e;

    public class a implements h00.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eqk f27788a;

        public a(eqk eqkVar) {
            this.f27788a = eqkVar;
        }

        @Override // h00.a
        public h00 a(String str, h00 h00Var) throws h00.c {
            qlh qlhVarJ;
            if (this.f27788a.a()) {
                return (!str.equals(this.f27788a.f().b()) || (qlhVarJ = this.f27788a.f().j()) == null) ? h00Var : this.f27788a.e(qlhVarJ).c(h00Var);
            }
            return this.f27788a.j().c(h00Var);
        }
    }

    public class b extends h00.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ qlh f27790b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(qlh qlhVar) {
            super();
            this.f27790b = qlhVar;
        }

        @Override // h00.b
        public h00 b(String str, h00 h00Var) {
            return h00Var.V(this.f27790b);
        }
    }

    public ncm(jc4 jc4Var, Map<String, h00> map, iqk iqkVar, boolean z) {
        super(jc4Var);
        if (map == null) {
            throw new ConfigException.BugOrBroken("creating config object with null map");
        }
        this.c = map;
        this.d = iqkVar == iqk.RESOLVED;
        this.e = z;
        if (iqkVar == iqk.b(map.values())) {
            return;
        }
        throw new ConfigException.BugOrBroken("Wrong resolved status on " + this);
    }

    public static final ncm A0() {
        return f;
    }

    public static final ncm B0(jc4 jc4Var) {
        return jc4Var == null ? A0() : new ncm(jc4Var, Collections.emptyMap());
    }

    public static final ncm C0(jc4 jc4Var) {
        return new ncm(ocm.r(jc4Var.a() + " (not found)"), Collections.emptyMap());
    }

    public static boolean D0(Map<String, rc4> map, Map<String, rc4> map2) {
        Set<String> setKeySet = map.keySet();
        if (!setKeySet.equals(map2.keySet())) {
            return false;
        }
        for (String str : setKeySet) {
            if (!map.get(str).equals(map2.get(str))) {
                return false;
            }
        }
        return true;
    }

    public static int E0(Map<String, rc4> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(map.keySet());
        Collections.sort(arrayList);
        Iterator it = arrayList.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += map.get((String) it.next()).hashCode();
        }
        return ((arrayList.hashCode() + 41) * 41) + iHashCode;
    }

    private Object writeReplace() throws ObjectStreamException {
        return new rwl(this);
    }

    @Override // defpackage.h00
    public boolean C() {
        return this.e;
    }

    @Override // defpackage.g00
    /* JADX INFO: renamed from: F0, reason: merged with bridge method [inline-methods] */
    public ncm H(g00 g00Var) {
        Y();
        if (!(g00Var instanceof ncm)) {
            throw new ConfigException.BugOrBroken("should not be reached (merging non-SimpleConfigObject)");
        }
        ncm ncmVar = (ncm) g00Var;
        HashMap map = new HashMap();
        HashSet<String> hashSet = new HashSet();
        hashSet.addAll(keySet());
        hashSet.addAll(ncmVar.keySet());
        boolean z = false;
        boolean z2 = true;
        for (String str : hashSet) {
            h00 h00Var = this.c.get(str);
            h00 h00VarE = ncmVar.c.get(str);
            if (h00Var != null) {
                h00VarE = h00VarE == null ? h00Var : h00Var.e(h00VarE);
            }
            map.put(str, h00VarE);
            if (h00Var != h00VarE) {
                z = true;
            }
            if (h00VarE.Z() == iqk.UNRESOLVED) {
                z2 = false;
            }
        }
        iqk iqkVarA = iqk.a(z2);
        boolean zC = ncmVar.C();
        if (z) {
            return new ncm(g00.k0(this, ncmVar), map, iqkVarA, zC);
        }
        return (iqkVarA == Z() && zC == C()) ? this : J0(iqkVarA, g(), zC);
    }

    public final ncm G0(h00.b bVar) {
        try {
            return H0(bVar);
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            throw new ConfigException.BugOrBroken("unexpected checked exception", e2);
        }
    }

    public final ncm H0(h00.a aVar) throws Exception {
        HashMap map = null;
        for (String str : keySet()) {
            h00 h00Var = this.c.get(str);
            h00 h00VarA = aVar.a(str, h00Var);
            if (h00VarA != h00Var) {
                if (map == null) {
                    map = new HashMap();
                }
                map.put(str, h00VarA);
            }
        }
        if (map == null) {
            return this;
        }
        HashMap map2 = new HashMap();
        boolean z = false;
        for (String str2 : keySet()) {
            if (map.containsKey(str2)) {
                h00 h00Var2 = (h00) map.get(str2);
                if (h00Var2 != null) {
                    map2.put(str2, h00Var2);
                    if (h00Var2.Z() == iqk.UNRESOLVED) {
                        z = true;
                    }
                }
            } else {
                h00 h00Var3 = this.c.get(str2);
                map2.put(str2, h00Var3);
                if (h00Var3.Z() == iqk.UNRESOLVED) {
                    z = true;
                }
            }
        }
        return new ncm(g(), map2, z ? iqk.UNRESOLVED : iqk.RESOLVED, C());
    }

    @Override // defpackage.g00
    /* JADX INFO: renamed from: I0, reason: merged with bridge method [inline-methods] */
    public ncm n0(iqk iqkVar, jc4 jc4Var) {
        return J0(iqkVar, jc4Var, this.e);
    }

    public final ncm J0(iqk iqkVar, jc4 jc4Var, boolean z) {
        return new ncm(jc4Var, this.c, iqkVar, z);
    }

    @Override // defpackage.g00
    /* JADX INFO: renamed from: K0, reason: merged with bridge method [inline-methods] */
    public ncm V(qlh qlhVar) {
        return G0(new b(qlhVar));
    }

    @Override // defpackage.rc4
    /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
    public Map<String, Object> x() {
        HashMap map = new HashMap();
        for (Map.Entry<String, h00> entry : this.c.entrySet()) {
            map.put(entry.getKey(), entry.getValue().x());
        }
        return map;
    }

    @Override // defpackage.h00
    /* JADX INFO: renamed from: M0, reason: merged with bridge method [inline-methods] */
    public ncm e0() {
        return this.e ? this : J0(Z(), g(), true);
    }

    @Override // defpackage.h00
    public void W(StringBuilder sb, int i, boolean z, oc4 oc4Var) {
        int i2;
        int i3;
        if (isEmpty()) {
            sb.append("{}");
        } else {
            int i4 = 0;
            boolean z2 = oc4Var.d() || !z;
            if (z2) {
                int i5 = i + 1;
                sb.append("{");
                if (oc4Var.c()) {
                    sb.append('\n');
                }
                i2 = i5;
            } else {
                i2 = i;
            }
            String[] strArr = (String[]) keySet().toArray(new String[size()]);
            Arrays.sort(strArr);
            for (String str : strArr) {
                h00 h00Var = this.c.get(str);
                if (oc4Var.e()) {
                    h00.E(sb, i2, oc4Var);
                    sb.append("# ");
                    sb.append(h00Var.g().a());
                    sb.append("\n");
                }
                if (oc4Var.b()) {
                    for (String str2 : h00Var.g().f()) {
                        h00.E(sb, i2, oc4Var);
                        sb.append(PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX);
                        if (!str2.startsWith(" ")) {
                            sb.append(' ');
                        }
                        sb.append(str2);
                        sb.append("\n");
                    }
                }
                h00.E(sb, i2, oc4Var);
                h00Var.X(sb, i2, false, str, oc4Var);
                if (oc4Var.c()) {
                    if (oc4Var.d()) {
                        sb.append(",");
                        i3 = 2;
                    } else {
                        i3 = 1;
                    }
                    sb.append('\n');
                    i4 = i3;
                } else {
                    sb.append(",");
                    i4 = 1;
                }
            }
            sb.setLength(sb.length() - i4);
            if (z2) {
                if (oc4Var.c()) {
                    sb.append('\n');
                    if (z2) {
                        h00.E(sb, i, oc4Var);
                    }
                }
                sb.append("}");
            }
        }
        if (z && oc4Var.c()) {
            sb.append('\n');
        }
    }

    @Override // defpackage.h00
    public iqk Z() {
        return iqk.a(this.d);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.c.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.c.containsValue(obj);
    }

    @Override // java.util.Map
    public Set<Map.Entry<String, rc4>> entrySet() {
        HashSet hashSet = new HashSet();
        for (Map.Entry<String, h00> entry : this.c.entrySet()) {
            hashSet.add(new AbstractMap.SimpleImmutableEntry(entry.getKey(), entry.getValue()));
        }
        return hashSet;
    }

    @Override // defpackage.h00
    public boolean equals(Object obj) {
        return (obj instanceof ic4) && z(obj) && D0(this, (ic4) obj);
    }

    @Override // defpackage.g00
    public h00 g0(String str) {
        return this.c.get(str);
    }

    @Override // defpackage.h00
    public int hashCode() {
        return E0(this);
    }

    @Override // defpackage.g00, java.util.Map
    /* JADX INFO: renamed from: i0 */
    public h00 get(Object obj) {
        return this.c.get(obj);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.c.isEmpty();
    }

    @Override // java.util.Map
    public Set<String> keySet() {
        return this.c.keySet();
    }

    @Override // java.util.Map
    public int size() {
        return this.c.size();
    }

    @Override // defpackage.g00, defpackage.h00
    /* JADX INFO: renamed from: v0 */
    public g00 a0(eqk eqkVar) throws h00.c {
        if (Z() == iqk.RESOLVED) {
            return this;
        }
        try {
            return H0(new a(eqkVar));
        } catch (h00.c e) {
            throw e;
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new ConfigException.BugOrBroken("unexpected checked exception", e3);
        }
    }

    @Override // java.util.Map
    public Collection<rc4> values() {
        return new HashSet(this.c.values());
    }

    @Override // defpackage.h00
    public boolean z(Object obj) {
        return obj instanceof ic4;
    }

    public ncm(jc4 jc4Var, Map<String, h00> map) {
        this(jc4Var, map, iqk.b(map.values()), false);
    }
}
