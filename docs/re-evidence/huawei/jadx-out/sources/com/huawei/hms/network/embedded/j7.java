package com.huawei.hms.network.embedded;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes34.dex */
public final class j7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f14953a;

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int iD = d();
        for (int i = 0; i < iD; i++) {
            String strA = a(i);
            String strB = b(i);
            sb.append(strA);
            sb.append(": ");
            if (f8.d(strA)) {
                strB = "";
            }
            sb.append(strB);
            sb.append("\n");
        }
        return sb.toString();
    }

    public int hashCode() {
        return Arrays.hashCode(this.f14953a);
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof j7) && Arrays.equals(((j7) obj).f14953a, this.f14953a);
    }

    public Map<String, List<String>> e() {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        int iD = d();
        for (int i = 0; i < iD; i++) {
            String lowerCase = a(i).toLowerCase(Locale.US);
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(b(i));
        }
        return treeMap;
    }

    public List<String> d(String str) {
        int iD = d();
        ArrayList arrayList = null;
        for (int i = 0; i < iD; i++) {
            if (str.equalsIgnoreCase(a(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(b(i));
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.EMPTY_LIST;
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<String> f14954a = new ArrayList(20);

        public a d(String str, String str2) {
            j7.e(str);
            j7.a(str2, str);
            d(str);
            b(str, str2);
            return this;
        }

        public a d(String str) {
            int i = 0;
            while (i < this.f14954a.size()) {
                if (str.equalsIgnoreCase(this.f14954a.get(i))) {
                    this.f14954a.remove(i);
                    this.f14954a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        @Nullable
        public String c(String str) {
            for (int size = this.f14954a.size() - 2; size >= 0; size -= 2) {
                if (str.equalsIgnoreCase(this.f14954a.get(size))) {
                    return this.f14954a.get(size + 1);
                }
            }
            return null;
        }

        public a c(String str, String str2) {
            j7.e(str);
            return b(str, str2);
        }

        public a b(String str, Date date) {
            if (date != null) {
                d(str, h9.a(date));
                return this;
            }
            throw new NullPointerException("value for name " + str + " == null");
        }

        public a b(String str, Instant instant) {
            if (instant != null) {
                return b(str, new Date(instant.toEpochMilli()));
            }
            throw new NullPointerException("value for name " + str + " == null");
        }

        public a b(String str, String str2) {
            this.f14954a.add(str);
            this.f14954a.add(str2.trim());
            return this;
        }

        public a b(String str) {
            int iIndexOf = str.indexOf(":", 1);
            if (iIndexOf != -1) {
                return b(str.substring(0, iIndexOf), str.substring(iIndexOf + 1));
            }
            return str.startsWith(":") ? b("", str.substring(1)) : b("", str);
        }

        public j7 a() {
            return new j7(this);
        }

        public a a(String str, Date date) {
            if (date != null) {
                a(str, h9.a(date));
                return this;
            }
            throw new NullPointerException("value for name " + str + " == null");
        }

        public a a(String str, Instant instant) {
            if (instant != null) {
                return a(str, new Date(instant.toEpochMilli()));
            }
            throw new NullPointerException("value for name " + str + " == null");
        }

        public a a(String str, String str2) {
            j7.e(str);
            j7.a(str2, str);
            return b(str, str2);
        }

        public a a(String str) {
            int iIndexOf = str.indexOf(":");
            if (iIndexOf != -1) {
                return a(str.substring(0, iIndexOf).trim(), str.substring(iIndexOf + 1));
            }
            throw new IllegalArgumentException("Unexpected header: " + str);
        }

        public a a(j7 j7Var) {
            int iD = j7Var.d();
            for (int i = 0; i < iD; i++) {
                b(j7Var.a(i), j7Var.b(i));
            }
            return this;
        }
    }

    public int d() {
        return this.f14953a.length / 2;
    }

    @Nullable
    public Instant c(String str) {
        Date dateB = b(str);
        if (dateB != null) {
            return dateB.toInstant();
        }
        return null;
    }

    public a c() {
        a aVar = new a();
        Collections.addAll(aVar.f14954a, this.f14953a);
        return aVar;
    }

    public Set<String> b() {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        int iD = d();
        for (int i = 0; i < iD; i++) {
            treeSet.add(a(i));
        }
        return Collections.unmodifiableSet(treeSet);
    }

    @Nullable
    public Date b(String str) {
        String strA = a(str);
        if (strA != null) {
            return h9.a(strA);
        }
        return null;
    }

    public String b(int i) {
        return this.f14953a[(i * 2) + 1];
    }

    @Nullable
    public String a(String str) {
        return a(this.f14953a, str);
    }

    public String a(int i) {
        return this.f14953a[i * 2];
    }

    public long a() {
        String[] strArr = this.f14953a;
        long length = strArr.length * 2;
        int length2 = strArr.length;
        for (int i = 0; i < length2; i++) {
            length += (long) this.f14953a[i].length();
        }
        return length;
    }

    public static void e(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (str.isEmpty()) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt <= ' ' || cCharAt >= 127) {
                throw new IllegalArgumentException(f8.a("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str));
            }
        }
    }

    public static void a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("value for name " + str2 + " == null");
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ((cCharAt <= 31 && cCharAt != '\t') || cCharAt >= 127) {
                if (f8.d(str2)) {
                    str = "";
                }
                throw new IllegalArgumentException(f8.a("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str2, str));
            }
        }
    }

    @Nullable
    public static String a(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    public static j7 a(String... strArr) {
        if (strArr == null) {
            throw new NullPointerException("namesAndValues == null");
        }
        if (strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr2 = (String[]) strArr.clone();
        for (int i = 0; i < strArr2.length; i++) {
            String str = strArr2[i];
            if (str == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr2[i] = str.trim();
        }
        for (int i2 = 0; i2 < strArr2.length; i2 += 2) {
            String str2 = strArr2[i2];
            String str3 = strArr2[i2 + 1];
            e(str2);
            a(str3, str2);
        }
        return new j7(strArr2);
    }

    public static j7 a(Map<String, String> map) {
        if (map == null) {
            throw new NullPointerException("headers == null");
        }
        String[] strArr = new String[map.size() * 2];
        int i = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey() == null || entry.getValue() == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            String strTrim = entry.getKey().trim();
            String strTrim2 = entry.getValue().trim();
            e(strTrim);
            a(strTrim2, strTrim);
            strArr[i] = strTrim;
            strArr[i + 1] = strTrim2;
            i += 2;
        }
        return new j7(strArr);
    }

    public j7(String[] strArr) {
        this.f14953a = strArr;
    }

    public j7(a aVar) {
        List<String> list = aVar.f14954a;
        this.f14953a = (String[]) list.toArray(new String[list.size()]);
    }
}
