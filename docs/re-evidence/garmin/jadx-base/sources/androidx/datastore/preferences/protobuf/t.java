package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.t.b;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class t<T extends b<T>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t<?> f6847d = new t<>(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1<T, Object> f6848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f6849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f6850c;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6851a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f6852b;

        static {
            int[] iArr = new int[s1.values().length];
            f6852b = iArr;
            try {
                iArr[s1.f6826c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6852b[s1.f6827d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6852b[s1.f6828e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6852b[s1.f6829f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6852b[s1.f6830g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6852b[s1.f6831h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6852b[s1.f6832i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f6852b[s1.f6833j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f6852b[s1.f6835l.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f6852b[s1.f6836m.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f6852b[s1.f6834k.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f6852b[s1.f6837n.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f6852b[s1.f6838o.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f6852b[s1.f6840q.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f6852b[s1.f6841r.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f6852b[s1.f6842t.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f6852b[s1.f6843v.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f6852b[s1.f6839p.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[t1.values().length];
            f6851a = iArr2;
            try {
                iArr2[t1.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f6851a[t1.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f6851a[t1.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f6851a[t1.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f6851a[t1.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f6851a[t1.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f6851a[t1.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f6851a[t1.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f6851a[t1.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    public interface b<T extends b<T>> extends Comparable<T> {
        t1 getLiteJavaType();

        s1 getLiteType();

        int getNumber();

        boolean isPacked();

        boolean isRepeated();

        x.a y2(q0.a aVar, q0 q0Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private t(boolean z14) {
        this(new i1());
        int i14 = j1.f6755g;
        j();
    }

    public static int b(s1 s1Var, int i14, Object obj) {
        int iG = CodedOutputStream.g(i14);
        if (s1Var == s1.f6835l) {
            iG *= 2;
        }
        return c(s1Var, obj) + iG;
    }

    public static int c(s1 s1Var, Object obj) {
        int serializedSize;
        int iH;
        switch (a.f6852b[s1Var.ordinal()]) {
            case 1:
                ((Double) obj).getClass();
                Logger logger = CodedOutputStream.f6654b;
                return 8;
            case 2:
                ((Float) obj).getClass();
                Logger logger2 = CodedOutputStream.f6654b;
                return 4;
            case 3:
                return CodedOutputStream.i(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.i(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.i(((Integer) obj).intValue());
            case 6:
                ((Long) obj).getClass();
                Logger logger3 = CodedOutputStream.f6654b;
                return 8;
            case 7:
                ((Integer) obj).getClass();
                Logger logger4 = CodedOutputStream.f6654b;
                return 4;
            case 8:
                ((Boolean) obj).getClass();
                Logger logger5 = CodedOutputStream.f6654b;
                return 1;
            case 9:
                Logger logger6 = CodedOutputStream.f6654b;
                return ((q0) obj).getSerializedSize();
            case 10:
                if (obj instanceof b0) {
                    return CodedOutputStream.c((b0) obj);
                }
                Logger logger7 = CodedOutputStream.f6654b;
                serializedSize = ((q0) obj).getSerializedSize();
                iH = CodedOutputStream.h(serializedSize);
                break;
            case 11:
                if (!(obj instanceof h)) {
                    return CodedOutputStream.f((String) obj);
                }
                Logger logger8 = CodedOutputStream.f6654b;
                serializedSize = ((h) obj).size();
                iH = CodedOutputStream.h(serializedSize);
                break;
                break;
            case 12:
                if (!(obj instanceof h)) {
                    Logger logger9 = CodedOutputStream.f6654b;
                    serializedSize = ((byte[]) obj).length;
                    iH = CodedOutputStream.h(serializedSize);
                } else {
                    Logger logger10 = CodedOutputStream.f6654b;
                    serializedSize = ((h) obj).size();
                    iH = CodedOutputStream.h(serializedSize);
                }
                break;
            case 13:
                return CodedOutputStream.h(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                Logger logger11 = CodedOutputStream.f6654b;
                return 4;
            case 15:
                ((Long) obj).getClass();
                Logger logger12 = CodedOutputStream.f6654b;
                return 8;
            case 16:
                return CodedOutputStream.d(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.e(((Long) obj).longValue());
            case 18:
                return obj instanceof z.a ? CodedOutputStream.i(((z.a) obj).getNumber()) : CodedOutputStream.i(((Integer) obj).intValue());
            default:
                kg.f.n("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
        return iH + serializedSize;
    }

    public static int d(b<?> bVar, Object obj) {
        s1 liteType = bVar.getLiteType();
        int number = bVar.getNumber();
        if (!bVar.isRepeated()) {
            return b(liteType, number, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i14 = 0;
        if (!bVar.isPacked()) {
            int iB = 0;
            while (i14 < size) {
                iB += b(liteType, number, list.get(i14));
                i14++;
            }
            return iB;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iC = 0;
        while (i14 < size) {
            iC += c(liteType, list.get(i14));
            i14++;
        }
        return CodedOutputStream.h(iC) + CodedOutputStream.g(number) + iC;
    }

    public static int f(Map.Entry entry) {
        b bVar = (b) entry.getKey();
        Object value = entry.getValue();
        if (bVar.getLiteJavaType() != t1.MESSAGE || bVar.isRepeated() || bVar.isPacked()) {
            return d(bVar, value);
        }
        if (value instanceof b0) {
            int number = ((b) entry.getKey()).getNumber();
            return CodedOutputStream.c((b0) value) + CodedOutputStream.g(3) + CodedOutputStream.h(number) + CodedOutputStream.g(2) + (CodedOutputStream.g(1) * 2);
        }
        int number2 = ((b) entry.getKey()).getNumber();
        int iH = CodedOutputStream.h(number2) + CodedOutputStream.g(2) + (CodedOutputStream.g(1) * 2);
        int iG = CodedOutputStream.g(3);
        int serializedSize = ((q0) value).getSerializedSize();
        return CodedOutputStream.h(serializedSize) + serializedSize + iG + iH;
    }

    public static <T extends b<T>> boolean h(Map.Entry<T, Object> entry) {
        boolean zIsInitialized;
        T key = entry.getKey();
        if (key.getLiteJavaType() == t1.MESSAGE) {
            if (!key.isRepeated()) {
                Object value = entry.getValue();
                if (value instanceof r0) {
                    return ((r0) value).isInitialized();
                }
                if (value instanceof b0) {
                    return true;
                }
                vb.h.s("Wrong object type used with protocol message reflection.");
                return false;
            }
            List list = (List) entry.getValue();
            int size = list.size();
            for (int i14 = 0; i14 < size; i14++) {
                Object obj = list.get(i14);
                if (obj instanceof r0) {
                    zIsInitialized = ((r0) obj).isInitialized();
                } else {
                    if (!(obj instanceof b0)) {
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

    public static void m(b bVar, Object obj) {
        s1 liteType = bVar.getLiteType();
        Charset charset = z.f6936a;
        obj.getClass();
        boolean z14 = true;
        switch (a.f6851a[liteType.f6845a.ordinal()]) {
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
                if (!(obj instanceof h) && !(obj instanceof byte[])) {
                    z14 = false;
                }
                break;
            case 8:
                if (!(obj instanceof Integer) && !(obj instanceof z.a)) {
                    z14 = false;
                }
                break;
            case 9:
                if (!(obj instanceof q0) && !(obj instanceof b0)) {
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
        org.apache.commons.lang3.e.s("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(bVar.getNumber()), bVar.getLiteType().f6845a, obj.getClass().getName()});
    }

    public static void n(CodedOutputStream codedOutputStream, s1 s1Var, int i14, Object obj) {
        if (s1Var == s1.f6835l) {
            codedOutputStream.B(i14, 3);
            ((q0) obj).b(codedOutputStream);
            codedOutputStream.B(i14, 4);
        }
        codedOutputStream.B(i14, s1Var.f6846b);
        switch (a.f6852b[s1Var.ordinal()]) {
            case 1:
                codedOutputStream.s(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 2:
                codedOutputStream.q(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 3:
                codedOutputStream.F(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.F(((Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.u(((Integer) obj).intValue());
                break;
            case 6:
                codedOutputStream.s(((Long) obj).longValue());
                break;
            case 7:
                codedOutputStream.q(((Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.k(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 9:
                ((q0) obj).b(codedOutputStream);
                break;
            case 10:
                codedOutputStream.w((q0) obj);
                break;
            case 11:
                if (!(obj instanceof h)) {
                    codedOutputStream.A((String) obj);
                } else {
                    codedOutputStream.o((h) obj);
                }
                break;
            case 12:
                if (!(obj instanceof h)) {
                    byte[] bArr = (byte[]) obj;
                    codedOutputStream.m(bArr.length, bArr);
                } else {
                    codedOutputStream.o((h) obj);
                }
                break;
            case 13:
                codedOutputStream.D(((Integer) obj).intValue());
                break;
            case 14:
                codedOutputStream.q(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.s(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                codedOutputStream.D((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                codedOutputStream.F((jLongValue >> 63) ^ (jLongValue << 1));
                break;
            case 18:
                if (!(obj instanceof z.a)) {
                    codedOutputStream.u(((Integer) obj).intValue());
                } else {
                    codedOutputStream.u(((z.a) obj).getNumber());
                }
                break;
        }
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final t<T> clone() {
        t<T> tVar = new t<>();
        j1<T, Object> j1Var = this.f6848a;
        int size = j1Var.f6756a.size();
        for (int i14 = 0; i14 < size; i14++) {
            Map.Entry<K, Object> entryC = j1Var.c(i14);
            tVar.l((b) entryC.getKey(), entryC.getValue());
        }
        for (Map.Entry entry : j1Var.d()) {
            tVar.l((b) entry.getKey(), entry.getValue());
        }
        tVar.f6850c = this.f6850c;
        return tVar;
    }

    public final Object e(T t7) {
        Object obj = this.f6848a.get(t7);
        if (!(obj instanceof b0)) {
            return obj;
        }
        b0 b0Var = (b0) obj;
        return b0Var.a(b0Var.f6676e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t) {
            return this.f6848a.equals(((t) obj).f6848a);
        }
        return false;
    }

    public final boolean g() {
        j1<T, Object> j1Var = this.f6848a;
        int size = j1Var.f6756a.size();
        for (int i14 = 0; i14 < size; i14++) {
            if (!h(j1Var.c(i14))) {
                return false;
            }
        }
        Iterator it = j1Var.d().iterator();
        while (it.hasNext()) {
            if (!h((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f6848a.hashCode();
    }

    public final Iterator<Map.Entry<T, Object>> i() {
        j1<T, Object> j1Var = this.f6848a;
        if (j1Var.isEmpty()) {
            return Collections.emptyIterator();
        }
        return this.f6850c ? new b0.c(j1Var.entrySet().iterator()) : j1Var.entrySet().iterator();
    }

    public final void j() {
        if (this.f6849b) {
            return;
        }
        j1<T, Object> j1Var = this.f6848a;
        int size = j1Var.f6756a.size();
        for (int i14 = 0; i14 < size; i14++) {
            Map.Entry<K, Object> entryC = j1Var.c(i14);
            if (entryC.getValue() instanceof x) {
                x xVar = (x) entryC.getValue();
                xVar.getClass();
                c1 c1Var = c1.f6688c;
                c1Var.getClass();
                c1Var.a(xVar.getClass()).makeImmutable(xVar);
                xVar.k();
            }
        }
        j1Var.g();
        this.f6849b = true;
    }

    public final void k(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        boolean z14 = value instanceof b0;
        boolean zIsRepeated = key.isRepeated();
        j1<T, Object> j1Var = this.f6848a;
        if (zIsRepeated) {
            if (z14) {
                vb.h.z("Lazy fields can not be repeated");
                return;
            }
            Object objE = e(key);
            if (objE == null) {
                objE = new ArrayList();
            }
            for (Object obj : (List) value) {
                List list = (List) objE;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj = bArr2;
                }
                list.add(obj);
            }
            j1Var.put(key, objE);
            return;
        }
        if (key.getLiteJavaType() != t1.MESSAGE) {
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
            j1Var.put(key, value);
            return;
        }
        Object objE2 = e(key);
        if (objE2 != null) {
            if (z14) {
                b0 b0Var = (b0) value;
                value = b0Var.a(b0Var.f6676e);
            }
            j1Var.put(key, key.y2(((q0) objE2).toBuilder(), (q0) value).e());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        j1Var.put(key, value);
        if (z14) {
            this.f6850c = true;
        }
    }

    public final void l(T t7, Object obj) {
        if (!t7.isRepeated()) {
            m(t7, obj);
        } else {
            if (!(obj instanceof List)) {
                vb.h.s("Wrong object type used with protocol message reflection.");
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m(t7, it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof b0) {
            this.f6850c = true;
        }
        this.f6848a.put(t7, obj);
    }

    private t() {
        int i14 = j1.f6755g;
        this.f6848a = new i1();
    }

    public /* synthetic */ t(j1 j1Var, a aVar) {
        this(j1Var);
    }

    private t(j1<T, Object> j1Var) {
        this.f6848a = j1Var;
        j();
    }
}
