package o63;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import m63.j0;
import m63.k1;
import mt0.s1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p13.c1;
import p13.l0;
import p13.u0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0012\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lo63/t;", "Lo63/b;", "Ln63/b;", "json", "Ln63/x;", "value", "", "polymorphicDiscriminator", "Lk63/e;", "polyDescriptor", "<init>", "(Ln63/b;Ln63/x;Ljava/lang/String;Lk63/e;)V", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class t extends b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n63.x f129884h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k63.e f129885i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f129886j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f129887k;

    public /* synthetic */ t(n63.b bVar, n63.x xVar, String str, k63.e eVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, xVar, (i14 & 4) != 0 ? null : str, (i14 & 8) != 0 ? null : eVar);
    }

    @Override // o63.b, m63.z1, l63.e
    public final boolean D() {
        return !this.f129887k && super.D();
    }

    @Override // m63.b1
    public String U(k63.e eVar, int i14) {
        eVar.getClass();
        n63.b bVar = this.f129829d;
        o.e(eVar, bVar);
        String strD = eVar.d(i14);
        if (this.f129832g.f123930l && !getF129830e().f123948a.keySet().contains(strD)) {
            k kVar = bVar.f123895c;
            k.a<Map<String, Integer>> aVar = o.f129873a;
            s1 s1Var = new s1(22, eVar, bVar);
            kVar.getClass();
            aVar.getClass();
            ConcurrentHashMap concurrentHashMap = kVar.f129868a;
            Map map = (Map) concurrentHashMap.get(eVar);
            Object obj = null;
            Object objInvoke = map != null ? map.get(aVar) : null;
            if (objInvoke == null) {
                objInvoke = null;
            }
            if (objInvoke == null) {
                objInvoke = s1Var.invoke();
                Object concurrentHashMap2 = concurrentHashMap.get(eVar);
                if (concurrentHashMap2 == null) {
                    concurrentHashMap2 = new ConcurrentHashMap(2);
                    concurrentHashMap.put(eVar, concurrentHashMap2);
                }
                ((Map) concurrentHashMap2).put(aVar, objInvoke);
            }
            Map map2 = (Map) objInvoke;
            for (Object obj2 : getF129830e().f123948a.keySet()) {
                Integer num = (Integer) map2.get((String) obj2);
                if (num != null && num.intValue() == i14) {
                    obj = obj2;
                    break;
                }
            }
            String str = (String) obj;
            if (str != null) {
                return str;
            }
        }
        return strD;
    }

    @Override // o63.b
    public n63.i W(String str) {
        str.getClass();
        return (n63.i) u0.c(str, getF129830e());
    }

    @Override // o63.b, m63.z1, l63.c
    public void b(k63.e eVar) {
        Set setH;
        eVar.getClass();
        n63.b bVar = this.f129829d;
        if (o.d(eVar, bVar) || (eVar.getF103234b() instanceof k63.c)) {
            return;
        }
        o.e(eVar, bVar);
        if (this.f129832g.f123930l) {
            Set setB = k1.b(eVar);
            k kVar = bVar.f123895c;
            k.a<Map<String, Integer>> aVar = o.f129873a;
            kVar.getClass();
            aVar.getClass();
            Map map = (Map) kVar.f129868a.get(eVar);
            Object obj = map != null ? map.get(aVar) : null;
            if (obj == null) {
                obj = null;
            }
            Map map2 = (Map) obj;
            Set setKeySet = map2 != null ? map2.keySet() : null;
            if (setKeySet == null) {
                setKeySet = l0.f134950a;
            }
            setH = c1.h(setB, setKeySet);
        } else {
            setH = k1.b(eVar);
        }
        for (String str : getF129830e().f123948a.keySet()) {
            if (!setH.contains(str) && !p005kotlin.jvm.internal.s.g(str, this.f129831f)) {
                StringBuilder sbL = hb.a.l("Encountered an unknown key '", str, "' at element: ");
                sbL.append(V());
                sbL.append("\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: ");
                sbL.append((Object) gg.b.K(-1, getF129830e().toString()));
                throw gg.b.g(-1, sbL.toString());
            }
        }
    }

    @Override // o63.b
    /* JADX INFO: renamed from: b0, reason: from getter and merged with bridge method [inline-methods] */
    public n63.x getF129878h() {
        return this.f129884h;
    }

    @Override // o63.b, m63.z1, l63.e
    public final l63.c c(k63.e eVar) {
        eVar.getClass();
        k63.e eVar2 = this.f129885i;
        if (eVar != eVar2) {
            return super.c(eVar);
        }
        n63.i iVarX = X();
        String f103257a = eVar2.getF103221c();
        if (iVarX instanceof n63.x) {
            String str = this.f129831f;
            return new t(this.f129829d, (n63.x) iVarX, str, eVar2);
        }
        StringBuilder sb3 = new StringBuilder("Expected ");
        t0 t0Var = s0.f105811a;
        sb3.append(t0Var.b(n63.x.class).D());
        sb3.append(", but had ");
        sb3.append(t0Var.b(iVarX.getClass()).D());
        sb3.append(" as the serialized body of ");
        sb3.append(f103257a);
        sb3.append(" at element: ");
        sb3.append(V());
        throw gg.b.h(iVarX.toString(), -1, sb3.toString());
    }

    public final boolean c0(k63.e eVar, int i14) {
        boolean z14 = (this.f129829d.f123893a.f123924f || eVar.i(i14) || !eVar.h(i14).b()) ? false : true;
        this.f129887k = z14;
        return z14;
    }

    @Override // l63.c
    public int e(k63.e eVar) {
        eVar.getClass();
        while (this.f129886j < eVar.getF103235c()) {
            int i14 = this.f129886j;
            this.f129886j = i14 + 1;
            String strU = U(eVar, i14);
            strU.getClass();
            int i15 = this.f129886j - 1;
            this.f129887k = false;
            if (getF129830e().containsKey(strU) || c0(eVar, i15)) {
                if (this.f129832g.f123926h) {
                    boolean zI = eVar.i(i15);
                    k63.e eVarH = eVar.h(i15);
                    if (!zI || eVarH.b() || !(((n63.i) getF129830e().get(strU)) instanceof n63.u)) {
                        if (p005kotlin.jvm.internal.s.g(eVarH.getF103234b(), k63.l.b.f103252a) && (!eVarH.b() || !(((n63.i) getF129830e().get(strU)) instanceof n63.u))) {
                            n63.i iVar = (n63.i) getF129830e().get(strU);
                            String f123941c = null;
                            n63.z zVar = iVar instanceof n63.z ? (n63.z) iVar : null;
                            if (zVar != null) {
                                j0 j0Var = n63.j.f123935a;
                                if (!(zVar instanceof n63.u)) {
                                    f123941c = zVar.getF123941c();
                                }
                            }
                            if (f123941c != null) {
                                n63.b bVar = this.f129829d;
                                int iB = o.b(eVarH, bVar, f123941c);
                                boolean z14 = !bVar.f123893a.f123924f && eVarH.b();
                                if (iB != -3 || ((!zI && !z14) || c0(eVar, i15))) {
                                }
                            }
                        }
                    }
                }
                return i15;
            }
        }
        return -1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(n63.b bVar, n63.x xVar, String str, k63.e eVar) {
        super(bVar, xVar, str, null);
        bVar.getClass();
        xVar.getClass();
        this.f129884h = xVar;
        this.f129885i = eVar;
    }
}
