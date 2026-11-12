package defpackage;

import com.xiaomi.ai.nlp.lattice.rule.RefSlotType;
import com.xiaomi.ai.nlp.lattice.rule.RuleApplyPhase;
import com.xiaomi.ai.nlp.lm.core.LanguageModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* JADX INFO: loaded from: classes7.dex */
public class vwp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u0l f37315a = new u0l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f37316b = 3;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37317a;

        static {
            int[] iArr = new int[RefSlotType.values().length];
            f37317a = iArr;
            try {
                iArr[RefSlotType.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37317a[RefSlotType.INTEGER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public int a(y2e y2eVar, j82 j82Var, RuleApplyPhase ruleApplyPhase, LanguageModel languageModel) {
        return b(y2eVar, j82Var, ruleApplyPhase, languageModel, 3);
    }

    public int b(y2e y2eVar, j82 j82Var, RuleApplyPhase ruleApplyPhase, LanguageModel languageModel, int i) {
        boolean z;
        HashSet hashSet = new HashSet();
        int i2 = 0;
        while (i2 < i) {
            List<s0l> listM = m(y2eVar, ruleApplyPhase.isApplyBestPath());
            if (listM.isEmpty()) {
                return i2;
            }
            Collections.sort(listM);
            Iterator<s0l> it = listM.iterator();
            while (true) {
                z = false;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    s0l next = it.next();
                    if (!hashSet.contains(next)) {
                        hashSet.add(next);
                        next.a(y2eVar, j82Var, ruleApplyPhase, languageModel);
                        if (z || next.d) {
                            z = true;
                        }
                    }
                }
            }
            if (!z) {
                break;
            }
            i2++;
        }
        return i2;
    }

    public void c(nb4 nb4Var, String str, brk brkVar) {
        try {
            Iterator<? extends nb4> it = nb4Var.j(str).iterator();
            while (it.hasNext()) {
                Iterator<s0l> it2 = com.xiaomi.ai.nlp.lattice.rule.a.f(it.next(), brkVar).iterator();
                while (it2.hasNext()) {
                    this.f37315a.b(it2.next());
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void d(String str, String str2, brk brkVar) {
        c(com.typesafe.config.a.f(str), str2, brkVar);
    }

    public final boolean e(y2e y2eVar, gzk gzkVar, ovg ovgVar, boolean z) {
        int size;
        int iA;
        if (gzkVar.e() == -1 || (size = gzkVar.d().size()) == 0 || (iA = gzkVar.d().get(size - 1).a()) == -1) {
            return true;
        }
        if (z) {
            return ovgVar.d() == y2eVar.m(iA);
        }
        return ovgVar.m().contains(y2eVar.m(iA));
    }

    public final List<t0l> f(xb8 xb8Var) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new t0l(klo.e(xb8Var.e()) ? xb8Var.e() : xb8Var.h(), xb8Var.f(), xb8Var.g()));
        arrayList.add(new t0l("<any>", xb8Var.f(), xb8Var.g()));
        return arrayList;
    }

    public final boolean g(Queue<gzk> queue, gzk gzkVar, y2e y2eVar, ovg ovgVar) {
        for (gzk gzkVar2 : queue) {
            if (gzkVar2.d().get(gzkVar2.d().size() - 1).b() == -1) {
                int i = 0;
                while (true) {
                    if (i >= gzkVar2.d().size() || i >= gzkVar.d().size()) {
                        if (i != gzkVar2.d().size() - 1) {
                            break;
                        }
                        xb8 xb8VarI = y2eVar.n().get(Integer.valueOf(gzkVar2.d().get(i).f41784a)).i();
                        if (xb8VarI.a() != ovgVar.i().a() || xb8VarI.b() != ovgVar.i().b()) {
                            break;
                        }
                        return false;
                    }
                    if (!gzkVar.d().get(i).equals(gzkVar2.d().get(i))) {
                        break;
                    }
                    i++;
                }
            }
        }
        return true;
    }

    public final boolean h(List<zxk> list, Iterator<s0l> it) {
        if (!list.isEmpty() && list.get(list.size() - 1).b() != -1) {
            return false;
        }
        it.remove();
        return true;
    }

    public final boolean i(List<zxk> list, List<t0l> list2, Iterator<s0l> it) {
        Iterator<zxk> it2 = list.iterator();
        int i = 0;
        int i2 = 0;
        while (it2.hasNext()) {
            if (it2.next().b() != -1) {
                int iB = list2.get(i2).b();
                if (iB != -1 && iB < i) {
                    it.remove();
                    return true;
                }
                i2++;
                i = 0;
            } else {
                i++;
            }
        }
        return false;
    }

    public final boolean j(List<zxk> list, List<t0l> list2, y2e y2eVar, Iterator<s0l> it) {
        int i = 0;
        for (zxk zxkVar : list) {
            if (zxkVar.b() != -1) {
                RefSlotType refSlotTypeD = list2.get(i).d();
                int i2 = a.f37317a[refSlotTypeD.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalArgumentException("unexpected ref slot type: " + refSlotTypeD);
                    }
                    if (!klo.c(y2eVar.m(zxkVar.a()).i().g())) {
                        it.remove();
                        return true;
                    }
                }
                i++;
            }
        }
        return false;
    }

    public final void k(List<s0l> list, y2e y2eVar) {
        Iterator<s0l> it = list.iterator();
        while (it.hasNext()) {
            s0l next = it.next();
            List<t0l> listH = next.h();
            List<zxk> listD = next.e().d();
            if (!h(listD, it) && !i(listD, listH, it) && !l(listD, listH, y2eVar, it)) {
                j(listD, listH, y2eVar, it);
            }
        }
    }

    public final boolean l(List<zxk> list, List<t0l> list2, y2e y2eVar, Iterator<s0l> it) {
        int i = 0;
        for (zxk zxkVar : list) {
            if (zxkVar.b() != -1) {
                String strF = list2.get(i).f();
                String strG = y2eVar.m(zxkVar.a()).i().g();
                i++;
                if (strF != null && strG != null && !strF.equals(strG)) {
                    it.remove();
                    return true;
                }
            }
        }
        return false;
    }

    public List<s0l> m(y2e y2eVar, boolean z) {
        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();
        linkedList.add(y2eVar.l());
        HashSet hashSet = new HashSet();
        LinkedList linkedList2 = new LinkedList();
        int i = -1;
        int i2 = 0;
        linkedList2.add(new gzk().a(new zxk(-1, 0)));
        int i3 = 1;
        while (!linkedList.isEmpty()) {
            ArrayList<gzk> arrayList2 = new ArrayList();
            int i4 = i2;
            while (!linkedList2.isEmpty()) {
                gzk gzkVarPoll = linkedList2.poll();
                if (gzkVarPoll.e() == 0) {
                    i4 = 1;
                }
                arrayList2.add(gzkVarPoll);
            }
            if (i4 == 0) {
                arrayList2.add(new gzk().a(new zxk(i, i2)));
            }
            int i5 = i2;
            int size = i5;
            while (i5 < i3) {
                ovg ovgVar = (ovg) linkedList.poll();
                if (!hashSet.contains(ovgVar)) {
                    hashSet.add(ovgVar);
                    if (!z) {
                        linkedList.addAll(ovgVar.o());
                        size += ovgVar.o().size();
                    } else if (ovgVar.e() != null) {
                        linkedList.add(ovgVar.e());
                        size++;
                    }
                    for (gzk gzkVar : arrayList2) {
                        Iterator<t0l> it = f(ovgVar.i()).iterator();
                        boolean z2 = false;
                        while (it.hasNext()) {
                            linkedList = linkedList;
                            hashSet = hashSet;
                            int iC = this.f37315a.c(gzkVar.e(), it.next());
                            if ((iC != -1 || (gzkVar.e() != 0 && ((gzkVar.c() < 4 || z) && !z2))) && e(y2eVar, gzkVar, ovgVar, z)) {
                                gzk gzkVarB = gzkVar.b();
                                boolean z3 = iC != -1 || g(linkedList2, gzkVarB, y2eVar, ovgVar);
                                int i6 = i3;
                                gzkVarB.a(new zxk(ovgVar.l(), iC));
                                List<s0l> listA = this.f37315a.a(gzkVarB.e(), gzkVarB);
                                if (listA != null) {
                                    arrayList.addAll(listA);
                                }
                                if (z3) {
                                    linkedList2.add(gzkVarB);
                                }
                                if (iC != -1 && gzkVar.e() != 0 && !z2) {
                                    gzk gzkVarB2 = gzkVar.b();
                                    if (g(linkedList2, gzkVarB2, y2eVar, ovgVar)) {
                                        gzkVarB2.a(new zxk(ovgVar.l(), -1));
                                        linkedList2.add(gzkVarB2);
                                    }
                                }
                                i = -1;
                                i3 = i6;
                                z2 = true;
                                z = z;
                            } else {
                                i = -1;
                            }
                        }
                        z = z;
                    }
                }
                i5++;
                i = i;
                linkedList = linkedList;
                hashSet = hashSet;
                i3 = i3;
                i2 = 0;
                z = z;
            }
            i3 = size;
        }
        k(arrayList, y2eVar);
        return arrayList;
    }
}
