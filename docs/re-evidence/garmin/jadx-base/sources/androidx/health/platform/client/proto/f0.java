package androidx.health.platform.client.proto;

import androidx.health.platform.client.proto.f0.b;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class f0<T extends b<T>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f0<?> f7604d = new f0<>(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q2<T, Object> f7605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f7606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7607c;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7608a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f7609b;

        static {
            int[] iArr = new int[b3.values().length];
            f7609b = iArr;
            try {
                iArr[b3.f7540c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7609b[b3.f7541d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7609b[b3.f7542e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7609b[b3.f7543f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7609b[b3.f7544g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7609b[b3.f7545h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7609b[b3.f7546i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7609b[b3.f7547j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f7609b[b3.f7549l.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f7609b[b3.f7550m.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f7609b[b3.f7548k.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f7609b[b3.f7551n.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f7609b[b3.f7552o.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f7609b[b3.f7554q.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f7609b[b3.f7555r.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f7609b[b3.f7556t.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f7609b[b3.f7557v.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f7609b[b3.f7553p.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[c3.values().length];
            f7608a = iArr2;
            try {
                iArr2[c3.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f7608a[c3.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f7608a[c3.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f7608a[c3.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f7608a[c3.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f7608a[c3.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f7608a[c3.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f7608a[c3.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f7608a[c3.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    public interface b<T extends b<T>> extends Comparable<T> {
        c3 getLiteJavaType();

        b3 getLiteType();

        int getNumber();

        boolean isPacked();

        boolean isRepeated();

        j0.a w3(c1.a aVar, c1 c1Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private f0(boolean z14) {
        this(new p2());
        int i14 = q2.f7748g;
        k();
    }

    public static int c(b3 b3Var, int i14, Object obj) {
        int iF = CodedOutputStream.f(i14);
        if (b3Var == b3.f7549l) {
            iF *= 2;
        }
        return d(b3Var, obj) + iF;
    }

    public static int d(b3 b3Var, Object obj) {
        int serializedSize;
        int iG;
        switch (a.f7609b[b3Var.ordinal()]) {
            case 1:
                ((Double) obj).getClass();
                Logger logger = CodedOutputStream.f7529b;
                return 8;
            case 2:
                ((Float) obj).getClass();
                Logger logger2 = CodedOutputStream.f7529b;
                return 4;
            case 3:
                return CodedOutputStream.h(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.h(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.h(((Integer) obj).intValue());
            case 6:
                ((Long) obj).getClass();
                Logger logger3 = CodedOutputStream.f7529b;
                return 8;
            case 7:
                ((Integer) obj).getClass();
                Logger logger4 = CodedOutputStream.f7529b;
                return 4;
            case 8:
                ((Boolean) obj).getClass();
                Logger logger5 = CodedOutputStream.f7529b;
                return 1;
            case 9:
                Logger logger6 = CodedOutputStream.f7529b;
                return ((c1) obj).getSerializedSize();
            case 10:
                if (obj instanceof n0) {
                    return CodedOutputStream.b((n0) obj);
                }
                Logger logger7 = CodedOutputStream.f7529b;
                serializedSize = ((c1) obj).getSerializedSize();
                iG = CodedOutputStream.g(serializedSize);
                break;
            case 11:
                if (!(obj instanceof i)) {
                    return CodedOutputStream.e((String) obj);
                }
                Logger logger8 = CodedOutputStream.f7529b;
                serializedSize = ((i) obj).size();
                iG = CodedOutputStream.g(serializedSize);
                break;
                break;
            case 12:
                if (!(obj instanceof i)) {
                    Logger logger9 = CodedOutputStream.f7529b;
                    serializedSize = ((byte[]) obj).length;
                    iG = CodedOutputStream.g(serializedSize);
                } else {
                    Logger logger10 = CodedOutputStream.f7529b;
                    serializedSize = ((i) obj).size();
                    iG = CodedOutputStream.g(serializedSize);
                }
                break;
            case 13:
                return CodedOutputStream.g(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                Logger logger11 = CodedOutputStream.f7529b;
                return 4;
            case 15:
                ((Long) obj).getClass();
                Logger logger12 = CodedOutputStream.f7529b;
                return 8;
            case 16:
                return CodedOutputStream.c(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.d(((Long) obj).longValue());
            case 18:
                return obj instanceof l0.a ? CodedOutputStream.h(((l0.a) obj).getNumber()) : CodedOutputStream.h(((Integer) obj).intValue());
            default:
                kg.f.n("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
        return iG + serializedSize;
    }

    public static int e(b<?> bVar, Object obj) {
        b3 liteType = bVar.getLiteType();
        int number = bVar.getNumber();
        if (!bVar.isRepeated()) {
            return c(liteType, number, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i14 = 0;
        if (!bVar.isPacked()) {
            int iC = 0;
            while (i14 < size) {
                iC += c(liteType, number, list.get(i14));
                i14++;
            }
            return iC;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iD = 0;
        while (i14 < size) {
            iD += d(liteType, list.get(i14));
            i14++;
        }
        return CodedOutputStream.g(iD) + CodedOutputStream.f(number) + iD;
    }

    public static int g(Map.Entry entry) {
        b bVar = (b) entry.getKey();
        Object value = entry.getValue();
        if (bVar.getLiteJavaType() != c3.MESSAGE || bVar.isRepeated() || bVar.isPacked()) {
            return e(bVar, value);
        }
        if (value instanceof n0) {
            int number = ((b) entry.getKey()).getNumber();
            return CodedOutputStream.b((n0) value) + CodedOutputStream.f(3) + CodedOutputStream.g(number) + CodedOutputStream.f(2) + (CodedOutputStream.f(1) * 2);
        }
        int number2 = ((b) entry.getKey()).getNumber();
        int iG = CodedOutputStream.g(number2) + CodedOutputStream.f(2) + (CodedOutputStream.f(1) * 2);
        int iF = CodedOutputStream.f(3);
        int serializedSize = ((c1) value).getSerializedSize();
        return CodedOutputStream.g(serializedSize) + serializedSize + iF + iG;
    }

    public static <T extends b<T>> boolean i(Map.Entry<T, Object> entry) {
        boolean zIsInitialized;
        T key = entry.getKey();
        if (key.getLiteJavaType() == c3.MESSAGE) {
            if (!key.isRepeated()) {
                Object value = entry.getValue();
                if (value instanceof d1) {
                    return ((d1) value).isInitialized();
                }
                if (value instanceof n0) {
                    return true;
                }
                vb.h.s("Wrong object type used with protocol message reflection.");
                return false;
            }
            List list = (List) entry.getValue();
            int size = list.size();
            for (int i14 = 0; i14 < size; i14++) {
                Object obj = list.get(i14);
                if (obj instanceof d1) {
                    zIsInitialized = ((d1) obj).isInitialized();
                } else {
                    if (!(obj instanceof n0)) {
                        vb.h.s("Wrong object type used with protocol message reflection.");
                        return false;
                    }
                    zIsInitialized = true;
                }
                if (!zIsInitialized) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void n(b bVar, Object obj) {
        b3 liteType = bVar.getLiteType();
        Charset charset = l0.f7708a;
        obj.getClass();
        boolean z14 = true;
        switch (a.f7608a[liteType.f7559a.ordinal()]) {
            case 1:
                z14 = obj instanceof Integer;
                break;
            case 2:
                z14 = obj instanceof Long;
                break;
            case 3:
                z14 = obj instanceof Float;
                break;
            case 4:
                z14 = obj instanceof Double;
                break;
            case 5:
                z14 = obj instanceof Boolean;
                break;
            case 6:
                z14 = obj instanceof String;
                break;
            case 7:
                if (!(obj instanceof i) && !(obj instanceof byte[])) {
                    z14 = false;
                }
                break;
            case 8:
                if (!(obj instanceof Integer) && !(obj instanceof l0.a)) {
                    z14 = false;
                }
                break;
            case 9:
                if (!(obj instanceof c1) && !(obj instanceof n0)) {
                    z14 = false;
                }
                break;
            default:
                z14 = false;
                break;
        }
        if (z14) {
            return;
        }
        org.apache.commons.lang3.e.s("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(bVar.getNumber()), bVar.getLiteType().f7559a, obj.getClass().getName()});
    }

    public static void o(CodedOutputStream codedOutputStream, b3 b3Var, int i14, Object obj) {
        if (b3Var == b3.f7549l) {
            codedOutputStream.z(i14, 3);
            ((c1) obj).b(codedOutputStream);
            codedOutputStream.z(i14, 4);
        }
        codedOutputStream.z(i14, b3Var.f7560b);
        switch (a.f7609b[b3Var.ordinal()]) {
            case 1:
                codedOutputStream.q(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 2:
                codedOutputStream.o(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 3:
                codedOutputStream.D(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.D(((Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.s(((Integer) obj).intValue());
                break;
            case 6:
                codedOutputStream.q(((Long) obj).longValue());
                break;
            case 7:
                codedOutputStream.o(((Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.i(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 9:
                ((c1) obj).b(codedOutputStream);
                break;
            case 10:
                codedOutputStream.u((c1) obj);
                break;
            case 11:
                if (!(obj instanceof i)) {
                    codedOutputStream.y((String) obj);
                } else {
                    codedOutputStream.m((i) obj);
                }
                break;
            case 12:
                if (!(obj instanceof i)) {
                    byte[] bArr = (byte[]) obj;
                    codedOutputStream.k(bArr.length, bArr);
                } else {
                    codedOutputStream.m((i) obj);
                }
                break;
            case 13:
                codedOutputStream.B(((Integer) obj).intValue());
                break;
            case 14:
                codedOutputStream.o(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.q(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                codedOutputStream.B((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                codedOutputStream.D((jLongValue >> 63) ^ (jLongValue << 1));
                break;
            case 18:
                if (!(obj instanceof l0.a)) {
                    codedOutputStream.s(((Integer) obj).intValue());
                } else {
                    codedOutputStream.s(((l0.a) obj).getNumber());
                }
                break;
        }
    }

    public final void a(j0.d dVar, Object obj) {
        List arrayList;
        if (!dVar.f7682d) {
            vb.h.s("addRepeatedField() can only be called on repeated fields.");
            return;
        }
        n(dVar, obj);
        Object objF = f(dVar);
        if (objF == null) {
            arrayList = new ArrayList();
            this.f7605a.put(dVar, arrayList);
        } else {
            arrayList = (List) objF;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final f0<T> clone() {
        f0<T> f0Var = new f0<>();
        q2<T, Object> q2Var = this.f7605a;
        int size = q2Var.f7749a.size();
        for (int i14 = 0; i14 < size; i14++) {
            Map.Entry<K, Object> entryC = q2Var.c(i14);
            f0Var.m((b) entryC.getKey(), entryC.getValue());
        }
        for (Map.Entry entry : q2Var.d()) {
            f0Var.m((b) entry.getKey(), entry.getValue());
        }
        f0Var.f7607c = this.f7607c;
        return f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f0) {
            return this.f7605a.equals(((f0) obj).f7605a);
        }
        return false;
    }

    public final Object f(T t7) {
        Object obj = this.f7605a.get(t7);
        if (!(obj instanceof n0)) {
            return obj;
        }
        n0 n0Var = (n0) obj;
        return n0Var.a(n0Var.f7726e);
    }

    public final boolean h() {
        q2<T, Object> q2Var = this.f7605a;
        int size = q2Var.f7749a.size();
        for (int i14 = 0; i14 < size; i14++) {
            if (!i(q2Var.c(i14))) {
                return false;
            }
        }
        Iterator it = q2Var.d().iterator();
        while (it.hasNext()) {
            if (!i((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f7605a.hashCode();
    }

    public final Iterator<Map.Entry<T, Object>> j() {
        q2<T, Object> q2Var = this.f7605a;
        if (q2Var.isEmpty()) {
            return Collections.emptyIterator();
        }
        return this.f7607c ? new n0.c(q2Var.entrySet().iterator()) : q2Var.entrySet().iterator();
    }

    public final void k() {
        if (this.f7606b) {
            return;
        }
        q2<T, Object> q2Var = this.f7605a;
        int size = q2Var.f7749a.size();
        for (int i14 = 0; i14 < size; i14++) {
            Map.Entry<K, Object> entryC = q2Var.c(i14);
            if (entryC.getValue() instanceof j0) {
                j0 j0Var = (j0) entryC.getValue();
                j0Var.getClass();
                r1 r1Var = r1.f7767c;
                r1Var.getClass();
                r1Var.a(j0Var.getClass()).makeImmutable(j0Var);
                j0Var.n();
            }
        }
        q2Var.g();
        this.f7606b = true;
    }

    public final void l(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        boolean z14 = value instanceof n0;
        boolean zIsRepeated = key.isRepeated();
        q2<T, Object> q2Var = this.f7605a;
        if (zIsRepeated) {
            if (z14) {
                vb.h.z("Lazy fields can not be repeated");
                return;
            }
            Object objF = f(key);
            if (objF == null) {
                objF = new ArrayList();
            }
            for (Object obj : (List) value) {
                List list = (List) objF;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj = bArr2;
                }
                list.add(obj);
            }
            q2Var.put(key, objF);
            return;
        }
        if (key.getLiteJavaType() != c3.MESSAGE) {
            if (z14) {
                vb.h.z("Lazy fields must be message-valued");
                return;
            }
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                value = bArr4;
            }
            q2Var.put(key, value);
            return;
        }
        Object objF2 = f(key);
        if (objF2 != null) {
            if (z14) {
                n0 n0Var = (n0) value;
                value = n0Var.a(n0Var.f7726e);
            }
            q2Var.put(key, key.w3(((c1) objF2).toBuilder(), (c1) value).e());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        q2Var.put(key, value);
        if (z14) {
            this.f7607c = true;
        }
    }

    public final void m(T t7, Object obj) {
        if (!t7.isRepeated()) {
            n(t7, obj);
        } else {
            if (!(obj instanceof List)) {
                vb.h.s("Wrong object type used with protocol message reflection.");
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                n(t7, it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof n0) {
            this.f7607c = true;
        }
        this.f7605a.put(t7, obj);
    }

    private f0() {
        int i14 = q2.f7748g;
        this.f7605a = new p2();
    }

    public /* synthetic */ f0(q2 q2Var, a aVar) {
        this(q2Var);
    }

    private f0(q2<T, Object> q2Var) {
        this.f7605a = q2Var;
        k();
    }
}
