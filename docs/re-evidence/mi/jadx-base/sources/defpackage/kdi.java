package defpackage;

import com.typesafe.config.ConfigException;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

/* JADX INFO: loaded from: classes6.dex */
public final class kdi {

    public static class a implements Comparator<qlh> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(qlh qlhVar, qlh qlhVar2) {
            return qlhVar2.e() - qlhVar.e();
        }
    }

    public static String a(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf < 0) {
            return null;
        }
        return str.substring(0, iLastIndexOf);
    }

    public static g00 b(jc4 jc4Var, Map<?, ?> map) {
        HashMap map2 = new HashMap();
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            if (!(key instanceof String)) {
                throw new ConfigException.BugOrBroken("Map has a non-string as a key, expecting a path expression as a String");
            }
            map2.put(qlh.g((String) key), entry.getValue());
        }
        return c(jc4Var, map2, false);
    }

    public static g00 c(jc4 jc4Var, Map<qlh, Object> map, boolean z) {
        HashSet hashSet = new HashSet();
        HashSet<qlh> hashSet2 = new HashSet();
        for (qlh qlhVar : map.keySet()) {
            hashSet2.add(qlhVar);
            for (qlh qlhVarH = qlhVar.h(); qlhVarH != null; qlhVarH = qlhVarH.h()) {
                hashSet.add(qlhVarH);
            }
        }
        if (z) {
            hashSet2.removeAll(hashSet);
        } else {
            for (qlh qlhVar2 : hashSet2) {
                if (hashSet.contains(qlhVar2)) {
                    throw new ConfigException.BugOrBroken("In the map, path '" + qlhVar2.k() + "' occurs as both the parent object of a value and as a value. Because Map has no defined ordering, this is a broken situation.");
                }
            }
        }
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            map3.put((qlh) it.next(), new HashMap());
        }
        for (qlh qlhVar3 : hashSet2) {
            qlh qlhVarH2 = qlhVar3.h();
            Map map4 = qlhVarH2 != null ? (Map) map3.get(qlhVarH2) : map2;
            String strD = qlhVar3.d();
            Object obj = map.get(qlhVar3);
            rc4 qc4Var = z ? obj instanceof String ? new qc4(jc4Var, (String) obj) : null : vb4.i(map.get(qlhVar3), jc4Var, gpa.KEYS_ARE_PATHS);
            if (qc4Var != null) {
                map4.put(strD, qc4Var);
            }
        }
        ArrayList<qlh> arrayList = new ArrayList();
        arrayList.addAll(hashSet);
        Collections.sort(arrayList, new a());
        for (qlh qlhVar4 : arrayList) {
            Map map5 = (Map) map3.get(qlhVar4);
            qlh qlhVarH3 = qlhVar4.h();
            (qlhVarH3 != null ? (Map) map3.get(qlhVarH3) : map2).put(qlhVar4.d(), new ncm(jc4Var, map5, iqk.RESOLVED, false));
        }
        return new ncm(jc4Var, map2, iqk.RESOLVED, false);
    }

    public static g00 d(jc4 jc4Var, Properties properties) {
        HashMap map = new HashMap();
        for (Map.Entry entry : properties.entrySet()) {
            Object key = entry.getKey();
            if (key instanceof String) {
                map.put(g((String) key), entry.getValue());
            }
        }
        return c(jc4Var, map, true);
    }

    public static String e(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        return iLastIndexOf < 0 ? str : str.substring(iLastIndexOf + 1);
    }

    public static g00 f(Reader reader, jc4 jc4Var) throws IOException {
        Properties properties = new Properties();
        properties.load(reader);
        return d(jc4Var, properties);
    }

    public static qlh g(String str) {
        String strE = e(str);
        String strA = a(str);
        qlh qlhVar = new qlh(strE, null);
        while (strA != null) {
            String strE2 = e(strA);
            strA = a(strA);
            qlhVar = new qlh(strE2, qlhVar);
        }
        return qlhVar;
    }
}
