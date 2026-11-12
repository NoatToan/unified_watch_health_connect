package defpackage;

import java.nio.ByteBuffer;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes11.dex */
public final class c2t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Comparator f4875a = new a();

    public static class a implements Comparator {
        public a() {
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            if (obj == null && obj2 == null) {
                return 0;
            }
            if (obj == null) {
                return -1;
            }
            if (obj2 == null) {
                return 1;
            }
            if (obj instanceof List) {
                return c2t.g((List) obj, (List) obj2);
            }
            if (obj instanceof Set) {
                return c2t.i((Set) obj, (Set) obj2);
            }
            if (obj instanceof Map) {
                return c2t.h((Map) obj, (Map) obj2);
            }
            return obj instanceof byte[] ? c2t.l((byte[]) obj, (byte[]) obj2) : c2t.d((Comparable) obj, (Comparable) obj2);
        }
    }

    public static int a(byte b2, byte b3) {
        if (b2 < b3) {
            return -1;
        }
        return b3 < b2 ? 1 : 0;
    }

    public static int b(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i2 < i ? 1 : 0;
    }

    public static int c(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j2 < j ? 1 : 0;
    }

    public static int d(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    public static int e(String str, String str2) {
        return str.compareTo(str2);
    }

    public static int f(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int iRemaining = byteBuffer.remaining();
        System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), bArr, i, iRemaining);
        return iRemaining;
    }

    public static int g(List list, List list2) {
        int iB = b(list.size(), list2.size());
        if (iB != 0) {
            return iB;
        }
        for (int i = 0; i < list.size(); i++) {
            int iCompare = f4875a.compare(list.get(i), list2.get(i));
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return 0;
    }

    public static int h(Map map, Map map2) {
        int iB = b(map.size(), map2.size());
        if (iB != 0) {
            return iB;
        }
        Comparator comparator = f4875a;
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(map);
        Iterator it = treeMap.entrySet().iterator();
        TreeMap treeMap2 = new TreeMap(comparator);
        treeMap2.putAll(map2);
        Iterator it2 = treeMap2.entrySet().iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Map.Entry entry2 = (Map.Entry) it2.next();
            Comparator comparator2 = f4875a;
            int iCompare = comparator2.compare(entry.getKey(), entry2.getKey());
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompare2 = comparator2.compare(entry.getValue(), entry2.getValue());
            if (iCompare2 != 0) {
                return iCompare2;
            }
        }
        return 0;
    }

    public static int i(Set set, Set set2) {
        int iB = b(set.size(), set2.size());
        if (iB != 0) {
            return iB;
        }
        Comparator comparator = f4875a;
        TreeSet treeSet = new TreeSet(comparator);
        treeSet.addAll(set);
        TreeSet treeSet2 = new TreeSet(comparator);
        treeSet2.addAll(set2);
        Iterator it = treeSet.iterator();
        Iterator it2 = treeSet2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            int iCompare = f4875a.compare(it.next(), it2.next());
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return 0;
    }

    public static int j(short s, short s2) {
        if (s < s2) {
            return -1;
        }
        return s2 < s ? 1 : 0;
    }

    public static int k(boolean z, boolean z2) {
        return Boolean.valueOf(z).compareTo(Boolean.valueOf(z2));
    }

    public static int l(byte[] bArr, byte[] bArr2) {
        int iB = b(bArr.length, bArr2.length);
        if (iB != 0) {
            return iB;
        }
        for (int i = 0; i < bArr.length; i++) {
            int iA = a(bArr[i], bArr2[i]);
            if (iA != 0) {
                return iA;
            }
        }
        return 0;
    }

    public static String m(byte b2) {
        return Integer.toHexString((b2 | 256) & 511).toUpperCase().substring(1);
    }

    public static ByteBuffer n(ByteBuffer byteBuffer) {
        return p(byteBuffer) ? byteBuffer : ByteBuffer.wrap(q(byteBuffer));
    }

    public static void o(ByteBuffer byteBuffer, StringBuilder sb) {
        byte[] bArrArray = byteBuffer.array();
        int iArrayOffset = byteBuffer.arrayOffset();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iArrayOffset > 128 ? iArrayOffset + 128 : iLimit;
        for (int i2 = iArrayOffset; i2 < i; i2++) {
            if (i2 > iArrayOffset) {
                sb.append(" ");
            }
            sb.append(m(bArrArray[i2]));
        }
        if (iLimit != i) {
            sb.append("...");
        }
    }

    public static boolean p(ByteBuffer byteBuffer) {
        return byteBuffer.hasArray() && byteBuffer.position() == 0 && byteBuffer.arrayOffset() == 0 && byteBuffer.remaining() == byteBuffer.capacity();
    }

    public static byte[] q(ByteBuffer byteBuffer) {
        if (p(byteBuffer)) {
            return byteBuffer.array();
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        f(byteBuffer, bArr, 0);
        return bArr;
    }
}
