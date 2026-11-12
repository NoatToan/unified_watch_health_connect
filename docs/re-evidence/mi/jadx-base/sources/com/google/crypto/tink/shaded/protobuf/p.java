package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.p.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class p<T extends b<T>> {
    public static final p d = new p(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0<T, Object> f9427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9428b;
    public boolean c;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9429a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f9430b;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f9430b = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9430b[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9430b[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9430b[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9430b[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9430b[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9430b[WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f9430b[WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f9430b[WireFormat.FieldType.GROUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f9430b[WireFormat.FieldType.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f9430b[WireFormat.FieldType.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f9430b[WireFormat.FieldType.BYTES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f9430b[WireFormat.FieldType.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f9430b[WireFormat.FieldType.SFIXED32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f9430b[WireFormat.FieldType.SFIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f9430b[WireFormat.FieldType.SINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f9430b[WireFormat.FieldType.SINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f9430b[WireFormat.FieldType.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[WireFormat.JavaType.values().length];
            f9429a = iArr2;
            try {
                iArr2[WireFormat.JavaType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f9429a[WireFormat.JavaType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f9429a[WireFormat.JavaType.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f9429a[WireFormat.JavaType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f9429a[WireFormat.JavaType.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f9429a[WireFormat.JavaType.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f9429a[WireFormat.JavaType.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f9429a[WireFormat.JavaType.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f9429a[WireFormat.JavaType.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    public interface b<T extends b<T>> extends Comparable<T> {
        b0.a g(b0.a aVar, b0 b0Var);

        WireFormat.JavaType getLiteJavaType();

        WireFormat.FieldType getLiteType();

        int getNumber();

        boolean isPacked();

        boolean isRepeated();
    }

    public p() {
        this.f9427a = m0.w(16);
    }

    public static Object c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static int d(WireFormat.FieldType fieldType, int i, Object obj) {
        int iV = CodedOutputStream.V(i);
        if (fieldType == WireFormat.FieldType.GROUP) {
            iV *= 2;
        }
        return iV + e(fieldType, obj);
    }

    public static int e(WireFormat.FieldType fieldType, Object obj) {
        switch (a.f9430b[fieldType.ordinal()]) {
            case 1:
                return CodedOutputStream.k(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.s(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.z(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.Z(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.x(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.q(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.o(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.f(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.u((b0) obj);
            case 10:
                return obj instanceof t ? CodedOutputStream.C((t) obj) : CodedOutputStream.H((b0) obj);
            case 11:
                return obj instanceof ByteString ? CodedOutputStream.i((ByteString) obj) : CodedOutputStream.U((String) obj);
            case 12:
                return obj instanceof ByteString ? CodedOutputStream.i((ByteString) obj) : CodedOutputStream.g((byte[]) obj);
            case 13:
                return CodedOutputStream.X(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.M(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.O(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.Q(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.S(((Long) obj).longValue());
            case 18:
                return obj instanceof s.c ? CodedOutputStream.m(((s.c) obj).getNumber()) : CodedOutputStream.m(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int f(b<?> bVar, Object obj) {
        WireFormat.FieldType liteType = bVar.getLiteType();
        int number = bVar.getNumber();
        if (!bVar.isRepeated()) {
            return d(liteType, number, obj);
        }
        int iD = 0;
        if (bVar.isPacked()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iD += e(liteType, it.next());
            }
            return CodedOutputStream.V(number) + iD + CodedOutputStream.K(iD);
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            iD += d(liteType, number, it2.next());
        }
        return iD;
    }

    public static <T extends b<T>> p<T> h() {
        return d;
    }

    public static <T extends b<T>> boolean p(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.getLiteJavaType() == WireFormat.JavaType.MESSAGE) {
            if (key.isRepeated()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((b0) it.next()).isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (!(value instanceof b0)) {
                    if (value instanceof t) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                if (!((b0) value).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean q(WireFormat.FieldType fieldType, Object obj) {
        s.a(obj);
        switch (a.f9429a[fieldType.getJavaType().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                return (obj instanceof ByteString) || (obj instanceof byte[]);
            case 8:
                return (obj instanceof Integer) || (obj instanceof s.c);
            case 9:
                return (obj instanceof b0) || (obj instanceof t);
            default:
                return false;
        }
    }

    public static <T extends b<T>> p<T> v() {
        return new p<>();
    }

    public void a(T t, Object obj) {
        List arrayList;
        if (!t.isRepeated()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        x(t.getLiteType(), obj);
        Object objI = i(t);
        if (objI == null) {
            arrayList = new ArrayList();
            this.f9427a.put(t, arrayList);
        } else {
            arrayList = (List) objI;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public p<T> clone() {
        p<T> pVarV = v();
        for (int i = 0; i < this.f9427a.o(); i++) {
            Map.Entry<K, Object> entryN = this.f9427a.n(i);
            pVarV.w((b) entryN.getKey(), entryN.getValue());
        }
        Iterator it = this.f9427a.q().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            pVarV.w((b) entry.getKey(), entry.getValue());
        }
        pVarV.c = this.c;
        return pVarV;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            return this.f9427a.equals(((p) obj).f9427a);
        }
        return false;
    }

    public Iterator<Map.Entry<T, Object>> g() {
        return this.c ? new t.c(this.f9427a.l().iterator()) : this.f9427a.l().iterator();
    }

    public int hashCode() {
        return this.f9427a.hashCode();
    }

    public Object i(T t) {
        Object obj = this.f9427a.get(t);
        return obj instanceof t ? ((t) obj).f() : obj;
    }

    public int j() {
        int iK = 0;
        for (int i = 0; i < this.f9427a.o(); i++) {
            iK += k(this.f9427a.n(i));
        }
        Iterator it = this.f9427a.q().iterator();
        while (it.hasNext()) {
            iK += k((Map.Entry) it.next());
        }
        return iK;
    }

    public final int k(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.getLiteJavaType() != WireFormat.JavaType.MESSAGE || key.isRepeated() || key.isPacked()) {
            return f(key, value);
        }
        return value instanceof t ? CodedOutputStream.A(entry.getKey().getNumber(), (t) value) : CodedOutputStream.E(entry.getKey().getNumber(), (b0) value);
    }

    public int l() {
        int iF = 0;
        for (int i = 0; i < this.f9427a.o(); i++) {
            Map.Entry<K, Object> entryN = this.f9427a.n(i);
            iF += f((b) entryN.getKey(), entryN.getValue());
        }
        Iterator it = this.f9427a.q().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iF += f((b) entry.getKey(), entry.getValue());
        }
        return iF;
    }

    public boolean m() {
        return this.f9427a.isEmpty();
    }

    public boolean n() {
        return this.f9428b;
    }

    public boolean o() {
        for (int i = 0; i < this.f9427a.o(); i++) {
            if (!p(this.f9427a.n(i))) {
                return false;
            }
        }
        Iterator it = this.f9427a.q().iterator();
        while (it.hasNext()) {
            if (!p((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<T, Object>> r() {
        return this.c ? new t.c(this.f9427a.entrySet().iterator()) : this.f9427a.entrySet().iterator();
    }

    public void s() {
        if (this.f9428b) {
            return;
        }
        this.f9427a.v();
        this.f9428b = true;
    }

    public void t(p<T> pVar) {
        for (int i = 0; i < pVar.f9427a.o(); i++) {
            u(pVar.f9427a.n(i));
        }
        Iterator it = pVar.f9427a.q().iterator();
        while (it.hasNext()) {
            u((Map.Entry) it.next());
        }
    }

    public final void u(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof t) {
            value = ((t) value).f();
        }
        if (key.isRepeated()) {
            Object objI = i(key);
            if (objI == null) {
                objI = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objI).add(c(it.next()));
            }
            this.f9427a.put(key, objI);
            return;
        }
        if (key.getLiteJavaType() != WireFormat.JavaType.MESSAGE) {
            this.f9427a.put(key, c(value));
            return;
        }
        Object objI2 = i(key);
        if (objI2 == null) {
            this.f9427a.put(key, c(value));
        } else {
            this.f9427a.put(key, key.g(((b0) objI2).toBuilder(), (b0) value).build());
        }
    }

    public void w(T t, Object obj) {
        if (!t.isRepeated()) {
            x(t.getLiteType(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                x(t.getLiteType(), it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof t) {
            this.c = true;
        }
        this.f9427a.put(t, obj);
    }

    public final void x(WireFormat.FieldType fieldType, Object obj) {
        if (!q(fieldType, obj)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    public p(boolean z) {
        this(m0.w(0));
        s();
    }

    public p(m0<T, Object> m0Var) {
        this.f9427a = m0Var;
        s();
    }
}
