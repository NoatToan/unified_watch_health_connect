package q6;

import am.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import t6.i;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public hy.d f143084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f143085b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap<Object, q6.e> f143086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap<Object, q6.d> f143087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap<String, ArrayList<String>> f143088e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q6.a f143089f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f143090g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList<Object> f143091h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList<t6.e> f143092i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f143093j;

    public enum a {
        SPREAD,
        SPREAD_INSIDE,
        PACKED;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final HashMap f143097d;

        static {
            a aVar = SPREAD;
            a aVar2 = SPREAD_INSIDE;
            a aVar3 = PACKED;
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            f143097d = map2;
            map.put("packed", aVar3);
            map.put("spread_inside", aVar2);
            map.put("spread", aVar);
            f.r(2, map2, "packed", 1, "spread_inside");
            map2.put("spread", 0);
        }

        public static int a(String str) {
            HashMap map = f143097d;
            if (map.containsKey(str)) {
                return ((Integer) map.get(str)).intValue();
            }
            return -1;
        }
    }

    public enum b {
        LEFT_TO_LEFT,
        LEFT_TO_RIGHT,
        RIGHT_TO_LEFT,
        RIGHT_TO_RIGHT,
        START_TO_START,
        START_TO_END,
        END_TO_START,
        END_TO_END,
        TOP_TO_TOP,
        TOP_TO_BOTTOM,
        TOP_TO_BASELINE,
        BOTTOM_TO_TOP,
        BOTTOM_TO_BOTTOM,
        BOTTOM_TO_BASELINE,
        BASELINE_TO_BASELINE,
        BASELINE_TO_TOP,
        BASELINE_TO_BOTTOM,
        CENTER_HORIZONTALLY,
        CENTER_VERTICALLY,
        CIRCULAR_CONSTRAINT
    }

    public enum c {
        LEFT,
        RIGHT,
        START,
        END,
        TOP,
        BOTTOM
    }

    public enum d {
        HORIZONTAL_CHAIN,
        VERTICAL_CHAIN,
        /* JADX INFO: Fake field, exist only in values array */
        ALIGN_HORIZONTALLY,
        ALIGN_VERTICALLY,
        BARRIER,
        /* JADX INFO: Fake field, exist only in values array */
        LAYER,
        HORIZONTAL_FLOW,
        VERTICAL_FLOW,
        GRID,
        ROW,
        COLUMN,
        /* JADX INFO: Fake field, exist only in values array */
        FLOW
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 q6.g$e, still in use, count: 1, list:
      (r0v0 q6.g$e) from 0x002c: INVOKE (r4v3 java.util.HashMap), ("none"), (r0v0 q6.g$e) VIRTUAL call: java.util.HashMap.put(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(K, V):V (c)]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class e {
        /* JADX INFO: Fake field, exist only in values array */
        NONE,
        /* JADX INFO: Fake field, exist only in values array */
        CHAIN,
        /* JADX INFO: Fake field, exist only in values array */
        ALIGNED;


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashMap f143137a;

        static {
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            f143137a = map2;
            map.put("none", eVar);
            map.put("chain", eVar);
            map.put("aligned", eVar);
            f.r(0, map2, "none", 3, "chain");
            map2.put("aligned", 2);
        }

        private e() {
            super(str, i);
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) f143138b.clone();
        }
    }

    public g() {
        HashMap<Object, q6.e> map = new HashMap<>();
        this.f143086c = map;
        this.f143087d = new HashMap<>();
        this.f143088e = new HashMap<>();
        q6.a aVar = new q6.a(this);
        this.f143089f = aVar;
        this.f143090g = 0;
        this.f143091h = new ArrayList<>();
        this.f143092i = new ArrayList<>();
        this.f143093j = true;
        aVar.f143017a = 0;
        map.put(0, aVar);
    }

    public final void a(t6.f fVar) {
        HashMap<Object, q6.e> map;
        q6.d dVar;
        i iVarS;
        i iVarS2;
        fVar.f162695w0.clear();
        q6.a aVar = this.f143089f;
        aVar.f143026e0.a(fVar, 0);
        aVar.f143028f0.a(fVar, 1);
        HashMap<Object, q6.d> map2 = this.f143087d;
        Iterator<Object> it = map2.keySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            map = this.f143086c;
            if (!zHasNext) {
                break;
            }
            Object next = it.next();
            i iVarS3 = map2.get(next).s();
            if (iVarS3 != null) {
                q6.e eVarC = map.get(next);
                if (eVarC == null) {
                    eVarC = c(next);
                }
                eVarC.c(iVarS3);
            }
        }
        for (Object obj : map.keySet()) {
            q6.e eVar = map.get(obj);
            if (eVar != aVar && (eVar.b() instanceof q6.d) && (iVarS2 = ((q6.d) eVar.b()).s()) != null) {
                q6.e eVarC2 = map.get(obj);
                if (eVarC2 == null) {
                    eVarC2 = c(obj);
                }
                eVarC2.c(iVarS2);
            }
        }
        Iterator<Object> it3 = map.keySet().iterator();
        while (it3.hasNext()) {
            q6.e eVar2 = map.get(it3.next());
            if (eVar2 != aVar) {
                t6.e eVarA = eVar2.a();
                eVarA.f162627m0 = eVar2.getKey().toString();
                eVarA.X = null;
                if (eVar2.b() instanceof r6.h) {
                    eVar2.apply();
                }
                fVar.W(eVarA);
            } else {
                eVar2.c(fVar);
            }
        }
        Iterator<Object> it4 = map2.keySet().iterator();
        while (it4.hasNext()) {
            q6.d dVar2 = map2.get(it4.next());
            if (dVar2.s() != null) {
                Iterator<Object> it5 = dVar2.f143082m0.iterator();
                while (it5.hasNext()) {
                    dVar2.s().W(map.get(it5.next()).a());
                }
                dVar2.apply();
            } else {
                dVar2.apply();
            }
        }
        Iterator<Object> it6 = map.keySet().iterator();
        while (it6.hasNext()) {
            q6.e eVar3 = map.get(it6.next());
            if (eVar3 != aVar && (eVar3.b() instanceof q6.d) && (iVarS = (dVar = (q6.d) eVar3.b()).s()) != null) {
                for (Object obj2 : dVar.f143082m0) {
                    q6.e eVar4 = map.get(obj2);
                    if (eVar4 != null) {
                        iVarS.W(eVar4.a());
                    } else if (obj2 instanceof q6.e) {
                        iVarS.W(((q6.e) obj2).a());
                    } else {
                        System.out.println("couldn't find reference for " + obj2);
                    }
                }
                eVar3.apply();
            }
        }
        for (Object obj3 : map.keySet()) {
            q6.e eVar5 = map.get(obj3);
            eVar5.apply();
            t6.e eVarA2 = eVar5.a();
            if (eVarA2 != null && obj3 != null) {
                eVarA2.f162624l = obj3.toString();
            }
        }
    }

    public final void b(Object obj) {
        this.f143091h.add(obj);
        this.f143093j = true;
    }

    public final q6.a c(Object obj) {
        HashMap<Object, q6.e> map = this.f143086c;
        q6.e eVar = map.get(obj);
        Object obj2 = eVar;
        if (eVar == null) {
            q6.a aVar = new q6.a(this);
            map.put(obj, aVar);
            aVar.f143017a = obj;
            obj2 = aVar;
        }
        if (obj2 instanceof q6.a) {
            return (q6.a) obj2;
        }
        return null;
    }

    public int d(Float f14) {
        return Math.round(f14.floatValue());
    }

    public final r6.h e(int i14, String str) {
        q6.a aVarC = c(str);
        Object obj = aVarC.f143021c;
        if (obj == null || !(obj instanceof r6.h)) {
            r6.h hVar = new r6.h(this);
            hVar.f151001b = i14;
            hVar.f151006g = str;
            aVarC.f143021c = hVar;
            aVarC.c(hVar.a());
        }
        return (r6.h) aVarC.f143021c;
    }

    public final q6.d f(d dVar) {
        StringBuilder sb3 = new StringBuilder("__HELPER_KEY_");
        int i14 = this.f143090g;
        this.f143090g = i14 + 1;
        String strQ = j.q(sb3, i14, "__");
        HashMap<Object, q6.d> map = this.f143087d;
        q6.d iVar = map.get(strQ);
        if (iVar == null) {
            switch (dVar) {
                case HORIZONTAL_CHAIN:
                    iVar = new r6.i(this);
                    break;
                case VERTICAL_CHAIN:
                    iVar = new r6.j(this);
                    break;
                case ALIGN_HORIZONTALLY:
                    iVar = new r6.a(this);
                    break;
                case ALIGN_VERTICALLY:
                    iVar = new r6.b(this);
                    break;
                case BARRIER:
                    iVar = new r6.c(this);
                    break;
                case LAYER:
                default:
                    iVar = new q6.d(this, dVar);
                    break;
                case HORIZONTAL_FLOW:
                case VERTICAL_FLOW:
                    iVar = new r6.f(this, dVar);
                    break;
                case GRID:
                case ROW:
                case COLUMN:
                    iVar = new r6.g(this, dVar);
                    break;
            }
            iVar.f143017a = strQ;
            map.put(strQ, iVar);
        }
        return iVar;
    }

    public final boolean g(t6.e eVar) {
        boolean z14 = this.f143093j;
        ArrayList<t6.e> arrayList = this.f143092i;
        if (z14) {
            arrayList.clear();
            Iterator<Object> it = this.f143091h.iterator();
            while (it.hasNext()) {
                t6.e eVarA = this.f143086c.get(it.next()).a();
                if (eVarA != null) {
                    arrayList.add(eVarA);
                }
            }
            this.f143093j = false;
        }
        return arrayList.contains(eVar);
    }

    public final void h() {
        HashMap<Object, q6.e> map = this.f143086c;
        Iterator<Object> it = map.keySet().iterator();
        while (it.hasNext()) {
            map.get(it.next()).a().E();
        }
        map.clear();
        map.put(0, this.f143089f);
        this.f143087d.clear();
        this.f143088e.clear();
        this.f143091h.clear();
        this.f143093j = true;
    }
}
