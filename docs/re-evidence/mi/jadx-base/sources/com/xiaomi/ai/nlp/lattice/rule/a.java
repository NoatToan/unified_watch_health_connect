package com.xiaomi.ai.nlp.lattice.rule;

import defpackage.brk;
import defpackage.gv5;
import defpackage.hwg;
import defpackage.jyp;
import defpackage.mjh;
import defpackage.nb4;
import defpackage.pe0;
import defpackage.pi2;
import defpackage.s0l;
import defpackage.sqf;
import defpackage.t0l;
import defpackage.vf4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class a {
    public static void a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static List<List<t0l>> b(List<t0l> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList<List> arrayList3 = new ArrayList();
        d(list, 0, arrayList2, arrayList3);
        for (List list2 : arrayList3) {
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            c(list2, 0, arrayList4, arrayList5);
            arrayList.addAll(arrayList5);
        }
        return arrayList;
    }

    public static void c(List<t0l> list, int i, List<t0l> list2, List<List<t0l>> list3) {
        if (i >= list.size()) {
            ArrayList arrayList = new ArrayList();
            for (int size = list2.size() - 1; size >= 0; size--) {
                arrayList.add(0, new t0l(list2.get(size)));
            }
            list3.add(arrayList);
            return;
        }
        for (String str : list.get(i).e().split("\\|")) {
            list2.add(new t0l(list.get(i), list.get(i).g(), str));
            c(list, i + 1, list2, list3);
            list2.remove(i);
        }
    }

    public static void d(List<t0l> list, int i, List<t0l> list2, List<List<t0l>> list3) {
        if (i >= list.size()) {
            ArrayList arrayList = new ArrayList();
            for (int size = list2.size() - 1; size >= 0; size--) {
                arrayList.add(0, new t0l(list2.get(size)));
            }
            list3.add(arrayList);
            return;
        }
        for (String str : list.get(i).g().split("\\|")) {
            list2.add(new t0l(list.get(i), str));
            d(list, i + 1, list2, list3);
            list2.remove(i);
        }
    }

    public static String e(String str, Map<String, String> map) {
        while (str.contains(gv5.CONNECT_VALUE_STR)) {
            int iIndexOf = str.indexOf(gv5.CONNECT_VALUE_STR);
            int iIndexOf2 = str.indexOf("}", iIndexOf);
            String strSubstring = str.substring(iIndexOf + 2, iIndexOf2);
            if (!map.containsKey(strSubstring)) {
                break;
            }
            str = str.replace(str.substring(iIndexOf, iIndexOf2 + 1), map.get(strSubstring));
        }
        return str;
    }

    public static List<s0l> f(nb4 nb4Var, brk brkVar) {
        byte b2;
        Map<String, List<mjh<String, String>>> slot2TokenNToken = brkVar.getSlot2TokenNToken();
        String string = nb4Var.getString("type");
        int i = nb4Var.v("priority") ? nb4Var.getInt("priority") : 15;
        ArrayList<String> arrayList = new ArrayList();
        if (nb4Var.v("explode")) {
            arrayList.addAll(Arrays.asList(nb4Var.getString("explode").split(",")));
            a(arrayList.size() != 0, "explodElems is empty");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a(slot2TokenNToken.containsKey((String) it.next()), "explodElem token list is missing");
            }
        }
        HashMap map = new HashMap();
        if (nb4Var.v("except")) {
            Iterator it2 = Arrays.asList(nb4Var.getString("except").split(",")).iterator();
            while (it2.hasNext()) {
                String[] strArrSplit = ((String) it2.next()).split(":");
                a(strArrSplit.length == 2, "except elem format error");
                a(arrayList.contains(strArrSplit[0]), "except elem not contained in exploded elems");
                if (map.containsKey(strArrSplit[0])) {
                    ((Set) map.get(strArrSplit[0])).add(strArrSplit[1]);
                } else {
                    map.put(strArrSplit[0], new HashSet(Arrays.asList(strArrSplit[1])));
                }
            }
        }
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        for (String str : arrayList) {
            Set hashSet = map.containsKey(str) ? (Set) map.get(str) : new HashSet();
            linkedList2.clear();
            if (linkedList.isEmpty()) {
                for (mjh<String, String> mjhVar : slot2TokenNToken.get(str)) {
                    if (!hashSet.contains(mjhVar.a())) {
                        linkedList2.add(str + ":" + mjhVar.a() + ":" + mjhVar.d());
                    }
                }
            } else {
                while (!linkedList.isEmpty()) {
                    for (mjh<String, String> mjhVar2 : slot2TokenNToken.get(str)) {
                        if (!hashSet.contains(mjhVar2.a())) {
                            linkedList2.add(((String) linkedList.poll()) + "," + str + ":" + mjhVar2.a() + ":" + mjhVar2.d());
                        }
                    }
                }
            }
            linkedList = new LinkedList(linkedList2);
        }
        if (linkedList.isEmpty()) {
            linkedList.add("");
        }
        ArrayList arrayList2 = new ArrayList();
        while (!linkedList.isEmpty()) {
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            String[] strArrSplit2 = ((String) linkedList.poll()).split(",");
            int length = strArrSplit2.length;
            int i2 = 0;
            while (i2 < length) {
                String[] strArrSplit3 = strArrSplit2[i2].split(":");
                if (strArrSplit3.length == 3) {
                    map2.put(strArrSplit3[0], strArrSplit3[1]);
                    map3.put(strArrSplit3[0], strArrSplit3[2]);
                }
                i2++;
                linkedList = linkedList;
            }
            LinkedList linkedList3 = linkedList;
            string.hashCode();
            byte b3 = -1;
            switch (string.hashCode()) {
                case -1422950858:
                    if (string.equals("action")) {
                        b3 = 0;
                    }
                    break;
                case -1389159650:
                    if (string.equals("bigram")) {
                        b3 = 1;
                    }
                    break;
                case -190376483:
                    if (string.equals("constraint")) {
                        b3 = 2;
                    }
                    break;
                case -164123910:
                    if (string.equals("front_priority")) {
                        b3 = 3;
                    }
                    break;
                case 3387324:
                    if (string.equals("norm")) {
                        b2 = 4;
                        b3 = b2;
                    }
                    break;
                case 103785528:
                    if (string.equals("merge")) {
                        b2 = 5;
                        b3 = b2;
                    }
                    break;
                case 804841608:
                    if (string.equals("end_priority")) {
                        b2 = 6;
                        b3 = b2;
                    }
                    break;
                case 1052666732:
                    if (string.equals("transform")) {
                        b2 = 7;
                        b3 = b2;
                    }
                    break;
                case 1887597587:
                    if (string.equals("uni_priority")) {
                        b2 = 8;
                        b3 = b2;
                    }
                    break;
            }
            switch (b3) {
                case 0:
                    for (List<t0l> list : b(i(nb4Var, "before", map2))) {
                        a(!list.isEmpty(), "before is missing");
                        pe0 pe0Var = new pe0(i, list);
                        a(nb4Var.v("value"), "prev and post are missing.");
                        if (nb4Var.v("value")) {
                            pe0Var.s(nb4Var.getString("value"));
                        }
                        if (nb4Var.v("score")) {
                            pe0Var.r(nb4Var.getDouble("score"));
                        }
                        arrayList2.add(pe0Var);
                    }
                    continue;
                    linkedList = linkedList3;
                    break;
                case 1:
                    for (List<t0l> list2 : b(i(nb4Var, "before", map2))) {
                        a(!list2.isEmpty(), "before is missing");
                        pi2 pi2Var = new pi2(i, list2);
                        a(nb4Var.v("prev") || nb4Var.v("post"), "prev and post are missing.");
                        if (nb4Var.v("prev")) {
                            pi2Var.s(nb4Var.f("prev"));
                        }
                        if (nb4Var.v("post")) {
                            pi2Var.r(nb4Var.f("post"));
                        }
                        arrayList2.add(pi2Var);
                    }
                    continue;
                    linkedList = linkedList3;
                    break;
                case 2:
                    for (List<t0l> list3 : b(i(nb4Var, "before", map2))) {
                        a(!list3.isEmpty(), "before is missing");
                        vf4 vf4Var = new vf4(i, list3);
                        a(nb4Var.v("inclusions") || nb4Var.v("exclusions") || nb4Var.v("default"), "inclusions, exclusions or default is missing.");
                        if (nb4Var.v("inclusions")) {
                            vf4Var.F(nb4Var.f("inclusions"));
                        }
                        if (nb4Var.v("exclusions")) {
                            vf4Var.E(nb4Var.f("exclusions"));
                        }
                        if (nb4Var.v("default")) {
                            vf4Var.D(nb4Var.getString("default"));
                        }
                        arrayList2.add(vf4Var);
                    }
                    continue;
                    linkedList = linkedList3;
                    break;
                case 3:
                    List<t0l> listI = i(nb4Var, "before", map2);
                    List<List<t0l>> listB = b(listI);
                    a(!listI.isEmpty(), "before is missing");
                    List<t0l> listH = h(nb4Var, "after");
                    a(!listH.isEmpty(), "after is missing");
                    a(!g(listH), "after should not contain '|'");
                    Iterator<List<t0l>> it3 = listB.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(new PriorityRule(i, it3.next(), listH, PriorityRule.PriorityType.FRONT));
                    }
                    continue;
                    linkedList = linkedList3;
                    break;
                case 4:
                    List<t0l> listI2 = i(nb4Var, "before", map2);
                    List<List<t0l>> listB2 = b(listI2);
                    a(!listI2.isEmpty(), "before is missing");
                    Iterator<t0l> it4 = listI2.iterator();
                    int length2 = 0;
                    while (it4.hasNext()) {
                        length2 += it4.next().g().length();
                    }
                    List<t0l> listI3 = i(nb4Var, "after", map3);
                    a(listI3.size() > 1, "after is missing");
                    a(!g(listI3), "after should not contain '|'");
                    Iterator<t0l> it5 = listI3.iterator();
                    int length3 = 0;
                    while (it5.hasNext()) {
                        length3 += it5.next().g().length();
                    }
                    a(length2 == length3, "after tokens' total len isn't equal to before");
                    for (List<t0l> list4 : listB2) {
                        a(1 == list4.size(), "norm rule error");
                        arrayList2.add(new hwg(i, list4, listI3));
                    }
                    continue;
                    linkedList = linkedList3;
                    break;
                case 5:
                    List<t0l> listI4 = i(nb4Var, "before", map2);
                    List<List<t0l>> listB3 = b(listI4);
                    a(!listI4.isEmpty(), "before is missing");
                    List<t0l> listI5 = i(nb4Var, "after", map3);
                    a(listI5.size() == 1, "after is missing");
                    a(!g(listI5), "after should not contain '|'");
                    for (List<t0l> list5 : listB3) {
                        Iterator<t0l> it6 = list5.iterator();
                        int i3 = 0;
                        while (it6.hasNext()) {
                            a(i3 == 0 || it6.next().b() == 0, "merge rule error");
                            i3++;
                        }
                        arrayList2.add(new sqf(i, list5, listI5.get(0)));
                    }
                    break;
                case 6:
                    List<t0l> listI6 = i(nb4Var, "before", map2);
                    List<List<t0l>> listB4 = b(listI6);
                    a(!listI6.isEmpty(), "before is missing");
                    List<t0l> listI7 = i(nb4Var, "after", map3);
                    a(!listI7.isEmpty(), "after is missing");
                    a(!g(listI7), "after should not contain '|'");
                    Iterator<List<t0l>> it7 = listB4.iterator();
                    while (it7.hasNext()) {
                        arrayList2.add(new PriorityRule(i, it7.next(), listI7, PriorityRule.PriorityType.END));
                    }
                    break;
                case 7:
                    List<t0l> listI8 = i(nb4Var, "before", map2);
                    List<List<t0l>> listB5 = b(listI8);
                    a(!listI8.isEmpty(), "before is missing");
                    List<t0l> listI9 = i(nb4Var, "after", map3);
                    a(!listI9.isEmpty(), "after is missing");
                    a(!g(listI9), "after should not contain '|'");
                    for (List<t0l> list6 : listB5) {
                        a(list6.size() == listI9.size(), "before token num unequals with after token num");
                        arrayList2.add(new jyp(i, list6, listI9));
                    }
                    break;
                case 8:
                    List<t0l> listI10 = i(nb4Var, "before", map2);
                    List<List<t0l>> listB6 = b(listI10);
                    a(!listI10.isEmpty(), "before is missing");
                    List<t0l> listI11 = i(nb4Var, "after", map3);
                    a(!listI11.isEmpty(), "after is missing");
                    Iterator<List<t0l>> it8 = listB6.iterator();
                    while (it8.hasNext()) {
                        arrayList2.add(new PriorityRule(i, it8.next(), listI11, PriorityRule.PriorityType.UNI));
                    }
                    break;
            }
            linkedList = linkedList3;
        }
        return arrayList2;
    }

    public static boolean g(List<t0l> list) {
        Iterator<t0l> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().g().contains("|")) {
                return true;
            }
        }
        return false;
    }

    public static List<t0l> h(nb4 nb4Var, String str) {
        return i(nb4Var, str, new HashMap());
    }

    public static List<t0l> i(nb4 nb4Var, String str, Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < nb4Var.j(str).size(); i++) {
            t0l t0lVar = new t0l();
            nb4 nb4Var2 = nb4Var.j(str).get(i);
            t0lVar.s(e(nb4Var2.getString("token"), map));
            t0lVar.p(nb4Var2.getString("ref_slot"));
            if (nb4Var2.v("ref_slot_value")) {
                t0lVar.q(nb4Var2.getString("ref_slot_value"));
            }
            if (nb4Var2.v("ref_slot_type")) {
                t0lVar.o(RefSlotType.valueOf(nb4Var2.getString("ref_slot_type").toUpperCase()));
            }
            if (nb4Var2.v("norm_token")) {
                t0lVar.n(e(nb4Var2.getString("norm_token"), map));
            }
            if (nb4Var2.v("is_start")) {
                t0lVar.r(nb4Var2.getBoolean("is_start"));
            }
            if (nb4Var2.v("is_end")) {
                t0lVar.k(nb4Var2.getBoolean("is_end"));
            }
            if (nb4Var2.v("max_wind")) {
                t0lVar.m(nb4Var2.getInt("max_wind"));
            }
            arrayList.add(t0lVar);
        }
        return arrayList;
    }
}
