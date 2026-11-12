package defpackage;

import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class wk9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Map<String, Map<String, String>> f38057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Map<String, Map<String, dq5>> f38058b;
    public static Map<String, Set<String>> c;

    public static class a implements Comparator<String> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            return wk9.b(str, str2);
        }
    }

    public static class b implements Comparator<String> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            return wk9.b(str, str2);
        }
    }

    static {
        try {
            l();
            m();
        } catch (IOException unused) {
            System.out.println("Failed to initialize FestivalCalculator");
        }
    }

    public static int b(String str, String str2) {
        if (str.length() == str2.length()) {
            return 0;
        }
        return str.length() < str2.length() ? 1 : -1;
    }

    public static List<String> c() {
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, Set<String>>> it = c.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getKey());
        }
        Collections.sort(arrayList, new a());
        return arrayList;
    }

    public static List<String> d() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(f38058b.keySet());
        Collections.sort(arrayList, new b());
        return arrayList;
    }

    public static Set<String> e(String str) {
        HashSet hashSet = new HashSet();
        if (!c.containsKey(str)) {
            return hashSet;
        }
        Iterator<String> it = c.get(str).iterator();
        while (it.hasNext()) {
            hashSet.addAll(f38057a.get(it.next()).keySet());
        }
        return hashSet;
    }

    public static dq5 f(String str, String str2, int i) {
        if (str2.equals("solar")) {
            return i(str, i);
        }
        if (str2.equals("lunar")) {
            return g(str, i);
        }
        return str2.equals("western") ? k(str, i) : j(str, i);
    }

    public static dq5 g(String str, int i) {
        if (!f38057a.containsKey(str) || !f38057a.get(str).containsKey("lunar")) {
            return null;
        }
        String str2 = f38057a.get(str).get("lunar");
        int iIntValue = Integer.valueOf(str2.substring(0, 2)).intValue();
        int iIntValue2 = Integer.valueOf(str2.substring(2, 4)).intValue();
        j4n j4nVarH = dwe.h(i, iIntValue, iIntValue2, false);
        if (j4nVarH == null) {
            return null;
        }
        int iC = j4nVarH.c();
        if (iC > i) {
            j4nVarH = dwe.h(i - 1, iIntValue, iIntValue2, false);
            if (j4nVarH == null) {
                return null;
            }
            iC = j4nVarH.c();
        }
        return new dq5(iC, j4nVarH.b(), j4nVarH.a(), 0, 0, 0);
    }

    public static Set<String> h(String str) {
        return !c.containsKey(str) ? new HashSet() : c.get(str);
    }

    public static dq5 i(String str, int i) {
        if (!f38057a.containsKey(str) || !f38057a.get(str).containsKey("solar")) {
            return null;
        }
        String str2 = f38057a.get(str).get("solar");
        return new dq5(i, Integer.valueOf(str2.substring(0, 2)).intValue(), Integer.valueOf(str2.substring(2, 4)).intValue(), 0, 0, 0);
    }

    public static dq5 j(String str, int i) {
        String strValueOf = String.valueOf(i);
        if (f38058b.containsKey(str) && f38058b.get(str).containsKey(strValueOf)) {
            return f38058b.get(str).get(strValueOf);
        }
        return null;
    }

    public static dq5 k(String str, int i) {
        if (!f38057a.containsKey(str) || !f38057a.get(str).containsKey("western")) {
            return null;
        }
        String str2 = f38057a.get(str).get("western");
        int iIntValue = Integer.valueOf(str2.substring(0, 2)).intValue();
        int iIntValue2 = Integer.valueOf(str2.substring(2, 3)).intValue();
        int iIntValue3 = Integer.valueOf(str2.substring(3, 4)).intValue();
        dq5 dq5VarA = new dq5(i, iIntValue, 1, 0, 0, 0).A(iIntValue2 - 1);
        int iF = dq5VarA.f();
        if (iF < iIntValue3) {
            return dq5VarA.v(iIntValue3 - iF);
        }
        return iF > iIntValue3 ? dq5VarA.v((iIntValue3 - iF) + 7) : dq5VarA;
    }

    public static void l() throws IOException {
        f38057a = new HashMap();
        c = new HashMap();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(wk9.class.getResourceAsStream("/festivals.conf")));
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                bufferedReader.close();
                return;
            }
            if (!line.startsWith(PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX)) {
                String[] strArrSplit = line.split(",");
                if (strArrSplit.length == 4) {
                    String strTrim = strArrSplit[0].trim();
                    String strTrim2 = strArrSplit[1].trim();
                    String strTrim3 = strArrSplit[2].trim();
                    String strTrim4 = strArrSplit[3].trim();
                    for (String str : strTrim3.split("\\|")) {
                        if (!f38057a.containsKey(strTrim4)) {
                            f38057a.put(strTrim4, new HashMap());
                        }
                        f38057a.get(strTrim4).put(strTrim, strTrim2);
                        if (!c.containsKey(str)) {
                            c.put(str, new HashSet());
                        }
                        c.get(str).add(strTrim4);
                    }
                }
            }
        }
    }

    public static void m() throws IOException {
        f38058b = new HashMap();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(wk9.class.getResourceAsStream("/solar_terms.conf")));
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                bufferedReader.close();
                return;
            }
            if (!line.startsWith(PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX)) {
                String[] strArrSplit = line.split(",");
                if (strArrSplit.length == 3) {
                    String strTrim = strArrSplit[0].trim();
                    String strTrim2 = strArrSplit[1].trim();
                    String strTrim3 = strArrSplit[2].trim();
                    dq5 dq5Var = new dq5(Integer.valueOf(strTrim).intValue(), Integer.valueOf(strTrim2.substring(0, 2)).intValue(), Integer.valueOf(strTrim2.substring(2, 4)).intValue(), 0, 0, 0);
                    for (String str : strTrim3.split("\\|")) {
                        if (!f38058b.containsKey(str)) {
                            f38058b.put(str, new HashMap());
                        }
                        f38058b.get(str).put(strTrim, dq5Var);
                    }
                }
            }
        }
    }
}
