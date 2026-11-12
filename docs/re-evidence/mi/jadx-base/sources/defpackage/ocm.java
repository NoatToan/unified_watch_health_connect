package defpackage;

import com.typesafe.config.ConfigException;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class ocm implements jc4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29008b;
    public final int c;
    public final och d;
    public final String e;
    public final List<String> f;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29009a;

        static {
            int[] iArr = new int[rwl.c.values().length];
            f29009a = iArr;
            try {
                iArr[rwl.c.ORIGIN_DESCRIPTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29009a[rwl.c.ORIGIN_LINE_NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29009a[rwl.c.ORIGIN_END_LINE_NUMBER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29009a[rwl.c.ORIGIN_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29009a[rwl.c.ORIGIN_URL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f29009a[rwl.c.ORIGIN_COMMENTS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f29009a[rwl.c.ORIGIN_NULL_URL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f29009a[rwl.c.ORIGIN_NULL_COMMENTS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f29009a[rwl.c.END_MARKER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f29009a[rwl.c.ROOT_VALUE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f29009a[rwl.c.ROOT_WAS_CONFIG.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f29009a[rwl.c.UNKNOWN.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f29009a[rwl.c.VALUE_DATA.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f29009a[rwl.c.VALUE_ORIGIN.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    public ocm(String str, int i, int i2, och ochVar, String str2, List<String> list) {
        if (str == null) {
            throw new ConfigException.BugOrBroken("description may not be null");
        }
        this.f29007a = str;
        this.f29008b = i;
        this.c = i2;
        this.d = ochVar;
        this.e = str2;
        this.f = list;
    }

    public static Map<rwl.c, Object> e(Map<rwl.c, Object> map, Map<rwl.c, Object> map2) throws IOException {
        EnumMap enumMap = new EnumMap(map2);
        Iterator<Map.Entry<rwl.c, Object>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            rwl.c key = it.next().getKey();
            if (!map2.containsKey(key)) {
                switch (a.f29009a[key.ordinal()]) {
                    case 1:
                        enumMap.put(key, map.get(key));
                        break;
                    case 2:
                    case 3:
                    case 4:
                        enumMap.put(key, map.get(key));
                        break;
                    case 5:
                        rwl.c cVar = rwl.c.ORIGIN_NULL_URL;
                        if (!map2.containsKey(cVar)) {
                            enumMap.put(key, map.get(key));
                        } else {
                            enumMap.remove(cVar);
                        }
                        break;
                    case 6:
                        rwl.c cVar2 = rwl.c.ORIGIN_NULL_COMMENTS;
                        if (!map2.containsKey(cVar2)) {
                            enumMap.put(key, map.get(key));
                        } else {
                            enumMap.remove(cVar2);
                        }
                        break;
                    case 7:
                    case 8:
                        throw new ConfigException.BugOrBroken("applying fields, base object should not contain " + key + " " + map);
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                        throw new ConfigException.BugOrBroken("should not appear here: " + key);
                }
            }
        }
        return enumMap;
    }

    public static Map<rwl.c, Object> g(Map<rwl.c, Object> map, Map<rwl.c, Object> map2) {
        EnumMap enumMap = new EnumMap(map2);
        for (Map.Entry<rwl.c, Object> entry : map.entrySet()) {
            rwl.c key = entry.getKey();
            if (enumMap.containsKey(key) && wb4.a(entry.getValue(), enumMap.get(key))) {
                enumMap.remove(key);
            } else if (enumMap.containsKey(key)) {
                continue;
            } else {
                switch (a.f29009a[key.ordinal()]) {
                    case 1:
                        throw new ConfigException.BugOrBroken("origin missing description field? " + map2);
                    case 2:
                        enumMap.put(rwl.c.ORIGIN_LINE_NUMBER, -1);
                        break;
                    case 3:
                        enumMap.put(rwl.c.ORIGIN_END_LINE_NUMBER, -1);
                        break;
                    case 4:
                        throw new ConfigException.BugOrBroken("should always be an ORIGIN_TYPE field");
                    case 5:
                        enumMap.put(rwl.c.ORIGIN_NULL_URL, "");
                        break;
                    case 6:
                        enumMap.put(rwl.c.ORIGIN_NULL_COMMENTS, "");
                        break;
                    case 7:
                    case 8:
                        throw new ConfigException.BugOrBroken("computing delta, base object should not contain " + key + " " + map);
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                        throw new ConfigException.BugOrBroken("should not appear here: " + key);
                }
            }
        }
        return enumMap;
    }

    public static ocm h(ocm ocmVar, Map<rwl.c, Object> map) throws IOException {
        return i(e(ocmVar != null ? ocmVar.x() : Collections.emptyMap(), map));
    }

    public static ocm i(Map<rwl.c, Object> map) throws IOException {
        if (map.isEmpty()) {
            return null;
        }
        String str = (String) map.get(rwl.c.ORIGIN_DESCRIPTION);
        Integer num = (Integer) map.get(rwl.c.ORIGIN_LINE_NUMBER);
        Integer num2 = (Integer) map.get(rwl.c.ORIGIN_END_LINE_NUMBER);
        Number number = (Number) map.get(rwl.c.ORIGIN_TYPE);
        if (number == null) {
            throw new IOException("Missing ORIGIN_TYPE field");
        }
        return new ocm(str, num != null ? num.intValue() : -1, num2 != null ? num2.intValue() : -1, och.values()[number.byteValue()], (String) map.get(rwl.c.ORIGIN_URL), (List) map.get(rwl.c.ORIGIN_COMMENTS));
    }

    public static jc4 j(jc4 jc4Var, jc4 jc4Var2) {
        return n((ocm) jc4Var, (ocm) jc4Var2);
    }

    public static jc4 k(Collection<? extends jc4> collection) {
        if (collection.isEmpty()) {
            throw new ConfigException.BugOrBroken("can't merge empty list of origins");
        }
        if (collection.size() == 1) {
            return collection.iterator().next();
        }
        if (collection.size() == 2) {
            Iterator<? extends jc4> it = collection.iterator();
            return n((ocm) it.next(), (ocm) it.next());
        }
        ArrayList arrayList = new ArrayList();
        Iterator<? extends jc4> it2 = collection.iterator();
        while (it2.hasNext()) {
            arrayList.add((ocm) it2.next());
        }
        while (arrayList.size() > 2) {
            ocm ocmVar = (ocm) arrayList.get(arrayList.size() - 1);
            arrayList.remove(arrayList.size() - 1);
            ocm ocmVar2 = (ocm) arrayList.get(arrayList.size() - 1);
            arrayList.remove(arrayList.size() - 1);
            ocm ocmVar3 = (ocm) arrayList.get(arrayList.size() - 1);
            arrayList.remove(arrayList.size() - 1);
            arrayList.add(m(ocmVar3, ocmVar2, ocmVar));
        }
        return k(arrayList);
    }

    public static jc4 l(List<? extends h00> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<? extends h00> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().g());
        }
        return k(arrayList);
    }

    public static ocm m(ocm ocmVar, ocm ocmVar2, ocm ocmVar3) {
        return w(ocmVar, ocmVar2) >= w(ocmVar2, ocmVar3) ? n(n(ocmVar, ocmVar2), ocmVar3) : n(ocmVar, n(ocmVar2, ocmVar3));
    }

    public static ocm n(ocm ocmVar, ocm ocmVar2) {
        String str;
        int i;
        int iMax;
        List<String> list;
        och ochVar = ocmVar.d;
        if (ochVar != ocmVar2.d) {
            ochVar = och.GENERIC;
        }
        och ochVar2 = ochVar;
        String strSubstring = ocmVar.f29007a;
        String strSubstring2 = ocmVar2.f29007a;
        if (strSubstring.startsWith("merge of ")) {
            strSubstring = strSubstring.substring(9);
        }
        if (strSubstring2.startsWith("merge of ")) {
            strSubstring2 = strSubstring2.substring(9);
        }
        if (strSubstring.equals(strSubstring2)) {
            int iMin = ocmVar.f29008b;
            if (iMin < 0) {
                iMin = ocmVar2.f29008b;
            } else {
                int i2 = ocmVar2.f29008b;
                if (i2 >= 0) {
                    iMin = Math.min(iMin, i2);
                }
            }
            i = iMin;
            iMax = Math.max(ocmVar.c, ocmVar2.c);
            str = strSubstring;
        } else {
            String strA = ocmVar.a();
            String strA2 = ocmVar2.a();
            if (strA.startsWith("merge of ")) {
                strA = strA.substring(9);
            }
            if (strA2.startsWith("merge of ")) {
                strA2 = strA2.substring(9);
            }
            str = "merge of " + strA + "," + strA2;
            i = -1;
            iMax = -1;
        }
        String str2 = wb4.a(ocmVar.e, ocmVar2.e) ? ocmVar.e : null;
        if (wb4.a(ocmVar.f, ocmVar2.f)) {
            list = ocmVar.f;
        } else {
            ArrayList arrayList = new ArrayList();
            List<String> list2 = ocmVar.f;
            if (list2 != null) {
                arrayList.addAll(list2);
            }
            List<String> list3 = ocmVar2.f;
            if (list3 != null) {
                arrayList.addAll(list3);
            }
            list = arrayList;
        }
        return new ocm(str, i, iMax, ochVar2, str2, list);
    }

    public static ocm o(String str) {
        String externalForm;
        try {
            externalForm = new File(str).toURI().toURL().toExternalForm();
        } catch (MalformedURLException unused) {
            externalForm = null;
        }
        return new ocm(str, -1, -1, och.FILE, externalForm, null);
    }

    public static ocm p(String str) {
        return q(str, null);
    }

    public static ocm q(String str, URL url) {
        return new ocm(str, -1, -1, och.RESOURCE, url != null ? url.toExternalForm() : null, null);
    }

    public static ocm r(String str) {
        return new ocm(str, -1, -1, och.GENERIC, null, null);
    }

    public static ocm s(URL url) {
        String externalForm = url.toExternalForm();
        return new ocm(externalForm, -1, -1, och.URL, externalForm, null);
    }

    public static int w(ocm ocmVar, ocm ocmVar2) {
        int i = ocmVar.d == ocmVar2.d ? 1 : 0;
        if (!ocmVar.f29007a.equals(ocmVar2.f29007a)) {
            return i;
        }
        int i2 = i + 1;
        if (ocmVar.f29008b == ocmVar2.f29008b) {
            i2 = i + 2;
        }
        if (ocmVar.c == ocmVar2.c) {
            i2++;
        }
        int i3 = i2;
        return wb4.a(ocmVar.e, ocmVar2.e) ? i3 + 1 : i3;
    }

    @Override // defpackage.jc4
    public String a() {
        int i = this.f29008b;
        if (i < 0) {
            return this.f29007a;
        }
        if (this.c == i) {
            return this.f29007a + ": " + this.f29008b;
        }
        return this.f29007a + ": " + this.f29008b + "-" + this.c;
    }

    @Override // defpackage.jc4
    public int b() {
        return this.f29008b;
    }

    public ocm c(URL url) {
        return new ocm(this.f29007a, this.f29008b, this.c, this.d, url != null ? url.toExternalForm() : null, this.f);
    }

    public ocm d(List<String> list) {
        if (wb4.a(list, this.f) || list == null) {
            return this;
        }
        if (this.f == null) {
            return u(list);
        }
        ArrayList arrayList = new ArrayList(list.size() + this.f.size());
        arrayList.addAll(this.f);
        arrayList.addAll(list);
        return u(arrayList);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ocm)) {
            return false;
        }
        ocm ocmVar = (ocm) obj;
        return this.f29007a.equals(ocmVar.f29007a) && this.f29008b == ocmVar.f29008b && this.c == ocmVar.c && this.d == ocmVar.d && wb4.a(this.e, ocmVar.e);
    }

    public List<String> f() {
        List<String> list = this.f;
        return list != null ? Collections.unmodifiableList(list) : Collections.emptyList();
    }

    public int hashCode() {
        int iHashCode = (((((((this.f29007a.hashCode() + 41) * 41) + this.f29008b) * 41) + this.c) * 41) + this.d.hashCode()) * 41;
        String str = this.e;
        return str != null ? (iHashCode + str.hashCode()) * 41 : iHashCode;
    }

    public ocm t(List<String> list) {
        if (wb4.a(list, this.f) || list == null) {
            return this;
        }
        if (this.f == null) {
            return u(list);
        }
        ArrayList arrayList = new ArrayList(list.size() + this.f.size());
        arrayList.addAll(list);
        arrayList.addAll(this.f);
        return u(arrayList);
    }

    public String toString() {
        if (this.d != och.RESOURCE || this.e == null) {
            return "ConfigOrigin(" + this.f29007a + ")";
        }
        return "ConfigOrigin(" + this.f29007a + "," + this.e + ")";
    }

    public ocm u(List<String> list) {
        return wb4.a(list, this.f) ? this : new ocm(this.f29007a, this.f29008b, this.c, this.d, this.e, list);
    }

    public ocm v(int i) {
        return (i == this.f29008b && i == this.c) ? this : new ocm(this.f29007a, i, i, this.d, this.e, this.f);
    }

    public Map<rwl.c, Object> x() {
        EnumMap enumMap = new EnumMap(rwl.c.class);
        enumMap.put(rwl.c.ORIGIN_DESCRIPTION, this.f29007a);
        int i = this.f29008b;
        if (i >= 0) {
            enumMap.put(rwl.c.ORIGIN_LINE_NUMBER, Integer.valueOf(i));
        }
        int i2 = this.c;
        if (i2 >= 0) {
            enumMap.put(rwl.c.ORIGIN_END_LINE_NUMBER, Integer.valueOf(i2));
        }
        enumMap.put(rwl.c.ORIGIN_TYPE, Integer.valueOf(this.d.ordinal()));
        String str = this.e;
        if (str != null) {
            enumMap.put(rwl.c.ORIGIN_URL, str);
        }
        List<String> list = this.f;
        if (list != null) {
            enumMap.put(rwl.c.ORIGIN_COMMENTS, list);
        }
        return enumMap;
    }

    public Map<rwl.c, Object> y(ocm ocmVar) {
        return g(ocmVar != null ? ocmVar.x() : Collections.emptyMap(), x());
    }
}
