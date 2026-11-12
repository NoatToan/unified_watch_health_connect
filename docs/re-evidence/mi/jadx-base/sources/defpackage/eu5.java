package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class eu5 implements di4 {
    public static final eu5 c = new eu5(Collections.emptyMap());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, byte[]> f17069b;

    public eu5() {
        this(Collections.emptyMap());
    }

    public static void e(HashMap<String, byte[]> map, Map<String, Object> map2) {
        for (Map.Entry<String, Object> entry : map2.entrySet()) {
            map.put(entry.getKey(), i(entry.getValue()));
        }
    }

    public static Map<String, byte[]> f(Map<String, byte[]> map, ei4 ei4Var) {
        HashMap map2 = new HashMap(map);
        k(map2, ei4Var.c());
        e(map2, ei4Var.b());
        return map2;
    }

    public static byte[] i(Object obj) {
        if (obj instanceof Long) {
            return ByteBuffer.allocate(8).putLong(((Long) obj).longValue()).array();
        }
        if (obj instanceof String) {
            return ((String) obj).getBytes(bu3.c);
        }
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        throw new IllegalArgumentException();
    }

    public static boolean j(Map<String, byte[]> map, Map<String, byte[]> map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<String, byte[]> entry : map.entrySet()) {
            if (!Arrays.equals(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public static void k(HashMap<String, byte[]> map, List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            map.remove(list.get(i));
        }
    }

    @Override // defpackage.di4
    public final long a(String str, long j) {
        byte[] bArr = this.f17069b.get(str);
        return bArr != null ? ByteBuffer.wrap(bArr).getLong() : j;
    }

    @Override // defpackage.di4
    public final String c(String str, String str2) {
        byte[] bArr = this.f17069b.get(str);
        return bArr != null ? new String(bArr, bu3.c) : str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || eu5.class != obj.getClass()) {
            return false;
        }
        return j(this.f17069b, ((eu5) obj).f17069b);
    }

    public eu5 g(ei4 ei4Var) {
        Map<String, byte[]> mapF = f(this.f17069b, ei4Var);
        return j(this.f17069b, mapF) ? this : new eu5(mapF);
    }

    public Set<Map.Entry<String, byte[]>> h() {
        return this.f17069b.entrySet();
    }

    public int hashCode() {
        if (this.f17068a == 0) {
            int iHashCode = 0;
            for (Map.Entry<String, byte[]> entry : this.f17069b.entrySet()) {
                iHashCode += Arrays.hashCode(entry.getValue()) ^ entry.getKey().hashCode();
            }
            this.f17068a = iHashCode;
        }
        return this.f17068a;
    }

    public eu5(Map<String, byte[]> map) {
        this.f17069b = Collections.unmodifiableMap(map);
    }
}
